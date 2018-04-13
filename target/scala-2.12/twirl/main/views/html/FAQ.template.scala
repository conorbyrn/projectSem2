
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

object FAQ extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

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
					<div id="leftCol">
						<div class="outerColDiv">
							<div class="col-sm-5">
      <p>If you're question isint answered in the FAQ you can submit your own question here and one of our staff will respond within 24 hours. </p>
	  
      <p><span class="glyphicon glyphicon-map-marker"></span> Sandyford, Dublin</p>
      <p><span class="glyphicon glyphicon-phone"></span> 01 820876</p>
      
    </div>
						</div>
					
					</div>
					
					<div id="centreCol">
						<div class="outerColDiv">
							<div>
<!-- Accordain -->
<button class="accordion">Q1</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<button class="accordion">Q2</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

</div><button class="accordion">Q3</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<!-- JS For Accordain-->
<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) """),format.raw/*120.34*/("""{"""),format.raw/*120.35*/("""
  """),format.raw/*121.3*/("""acc[i].addEventListener("click", function() """),format.raw/*121.47*/("""{"""),format.raw/*121.48*/("""
    """),format.raw/*122.5*/("""this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight)"""),format.raw/*124.31*/("""{"""),format.raw/*124.32*/("""
      """),format.raw/*125.7*/("""panel.style.maxHeight = null;
    """),format.raw/*126.5*/("""}"""),format.raw/*126.6*/(""" """),format.raw/*126.7*/("""else """),format.raw/*126.12*/("""{"""),format.raw/*126.13*/("""
      """),format.raw/*127.7*/("""panel.style.maxHeight = panel.scrollHeight + "px";
    """),format.raw/*128.5*/("""}"""),format.raw/*128.6*/(""" 
  """),format.raw/*129.3*/("""}"""),format.raw/*129.4*/(""");
"""),format.raw/*130.1*/("""}"""),format.raw/*130.2*/("""
"""),format.raw/*131.1*/("""</script>



											<!-- Container (Contact Section) -->
<div id="contact" class="container-fluid bg-grey">
  <h2 class="text-center">Ask a Question</h2>
  <div class="row">
    
    <div class="col-sm-7 slideanim">
      <div class="row">
        <div class="col-sm-6 form-group">
          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
        </div>
        <div class="col-sm-6 form-group">
          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea><br>
      <div class="row">
        <div class="col-sm-12 form-group">
          <button class="btn btn-default pull-right" type="submit">Send</button>
        </div>
      </div>
    </div>
  </div>
</div>
							</div>
						</div>
					</div>
				</div>
				<map name="facebook" id="facebook">
		<area href="https://www.facebook.com/" shape="circle" coords="100, 80,80,50" alt="fb"/>
		<area href="https://twitter.com/" shape="circle" coords="300, 80,80,80" alt="tw"/>
		<area href="https://www.instagram.com/" shape="circle" coords="500, 80,80,50" alt="in"/>
		</map>
		<img src="/assets/images/follow.png" usemap="#facebook" alt"wh"width="570" height="200"/>
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
                  DATE: Fri Apr 13 12:46:16 IST 2018
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/FAQ.scala.html
                  HASH: e2564ddaa8081fc21330ff44e1c63725c6d7e323
                  MATRIX: 960->1|1087->33|1115->35|1253->147|1267->153|1333->198|3140->1977|3169->1978|3210->1992|3310->2065|3338->2066|3368->2069|4782->3454|4812->3455|4843->3458|4916->3502|4946->3503|4979->3508|5112->3612|5142->3613|5177->3620|5239->3654|5268->3655|5297->3656|5331->3661|5361->3662|5396->3669|5479->3724|5508->3725|5540->3729|5569->3730|5600->3733|5629->3734|5658->3735
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|94->62|94->62|96->64|99->67|99->67|100->68|152->120|152->120|153->121|153->121|153->121|154->122|156->124|156->124|157->125|158->126|158->126|158->126|158->126|158->126|159->127|160->128|160->128|161->129|161->129|162->130|162->130|163->131
                  -- GENERATED --
              */
          