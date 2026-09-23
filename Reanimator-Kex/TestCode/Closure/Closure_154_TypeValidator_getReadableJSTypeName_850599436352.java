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

public class TypeValidator_getReadableJSTypeName_850599436352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131775;
     Object term131861;

    public TypeValidator_getReadableJSTypeName_850599436352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131775 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term131861 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term131947 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term132047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setIntField(term131861, term131861.getClass(), "type", 33);
        setField(term131947, term131947.getClass(), "jsType", term132047);
        setField(term131861, term131861.getClass(), "first", term131947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term131861;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term131775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


