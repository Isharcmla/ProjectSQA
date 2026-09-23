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

public class FunctionType_getGreatestSubtype_679591709435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355420;
     Object term356080;

    public FunctionType_getGreatestSubtype_679591709435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term357095 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term357094 = ((Class) term357095).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term357094).setAccessible(true);
        Object enum604 = ((Field) term357094).get((Object) null);
        term355420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term355970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term355420, term355420.getClass(), "kind", enum604);
        setField(term355420, term355420.getClass(), "typeOfThis", term355970);
        Class<? extends Object> term357395 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term357394 = ((Class) term357395).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term357394).setAccessible(true);
        Object enum605 = ((Field) term357394).get((Object) null);
        term356080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term356080, term356080.getClass(), "kind", enum605);
        setField(term356080, term356080.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term356080;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term355420, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


