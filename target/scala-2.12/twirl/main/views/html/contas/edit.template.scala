
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Conta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contasForm : Form[Conta]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""<html>
	<head>
		<title> Editar Contas</title>
	</head>
	<body>
		<h1>Editar Conta</h1>

			"""),_display_(/*10.5*/helper/*10.11*/.form(action = routes.ContaController.update())/*10.58*/{_display_(Seq[Any](format.raw/*10.59*/("""
			"""),_display_(/*11.5*/helper/*11.11*/.inputText(contasForm("id"))),format.raw/*11.39*/("""
			"""),_display_(/*12.5*/helper/*12.11*/.inputText(contasForm("titulo"))),format.raw/*12.43*/("""
			"""),_display_(/*13.5*/helper/*13.11*/.inputText(contasForm("vencimento"))),format.raw/*13.47*/("""
			"""),_display_(/*14.5*/helper/*14.11*/.inputText(contasForm("valor"))),format.raw/*14.42*/("""

			"""),format.raw/*16.4*/("""<input type="submit" value="Criar Conta">
		""")))}),format.raw/*17.4*/("""
	"""),format.raw/*18.2*/("""</body>
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
                  DATE: Mon Sep 17 17:02:20 BRT 2018
                  SOURCE: /home/aluno/Sistemas-Web/app/views/contas/edit.scala.html
                  HASH: cec6b74be7f944995275e1cb10ba6982eea6190d
                  MATRIX: 959->1|1058->29|1102->45|1221->138|1236->144|1292->191|1331->192|1362->197|1377->203|1426->231|1457->236|1472->242|1525->274|1556->279|1571->285|1628->321|1659->326|1674->332|1726->363|1758->368|1833->413|1862->415
                  LINES: 28->1|31->2|34->3|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|48->17|49->18
                  -- GENERATED --
              */
          