package rep.business.layouters.d3;

import java.time.Duration;
import platform.utils.PointInTime.Utc;

public class D3TimeScale extends D3Scale<Utc> {
	
	private Utc domainMin;
	private Utc domainMax;
	private Duration domainLength;

	
	public D3TimeScale(){
	}

	public D3TimeScale domain(Utc domainMin, Utc domainMax) {
		this.domainMin = domainMin;
		this.domainMax = domainMax;
		domainLength = domainMin.until(domainMax);
		return this;
	}

	@Override
	public int scale(Utc date) {
		return (int) (rangeMin+domainMin.until(date).getSeconds()/(double)domainLength.getSeconds()*((double)rangeMax-rangeMin));
	}
}
