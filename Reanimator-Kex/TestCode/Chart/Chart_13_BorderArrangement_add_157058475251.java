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

public class BorderArrangement_add_157058475251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17962;
     Object term17965;

    public BorderArrangement_add_157058475251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17962 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term17965 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term17965, term17965.getClass(), "centerBlock", null);
        setField(term17965, term17965.getClass(), "topBlock", null);
        setField(term17965, term17965.getClass(), "bottomBlock", null);
        setField(term17965, term17965.getClass(), "leftBlock", null);
        setField(term17965, term17965.getClass(), "rightBlock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.block.Block");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "add", argTypes, term17962, args);
        assertTrue(recursiveEquals(term17962, term17965));
    }

};


