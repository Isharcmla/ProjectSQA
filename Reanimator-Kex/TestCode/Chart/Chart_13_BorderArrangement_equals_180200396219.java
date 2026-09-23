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

public class BorderArrangement_equals_180200396219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term669;
     Object term670;
     Object term6047;
     Object term6048;

    public BorderArrangement_equals_180200396219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term669, term669.getClass(), "centerBlock", null);
        setField(term669, term669.getClass(), "topBlock", null);
        setField(term669, term669.getClass(), "bottomBlock", null);
        setField(term669, term669.getClass(), "leftBlock", null);
        setField(term669, term669.getClass(), "rightBlock", null);
        term670 = newInstance(Class.forName("java.lang.Object"));
        term6047 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term6047, term6047.getClass(), "centerBlock", null);
        setField(term6047, term6047.getClass(), "topBlock", null);
        setField(term6047, term6047.getClass(), "bottomBlock", null);
        setField(term6047, term6047.getClass(), "leftBlock", null);
        setField(term6047, term6047.getClass(), "rightBlock", null);
        term6048 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term670;
        Object retValue = callMethod(klass, "equals", argTypes, term669, args);
        assertTrue(recursiveEquals(term669, term6047));
        assertTrue(recursiveEquals(term670, term6048));
        assertTrue(recursiveEquals(retValue, false));
    }

};


