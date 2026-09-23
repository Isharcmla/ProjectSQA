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

public class TypeInference_traverseArrayLiteral_67090236306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term812793;
     Object term812863;

    public TypeInference_traverseArrayLiteral_67090236306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term812793 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term812863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term812933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term812933, term812933.getClass(), "type", 83);
        setIntField(term813003, term813003.getClass(), "type", 83);
        setIntField(term813073, term813073.getClass(), "type", 83);
        setIntField(term813143, term813143.getClass(), "type", 83);
        setIntField(term813213, term813213.getClass(), "type", 83);
        setIntField(term813283, term813283.getClass(), "type", 83);
        setIntField(term813353, term813353.getClass(), "type", 83);
        setIntField(term813423, term813423.getClass(), "type", 83);
        setIntField(term813493, term813493.getClass(), "type", 83);
        setIntField(term813563, term813563.getClass(), "type", 83);
        setIntField(term813633, term813633.getClass(), "type", 83);
        setIntField(term813703, term813703.getClass(), "type", 106);
        setField(term813633, term813633.getClass(), "first", term813703);
        setField(term813563, term813563.getClass(), "first", term813633);
        setField(term813493, term813493.getClass(), "first", term813563);
        setField(term813423, term813423.getClass(), "first", term813493);
        setField(term813353, term813353.getClass(), "first", term813423);
        setField(term813283, term813283.getClass(), "first", term813353);
        setField(term813213, term813213.getClass(), "first", term813283);
        setField(term813143, term813143.getClass(), "first", term813213);
        setField(term813073, term813073.getClass(), "first", term813143);
        setField(term813003, term813003.getClass(), "first", term813073);
        setField(term812933, term812933.getClass(), "first", term813003);
        setField(term812863, term812863.getClass(), "first", term812933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term812863;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term812793, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


