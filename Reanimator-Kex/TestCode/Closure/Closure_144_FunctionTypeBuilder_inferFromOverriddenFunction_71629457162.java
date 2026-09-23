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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44707;
     Object term44807;
     Object term45141;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44707 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term44707, term44707.getClass(), "returnType", null);
        setField(term44707, term44707.getClass(), "typeRegistry", null);
        term44807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term44901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term45001 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term45071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44901, term44901.getClass(), "returnType", term45001);
        setField(term45071, term45071.getClass(), "first", term45071);
        setField(term45071, term45071.getClass(), "next", null);
        setField(term45071, term45071.getClass(), "jsType", null);
        setField(term45071, term45071.getClass(), "propListHead", null);
        setField(term44901, term44901.getClass(), "parameters", term45071);
        setField(term44807, term44807.getClass(), "call", term44901);
        term45141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45211, term45211.getClass(), "next", term45211);
        setField(term45141, term45141.getClass(), "first", term45211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term44807;
        args[1] = term45141;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term44707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


