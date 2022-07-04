public class Mercado {
	int numMacas;
	double precoM;
	int numLaranjas;
	double precoL;
	
	public int getNumMacas() {
		return numMacas;
	}
	public void setNumMacas(int numMacas) {
		if (numMacas< 0) {
			throw new IllegalArgumentException("N�o pode ter n�mero de ma�as negativo");
		}
		this.numMacas = numMacas;
	}
	public double getPrecoM() {
		return precoM;
	}
	public void setPrecoM(double precoM) {
		if (precoM<0) {
			throw new IllegalArgumentException("N�o pode ter pre�o de ma�a negativo");
		}
		this.precoM = precoM;
	}
	public int getNumLaranjas() {
		return numLaranjas;
	}
	public void setNumLaranjas(int numLaranjas) {
		if (numLaranjas<0) {
			throw new IllegalArgumentException("N�o pode ter n�mero de laranjas negativo");
		}
		this.numLaranjas = numLaranjas;
	}
	public double getPrecoL() {
		return precoL;
	}
	public void setPrecoL(double precoL) {
		if (precoL<0) {
			throw new IllegalArgumentException("N�o pode ter pre�o de laranjas negativo");
		}
		this.precoL = precoL;
	}
	public Mercado(int numMacas, double precoM, int numLaranjas, double precoL) {
		super();
		setNumMacas(numMacas);
		setPrecoM(precoM);
		setNumLaranjas(numLaranjas);
		setPrecoL(precoL);
	}
	
	public double ReceitaL() {
		return getNumLaranjas()* getPrecoL();
	
	}
	public double ReceitaM () {
		return getNumMacas()* getPrecoM();
	}
	public double ReceitaAno() {
		return ReceitaM()+ ReceitaL();
		
	}
	
	
	
}
