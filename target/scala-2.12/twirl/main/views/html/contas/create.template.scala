
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
			"""),_display_(/*11.5*/helper/*11.11*/.form(action = routes.ContaController.save())/*11.56*/{_display_(Seq[Any](format.raw/*11.57*/("""
			"""),_display_(/*12.5*/helper/*12.11*/.inputText(contasForm("id"))),format.raw/*12.39*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputText(contasForm("titulo"))),format.raw/*13.43*/("""
			"""),_display_(/*14.5*/helper/*14.11*/.inputText(contasForm("vencimento"))),format.raw/*14.47*/("""
			"""),_display_(/*15.5*/helper/*15.11*/.inputText(contasForm("valor"))),format.raw/*15.42*/("""

			"""),format.raw/*17.4*/("""<input type="submit" value="Criar Conta">
		""")))}),format.raw/*18.4*/("""

	"""),format.raw/*20.2*/("""</body>
</html>
"""))
      }
    }
  }

  def render(contasForm:Form[Conta]): play.twirl.api.HtmlFormat.Appendable = apply(contasForm)

  def f:((Form[Conta]) => play.twirl.api.HtmlFormat.Appendable) = (contasForm) => apply(contasForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 17 16:56:25 BRT 2018
                  SOURCE: /home/aluno/Sistemas-Web/app/views/contas/create.scala.html
                  HASH: b5ae1314f7a967d52ba30ea6af684029f569c491
                  MATRIX: 961->1|1060->29|1104->45|1131->46|1251->140|1266->146|1320->191|1359->192|1390->197|1405->203|1454->231|1485->236|1500->242|1553->274|1584->279|1599->285|1656->321|1687->326|1702->332|1754->363|1786->368|1861->413|1891->416
                  LINES: 28->1|31->2|34->3|35->4|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|49->18|51->20
                  -- GENERATED --
              */
          