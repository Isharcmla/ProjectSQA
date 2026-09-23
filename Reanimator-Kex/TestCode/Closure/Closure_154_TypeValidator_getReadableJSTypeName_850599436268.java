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

public class TypeValidator_getReadableJSTypeName_850599436268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89286;
     Object term89356;

    public TypeValidator_getReadableJSTypeName_850599436268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89286 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term89356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term89356, term89356.getClass(), "type", 33);
        setField(term89426, term89426.getClass(), "jsType", term89518);
        setField(term89356, term89356.getClass(), "first", term89426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term89356;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term89286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


