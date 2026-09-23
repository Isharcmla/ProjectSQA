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

public class TypeInference_traverseChildren_1478920219382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1389468;
     Object term1389538;

    public TypeInference_traverseChildren_1478920219382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1389468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1389538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1389538, term1389538.getClass(), "first", term1389538);
        setIntField(term1389538, term1389538.getClass(), "type", 88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1389538;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1389468, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


