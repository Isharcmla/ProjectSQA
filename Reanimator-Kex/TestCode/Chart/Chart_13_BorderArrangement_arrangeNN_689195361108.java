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

public class BorderArrangement_arrangeNN_689195361108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39476;

    public BorderArrangement_arrangeNN_689195361108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39476 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term39552 = newInstance(Class.forName("org.jfree.chart.title.LegendGraphic"));
        setField(term39476, term39476.getClass(), "topBlock", null);
        setField(term39476, term39476.getClass(), "bottomBlock", null);
        setField(term39476, term39476.getClass(), "leftBlock", null);
        setField(term39476, term39476.getClass(), "rightBlock", null);
        setField(term39476, term39476.getClass(), "centerBlock", term39552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "arrangeNN", argTypes, term39476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


