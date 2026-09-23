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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetProp_220559067195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94356;
     Object term94426;

    public TypeInference_traverseGetProp_220559067195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94356 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term94426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94496, term94496.getClass(), "type", 137);
        setField(term94426, term94426.getClass(), "first", term94496);
        setField(term94426, term94426.getClass(), "last", term94566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term94426;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term94356, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


