public class Figuras_2D {
    int nLados;//número de lados
    float lado;//longitud de lado
    //setea los atributos de  inicio
    public Figuras_2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;}

    public Figuras_2D(float lado) {
        this.lado = lado;}

    public Figuras_2D(int nLados) {
        this.nLados = nLados;}

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

    public float areaCuadrado(){};
    private float perimetroCuadrado(){};
}
