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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40205;
     Object term40305;
     Object term40639;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40205 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term40205, term40205.getClass(), "returnType", null);
        setBooleanField(term40205, term40205.getClass(), "returnTypeInferred", false);
        setField(term40205, term40205.getClass(), "typeRegistry", null);
        term40305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term40399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term40499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term40569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40399, term40399.getClass(), "returnType", term40499);
        setBooleanField(term40399, term40399.getClass(), "returnTypeInferred", false);
        setField(term40569, term40569.getClass(), "first", term40569);
        setField(term40569, term40569.getClass(), "next", null);
        setField(term40569, term40569.getClass(), "jsType", null);
        setField(term40569, term40569.getClass(), "propListHead", null);
        setField(term40399, term40399.getClass(), "parameters", term40569);
        setField(term40305, term40305.getClass(), "call", term40399);
        term40639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40639, term40639.getClass(), "first", term40639);
        setField(term40639, term40639.getClass(), "next", term40639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term40305;
        args[1] = term40639;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term40205, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


