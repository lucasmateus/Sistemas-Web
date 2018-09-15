
package views.html.contas

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Conta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contasForm : Form[Conta]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
	<head>
		<title> Todas as Contas</title>
	</head>
	<body>
		
		<h1>Criar conta</h1>
		"""),_display_(/*11.4*/helper/*11.10*/.form(action = routes.ContaController.save())/*11.55*/{_display_(Seq[Any](format.raw/*11.56*/("""
			"""),_display_(/*12.5*/helper/*12.11*/.inputText(contasForm("id"))),format.raw/*12.39*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputText(contasForm("titulo"))),format.raw/*13.43*/("""
			"""),_display_(/*14.5*/helper/*14.11*/.inputText(contasForm("vencimento"))),format.raw/*14.47*/("""
			"""),_display_(/*15.5*/helper/*15.11*/.inputText(contasForm("valor"))),format.raw/*15.42*/("""
			
			"""),format.raw/*17.4*/("""<input type="submit" value="Criar Conta">
		""")))}),format.raw/*18.4*/("""
		
	"""),format.raw/*20.2*/("""</body>
</html>"""))
      }
    }
  }

  def render(contasForm:Form[Conta]): play.twirl.api.HtmlFormat.Appendable = apply(contasForm)

  def f:((Form[Conta]) => play.twirl.api.HtmlFormat.Appendable) = (contasForm) => apply(contasForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 15 01:07:55 BRT 2018
                  SOURCE: /home/lucas/sistemas-web/app/views/contas/create.scala.html
                  HASH: 0b2aab080dcc8a958371fc2bef569a1077b1a941
                  MATRIX: 961->1|1060->29|1104->45|1131->46|1252->141|1267->147|1321->192|1360->193|1391->198|1406->204|1455->232|1486->237|1501->243|1554->275|1585->280|1600->286|1657->322|1688->327|1703->333|1755->364|1790->372|1865->417|1897->422
                  LINES: 28->1|31->2|34->3|35->4|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|49->18|51->20
                  -- GENERATED --
              */
          