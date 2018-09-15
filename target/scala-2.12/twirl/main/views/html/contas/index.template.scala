
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
	</head>
	<body>
		<h1>Todas as contas</h1>
				
		"""),_display_(/*10.4*/for(conta <- contas) yield /*10.24*/{_display_(Seq[Any](format.raw/*10.25*/("""
			"""),format.raw/*11.4*/("""<a href="#">"""),_display_(/*11.17*/conta/*11.22*/.id),format.raw/*11.25*/("""</a>
			<p>Titulo: """),_display_(/*12.16*/conta/*12.21*/.titulo),format.raw/*12.28*/("""</p>
  			<p>Vencimento: """),_display_(/*13.22*/conta/*13.27*/.vencimento),format.raw/*13.38*/("""</p>
 			<p>Valor: """),_display_(/*14.16*/conta/*14.21*/.valor),format.raw/*14.27*/("""</p>
		""")))}),format.raw/*15.4*/("""
	"""),format.raw/*16.2*/("""</body>
</html>"""))
      }
    }
  }

  def render(contas:Set[Conta]): play.twirl.api.HtmlFormat.Appendable = apply(contas)

  def f:((Set[Conta]) => play.twirl.api.HtmlFormat.Appendable) = (contas) => apply(contas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Sep 15 00:38:35 BRT 2018
                  SOURCE: /home/lucas/sistemas-web/app/views/contas/index.scala.html
                  HASH: bee9a307f1ab236d9e4b419210fa0b202f4f4d1a
                  MATRIX: 959->1|1074->23|1101->24|1228->125|1264->145|1303->146|1334->150|1374->163|1388->168|1412->171|1459->191|1473->196|1501->203|1554->229|1568->234|1600->245|1647->265|1661->270|1688->276|1726->284|1755->286
                  LINES: 28->1|33->2|34->3|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16
                  -- GENERATED --
              */
          