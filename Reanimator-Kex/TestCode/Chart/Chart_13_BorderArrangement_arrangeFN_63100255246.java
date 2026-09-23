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

public class BorderArrangement_arrangeFN_63100255246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15762;

    public BorderArrangement_arrangeFN_63100255246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15762 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term15860 = newInstance(Class.forName("org.jfree.chart.title.LegendItemBlockContainer"));
        setField(term15762, term15762.getClass(), "topBlock", null);
        setField(term15762, term15762.getClass(), "bottomBlock", null);
        setField(term15762, term15762.getClass(), "leftBlock", null);
        setField(term15762, term15762.getClass(), "rightBlock", null);
        setField(term15762, term15762.getClass(), "centerBlock", term15860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("java.awt.Graphics2D");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = -0.0;
        try {
            callMethod(klass, "arrangeFN", argTypes, term15762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


