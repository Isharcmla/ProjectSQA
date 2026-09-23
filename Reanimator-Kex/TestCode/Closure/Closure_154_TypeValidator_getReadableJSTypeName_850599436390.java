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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeValidator_getReadableJSTypeName_850599436390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167458;
     Object term167632;

    public TypeValidator_getReadableJSTypeName_850599436390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167458 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term167562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term167009 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term167562, term167562.getClass(), "nativeTypes", term167009);
        setField(term167458, term167458.getClass(), "typeRegistry", term167562);
        term167632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term167632, term167632.getClass(), "type", 33);
        setField(term167702, term167702.getClass(), "jsType", null);
        setField(term167632, term167632.getClass(), "first", term167702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term167632;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term167458, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


