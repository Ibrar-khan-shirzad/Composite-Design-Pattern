/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author fa18-bse-099
 */
import java.awt.*;

public class Triangle extends BaseShape {
    public int[] xPoints;
    public int[] yPoints;

    public Triangle(int[] x, int[] y, Color color) {
        super(0, 0, color);
        this.xPoints = x;
        this.yPoints = y;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawPolygon(xPoints, yPoints,3);
    }
}
