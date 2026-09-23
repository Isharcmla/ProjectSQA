package org.jfree.chart.block;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.chart.block.EqualityUtils.*;
import java.lang.Object;

public class BorderArrangement_arrangeFF_661503500159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56997;
     Object term57155;
     Object term58308;
     Object term58310;
     Object term58311;
     Object term58312;
     Object term58320;
     Object term58293;

    public BorderArrangement_arrangeFF_661503500159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56997 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term57067 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term56997, term56997.getClass(), "topBlock", term57067);
        term57155 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term57155, term57155.getClass(), "width", 0.0);
        term58308 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term58309 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term58308, term58308.getClass(), "image", null);
        setField(term58308, term58308.getClass(), "position", null);
        setField(term58308, term58308.getClass(), "horizontalAlignment", null);
        setField(term58308, term58308.getClass(), "verticalAlignment", null);
        setField(term58308, term58308.getClass(), "listenerList", null);
        setBooleanField(term58308, term58308.getClass(), "notify", false);
        setField(term58308, term58308.getClass(), "id", null);
        setField(term58308, term58308.getClass(), "margin", null);
        setField(term58308, term58308.getClass(), "frame", null);
        setField(term58308, term58308.getClass(), "padding", null);
        setDoubleField(term58308, term58308.getClass(), "width", 0.0);
        setDoubleField(term58308, term58308.getClass(), "height", 0.0);
        setDoubleField(term58309, term58309.getClass(), "x", 0.0);
        setDoubleField(term58309, term58309.getClass(), "y", 0.0);
        setDoubleField(term58309, term58309.getClass(), "width", 0.0);
        setDoubleField(term58309, term58309.getClass(), "height", 0.0);
        setField(term58308, term58308.getClass(), "bounds", term58309);
        term58310 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term58310, term58310.getClass(), "width", 0.0);
        setField(term58310, term58310.getClass(), "widthRange", null);
        setField(term58310, term58310.getClass(), "widthConstraintType", null);
        setDoubleField(term58310, term58310.getClass(), "height", 0.0);
        setField(term58310, term58310.getClass(), "heightRange", null);
        setField(term58310, term58310.getClass(), "heightConstraintType", null);
        term58311 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term58311, term58311.getClass(), "width", 0.0);
        setDoubleField(term58311, term58311.getClass(), "height", 0.0);
        term58312 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term58313 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        Object term58316 = newInstance(Class.forName("org.jfree.data.Range"));
        Object term58317 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term58312, term58312.getClass(), "width", 0.0);
        setField(term58312, term58312.getClass(), "widthRange", null);
        setField(term58313, term58313.getClass(), "name", "LengthConstraintType.FIXED");
        setField(term58312, term58312.getClass(), "widthConstraintType", term58313);
        setDoubleField(term58312, term58312.getClass(), "height", 0.0);
        setDoubleField(term58316, term58316.getClass(), "lower", 0.0);
        setDoubleField(term58316, term58316.getClass(), "upper", 0.0);
        setField(term58312, term58312.getClass(), "heightRange", term58316);
        setField(term58317, term58317.getClass(), "name", "RectangleConstraintType.RANGE");
        setField(term58312, term58312.getClass(), "heightConstraintType", term58317);
        term58320 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term58320, term58320.getClass(), "x", 0.0);
        setDoubleField(term58320, term58320.getClass(), "y", 0.0);
        setDoubleField(term58320, term58320.getClass(), "width", 0.0);
        setDoubleField(term58320, term58320.getClass(), "height", 0.0);
        term58293 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term58293, term58293.getClass(), "width", 0.0);
        setDoubleField(term58293, term58293.getClass(), "height", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term57155;
        Object retValue = callMethod(klass, "arrangeFF", argTypes, term56997, args);
        assertTrue(recursiveEquals(term56997, term58308));
        assertTrue(recursiveEquals(term57155, 0.0));
        assertTrue(recursiveEquals(retValue, term58293));
    }

};


