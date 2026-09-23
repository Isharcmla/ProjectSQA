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
import java.lang.Object;

public class BorderArrangement_arrangeFF_661503500120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44188;
     Object term44358;

    public BorderArrangement_arrangeFF_661503500120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44188 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term44270 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term44188, term44188.getClass(), "topBlock", null);
        setField(term44188, term44188.getClass(), "bottomBlock", null);
        setField(term44188, term44188.getClass(), "leftBlock", null);
        setField(term44188, term44188.getClass(), "rightBlock", term44270);
        term44358 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term44358, term44358.getClass(), "width", 1.0);
        setDoubleField(term44358, term44358.getClass(), "height", 0.0);
        setField(null, Class.forName("org.jfree.chart.block.LengthConstraintType"), "name", "LengthConstraintType.FIXED");
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
        args[2] = term44358;
        callMethod(klass, "arrangeFF", argTypes, term44188, args);
    }

};


