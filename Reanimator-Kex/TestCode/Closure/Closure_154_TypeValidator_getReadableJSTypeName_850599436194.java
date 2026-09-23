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

public class TypeValidator_getReadableJSTypeName_850599436194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62393;
     Object term62567;

    public TypeValidator_getReadableJSTypeName_850599436194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62393 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term62497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term62393, term62393.getClass(), "typeRegistry", term62497);
        term62567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62567, term62567.getClass(), "type", 33);
        setField(term62637, term62637.getClass(), "jsType", null);
        setField(term62567, term62567.getClass(), "first", term62637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term62567;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term62393, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


