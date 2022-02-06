import java.util.Scanner; 
public class main {
    public static void main(String[]args) 
    {
        double altura;
        double peso;
        double edad;
        double metaBasal;
        String opcion;
        String sexo;
        Scanner input = new Scanner(System.in);
        System.out.println("que deseas realizar?, ingresa 1 para calcular tu I.M.C., ingresa 2 para calcular tu ingesta diaria de agua, ingresa 3 para calcular tu metabolismo basal");
        opcion= input.nextLine();
        
        if (opcion.equals("1"))
        {
            System.out.println("ingresa tu altura en centimetros");
            altura= input.nextDouble();
            System.out.println("ingresa tu peso en kilos");
            peso=input.nextDouble();
            System.out.println("tu I.M.C. es "+(10000*(peso/(Math.pow(altura,2))))); //TODO REDONDEAR A DOS DECIMALES, CLASIFICAR TIPO DE PESO SEGÚN RESULTADO (NESTED IF?)
        }
        else if (opcion.equals("2"))
        {
            System.out.println("ingresa tu peso en kilos");
            peso= input.nextDouble();
            System.out.println("debes tomar entre "+((peso/452)*14)+"y "+((peso/452)*28)+"litros de agua a lo largo de todo el día!"); //TODO, REDONDEAR A 3 DECIMALES

        }    
        else if (opcion.equals("3"))
        {
            System.out.println("ingresa tu peso en kilos");
            peso=input.nextDouble();
            System.out.println("ingresa tu altura en centimetros");
            altura=input.nextDouble();
            System.out.println("ingresa tu edad en años");
            edad=input.nextDouble();
            System.out.println("ingresa tu sexo M/F");//TODO ACEPTAR MINUSCULAS
            sexo=input.next();
            if (sexo.equals("M"))
            {
            metaBasal= ((10*peso)+(6.25*altura)-(5*edad)+5);
            System.out.println("tu metabolismo basal es de "+ metaBasal +" calorías por día");
            }
            else if(sexo.equals("F"))
            {
            metaBasal= ((10*peso)+(6.25*altura)-(5*edad)-161);
            System.out.println("tu metabolismo basal es de "+ metaBasal +" calorías por día");
            }
        }
        }
    }