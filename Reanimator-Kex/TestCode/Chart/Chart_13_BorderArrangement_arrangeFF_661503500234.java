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

public class BorderArrangement_arrangeFF_661503500234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86521;
     Object term86687;

    public BorderArrangement_arrangeFF_661503500234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86521 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term86599 = newInstance(Class.forName("org.jfree.chart.title.CompositeTitle"));
        setField(term86521, term86521.getClass(), "topBlock", term86599);
        term86687 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term86687, term86687.getClass(), "width", 0.0);
        setDoubleField(term86687, term86687.getClass(), "height", 4.503599627894784E15);
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
        args[2] = term86687;
        callMethod(klass, "arrangeFF", argTypes, term86521, args);
    }

};


