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

public class TypeInference_traverseAdd_1886586883145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47142;
     Object term47212;

    public TypeInference_traverseAdd_1886586883145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term47212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47352, term47352.getClass(), "type", 37);
        setField(term47282, term47282.getClass(), "next", term47352);
        setIntField(term47282, term47282.getClass(), "type", 371943306);
        setField(term47282, term47282.getClass(), "propListHead", null);
        setField(term47212, term47212.getClass(), "first", term47282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term47212;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term47142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


