
package proyecto2;

/**
 *
 * @author Carlos Flores
 */
public class Datos {
    String nombres;
    String apellidos;
    String carne;
    int edad;
    String sexo;
    String carrera;
    int totalcreditos;
    int Cantidadcursosaprobados;
    String listadocursosaprobados;
    

public Datos(String nombres, String apellidos, String carne, int edad, String sexo, String carrera, int total_creditos, int cantidad_cursos_aprobados, String listado_cursos_aprobados)
        {
            
 this.nombres=nombres;
 this.apellidos=apellidos;
 this.carne=carne;
 this.edad=edad;
 this.sexo=sexo;
  this.carrera=sexo;
   this.totalcreditos=total_creditos;
    this.Cantidadcursosaprobados=cantidad_cursos_aprobados;
    this.listadocursosaprobados=listado_cursos_aprobados;
        
}

    Datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

