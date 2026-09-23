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

public class BorderArrangement_arrangeFR_66151503294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34167;
     Object term34265;
     Object term34353;

    public BorderArrangement_arrangeFR_66151503294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34167 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term34167, term34167.getClass(), "topBlock", null);
        setField(term34167, term34167.getClass(), "bottomBlock", null);
        setField(term34167, term34167.getClass(), "leftBlock", null);
        setField(term34167, term34167.getClass(), "rightBlock", null);
        setField(term34167, term34167.getClass(), "centerBlock", null);
        term34265 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        term34353 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term34353, term34353.getClass(), "width", 1.801446722895872E16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = Class.forName("org.jfree.chart.block.RectangleConstraint");
        Object[] args = new Object[3];
        args[0] = term34265;
        args[1] = null;
        args[2] = term34353;
        try {
            callMethod(klass, "arrangeFR", argTypes, term34167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


