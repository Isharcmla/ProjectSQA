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

public class TypeInference_traverseArrayLiteral_67090236443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1783075;
     Object term1783145;

    public TypeInference_traverseArrayLiteral_67090236443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1783075 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1783145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1783215, term1783215.getClass(), "type", 83);
        setIntField(term1783285, term1783285.getClass(), "type", 83);
        setIntField(term1783355, term1783355.getClass(), "type", 83);
        setIntField(term1783425, term1783425.getClass(), "type", 109);
        setField(term1783355, term1783355.getClass(), "first", term1783425);
        setField(term1783285, term1783285.getClass(), "first", term1783355);
        setField(term1783215, term1783215.getClass(), "first", term1783285);
        setField(term1783145, term1783145.getClass(), "first", term1783215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1783145;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1783075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


