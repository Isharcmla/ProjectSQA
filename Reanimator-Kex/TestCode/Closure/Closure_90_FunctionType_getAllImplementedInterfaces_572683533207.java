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

public class FunctionType_getAllImplementedInterfaces_572683533207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110796;

    public FunctionType_getAllImplementedInterfaces_572683533207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term112572 = ((Class) term112573).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term112572).setAccessible(true);
        Object enum222 = ((Field) term112572).get((Object) null);
        term110796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term111062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term110796, term110796.getClass(), "kind", enum222);
        setField(term110796, term110796.getClass(), "prototype", term111062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term110796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


