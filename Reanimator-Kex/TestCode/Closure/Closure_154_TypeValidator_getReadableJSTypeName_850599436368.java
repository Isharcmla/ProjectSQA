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

public class TypeValidator_getReadableJSTypeName_850599436368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143399;
     Object term143595;

    public TypeValidator_getReadableJSTypeName_850599436368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143399 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term143503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term143399, term143399.getClass(), "typeRegistry", term143503);
        term143595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term143687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143595, term143595.getClass(), "type", 33);
        setField(term143687, term143687.getClass(), "jsType", null);
        setField(term143595, term143595.getClass(), "first", term143687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term143595;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term143399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


