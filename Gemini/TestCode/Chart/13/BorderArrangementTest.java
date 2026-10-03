package org.jfree.chart.block;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class BorderArrangementTest {

    private Graphics2D g2;

    @Before
    public void setUp() {
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        this.g2 = image.createGraphics();
    }

    @Test
    public void testConstructor_default_createsInstance() {
        BorderArrangement arrangement = new BorderArrangement();
        assertNotNull(arrangement);
    }

    @Test
    public void testAdd_allEdgesAndNullKey_properlyConfigured() {
        BorderArrangement ba = new BorderArrangement();
        Block bTop = new EmptyBlock(10, 10);
        Block bBottom = new EmptyBlock(10, 10);
        Block bLeft = new EmptyBlock(10, 10);
        Block bRight = new EmptyBlock(10, 10);
        Block bCenter = new EmptyBlock(10, 10);

        ba.add(bTop, RectangleEdge.TOP);
        ba.add(bBottom, RectangleEdge.BOTTOM);
        ba.add(bLeft, RectangleEdge.LEFT);
        ba.add(bRight, RectangleEdge.RIGHT);
        ba.add(bCenter, null);

        BorderArrangement baExpected = new BorderArrangement();
        baExpected.add(bTop, RectangleEdge.TOP);
        baExpected.add(bBottom, RectangleEdge.BOTTOM);
        baExpected.add(bLeft, RectangleEdge.LEFT);
        baExpected.add(bRight, RectangleEdge.RIGHT);
        baExpected.add(bCenter, null);

        assertEquals(baExpected, ba);
    }

    @Test
    public void testAdd_unknownKey_doesNotThrow() {
        BorderArrangement ba = new BorderArrangement();
        ba.add(new EmptyBlock(10, 10), "UNKNOWN_KEY");
        BorderArrangement empty = new BorderArrangement();
        assertEquals(empty, ba);
    }

    @Test
    public void testClear_populatedArrangement_clearsAllBlocks() {
        BorderArrangement ba = new BorderArrangement();
        ba.add(new EmptyBlock(10, 10), RectangleEdge.TOP);
        ba.add(new EmptyBlock(10, 10), RectangleEdge.BOTTOM);
        ba.add(new EmptyBlock(10, 10), RectangleEdge.LEFT);
        ba.add(new EmptyBlock(10, 10), RectangleEdge.RIGHT);
        ba.add(new EmptyBlock(10, 10), null);

        ba.clear();
        assertEquals(new BorderArrangement(), ba);
    }

    @Test
    public void testEquals_variousScenarios_returnsExpected() {
        BorderArrangement ba1 = new BorderArrangement();
        BorderArrangement ba2 = new BorderArrangement();

        assertTrue(ba1.equals(ba1));
        assertFalse(ba1.equals(null));
        assertFalse(ba1.equals("Not an arrangement"));
        assertTrue(ba1.equals(ba2));

        Block b1 = new EmptyBlock(10, 10);
        Block b2 = new EmptyBlock(20, 20);

        ba1.add(b1, RectangleEdge.TOP);
        assertFalse(ba1.equals(ba2));
        ba2.add(b1, RectangleEdge.TOP);
        assertTrue(ba1.equals(ba2));

        ba1.add(b1, RectangleEdge.BOTTOM);
        assertFalse(ba1.equals(ba2));
        ba2.add(b1, RectangleEdge.BOTTOM);
        assertTrue(ba1.equals(ba2));

        ba1.add(b1, RectangleEdge.LEFT);
        assertFalse(ba1.equals(ba2));
        ba2.add(b1, RectangleEdge.LEFT);
        assertTrue(ba1.equals(ba2));

        ba1.add(b1, RectangleEdge.RIGHT);
        assertFalse(ba1.equals(ba2));
        ba2.add(b1, RectangleEdge.RIGHT);
        assertTrue(ba1.equals(ba2));

        ba1.add(b1, null);
        assertFalse(ba1.equals(ba2));
        ba2.add(b1, null);
        assertTrue(ba1.equals(ba2));

        BorderArrangement ba3 = new BorderArrangement();
        ba3.add(b2, RectangleEdge.TOP);
        assertFalse(ba1.equals(ba3));
    }

    @Test
    public void testArrange_widthNoneHeightNone_emptyContainer() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        Size2D size = container.arrange(this.g2, RectangleConstraint.NONE);
        assertEquals(0.0, size.getWidth(), 0.0001);
        assertEquals(0.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthNoneHeightNone_allBlocksPresent() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        Block top = new EmptyBlock(100.0, 20.0);
        Block bottom = new EmptyBlock(80.0, 25.0);
        Block left = new EmptyBlock(30.0, 40.0);
        Block right = new EmptyBlock(40.0, 50.0);
        Block center = new EmptyBlock(50.0, 30.0);

        container.add(top, RectangleEdge.TOP);
        container.add(bottom, RectangleEdge.BOTTOM);
        container.add(left, RectangleEdge.LEFT);
        container.add(right, RectangleEdge.RIGHT);
        container.add(center, null);

        Size2D size = container.arrange(this.g2, RectangleConstraint.NONE);
        // expected width: max(100, 80, 30 + 50 + 40) = 120.0
        // expected center height: max(max(40, 50), max(50, 30)) = 50.0
        // expected height: 20 + 25 + 50 = 95.0
        assertEquals(120.0, size.getWidth(), 0.0001);
        assertEquals(95.0, size.getHeight(), 0.0001);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_widthNoneHeightFixed_throwsException() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(
                0.0, null, LengthConstraintType.NONE,
                100.0, null, LengthConstraintType.FIXED
        );
        ba.arrange(container, this.g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_widthNoneHeightRange_throwsException() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(
                0.0, null, LengthConstraintType.NONE,
                0.0, new Range(50.0, 100.0), LengthConstraintType.RANGE
        );
        ba.arrange(container, this.g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_widthRangeHeightNone_throwsException() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(
                0.0, new Range(50.0, 100.0), LengthConstraintType.RANGE,
                0.0, null, LengthConstraintType.NONE
        );
        ba.arrange(container, this.g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_widthRangeHeightFixed_throwsException() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(
                0.0, new Range(50.0, 100.0), LengthConstraintType.RANGE,
                100.0, null, LengthConstraintType.FIXED
        );
        ba.arrange(container, this.g2, constraint);
    }

    @Test
    public void testArrange_widthFixedHeightNone_allBlocksPresent() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(30.0, 40.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(40.0, 50.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(50.0, 30.0), null);

        RectangleConstraint constraint = new RectangleConstraint(
                150.0, null, LengthConstraintType.FIXED,
                0.0, null, LengthConstraintType.NONE
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(150.0, size.getWidth(), 0.0001);
        assertEquals(90.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthFixedHeightNone_emptyContainer() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(
                150.0, null, LengthConstraintType.FIXED,
                0.0, null, LengthConstraintType.NONE
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(150.0, size.getWidth(), 0.0001);
        assertEquals(0.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthFixedHeightFixed_allBlocksPresent() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(30.0, 40.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(40.0, 50.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(50.0, 30.0), null);

        RectangleConstraint constraint = new RectangleConstraint(200.0, 100.0);
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(200.0, size.getWidth(), 0.0001);
        assertEquals(100.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthFixedHeightFixed_emptyContainer() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);
        RectangleConstraint constraint = new RectangleConstraint(200.0, 100.0);
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(200.0, size.getWidth(), 0.0001);
        assertEquals(100.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthFixedHeightRange_withinRange() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.BOTTOM);

        RectangleConstraint constraint = new RectangleConstraint(
                150.0, new Range(20.0, 100.0)
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(150.0, size.getWidth(), 0.0001);
        assertEquals(40.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthFixedHeightRange_outsideRange() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.BOTTOM);

        // Height needed is 40.0, range is [50.0, 100.0] -> clamped to 50.0
        RectangleConstraint constraint = new RectangleConstraint(
                150.0, new Range(50.0, 100.0)
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(150.0, size.getWidth(), 0.0001);
        assertEquals(50.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthRangeHeightRange_allBlocksPresent() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        container.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(80.0, 25.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(30.0, 40.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(40.0, 50.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(50.0, 30.0), null);

        RectangleConstraint constraint = new RectangleConstraint(
                new Range(50.0, 300.0), new Range(50.0, 300.0)
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(120.0, size.getWidth(), 0.0001);
        assertEquals(95.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testArrange_widthRangeHeightRange_emptyContainer() {
        BorderArrangement ba = new BorderArrangement();
        BlockContainer container = new BlockContainer(ba);

        RectangleConstraint constraint = new RectangleConstraint(
                new Range(50.0, 300.0), new Range(50.0, 300.0)
        );
        Size2D size = ba.arrange(container, this.g2, constraint);
        assertEquals(0.0, size.getWidth(), 0.0001);
        assertEquals(0.0, size.getHeight(), 0.0001);
    }

    @Test
    public void testSerialization_roundTrip_preservesState() throws Exception {
        BorderArrangement ba1 = new BorderArrangement();
        ba1.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        ba1.add(new EmptyBlock(15.0, 25.0), RectangleEdge.BOTTOM);
        ba1.add(new EmptyBlock(30.0, 35.0), RectangleEdge.LEFT);
        ba1.add(new EmptyBlock(40.0, 45.0), RectangleEdge.RIGHT);
        ba1.add(new EmptyBlock(50.0, 55.0), null);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(ba1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        BorderArrangement ba2 = (BorderArrangement) in.readObject();
        in.close();

        assertEquals(ba1, ba2);
    }
}
