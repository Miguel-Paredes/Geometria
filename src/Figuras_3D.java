public class Figuras_3D {
    private int nLados;//número de lados
    private float longitud;// del lado
    private float base;//longitud del base
    private float altura;//longitud altura
    public float volumen;
    private float radio;

    //constructor

    public Figuras_3D(int nLados, float longitud, float base, float altura, float volumen, float radio) {
        this.nLados = nLados;
        this.longitud = longitud;
        this.base = base;
        this.altura = altura;
        this.volumen = volumen;
        this.radio = radio;
    }
    //setters and getters


    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
