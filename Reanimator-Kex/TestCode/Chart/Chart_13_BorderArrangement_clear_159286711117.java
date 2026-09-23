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

public class BorderArrangement_clear_159286711117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term5924;

    public BorderArrangement_clear_159286711117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term668, term668.getClass(), "centerBlock", null);
        setField(term668, term668.getClass(), "topBlock", null);
        setField(term668, term668.getClass(), "bottomBlock", null);
        setField(term668, term668.getClass(), "leftBlock", null);
        setField(term668, term668.getClass(), "rightBlock", null);
        term5924 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term5924, term5924.getClass(), "centerBlock", null);
        setField(term5924, term5924.getClass(), "topBlock", null);
        setField(term5924, term5924.getClass(), "bottomBlock", null);
        setField(term5924, term5924.getClass(), "leftBlock", null);
        setField(term5924, term5924.getClass(), "rightBlock", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clear", argTypes, term668, args);
        assertTrue(recursiveEquals(term668, term5924));
    }

};


