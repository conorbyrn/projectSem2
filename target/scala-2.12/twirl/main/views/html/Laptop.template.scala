
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

object Laptop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""



"""),format.raw/*5.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
		<link rel="stylesheet" type="text/css" href=""""),_display_(/*10.49*/routes/*10.55*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*10.100*/("""">
		
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
.carousel-inner img """),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""
      
      """),format.raw/*66.7*/("""width: 50%; /* Set width to 100% */
      margin: auto;
	  height:50%;
  """),format.raw/*69.3*/("""}"""),format.raw/*69.4*/("""
  """),format.raw/*70.3*/("""</style>
    

				
				<ul id="navbar">
				<li class="dropdown"><a href="/">Home</a></li>
					<li class="dropdown"><a href="/tv">Televisions</a></li>
					<li class="dropdown"><a href="/Phones">Phones</a></li>
					<li class="dropdown"><a href="/Laptop">Laptops</a></li>
					<li class="dropdown"><a href="/about">About Us</a></li>
					<li class="dropdown"><a href="/FAQ">FAQ</a></li>
				</ul>
			</header>
			
			<main>
				<div id="columns">
					<h2>Dell Laptops</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
                                    <img src="/assets/images/dell-xps.jpg" alt="xps" class="productImg">
                                    """),_display_(/*92.38*/for(p <-products) yield /*92.55*/ {_display_(Seq[Any](format.raw/*92.57*/("""
                                    """),_display_(/*93.38*/if(p.getId == 1)/*93.54*/ {_display_(Seq[Any](format.raw/*93.56*/("""
									"""),format.raw/*94.10*/("""<h4>"""),_display_(/*94.15*/p/*94.16*/.getName),format.raw/*94.24*/(""" """),format.raw/*94.25*/("""</h4>
									<ul>	
										<li>"""),_display_(/*96.16*/p/*96.17*/.getDescription),format.raw/*96.32*/("""</li><br>
										
										<li>"""),_display_(/*98.16*/p/*98.17*/.getStock),format.raw/*98.26*/("""</li><br>
										<li>"""),_display_(/*99.16*/p/*99.17*/.getPrice),format.raw/*99.26*/("""</li><br>
                    <li><a href="#" class="moreInfoBtn">Click for more info</a></li>
                                        """)))}),format.raw/*101.42*/("""   
                                    """),format.raw/*102.37*/("""</ul>
                                """)))}),format.raw/*103.34*/("""   
								"""),format.raw/*104.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Alienware.png" alt="Alienware" class="productImg">
									"""),_display_(/*108.11*/for(p <-products) yield /*108.28*/ {_display_(Seq[Any](format.raw/*108.30*/("""
										"""),_display_(/*109.12*/if(p.getId == 7)/*109.28*/ {_display_(Seq[Any](format.raw/*109.30*/("""
									"""),format.raw/*110.10*/("""<h4>"""),_display_(/*110.15*/p/*110.16*/.getName),format.raw/*110.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*112.16*/p/*112.17*/.getDescription),format.raw/*112.32*/("""</li><br>
									
										<li>"""),_display_(/*114.16*/p/*114.17*/.getStock),format.raw/*114.26*/("""</li><br>
										<li>"""),_display_(/*115.16*/p/*115.17*/.getPrice),format.raw/*115.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*117.13*/("""
									"""),format.raw/*118.10*/("""</ul>
								""")))}),format.raw/*119.10*/("""
								"""),format.raw/*120.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<div class="productInfo">
									<img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg">
									"""),_display_(/*131.11*/for(p <-products) yield /*131.28*/ {_display_(Seq[Any](format.raw/*131.30*/("""
										"""),_display_(/*132.12*/if(p.getId == 4)/*132.28*/ {_display_(Seq[Any](format.raw/*132.30*/("""
									"""),format.raw/*133.10*/("""<h4>"""),_display_(/*133.15*/p/*133.16*/.getName),format.raw/*133.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*135.16*/p/*135.17*/.getDescription),format.raw/*135.32*/("""  """),format.raw/*135.34*/("""</li><br>
										<li>"""),_display_(/*136.16*/p/*136.17*/.getStock),format.raw/*136.26*/("""</li><br>
										<li>"""),_display_(/*137.16*/p/*137.17*/.getPrice),format.raw/*137.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*139.13*/("""
									"""),format.raw/*140.10*/("""</ul>
								""")))}),format.raw/*141.10*/("""
								"""),format.raw/*142.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/Latitude.jpg" alt="Latitude" class="productImg">
									"""),_display_(/*146.11*/for(p <-products) yield /*146.28*/ {_display_(Seq[Any](format.raw/*146.30*/("""
										"""),_display_(/*147.12*/if(p.getId == 3)/*147.28*/ {_display_(Seq[Any](format.raw/*147.30*/("""
									"""),format.raw/*148.10*/("""<h4>"""),_display_(/*148.15*/p/*148.16*/.getName),format.raw/*148.24*/("""</h4>
									<ul>
										<li>"""),_display_(/*150.16*/p/*150.17*/.getDescription),format.raw/*150.32*/("""</li><br>
										<li>"""),_display_(/*151.16*/p/*151.17*/.getStock),format.raw/*151.26*/("""</li><br>
										<li>"""),_display_(/*152.16*/p/*152.17*/.getPrice),format.raw/*152.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*154.13*/("""
									"""),format.raw/*155.10*/("""</ul>
								""")))}),format.raw/*156.10*/("""
								"""),format.raw/*157.9*/("""</div>
							</div>
						</div>
					</div>

					<p>
							<a href=""""),_display_(/*163.18*/routes/*163.24*/.HomeController.addProduct()),format.raw/*163.52*/("""">
								<button class="btn btn-primary">Add a product</button>
							</a>
					</p>
					
					<div id="bottomCol">
						<div class="outerColDiv">
							
						</div>
					</div>
				</div>
			</main>
			
			<footer>
				Copyright &copy; 2018 
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
                  DATE: Fri Apr 13 17:25:09 IST 2018
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/Laptop.scala.html
                  HASH: 488d319fef715073f5351ba4c860e6f526007521
                  MATRIX: 963->1|1090->33|1120->37|1259->149|1274->155|1341->200|3146->1977|3175->1978|3216->1992|3316->2065|3344->2066|3374->2069|4122->2790|4155->2807|4195->2809|4260->2847|4285->2863|4325->2865|4363->2875|4395->2880|4405->2881|4434->2889|4463->2890|4526->2926|4536->2927|4572->2942|4635->2978|4645->2979|4675->2988|4727->3013|4737->3014|4767->3023|4935->3159|5004->3199|5075->3238|5115->3250|5288->3395|5322->3412|5363->3414|5403->3426|5429->3442|5470->3444|5509->3454|5542->3459|5553->3460|5583->3468|5647->3504|5658->3505|5695->3520|5758->3555|5769->3556|5800->3565|5853->3590|5864->3591|5895->3600|6024->3697|6063->3707|6110->3722|6147->3731|6431->3987|6465->4004|6506->4006|6546->4018|6572->4034|6613->4036|6652->4046|6685->4051|6696->4052|6726->4060|6790->4096|6801->4097|6838->4112|6869->4114|6922->4139|6933->4140|6964->4149|7017->4174|7028->4175|7059->4184|7188->4281|7227->4291|7274->4306|7311->4315|7482->4458|7516->4475|7557->4477|7597->4489|7623->4505|7664->4507|7703->4517|7736->4522|7747->4523|7777->4531|7840->4566|7851->4567|7888->4582|7941->4607|7952->4608|7983->4617|8036->4642|8047->4643|8078->4652|8207->4749|8246->4759|8293->4774|8330->4783|8431->4856|8447->4862|8497->4890
                  LINES: 28->1|33->1|37->5|42->10|42->10|42->10|96->64|96->64|98->66|101->69|101->69|102->70|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|126->94|126->94|128->96|128->96|128->96|130->98|130->98|130->98|131->99|131->99|131->99|133->101|134->102|135->103|136->104|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|144->112|144->112|144->112|146->114|146->114|146->114|147->115|147->115|147->115|149->117|150->118|151->119|152->120|163->131|163->131|163->131|164->132|164->132|164->132|165->133|165->133|165->133|165->133|167->135|167->135|167->135|167->135|168->136|168->136|168->136|169->137|169->137|169->137|171->139|172->140|173->141|174->142|178->146|178->146|178->146|179->147|179->147|179->147|180->148|180->148|180->148|180->148|182->150|182->150|182->150|183->151|183->151|183->151|184->152|184->152|184->152|186->154|187->155|188->156|189->157|195->163|195->163|195->163
                  -- GENERATED --
              */
          