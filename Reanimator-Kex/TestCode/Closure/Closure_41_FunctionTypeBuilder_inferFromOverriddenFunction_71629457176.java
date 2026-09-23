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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23556;
     Object term23872;
     Object term24276;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23556 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term23668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term23772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term23556, term23556.getClass(), "returnType", term23668);
        setBooleanField(term23556, term23556.getClass(), "returnTypeInferred", false);
        setField(term23556, term23556.getClass(), "typeRegistry", term23772);
        term23872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term23966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term24066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term24311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23966, term23966.getClass(), "returnType", term24066);
        setBooleanField(term23966, term23966.getClass(), "returnTypeInferred", false);
        setField(term24346, term24346.getClass(), "next", null);
        setField(term24346, term24346.getClass(), "jsType", null);
        setField(term24346, term24346.getClass(), "propListHead", null);
        setField(term24311, term24311.getClass(), "first", term24346);
        setField(term24311, term24311.getClass(), "next", term24311);
        setField(term23966, term23966.getClass(), "parameters", term24311);
        setField(term23872, term23872.getClass(), "call", term23966);
        term24276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24276, term24276.getClass(), "first", term24311);
        setField(term24276, term24276.getClass(), "next", term24346);
        setField(term24276, term24276.getClass(), "jsType", null);
        setField(term24276, term24276.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term23872;
        args[1] = term24276;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term23556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


