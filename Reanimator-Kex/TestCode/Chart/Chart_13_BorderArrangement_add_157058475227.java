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

public class BorderArrangement_add_157058475227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8904;
     Object term8978;
     Object term8986;
     Object term8987;

    public BorderArrangement_add_157058475227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8904 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        term8978 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        term8986 = newInstance(Class.forName("org.jfree.chart.block.BorderArrangement"));
        setField(term8986, term8986.getClass(), "centerBlock", null);
        setField(term8986, term8986.getClass(), "topBlock", null);
        setField(term8986, term8986.getClass(), "bottomBlock", null);
        setField(term8986, term8986.getClass(), "leftBlock", null);
        setField(term8986, term8986.getClass(), "rightBlock", null);
        term8987 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        setField(term8987, term8987.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.block.BorderArrangement");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.block.Block");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8978;
        callMethod(klass, "add", argTypes, term8904, args);
        assertTrue(recursiveEquals(term8904, term8986));
        assertTrue(recursiveEquals(term8978, term8987));
    }

};


