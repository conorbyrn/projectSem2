
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

object tv extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

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
			
			<main>
				<div id="columns">
					<h2>Samsung TVs</h2>
					<div id="leftCol">
						<div class="outerColDiv">
							<div>
								<h4>Standard TVs</h4>
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img1.jpg" alt="24' Samsung TV" class="productImg">
									"""),_display_(/*91.11*/for(p <-products) yield /*91.28*/ {_display_(Seq[Any](format.raw/*91.30*/("""
										"""),_display_(/*92.12*/if(p.getId == 6)/*92.28*/ {_display_(Seq[Any](format.raw/*92.30*/("""
									"""),format.raw/*93.10*/("""<h4>"""),_display_(/*93.15*/p/*93.16*/.getName),format.raw/*93.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*95.16*/p/*95.17*/.getDescription),format.raw/*95.32*/("""</li><br>
										<li>"""),_display_(/*96.16*/p/*96.17*/.getStock),format.raw/*96.26*/("""</li><br>
										<li>"""),_display_(/*97.16*/p/*97.17*/.getPrice),format.raw/*97.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*99.13*/("""
									"""),format.raw/*100.10*/("""</ul>
										""")))}),format.raw/*101.12*/("""
								"""),format.raw/*102.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg">
									"""),_display_(/*106.11*/for(p <-products) yield /*106.28*/ {_display_(Seq[Any](format.raw/*106.30*/("""
										"""),_display_(/*107.12*/if(p.getId == 9)/*107.28*/ {_display_(Seq[Any](format.raw/*107.30*/("""
									"""),format.raw/*108.10*/("""<h4>"""),_display_(/*108.15*/p/*108.16*/.getName),format.raw/*108.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*110.16*/p/*110.17*/.getDescription),format.raw/*110.32*/("""</li><br>
										<li>"""),_display_(/*111.16*/p/*111.17*/.getStock),format.raw/*111.26*/("""</li><br>
										<li>"""),_display_(/*112.16*/p/*112.17*/.getPrice),format.raw/*112.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*114.13*/("""
									"""),format.raw/*115.10*/("""</ul>
										""")))}),format.raw/*116.12*/("""
								"""),format.raw/*117.9*/("""</div>
							</div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
								<h4>Smart TVs</h4>
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung Smart TV" class="productImg">
									"""),_display_(/*129.11*/for(p <-products) yield /*129.28*/ {_display_(Seq[Any](format.raw/*129.30*/("""
										"""),_display_(/*130.12*/if(p.getId == 10)/*130.29*/ {_display_(Seq[Any](format.raw/*130.31*/("""
									"""),format.raw/*131.10*/("""<h4>"""),_display_(/*131.15*/p/*131.16*/.getName),format.raw/*131.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*133.16*/p/*133.17*/.getDescription),format.raw/*133.32*/("""</li><br>
										<li>"""),_display_(/*134.16*/p/*134.17*/.getStock),format.raw/*134.26*/("""</li><br>
										<li>"""),_display_(/*135.16*/p/*135.17*/.getPrice),format.raw/*135.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*137.13*/("""
									"""),format.raw/*138.10*/("""</ul>
										""")))}),format.raw/*139.12*/("""
								"""),format.raw/*140.9*/("""</div>
								
								<div class="productInfo">
									<img src="/assets/images/SamsungTV-img4.jpg" alt="55' Samsung Smart TV" class="productImg">
									"""),_display_(/*144.11*/for(p <-products) yield /*144.28*/ {_display_(Seq[Any](format.raw/*144.30*/("""
										"""),_display_(/*145.12*/if(p.getId == 11)/*145.29*/ {_display_(Seq[Any](format.raw/*145.31*/("""
									"""),format.raw/*146.10*/("""<h4>"""),_display_(/*146.15*/p/*146.16*/.getName),format.raw/*146.24*/("""</h4>
									<ul>	
										<li>"""),_display_(/*148.16*/p/*148.17*/.getDescription),format.raw/*148.32*/("""</li><br>
										<li>"""),_display_(/*149.16*/p/*149.17*/.getStock),format.raw/*149.26*/("""</li><br>
										<li>"""),_display_(/*150.16*/p/*150.17*/.getPrice),format.raw/*150.26*/("""</li><br>
										<li><a href="#" class="moreInfoBtn">Click for more info</a></li>
											""")))}),format.raw/*152.13*/("""
									"""),format.raw/*153.10*/("""</ul>
									""")))}),format.raw/*154.11*/("""
								"""),format.raw/*155.9*/("""</div>
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
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/tv.scala.html
                  HASH: 194db2ce108330dcbaf548c6f582af079ff760c5
                  MATRIX: 959->1|1086->33|1114->35|1252->147|1266->153|1332->198|3138->1976|3167->1977|3208->1991|3308->2064|3336->2065|3366->2068|4106->2781|4139->2798|4179->2800|4218->2812|4243->2828|4283->2830|4321->2840|4353->2845|4363->2846|4392->2854|4455->2890|4465->2891|4501->2906|4553->2931|4563->2932|4593->2941|4645->2966|4655->2967|4685->2976|4813->3073|4852->3083|4901->3100|4938->3109|5121->3264|5155->3281|5196->3283|5236->3295|5262->3311|5303->3313|5342->3323|5375->3328|5386->3329|5416->3337|5480->3373|5491->3374|5528->3389|5581->3414|5592->3415|5623->3424|5676->3449|5687->3450|5718->3459|5847->3556|5886->3566|5935->3583|5972->3592|6301->3893|6335->3910|6376->3912|6416->3924|6443->3941|6484->3943|6523->3953|6556->3958|6567->3959|6597->3967|6661->4003|6672->4004|6709->4019|6762->4044|6773->4045|6804->4054|6857->4079|6868->4080|6899->4089|7028->4186|7067->4196|7116->4213|7153->4222|7342->4383|7376->4400|7417->4402|7457->4414|7484->4431|7525->4433|7564->4443|7597->4448|7608->4449|7638->4457|7702->4493|7713->4494|7750->4509|7803->4534|7814->4535|7845->4544|7898->4569|7909->4570|7940->4579|8069->4676|8108->4686|8156->4702|8193->4711
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|94->62|94->62|96->64|99->67|99->67|100->68|123->91|123->91|123->91|124->92|124->92|124->92|125->93|125->93|125->93|125->93|127->95|127->95|127->95|128->96|128->96|128->96|129->97|129->97|129->97|131->99|132->100|133->101|134->102|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|142->110|142->110|142->110|143->111|143->111|143->111|144->112|144->112|144->112|146->114|147->115|148->116|149->117|161->129|161->129|161->129|162->130|162->130|162->130|163->131|163->131|163->131|163->131|165->133|165->133|165->133|166->134|166->134|166->134|167->135|167->135|167->135|169->137|170->138|171->139|172->140|176->144|176->144|176->144|177->145|177->145|177->145|178->146|178->146|178->146|178->146|180->148|180->148|180->148|181->149|181->149|181->149|182->150|182->150|182->150|184->152|185->153|186->154|187->155
                  -- GENERATED --
              */
          