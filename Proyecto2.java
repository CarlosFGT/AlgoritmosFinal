package proyecto2;
import java.util.Scanner;

/**
 *
 * @author Carlos Flores
 */
public class Proyecto2 {
 static Scanner principal=new Scanner (System.in);
    /**
    Se ingresan los datos del objeto
     */
    public static void main(String[] args) {

        
        // INICIO DEL PROGRAMA
          int opciones=0;
          do{
       
        System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de Estudiantes");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Selecciona porfavor uno de los numeros que se presentan a continuación");
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Analisis de datos");
        System.out.println("3. Salir");
        String cadena =  new String();
        System.out.println("Ingrese una opción: ");
       
        opciones=principal.nextInt();
          switch(opciones){
          case 1:
              ingreso_de_datos();
                          break;
          case 2:
              analisis_de_datos();
                          break;
          case 3:
              salir();
              break;
              
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
        } 
          while(opciones!=3);   }
    
//Siguiente paso cuando se selecciona una opción dentro del programa.
    
    static void ingreso_de_datos(){
                System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de Estudiantes");
        System.out.println("Ingreso de datos");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        // DATOS PERSONALES
         System.out.println("");       
        System.out.println("{\"nombres\" : \"Sofia Isabel \", \"apellidos\" : \"De La Cruz Ortiz\","
                + " \"carne\" : \"7590-21-12345\", \"edad\" : 19, \"sexo\" : \"femenino\", "
                + "\"carrera\" : \"Ingeniería en Ciencias y Sistemas\", \"totalCreditos\" : 100, "
                + "\"cantidadCursosAprobados\" : 25, \"cursosAprobados\" : [{\"semestre\" : 2, "
                + "\"nombre\" : \"Algoritmos\", \"codigo\" : \"008\", \"zona\" : 21, "
                + "\"examenFinal\" : 40, \"fecha\" : \"18/11/2021\" }, {\"semestre\" : 2, "
                + "\"nombre\" : \"Precálculo\", \"codigo\" : \"006\", \"zona\" : 30, "
                + "\"examenFinal\" : 30, \"fecha\" : \"25/11/2021\" }, {\"semestre\" : 2,"
                + " \"nombre\" : \"Contabilidad 2\", \"codigo\" : \"009\", \"zona\" : 25, "
                + "\"examenFinal\" : 40, \"fecha\" : \"18/11/2021\" }] , "
                + "\"cursosReprobados\" : [{\"semestre\" : 1, \"nombre\" : "
                + "\"Lógica de Sistemas\", \"codigo\" : \"008\", \"zona\" : 19,"
                + " \"examenFinal\" : 0, \"fecha\" : \"15/06/2021\" }, "
                + "{\"semestre\" : 1, \"nombre\" : \"Desarrollo Humano y Profesional\", "
                + "\"codigo\" : \"001\", \"zona\" : 30, \"examenFinal\" : 24, \"fecha\" : \"23/06/2021\"}]}"
                + ""
                + "{\"nombres\" : \"Roberto Estuardo  \", \"apellidos\" : \"Gomez Bolaños\","
                + " \"carne\" : \"7590-21-12355\", \"edad\" : 22, \"sexo\" : \"masculino\", "
                + "\"carrera\" : \"Ingeniería en Ciencias y Sistemas\", \"totalCreditos\" : 104, "
                + "\"cantidadCursosAprobados\" : 25, \"cursosAprobados\" : [{\"semestre\" : 2, "
                + "\"nombre\" : \"Algoritmos\", \"codigo\" : \"008\", \"zona\" : 25, "
                + "\"examenFinal\" : 45, \"fecha\" : \"18/11/2021\" }, {\"semestre\" : 2, "
                + "\"nombre\" : \"Precálculo\", \"codigo\" : \"006\", \"zona\" : 30, "
                + "\"examenFinal\" : 30, \"fecha\" : \"25/11/2021\" }, {\"semestre\" : 2,"
                + " \"nombre\" : \"Contabilidad 2\", \"codigo\" : \"009\", \"zona\" : 20, "
                + "\"examenFinal\" : 35, \"fecha\" : \"18/11/2021\" }] , "
                + "\"cursosReprobados\" : [{\"semestre\" : 1, \"nombre\" : "
                + "\"Lógica de Sistemas\", \"codigo\" : \"008\", \"zona\" : 20,"
                + " \"examenFinal\" : 20, \"fecha\" : \"15/06/2021\" }, "
                + "{\"semestre\" : 1, \"nombre\" : \"Desarrollo Humano y Profesional\", "
                + "\"codigo\" : \"001\", \"zona\" : 34, \"examenFinal\" : 20, \"fecha\" : \"23/06/2021\"}]}"
                
               +""
                +"{\\\"nombres\\\" : \\\"Juan Gabriel   \\\", \\\"apellidos\\\" : \\\"Fernandez\\\",\"\n" +
"carne\\\" : \\\"7590-21-12356\\\", \\\"edad\\\" : 19, \\\"sexo\\\" : \\\"masculino\\\", \"\n" +
"\\\"carrera\\\" : \\\"Ingeniería en Ciencias y Sistemas\\\", \\\"totalCreditos\\\" : 100, \"\n" +
"\\\"cantidadCursosAprobados\\\" : 25, \\\"cursosAprobados\\\" : [{\\\"semestre\\\" : 2, \"\n" +
"\\\"nombre\\\" : \\\"Algoritmos\\\", \\\"codigo\\\" : \\\"008\\\", \\\"zona\\\" : 25, \"\n" +
"\\\"examenFinal\\\" : 45, \\\"fecha\\\" : \\\"18/11/2021\\\" }, {\\\"semestre\\\" : 2, \"\n" +
"\\\"nombre\\\" : \\\"Precálculo\\\", \\\"codigo\\\" : \\\"006\\\", \\\"zona\\\" : 31, \"\n" +
"\\\"examenFinal\\\" : 29, \\\"fecha\\\" : \\\"25/11/2021\\\" }, {\\\"semestre\\\" : 2,\"\n" +
" \\\"nombre\\\" : \\\"Contabilidad 2\\\", \\\"codigo\\\" : \\\"009\\\", \\\"zona\\\" : 10, \"\n" +
"\\\"examenFinal\\\" : 0, \\\"fecha\\\" : \\\"18/11/2021\\\" }] , \"\n" +
"\\\"cursosReprobados\\\" : [{\\\"semestre\\\" : 1, \\\"nombre\\\" : \"\n" +
"\\\"Lógica de Sistemas\\\", \\\"codigo\\\" : \\\"008\\\", \\\"zona\\\" : 25,\"\n" +
" \\\"examenFinal\\\" : 19, \\\"fecha\\\" : \\\"15/06/2021\\\" }, \"\n" +
"{\\\"semestre\\\" : 1, \\\"nombre\\\" : \\\"Desarrollo Humano y Profesional\\\", \"\n" +
"\\\"codigo\\\" : \\\"001\\\", \\\"zona\\\" : 29, \\\"examenFinal\\\" : 10, \\\"fecha\\\" : \\\"23/06/2021\\\"}]}\""
                 +""
                +" \"{\\\"nombres\\\" : \\\"Astrid Elena   \\\", \\\"apellidos\\\" : \\\"Herrera Castro\\\",\"\n" +
"carne\\\" : \\\"7590-21-12357\\\", \\\"edad\\\" : 19, \\\"sexo\\\" : \\\"femenino\\\", \"\n" +
"carrera\\\" : \\\"Ingeniería en Ciencias y Sistemas\\\", \\\"totalCreditos\\\" : 104, \"\n" +
"cantidadCursosAprobados\\\" : 25, \\\"cursosAprobados\\\" : [{\\\"semestre\\\" : 2, \"\n" +
"nombre\\\" : \\\"Algoritmos\\\", \\\"codigo\\\" : \\\"008\\\", \\\"zona\\\" : 20, \"\n" +
"examenFinal\\\" : 35, \\\"fecha\\\" : \\\"18/11/2021\\\" }, {\\\"semestre\\\" : 2, \"\n" +
"nombre\\\" : \\\"Precálculo\\\", \\\"codigo\\\" : \\\"006\\\", \\\"zona\\\" : 20, \"\n" +
"examenFinal\\\" : 19, \\\"fecha\\\" : \\\"25/11/2021\\\" }, {\\\"semestre\\\" : 2,\"\n" +
"nombre\\\" : \\\"Contabilidad 2\\\", \\\"codigo\\\" : \\\"009\\\", \\\"zona\\\" : 10, \"\n" +
"examenFinal\\\" : 0, \\\"fecha\\\" : \\\"18/11/2021\\\" }] , \"\n" +
"cursosReprobados\\\" : [{\\\"semestre\\\" : 1, \\\"nombre\\\" : \"\n" +
"Lógica de Sistemas\\\", \\\"codigo\\\" : \\\"008\\\", \\\"zona\\\" : 25,\"\n" +
"examenFinal\\\" : 19, \\\"fecha\\\" : \\\"15/06/2021\\\" }, \"\n" +
"semestre\\\" : 1, \\\"nombre\\\" : \\\"Desarrollo Humano y Profesional\\\", \"\n" +
"codigo\\\" : \\\"001\\\", \\\"zona\\\" : 29, \\\"examenFinal\\\" : 15, \\\"fecha\\\" : \\\"23/06/2021\\\"}]}\""
        );
              System.out.println("¿Desea agregar otro estudiante?(1 = Si /2 = No)");
       
              int opcionveh = principal.nextInt();
    switch(opcionveh)
        {
            case 1:
                 datosestudiantenuevo();
                break;
            case 2:
                menup();
                break;
            default:
                System.out.println("Escoja bien su respuesta");
        } 
                       }
      
      static void salir(){
         System.out.println(
                ""+
                "Gracias por su ingresar a los estudiantes, esperamos verlo nuevamente");
                       
   /* Aquí vemos si el catedratico desea salir también tenemos
la opción para que el decida cual opción escoger y de esta forma
se terminara el programa o seguimos ingresando alumnos   
    */
   

    }
    
      static void analisis_de_datos(){
         System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de estudiantes");
        System.out.println("Analisis de datos");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("Selecciona porfavor uno de los numeros que se presentan a continuación");
        System.out.println("1. Datos personales de estudiantes");
        System.out.println("2. Cantidad de estudiantes masculinos y femeninos");
        System.out.println("3. Mejor promedio de cada carrera");
        System.out.println("4. Datos academicos de estudiantes");
        System.out.println("5. Constancia de cursos aprobados");
        System.out.println("6. Salir");
        String cadenaanalisis =  new String();
       
        System.out.println("Ingrese una opción: ");
     int opcionana = principal.nextInt();
             switch(opcionana)
        {
            case 1:
                 datospersonalesestudiantes();
                break;
                case 2:
                 cantidadestudiantes();
                break;
                case 3:
                 mejorpromedio();
                break;
                case 4:
                 datosacademicos();
                break;
                case 5:

                    constanciacursosaprobados();
                break;
            case 6:
                salir();
                break;
            default:
                System.out.println("Escoja bien su respuesta");
        } 
                       }
      
 
    private static void menup() {
          // INICIO DEL PROGRAMA
          int opciones=0;
          do{
       
        System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de Estudiantes");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Selecciona porfavor uno de los numeros que se presentan a continuación");
        System.out.println("1. Ingreso de datos");
        System.out.println("2. Analisis de datos");
        System.out.println("3. Salir");
        String cadena =  new String();
        System.out.println("Ingrese una opción: ");
       
        opciones=principal.nextInt();
          switch(opciones){
          case 1:
              ingreso_de_datos();
                          break;
          case 2:
              analisis_de_datos();
                          break;
          case 3:
              salir();
              break;
              
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
        } 
          while(opciones!=3);   }
    
//Siguiente paso cuando se selecciona una opción dentro del programa.

    private static void datosestudiantenuevo() {
            System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de Estudiantes");
        System.out.println("Ingreso de datos");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        // DATOS PERSONALES
         System.out.println("");       
        System.out.println("Porfavor ingresa los datos que se solicitan a continuacion");
      
        System.out.println("Nombres");
        String nom = principal.nextLine();
                String opcion1 = principal.nextLine();
        System.out.println("Apellidos");
        String ape = principal.nextLine();
        System.out.println("Carne");
        String car = principal.nextLine();
        System.out.println("Edad");
        String ed = principal.nextLine();
        System.out.println("Sexo");
        String sx = principal.nextLine();
        System.out.println("Carrera");
        String carrera = principal.nextLine();
        System.out.println("Total de creditos obtenidos");
        String creditos = principal.nextLine();
        System.out.println("Cantidad de cursos aprobados");
        String ccp = principal.nextLine();
        
        // AQUI SE COLOCA LA PROGRAMACION DE LOS CURSOS QUE SE HAN APROBADO
            System.out.println("");    
        System.out.println("Listado de cursos aprobados los siguientes datos se deben ingresar por cada curso aprobado por el estudiante:");
        System.out.println("Semestre al que pertenece el curso");
        String semestre = principal.nextLine();
        System.out.println("Nombre del curso");
        String curso = principal.nextLine();
         System.out.println("Codigo del curso");
        String codigo = principal.nextLine();
            System.out.println("Zona obtenida por el estudiante");
        String zona = principal.nextLine();
        System.out.println("Nota de examen final obtenida por el estudiante");
        String examenf = principal.nextLine();
        System.out.println("Fecha de aprobacion del curso");
        String fechaaprobado = principal.nextLine();
        
        // AQUI SE COLOCA LA PROGRAMACION DE LOS CURSOS QUE SE HAN REPROBADO
        System.out.println("");
        
         System.out.println("Listado de cursos reprobados (los siguientes datos se deben ingresar por cada curso reprobado por el estudiante):");
        System.out.println("Semestre al que pertenece el curso");
         String semestrerep = principal.nextLine();
        System.out.println("Nombre del curso");
        String cursor = principal.nextLine();
         System.out.println("Codigo del curso");
        String codigor = principal.nextLine();
            System.out.println("Zona obtenida por el estudiante");
        String zonar = principal.nextLine();
        System.out.println("Nota de examen final obtenida por el estudiante");
        String examenfr = principal.nextLine();
        System.out.println("Fecha en que se reprobo");
        String fechareprobado = principal.nextLine();  
           }

    private static void datospersonalesestudiantes() {
       System.out.println("-------------------------------------------------");
         System.out.println("Analisis de datos de Estudiantes");
        System.out.println("Analisis de datos");
        System.out.println("Datos personales de estudiantes");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("Nombres");
        System.out.println("1. Sofia Isabel");
       System.out.println("2. Roberto Estuardo");
       System.out.println("3. Juan Gabriel");
       System.out.println("4. Astrid Elena");
       System.out.println("Apellidos");
       System.out.println("De La Cruz Ortiz");
       System.out.println("Gomez Bolaños");
       System.out.println("Fernandez");
       System.out.println("Herrera Castro");
       System.out.println("Edad");
       System.out.println("19");
       System.out.println("22");
       System.out.println("19");
       System.out.println("21");       
System.out.println("sexo");
System.out.println("Femenino");
System.out.println("Masculino");
System.out.println("Masculino");
System.out.println("Femenino");

System.out.println("Presione 1 para regresar al menu de analisis de datos");
 
     int opciones = principal.nextInt();
          switch(opciones){
          case 1:
               menuanalisisdatos();
                          break;
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
       
          while(opciones!=1);   
    
//Siguiente paso cuando se selecciona una opción dentro del programa.

        
    }

    private static void cantidadestudiantes() {
     System.out.println("-------------------------------------------------");
         System.out.println("Analisis de datos de Estudiantes");
        System.out.println("Analisis de datos");
        System.out.println("Cantidad de estudiantes masculinos y femeninos");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("sexo      " + "Cantidad");
        System.out.println("Femenino     " + "2");
       System.out.println("Masculino    "+ "2");  
       System.out.println("Presione 1 para regresar al menu de analisis de datos");
 
     int opciones = principal.nextInt();
          switch(opciones){
          case 1:
              menuanalisisdatos();
                          break;
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
       
          while(opciones!=1);   
    
//Siguiente paso cuando se selecciona una opción dentro del programa.
    }

    private static void mejorpromedio() {
    
          System.out.println("-------------------------------------------------");
         System.out.println("Analisis de datos de Estudiantes");
        System.out.println("Analisis de datos");
        System.out.println("Mejor promedio por carrera");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("1.Carrera:" + "Ingenieria en sistemas");
        System.out.println("1.1 Promedio por carrera:" + "");
       System.out.println("1.2 Mejor Promedio:"+ 
               ""
       + "1.2.1 Juan de Dios Flores 90");  
        System.out.println("1.3 Peor promedio:"+ 
               ""
       + "1.3.1 Danilo Fernando Guerra Contreras 60");
 System.out.println("Presione 1 para regresar al menu de analisis de datos");
        int opciones = principal.nextInt();
          switch(opciones){
          case 1:
              menuanalisisdatos();
                          break;
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
       
          while(opciones!=1);   
    }

    private static void datosacademicos() {
   System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de estudiantes");
        System.out.println("Analisis de datos");
          System.out.println("Datos Academicos de estudiantes");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
         System.out.println("Presione 1 para regresar al menu de analisis de datos");
        int opciones = principal.nextInt();
          switch(opciones){
          case 1:
              menuanalisisdatos();
                          break;
          default:
              System.out.println("Error, porfavor escoja un numero correcto");
                           }
       
          while(opciones!=1); 
        
    }

    private static void constanciacursosaprobados() {
   System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de estudiantes");
        System.out.println("Analisis de datos");
          System.out.println("Constancia de cursos aprobados");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
         System.out.println("Ingrese el numero de carne de estudiante");
         int carne = principal.nextInt();
         
               System.out.println("¿Desea buscar otro estudiante?(1 = Si /2 = No)");
       
              int opcionveh = principal.nextInt();
    switch(opcionveh)
        {
            case 1:
                 datosestudiantenuevo();
                break;
            case 2:
                menup();
                break;
            default:
                System.out.println("Escoja bien su respuesta");}
         
    }

    private static void menuanalisisdatos() {
     System.out.println("-------------------------------------------------");
        System.out.println("Analisis de datos de estudiantes");
        System.out.println("Analisis de datos");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        System.out.println("Selecciona porfavor uno de los numeros que se presentan a continuación");
        System.out.println("1. Datos personales de estudiantes");
        System.out.println("2. Cantidad de estudiantes masculinos y femeninos");
        System.out.println("3. Mejor promedio de cada carrera");
        System.out.println("4. Datos academicos de estudiantes");
        System.out.println("5. Constancia de cursos aprobados");
        System.out.println("6. Salir");
        String cadenaanalisis =  new String();
       
        System.out.println("Ingrese una opción: ");
     int opcionana = principal.nextInt();
             switch(opcionana)
        {
            case 1:
                 datospersonalesestudiantes();
                break;
                case 2:
                 cantidadestudiantes();
                break;
                case 3:
                 mejorpromedio();
                break;
                case 4:
                 datosacademicos();
                break;
                case 5:

                    constanciacursosaprobados();
                break;
            case 6:
                salir();
                break;
            default:
                System.out.println("Escoja bien su respuesta");
    }
    }
    }
    
    


    