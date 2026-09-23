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

public class TypeInference_traverseArrayLiteral_67090236162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84253;
     Object term84323;

    public TypeInference_traverseArrayLiteral_67090236162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84253 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term84323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84393, term84393.getClass(), "type", -1310015129);
        setIntField(term84463, term84463.getClass(), "type", 108);
        setField(term84393, term84393.getClass(), "next", term84463);
        setField(term84323, term84323.getClass(), "first", term84393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term84323;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term84253, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


