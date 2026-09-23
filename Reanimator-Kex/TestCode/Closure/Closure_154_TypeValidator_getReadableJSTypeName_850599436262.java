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

public class TypeValidator_getReadableJSTypeName_850599436262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83991;
     Object term84077;

    public TypeValidator_getReadableJSTypeName_850599436262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83991 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term84077 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84163 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term84287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term84373 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term84077, term84077.getClass(), "type", 33);
        setField(term84163, term84163.getClass(), "jsType", term84287);
        setField(term84077, term84077.getClass(), "first", term84163);
        setField(term84077, term84077.getClass(), "last", term84373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term84077;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term83991, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


