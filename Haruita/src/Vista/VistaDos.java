package Vista;

public class VistaDos extends VistaUno implements InterVista {

	@Override
	public void comoHaru() {
		System.out.println("Como Haru, todos son gordos");
	}

	@Override
	public String sinHaru() {
		return "Sin Haru, todos tristes";
	}

	@Override
	public int cambiarCuenta() {
		return 100;
	}

}
