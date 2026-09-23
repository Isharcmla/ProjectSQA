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

public class FunctionType_isSubtype_21010021581101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443808;
     Object term1444502;

    public FunctionType_isSubtype_21010021581101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1447527 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1447526 = ((Class) term1447527).getDeclaredField((String) "ORDINARY");
        ((Field) term1447526).setAccessible(true);
        Object enum2590 = ((Field) term1447526).get((Object) null);
        Class<? extends Object> term1447818 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1447817 = ((Class) term1447818).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1447817).setAccessible(true);
        Object enum2591 = ((Field) term1447817).get((Object) null);
        term1443808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1444056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1444300 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term1444394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1443808, term1443808.getClass(), "kind", enum2590);
        setField(term1444056, term1444056.getClass(), "kind", enum2591);
        setField(term1444056, term1444056.getClass(), "typeOfThis", term1444300);
        setField(term1444056, term1444056.getClass(), "call", term1444394);
        setField(term1443808, term1443808.getClass(), "typeOfThis", term1444056);
        term1444502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1444684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1444784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1444878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1444502, term1444502.getClass(), "kind", enum2590);
        setField(term1444684, term1444684.getClass(), "kind", enum2590);
        setField(term1444684, term1444684.getClass(), "typeOfThis", term1444784);
        setField(term1444684, term1444684.getClass(), "call", term1444878);
        setField(term1444502, term1444502.getClass(), "typeOfThis", term1444684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1444502;
        try {
            callMethod(klass, "isSubtype", argTypes, term1443808, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


