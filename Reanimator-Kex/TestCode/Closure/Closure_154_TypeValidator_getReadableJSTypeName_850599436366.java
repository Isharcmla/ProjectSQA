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

public class TypeValidator_getReadableJSTypeName_850599436366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141281;
     Object term141367;

    public TypeValidator_getReadableJSTypeName_850599436366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141281 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term141367 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term141453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term141367, term141367.getClass(), "type", 33);
        setField(term141453, term141453.getClass(), "jsType", null);
        setField(term141367, term141367.getClass(), "first", term141453);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term141367;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term141281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


