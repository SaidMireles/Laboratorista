package laboratorista;

public class Calculo {
	
	public String gradoToxicidad(String ph, String np, String conc, String ac, String tp, String com) {
		
		int valorPH = Integer.parseInt(ph);
        int valorPlasmatico = nivelPlasmatico(Integer.parseInt(np));
		int valorConcentracion = nivelConcentracion(conc);
		int valorAcidez = nivelAcidez(ac);
		int valorTipo = nivelAcidez(tp);
		int valorComposicion = nivelComposicion(com);
		
		float resultado = operacion(valorPH, valorPlasmatico, valorConcentracion, valorAcidez, valorTipo, valorComposicion);
		
		return resultado+"";
		
	}
	
	/** Obtener valor Nivel Plasmatico**/
		
	private int nivelPlasmatico(int np) {
		int nivelPlasmatico = 0;	
			if ((np >= 10)&&(np <= 20 )) {
				nivelPlasmatico = 8;
			}else if ((np >= 21)&&((np) <= 30 )){
				nivelPlasmatico = 8;
			}
			return nivelPlasmatico;
		}
	
	/** Obtener valor Nivel Concentracion**/
	
	private int nivelConcentracion(String conc) {
		int nivelConcentracion = 0;	
			if (conc == "Alta") {
				nivelConcentracion = 20;
			}else if (conc == "Media") {
				nivelConcentracion = 15;
			}else if (conc == "Baja") {
				nivelConcentracion = 10;
			}
			return nivelConcentracion;
		}
	
	/** Obtener valor Nivel Acidez**/
	
	private int nivelAcidez(String ac) {
		int nivelAcidez = 0;	
			if (ac == "Basico") {
				nivelAcidez = 2;
			}else if (ac == "Alcalino") {
				nivelAcidez = 4;
			}
			return nivelAcidez;
		}
	
	/** Obtener valor Nivel Tipo**/
	
	private int nivelTipo(String tp) {
		int nivelTipo = 0;	
			if (tp == "MTP") {
				nivelTipo = 5;
			}else if (tp == "Homeopatico") {
				nivelTipo = 3;
			}
			return nivelTipo;
		}
	
	/** Obtener valor Nivel Composicion**/
	
	private int nivelComposicion(String cmp) {
		
		int nivelComposicion = 0;	
		if (cmp == "Activo") {
			nivelComposicion = 2;
		}else if (cmp == "Excipiente") {
			nivelComposicion = 4;
		}
		return nivelComposicion;
		
	}
	
	/** Obtener valor Nivel Composicion**/
	
	private float operacion(int ph, int np, int conc, int ac, int tp, int com) {
		
		float sm1 = ph + np;
		float mtp1 = conc * ac;
		float divisor = sm1 + mtp1;
		float dividendo = tp + com;
		float tx = divisor / dividendo;
		
		
		return tx;
		
	}

}
