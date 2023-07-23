package packages;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] atrgs){
		String repetir = "SI";
		for(int i = 0; repetir.equals("SI"); i++) {
			String input = JOptionPane.showInputDialog("¿Qué tipo de operación le gustaría realizar?\n" +
														   "1. Conversiones de Unidades\n" +
														   "2. Distancia entre dos puntos\n" +
														   "3. Pendiente\n" +
														   "4. Distancia de un punto y una recta\n" +
														   "5. Vectores");
			int opc1 = Integer.parseInt(input);
			switch(opc1) {
				case 1: conversiones();break;
				case 2:	DistanciaPuntos();break;
				case 3: Pendiente();break;
				case 4:	distanciaPuntoRecta();break;
				case 5:	vectores();break;
			}
			repetir = JOptionPane.showInputDialog("¿Desea hacer otra operación? (SI o NO)").toUpperCase();
		} 
	}
	public static void conversiones() {
		String repetir = "SI";
		for(int i = 0; repetir.equals("SI"); i++) {
			String input = JOptionPane.showInputDialog("¿Qué tipo de conversión le gustaría realizar?\n" +
														   "1. Longitudes\n" +
														   "2. Masas\n" +
														   "3. Tiempo\n" +
														   "4. Temperaturas\n" +
														   "5. Velocidades");
			int opc1 = Integer.parseInt(input);
			switch(opc1) {
				case 1: longitudes();break;
				case 2:	masas();break;
				case 3: tiempo();break;
				case 4:	temperaturas();break;
				case 5:	velocidades();break;
			}
			repetir = JOptionPane.showInputDialog("¿Desea hacer otra conversión? (SI o NO)").toUpperCase();
		}
	}
	public static void longitudes() {
		String input1 = JOptionPane.showInputDialog("Elige la unidad que deseas convertir:\n" +
	                "1 -> Centimetros\n" +
	                "2 -> Milimetros\n" +
	                "3 -> Pulgadas\n" +
	                "4 -> Pies\n" +
	                "5 -> Yardas");
	    int opc2 = Integer.parseInt(input1);
        switch (opc2) {
        case 1:
        String input2_1 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Milimetros\n" +
	                        "2 -> Pulgadas\n" +
	                        "3 -> Pies\n" +
	                        "4 -> Yardas");
	    int a1 = Integer.parseInt(input2_1);

	              String input3_1 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c1 = Double.parseDouble(input3_1);

	                double resultado1 = 0.0;

	                switch (a1) {
	                    case 1:
	                        resultado1 = c1 * 10;
	                        break;
	                    case 2:
	                        resultado1 = c1 / 2.54;
	                        break;
	                    case 3:
	                        resultado1 = c1 / 30.48;
	                        break;
	                    case 4:
	                        resultado1 = c1 / 91.44;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado1);
	                break;

	            case 2:
	                String input2_2 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Centimetros\n" +
	                        "2 -> Pulgadas\n" +
	                        "3 -> Pies\n" +
	                        "4 -> Yardas");
	                int b1 = Integer.parseInt(input2_2);

	                String input3_2 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c2 = Double.parseDouble(input3_2);

	                double resultado2 = 0.0;

	                switch (b1) {
	                    case 1:
	                        resultado2 = c2 / 10;
	                        break;
	                    case 2:
	                        resultado2 = c2 / 25.4;
	                        break;
	                    case 3:
	                        resultado2 = c2 / 304.8;
	                        break;
	                    case 4:
	                        resultado2 = c2 / 914.4;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado2);
	                break;

	            case 3:
	                String input2_3 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Centimetros\n" +
	                        "2 -> Milimetros\n" +
	                        "3 -> Pies\n" +
	                        "4 -> Yardas");
	                int C1 = Integer.parseInt(input2_3);

	                String input3_3 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c3 = Double.parseDouble(input3_3);

	                double resultado3 = 0.0;

	                switch (C1) {
	                    case 1:
	                        resultado3 = c3 * 2.54;
	                        break;
	                    case 2:
	                        resultado3 = c3 * 25.4;
	                        break;
	                    case 3:
	                        resultado3 = c3 / 12;
	                        break;
	                    case 4:
	                        resultado3 = c3 / 36;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado3);
	                break;

	            case 4:
	                String input2_4 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Centimetros\n" +
	                        "2 -> Milimetros\n" +
	                        "3 -> Pulgadas\n" +
	                        "4 -> Yardas");
	                int d1 = Integer.parseInt(input2_4);

	                String input3_4 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c4 = Double.parseDouble(input3_4);

	                double resultado4 = 0.0;

	                switch (d1) {
	                    case 1:
	                        resultado4 = c4 * 30.48;
	                        break;
	                    case 2:
	                        resultado4 = c4 * 304.8;
	                        break;
	                    case 3:
	                        resultado4 = c4 * 12;
	                        break;
	                    case 4:
	                        resultado4 = c4 / 3;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado4);
	                break;

	            case 5:
	                String input2_5 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Centimetros\n" +
	                        "2 -> Milimetros\n" +
	                        "3 -> Pulgadas\n" +
	                        "4 -> Pies");
	                int e1 = Integer.parseInt(input2_5);

	                String input3_5 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c5 = Double.parseDouble(input3_5);

	                double resultado5 = 0.0;

	                switch (e1) {
	                    case 1:
	                        resultado5 = c5 * 91.44;
	                        break;
	                    case 2:
	                        resultado5 = c5 * 914.4;
	                        break;
	                    case 3:
	                        resultado5 = c5 * 36;
	                        break;
	                    case 4:
	                        resultado5 = c5 * 3;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado5);
	                break;
	        }
	    }
	    public static void masas() {
	        String input1 = JOptionPane.showInputDialog("Elige la unidad que deseas convertir:\n" +
	                "1 -> Kilogramos\n" +
	                "2 -> Gramos\n" +
	                "3 -> Libras\n" +
	                "4 -> Onzas");
	        int opc2 = Integer.parseInt(input1);

	        switch (opc2) {
	            case 1:
	                String input2_1 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Gramos\n" +
	                        "2 -> Libras\n" +
	                        "3 -> Onzas");
	                int a1 = Integer.parseInt(input2_1);

	                String input3_1 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c1 = Double.parseDouble(input3_1);

	                double resultado1 = 0.0;

	                switch (a1) {
	                    case 1:
	                        resultado1 = c1 * 1000;
	                        break;
	                    case 2:
	                        resultado1 = c1 * 2.2046;
	                        break;
	                    case 3:
	                        resultado1 = c1 * 35.27;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado1);
	                break;

	            case 2:
	                String input2_2 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Kilogramos\n" +
	                        "2 -> Libras\n" +
	                        "3 -> Onzas");
	                int b1 = Integer.parseInt(input2_2);

	                String input3_2 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c2 = Double.parseDouble(input3_2);

	                double resultado2 = 0.0;

	                switch (b1) {
	                    case 1:
	                        resultado2 = c2 / 1000;
	                        break;
	                    case 2:
	                        resultado2 = c2 / 453.5923;
	                        break;
	                    case 3:
	                        resultado2 = c2 / 28.34;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado2);
	                break;

	            case 3:
	                String input2_3 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Kilogramos\n" +
	                        "2 -> Gramos\n" +
	                        "3 -> Onzas");
	                int C1 = Integer.parseInt(input2_3);

	                String input3_3 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c3 = Double.parseDouble(input3_3);

	                double resultado3 = 0.0;

	                switch (C1) {
	                    case 1:
	                        resultado3 = c3 / 2.2046;
	                        break;
	                    case 2:
	                        resultado3 = c3 * 453.59;
	                        break;
	                    case 3:
	                        resultado3 = c3 * 16;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado3);
	                break;

	            case 4:
	                String input2_4 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Kilogramos\n" +
	                        "2 -> Gramos\n" +
	                        "3 -> Libras");
	                int d1 = Integer.parseInt(input2_4);

	                String input3_4 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c4 = Double.parseDouble(input3_4);

	                double resultado4 = 0.0;

	                switch (d1) {
	                    case 1:
	                        resultado4 = c4 / 35.2739;
	                        break;
	                    case 2:
	                        resultado4 = c4 * 28.34;
	                        break;
	                    case 3:
	                        resultado4 = c4 / 16;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado4);
	                break;
	        }
	    }
	    public static void tiempo() {
	        String input1 = JOptionPane.showInputDialog("Elige la unidad que deseas convertir:\n" +
	                "1 -> Segundos\n" +
	                "2 -> Minutos\n" +
	                "3 -> Horas\n" +
	                "4 -> Dias");
	        int opc2 = Integer.parseInt(input1);

	        switch (opc2) {
	            case 1:
	                String input2_1 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Minutos\n" +
	                        "2 -> Horas\n" +
	                        "3 -> Dias");
	                int a = Integer.parseInt(input2_1);

	                String input3_1 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c1 = Double.parseDouble(input3_1);

	                double resultado1 = 0.0;

	                switch (a) {
	                    case 1:
	                        resultado1 = c1 / 60;
	                        break;
	                    case 2:
	                        resultado1 = c1 / 3600;
	                        break;
	                    case 3:
	                        resultado1 = c1 * 86400;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado1);
	                break;

	            case 2:
	                String input2_2 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Segundos\n" +
	                        "2 -> Horas\n" +
	                        "3 -> Dias");
	                int b = Integer.parseInt(input2_2);

	                String input3_2 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c2 = Double.parseDouble(input3_2);

	                double resultado2 = 0.0;

	                switch (b) {
	                    case 1:
	                        resultado2 = c2 * 60;
	                        break;
	                    case 2:
	                        resultado2 = c2 / 60;
	                        break;
	                    case 3:
	                        resultado2 = c2 / 1440;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado2);
	                break;

	            case 3:
	                String input2_3 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Segundos\n" +
	                        "2 -> Minutos\n" +
	                        "3 -> Dias");
	                int c = Integer.parseInt(input2_3);

	                String input3_3 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c3 = Double.parseDouble(input3_3);

	                double resultado3 = 0.0;

	                switch (c) {
	                    case 1:
	                        resultado3 = c3 * 3600;
	                        break;
	                    case 2:
	                        resultado3 = c3 * 60;
	                        break;
	                    case 3:
	                        resultado3 = c3 / 24;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado3);
	                break;

	            case 4:
	                String input2_4 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Segundos\n" +
	                        "2 -> Minutos\n" +
	                        "3 -> Horas");
	                int d = Integer.parseInt(input2_4);

	                String input3_4 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c4 = Double.parseDouble(input3_4);

	                double resultado4 = 0.0;

	                switch (d) {
	                    case 1:
	                        resultado4 = c4 * 86400;
	                        break;
	                    case 2:
	                        resultado4 = c4 * 1440;
	                        break;
	                    case 3:
	                        resultado4 = c4 * 24;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado4);
	                break;
	        }
	    }
	    public static void temperaturas() {
	        String input1 = JOptionPane.showInputDialog("Elige la unidad que deseas convertir:\n" +
	                "1 -> Celsious\n" +
	                "2 -> Faherenheit\n" +
	                "3 -> Kelvin\n" +
	                "4 -> Ranking");
	        int opc2 = Integer.parseInt(input1);

	        switch (opc2) {
	            case 1:
	                String input2_1 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Faherenheit\n" +
	                        "2 -> Kelvin\n" +
	                        "3 -> Ranking");
	                int a = Integer.parseInt(input2_1);

	                String input3_1 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c1 = Double.parseDouble(input3_1);

	                double resultado1 = 0.0;

	                switch (a) {
	                    case 1:
	                        resultado1 = (c1 * 9 / 5) + 32;
	                        break;
	                    case 2:
	                        resultado1 = c1 + 273;
	                        break;
	                    case 3:
	                        resultado1 = (c1 + 273) * 9 / 5;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado1);
	                break;

	            case 2:
	                String input2_2 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Celsious\n" +
	                        "2 -> Kelvin\n" +
	                        "3 -> Ranking");
	                int b = Integer.parseInt(input2_2);

	                String input3_2 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c2 = Double.parseDouble(input3_2);

	                double resultado2 = 0.0;

	                switch (b) {
	                    case 1:
	                        resultado2 = (c2 - 32) * 5 / 9;
	                        break;
	                    case 2:
	                        resultado2 = (c2 + 459) * 5 / 9;
	                        break;
	                    case 3:
	                        resultado2 = c2 + 459;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado2);
	                break;

	            case 3:
	                String input2_3 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Celsious\n" +
	                        "2 -> Faherenheit\n" +
	                        "3 -> Ranking");
	                int c = Integer.parseInt(input2_3);

	                String input3_3 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c3 = Double.parseDouble(input3_3);

	                double resultado3 = 0.0;

	                switch (c) {
	                    case 1:
	                        resultado3 = c3 - 273;
	                        break;
	                    case 2:
	                        resultado3 = (c3 * 9 / 5) - 459;
	                        break;
	                    case 3:
	                        resultado3 = c3 * 9 / 5;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado3);
	                break;

	            case 4:
	                String input2_4 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Celsious\n" +
	                        "2 -> Faherenheit\n" +
	                        "3 -> Kelvin");
	                int d = Integer.parseInt(input2_4);

	                String input3_4 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c4 = Double.parseDouble(input3_4);

	                double resultado4 = 0.0;

	                switch (d) {
	                    case 1:
	                        resultado4 = (c4 - 459) * 5 / 9;
	                        break;
	                    case 2:
	                        resultado4 = c4 - 459;
	                        break;
	                    case 3:
	                        resultado4 = c4 * 5 / 9;
	                        break;
	                }

	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado4);
	                break;
	        }
	    }
	    public static void velocidades() {
	        String input1 = JOptionPane.showInputDialog("Elige la unidad que deseas convertir:\n" +
	                "1 -> m/s\n" +
	                "2 -> Km/h\n" +
	                "3 -> mph");
	        int opc2 = Integer.parseInt(input1);

	        switch (opc2) {
	            case 1:
	                String input2_1 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> Km/h\n" +
	                        "2 -> mph");
	                int a = Integer.parseInt(input2_1);
	                String input3_1 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c1 = Double.parseDouble(input3_1);
	                double resultado1 = 0.0;
	                switch (a) {
	                    case 1:
	                        resultado1 = c1 * 3.6;
	                        break;
	                    case 2:
	                        resultado1 = c1 * 2.237;
	                        break;
	                }
	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado1);
	                break;
	            case 2:
	                String input2_2 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> m/s\n" +
	                        "2 -> mph");
	                int b = Integer.parseInt(input2_2);
	                String input3_2 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c2 = Double.parseDouble(input3_2);
	                double resultado2 = 0.0;
	                switch (b) {
	                    case 1:
	                        resultado2 = c2 / 3.6;
	                        break;
	                    case 2:
	                        resultado2 = c2 / 1.609;
	                        break;
	                }
	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado2);
	                break;
	            case 3:
	                String input2_3 = JOptionPane.showInputDialog("Elige a que unidad deseas convertirlo:\n" +
	                        "1 -> m/s\n" +
	                        "2 -> Km/h");
	                int c = Integer.parseInt(input2_3);
	                String input3_3 = JOptionPane.showInputDialog("Ingrese lo que desea convertir");
	                double c3 = Double.parseDouble(input3_3);
	                double resultado3 = 0.0;
	                switch (c) {
	                    case 1:
	                        resultado3 = c3 * 2.237;
	                        break;
	                    case 2:
	                        resultado3 = c3 * 1.609;
	                        break;
	                }
	                JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado3);
	                break;
	        }
	    }
//RECTAS-------------------------------------------------------------------------------------------------------------
	    public static void  DistanciaPuntos ( ){
	        double numx1 = CoordenadaX1();
	        double numy1 = CoordenadaY1();
	        double numx2 = CoordenadaX2();
	        double numy2 = Coordenaday2();
	    
	        double dentro = ( numx1-numx2 )*(numx1-numx2)+(numy1-numy2)*(numy1-numy2);
	        double distancia = Math.sqrt(dentro);
	        
	        JOptionPane.showMessageDialog(null, "La distancia es √" + dentro + " = " + distancia);
	        
	    }
	    public static void  Pendiente(){
	        double numx1 = CoordenadaX1();
	        double numy1 = CoordenadaY1();
	        double numx2 = CoordenadaX2();
	        double numy2 = Coordenaday2();
	        double restaa=numy1-numy2;
	        double restab=numx1-numx2;
	        double respuesta = restaa/restab;
	        JOptionPane.showMessageDialog(null, "La pendiente es " + restaa + "/" +restab+"="+respuesta);
	        
	    }
	    public static double CoordenadaX1(){
	        String x1 = JOptionPane.showInputDialog("ingrese la primera coordenada (x)");
	        return Double.parseDouble(x1);
	    }
	     public static double CoordenadaY1(){
	        String y1 = JOptionPane.showInputDialog("ingrese la primera coordenada (y)");
	        return Double.parseDouble(y1);
	    }
	      public static double CoordenadaX2(){
	        String x2 = JOptionPane.showInputDialog("ingrese la segundacoordenada (x)");
	        return Double.parseDouble(x2);
	    }
	       public static double Coordenaday2(){
	        String y2 = JOptionPane.showInputDialog("ingrese la segunda coordenada (y)");
	        return Double.parseDouble(y2);
	    }
//DISTANCIA A LAS RECTAS DESDE UN PUNTO----------------------------------------------------------------------------------------------
	       public static double resolucionDistanciaPuntoRecta(double Xo, double Yo, double X1, double Y1,double X2, double Y2) {
	    	   double numerador = Math.abs((Y2 - Y1) * Xo - (X2 - X1) * Yo + X2 * Y1 - Y2 * X1);
	    	   double denominador = Math.sqrt(Math.pow(Y2 - Y1, 2) + Math.pow(X2 - X1, 2));
	    	   return numerador / denominador;
}

	public static void distanciaPuntoRecta() {
	String inputXo = JOptionPane.showInputDialog(null, "Ingrese la coordenada X del punto:", "Punto",
		JOptionPane.INFORMATION_MESSAGE);
	double Xo = Double.parseDouble(inputXo);

	String inputYo = JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del punto:", "Punto",
		JOptionPane.INFORMATION_MESSAGE);
	double Yo = Double.parseDouble(inputYo);

	String inputX1 = JOptionPane.showInputDialog(null, "Ingrese la coordenada X del primer punto que define la recta:", "Punto",
		JOptionPane.INFORMATION_MESSAGE);
	double X1 = Double.parseDouble(inputX1);

	String inputY1 = JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del primer punto que define la recta:", "Punto",
			JOptionPane.INFORMATION_MESSAGE);
	double Y1 = Double.parseDouble(inputY1);

	String inputX2 = JOptionPane.showInputDialog(null, "Ingrese la coordenada X del segundo punto que define la recta:", "Punto",
		JOptionPane.INFORMATION_MESSAGE);
	double X2 = Double.parseDouble(inputX2);

	String inputY2 = JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del segundo punto que define la recta:", "Punto",
		JOptionPane.INFORMATION_MESSAGE);
	double Y2 = Double.parseDouble(inputY2);

	double distancia = resolucionDistanciaPuntoRecta(Xo, Yo, X1, Y1, X2, Y2);

	JOptionPane.showMessageDialog(null, "La distancia del punto a la recta es: " + distancia, "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
// VECTORES----------------------------------------------------------------------------------------------------------
	static void ProductoEscalar(){
        String a = JOptionPane.showInputDialog("VECTOR 1\n"+ "X1:");
        double x1 = Double.parseDouble(a);
        String  b = JOptionPane.showInputDialog("VECTOR 1\n"+ "Y1:");
        double y1 = Double.parseDouble(b);
        String  c = JOptionPane.showInputDialog("VECTOR 2\n"+ "X2:");
        double x2 = Double.parseDouble(c);
        String  d = JOptionPane.showInputDialog("VECTOR 2\n"+ "Y2:");
        double y2 = Double.parseDouble(d);
        double productoEscalar = (x1 * x2 + y1 * y2);
        JOptionPane.showMessageDialog(null,"El producto escalar es " + productoEscalar);
    }

    static void ProductoPorEscalar(){
        String a = JOptionPane.showInputDialog("VECTOR 1\n"+ "X1:");
        double x = Double.parseDouble(a);
        String  b = JOptionPane.showInputDialog("VECTOR 1\n"+ "Y1:");
        double y = Double.parseDouble(b);
        String escalar = JOptionPane.showInputDialog("Escalar:");
        double k = Double.parseDouble(escalar);
        JOptionPane.showMessageDialog(null,"El producto es " + "(" + k*x + ","+ k*y +")");
    }

    public static void AnguloDeVectores(){
        String a = JOptionPane.showInputDialog("VECTOR 1\n"+ "X1:");
        double x1 = Double.parseDouble(a);
        String  b = JOptionPane.showInputDialog("VECTOR 1\n"+ "Y1:");
        double y1 = Double.parseDouble(b);
        String  c = JOptionPane.showInputDialog("VECTOR 2\n"+ "X2:");
        double x2 = Double.parseDouble(c);
        String  d = JOptionPane.showInputDialog("VECTOR 2\n"+ "Y2:");
        double y2 = Double.parseDouble(d);
        double productoEscalar = x1 * x2 + y1 * y2 ;
        double modulo1 = Math.sqrt(x1 * x1 + y1 * y1 );
        double modulo2 = Math.sqrt(x2 * x2 + y2 * y2 );

        double coseno = productoEscalar / (modulo1 * modulo2);
        double anguloRad = Math.acos(coseno);
        double angulo = Math.toDegrees(anguloRad);
        JOptionPane.showMessageDialog(null,"El ángulo es " + Math.round(angulo) +" grados");
    }

    static void SumaDeVectores(){
        String cant = JOptionPane.showInputDialog("Número de vectores:");
        int x, y, sumx = 0, sumy = 0;
        int n = Integer.parseInt(cant);
        for(int i = 1; i <= n; i++){
            String a = JOptionPane.showInputDialog("Vector "+i +"\n x"+i+":");
            x = Integer.parseInt(a);
            sumx += x;
            String b = JOptionPane.showInputDialog("Vector "+i +"\n y"+i+":");
            y = Integer.parseInt(b);
            sumy += y;

        }
        JOptionPane.showMessageDialog(null,"La suma es " + "("+sumx+","+sumy+")");
    }

    static void Componente(){
        JOptionPane.showMessageDialog(null,"Nota: Componente de U sobre V" );
        String a = JOptionPane.showInputDialog("VECTOR U\n"+ "X1:");
        double x1 = Double.parseDouble(a);
        String  b = JOptionPane.showInputDialog("VECTOR U\n"+ "Y1:");
        double y1 = Double.parseDouble(b);
        String  c = JOptionPane.showInputDialog("VECTOR V\n"+ "X2:");
        double x2 = Double.parseDouble(c);
        String  d = JOptionPane.showInputDialog("VECTOR V\n"+ "Y2:");
        double y2 = Double.parseDouble(d);
        double productoEscalar = (x1 * x2 + y1 * y2);
        double moduloDeV = Math.sqrt(x2*x2 + y2*y2);
        double k = productoEscalar/moduloDeV;
        JOptionPane.showMessageDialog(null,"El componente es " + k);



    }
    static void Proyeccion(){
        JOptionPane.showMessageDialog(null,"Nota: Proyeccion de U sobre V" );
        String a = JOptionPane.showInputDialog("VECTOR U\n"+ "X1:");
        double x1 = Double.parseDouble(a);
        String  b = JOptionPane.showInputDialog("VECTOR U\n"+ "Y1:");
        double y1 = Double.parseDouble(b);
        String  c = JOptionPane.showInputDialog("VECTOR V\n"+ "X2:");
        double x2 = Double.parseDouble(c);
        String  d = JOptionPane.showInputDialog("VECTOR V\n"+ "Y2:");
        double y2 = Double.parseDouble(d);
        double productoEscalar = (x1 * x2 + y1 * y2);
        double cuadradoDeModuloDeV =  x2 * x2 + y2 * y2;
        double k = productoEscalar/cuadradoDeModuloDeV;

        JOptionPane.showMessageDialog(null,"La proyección es " +"("+k*x2+" , "+k*y2+")");



    }

    public static void vectores(){
    	String repetir = "SI";
		while(repetir.equals("SI")) {
			String input = JOptionPane.showInputDialog("CALCULOS DE VECTORES R2\n" +
													   "1. Producto Escalar\n" +
													   "2. Producto por un escalar \n" +
													   "3. Ángulo entre 2 vectores \n" +
                                                       "4. Suma de vectores \n" +
                                                       "5. Componente \n" +
                                                       "6. Proyección \n"
                                                       );
			int opc1 = Integer.parseInt(input);
			switch(opc1) {
				case 1: 
					ProductoEscalar();
					break;
				case 2:
					ProductoPorEscalar();
					break;
				case 3:
					AnguloDeVectores();
					break;
                case 4:
					SumaDeVectores();
					break;
                case 5:
					Componente();
					break;
                case 6:
					Proyeccion();
					break;   
			}
			repetir = JOptionPane.showInputDialog("¿Desea hacer otra conversión? (SI o NO)").toUpperCase();
		}
    }
}
