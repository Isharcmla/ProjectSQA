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

public class TypeValidator_getReadableJSTypeName_850599436270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89910;
     Object term89996;

    public TypeValidator_getReadableJSTypeName_850599436270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89910 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term89996 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term90082 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term90176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setIntField(term89996, term89996.getClass(), "type", 33);
        setField(term90082, term90082.getClass(), "jsType", term90176);
        setField(term89996, term89996.getClass(), "first", term90082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term89996;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term89910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


