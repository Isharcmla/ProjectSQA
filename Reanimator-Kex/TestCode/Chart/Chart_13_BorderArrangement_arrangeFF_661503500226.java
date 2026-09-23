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

public class BorderArrangement_arrangeFF_661503500226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83661;
     Object term83831;

    public BorderArrangement_arrangeFF_661503500226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83661 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term83743 = newInstance(Class.forName("org.jfree.chart.title.PaintScaleLegend"));
        setField(term83661, term83661.getClass(), "topBlock", null);
        setField(term83661, term83661.getClass(), "bottomBlock", null);
        setField(term83661, term83661.getClass(), "leftBlock", term83743);
        term83831 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term83831, term83831.getClass(), "width", 4.503599627370497E15);
        setDoubleField(term83831, term83831.getClass(), "height", 0.0);
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
        args[2] = term83831;
        callMethod(klass, "arrangeFF", argTypes, term83661, args);
    }

};


