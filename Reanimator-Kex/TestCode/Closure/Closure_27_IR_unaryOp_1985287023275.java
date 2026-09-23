package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class IR_unaryOp_1985287023275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36057;
     Object term36585;
     Object term36509;

    public IR_unaryOp_1985287023275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36057, term36057.getClass(), "type", 98);
        term36585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36585, term36585.getClass(), "type", 98);
        setField(term36585, term36585.getClass(), "next", null);
        setField(term36585, term36585.getClass(), "first", null);
        setField(term36585, term36585.getClass(), "last", null);
        setField(term36585, term36585.getClass(), "propListHead", null);
        setIntField(term36585, term36585.getClass(), "sourcePosition", 0);
        setField(term36585, term36585.getClass(), "jsType", null);
        setIntField(term36586, term36586.getClass(), "type", 0);
        setField(term36586, term36586.getClass(), "next", null);
        setField(term36586, term36586.getClass(), "first", term36585);
        setField(term36586, term36586.getClass(), "last", term36585);
        setField(term36586, term36586.getClass(), "propListHead", null);
        setIntField(term36586, term36586.getClass(), "sourcePosition", -1);
        setField(term36586, term36586.getClass(), "jsType", null);
        setField(term36586, term36586.getClass(), "parent", null);
        setField(term36585, term36585.getClass(), "parent", term36586);
        term36509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36509, term36509.getClass(), "type", 0);
        setField(term36509, term36509.getClass(), "next", null);
        setIntField(term36506, term36506.getClass(), "type", 98);
        setField(term36506, term36506.getClass(), "next", null);
        setField(term36506, term36506.getClass(), "first", null);
        setField(term36506, term36506.getClass(), "last", null);
        setField(term36506, term36506.getClass(), "propListHead", null);
        setIntField(term36506, term36506.getClass(), "sourcePosition", 0);
        setField(term36506, term36506.getClass(), "jsType", null);
        setField(term36506, term36506.getClass(), "parent", term36509);
        setField(term36509, term36509.getClass(), "first", term36506);
        setField(term36509, term36509.getClass(), "last", term36506);
        setField(term36509, term36509.getClass(), "propListHead", null);
        setIntField(term36509, term36509.getClass(), "sourcePosition", -1);
        setField(term36509, term36509.getClass(), "jsType", null);
        setField(term36509, term36509.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term36057;
        Object retValue = callMethod(klass, "unaryOp", argTypes, null, args);
        assertTrue(recursiveEquals(term36057, 0));
        assertTrue(recursiveEquals(retValue, term36509));
    }

};


