package org.jfree.chart.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.junit.Before;
import org.junit.Test;

public class AxisTest {

    private static class TestAxis extends Axis {
        private static final long serialVersionUID = 1L;
        boolean configured = false;

        public TestAxis(String label) {
            super(label);
        }

        @Override
        public void configure() {
            this.configured = true;
        }

        @Override
        public AxisSpace reserveSpace(Graphics2D g2, Plot plot, Rectangle2D plotArea, 
                                      RectangleEdge edge, AxisSpace space) {
            return space;
        }

        @Override
        public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, 
                              Rectangle2D dataArea, RectangleEdge edge, 
                              PlotRenderingInfo plotState) {
            return new AxisState(cursor);
        }

        @Override
        public List refreshTicks(Graphics2D g2, AxisState state, 
                                 Rectangle2D dataArea, RectangleEdge edge) {
            return Collections.emptyList();
        }

        public Rectangle2D testGetLabelEnclosure(Graphics2D g2, RectangleEdge edge) {
            return super.getLabelEnclosure(g2, edge);
        }

        public AxisState testDrawLabel(String label, Graphics2D g2, Rectangle2D plotArea, 
                                      Rectangle2D dataArea, RectangleEdge edge, 
                                      AxisState state, PlotRenderingInfo plotState) {
            return super.drawLabel(label, g2, plotArea, dataArea, edge, state, plotState);
        }

        public void testDrawAxisLine(Graphics2D g2, double cursor, 
                                     Rectangle2D dataArea, RectangleEdge edge) {
            super.drawAxisLine(g2, cursor, dataArea, edge);
        }
    }

    private static class TestListener implements AxisChangeListener {
        int eventCount = 0;

        @Override
        public void axisChanged(AxisChangeEvent event) {
            this.eventCount++;
        }
    }

    private TestAxis axis;
    private TestListener listener;
    private Graphics2D g2;

    @Before
    public void setUp() {
        this.axis = new TestAxis("Initial");
        this.listener = new TestListener();
        this.axis.addChangeListener(this.listener);

        BufferedImage img = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        this.g2 = img.createGraphics();
    }

    @Test
    public void testConstructor_defaults() {
        TestAxis a = new TestAxis("Test");
        assertEquals("Test", a.getLabel());
        assertTrue(a.isVisible());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, a.getLabelFont());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, a.getLabelPaint());
        assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, a.getLabelInsets());
        assertEquals(0.0, a.getLabelAngle(), 0.0001);
        assertNull(a.getLabelToolTip());
        assertNull(a.getLabelURL());
        assertTrue(a.isAxisLineVisible());
        assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, a.getAxisLinePaint());
        assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, a.getAxisLineStroke());
        assertTrue(a.isTickLabelsVisible());
        assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, a.getTickLabelFont());
        assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, a.getTickLabelPaint());
        assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS, a.getTickLabelInsets());
        assertTrue(a.isTickMarksVisible());
        assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, a.getTickMarkStroke());
        assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, a.getTickMarkPaint());
        assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, a.getTickMarkInsideLength(), 0.0001f);
        assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH, a.getTickMarkOutsideLength(), 0.0001f);
        assertNull(a.getPlot());
        assertEquals(0.0, a.getFixedDimension(), 0.0001);
    }

    @Test
    public void testSetVisible_changesAndNotification() {
        this.axis.setVisible(false);
        assertFalse(this.axis.isVisible());
        assertEquals(1, this.listener.eventCount);

        this.axis.setVisible(false);
        assertEquals(1, this.listener.eventCount);

        this.axis.setVisible(true);
        assertTrue(this.axis.isVisible());
        assertEquals(2, this.listener.eventCount);
    }

    @Test
    public void testSetLabel_variousConditions() {
        this.axis.setLabel("Initial");
        assertEquals(0, this.listener.eventCount);

        this.axis.setLabel("New Label");
        assertEquals("New Label", this.axis.getLabel());
        assertEquals(1, this.listener.eventCount);

        this.axis.setLabel(null);
        assertNull(this.axis.getLabel());
        assertEquals(2, this.listener.eventCount);

        this.axis.setLabel(null);
        assertEquals(2, this.listener.eventCount);

        this.axis.setLabel("Reborn");
        assertEquals("Reborn", this.axis.getLabel());
        assertEquals(3, this.listener.eventCount);
    }

    @Test
    public void testSetLabelFont_normalAndException() {
        Font font = new Font("Dialog", Font.BOLD, 14);
        this.axis.setLabelFont(font);
        assertEquals(font, this.axis.getLabelFont());
        assertEquals(1, this.listener.eventCount);

        this.axis.setLabelFont(font);
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_nullThrowsException() {
        this.axis.setLabelFont(null);
    }

    @Test
    public void testSetLabelPaint_normal() {
        this.axis.setLabelPaint(Color.red);
        assertEquals(Color.red, this.axis.getLabelPaint());
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_nullThrowsException() {
        this.axis.setLabelPaint(null);
    }

    @Test
    public void testSetLabelInsets_normal() {
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        this.axis.setLabelInsets(insets);
        assertEquals(insets, this.axis.getLabelInsets());
        assertEquals(1, this.listener.eventCount);

        this.axis.setLabelInsets(insets);
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelInsets_nullThrowsException() {
        this.axis.setLabelInsets(null);
    }

    @Test
    public void testSetLabelAngle() {
        this.axis.setLabelAngle(Math.PI / 4.0);
        assertEquals(Math.PI / 4.0, this.axis.getLabelAngle(), 0.0001);
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetLabelToolTip() {
        this.axis.setLabelToolTip("Tooltip text");
        assertEquals("Tooltip text", this.axis.getLabelToolTip());
        assertEquals(1, this.listener.eventCount);

        this.axis.setLabelToolTip(null);
        assertNull(this.axis.getLabelToolTip());
        assertEquals(2, this.listener.eventCount);
    }

    @Test
    public void testSetLabelURL() {
        this.axis.setLabelURL("http://www.jfree.org");
        assertEquals("http://www.jfree.org", this.axis.getLabelURL());
        assertEquals(1, this.listener.eventCount);

        this.axis.setLabelURL(null);
        assertNull(this.axis.getLabelURL());
        assertEquals(2, this.listener.eventCount);
    }

    @Test
    public void testSetAxisLineVisible() {
        this.axis.setAxisLineVisible(false);
        assertFalse(this.axis.isAxisLineVisible());
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetAxisLinePaint() {
        this.axis.setAxisLinePaint(Color.blue);
        assertEquals(Color.blue, this.axis.getAxisLinePaint());
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLinePaint_nullThrowsException() {
        this.axis.setAxisLinePaint(null);
    }

    @Test
    public void testSetAxisLineStroke() {
        Stroke s = new BasicStroke(2.0f);
        this.axis.setAxisLineStroke(s);
        assertEquals(s, this.axis.getAxisLineStroke());
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAxisLineStroke_nullThrowsException() {
        this.axis.setAxisLineStroke(null);
    }

    @Test
    public void testSetTickLabelsVisible() {
        this.axis.setTickLabelsVisible(false);
        assertFalse(this.axis.isTickLabelsVisible());
        assertEquals(1, this.listener.eventCount);

        this.axis.setTickLabelsVisible(false);
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetTickLabelFont() {
        Font f = new Font("Serif", Font.PLAIN, 16);
        this.axis.setTickLabelFont(f);
        assertEquals(f, this.axis.getTickLabelFont());
        assertEquals(1, this.listener.eventCount);

        this.axis.setTickLabelFont(f);
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelFont_nullThrowsException() {
        this.axis.setTickLabelFont(null);
    }

    @Test
    public void testSetTickLabelPaint() {
        this.axis.setTickLabelPaint(Color.magenta);
        assertEquals(Color.magenta, this.axis.getTickLabelPaint());
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelPaint_nullThrowsException() {
        this.axis.setTickLabelPaint(null);
    }

    @Test
    public void testSetTickLabelInsets() {
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        this.axis.setTickLabelInsets(insets);
        assertEquals(insets, this.axis.getTickLabelInsets());
        assertEquals(1, this.listener.eventCount);

        this.axis.setTickLabelInsets(insets);
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickLabelInsets_nullThrowsException() {
        this.axis.setTickLabelInsets(null);
    }

    @Test
    public void testSetTickMarksVisible() {
        this.axis.setTickMarksVisible(false);
        assertFalse(this.axis.isTickMarksVisible());
        assertEquals(1, this.listener.eventCount);

        this.axis.setTickMarksVisible(false);
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetTickMarkInsideLength() {
        this.axis.setTickMarkInsideLength(1.5f);
        assertEquals(1.5f, this.axis.getTickMarkInsideLength(), 0.0001f);
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetTickMarkOutsideLength() {
        this.axis.setTickMarkOutsideLength(3.5f);
        assertEquals(3.5f, this.axis.getTickMarkOutsideLength(), 0.0001f);
        assertEquals(1, this.listener.eventCount);
    }

    @Test
    public void testSetTickMarkStroke() {
        Stroke s = new BasicStroke(3.0f);
        this.axis.setTickMarkStroke(s);
        assertEquals(s, this.axis.getTickMarkStroke());
        assertEquals(1, this.listener.eventCount);

        this.axis.setTickMarkStroke(s);
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkStroke_nullThrowsException() {
        this.axis.setTickMarkStroke(null);
    }

    @Test
    public void testSetTickMarkPaint() {
        this.axis.setTickMarkPaint(Color.cyan);
        assertEquals(Color.cyan, this.axis.getTickMarkPaint());
        assertEquals(1, this.listener.eventCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetTickMarkPaint_nullThrowsException() {
        this.axis.setTickMarkPaint(null);
    }

    @Test
    public void testSetPlot() {
        assertNull(this.axis.getPlot());
        assertFalse(this.axis.configured);

        this.axis.setPlot(null);
        assertTrue(this.axis.configured);
    }

    @Test
    public void testSetFixedDimension() {
        this.axis.setFixedDimension(100.5);
        assertEquals(100.5, this.axis.getFixedDimension(), 0.0001);
    }

    @Test
    public void testListeners_addRemoveHas() {
        TestListener l2 = new TestListener();
        assertFalse(this.axis.hasListener(l2));
        assertTrue(this.axis.hasListener(this.listener));

        this.axis.addChangeListener(l2);
        assertTrue(this.axis.hasListener(l2));

        this.axis.removeChangeListener(l2);
        assertFalse(this.axis.hasListener(l2));
    }

    @Test
    public void testGetLabelEnclosure() {
        this.axis.setLabel(null);
        Rectangle2D boundsNull = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.TOP);
        assertEquals(0.0, boundsNull.getWidth(), 0.0001);
        assertEquals(0.0, boundsNull.getHeight(), 0.0001);

        this.axis.setLabel("");
        Rectangle2D boundsEmpty = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.TOP);
        assertEquals(0.0, boundsEmpty.getWidth(), 0.0001);
        assertEquals(0.0, boundsEmpty.getHeight(), 0.0001);

        this.axis.setLabel("Label");
        Rectangle2D boundsTop = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.TOP);
        assertTrue(boundsTop.getWidth() > 0);
        assertTrue(boundsTop.getHeight() > 0);

        Rectangle2D boundsLeft = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.LEFT);
        assertTrue(boundsLeft.getWidth() > 0);
        assertTrue(boundsLeft.getHeight() > 0);

        Rectangle2D boundsRight = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.RIGHT);
        assertTrue(boundsRight.getWidth() > 0);

        Rectangle2D boundsBottom = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.BOTTOM);
        assertTrue(boundsBottom.getWidth() > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawLabel_nullStateThrowsException() {
        this.axis.testDrawLabel("Label", this.g2, new Rectangle2D.Double(), 
                new Rectangle2D.Double(), RectangleEdge.TOP, null, null);
    }

    @Test
    public void testDrawLabel_nullOrEmptyLabel() {
        AxisState state = new AxisState(10.0);
        AxisState resNull = this.axis.testDrawLabel(null, this.g2, new Rectangle2D.Double(), 
                new Rectangle2D.Double(), RectangleEdge.TOP, state, null);
        assertEquals(state, resNull);

        AxisState resEmpty = this.axis.testDrawLabel("", this.g2, new Rectangle2D.Double(), 
                new Rectangle2D.Double(), RectangleEdge.TOP, state, null);
        assertEquals(state, resEmpty);
    }

    @Test
    public void testDrawLabel_allEdgesWithEntities() {
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 80, 80);

        ChartRenderingInfo cri = new ChartRenderingInfo(new StandardEntityCollection());
        PlotRenderingInfo pri = new PlotRenderingInfo(cri);

        this.axis.setLabelToolTip("TT");
        this.axis.setLabelURL("URL");

        AxisState stateTop = new AxisState(50.0);
        AxisState resTop = this.axis.testDrawLabel("Top Label", this.g2, plotArea, 
                dataArea, RectangleEdge.TOP, stateTop, pri);
        assertTrue(resTop.getCursor() < 50.0);

        AxisState stateBottom = new AxisState(50.0);
        AxisState resBottom = this.axis.testDrawLabel("Bottom Label", this.g2, plotArea, 
                dataArea, RectangleEdge.BOTTOM, stateBottom, pri);
        assertTrue(resBottom.getCursor() > 50.0);

        AxisState stateLeft = new AxisState(50.0);
        AxisState resLeft = this.axis.testDrawLabel("Left Label", this.g2, plotArea, 
                dataArea, RectangleEdge.LEFT, stateLeft, pri);
        assertTrue(resLeft.getCursor() < 50.0);

        AxisState stateRight = new AxisState(50.0);
        AxisState resRight = this.axis.testDrawLabel("Right Label", this.g2, plotArea, 
                dataArea, RectangleEdge.RIGHT, stateRight, pri);
        assertTrue(resRight.getCursor() > 50.0);

        assertEquals(4, cri.getEntityCollection().getEntityCount());
    }

    @Test
    public void testDrawLabel_withoutEntityCollection() {
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 80, 80);
        PlotRenderingInfo pri = new PlotRenderingInfo(new ChartRenderingInfo(null));

        AxisState state = new AxisState(50.0);
        this.axis.testDrawLabel("Label", this.g2, plotArea, dataArea, RectangleEdge.TOP, state, pri);
        assertNull(pri.getOwner().getEntityCollection());
    }

    @Test
    public void testDrawAxisLine_allEdges() {
        Rectangle2D dataArea = new Rectangle2D.Double(10, 10, 80, 80);
        this.axis.testDrawAxisLine(this.g2, 10.0, dataArea, RectangleEdge.TOP);
        this.axis.testDrawAxisLine(this.g2, 90.0, dataArea, RectangleEdge.BOTTOM);
        this.axis.testDrawAxisLine(this.g2, 10.0, dataArea, RectangleEdge.LEFT);
        this.axis.testDrawAxisLine(this.g2, 90.0, dataArea, RectangleEdge.RIGHT);
    }

    @Test
    public void testCloning() throws Exception {
        this.axis.setLabel("Clone Test");
        TestAxis clone = (TestAxis) this.axis.clone();
        assertNotSame(this.axis, clone);
        assertEquals(this.axis.getClass(), clone.getClass());
        assertEquals(this.axis, clone);

        assertFalse(clone.hasListener(this.listener));
        assertNull(clone.getPlot());
    }

    @Test
    public void testEquals_branches() {
        TestAxis a1 = new TestAxis("Label");
        TestAxis a2 = new TestAxis("Label");

        assertTrue(a1.equals(a1));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("Not an Axis"));
        assertTrue(a1.equals(a2));

        a1.setVisible(false);
        assertFalse(a1.equals(a2));
        a2.setVisible(false);
        assertTrue(a1.equals(a2));

        a1.setLabel("Diff");
        assertFalse(a1.equals(a2));
        a2.setLabel("Diff");
        assertTrue(a1.equals(a2));

        a1.setLabel(null);
        assertFalse(a1.equals(a2));
        a2.setLabel(null);
        assertTrue(a1.equals(a2));

        a1.setLabelFont(new Font("Dialog", Font.BOLD, 20));
        assertFalse(a1.equals(a2));
        a2.setLabelFont(new Font("Dialog", Font.BOLD, 20));
        assertTrue(a1.equals(a2));

        a1.setLabelPaint(new GradientPaint(0, 0, Color.red, 1, 1, Color.blue));
        assertFalse(a1.equals(a2));
        a2.setLabelPaint(new GradientPaint(0, 0, Color.red, 1, 1, Color.blue));
        assertTrue(a1.equals(a2));

        a1.setLabelInsets(new RectangleInsets(10, 10, 10, 10));
        assertFalse(a1.equals(a2));
        a2.setLabelInsets(new RectangleInsets(10, 10, 10, 10));
        assertTrue(a1.equals(a2));

        a1.setLabelAngle(1.23);
        assertFalse(a1.equals(a2));
        a2.setLabelAngle(1.23);
        assertTrue(a1.equals(a2));

        a1.setLabelToolTip("TT");
        assertFalse(a1.equals(a2));
        a2.setLabelToolTip("TT");
        assertTrue(a1.equals(a2));

        a1.setLabelURL("URL");
        assertFalse(a1.equals(a2));
        a2.setLabelURL("URL");
        assertTrue(a1.equals(a2));

        a1.setAxisLineVisible(false);
        assertFalse(a1.equals(a2));
        a2.setAxisLineVisible(false);
        assertTrue(a1.equals(a2));

        a1.setAxisLineStroke(new BasicStroke(4.0f));
        assertFalse(a1.equals(a2));
        a2.setAxisLineStroke(new BasicStroke(4.0f));
        assertTrue(a1.equals(a2));

        a1.setAxisLinePaint(Color.orange);
        assertFalse(a1.equals(a2));
        a2.setAxisLinePaint(Color.orange);
        assertTrue(a1.equals(a2));

        a1.setTickLabelsVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickLabelsVisible(false);
        assertTrue(a1.equals(a2));

        a1.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 8));
        assertFalse(a1.equals(a2));
        a2.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 8));
        assertTrue(a1.equals(a2));

        a1.setTickLabelPaint(Color.green);
        assertFalse(a1.equals(a2));
        a2.setTickLabelPaint(Color.green);
        assertTrue(a1.equals(a2));

        a1.setTickLabelInsets(new RectangleInsets(7, 7, 7, 7));
        assertFalse(a1.equals(a2));
        a2.setTickLabelInsets(new RectangleInsets(7, 7, 7, 7));
        assertTrue(a1.equals(a2));

        a1.setTickMarksVisible(false);
        assertFalse(a1.equals(a2));
        a2.setTickMarksVisible(false);
        assertTrue(a1.equals(a2));

        a1.setTickMarkInsideLength(2.2f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkInsideLength(2.2f);
        assertTrue(a1.equals(a2));

        a1.setTickMarkOutsideLength(4.4f);
        assertFalse(a1.equals(a2));
        a2.setTickMarkOutsideLength(4.4f);
        assertTrue(a1.equals(a2));

        a1.setTickMarkPaint(Color.yellow);
        assertFalse(a1.equals(a2));
        a2.setTickMarkPaint(Color.yellow);
        assertTrue(a1.equals(a2));

        a1.setTickMarkStroke(new BasicStroke(2.5f));
        assertFalse(a1.equals(a2));
        a2.setTickMarkStroke(new BasicStroke(2.5f));
        assertTrue(a1.equals(a2));

        a1.setFixedDimension(42.0);
        assertFalse(a1.equals(a2));
        a2.setFixedDimension(42.0);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testSerialization() throws Exception {
        this.axis.setLabel("Serialized Axis");
        this.axis.setLabelPaint(Color.red);
        this.axis.setTickLabelPaint(Color.blue);
        this.axis.setAxisLinePaint(Color.green);
        this.axis.setTickMarkPaint(Color.yellow);
        this.axis.setAxisLineStroke(new BasicStroke(1.2f));
        this.axis.setTickMarkStroke(new BasicStroke(1.3f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.axis);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        TestAxis deserialized = (TestAxis) in.readObject();
        in.close();

        assertEquals(this.axis, deserialized);
        assertNotNull(deserialized.getLabelPaint());
        assertNotNull(deserialized.getTickLabelPaint());
        assertNotNull(deserialized.getAxisLinePaint());
        assertNotNull(deserialized.getTickMarkPaint());
        assertNotNull(deserialized.getAxisLineStroke());
        assertNotNull(deserialized.getTickMarkStroke());
    }
}
