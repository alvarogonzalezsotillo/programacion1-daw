import java.math.BigDecimal;
import java.math.MathContext;

public class RaizDeDos {

	public static void main(String[] args) {
		MathContext mc = new MathContext(300);
		BigDecimal raizDeDos = new BigDecimal("1.5",mc);
		BigDecimal _2 = new BigDecimal("2",mc);
		
		String anterior = raizDeDos.toString();
		for( int i = 0 ; i < 30000 ; i ++ ){
			// (a+2/a)/2
			raizDeDos = (raizDeDos.add( _2.divide(raizDeDos,mc))).divide(_2,mc);
			System.out.println(raizDeDos);
			String ahora = raizDeDos.toString();
			int cuantosIguales = cuantosIguales(ahora,anterior);
			if( cuantosIguales >= 200 ){
				break;
			}
			anterior = ahora;
		}
		

	}

	/*
	1.41666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666667
	1.41421568627450980392156862745098039215686274509803921568627450980392156862745098039215686274509803921568627450980392156862745098039215686274509803921568627450980392156862745098039215686274509803921568627450980392156862745098039215686274509803921568627450980392156862745098039215686274509803921568628
	1.41421356237468991062629557889013491011655962211574404458490501920005437183538926835899004315764434023175994834675638019505895945900023787677982804907058143881469398851394977401705916335338294763312604071091174771468379379481428619974853026132463383967105039589492642811023889625174159785231250212390
	1.41421356237309504880168962350253024361498192577619742849828949862319582422892362178494183673583035655831431067505948202657730831732002621577830222200111296051917731217809008141213275773401309092053579529061462415958396989506279589018810128467136090375399417852437387204925332371777716921286946425938
	1.41421356237309504880168872420969807856967187537723400156101313311326525563033997853178716125071047521604837511126183764071885126616811616716210123884378343986814296588350076877046149109322589318328496309915062233926328781590928132777865389798685807212176477314928145001924170229472171819006034555297
	1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764160163978577838455782982499124637058767739327996929644352970990582033003911736303741242444803807701133785345519967229693382091808411985507098475443840066081397790590772414860843105729533362547899873012792
	1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764157273501384623091229702492483605585073721264412149709993583141322266592750559275579995050115278206086685896124367542648388524980445022706806183894594591367127656555213419618405964663274041400680281650152
	1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764157273501384623091229702492483605585073721264412149709993583141322266592750559275579995050115278206057147010955997160597027453459686201472851741864088919860955232923048430871432145083976260362799525140799
	1.41421356237309504880168872420969807856967187537694807317667973799073247846210703885038753432764157273501384623091229702492483605585073721264412149709993583141322266592750559275579995050115278206057147010955997160597027453459686201472851741864088919860955232923048430871432145083976260362799525140799
*/
	private static int cuantosIguales(String ahora, String anterior) {
		for (int i = 0; i < anterior.length(); i++) {
			if( ahora.charAt(i) != anterior.charAt(i) ){
				return i-1;
			}
		}
		return ahora.length();
	}
}