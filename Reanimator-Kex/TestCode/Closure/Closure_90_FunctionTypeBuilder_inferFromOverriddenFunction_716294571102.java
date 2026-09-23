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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49556;
     Object term49656;
     Object term49890;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49556 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term49556, term49556.getClass(), "returnType", null);
        setBooleanField(term49556, term49556.getClass(), "returnTypeInferred", false);
        setField(term49556, term49556.getClass(), "typeRegistry", null);
        term49656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term49750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term49820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49750, term49750.getClass(), "returnType", null);
        setBooleanField(term49750, term49750.getClass(), "returnTypeInferred", false);
        setField(term49820, term49820.getClass(), "first", term49820);
        setField(term49750, term49750.getClass(), "parameters", term49820);
        setField(term49656, term49656.getClass(), "call", term49750);
        term49890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49890, term49890.getClass(), "first", term49890);
        setField(term49890, term49890.getClass(), "next", term49890);
        setField(term49890, term49890.getClass(), "jsType", null);
        setField(term49890, term49890.getClass(), "propListHead", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term49656;
        args[1] = term49890;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term49556, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


