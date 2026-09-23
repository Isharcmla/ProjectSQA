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

public class TypeInference_traverseArrayLiteral_1114859164131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71271;
     Object term71341;

    public TypeInference_traverseArrayLiteral_1114859164131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71271 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71341, term71341.getClass(), "first", term71341);
        setIntField(term71341, term71341.getClass(), "type", 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71341;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term71271, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


