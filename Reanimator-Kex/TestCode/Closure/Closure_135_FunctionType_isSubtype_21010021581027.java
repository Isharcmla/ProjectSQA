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

public class FunctionType_isSubtype_21010021581027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1164289;
     Object term1164949;

    public FunctionType_isSubtype_21010021581027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1168181 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1168180 = ((Class) term1168181).getDeclaredField((String) "ORDINARY");
        ((Field) term1168180).setAccessible(true);
        Object enum2175 = ((Field) term1168180).get((Object) null);
        term1164289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1164841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1164289, term1164289.getClass(), "kind", enum2175);
        setField(term1164841, term1164841.getClass(), "kind", enum2175);
        setField(term1164289, term1164289.getClass(), "typeOfThis", term1164841);
        Class<? extends Object> term1168472 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1168471 = ((Class) term1168472).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1168471).setAccessible(true);
        Object enum2176 = ((Field) term1168471).get((Object) null);
        term1164949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1165131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1164949, term1164949.getClass(), "kind", enum2176);
        setField(term1165131, term1165131.getClass(), "kind", enum2175);
        setField(term1164949, term1164949.getClass(), "typeOfThis", term1165131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1164949;
        try {
            callMethod(klass, "isSubtype", argTypes, term1164289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


