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

public class TypeInference_traverseChildren_1478920219312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term711268;
     Object term711338;

    public TypeInference_traverseChildren_1478920219312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term711268 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term711338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711968 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term711408, term711408.getClass(), "type", 18);
        setIntField(term711478, term711478.getClass(), "type", 18);
        setIntField(term711548, term711548.getClass(), "type", 18);
        setIntField(term711618, term711618.getClass(), "type", 18);
        setIntField(term711688, term711688.getClass(), "type", 18);
        setIntField(term711758, term711758.getClass(), "type", 18);
        setIntField(term711828, term711828.getClass(), "type", 18);
        setIntField(term711898, term711898.getClass(), "type", 18);
        setIntField(term711968, term711968.getClass(), "type", 57);
        setField(term711898, term711898.getClass(), "first", term711968);
        setField(term711828, term711828.getClass(), "first", term711898);
        setField(term711758, term711758.getClass(), "first", term711828);
        setField(term711688, term711688.getClass(), "first", term711758);
        setField(term711618, term711618.getClass(), "first", term711688);
        setField(term711548, term711548.getClass(), "first", term711618);
        setField(term711478, term711478.getClass(), "first", term711548);
        setField(term711408, term711408.getClass(), "first", term711478);
        setField(term711338, term711338.getClass(), "first", term711408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term711338;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term711268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


