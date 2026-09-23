package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395407;
     Object term1395477;

    public TypeInference_traverseGetElem_100203513433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1395407 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1395477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1395967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1395547, term1395547.getClass(), "type", 98);
        setField(term1395617, term1395617.getClass(), "next", term1395687);
        setIntField(term1395617, term1395617.getClass(), "type", 98);
        setField(term1395757, term1395757.getClass(), "next", term1395827);
        setIntField(term1395757, term1395757.getClass(), "type", 98);
        setField(term1395897, term1395897.getClass(), "next", null);
        setIntField(term1395897, term1395897.getClass(), "type", 9);
        setField(term1395757, term1395757.getClass(), "first", term1395897);
        setField(term1395757, term1395757.getClass(), "last", term1395967);
        setField(term1395617, term1395617.getClass(), "first", term1395757);
        setField(term1395617, term1395617.getClass(), "last", term1395967);
        setField(term1395547, term1395547.getClass(), "first", term1395617);
        setField(term1395547, term1395547.getClass(), "last", term1396037);
        setField(term1395477, term1395477.getClass(), "first", term1395547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1395477;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1395407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


