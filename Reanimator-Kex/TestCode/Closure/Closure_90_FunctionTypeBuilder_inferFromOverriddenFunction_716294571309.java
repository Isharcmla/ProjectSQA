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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121389;
     Object term121593;
     Object term121827;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121389 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term121493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term121389, term121389.getClass(), "returnType", null);
        setBooleanField(term121389, term121389.getClass(), "returnTypeInferred", false);
        setField(term121389, term121389.getClass(), "typeRegistry", term121493);
        term121593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term121687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term121862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121687, term121687.getClass(), "returnType", null);
        setBooleanField(term121687, term121687.getClass(), "returnTypeInferred", false);
        setField(term121862, term121862.getClass(), "first", null);
        setField(term121687, term121687.getClass(), "parameters", term121862);
        setField(term121593, term121593.getClass(), "call", term121687);
        term121827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term121827, term121827.getClass(), "first", term121862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term121593;
        args[1] = term121827;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term121389, args);
    }

};


