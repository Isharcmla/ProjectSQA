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

public class FunctionType_getAllImplementedInterfaces_572683533325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186217;

    public FunctionType_getAllImplementedInterfaces_572683533325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187197 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term187196 = ((Class) term187197).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term187196).setAccessible(true);
        Object enum343 = ((Field) term187196).get((Object) null);
        term186217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term186483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term186581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term186217, term186217.getClass(), "kind", enum343);
        setField(term186483, term186483.getClass(), "implicitPrototype", term186581);
        setField(term186217, term186217.getClass(), "prototype", term186483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term186217, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


