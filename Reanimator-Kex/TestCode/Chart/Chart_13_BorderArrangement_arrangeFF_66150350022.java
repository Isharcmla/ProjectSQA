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

public class BorderArrangement_arrangeFF_66150350022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6438;
     Object term6596;
     Object term7337;
     Object term7339;
     Object term7340;
     Object term7341;
     Object term7345;
     Object term7322;

    public BorderArrangement_arrangeFF_66150350022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6438 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term6508 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        setField(term6438, term6438.getClass(), "topBlock", null);
        setField(term6438, term6438.getClass(), "bottomBlock", null);
        setField(term6438, term6438.getClass(), "leftBlock", null);
        setField(term6438, term6438.getClass(), "rightBlock", null);
        setField(term6438, term6438.getClass(), "centerBlock", term6508);
        term6596 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term6596, term6596.getClass(), "width", 0.0);
        setDoubleField(term6596, term6596.getClass(), "height", 0.0);
        term7337 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term7338 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setField(term7337, term7337.getClass(), "image", null);
        setField(term7337, term7337.getClass(), "position", null);
        setField(term7337, term7337.getClass(), "horizontalAlignment", null);
        setField(term7337, term7337.getClass(), "verticalAlignment", null);
        setField(term7337, term7337.getClass(), "listenerList", null);
        setBooleanField(term7337, term7337.getClass(), "notify", false);
        setField(term7337, term7337.getClass(), "id", null);
        setField(term7337, term7337.getClass(), "margin", null);
        setField(term7337, term7337.getClass(), "frame", null);
        setField(term7337, term7337.getClass(), "padding", null);
        setDoubleField(term7337, term7337.getClass(), "width", 0.0);
        setDoubleField(term7337, term7337.getClass(), "height", 0.0);
        setDoubleField(term7338, term7338.getClass(), "x", 0.0);
        setDoubleField(term7338, term7338.getClass(), "y", 0.0);
        setDoubleField(term7338, term7338.getClass(), "width", 0.0);
        setDoubleField(term7338, term7338.getClass(), "height", 0.0);
        setField(term7337, term7337.getClass(), "bounds", term7338);
        term7339 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term7339, term7339.getClass(), "width", 0.0);
        setField(term7339, term7339.getClass(), "widthRange", null);
        setField(term7339, term7339.getClass(), "widthConstraintType", null);
        setDoubleField(term7339, term7339.getClass(), "height", 0.0);
        setField(term7339, term7339.getClass(), "heightRange", null);
        setField(term7339, term7339.getClass(), "heightConstraintType", null);
        term7340 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term7340, term7340.getClass(), "width", 0.0);
        setDoubleField(term7340, term7340.getClass(), "height", 0.0);
        term7341 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        Object term7342 = newInstance(Class.forName("org.jfree.chart.block.LengthConstraintType"));
        setDoubleField(term7341, term7341.getClass(), "width", 0.0);
        setField(term7341, term7341.getClass(), "widthRange", null);
        setField(term7342, term7342.getClass(), "name", "LengthConstraintType.FIXED");
        setField(term7341, term7341.getClass(), "widthConstraintType", term7342);
        setDoubleField(term7341, term7341.getClass(), "height", 0.0);
        setField(term7341, term7341.getClass(), "heightRange", null);
        setField(term7341, term7341.getClass(), "heightConstraintType", term7342);
        term7345 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Double"));
        setDoubleField(term7345, term7345.getClass(), "x", 0.0);
        setDoubleField(term7345, term7345.getClass(), "y", 0.0);
        setDoubleField(term7345, term7345.getClass(), "width", 0.0);
        setDoubleField(term7345, term7345.getClass(), "height", 0.0);
        term7322 = newInstance(Class.forName("org.jfree.chart.util.Size2D"));
        setDoubleField(term7322, term7322.getClass(), "width", 0.0);
        setDoubleField(term7322, term7322.getClass(), "height", 0.0);
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
        args[2] = term6596;
        Object retValue = callMethod(klass, "arrangeFF", argTypes, term6438, args);
        assertTrue(recursiveEquals(term6438, term7337));
        assertTrue(recursiveEquals(term6596, 0.0));
        assertTrue(recursiveEquals(retValue, term7322));
    }

};


