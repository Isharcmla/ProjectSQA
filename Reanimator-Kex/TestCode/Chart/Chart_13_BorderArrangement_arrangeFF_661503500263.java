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

public class BorderArrangement_arrangeFF_661503500263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97073;
     Object term97229;

    public BorderArrangement_arrangeFF_661503500263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97073 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term97141 = newInstance(Class.forName("org.jfree.chart.title.DateTitle"));
        setField(term97073, term97073.getClass(), "topBlock", null);
        setField(term97073, term97073.getClass(), "bottomBlock", null);
        setField(term97073, term97073.getClass(), "leftBlock", null);
        setField(term97073, term97073.getClass(), "rightBlock", null);
        setField(term97073, term97073.getClass(), "centerBlock", term97141);
        term97229 = newInstance(Class.forName("org.jfree.chart.block.RectangleConstraint"));
        setDoubleField(term97229, term97229.getClass(), "width", 0.0);
        setDoubleField(term97229, term97229.getClass(), "height", 0.0);
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
        args[2] = term97229;
        try {
            callMethod(klass, "arrangeFF", argTypes, term97073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


