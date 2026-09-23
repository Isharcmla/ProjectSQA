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
import java.util.ArrayList;

public class FunctionType_getAllImplementedInterfaces_572683533935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1021452;

    public FunctionType_getAllImplementedInterfaces_572683533935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1022664 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1022663 = ((Class) term1022664).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1022663).setAccessible(true);
        Object enum1906 = ((Field) term1022663).get((Object) null);
        Object term1021972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term1022010 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term1021878 = new ArrayList();
        ((ArrayList) term1021878).add(term1021972);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add(term1022010);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        ((ArrayList) term1021878).add((Object)null);
        term1021452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1021718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1021826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1021452, term1021452.getClass(), "kind", enum1906);
        setField(term1021718, term1021718.getClass(), "implicitPrototype", term1021826);
        setField(term1021452, term1021452.getClass(), "prototype", term1021718);
        setField(term1021452, term1021452.getClass(), "implementedInterfaces", term1021878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAllImplementedInterfaces", argTypes, term1021452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


