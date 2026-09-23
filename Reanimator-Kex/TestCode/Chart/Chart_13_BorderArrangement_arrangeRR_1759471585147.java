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
import java.lang.IllegalArgumentException;
import static org.jfree.chart.block.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BorderArrangement_arrangeRR_1759471585147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53824;
     Object term53948;

    public BorderArrangement_arrangeRR_1759471585147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53824 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        Object term53902 = newInstance(Class.forName("org.jfree.chart.title.CompositeTitle"));
        setField(term53824, term53824.getClass(), "topBlock", null);
        setField(term53824, term53824.getClass(), "bottomBlock", term53902);
        term53948 = newInstance(Class.forName("org.jfree.data.Range"));
        setDoubleField(term53948, term53948.getClass(), "lower", 4.503599627370497E15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jfree.chart.block.BlockContainer");
        argTypes[1] = Class.forName("org.jfree.data.Range");
        argTypes[2] = Class.forName("org.jfree.data.Range");
        argTypes[3] = Class.forName("java.awt.Graphics2D");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term53948;
        args[3] = null;
        try {
            callMethod(klass, "arrangeRR", argTypes, term53824, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


