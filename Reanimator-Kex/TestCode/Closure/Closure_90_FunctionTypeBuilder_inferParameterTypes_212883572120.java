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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionTypeBuilder_inferParameterTypes_212883572120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53577;
     Object term53751;

    public FunctionTypeBuilder_inferParameterTypes_212883572120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53577 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term53681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term53577, term53577.getClass(), "parametersNode", null);
        setField(term53577, term53577.getClass(), "typeRegistry", term53681);
        term53751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term53821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term53821, term53821.getClass(), "type", 0);
        setField(term53821, term53821.getClass(), "parent", null);
        setIntField(term53821, term53821.getClass(), "sourcePosition", 0);
        setField(term53821, term53821.getClass(), "first", null);
        setField(term53751, term53751.getClass(), "first", term53821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term53751;
        args[1] = null;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term53577, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


