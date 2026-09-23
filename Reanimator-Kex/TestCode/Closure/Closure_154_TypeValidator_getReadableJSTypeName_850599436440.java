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

public class TypeValidator_getReadableJSTypeName_850599436440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210553;
     Object term210639;

    public TypeValidator_getReadableJSTypeName_850599436440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210553 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term210639 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term210725 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term210821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term210907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term210639, term210639.getClass(), "type", 33);
        setField(term210725, term210725.getClass(), "jsType", term210821);
        setField(term210639, term210639.getClass(), "first", term210725);
        setField(term210639, term210639.getClass(), "last", term210907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term210639;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term210553, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


