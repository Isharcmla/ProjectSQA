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

public class FunctionType_getGreatestSubtype_679591709901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term966263;
     Object term966623;

    public FunctionType_getGreatestSubtype_679591709901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term967321 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term967320 = ((Class) term967321).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term967320).setAccessible(true);
        Object enum1801 = ((Field) term967320).get((Object) null);
        term966263 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term966515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term966263, term966263.getClass(), "kind", enum1801);
        setField(term966263, term966263.getClass(), "registry", term966515);
        term966623 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term966623, term966623.getClass(), "kind", enum1801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term966623;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term966263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


