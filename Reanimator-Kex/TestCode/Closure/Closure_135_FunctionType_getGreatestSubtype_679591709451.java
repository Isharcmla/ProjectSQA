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

public class FunctionType_getGreatestSubtype_679591709451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303972;
     Object term304336;

    public FunctionType_getGreatestSubtype_679591709451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term305542 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term305541 = ((Class) term305542).getDeclaredField((String) "ORDINARY");
        ((Field) term305541).setAccessible(true);
        Object enum555 = ((Field) term305541).get((Object) null);
        term303972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term304228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term303972, term303972.getClass(), "kind", enum555);
        setField(term303972, term303972.getClass(), "typeOfThis", term304228);
        Class<? extends Object> term305833 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term305832 = ((Class) term305833).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term305832).setAccessible(true);
        Object enum556 = ((Field) term305832).get((Object) null);
        term304336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term304584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term304336, term304336.getClass(), "kind", enum556);
        setField(term304336, term304336.getClass(), "typeOfThis", term304584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term304336;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term303972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


