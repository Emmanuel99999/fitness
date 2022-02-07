import java.util.Scanner; 
//autor EMMANUEL ÁLVAREZ 
//programa: simple programa con funciones fitness, se calcula el IMC, la cantidad de agua a ingerir por día y el metabolismo basal
//se aplicará el metodo incremental añadiendo mejoras continuamente, pero con un producto ya funcional

public class main {
    public static void main(String[]args) 
    {
        double altura;   //para los valores numericos se eligió el double como tipo común para evitar conversiones innecesarias ya que los resultados son double
        double peso;
        double edad;
        double metaBasal;
        String opcion; //estas opciones facilmente pueden usarse con char, es algo para mejorar y optimizar un poco
        String sexo; 
        Scanner input = new Scanner(System.in);
        System.out.println("¿que deseas realizar?, ingresa 1 para calcular tu I.M.C., ingresa 2 para calcular tu ingesta diaria de agua, ingresa 3 para calcular tu metabolismo basal");
        opcion= input.nextLine();
        // son pocas opciones pero un switch quedaría mejor, para mejorar en proximas versiones
        if (opcion.equals("1"))//formula basica para determinar el IMC de una persona , se redondea a dos decimales (aunque algunas veces solo sale un decimal)
        {
            System.out.println("ingresa tu altura en centimetros");
            altura= input.nextDouble();
            System.out.println("ingresa tu peso en kilos");
            peso=input.nextDouble();
            System.out.println("tu I.M.C. es "+Math.round((10000*(peso/(Math.pow(altura,2))))*100d)/100d); //sería más sencillo multiplicar la altura x2, pero se usa Math para ejercitar el uso de estas herramientas
        }
        else if (opcion.equals("2")) //opción para determinar el rango de consumo de agua por peso a razón de 14-28 onzas por libra
        {
            System.out.println("ingresa tu peso en kilos");
            peso= input.nextDouble();
            System.out.println("debes tomar entre "+(Math.round(((peso/452)*14)*1000d)/1000d)+"y "+(Math.round(((peso/452)*28)*1000d)/1000d)+" litros de agua a lo largo de todo el día!"); 

        }    
        else if (opcion.equals("3"))//se usa la formula harris-benedict 
        {
            System.out.println("ingresa tu peso en kilos");
            peso=input.nextDouble();
            System.out.println("ingresa tu altura en centimetros");
            altura=input.nextDouble();
            System.out.println("ingresa tu edad en años");
            edad=input.nextDouble();
            System.out.println("ingresa tu sexo M/F");//el valor sexo es importante pues la formula cambia entre hombres y mujeres, se usa la opción M/F por ser más universal que otras como H/M
            sexo=input.next();
            sexo= sexo.toUpperCase();//se convierte la respuesta a mayusculas para que reciba tanto mayusculas como minusculas y reducir errores
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
           else 
           {
            System.out.println("selecciona una opción valida");
           }
        } 
        else
        {
        System.out.println("selecciona una opción valida");   
        }   
        }
        
    }