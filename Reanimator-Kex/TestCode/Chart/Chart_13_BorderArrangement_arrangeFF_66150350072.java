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

public class BorderArrangement_arrangeFF_66150350072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25887;
     Object term26045;

    public BorderArrangement_arrangeFF_66150350072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25887 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term25957 = newInstance(Class.forName("org.jfree.chart.block.LabelBlock"));
        setField(term25887, term25887.getClass(), "topBlock", null);
        setField(term25887, term25887.getClass(), "bottomBlock", null);
        setField(term25887, term25887.getClass(), "leftBlock", null);
        setField(term25887, term25887.getClass(), "rightBlock", term25957);
        term26045 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term26045, term26045.getClass(), "width", 0.0);
        setDoubleField(term26045, term26045.getClass(), "height", 0.0);
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
        args[2] = term26045;
        try {
            callMethod(klass, "arrangeFF", argTypes, term25887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


