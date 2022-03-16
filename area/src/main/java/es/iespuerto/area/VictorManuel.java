package es.iespuerto.area;


/**
 * Clase creada para realizar calculo del area
 * mediante dos valores.
 * @version 1.0.0
 * @author Victor Manuel Cabrera Abreu
 */
public class VictorManuel {
    private String tipo;
    private Integer valor1;
    private Integer valor2; 
    
    /**
     * Metodo que regresa el tipo de figura.
     * @return Regresa tipo de figura.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo que asigna un tipo de figura.
     * @param tipo Nombre de la figura.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo que regresa el primer valor.
     * @return Regresa el primer valor
     */
    public Integer getValor1() {
        return valor1;
    }

    /**
     * Metodo que asigna un parametro al primer valor.
     * @param valor1 Parametro del valor 1.
     */
    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    /**
     * Metodo que regresa el segundo valor.
     * @return Regresa el segundo valor
     */
    public Integer getValor2() {
        return valor2;
    }

    /**
     * Metodo que asigna un parametro al segundo valor.
     * @param valor1 Parametro del valor 2.
     */
    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    /**
     * Constructor por defecto de la clase.
     */
    public VictorManuel() {
    }

    /**
     * Constructor de la clase la cual recibe solo parametro.
     * @param valor1 Valor del parametro para el calculo de area.
     */
    public VictorManuel(Integer valor1) {
        this.valor1 = valor1;
    }

    /**
     * Constructor de la clase la cual recibe dos parametros.
     * @param valor1 Primer valor del parametro para el calculo de area.
     * @param valor2 Segundo valor del parametro para el calculo de area.
     */
    public VictorManuel(Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Metodo que calcula el area de la figura
     * @param valor1 Primer valor del parametro para el calculo de area.
     * @param valor2 Segundo valor del parametro para el calculo de area.
     * @return El area de la figura
     */
    public Integer calculoArea(Integer valor1, Integer valor2) {
        Integer area=valor1*valor2;
        return area;
    }

    

}
