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

public class TypeInference_traverseGetProp_220559067159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83317;
     Object term83387;

    public TypeInference_traverseGetProp_220559067159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83317 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term83387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83457, term83457.getClass(), "type", 127);
        setField(term83387, term83387.getClass(), "first", term83457);
        setField(term83387, term83387.getClass(), "last", term83527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term83387;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term83317, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


