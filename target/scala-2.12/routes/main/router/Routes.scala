// @GENERATOR:play-routes-compiler
// @SOURCE:/home/aluno/Sistemas-Web/conf/routes
// @DATE:Mon Sep 17 16:56:25 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:3
  HomeController_0: controllers.HomeController,
  // @LINE:5
  ContaController_2: controllers.ContaController,
  // @LINE:15
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:3
    HomeController_0: controllers.HomeController,
    // @LINE:5
    ContaController_2: controllers.ContaController,
    // @LINE:15
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ContaController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ContaController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas""", """controllers.ContaController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/create""", """controllers.ContaController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/""" + "$" + """id<[^/]+>""", """controllers.ContaController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/edit/""" + "$" + """id<[^/]+>""", """controllers.ContaController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/edit""", """controllers.ContaController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/create""", """controllers.ContaController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contas/destroy/""" + "$" + """id<[^/]+>""", """controllers.ContaController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_ContaController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas")))
  )
  private[this] lazy val controllers_ContaController_index1_invoker = createInvoker(
    ContaController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "index",
      Nil,
      "GET",
      this.prefix + """contas""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_ContaController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/create")))
  )
  private[this] lazy val controllers_ContaController_create2_invoker = createInvoker(
    ContaController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "create",
      Nil,
      "GET",
      this.prefix + """contas/create""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ContaController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContaController_show3_invoker = createInvoker(
    ContaController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """contas/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ContaController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContaController_edit4_invoker = createInvoker(
    ContaController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """contas/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ContaController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/edit")))
  )
  private[this] lazy val controllers_ContaController_update5_invoker = createInvoker(
    ContaController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "update",
      Nil,
      "POST",
      this.prefix + """contas/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ContaController_save6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/create")))
  )
  private[this] lazy val controllers_ContaController_save6_invoker = createInvoker(
    ContaController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "save",
      Nil,
      "POST",
      this.prefix + """contas/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ContaController_destroy7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contas/destroy/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContaController_destroy7_invoker = createInvoker(
    ContaController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContaController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """contas/destroy/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:5
    case controllers_ContaController_index1_route(params@_) =>
      call { 
        controllers_ContaController_index1_invoker.call(ContaController_2.index())
      }
  
    // @LINE:6
    case controllers_ContaController_create2_route(params@_) =>
      call { 
        controllers_ContaController_create2_invoker.call(ContaController_2.create())
      }
  
    // @LINE:7
    case controllers_ContaController_show3_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ContaController_show3_invoker.call(ContaController_2.show(id))
      }
  
    // @LINE:8
    case controllers_ContaController_edit4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ContaController_edit4_invoker.call(ContaController_2.edit(id))
      }
  
    // @LINE:9
    case controllers_ContaController_update5_route(params@_) =>
      call { 
        controllers_ContaController_update5_invoker.call(ContaController_2.update())
      }
  
    // @LINE:10
    case controllers_ContaController_save6_route(params@_) =>
      call { 
        controllers_ContaController_save6_invoker.call(ContaController_2.save())
      }
  
    // @LINE:11
    case controllers_ContaController_destroy7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_ContaController_destroy7_invoker.call(ContaController_2.destroy(id))
      }
  
    // @LINE:15
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
