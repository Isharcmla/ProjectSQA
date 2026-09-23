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

public class TypeValidator_getReadableJSTypeName_850599436338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122973;
     Object term123065;

    public TypeValidator_getReadableJSTypeName_850599436338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122973 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term123065 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123157 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term123373 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term123065, term123065.getClass(), "type", 33);
        setField(term123157, term123157.getClass(), "jsType", term123281);
        setField(term123065, term123065.getClass(), "first", term123157);
        setField(term123065, term123065.getClass(), "last", term123373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term123065;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term122973, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


