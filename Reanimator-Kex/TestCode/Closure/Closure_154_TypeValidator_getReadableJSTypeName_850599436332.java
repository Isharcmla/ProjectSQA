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

public class TypeValidator_getReadableJSTypeName_850599436332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120408;
     Object term120494;

    public TypeValidator_getReadableJSTypeName_850599436332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120408 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term120494 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120580 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term120704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term120796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term120494, term120494.getClass(), "type", 33);
        setField(term120580, term120580.getClass(), "jsType", term120704);
        setField(term120494, term120494.getClass(), "first", term120580);
        setField(term120494, term120494.getClass(), "last", term120796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term120494;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term120408, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


