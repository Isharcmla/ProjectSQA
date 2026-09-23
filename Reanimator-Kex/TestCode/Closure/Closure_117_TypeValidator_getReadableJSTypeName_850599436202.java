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

public class TypeValidator_getReadableJSTypeName_850599436202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70931;
     Object term71001;

    public TypeValidator_getReadableJSTypeName_850599436202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70931 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term71001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamespaceType"));
        setIntField(term71001, term71001.getClass(), "type", -34);
        setField(term71001, term71001.getClass(), "jsType", term71103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term71001;
        args[1] = true;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term70931, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


