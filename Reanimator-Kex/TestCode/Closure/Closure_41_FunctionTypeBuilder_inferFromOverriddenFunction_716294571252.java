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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83351;
     Object term83451;
     Object term83615;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83351 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term83351, term83351.getClass(), "returnType", null);
        setBooleanField(term83351, term83351.getClass(), "returnTypeInferred", false);
        setField(term83351, term83351.getClass(), "typeRegistry", null);
        term83451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term83545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term83545, term83545.getClass(), "returnType", null);
        setBooleanField(term83545, term83545.getClass(), "returnTypeInferred", false);
        setField(term83545, term83545.getClass(), "parameters", null);
        setField(term83451, term83451.getClass(), "call", term83545);
        term83615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term83451;
        args[1] = term83615;
        callMethod(klass, "inferFromOverriddenFunction", argTypes, term83351, args);
    }

};


