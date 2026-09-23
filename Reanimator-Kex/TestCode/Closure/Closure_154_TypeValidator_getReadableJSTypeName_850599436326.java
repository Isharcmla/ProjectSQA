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

public class TypeValidator_getReadableJSTypeName_850599436326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118748;
     Object term118840;

    public TypeValidator_getReadableJSTypeName_850599436326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term118840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term118840, term118840.getClass(), "type", -34);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term118840;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term118748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


