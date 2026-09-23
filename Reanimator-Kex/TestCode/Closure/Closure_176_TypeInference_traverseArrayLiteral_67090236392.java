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

public class TypeInference_traverseArrayLiteral_67090236392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1452723;
     Object term1452793;

    public TypeInference_traverseArrayLiteral_67090236392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1452723 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1452793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1452863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1452933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1453213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1452863, term1452863.getClass(), "type", 83);
        setIntField(term1452933, term1452933.getClass(), "type", 83);
        setIntField(term1453003, term1453003.getClass(), "type", 83);
        setIntField(term1453073, term1453073.getClass(), "type", 83);
        setIntField(term1453143, term1453143.getClass(), "type", 83);
        setIntField(term1453213, term1453213.getClass(), "type", 102);
        setField(term1453143, term1453143.getClass(), "first", term1453213);
        setField(term1453073, term1453073.getClass(), "first", term1453143);
        setField(term1453003, term1453003.getClass(), "first", term1453073);
        setField(term1452933, term1452933.getClass(), "first", term1453003);
        setField(term1452863, term1452863.getClass(), "first", term1452933);
        setField(term1452793, term1452793.getClass(), "first", term1452863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1452793;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1452723, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


