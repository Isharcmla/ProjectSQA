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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623667;

    public FunctionType_getAllImplementedInterfaces_572683533687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term625063 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term625062 = ((Class) term625063).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term625062).setAccessible(true);
        Object enum1160 = ((Field) term625062).get((Object) null);
        Object term624131 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term624093 = new ArrayList();
        ((ArrayList) term624093).add(term624131);
        term623667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term623933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term624041 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term623667, term623667.getClass(), "kind", enum1160);
        setField(term623933, term623933.getClass(), "implicitPrototype", term624041);
        setField(term623667, term623667.getClass(), "prototype", term623933);
        setField(term623667, term623667.getClass(), "implementedInterfaces", term624093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term623667, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


