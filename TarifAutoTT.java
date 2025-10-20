package v3;

public class TarifAutoTT extends Tarif {

	private static Tarif t = null;
	
	protected TarifAutoTT(int tFixe, int tVar) {
		super(tFixe, tVar);
		// TODO Auto-generated constructor stub
	}
	
	public static Tarif createSingleton(int tFixe, int tVar)
	{
		if(t == null)
		{
			t = new TarifAutoTT(tFixe,tVar);
		}
		return t;
	}
	
	public static Tarif getInstance()
	{
		return t;
	}

	@Override
	public int calculerTarif(IVehicule v) {
		// TODO Auto-generated method stub
		return getTarifFixe() + getTarifPass()*v.getPassagers();
	}

}
