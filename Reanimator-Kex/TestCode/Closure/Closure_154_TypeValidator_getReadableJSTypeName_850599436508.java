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

public class TypeValidator_getReadableJSTypeName_850599436508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271644;
     Object term271730;

    public TypeValidator_getReadableJSTypeName_850599436508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271644 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term271730 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term271816 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term271924 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term272010 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term271730, term271730.getClass(), "type", 33);
        setField(term271816, term271816.getClass(), "jsType", term271924);
        setField(term271730, term271730.getClass(), "first", term271816);
        setField(term271730, term271730.getClass(), "last", term272010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term271730;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term271644, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


