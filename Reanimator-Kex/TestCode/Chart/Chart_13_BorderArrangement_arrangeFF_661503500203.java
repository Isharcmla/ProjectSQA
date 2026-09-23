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

public class BorderArrangement_arrangeFF_661503500203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75301;
     Object term75487;

    public BorderArrangement_arrangeFF_661503500203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75301 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term75399 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term75301, term75301.getClass(), "topBlock", null);
        setField(term75301, term75301.getClass(), "bottomBlock", term75399);
        term75487 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term75487, term75487.getClass(), "width", 0.0);
        setDoubleField(term75487, term75487.getClass(), "height", 0.0);
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
        args[2] = term75487;
        callMethod(klass, "arrangeFF", argTypes, term75301, args);
    }

};


