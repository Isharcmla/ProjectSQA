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

public class TypeValidator_getReadableJSTypeName_850599436203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71998;
     Object term72068;

    public TypeValidator_getReadableJSTypeName_850599436203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71998 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term72068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setIntField(term72068, term72068.getClass(), "type", -34);
        setField(term72068, term72068.getClass(), "jsType", term72174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72068;
        args[1] = true;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term71998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


