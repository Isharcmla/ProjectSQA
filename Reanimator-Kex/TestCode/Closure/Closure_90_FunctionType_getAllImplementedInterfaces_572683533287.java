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

public class FunctionType_getAllImplementedInterfaces_572683533287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178560;

    public FunctionType_getAllImplementedInterfaces_572683533287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term179568 = ((Class) term179569).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term179568).setAccessible(true);
        Object enum328 = ((Field) term179568).get((Object) null);
        term178560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term178826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term178926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term178560, term178560.getClass(), "kind", enum328);
        setField(term178826, term178826.getClass(), "implicitPrototypeFallback", term178926);
        setField(term178560, term178560.getClass(), "prototype", term178826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term178560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


