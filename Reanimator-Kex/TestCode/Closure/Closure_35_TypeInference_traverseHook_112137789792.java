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

public class TypeInference_traverseHook_112137789792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28072;
     Object term28142;

    public TypeInference_traverseHook_112137789792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28072 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term28142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28212, term28212.getClass(), "next", term28282);
        setIntField(term28212, term28212.getClass(), "type", 17);
        setField(term28142, term28142.getClass(), "first", term28212);
        setField(term28142, term28142.getClass(), "last", term28352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term28142;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term28072, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


