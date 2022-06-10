/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesion_fibonacci;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Espinoza
 */
public class Servicio {

    public static void crearVentana() {
        Ventana ventana = new Ventana();
//        //                     x    y 
        ventana.setBounds(0, 0, 825, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public static String[] calculos(String entrada) {
        double a = 0;
        double b = 1;
        double c;
        int i = 0;
        int contador = 0;
        String resultado;
        String ultimo;
        String resultadoString = "";
        String var ;
        int hasta;
        hasta = Integer.parseInt(entrada);
        String[] mostrar = new String[12];
        NumberFormat nf = new DecimalFormat("##.###");

        while (contador < hasta - 1) {
            var = nf.format(a);
            resultadoString += (new BigDecimal(var).toPlainString()) + ", ";
            c = a + b;
            a = b;
            b = c;
            if (resultadoString.length() <= 115) {
                mostrar[i] = resultadoString;
            } else {
                resultadoString = (new BigDecimal(var).toPlainString()) + ", ";
                i++;
            }
            contador++;
        }
        var = nf.format(a);
        ultimo = (new BigDecimal(var).toPlainString());
        resultado = mostrar[i] + ultimo;
        if (resultado.length() <= 115) {
            mostrar[i] += ultimo;
        }
        return mostrar;
    }
}
