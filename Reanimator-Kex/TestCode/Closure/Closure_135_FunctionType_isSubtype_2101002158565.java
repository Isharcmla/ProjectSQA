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

public class FunctionType_isSubtype_2101002158565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450488;
     Object term451140;

    public FunctionType_isSubtype_2101002158565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term452589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term452588 = ((Class) term452589).getDeclaredField((String) "INTERFACE");
        ((Field) term452588).setAccessible(true);
        Object enum837 = ((Field) term452588).get((Object) null);
        Class<? extends Object> term452883 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term452882 = ((Class) term452883).getDeclaredField((String) "INTERFACE");
        ((Field) term452882).setAccessible(true);
        Object enum838 = ((Field) term452882).get((Object) null);
        term450488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term451032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term450488, term450488.getClass(), "kind", enum837);
        setField(term451032, term451032.getClass(), "kind", enum838);
        setField(term450488, term450488.getClass(), "typeOfThis", term451032);
        term451140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term451470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term451140, term451140.getClass(), "kind", enum837);
        setField(term451140, term451140.getClass(), "typeOfThis", term451470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term451140;
        try {
            callMethod(klass, "isSubtype", argTypes, term450488, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


