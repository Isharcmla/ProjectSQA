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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66251;
     Object term66351;
     Object term66585;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66251 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term66251, term66251.getClass(), "returnType", null);
        setField(term66251, term66251.getClass(), "typeRegistry", null);
        term66351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term66445 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term66515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66445, term66445.getClass(), "returnType", null);
        setField(term66515, term66515.getClass(), "first", term66515);
        setField(term66445, term66445.getClass(), "parameters", term66515);
        setField(term66351, term66351.getClass(), "call", term66445);
        term66585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66585, term66585.getClass(), "first", term66585);
        setField(term66585, term66585.getClass(), "next", term66585);
        setField(term66585, term66585.getClass(), "jsType", null);
        setField(term66585, term66585.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term66351;
        args[1] = term66585;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term66251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


