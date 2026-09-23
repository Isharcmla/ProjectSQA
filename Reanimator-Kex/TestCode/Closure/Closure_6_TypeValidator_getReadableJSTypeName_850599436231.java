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

public class TypeValidator_getReadableJSTypeName_850599436231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65551;
     Object term65643;

    public TypeValidator_getReadableJSTypeName_850599436231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65551 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term65643 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term65735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term65643, term65643.getClass(), "type", -34);
        setField(term65643, term65643.getClass(), "jsType", term65735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term65643;
        args[1] = true;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term65551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


