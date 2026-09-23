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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197083;
     Object term197279;

    public TypeValidator_getReadableJSTypeName_850599436418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197083 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term197187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term196632 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term197187, term197187.getClass(), "nativeTypes", term196632);
        setField(term197083, term197083.getClass(), "typeRegistry", term197187);
        term197279 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term197371 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term197279, term197279.getClass(), "type", 33);
        setField(term197371, term197371.getClass(), "jsType", null);
        setField(term197279, term197279.getClass(), "first", term197371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term197279;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term197083, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


