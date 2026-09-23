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
import java.lang.NullPointerException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeFR_66151503224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6985;
     Object term7149;

    public BorderArrangement_arrangeFR_66151503224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6985 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term7061 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term6985, term6985.getClass(), "topBlock", null);
        setField(term6985, term6985.getClass(), "bottomBlock", null);
        setField(term6985, term6985.getClass(), "leftBlock", null);
        setField(term6985, term6985.getClass(), "rightBlock", null);
        setField(term6985, term6985.getClass(), "centerBlock", term7061);
        term7149 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term7149, term7149.getClass(), "width", 0.0);
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
        args[2] = term7149;
        try {
            callMethod(klass, "arrangeFR", argTypes, term6985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


