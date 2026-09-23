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

public class FunctionType_isSubtype_21010021581251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549945;
     Object term1550605;

    public FunctionType_isSubtype_21010021581251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1552055 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1552054 = ((Class) term1552055).getDeclaredField((String) "ORDINARY");
        ((Field) term1552054).setAccessible(true);
        Object enum2895 = ((Field) term1552054).get((Object) null);
        Class<? extends Object> term1552346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1552345 = ((Class) term1552346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1552345).setAccessible(true);
        Object enum2896 = ((Field) term1552345).get((Object) null);
        term1549945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1550497 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1549945, term1549945.getClass(), "kind", enum2895);
        setField(term1550497, term1550497.getClass(), "kind", enum2896);
        setField(term1549945, term1549945.getClass(), "typeOfThis", term1550497);
        term1550605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1550935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1550605, term1550605.getClass(), "kind", enum2895);
        setField(term1550935, term1550935.getClass(), "kind", enum2895);
        setField(term1550605, term1550605.getClass(), "typeOfThis", term1550935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1550605;
        try {
            callMethod(klass, "isSubtype", argTypes, term1549945, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


