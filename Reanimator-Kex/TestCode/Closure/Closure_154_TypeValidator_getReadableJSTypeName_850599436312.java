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

public class TypeValidator_getReadableJSTypeName_850599436312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111053;
     Object term111139;

    public TypeValidator_getReadableJSTypeName_850599436312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111053 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term111139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term111225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term111349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term111435 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term111139, term111139.getClass(), "type", 33);
        setField(term111225, term111225.getClass(), "jsType", term111349);
        setField(term111139, term111139.getClass(), "first", term111225);
        setField(term111139, term111139.getClass(), "last", term111435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term111139;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term111053, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


