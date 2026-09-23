package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_checkFunctionEquivalenceHelper_377004953289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274875;

    public FunctionType_checkFunctionEquivalenceHelper_377004953289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term277448 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term277447 = ((Class) term277448).getDeclaredField((String) "ORDINARY");
        ((Field) term277447).setAccessible(true);
        Object enum495 = ((Field) term277447).get((Object) null);
        term274875 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term274875, term274875.getClass(), "kind", enum495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "checkFunctionEquivalenceHelper", argTypes, term274875, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


