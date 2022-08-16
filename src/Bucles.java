public class Bucles {
    public static void main(String[] args){
        System.out.println("=====IF====");
        int numeroIf = -90;
        if(numeroIf < 0 ){
            System.out.println("Es negativo");
        }else if(numeroIf == 0){
            System.out.printf("Es 0");
        }else{
            System.out.println("Es positivo");
        }
        System.out.println("=====WHILE====");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("=====DO-WHILE====");
        int numeroWhilee = 3;
        do{
            System.out.println(numeroWhilee);
            numeroWhilee++;
        }
        while(numeroWhilee < 3);
        System.out.println("=====FOR====");
        for(int numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("=====SWITCH====");
        var estacion = "INVIERNO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println(estacion);
        }
    }
}
