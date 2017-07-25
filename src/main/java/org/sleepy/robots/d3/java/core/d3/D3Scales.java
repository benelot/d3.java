package rep.business.layouters.d3;

public class D3Scales {
	public static D3TimeScale time() {
		return new D3TimeScale();
	}

	public static D3OrdinalScale ordinal() {
		return new D3OrdinalScale();
	}

	public static D3NominalScale nominal() {
		return new D3NominalScale();
	}

	public static D3IntervalScale interval() {
		return new D3IntervalScale();
	}
}
