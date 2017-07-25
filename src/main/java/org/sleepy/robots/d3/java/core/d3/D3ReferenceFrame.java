package rep.business.layouters.d3;

public class D3ReferenceFrame<XType,YType> {
	D3Axis<XType> xAxis;
	D3Axis<YType> yAxis;
	
	public D3ReferenceFrame(D3Axis<XType> xAxis, D3Axis<YType> yAxis) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}
	
	public int positionX(XType data){
		return xAxis.number(data);
	}
	
	public int positionY(YType data){
		return yAxis.number(data);
	}

	public int intervalX(XType data1, XType data2) {
		return xAxis.number(data2) - xAxis.number(data1);
	}
	
	public int intervalY(YType data1, YType data2) {
		return yAxis.number(data2) - yAxis.number(data1);
	}
}
