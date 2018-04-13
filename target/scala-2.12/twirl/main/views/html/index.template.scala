
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
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
				<style>
table, th, td """),format.raw/*86.15*/("""{"""),format.raw/*86.16*/("""
    """),format.raw/*87.5*/("""border: 1px solid black;
    border-collapse: collapse;
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/("""
"""),format.raw/*90.1*/("""th, td """),format.raw/*90.8*/("""{"""),format.raw/*90.9*/("""
    """),format.raw/*91.5*/("""padding: 5px;
    text-align: left;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""


"""),format.raw/*96.1*/("""</style>
</head>
<body>

<table id="t01" style="width:50%" >
 
  <tr>
    <th><img src="/assets/images/t-laptop.PNG" alt="32' laptop" class="productImg" style=""></th>
    <th><img src="/assets/images/t-laptop1.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
  <tr>
    <th><img src="/assets/images/t-laptop2.PNG" alt="32' LG TV" class="productImg" style=""></th>
    <th><img src="/assets/images/t-tablet.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
  <tr>
    <th><img src="/assets/images/t-tv.PNG" alt="32' LG TV" class="productImg" style=""></th>
    <th><img src="/assets/images/t-laptop1.PNG" alt="32' LG TV" class="productImg" style=""></th>
  </tr>
</table>



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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 13 16:16:23 IST 2018
                  SOURCE: /home/wdd/webapps/Old Project Working/2ndYearProject-803d4afd3ec4a232a9cb7d02e51eb0ae494fb3f6/app/views/index.scala.html
                  HASH: 69fb7bbca9074bbd34158dc3e94822196c58eb5f
                  MATRIX: 1030->0|1185->129|1199->135|1265->180|3075->1962|3104->1963|3145->1977|3245->2050|3273->2051|3303->2054|3781->2504|3810->2505|3842->2510|3925->2566|3953->2567|3981->2568|4015->2575|4043->2576|4075->2581|4138->2617|4166->2618|4196->2621
                  LINES: 33->1|40->8|40->8|40->8|96->64|96->64|98->66|101->69|101->69|102->70|118->86|118->86|119->87|121->89|121->89|122->90|122->90|122->90|123->91|125->93|125->93|128->96
                  -- GENERATED --
              */
          