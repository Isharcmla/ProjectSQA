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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84211;
     Object term84311;
     Object term84545;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84211 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term84211, term84211.getClass(), "returnType", null);
        setBooleanField(term84211, term84211.getClass(), "returnTypeInferred", false);
        setField(term84211, term84211.getClass(), "typeRegistry", null);
        term84311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term84405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term84475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84405, term84405.getClass(), "returnType", null);
        setBooleanField(term84405, term84405.getClass(), "returnTypeInferred", false);
        setField(term84475, term84475.getClass(), "first", null);
        setField(term84405, term84405.getClass(), "parameters", term84475);
        setField(term84311, term84311.getClass(), "call", term84405);
        term84545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84545, term84545.getClass(), "first", term84545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term84311;
        args[1] = term84545;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term84211, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


