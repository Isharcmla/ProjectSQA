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

public class TypeInference_traverseArrayLiteral_67090236431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1677416;
     Object term1677486;

    public TypeInference_traverseArrayLiteral_67090236431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1677416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1677486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1677976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1677556, term1677556.getClass(), "type", 83);
        setIntField(term1677626, term1677626.getClass(), "type", 83);
        setIntField(term1677696, term1677696.getClass(), "type", 83);
        setIntField(term1677766, term1677766.getClass(), "type", 83);
        setIntField(term1677836, term1677836.getClass(), "type", 83);
        setIntField(term1677906, term1677906.getClass(), "type", 83);
        setIntField(term1677976, term1677976.getClass(), "type", 7);
        setField(term1677906, term1677906.getClass(), "first", term1677976);
        setField(term1677836, term1677836.getClass(), "first", term1677906);
        setField(term1677766, term1677766.getClass(), "first", term1677836);
        setField(term1677696, term1677696.getClass(), "first", term1677766);
        setField(term1677626, term1677626.getClass(), "first", term1677696);
        setField(term1677556, term1677556.getClass(), "first", term1677626);
        setField(term1677486, term1677486.getClass(), "first", term1677556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1677486;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1677416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


