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

public class TypeInference_traverseCall_82554492118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36084;
     Object term36154;

    public TypeInference_traverseCall_82554492118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36084 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term36154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36224, term36224.getClass(), "type", 1935707624);
        setField(term36224, term36224.getClass(), "propListHead", null);
        setIntField(term36294, term36294.getClass(), "type", 51);
        setField(term36224, term36224.getClass(), "next", term36294);
        setField(term36154, term36154.getClass(), "first", term36224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term36154;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term36084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


