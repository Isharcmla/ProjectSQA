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

public class TypeValidator_getReadableJSTypeName_850599436233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65851;
     Object term65943;

    public TypeValidator_getReadableJSTypeName_850599436233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65851 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term65943 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term66037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term65943, term65943.getClass(), "type", -34);
        setField(term65943, term65943.getClass(), "jsType", term66037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term65943;
        args[1] = true;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term65851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


