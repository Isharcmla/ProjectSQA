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

public class FunctionTypeBuilder_inferFromOverriddenFunction_71629457171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41961;
     Object term42165;
     Object term42499;

    public FunctionTypeBuilder_inferFromOverriddenFunction_71629457171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41961 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term42065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term41961, term41961.getClass(), "returnType", null);
        setBooleanField(term41961, term41961.getClass(), "returnTypeInferred", false);
        setField(term41961, term41961.getClass(), "typeRegistry", term42065);
        term42165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term42259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term42359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term42429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42259, term42259.getClass(), "returnType", term42359);
        setBooleanField(term42259, term42259.getClass(), "returnTypeInferred", false);
        setField(term42429, term42429.getClass(), "first", term42429);
        setField(term42429, term42429.getClass(), "next", null);
        setField(term42429, term42429.getClass(), "jsType", null);
        setField(term42429, term42429.getClass(), "propListHead", null);
        setField(term42259, term42259.getClass(), "parameters", term42429);
        setField(term42165, term42165.getClass(), "call", term42259);
        term42499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42499, term42499.getClass(), "first", term42499);
        setField(term42499, term42499.getClass(), "next", term42499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term42165;
        args[1] = term42499;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term41961, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


