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

public class TypeValidator_getReadableJSTypeName_850599436468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235828;
     Object term235920;

    public TypeValidator_getReadableJSTypeName_850599436468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term235828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term235920 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236012 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term236126 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term236212 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term235920, term235920.getClass(), "type", 33);
        setField(term236012, term236012.getClass(), "jsType", term236126);
        setField(term235920, term235920.getClass(), "first", term236012);
        setField(term235920, term235920.getClass(), "last", term236212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term235920;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term235828, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


