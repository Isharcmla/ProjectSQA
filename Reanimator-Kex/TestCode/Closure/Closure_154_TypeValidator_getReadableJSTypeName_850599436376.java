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

public class TypeValidator_getReadableJSTypeName_850599436376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152332;
     Object term152522;

    public TypeValidator_getReadableJSTypeName_850599436376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152332 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term152436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term151881 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 0);
        setField(term152436, term152436.getClass(), "nativeTypes", term151881);
        setField(term152332, term152332.getClass(), "typeRegistry", term152436);
        term152522 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term152522, term152522.getClass(), "type", -34);
        setField(term152522, term152522.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term152522;
        args[1] = false;
        try {
            callMethod(klass, "getReadableJSTypeName", argTypes, term152332, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


