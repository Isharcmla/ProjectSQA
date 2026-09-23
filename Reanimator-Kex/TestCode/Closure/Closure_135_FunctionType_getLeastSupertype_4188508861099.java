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

public class FunctionType_getLeastSupertype_4188508861099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283717;
     Object term1284467;

    public FunctionType_getLeastSupertype_4188508861099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1286818 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1286817 = ((Class) term1286818).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1286817).setAccessible(true);
        Object enum2397 = ((Field) term1286817).get((Object) null);
        term1283717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1284271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1284359 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1283717, term1283717.getClass(), "kind", enum2397);
        setField(term1284271, term1284271.getClass(), "kind", enum2397);
        setField(term1284271, term1284271.getClass(), "typeOfThis", term1284359);
        setField(term1283717, term1283717.getClass(), "typeOfThis", term1284271);
        Class<? extends Object> term1287118 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1287117 = ((Class) term1287118).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1287117).setAccessible(true);
        Object enum2398 = ((Field) term1287117).get((Object) null);
        term1284467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1284641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1284467, term1284467.getClass(), "kind", enum2398);
        setField(term1284641, term1284641.getClass(), "kind", enum2398);
        setField(term1284641, term1284641.getClass(), "typeOfThis", null);
        setField(term1284467, term1284467.getClass(), "typeOfThis", term1284641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1284467;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1283717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


