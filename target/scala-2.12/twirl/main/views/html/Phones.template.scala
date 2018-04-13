
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

object Phones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.49*/routes/*8.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*8.100*/("""">
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
		
		
	</head>

	<body>
	
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  </ol>

   <!-- Wrapper for slides -->
    <div class="carousel-inner">
    <div class="item active">
      <img src="/assets/images/sale.jpg" alt="Sale">
    </div>
	

    <div class="item">
      <img src="/assets/images/tv.jpg" alt="TV">
    </div>

    <div class="item">
      <img src="/assets/images/iphone.png" alt="iPhone">
    </div>
	
	<div class="item">
      <img src="/assets/images/laptop.jpg" alt="Macbook">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<style>
.carousel-inner img """),format.raw/*62.21*/("""{"""),format.raw/*62.22*/("""
      
      """),format.raw/*64.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:50%;
  """),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""
  """),format.raw/*68.3*/("""</style>
    

				
				<ul id="navbar">
				<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/FAQ">FAQ</a></li>
				</ul>
			</header>
			
			4<main>
				<div id="columns">
					<h2>Dell Laptops</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
                                    <img src="/assets/images/iphoneX.jpg" alt="IPHX" class="productImg">
                                    """),_display_(/*90.38*/for(p <-products) yield /*90.55*/ {_display_(Seq[Any](format.raw/*90.57*/("""
                                    """),_display_(/*91.38*/if(p.getId == 2)/*91.54*/ {_display_(Seq[Any](format.raw/*91.56*/("""
									"""),format.raw/*92.10*/("""<h4>"""),_display_(/*92.15*/p/*92.16*/.getName),format.raw/*92.24*/(""" """),format.raw/*92.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*94.16*/p/*94.17*/.getDescription),format.raw/*94.32*/("""</li><br>
										
										<li>"""),_display_(/*96.16*/p/*96.17*/.getStock),format.raw/*96.26*/("""</li><br>
										<li>"""),_display_(/*97.16*/p/*97.17*/.getPrice),format.raw/*97.26*/("""</li><br>
                    <li><a href="#" class="moreInfoBtn">Click for more info</a></li>
                                        """)))}),format.raw/*99.42*/("""   
                                    """),format.raw/*100.37*/("""</ul>
                                """)))}),format.raw/*101.34*/("""   
								"""),format.raw/*102.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/iphone6.jpg" alt="IPH6" class="productImg">
									"""),_display_(/*106.11*/for(p <-products) yield /*106.28*/ {_display_(Seq[Any](format.raw/*106.30*/("""
										"""),_display_(/*107.12*/if(p.getId == 5)/*107.28*/ {_display_(Seq[Any](format.raw/*107.30*/("""
									"""),format.raw/*108.10*/("""<h4>"""),_display_(/*108.15*/p/*108.16*/.getName),format.raw/*108.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*110.16*/p/*110.17*/.getDescription),format.raw/*110.32*/("""</li><br>
									
										<li>"""),_display_(/*112.16*/p/*112.17*/.getStock),format.raw/*112.26*/("""</li><br>
										<li>"""),_display_(/*113.16*/p/*113.17*/.getPrice),format.raw/*113.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*115.13*/("""
									"""),format.raw/*116.10*/("""</ul>
								""")))}),format.raw/*117.10*/("""
								"""),format.raw/*118.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/iphone7.jpg" alt="IPH7" class="productImg">
									"""),_display_(/*129.11*/for(p <-products) yield /*129.28*/ {_display_(Seq[Any](format.raw/*129.30*/("""
										"""),_display_(/*130.12*/if(p.getId == 8)/*130.28*/ {_display_(Seq[Any](format.raw/*130.30*/("""
									"""),format.raw/*131.10*/("""<h4>"""),_display_(/*131.15*/p/*131.16*/.getName),format.raw/*131.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*133.16*/p/*133.17*/.getDescription),format.raw/*133.32*/("""  """),format.raw/*133.34*/("""</li><br>
										<li>"""),_display_(/*134.16*/p/*134.17*/.getStock),format.raw/*134.26*/("""</li><br>
										<li>"""),_display_(/*135.16*/p/*135.17*/.getPrice),format.raw/*135.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*137.13*/("""
									"""),format.raw/*138.10*/("""</ul>
								""")))}),format.raw/*139.10*/("""
								"""),format.raw/*140.9*/("""</div>
								</div>
							</div>
						</div>
					</div>
					
					<div id="bottomCol">
						<div class="outerColDiv">
							
						</div>
					</div>
				</div>
			</main>
			
			<footer>
				Copyright &copy; 2016 
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 13 12:46:16 IST 2018
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/Phones.scala.html
                  HASH: d2ce45fa34749d345e9970ef89c6d8a0965a7a2c
                  MATRIX: 963->1|1090->33|1118->35|1256->147|1270->153|1336->198|3143->1977|3172->1978|3213->1992|3313->2065|3341->2066|3371->2069|4120->2791|4153->2808|4193->2810|4258->2848|4283->2864|4323->2866|4361->2876|4393->2881|4403->2882|4432->2890|4461->2891|4524->2927|4534->2928|4570->2943|4633->2979|4643->2980|4673->2989|4725->3014|4735->3015|4765->3024|4932->3160|5001->3200|5072->3239|5112->3251|5278->3389|5312->3406|5353->3408|5393->3420|5419->3436|5460->3438|5499->3448|5532->3453|5543->3454|5573->3462|5637->3498|5648->3499|5685->3514|5748->3549|5759->3550|5790->3559|5843->3584|5854->3585|5885->3594|6014->3691|6053->3701|6100->3716|6137->3725|6416->3976|6450->3993|6491->3995|6531->4007|6557->4023|6598->4025|6637->4035|6670->4040|6681->4041|6711->4049|6775->4085|6786->4086|6823->4101|6854->4103|6907->4128|6918->4129|6949->4138|7002->4163|7013->4164|7044->4173|7173->4270|7212->4280|7259->4295|7296->4304
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|94->62|94->62|96->64|99->67|99->67|100->68|122->90|122->90|122->90|123->91|123->91|123->91|124->92|124->92|124->92|124->92|124->92|126->94|126->94|126->94|128->96|128->96|128->96|129->97|129->97|129->97|131->99|132->100|133->101|134->102|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|142->110|142->110|142->110|144->112|144->112|144->112|145->113|145->113|145->113|147->115|148->116|149->117|150->118|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|163->131|165->133|165->133|165->133|165->133|166->134|166->134|166->134|167->135|167->135|167->135|169->137|170->138|171->139|172->140
                  -- GENERATED --
              */
          