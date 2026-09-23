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

public class BorderArrangement_arrangeFF_661503500285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107111;
     Object term107275;

    public BorderArrangement_arrangeFF_661503500285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107111 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term107187 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term107111, term107111.getClass(), "topBlock", term107187);
        term107275 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term107275, term107275.getClass(), "width", 0.0);
        setDoubleField(term107275, term107275.getClass(), "height", 4.503599627894784E15);
        setField(null, Class.forName("org.jfree.chart.block.LengthConstraintType"), "name", "RectangleConstraintType.RANGE");
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
        args[2] = term107275;
        callMethod(klass, "arrangeFF", argTypes, term107111, args);
    }

};


