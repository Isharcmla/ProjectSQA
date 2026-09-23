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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseChildren_1478920219577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896222;
     Object term1896314;

    public TypeInference_traverseChildren_1478920219577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1896222 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1896314 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1896406 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term1896498 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term1896406, term1896406.getClass(), "type", 83);
        setIntField(term1896498, term1896498.getClass(), "type", 83);
        setField(term1896498, term1896498.getClass(), "first", term1896406);
        setField(term1896406, term1896406.getClass(), "first", term1896498);
        setField(term1896314, term1896314.getClass(), "first", term1896406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1896314;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1896222, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


