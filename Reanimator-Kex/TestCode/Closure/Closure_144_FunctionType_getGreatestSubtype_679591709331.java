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

public class FunctionType_getGreatestSubtype_679591709331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224729;
     Object term225393;

    public FunctionType_getGreatestSubtype_679591709331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term226414 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term226413 = ((Class) term226414).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term226413).setAccessible(true);
        Object enum425 = ((Field) term226413).get((Object) null);
        term224729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term225283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term224729, term224729.getClass(), "kind", enum425);
        setField(term224729, term224729.getClass(), "typeOfThis", term225283);
        Class<? extends Object> term226714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term226713 = ((Class) term226714).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term226713).setAccessible(true);
        Object enum426 = ((Field) term226713).get((Object) null);
        term225393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term225393, term225393.getClass(), "kind", enum426);
        setField(term225393, term225393.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term225393;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term224729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


