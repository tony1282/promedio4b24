public class estudiante {
    private String matricula;
    private String nombre;
    private String estructuras;
    private String evaluacion;
    private String ingles;
    private Double promedio;
 
    //constrictor es contruir e inicializar el objeto 
    //getters consultar
    //sett agregar 
    public estudiante (String m, String n){
        //el objetivo es inicializar 
        this.matricula = m;
        this.nombre = n; 
    }//getters y Setters
    //Get es un metodo consultor
    //set metodo modificador
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstructuras() {
        return estructuras;
    }
    public void setEstructuras(String estructuras) {
        this.estructuras = estructuras;
    }
    public String getEvaluacion() {
        return evaluacion;
    }
    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }
    public String getIngles() {
        return ingles;
    }
    public void setIngles(String ingles) {
        this.ingles = ingles;
    }
    public Double getPromedio() {
        return promedio;
    }
    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    
    


}

