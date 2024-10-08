
package main;

import Medicamento.Medicamentos;


public class darMedicina {
    
    public static void main(String[] args) {
        
        Medicamentos Medicamento = new Medicamentos("Aspitina","Bayer", "Oral");
        Medicamentos.Posologia posologia = Medicamento.new Posologia
        ("Adultos y maypres de" + "16 años", "500", "6 Horas",
                "No debe tomar este medicamento" + "en ayunas");
        Medicamento.setPosologia(posologia);
        Medicamento.darDatos();
        posologia.darDatos();
    }
    
}
