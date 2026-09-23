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

public class FunctionType_isSubtype_21010021581177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417551;
     Object term1418303;

    public FunctionType_isSubtype_21010021581177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1422119 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1422118 = ((Class) term1422119).getDeclaredField((String) "INTERFACE");
        ((Field) term1422118).setAccessible(true);
        Object enum2653 = ((Field) term1422118).get((Object) null);
        term1417551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1418095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1418195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1417551, term1417551.getClass(), "kind", enum2653);
        setField(term1418095, term1418095.getClass(), "kind", enum2653);
        setField(term1418095, term1418095.getClass(), "typeOfThis", term1418195);
        setField(term1417551, term1417551.getClass(), "typeOfThis", term1418095);
        Class<? extends Object> term1422413 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1422412 = ((Class) term1422413).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1422412).setAccessible(true);
        Object enum2654 = ((Field) term1422412).get((Object) null);
        term1418303 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1418485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1418721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1418303, term1418303.getClass(), "kind", enum2654);
        setField(term1418485, term1418485.getClass(), "kind", enum2653);
        setField(term1418485, term1418485.getClass(), "typeOfThis", term1418721);
        setField(term1418303, term1418303.getClass(), "typeOfThis", term1418485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1418303;
        try {
            callMethod(klass, "isSubtype", argTypes, term1417551, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


