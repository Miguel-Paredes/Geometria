public class Figuras_2D {
    private int nLados;//número de lados
    private float lado;//longitud de lado

    //Constructor
    //setea los atributos de  inicio
    public Figuras_2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;}

    public Figuras_2D(float lado) {
        this.lado = lado;}

    public Figuras_2D(int nLados) {
        this.nLados = nLados;}

    //Setters y Getters
    //retorna la variable
    public int getnLados() {
        return nLados;}

    //setea la variable
    public void setnLados(int nLados) {
        this.nLados = nLados;}

    public float getLado() {
        return lado;}

    public void setLado(float lado) {
        this.lado = lado;}

    public float areaCuadrado(int lado){
        return this.lado*this.lado;
    };
    private float perimetroCuadrado(){
        return 0;
    };
    public float areaTriangulo() {
        return 0;
    };
    private float perimetroTriangulo(){
        return 0;
    };
    /*public float areaCuadrado(){};
    private float perimetroCuadrado(){};
    public float areaCuadrado(){};
    private float perimetroCuadrado(){};*/
}
