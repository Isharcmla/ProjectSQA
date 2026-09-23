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

public class TypeInference_traverseAdd_1886586883158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49201;
     Object term49271;

    public TypeInference_traverseAdd_1886586883158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term49271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49271, term49271.getClass(), "first", term49271);
        setField(term49271, term49271.getClass(), "next", term49341);
        setIntField(term49271, term49271.getClass(), "type", 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term49271;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term49201, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


