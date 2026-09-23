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

public class TypeInference_traverseGetProp_126832799592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53384;
     Object term53454;

    public TypeInference_traverseGetProp_126832799592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53384 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term53454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53524, term53524.getClass(), "type", 43);
        setField(term53454, term53454.getClass(), "first", term53524);
        setField(term53454, term53454.getClass(), "last", term53594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term53454;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term53384, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


