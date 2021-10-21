package POO;

public class Pagamento1 {
//HN=Horas de trabalho normal HE=Horas de trabalho extra VHN=Valor das horas de trabalho normal VHE=Valor das horas de trabalho extra
//VN=Valor das horas normais trabalhadas VE=Valor das horas extras trabalhadas
	
	double Csalario(int HN, int HE, double VHN, double VHE) {
		double VN = HN * VHN;
		double VE = HE *VHE;
		return VN + VE;
	}

	}
