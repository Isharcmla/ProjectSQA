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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96782;
     Object term96882;
     Object term97116;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96782 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term96782, term96782.getClass(), "returnType", null);
        setBooleanField(term96782, term96782.getClass(), "returnTypeInferred", false);
        setField(term96782, term96782.getClass(), "typeRegistry", null);
        term96882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term96976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term97046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96976, term96976.getClass(), "returnType", null);
        setBooleanField(term96976, term96976.getClass(), "returnTypeInferred", false);
        setField(term97046, term97046.getClass(), "first", null);
        setField(term96976, term96976.getClass(), "parameters", term97046);
        setField(term96882, term96882.getClass(), "call", term96976);
        term97116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term97116, term97116.getClass(), "first", term97116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term96882;
        args[1] = term97116;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term96782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


