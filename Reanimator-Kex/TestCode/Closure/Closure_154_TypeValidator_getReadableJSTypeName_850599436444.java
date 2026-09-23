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

public class TypeValidator_getReadableJSTypeName_850599436444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214899;
     Object term214985;

    public TypeValidator_getReadableJSTypeName_850599436444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214899 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term214985 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term215071 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term215167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term215259 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term214985, term214985.getClass(), "type", 33);
        setField(term215071, term215071.getClass(), "jsType", term215167);
        setField(term214985, term214985.getClass(), "first", term215071);
        setField(term214985, term214985.getClass(), "last", term215259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term214985;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term214899, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


