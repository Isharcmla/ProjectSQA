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

public class FunctionType_isSubtype_21010021581091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1270918;
     Object term1271578;

    public FunctionType_isSubtype_21010021581091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1274118 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1274117 = ((Class) term1274118).getDeclaredField((String) "ORDINARY");
        ((Field) term1274117).setAccessible(true);
        Object enum2373 = ((Field) term1274117).get((Object) null);
        Class<? extends Object> term1274409 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1274408 = ((Class) term1274409).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1274408).setAccessible(true);
        Object enum2374 = ((Field) term1274408).get((Object) null);
        term1270918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1271470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1270918, term1270918.getClass(), "kind", enum2373);
        setField(term1271470, term1271470.getClass(), "kind", enum2374);
        setField(term1270918, term1270918.getClass(), "typeOfThis", term1271470);
        term1271578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1271760 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1271578, term1271578.getClass(), "kind", enum2374);
        setField(term1271578, term1271578.getClass(), "typeOfThis", term1271760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1271578;
        try {
            callMethod(klass, "isSubtype", argTypes, term1270918, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


