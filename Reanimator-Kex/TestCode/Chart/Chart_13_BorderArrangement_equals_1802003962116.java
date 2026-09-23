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
import static org.jfree.chart.block.EqualityUtils.*;

public class BorderArrangement_equals_1802003962116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41948;
     Object term42032;
     Object term42799;
     Object term42800;

    public BorderArrangement_equals_1802003962116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41948 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term42032 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term42799 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term42799, term42799.getClass(), "centerBlock", null);
        setField(term42799, term42799.getClass(), "topBlock", null);
        setField(term42799, term42799.getClass(), "bottomBlock", null);
        setField(term42799, term42799.getClass(), "leftBlock", null);
        setField(term42799, term42799.getClass(), "rightBlock", null);
        term42800 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term42800, term42800.getClass(), "centerBlock", null);
        setField(term42800, term42800.getClass(), "topBlock", null);
        setField(term42800, term42800.getClass(), "bottomBlock", null);
        setField(term42800, term42800.getClass(), "leftBlock", null);
        setField(term42800, term42800.getClass(), "rightBlock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term42032;
        Object retValue = callMethod(klass, "equals", argTypes, term41948, args);
        assertTrue(recursiveEquals(term41948, term42799));
        assertTrue(recursiveEquals(term42032, term42800));
        assertTrue(recursiveEquals(retValue, true));
    }

};


