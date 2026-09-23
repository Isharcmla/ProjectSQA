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

public class FunctionTypeBuilder_inferParameterTypes_212883572175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82537;
     Object term82711;
     Object term82861;

    public FunctionTypeBuilder_inferParameterTypes_212883572175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82537 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term82641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term82537, term82537.getClass(), "typeRegistry", term82641);
        term82711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term82711, term82711.getClass(), "first", term82781);
        term82861 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term82861, term82861.getClass(), "info", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Object[] args = new Object[2];
        args[0] = term82711;
        args[1] = term82861;
        try {
            callMethod(klass, "inferParameterTypes", argTypes, term82537, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


