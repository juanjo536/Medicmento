
package Medicamento;


public class Medicamentos {
    private String nombre;
    private String fabricante;
    private String viaAdministracion;
    private Posologia posologia;
    
    public Medicamentos(String nombre, String fabricante, String 
            viaAdministracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
}

    public void setPosologia(Posologia posologia) {
        this.posologia = posologia;
    }
    public void darDatos(){
        System.out.println("Nombre del medicamento:" + nombre);
        System.out.println("Empresa que lo fabrica:" + fabricante);
        System.out.println("Via por la cual se administra:" + viaAdministracion);
    
    }
    public class Posologia{
        private String usuario;
        private String dosis;
        private String intervalodeTiempo;
        private String recomendaciones;
        
        public Posologia(String usuario,String dosis, String intervalodeTiempo,
                String recomendaciones) {
            this.usuario = usuario;
            this.dosis = dosis;
            this.intervalodeTiempo = intervalodeTiempo;
            this.recomendaciones = recomendaciones;
            
        }
        public void darDatos(){
            System.out.println("Usuarios:" + usuario);
            System.out.println("Dosis:" + dosis);
            System.out.println("Tiempo:" + intervalodeTiempo);
            System.out.println("Recomendaciones!:" + recomendaciones);
        }
    
    }
    
    
}
