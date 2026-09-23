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

public class FunctionType_getGreatestSubtype_679591709485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403523;
     Object term404185;

    public FunctionType_getGreatestSubtype_679591709485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term477755 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term477754 = ((Class) term477755).getDeclaredField((String) "INTERFACE");
        ((Field) term477754).setAccessible(true);
        Object enum688 = ((Field) term477754).get((Object) null);
        term403523 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term404075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term403523, term403523.getClass(), "kind", enum688);
        setField(term403523, term403523.getClass(), "typeOfThis", term404075);
        Class<? extends Object> term478049 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term478048 = ((Class) term478049).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term478048).setAccessible(true);
        Object enum689 = ((Field) term478048).get((Object) null);
        term404185 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term404185, term404185.getClass(), "kind", enum689);
        setField(term404185, term404185.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term404185;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term403523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


