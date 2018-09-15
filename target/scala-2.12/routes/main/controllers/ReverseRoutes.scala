// @GENERATOR:play-routes-compiler
// @SOURCE:/home/lucas/sistemas-web/conf/routes
// @DATE:Sat Sep 15 01:07:55 BRT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers {

  // @LINE:3
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReverseContaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contas/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:6
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contas/create")
    }
  
    // @LINE:7
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contas/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:11
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contas/destroy/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contas/create")
    }
  
    // @LINE:9
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "contas/edit")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contas")
    }
  
  }


}
