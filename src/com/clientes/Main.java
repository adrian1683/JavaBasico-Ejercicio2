package com.clientes;

import com.clases.BeneficiosCovid19;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main metodos = new Main();
        String idBeneficio1 = metodos.getIdBeneficio();
        String idBeneficio2 = metodos.getIdBeneficio();

        BeneficiosCovid19 beneficio1 = new BeneficiosCovid19();
        BeneficiosCovid19 beneficio2 = new BeneficiosCovid19();

        beneficio1.setId(idBeneficio1);
        beneficio1.setNombre("Subsidio económico para personas que perdieron su empleo por COVID19");
        beneficio1.setValorSubsidio(250000f);

        beneficio2.setId(idBeneficio2);
        beneficio2.setNombre("Subsidio económico para personas de tercera edad");
        beneficio2.setValorSubsidio(160000f);

        List<BeneficiosCovid19> listaBeneficio1 = new ArrayList<>();
        List<BeneficiosCovid19> listaBeneficio2 = new ArrayList<>();

        listaBeneficio1.add(beneficio1);
        listaBeneficio2.add(beneficio2);

        metodos.reporteLista(listaBeneficio1,listaBeneficio2);

    }

    public void reporteLista(List<BeneficiosCovid19> a, List<BeneficiosCovid19> b){
        System.out.println("REPORTE DE COMPARACIÓN DE BENEFICIOS POR COVID19");
        System.out.println("------------------------------------------------");
        BeneficiosCovid19 ben = new BeneficiosCovid19();
        for(int i=0; i<a.size(); i++){
            for(int j=0; j<b.size(); j++){
                if(a.get(i).getId().equals(b.get(j).getId())){
                    System.out.println("Los IDs de los beneficios son iguales");
                    System.out.println(a.get(i).getId());
                    System.out.println(" ");
                }
                else{
                    System.out.println("Beneficios recibidos por la pandemia - COVID19 -:");
                    System.out.println(a.get(i).getId() + " : " + a.get(i).getNombre());
                    System.out.println(b.get(j).getId() + " : " + b.get(j).getNombre());
                    System.out.println(" ");
                }
                if(a.get(i).getNombre().equals(b.get(j).getNombre())){
                    System.out.println("El beneficio es el mismo, aunque tengan diferente ID");
                    System.out.println(a.get(i).getId() + " : " + a.get(i).getNombre());
                    System.out.println(b.get(j).getId() + " : " + b.get(j).getNombre());
                    System.out.println(" ");
                }
                else{
                    System.out.println("Los beneficios son:");
                    System.out.println(a.get(i).getNombre());
                    System.out.println(b.get(j).getNombre());
                    System.out.println(" ");
                }
                if (a.get(i).getValorSubsidio().equals(b.get(j).getValorSubsidio())){
                    System.out.println("El valor del subsidio es igual en ambos beneficios");
                    System.out.println("$"+a.get(i).getValorSubsidio() + " para " + a.get(i).getNombre());
                    System.out.println("$"+a.get(i).getValorSubsidio() + " para " + b.get(j).getNombre());
                    System.out.println(" ");
                }
                else{
                    System.out.println("Valor recibido por beneficio:");
                    System.out.println("$"+a.get(i).getValorSubsidio() + " para " + a.get(i).getNombre());
                    System.out.println("$"+b.get(j).getValorSubsidio() + " para " + b.get(j).getNombre());
                    System.out.println(" ");
                    System.out.println("El mejor beneficio tiene un valor de: ");
                    Float mejorBen = ben.getMejorbeneficios(a.get(i).getValorSubsidio(),b.get(j).getValorSubsidio());
                    System.out.println("$"+mejorBen);
                }
            }
        }
    }

    private String getIdBeneficio(){

        int numero = (int)(10000 * Math.random());

        String numeroFinal = "" + numero;

        for(int i = numeroFinal.length(); i < 4; i++){
            numeroFinal = numeroFinal.concat("0");
        }
        return numeroFinal;
    }
}
