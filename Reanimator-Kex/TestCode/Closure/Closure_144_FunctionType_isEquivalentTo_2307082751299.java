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

public class FunctionType_isEquivalentTo_2307082751299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1802648;
     Object term1803014;

    public FunctionType_isEquivalentTo_2307082751299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1804202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1804201 = ((Class) term1804202).getDeclaredField((String) "ORDINARY");
        ((Field) term1804201).setAccessible(true);
        Object enum3204 = ((Field) term1804201).get((Object) null);
        term1802648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1802904 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1802648, term1802648.getClass(), "kind", enum3204);
        setField(term1802648, term1802648.getClass(), "typeOfThis", term1802904);
        Class<? extends Object> term1804493 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1804492 = ((Class) term1804493).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1804492).setAccessible(true);
        Object enum3205 = ((Field) term1804492).get((Object) null);
        term1803014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1803270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1803014, term1803014.getClass(), "kind", enum3205);
        setField(term1803014, term1803014.getClass(), "typeOfThis", term1803270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1803014;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term1802648, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


