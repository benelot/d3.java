package rep.business.layouters.d3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.time.temporal.ChronoUnit;

import org.apache.batik.svggen.SVGGraphics2D;

public class D3Axis<ScaleType> {
	
	D3Scale<ScaleType> scale;
	
	int origin;

	public D3Axis<ScaleType> scale(D3Scale<ScaleType> scale) {
		this.scale = scale;
		return this;
	}

	public D3Axis<ScaleType> translateOrigin(int origin) {
		this.origin = origin;
		return this;
	}

	public int number(ScaleType data) {
		return origin + scale.scale(data);
	}
	
	public int interval(ScaleType data1, ScaleType data2){
		return scale.scale(data2) - scale.scale(data1);
	}

	public void draw(SVGGraphics2D canvas, D3ReferenceFrame axisReferenceFrame, ChronoUnit chronoUnit) {
	
		canvas.setStroke(new BasicStroke(5.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		int x = axisReferenceFrame.positionX(0.0);
		int y = axisReferenceFrame.positionY(0.0);
		int rectwidth = axisReferenceFrame.intervalX(0.0, 1.0);
		int rectheight = axisReferenceFrame.intervalY(0.0, 0.3333);
		canvas.setColor(new Color(240,239,236));
		canvas.fillRect(x,y,rectwidth,rectheight);
		canvas.setColor(new Color(153,153,153));
		canvas.drawRect(x,y,rectwidth,rectheight);
		
		x = axisReferenceFrame.positionX(0.0);
		y = axisReferenceFrame.positionY(0.333);
		rectwidth = axisReferenceFrame.intervalX(0.0, 1.0);
		rectheight = axisReferenceFrame.intervalY(0.333, 0.666);
		canvas.setColor(new Color(224,217,217));
		canvas.fillRect(x,y,rectwidth,rectheight);
		canvas.setColor(new Color(153,153,153));
		canvas.drawRect(x,y,rectwidth,rectheight);
		
		x = axisReferenceFrame.positionX(0.0);
		y = axisReferenceFrame.positionY(0.666);
		rectwidth = axisReferenceFrame.intervalX(0.0, 1.0);
		rectheight = axisReferenceFrame.intervalY(0.666, 1.0);
		canvas.setColor(new Color(192,180,180));
		canvas.fillRect(x,y,rectwidth,rectheight);
		canvas.setColor(new Color(153,153,153));
		canvas.drawRect(x,y,rectwidth,rectheight);
	}
}
