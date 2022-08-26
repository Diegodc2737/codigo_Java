package exemplo_sobrecarga;

public class ExempoSobrecarga {

	double maior;
	
	public double calcularNumeroMaior(double n1, double n2) {
		if (n1 == n2) {
			maior = 0;
		}else if (n1 > n2) {
			maior = n1;
		}else if (n2 > n1) {
			maior = n2;
		}
		
		return maior;
	}
	
	public double calcularNumeroMaior(double n1, double n2, double n3) {
		if ((n1 > n2) && (n1 > n3)) {
			maior = n1;
		}else if ((n2 > n1) && (n2 > n3)) {
			maior = n2;
		}else if ((n3 > n1) && (n3 > n2)) {
			maior = n3;
		}else {
			maior = 0;
		}
		
		return maior;
	}
	
}
