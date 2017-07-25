package rep.business.layouters.d3;

public class D3IntervalScale extends D3Scale<Double>{

	private double domainMin;
	private double domainMax;

	@Override
	public int scale(Double i) {
		return (int) (rangeMin + (i-domainMin)/(domainMax-domainMin)*(rangeMax-rangeMin));
	}

	public D3IntervalScale domain(double domainMin, double domainMax) {
		this.domainMin = domainMin;
		this.domainMax = domainMax;
		return this;
	}

}
