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

public class TypeValidator_getReadableJSTypeName_850599436410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188247;
     Object term188339;

    public TypeValidator_getReadableJSTypeName_850599436410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188247 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term188339 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term188545 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term188631 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term188339, term188339.getClass(), "type", 33);
        setField(term188431, term188431.getClass(), "jsType", term188545);
        setField(term188339, term188339.getClass(), "first", term188431);
        setField(term188339, term188339.getClass(), "last", term188631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term188339;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term188247, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


