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

public class TypeInference_traverseArrayLiteral_67090236345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986220;
     Object term986290;

    public TypeInference_traverseArrayLiteral_67090236345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986220 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term986290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term986360, term986360.getClass(), "type", 497269071);
        setField(term986360, term986360.getClass(), "propListHead", null);
        setIntField(term986430, term986430.getClass(), "type", 120);
        setField(term986360, term986360.getClass(), "next", term986430);
        setField(term986290, term986290.getClass(), "first", term986360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term986290;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term986220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


