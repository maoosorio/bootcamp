public class Coche {
    public static void main(String[] args){
        Carro cocheNuevo = new Carro();
        cocheNuevo.sumarPuerta();
        System.out.println(cocheNuevo.puertas);
    }
    static class Carro{
        public int puertas = 0;

        public void sumarPuerta(){
            this.puertas++;
        }
    }
}
