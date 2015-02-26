package Epicidad;

public class GandalfSeHartaHierba implements LaInterfazdeGandalf{

	public static void main(String[] args) {
		int hierba = 0;
		int pasos = 0;
		if (hierba > pasos)
			System.out.println("Gandalf sa jartao hierba");
		else
			System.out.println("Se la robó Radagast");
	}

	@Override
	public boolean tunicaArriba() {
		System.out.println("Galadriel tira parriba ave si encuentras a Glamdring");
		return true;
	}
}
