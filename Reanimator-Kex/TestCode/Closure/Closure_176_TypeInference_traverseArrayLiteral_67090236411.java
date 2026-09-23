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

public class TypeInference_traverseArrayLiteral_67090236411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1555413;
     Object term1555483;

    public TypeInference_traverseArrayLiteral_67090236411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1555413 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1555483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1555553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1555623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1555693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1555553, term1555553.getClass(), "type", 83);
        setIntField(term1555623, term1555623.getClass(), "type", 83);
        setIntField(term1555693, term1555693.getClass(), "type", 67);
        setField(term1555623, term1555623.getClass(), "first", term1555693);
        setField(term1555553, term1555553.getClass(), "first", term1555623);
        setField(term1555483, term1555483.getClass(), "first", term1555553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1555483;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1555413, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


