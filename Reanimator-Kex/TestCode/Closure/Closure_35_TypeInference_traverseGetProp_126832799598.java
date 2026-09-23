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

public class TypeInference_traverseGetProp_126832799598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30020;
     Object term30090;

    public TypeInference_traverseGetProp_126832799598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30020 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term30090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30160, term30160.getClass(), "type", -941356098);
        setField(term30160, term30160.getClass(), "propListHead", null);
        setIntField(term30230, term30230.getClass(), "type", 98);
        setField(term30160, term30160.getClass(), "next", term30230);
        setField(term30090, term30090.getClass(), "first", term30160);
        setField(term30090, term30090.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term30090;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term30020, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


