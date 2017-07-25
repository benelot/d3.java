package rep.business.layouters.d3;

public class D3OrdinalScale extends D3Scale<Double> {
	
	D3OrdinalDomain ordinalDomain;

	public D3OrdinalScale domain(D3OrdinalDomain ordinalDomain) {
		this.ordinalDomain = ordinalDomain;
		return this;
	}
	
	@Override
	public D3OrdinalScale range(int rangeMin, int rangeMax){
		return (D3OrdinalScale) super.range(rangeMin, rangeMax);
	}

	@Override
	public int scale(Double i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
