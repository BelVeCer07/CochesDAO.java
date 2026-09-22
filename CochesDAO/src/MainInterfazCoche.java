import java.util.Scanner;

public class MainInterfazCoche{
    static Scanner sc = new Scanner(System.in);

    public void main() throws Exception{
        IO.println("ELIGE UNA YAYAYAAY(LOCAL-1 | REMOTO-2)");
        int elige = sc.nextInt();

        InterfazCarDAO dao;
        String ruta = "Coches.txt";
        if(elige==1){
            dao = new LocarCarDAO(ruta);
        }else{
            dao = new RemoteCarDAO(ruta);
        }
    }

    public static void concesionario(In)
}