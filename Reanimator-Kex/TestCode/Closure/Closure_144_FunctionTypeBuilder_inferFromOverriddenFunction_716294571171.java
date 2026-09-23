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

public class FunctionTypeBuilder_inferFromOverriddenFunction_716294571171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80824;
     Object term80924;
     Object term81258;

    public FunctionTypeBuilder_inferFromOverriddenFunction_716294571171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80824 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        setField(term80824, term80824.getClass(), "returnType", null);
        setField(term80824, term80824.getClass(), "typeRegistry", null);
        term80924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term81018 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term81118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term81188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81018, term81018.getClass(), "returnType", term81118);
        setField(term81188, term81188.getClass(), "first", null);
        setField(term81018, term81018.getClass(), "parameters", term81188);
        setField(term80924, term80924.getClass(), "call", term81018);
        term81258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81258, term81258.getClass(), "first", term81258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term80924;
        args[1] = term81258;
        try {
            callMethod(klass, "inferFromOverriddenFunction", argTypes, term80824, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


