
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Conta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contas : Set[Conta]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
	<head>
		<title> Todas as Contas</title>
		<style>
			table, th, td """),format.raw/*7.18*/("""{"""),format.raw/*7.19*/("""
    		"""),format.raw/*8.7*/("""border: 1px solid black;
    		border-collapse: collapse;
			"""),format.raw/*10.4*/("""}"""),format.raw/*10.5*/("""
		"""),format.raw/*11.3*/("""</style>
	</head>
	<body>
			<h1>Todas as contas</h1>
		<table>
			<tr><td>ID</td><td>Titulo</td><td>Vencimento</td><td>Valor</td></tr>
				"""),_display_(/*17.6*/for(conta <- contas) yield /*17.26*/{_display_(Seq[Any](format.raw/*17.27*/("""
					"""),format.raw/*18.6*/("""<tr>
					<td><a href="#">"""),_display_(/*19.23*/conta/*19.28*/.getId()),format.raw/*19.36*/("""</a></td>
					<td>Titulo: """),_display_(/*20.19*/conta/*20.24*/.getTitulo()),format.raw/*20.36*/("""</td>
		  		<td>Vencimento: """),_display_(/*21.24*/conta/*21.29*/.getVencimento()),format.raw/*21.45*/("""</td>
		 			<td>Valor: """),_display_(/*22.19*/conta/*22.24*/.getValor()),format.raw/*22.35*/("""</td>
				</tr>
				""")))}),format.raw/*24.6*/("""
		"""),format.raw/*25.3*/("""</table>
	</body>
</html>
"""))
      }
    }
  }

  def render(contas:Set[Conta]): play.twirl.api.HtmlFormat.Appendable = apply(contas)

  def f:((Set[Conta]) => play.twirl.api.HtmlFormat.Appendable) = (contas) => apply(contas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Sep 17 17:43:01 BRT 2018
                  SOURCE: /home/aluno/Sistemas-Web/app/views/contas/index.scala.html
                  HASH: a02f2067ab8ce95cb03dc33ac978a104ed7e5987
                  MATRIX: 959->1|1074->23|1101->24|1204->100|1232->101|1265->108|1353->169|1381->170|1411->173|1578->314|1614->334|1653->335|1686->341|1740->368|1754->373|1783->381|1838->409|1852->414|1885->426|1941->455|1955->460|1992->476|2043->500|2057->505|2089->516|2140->537|2170->540
                  LINES: 28->1|33->2|34->3|38->7|38->7|39->8|41->10|41->10|42->11|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|56->25
                  -- GENERATED --
              */
          