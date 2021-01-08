package com.clases;

public class BeneficiosCovid19 {

    private String id;
    private String nombre;
    private Float valorSubsidio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getValorSubsidio() {
        return valorSubsidio;
    }

    public void setValorSubsidio(Float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(float beneficio1, float beneficio2){
        if(beneficio1 > beneficio2){
            return Float.valueOf(beneficio1);
        }
        else{
            return Float.valueOf(beneficio2);
        }

    }
}
