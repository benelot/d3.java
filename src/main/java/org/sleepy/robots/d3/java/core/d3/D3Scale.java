package rep.business.layouters.d3;

public abstract class D3Scale<ScaleType> {
	
	protected int rangeMin;
	protected int rangeMax;
	
	public D3Scale<ScaleType> range(int rangeMin, int rangeMax) {
		this.rangeMin = rangeMin;
		this.rangeMax = rangeMax;
		return this;
	}

	public abstract int scale(ScaleType object);

}
