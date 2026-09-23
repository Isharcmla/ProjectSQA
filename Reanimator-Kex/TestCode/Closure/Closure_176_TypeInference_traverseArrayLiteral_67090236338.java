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

public class TypeInference_traverseArrayLiteral_67090236338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1026689;
     Object term1026759;

    public TypeInference_traverseArrayLiteral_67090236338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1026689 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1026759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1027529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1026829, term1026829.getClass(), "type", 83);
        setIntField(term1026899, term1026899.getClass(), "type", 83);
        setIntField(term1026969, term1026969.getClass(), "type", 83);
        setIntField(term1027039, term1027039.getClass(), "type", 83);
        setIntField(term1027109, term1027109.getClass(), "type", 83);
        setIntField(term1027179, term1027179.getClass(), "type", 83);
        setIntField(term1027249, term1027249.getClass(), "type", 83);
        setIntField(term1027319, term1027319.getClass(), "type", 83);
        setIntField(term1027389, term1027389.getClass(), "type", 83);
        setIntField(term1027459, term1027459.getClass(), "type", 83);
        setIntField(term1027529, term1027529.getClass(), "type", 70);
        setField(term1027459, term1027459.getClass(), "first", term1027529);
        setField(term1027389, term1027389.getClass(), "first", term1027459);
        setField(term1027319, term1027319.getClass(), "first", term1027389);
        setField(term1027249, term1027249.getClass(), "first", term1027319);
        setField(term1027179, term1027179.getClass(), "first", term1027249);
        setField(term1027109, term1027109.getClass(), "first", term1027179);
        setField(term1027039, term1027039.getClass(), "first", term1027109);
        setField(term1026969, term1026969.getClass(), "first", term1027039);
        setField(term1026899, term1026899.getClass(), "first", term1026969);
        setField(term1026829, term1026829.getClass(), "first", term1026899);
        setField(term1026759, term1026759.getClass(), "first", term1026829);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1026759;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1026689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


