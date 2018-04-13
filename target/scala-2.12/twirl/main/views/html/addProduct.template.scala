
package views.html

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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add Product")/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*10.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")),format.raw/*10.105*/("""
        """),format.raw/*11.37*/("""
        """),format.raw/*12.99*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""


        """),_display_(/*16.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.85*/("""
        """),_display_(/*17.10*/inputText(productForm("description"), '_label -> "descripton", 'class -> "form-control")),format.raw/*17.98*/("""
        """),_display_(/*18.10*/inputText(productForm("stock"), '_label -> "stock", 'class -> "form-control")),format.raw/*18.87*/("""
        """),_display_(/*19.10*/inputText(productForm("price"), '_label -> "Price", 'class ->"form-control")),format.raw/*19.86*/("""

        """),_display_(/*21.10*/inputText(productForm("id"), '_label ->"", 'hidden ->"hidden")),format.raw/*21.72*/("""


        """),format.raw/*24.9*/("""<div class="actions">
                <input type="submit" value="Add/Update Product" class="btn btn-primary">
                <a href+""""),_display_(/*26.27*/routes/*26.33*/.HomeController.index),format.raw/*26.54*/("""">
                    <button type="button" class+"btn btn-warning"> Cancel </button>
                
                </a>
        </div>
""")))}),format.raw/*31.2*/("""   """))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 13 17:40:41 IST 2018
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/addProduct.scala.html
                  HASH: 303bfd885eca5347f6a74330496c5edfcdf61bcd
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1177->59|1204->78|1243->80|1274->85|1344->129|1465->228|1502->265|1539->364|1576->374|1589->378|1620->388|1659->400|1755->475|1792->485|1901->573|1938->583|2036->660|2073->670|2170->746|2208->757|2291->819|2329->830|2493->967|2508->973|2550->994|2721->1135
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|42->10|42->10|43->11|44->12|45->13|45->13|45->13|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|53->21|53->21|56->24|58->26|58->26|58->26|63->31
                  -- GENERATED --
              */
          