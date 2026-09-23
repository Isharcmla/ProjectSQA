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

public class FunctionType_isSubtype_21010021581193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1450578;
     Object term1451238;

    public FunctionType_isSubtype_21010021581193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1452480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1452479 = ((Class) term1452480).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1452479).setAccessible(true);
        Object enum2712 = ((Field) term1452479).get((Object) null);
        Class<? extends Object> term1452780 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1452779 = ((Class) term1452780).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1452779).setAccessible(true);
        Object enum2713 = ((Field) term1452779).get((Object) null);
        term1450578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1451130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1450578, term1450578.getClass(), "kind", enum2712);
        setField(term1451130, term1451130.getClass(), "kind", enum2713);
        setField(term1450578, term1450578.getClass(), "typeOfThis", term1451130);
        term1451238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1451420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1451238, term1451238.getClass(), "kind", enum2713);
        setField(term1451238, term1451238.getClass(), "typeOfThis", term1451420);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1451238;
        try {
            callMethod(klass, "isSubtype", argTypes, term1450578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


