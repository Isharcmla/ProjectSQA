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

public class BorderArrangement_arrangeNN_689195361229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84474;

    public BorderArrangement_arrangeNN_689195361229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84474 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term84544 = newInstance(Class.forName("org.jfree.chart.title.ImageTitle"));
        Object term84642 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term84474, term84474.getClass(), "topBlock", null);
        setField(term84474, term84474.getClass(), "bottomBlock", term84544);
        setField(term84474, term84474.getClass(), "leftBlock", null);
        setField(term84474, term84474.getClass(), "rightBlock", term84642);
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
            callMethod(klass, "arrangeNN", argTypes, term84474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


