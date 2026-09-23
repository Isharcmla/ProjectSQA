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

public class TypeValidator_getReadableJSTypeName_850599436234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73908;
     Object term73978;

    public TypeValidator_getReadableJSTypeName_850599436234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73908 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term73978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74162 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term73978, term73978.getClass(), "type", 33);
        setField(term74048, term74048.getClass(), "jsType", term74162);
        setField(term73978, term73978.getClass(), "first", term74048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term73978;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term73908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


