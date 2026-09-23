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

public class FunctionType_isSubtype_2101002158988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1235178;
     Object term1235622;

    public FunctionType_isSubtype_2101002158988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1239406 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1239405 = ((Class) term1239406).getDeclaredField((String) "ORDINARY");
        ((Field) term1239405).setAccessible(true);
        Object enum2222 = ((Field) term1239405).get((Object) null);
        term1235178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1235426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1235514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1235178, term1235178.getClass(), "kind", enum2222);
        setField(term1235426, term1235426.getClass(), "kind", enum2222);
        setField(term1235426, term1235426.getClass(), "typeOfThis", term1235514);
        setField(term1235426, term1235426.getClass(), "call", null);
        setField(term1235178, term1235178.getClass(), "typeOfThis", term1235426);
        Class<? extends Object> term1239697 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1239696 = ((Class) term1239697).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1239696).setAccessible(true);
        Object enum2223 = ((Field) term1239696).get((Object) null);
        term1235622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1235804 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1236046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1235622, term1235622.getClass(), "kind", enum2222);
        setField(term1235804, term1235804.getClass(), "kind", enum2223);
        setField(term1235804, term1235804.getClass(), "typeOfThis", null);
        setField(term1235804, term1235804.getClass(), "call", term1236046);
        setField(term1235622, term1235622.getClass(), "typeOfThis", term1235804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1235622;
        try {
            callMethod(klass, "isSubtype", argTypes, term1235178, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


