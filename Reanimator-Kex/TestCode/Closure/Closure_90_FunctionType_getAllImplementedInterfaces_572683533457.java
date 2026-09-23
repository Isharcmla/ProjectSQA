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

public class FunctionType_getAllImplementedInterfaces_572683533457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377718;

    public FunctionType_getAllImplementedInterfaces_572683533457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term378745 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term378744 = ((Class) term378745).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term378744).setAccessible(true);
        Object enum644 = ((Field) term378744).get((Object) null);
        term377718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term377984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term378102 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term377718, term377718.getClass(), "kind", enum644);
        setField(term377984, term377984.getClass(), "implicitPrototypeFallback", term378102);
        setField(term377718, term377718.getClass(), "prototype", term377984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term377718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


