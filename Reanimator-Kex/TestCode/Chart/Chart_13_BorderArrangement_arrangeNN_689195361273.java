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

public class BorderArrangement_arrangeNN_689195361273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101049;

    public BorderArrangement_arrangeNN_689195361273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101049 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term101119 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term101217 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term101049, term101049.getClass(), "topBlock", null);
        setField(term101049, term101049.getClass(), "bottomBlock", term101119);
        setField(term101049, term101049.getClass(), "leftBlock", null);
        setField(term101049, term101049.getClass(), "rightBlock", null);
        setField(term101049, term101049.getClass(), "centerBlock", term101217);
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
            callMethod(klass, "arrangeNN", argTypes, term101049, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


