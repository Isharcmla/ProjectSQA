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

public class TypeInference_traverseReturn_1142297770102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29978;
     Object term30048;

    public TypeInference_traverseReturn_1142297770102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29978 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term30048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30118, term30118.getClass(), "type", 972867650);
        setField(term30118, term30118.getClass(), "propListHead", null);
        setIntField(term30188, term30188.getClass(), "type", 89);
        setField(term30118, term30118.getClass(), "next", term30188);
        setField(term30048, term30048.getClass(), "first", term30118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term30048;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term29978, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


