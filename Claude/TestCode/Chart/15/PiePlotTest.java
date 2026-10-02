package org.jfree.chart.plot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.UnitType;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.junit.Before;
import org.junit.Test;

public class PiePlotTest {

    private PiePlot plot;

    @Before
    public void setUp() {
        this.plot = new PiePlot();
    }

    private DefaultPieDataset createSampleDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", 20.0);
        dataset.setValue("C", 30.0);
        return dataset;
    }

    // ---------- Constructors ----------

    @Test
    public void testDefaultConstructor_datasetIsNull() {
        PiePlot p = new PiePlot();
        assertNull(p.getDataset());
    }

    @Test
    public void testConstructorWithDataset_datasetIsSet() {
        DefaultPieDataset dataset = createSampleDataset();
        PiePlot p = new PiePlot(dataset);
        assertEquals(dataset, p.getDataset());
    }

    // ---------- Dataset ----------

    @Test
    public void testSetDataset_normal_getReturnsSame() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        assertEquals(dataset, this.plot.getDataset());
    }

    @Test
    public void testSetDataset_null_getReturnsNull() {
        this.plot.setDataset(createSampleDataset());
        this.plot.setDataset(null);
        assertNull(this.plot.getDataset());
    }

    // ---------- Pie index ----------

    @Test
    public void testGetSetPieIndex_normal() {
        this.plot.setPieIndex(5);
        assertEquals(5, this.plot.getPieIndex());
    }

    // ---------- Start angle ----------

    @Test
    public void testGetSetStartAngle_normal() {
        this.plot.setStartAngle(45.0);
        assertEquals(45.0, this.plot.getStartAngle(), 0.0001);
    }

    @Test
    public void testGetStartAngle_default() {
        PiePlot p = new PiePlot();
        assertEquals(PiePlot.DEFAULT_START_ANGLE, p.getStartAngle(), 0.0001);
    }

    // ---------- Direction ----------

    @Test
    public void testGetSetDirection_normal() {
        this.plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, this.plot.getDirection());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDirection_null_throwsException() {
        this.plot.setDirection(null);
    }

    // ---------- Interior gap ----------

    @Test
    public void testGetSetInteriorGap_normal() {
        this.plot.setInteriorGap(0.1);
        assertEquals(0.1, this.plot.getInteriorGap(), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_negative_throwsException() {
        this.plot.setInteriorGap(-0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInteriorGap_tooLarge_throwsException() {
        this.plot.setInteriorGap(PiePlot.MAX_INTERIOR_GAP + 0.1);
    }

    @Test
    public void testSetInteriorGap_sameValue_noExceptionNoChange() {
        double gap = this.plot.getInteriorGap();
        this.plot.setInteriorGap(gap);
        assertEquals(gap, this.plot.getInteriorGap(), 0.0001);
    }

    // ---------- Circular ----------

    @Test
    public void testIsSetCircular_normal() {
        this.plot.setCircular(false);
        assertFalse(this.plot.isCircular());
        this.plot.setCircular(true);
        assertTrue(this.plot.isCircular());
    }

    @Test
    public void testSetCircular_withNotifyFlag() {
        this.plot.setCircular(false, false);
        assertFalse(this.plot.isCircular());
    }

    // ---------- Ignore null / zero values ----------

    @Test
    public void testGetSetIgnoreNullValues_normal() {
        this.plot.setIgnoreNullValues(true);
        assertTrue(this.plot.getIgnoreNullValues());
    }

    @Test
    public void testGetSetIgnoreZeroValues_normal() {
        this.plot.setIgnoreZeroValues(true);
        assertTrue(this.plot.getIgnoreZeroValues());
    }

    // ---------- Section Paint ----------

    @Test
    public void testGetSetSectionPaint_normal() {
        this.plot.setSectionPaint("A", Color.RED);
        assertEquals(Color.RED, this.plot.getSectionPaint("A"));
    }

    @Test
    public void testGetSectionPaint_notSet_returnsNull() {
        assertNull(this.plot.getSectionPaint("Unknown"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSectionPaint_nullKey_throwsException() {
        this.plot.getSectionPaint(null);
    }

    // ---------- Base Section Paint ----------

    @Test
    public void testGetSetBaseSectionPaint_normal() {
        this.plot.setBaseSectionPaint(Color.BLUE);
        assertEquals(Color.BLUE, this.plot.getBaseSectionPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionPaint_null_throwsException() {
        this.plot.setBaseSectionPaint(null);
    }

    // ---------- Section Outlines Visible ----------

    @Test
    public void testGetSetSectionOutlinesVisible_normal() {
        this.plot.setSectionOutlinesVisible(false);
        assertFalse(this.plot.getSectionOutlinesVisible());
    }

    // ---------- Section Outline Paint ----------

    @Test
    public void testGetSetSectionOutlinePaint_normal() {
        this.plot.setSectionOutlinePaint("A", Color.GREEN);
        assertEquals(Color.GREEN, this.plot.getSectionOutlinePaint("A"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSectionOutlinePaint_nullKey_throwsException() {
        this.plot.getSectionOutlinePaint(null);
    }

    // ---------- Base Section Outline Paint ----------

    @Test
    public void testGetSetBaseSectionOutlinePaint_normal() {
        this.plot.setBaseSectionOutlinePaint(Color.YELLOW);
        assertEquals(Color.YELLOW, this.plot.getBaseSectionOutlinePaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlinePaint_null_throwsException() {
        this.plot.setBaseSectionOutlinePaint(null);
    }

    // ---------- Section Outline Stroke ----------

    @Test
    public void testGetSetSectionOutlineStroke_normal() {
        BasicStroke stroke = new BasicStroke(2.0f);
        this.plot.setSectionOutlineStroke("A", stroke);
        assertEquals(stroke, this.plot.getSectionOutlineStroke("A"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSectionOutlineStroke_nullKey_throwsException() {
        this.plot.getSectionOutlineStroke(null);
    }

    // ---------- Base Section Outline Stroke ----------

    @Test
    public void testGetSetBaseSectionOutlineStroke_normal() {
        BasicStroke stroke = new BasicStroke(3.0f);
        this.plot.setBaseSectionOutlineStroke(stroke);
        assertEquals(stroke, this.plot.getBaseSectionOutlineStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBaseSectionOutlineStroke_null_throwsException() {
        this.plot.setBaseSectionOutlineStroke(null);
    }

    // ---------- Shadow Paint ----------

    @Test
    public void testGetSetShadowPaint_normal() {
        this.plot.setShadowPaint(Color.LIGHT_GRAY);
        assertEquals(Color.LIGHT_GRAY, this.plot.getShadowPaint());
    }

    @Test
    public void testSetShadowPaint_null_allowed() {
        this.plot.setShadowPaint(null);
        assertNull(this.plot.getShadowPaint());
    }

    // ---------- Shadow Offsets ----------

    @Test
    public void testGetSetShadowXOffset_normal() {
        this.plot.setShadowXOffset(10.0);
        assertEquals(10.0, this.plot.getShadowXOffset(), 0.0001);
    }

    @Test
    public void testGetSetShadowYOffset_normal() {
        this.plot.setShadowYOffset(-5.0);
        assertEquals(-5.0, this.plot.getShadowYOffset(), 0.0001);
    }

    // ---------- Explode Percent ----------

    @Test
    public void testGetSetExplodePercent_normal() {
        this.plot.setExplodePercent("A", 0.3);
        assertEquals(0.3, this.plot.getExplodePercent("A"), 0.0001);
    }

    @Test
    public void testGetExplodePercent_notSet_returnsZero() {
        assertEquals(0.0, this.plot.getExplodePercent("Unknown"), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetExplodePercent_nullKey_throwsException() {
        this.plot.setExplodePercent(null, 0.1);
    }

    // ---------- Maximum Explode Percent ----------

    @Test
    public void testGetMaximumExplodePercent_normal() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        this.plot.setExplodePercent("A", 0.2);
        this.plot.setExplodePercent("B", 0.5);
        assertEquals(0.5, this.plot.getMaximumExplodePercent(), 0.0001);
    }

    @Test
    public void testGetMaximumExplodePercent_noExplode_returnsZero() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        assertEquals(0.0, this.plot.getMaximumExplodePercent(), 0.0001);
    }

    // ---------- Label Generator ----------

    @Test
    public void testGetSetLabelGenerator_normal() {
        this.plot.setLabelGenerator(null);
        assertNull(this.plot.getLabelGenerator());
    }

    // ---------- Label Gap ----------

    @Test
    public void testGetSetLabelGap_normal() {
        this.plot.setLabelGap(0.05);
        assertEquals(0.05, this.plot.getLabelGap(), 0.0001);
    }

    // ---------- Maximum Label Width ----------

    @Test
    public void testGetSetMaximumLabelWidth_normal() {
        this.plot.setMaximumLabelWidth(0.25);
        assertEquals(0.25, this.plot.getMaximumLabelWidth(), 0.0001);
    }

    // ---------- Label Links Visible ----------

    @Test
    public void testGetSetLabelLinksVisible_normal() {
        this.plot.setLabelLinksVisible(false);
        assertFalse(this.plot.getLabelLinksVisible());
    }

    // ---------- Label Link Margin ----------

    @Test
    public void testGetSetLabelLinkMargin_normal() {
        this.plot.setLabelLinkMargin(0.1);
        assertEquals(0.1, this.plot.getLabelLinkMargin(), 0.0001);
    }

    // ---------- Label Link Paint ----------

    @Test
    public void testGetSetLabelLinkPaint_normal() {
        this.plot.setLabelLinkPaint(Color.RED);
        assertEquals(Color.RED, this.plot.getLabelLinkPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkPaint_null_throwsException() {
        this.plot.setLabelLinkPaint(null);
    }

    // ---------- Label Link Stroke ----------

    @Test
    public void testGetSetLabelLinkStroke_normal() {
        BasicStroke stroke = new BasicStroke(1.5f);
        this.plot.setLabelLinkStroke(stroke);
        assertEquals(stroke, this.plot.getLabelLinkStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelLinkStroke_null_throwsException() {
        this.plot.setLabelLinkStroke(null);
    }

    // ---------- Label Font ----------

    @Test
    public void testGetSetLabelFont_normal() {
        Font font = new Font("Serif", Font.BOLD, 12);
        this.plot.setLabelFont(font);
        assertEquals(font, this.plot.getLabelFont());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelFont_null_throwsException() {
        this.plot.setLabelFont(null);
    }

    // ---------- Label Paint ----------

    @Test
    public void testGetSetLabelPaint_normal() {
        this.plot.setLabelPaint(Color.MAGENTA);
        assertEquals(Color.MAGENTA, this.plot.getLabelPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPaint_null_throwsException() {
        this.plot.setLabelPaint(null);
    }

    // ---------- Label Background Paint ----------

    @Test
    public void testGetSetLabelBackgroundPaint_normal() {
        this.plot.setLabelBackgroundPaint(Color.WHITE);
        assertEquals(Color.WHITE, this.plot.getLabelBackgroundPaint());
    }

    @Test
    public void testSetLabelBackgroundPaint_null_allowed() {
        this.plot.setLabelBackgroundPaint(null);
        assertNull(this.plot.getLabelBackgroundPaint());
    }

    // ---------- Label Outline Paint ----------

    @Test
    public void testGetSetLabelOutlinePaint_normal() {
        this.plot.setLabelOutlinePaint(Color.BLACK);
        assertEquals(Color.BLACK, this.plot.getLabelOutlinePaint());
    }

    @Test
    public void testSetLabelOutlinePaint_null_allowed() {
        this.plot.setLabelOutlinePaint(null);
        assertNull(this.plot.getLabelOutlinePaint());
    }

    // ---------- Label Outline Stroke ----------

    @Test
    public void testGetSetLabelOutlineStroke_normal() {
        BasicStroke stroke = new BasicStroke(0.75f);
        this.plot.setLabelOutlineStroke(stroke);
        assertEquals(stroke, this.plot.getLabelOutlineStroke());
    }

    @Test
    public void testSetLabelOutlineStroke_null_allowed() {
        this.plot.setLabelOutlineStroke(null);
        assertNull(this.plot.getLabelOutlineStroke());
    }

    // ---------- Label Shadow Paint ----------

    @Test
    public void testGetSetLabelShadowPaint_normal() {
        this.plot.setLabelShadowPaint(Color.GRAY);
        assertEquals(Color.GRAY, this.plot.getLabelShadowPaint());
    }

    @Test
    public void testSetLabelShadowPaint_null_allowed() {
        this.plot.setLabelShadowPaint(null);
        assertNull(this.plot.getLabelShadowPaint());
    }

    // ---------- Label Padding ----------

    @Test
    public void testGetSetLabelPadding_normal() {
        RectangleInsets insets = new RectangleInsets(1, 1, 1, 1);
        this.plot.setLabelPadding(insets);
        assertEquals(insets, this.plot.getLabelPadding());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelPadding_null_throwsException() {
        this.plot.setLabelPadding(null);
    }

    // ---------- Simple Labels ----------

    @Test
    public void testGetSetSimpleLabels_normal() {
        this.plot.setSimpleLabels(true);
        assertTrue(this.plot.getSimpleLabels());
        this.plot.setSimpleLabels(false);
        assertFalse(this.plot.getSimpleLabels());
    }

    // ---------- Simple Label Offset ----------

    @Test
    public void testGetSetSimpleLabelOffset_normal() {
        RectangleInsets offset = new RectangleInsets(UnitType.RELATIVE, 
                0.1, 0.1, 0.1, 0.1);
        this.plot.setSimpleLabelOffset(offset);
        assertEquals(offset, this.plot.getSimpleLabelOffset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSimpleLabelOffset_null_throwsException() {
        this.plot.setSimpleLabelOffset(null);
    }

    // ---------- Label Distributor ----------

    @Test
    public void testGetSetLabelDistributor_normal() {
        AbstractPieLabelDistributor distributor = new PieLabelDistributor(0);
        this.plot.setLabelDistributor(distributor);
        assertEquals(distributor, this.plot.getLabelDistributor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLabelDistributor_null_throwsException() {
        this.plot.setLabelDistributor(null);
    }

    // ---------- Tool Tip Generator ----------

    @Test
    public void testGetSetToolTipGenerator_normal() {
        assertNull(this.plot.getToolTipGenerator());
        this.plot.setToolTipGenerator(null);
        assertNull(this.plot.getToolTipGenerator());
    }

    // ---------- URL Generator ----------

    @Test
    public void testGetSetURLGenerator_normal() {
        assertNull(this.plot.getURLGenerator());
        this.plot.setURLGenerator(null);
        assertNull(this.plot.getURLGenerator());
    }

    // ---------- Minimum Arc Angle To Draw ----------

    @Test
    public void testGetSetMinimumArcAngleToDraw_normal() {
        this.plot.setMinimumArcAngleToDraw(0.001);
        assertEquals(0.001, this.plot.getMinimumArcAngleToDraw(), 0.0000001);
    }

    // ---------- Legend Item Shape ----------

    @Test
    public void testGetSetLegendItemShape_normal() {
        Shape shape = new Ellipse2D.Double(0, 0, 10, 10);
        this.plot.setLegendItemShape(shape);
        assertEquals(shape, this.plot.getLegendItemShape());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendItemShape_null_throwsException() {
        this.plot.setLegendItemShape(null);
    }

    // ---------- Legend Label Generator ----------

    @Test
    public void testGetSetLegendLabelGenerator_normal() {
        assertNotNull(this.plot.getLegendLabelGenerator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLegendLabelGenerator_null_throwsException() {
        this.plot.setLegendLabelGenerator(null);
    }

    // ---------- Legend Label Tool Tip Generator ----------

    @Test
    public void testGetSetLegendLabelToolTipGenerator_normal() {
        assertNull(this.plot.getLegendLabelToolTipGenerator());
        this.plot.setLegendLabelToolTipGenerator(null);
        assertNull(this.plot.getLegendLabelToolTipGenerator());
    }

    // ---------- Legend Label URL Generator ----------

    @Test
    public void testGetSetLegendLabelURLGenerator_normal() {
        assertNull(this.plot.getLegendLabelURLGenerator());
        this.plot.setLegendLabelURLGenerator(null);
        assertNull(this.plot.getLegendLabelURLGenerator());
    }

    // ---------- Initialise ----------

    @Test
    public void testInitialise_normal_returnsState() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(200, 200, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        PiePlotState state = this.plot.initialise(g2, area, this.plot, 
                null, null);
        assertNotNull(state);
        assertEquals(2, state.getPassesRequired());
        g2.dispose();
    }

    // ---------- Draw ----------

    @Test
    public void testDraw_withData_noException() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        ChartRenderingInfo info = new ChartRenderingInfo();
        PlotRenderingInfo plotInfo = new PlotRenderingInfo(info);
        this.plot.draw(g2, area, (Point2D) null, null, plotInfo);
        g2.dispose();
        assertNotNull(plotInfo.getPlotArea());
    }

    @Test
    public void testDraw_emptyDataset_noException() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        this.plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_nullDataset_noException() {
        this.plot.setDataset(null);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withSimpleLabels_noException() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        this.plot.setSimpleLabels(true);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withNullValueInDataset_noException() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", null);
        dataset.setValue("C", 0.0);
        this.plot.setDataset(dataset);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withAntiClockwiseDirection_noException() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        this.plot.setDirection(Rotation.ANTICLOCKWISE);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withExplodedSection_noException() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        this.plot.setExplodePercent("A", 0.3);
        BufferedImage image = new BufferedImage(300, 300, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 300, 300);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDraw_withNonCircular_noException() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        this.plot.setCircular(false);
        BufferedImage image = new BufferedImage(400, 200, 
                BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 400, 200);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    // ---------- getLegendItems ----------

    @Test
    public void testGetLegendItems_nullDataset_returnsEmptyCollection() {
        this.plot.setDataset(null);
        LegendItemCollection items = this.plot.getLegendItems();
        assertNotNull(items);
        assertEquals(0, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_normalDataset_returnsItems() {
        DefaultPieDataset dataset = createSampleDataset();
        this.plot.setDataset(dataset);
        LegendItemCollection items = this.plot.getLegendItems();
        assertNotNull(items);
        assertEquals(3, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_withNullAndZeroValues_ignoreFlags() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", null);
        dataset.setValue("C", 0.0);
        this.plot.setDataset(dataset);
        this.plot.setIgnoreNullValues(true);
        this.plot.setIgnoreZeroValues(true);
        LegendItemCollection items = this.plot.getLegendItems();
        assertEquals(1, items.getItemCount());
    }

    @Test
    public void testGetLegendItems_negativeValue_excluded() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", -5.0);
        this.plot.setDataset(dataset);
        LegendItemCollection items = this.plot.getLegendItems();
        assertEquals(1, items.getItemCount());
    }

    // ---------- getPlotType ----------

    @Test
    public void testGetPlotType_returnsNonNullString() {
        String type = this.plot.getPlotType();
        assertNotNull(type);
        assertFalse(type.length() == 0);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(this.plot.equals(this.plot));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(this.plot.equals("Not a PiePlot"));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(this.plot.equals(null));
    }

    @Test
    public void testEquals_equivalentPlots_true() {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = new PiePlot();
        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
    }

    @Test
    public void testEquals_differentStartAngle_false() {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = new PiePlot();
        p2.setStartAngle(123.0);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentPieIndex_false() {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = new PiePlot();
        p2.setPieIndex(9);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentCircular_false() {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = new PiePlot();
        p2.setCircular(false);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentDirection_false() {
        PiePlot p1 = new PiePlot();
        PiePlot p2 = new PiePlot();
        p2.setDirection(Rotation.ANTICLOCKWISE);
        assertFalse(p1.equals(p2));
    }

    // ---------- clone ----------

    @Test
    public void testClone_normal_producesEqualButDistinctObject() 
            throws CloneNotSupportedException {
        PiePlot original = new PiePlot(createSampleDataset());
        PiePlot cloned = (PiePlot) original.clone();
        assertNotSame(original, cloned);
        assertTrue(original.equals(cloned));
    }

    @Test
    public void testClone_withNullDataset_noException() {
        PiePlot original = new PiePlot();
        try {
            PiePlot cloned = (PiePlot) original.clone();
            assertNotNull(cloned);
        }
        catch (CloneNotSupportedException e) {
            fail("Should not throw CloneNotSupportedException");
        }
    }
}
