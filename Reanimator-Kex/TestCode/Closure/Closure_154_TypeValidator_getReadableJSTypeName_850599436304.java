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

public class TypeValidator_getReadableJSTypeName_850599436304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106718;
     Object term106804;

    public TypeValidator_getReadableJSTypeName_850599436304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106718 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term106804 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term106890 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term107014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term107100 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term106804, term106804.getClass(), "type", 33);
        setField(term106890, term106890.getClass(), "jsType", term107014);
        setField(term106804, term106804.getClass(), "first", term106890);
        setField(term106804, term106804.getClass(), "last", term107100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term106804;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term106718, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


