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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58985;
     Object term59085;
     Object term59319;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58985 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term58985, term58985.getClass(), "returnType", null);
        setField(term58985, term58985.getClass(), "typeRegistry", null);
        term59085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term59179 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term59249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59179, term59179.getClass(), "returnType", null);
        setField(term59249, term59249.getClass(), "first", null);
        setField(term59179, term59179.getClass(), "parameters", term59249);
        setField(term59085, term59085.getClass(), "call", term59179);
        term59319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term59319, term59319.getClass(), "first", term59319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term59085;
        args[1] = term59319;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term58985, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


