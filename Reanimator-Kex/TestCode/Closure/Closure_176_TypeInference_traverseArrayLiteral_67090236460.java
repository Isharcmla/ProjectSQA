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

public class TypeInference_traverseArrayLiteral_67090236460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1903046;
     Object term1903116;

    public TypeInference_traverseArrayLiteral_67090236460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1903046 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1903116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1903186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1903256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1903326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1903186, term1903186.getClass(), "type", 83);
        setIntField(term1903256, term1903256.getClass(), "type", 83);
        setIntField(term1903326, term1903326.getClass(), "type", 118);
        setField(term1903256, term1903256.getClass(), "first", term1903326);
        setField(term1903186, term1903186.getClass(), "first", term1903256);
        setField(term1903116, term1903116.getClass(), "first", term1903186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1903116;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1903046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


