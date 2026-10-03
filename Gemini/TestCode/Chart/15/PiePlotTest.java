package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.labels.CustomPieURLGenerator;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.urls.CustomPieURLGenerator;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.UnitType;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PiePlotTest {

    private PiePlot plot;
    private DefaultPieDataset dataset;

    @Before
    public void setUp() {
        this.dataset = new DefaultPieDataset();
        this.dataset.setValue("Section 1", 25.0);
        this.dataset.setValue("Section 2", 75.0);
        this.plot = new PiePlot(this.dataset);
    }

    @Test
    public void testConstructors() {
        PiePlot p1 = new PiePlot();
        Assert.assertNull(p1.getDataset());
        Assert.assertEquals(PiePlot.DEFAULT_INTERIOR_GAP, p1.getInteriorGap(), 0.0001);
        Assert.assertEquals(PiePlot.DEFAULT_START_ANGLE, p1.getStartAngle(), 0.0001);
        Assert.assertTrue(p1.isCircular());

        PiePlot p2 = new PiePlot(this.dataset);
        Assert.assertEquals(this.dataset, p2.getDataset());
    }

    @Test
    public void testGetSetDataset() {
        PiePlot p = new PiePlot();
        Assert.assertNull(p.getDataset());
        DefaultPieDataset d = new DefaultPieDataset();
        d.setValue("A", 10.0);
        p.setDataset(d);
        Assert.assertEquals(d, p.getDataset());

        p.setDataset(null);
        Assert.assertNull(p.getDataset());
    }

    @Test
    public void testGetSetPieIndex() {
        this.plot.setPieIndex(5);
        Assert.assertEquals(5, this.plot.getPieIndex());
    }

    @Test
    public void testGetSetStartAngle() {
        this.plot.setStartAngle(180.0);
        Assert.assertEquals(180.0, this.plot.getStartAngle(), 0.0001);
    }

    @Test
    public void testGetSetDirection() {
        this.plot.setDirection(Rotation.ANTICLOCKWISE);
        Assert.assertEquals(Rotation.ANTICLOCKWISE, this.plot.getDirection());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirection_Null_ThrowsException() {
        this.plot.setDirection(null);
    }

    @Test
    public void testGetSetInteriorGap() {
        this.plot.setInteriorGap(0.20);
        Assert.assertEquals(0.20, this.plot.getInteriorGap(), 0.0001);

        this.plot.setInteriorGap(0.0);
        Assert.assertEquals(0.0, this.plot.getInteriorGap(), 0.0001);

        this.plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP);
        Assert.assertEquals(PiePlot.MAX_INTERIOR_GAP, this.plot.getInteriorGap(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_Negative_ThrowsException() {
        this.plot.setInteriorGap(-0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_TooLarge_ThrowsException() {
        this.plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP + 0.01);
    }

    @Test
    public void testGetSetCircular() {
        this.plot.setCircular(false);
        Assert.assertFalse(this.plot.isCircular());

        this.plot.setCircular(true, false);
        Assert.assertTrue(this.plot.isCircular());

        this.plot.setCircular(false, true);
        Assert.assertFalse(this.plot.isCircular());
    }

    @Test
    public void testGetSetIgnoreNullValues() {
        this.plot.setIgnoreNullValues(true);
        Assert.assertTrue(this.plot.getIgnoreNullValues());
        this.plot.setIgnoreNullValues(false);
        Assert.assertFalse(this.plot.getIgnoreNullValues());
    }

    @Test
    public void testGetSetIgnoreZeroValues() {
        this.plot.setIgnoreZeroValues(true);
        Assert.assertTrue(this.plot.getIgnoreZeroValues());
        this.plot.setIgnoreZeroValues(false);
        Assert.assertFalse(this.plot.getIgnoreZeroValues());
    }

    @Test
    public void testSectionPaintAndLookup() {
        this.plot.setSectionPaint("Section 1", Color.red);
        Assert.assertEquals(Color.red, this.plot.getSectionPaint("Section 1"));
        Assert.assertEquals(Color.red, this.plot.lookupSectionPaint("Section 1"));

        this.plot.setBaseSectionPaint(Color.blue);
        Assert.assertEquals(Color.blue, this.plot.getBaseSectionPaint());
        Assert.assertEquals(Color.blue, this.plot.lookupSectionPaint("Unknown Key", false));

        Paint autoPaint = this.plot.lookupSectionPaint("New Key", true);
        Assert.assertNotNull(autoPaint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionPaint_Null_ThrowsException() {
        this.plot.setBaseSectionPaint(null);
    }

    @Test
    public void testGetSetSectionOutlinesVisible() {
        this.plot.setSectionOutlinesVisible(false);
        Assert.assertFalse(this.plot.getSectionOutlinesVisible());
        this.plot.setSectionOutlinesVisible(true);
        Assert.assertTrue(this.plot.getSectionOutlinesVisible());
    }

    @Test
    public void testSectionOutlinePaintAndLookup() {
        this.plot.setSectionOutlinePaint("Section 1", Color.green);
        Assert.assertEquals(Color.green, this.plot.getSectionOutlinePaint("Section 1"));
        Assert.assertEquals(Color.green, this.plot.lookupSectionOutlinePaint("Section 1"));

        this.plot.setBaseSectionOutlinePaint(Color.yellow);
        Assert.assertEquals(Color.yellow, this.plot.getBaseSectionOutlinePaint());
        Assert.assertEquals(Color.yellow, this.plot.lookupSectionOutlinePaint("Unknown Key", false));

        Paint autoPaint = this.plot.lookupSectionOutlinePaint("New Key", true);
        Assert.assertNotNull(autoPaint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlinePaint_Null_ThrowsException() {
        this.plot.setBaseSectionOutlinePaint(null);
    }

    @Test
    public void testSectionOutlineStrokeAndLookup() {
        Stroke stroke = new BasicStroke(2.0f);
        this.plot.setSectionOutlineStroke("Section 1", stroke);
        Assert.assertEquals(stroke, this.plot.getSectionOutlineStroke("Section 1"));
        Assert.assertEquals(stroke, this.plot.lookupSectionOutlineStroke("Section 1"));

        Stroke baseStroke = new BasicStroke(3.0f);
        this.plot.setBaseSectionOutlineStroke(baseStroke);
        Assert.assertEquals(baseStroke, this.plot.getBaseSectionOutlineStroke());
        Assert.assertEquals(baseStroke, this.plot.lookupSectionOutlineStroke("Unknown Key", false));

        Stroke autoStroke = this.plot.lookupSectionOutlineStroke("New Key", true);
        Assert.assertNotNull(autoStroke);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlineStroke_Null_ThrowsException() {
        this.plot.setBaseSectionOutlineStroke(null);
    }

    @Test
    public void testGetSetShadowProperties() {
        this.plot.setShadowPaint(Color.darkGray);
        Assert.assertEquals(Color.darkGray, this.plot.getShadowPaint());
        this.plot.setShadowPaint(null);
        Assert.assertNull(this.plot.getShadowPaint());

        this.plot.setShadowXOffset(6.0);
        Assert.assertEquals(6.0, this.plot.getShadowXOffset(), 0.0001);

        this.plot.setShadowYOffset(7.0);
        Assert.assertEquals(7.0, this.plot.getShadowYOffset(), 0.0001);
    }

    @Test
    public void testExplodePercentages() {
        Assert.assertEquals(0.0, this.plot.getExplodePercent("Section 1"), 0.0001);
        this.plot.setExplodePercent("Section 1", 0.30);
        Assert.assertEquals(0.30, this.plot.getExplodePercent("Section 1"), 0.0001);
        Assert.assertEquals(0.30, this.plot.getMaximumExplodePercent(), 0.0001);

        this.plot.setExplodePercent("Section 2", 0.50);
        Assert.assertEquals(0.50, this.plot.getMaximumExplodePercent(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetExplodePercent_NullKey_ThrowsException() {
        this.plot.setExplodePercent(null, 0.2);
    }

    @Test
    public void testGetSetLabelProperties() {
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator("{0}");
        this.plot.setLabelGenerator(gen);
        Assert.assertEquals(gen, this.plot.getLabelGenerator());
        this.plot.setLabelGenerator(null);
        Assert.assertNull(this.plot.getLabelGenerator());

        this.plot.setLabelGap(0.05);
        Assert.assertEquals(0.05, this.plot.getLabelGap(), 0.0001);

        this.plot.setMaximumLabelWidth(0.25);
        Assert.assertEquals(0.25, this.plot.getMaximumLabelWidth(), 0.0001);

        this.plot.setLabelLinksVisible(false);
        Assert.assertFalse(this.plot.getLabelLinksVisible());

        this.plot.setLabelLinkMargin(0.03);
        Assert.assertEquals(0.03, this.plot.getLabelLinkMargin(), 0.0001);

        this.plot.setLabelLinkPaint(Color.magenta);
        Assert.assertEquals(Color.magenta, this.plot.getLabelLinkPaint());

        Stroke linkStroke = new BasicStroke(1.5f);
        this.plot.setLabelLinkStroke(linkStroke);
        Assert.assertEquals(linkStroke, this.plot.getLabelLinkStroke());

        Font font = new Font("Dialog", Font.BOLD, 12);
        this.plot.setLabelFont(font);
        Assert.assertEquals(font, this.plot.getLabelFont());

        this.plot.setLabelPaint(Color.cyan);
        Assert.assertEquals(Color.cyan, this.plot.getLabelPaint());

        this.plot.setLabelBackgroundPaint(Color.white);
        Assert.assertEquals(Color.white, this.plot.getLabelBackgroundPaint());

        this.plot.setLabelOutlinePaint(Color.black);
        Assert.assertEquals(Color.black, this.plot.getLabelOutlinePaint());

        Stroke outlineStroke = new BasicStroke(1.0f);
        this.plot.setLabelOutlineStroke(outlineStroke);
        Assert.assertEquals(outlineStroke, this.plot.getLabelOutlineStroke());

        this.plot.setLabelShadowPaint(Color.lightGray);
        Assert.assertEquals(Color.lightGray, this.plot.getLabelShadowPaint());

        RectangleInsets padding = new RectangleInsets(3, 3, 3, 3);
        this.plot.setLabelPadding(padding);
        Assert.assertEquals(padding, this.plot.getLabelPadding());

        this.plot.setSimpleLabels(true);
        Assert.assertTrue(this.plot.getSimpleLabels());

        RectangleInsets offset = new RectangleInsets(UnitType.RELATIVE, 0.1, 0.1, 0.1, 0.1);
        this.plot.setSimpleLabelOffset(offset);
        Assert.assertEquals(offset, this.plot.getSimpleLabelOffset());

        PieLabelDistributor dist = new PieLabelDistributor(5);
        this.plot.setLabelDistributor(dist);
        Assert.assertEquals(dist, this.plot.getLabelDistributor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkPaint_Null_ThrowsException() {
        this.plot.setLabelLinkPaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkStroke_Null_ThrowsException() {
        this.plot.setLabelLinkStroke(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_Null_ThrowsException() {
        this.plot.setLabelFont(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_Null_ThrowsException() {
        this.plot.setLabelPaint(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPadding_Null_ThrowsException() {
        this.plot.setLabelPadding(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSimpleLabelOffset_Null_ThrowsException() {
        this.plot.setSimpleLabelOffset(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelDistributor_Null_ThrowsException() {
        this.plot.setLabelDistributor(null);
    }

    @Test
    public void testToolTipAndUrlGenerators() {
        StandardPieToolTipGenerator ttGen = new StandardPieToolTipGenerator();
        this.plot.setToolTipGenerator(ttGen);
        Assert.assertEquals(ttGen, this.plot.getToolTipGenerator());

        StandardPieURLGenerator urlGen = new StandardPieURLGenerator();
        this.plot.setURLGenerator(urlGen);
        Assert.assertEquals(urlGen, this.plot.getURLGenerator());

        this.plot.setMinimumArcAngleToDraw(0.01);
        Assert.assertEquals(0.01, this.plot.getMinimumArcAngleToDraw(), 0.0001);
    }

    @Test
    public void testLegendProperties() {
        Rectangle rect = new Rectangle(0, 0, 10, 10);
        this.plot.setLegendItemShape(rect);
        Assert.assertEquals(rect, this.plot.getLegendItemShape());

        StandardPieSectionLabelGenerator labelGen = new StandardPieSectionLabelGenerator("{0}");
        this.plot.setLegendLabelGenerator(labelGen);
        Assert.assertEquals(labelGen, this.plot.getLegendLabelGenerator());

        StandardPieSectionLabelGenerator ttGen = new StandardPieSectionLabelGenerator("{1}");
        this.plot.setLegendLabelToolTipGenerator(ttGen);
        Assert.assertEquals(ttGen, this.plot.getLegendLabelToolTipGenerator());

        StandardPieURLGenerator urlGen = new StandardPieURLGenerator();
        this.plot.setLegendLabelURLGenerator(urlGen);
        Assert.assertEquals(urlGen, this.plot.getLegendLabelURLGenerator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemShape_Null_ThrowsException() {
        this.plot.setLegendItemShape(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendLabelGenerator_Null_ThrowsException() {
        this.plot.setLegendLabelGenerator(null);
    }

    @Test
    public void testGetLegendItems() {
        this.dataset.setValue("Zero", 0.0);
        this.dataset.setValue("Null", null);

        this.plot.setIgnoreZeroValues(false);
        this.plot.setIgnoreNullValues(false);
        this.plot.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator());
        this.plot.setLegendLabelURLGenerator(new StandardPieURLGenerator());
        LegendItemCollection items = this.plot.getLegendItems();
        Assert.assertEquals(4, items.getItemCount());

        this.plot.setIgnoreZeroValues(true);
        this.plot.setIgnoreNullValues(true);
        items = this.plot.getLegendItems();
        Assert.assertEquals(2, items.getItemCount());

        this.plot.setDataset(null);
        Assert.assertEquals(0, this.plot.getLegendItems().getItemCount());
    }

    @Test
    public void testGetPlotType() {
        Assert.assertNotNull(this.plot.getPlotType());
    }

    @Test
    public void testGetSectionKey() {
        Assert.assertEquals("Section 1", this.plot.getSectionKey(0));
        Assert.assertEquals("Section 2", this.plot.getSectionKey(1));
        Assert.assertEquals(new Integer(2), this.plot.getSectionKey(2));
        Assert.assertEquals(new Integer(-1), this.plot.getSectionKey(-1));

        PiePlot nullPlot = new PiePlot(null);
        Assert.assertEquals(new Integer(0), nullPlot.getSectionKey(0));
    }

    @Test
    public void testDrawMethods() {
        BufferedImage img = new BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 300);
        ChartRenderingInfo info = new ChartRenderingInfo();

        // 1. Draw normal clockwise
        this.plot.draw(g2, area, new Point2D.Double(10, 10), null, info.getPlotInfo());

        // 2. Draw with exploded section and anticlockwise
        this.plot.setExplodePercent("Section 1", 0.3);
        this.plot.setDirection(Rotation.ANTICLOCKWISE);
        this.plot.setToolTipGenerator(new StandardPieToolTipGenerator());
        this.plot.setURLGenerator(new StandardPieURLGenerator());
        this.plot.draw(g2, area, null, null, info.getPlotInfo());

        // 3. Draw with simple labels
        this.plot.setSimpleLabels(true);
        this.plot.draw(g2, area, null, null, info.getPlotInfo());

        // 4. Draw non-circular
        this.plot.setCircular(false);
        this.plot.setSimpleLabels(false);
        this.plot.draw(g2, area, null, null, info.getPlotInfo());

        // 5. Draw empty dataset / null dataset
        this.plot.setDataset(new DefaultPieDataset());
        this.plot.draw(g2, area, null, null, info.getPlotInfo());

        this.plot.setDataset(null);
        this.plot.draw(g2, area, null, null, info.getPlotInfo());

        g2.dispose();
    }

    @Test
    public void testEqualsAndHashCode() {
        PiePlot p1 = new PiePlot(this.dataset);
        PiePlot p2 = new PiePlot(this.dataset);
        Assert.assertTrue(p1.equals(p2));
        Assert.assertTrue(p2.equals(p1));

        p1.setPieIndex(1);
        Assert.assertFalse(p1.equals(p2));
        p2.setPieIndex(1);
        Assert.assertTrue(p1.equals(p2));

        p1.setInteriorGap(0.12);
        Assert.assertFalse(p1.equals(p2));
        p2.setInteriorGap(0.12);
        Assert.assertTrue(p1.equals(p2));

        p1.setCircular(false);
        Assert.assertFalse(p1.equals(p2));
        p2.setCircular(false);
        Assert.assertTrue(p1.equals(p2));

        p1.setStartAngle(45.0);
        Assert.assertFalse(p1.equals(p2));
        p2.setStartAngle(45.0);
        Assert.assertTrue(p1.equals(p2));

        p1.setDirection(Rotation.ANTICLOCKWISE);
        Assert.assertFalse(p1.equals(p2));
        p2.setDirection(Rotation.ANTICLOCKWISE);
        Assert.assertTrue(p1.equals(p2));

        p1.setIgnoreZeroValues(true);
        Assert.assertFalse(p1.equals(p2));
        p2.setIgnoreZeroValues(true);
        Assert.assertTrue(p1.equals(p2));

        p1.setIgnoreNullValues(true);
        Assert.assertFalse(p1.equals(p2));
        p2.setIgnoreNullValues(true);
        Assert.assertTrue(p1.equals(p2));

        p1.setSectionPaint("Section 1", Color.red);
        Assert.assertFalse(p1.equals(p2));
        p2.setSectionPaint("Section 1", Color.red);
        Assert.assertTrue(p1.equals(p2));

        p1.setBaseSectionPaint(Color.pink);
        Assert.assertFalse(p1.equals(p2));
        p2.setBaseSectionPaint(Color.pink);
        Assert.assertTrue(p1.equals(p2));

        p1.setSectionOutlinesVisible(false);
        Assert.assertFalse(p1.equals(p2));
        p2.setSectionOutlinesVisible(false);
        Assert.assertTrue(p1.equals(p2));

        p1.setSectionOutlinePaint("Section 1", Color.blue);
        Assert.assertFalse(p1.equals(p2));
        p2.setSectionOutlinePaint("Section 1", Color.blue);
        Assert.assertTrue(p1.equals(p2));

        p1.setBaseSectionOutlinePaint(Color.blue);
        Assert.assertFalse(p1.equals(p2));
        p2.setBaseSectionOutlinePaint(Color.blue);
        Assert.assertTrue(p1.equals(p2));

        p1.setSectionOutlineStroke("Section 1", new BasicStroke(2.0f));
        Assert.assertFalse(p1.equals(p2));
        p2.setSectionOutlineStroke("Section 1", new BasicStroke(2.0f));
        Assert.assertTrue(p1.equals(p2));

        p1.setBaseSectionOutlineStroke(new BasicStroke(4.0f));
        Assert.assertFalse(p1.equals(p2));
        p2.setBaseSectionOutlineStroke(new BasicStroke(4.0f));
        Assert.assertTrue(p1.equals(p2));

        p1.setShadowPaint(Color.black);
        Assert.assertFalse(p1.equals(p2));
        p2.setShadowPaint(Color.black);
        Assert.assertTrue(p1.equals(p2));

        p1.setShadowXOffset(8.0);
        Assert.assertFalse(p1.equals(p2));
        p2.setShadowXOffset(8.0);
        Assert.assertTrue(p1.equals(p2));

        p1.setShadowYOffset(8.0);
        Assert.assertFalse(p1.equals(p2));
        p2.setShadowYOffset(8.0);
        Assert.assertTrue(p1.equals(p2));

        p1.setExplodePercent("Section 1", 0.25);
        Assert.assertFalse(p1.equals(p2));
        p2.setExplodePercent("Section 1", 0.25);
        Assert.assertTrue(p1.equals(p2));

        p1.setLabelGenerator(null);
        Assert.assertFalse(p1.equals(p2));
        p2.setLabelGenerator(null);
        Assert.assertTrue(p1.equals(p2));

        p1.setSimpleLabels(true);
        Assert.assertFalse(p1.equals(p2));
        p2.setSimpleLabels(true);
        Assert.assertTrue(p1.equals(p2));

        Assert.assertFalse(p1.equals(null));
        Assert.assertFalse(p1.equals("A String"));
    }

    @Test
    public void testCloning() throws CloneNotSupportedException {
        this.plot.setSectionPaint("Section 1", Color.red);
        this.plot.setExplodePercent("Section 1", 0.2);
        this.plot.setURLGenerator(new CustomPieURLGenerator());
        this.plot.setLegendLabelURLGenerator(new CustomPieURLGenerator());
        this.plot.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator());

        PiePlot clone = (PiePlot) this.plot.clone();
        Assert.assertNotSame(this.plot, clone);
        Assert.assertSame(this.plot.getClass(), clone.getClass());
        Assert.assertEquals(this.plot, clone);
    }

    @Test
    public void testSerialization() throws Exception {
        this.plot.setSectionPaint("Section 1", Color.red);
        this.plot.setExplodePercent("Section 1", 0.15);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.plot);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        PiePlot deserialized = (PiePlot) in.readObject();
        in.close();

        Assert.assertEquals(this.plot, deserialized);
    }

    @Test
    public void testGetArcBounds() {
        Rectangle2D unexploded = new Rectangle2D.Double(10, 10, 100, 100);
        Rectangle2D exploded = new Rectangle2D.Double(0, 0, 120, 120);

        Rectangle2D r1 = this.plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 0.0);
        Assert.assertEquals(unexploded, r1);

        Rectangle2D r2 = this.plot.getArcBounds(unexploded, exploded, 0.0, 90.0, 0.5);
        Assert.assertNotNull(r2);
        Assert.assertNotEquals(unexploded, r2);
    }
}
