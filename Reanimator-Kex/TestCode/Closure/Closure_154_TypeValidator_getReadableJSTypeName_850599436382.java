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

public class TypeValidator_getReadableJSTypeName_850599436382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156777;
     Object term156869;

    public TypeValidator_getReadableJSTypeName_850599436382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term156777 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term156869 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term156961 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term157075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term157167 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term156869, term156869.getClass(), "type", 33);
        setField(term156961, term156961.getClass(), "jsType", term157075);
        setField(term156869, term156869.getClass(), "first", term156961);
        setField(term156869, term156869.getClass(), "last", term157167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term156869;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term156777, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


