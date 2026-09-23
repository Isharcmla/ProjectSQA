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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62627;
     Object term62727;
     Object term62961;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62627 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term62627, term62627.getClass(), "returnType", null);
        setBooleanField(term62627, term62627.getClass(), "returnTypeInferred", false);
        setField(term62627, term62627.getClass(), "typeRegistry", null);
        term62727 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term62821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term62891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62821, term62821.getClass(), "returnType", null);
        setBooleanField(term62821, term62821.getClass(), "returnTypeInferred", false);
        setField(term62891, term62891.getClass(), "first", null);
        setField(term62821, term62821.getClass(), "parameters", term62891);
        setField(term62727, term62727.getClass(), "call", term62821);
        term62961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62961, term62961.getClass(), "first", term62961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term62727;
        args[1] = term62961;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term62627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


