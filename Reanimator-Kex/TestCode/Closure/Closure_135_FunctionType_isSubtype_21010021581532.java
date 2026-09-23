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

public class FunctionType_isSubtype_21010021581532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026473;
     Object term2027135;

    public FunctionType_isSubtype_21010021581532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2030137 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2030136 = ((Class) term2030137).getDeclaredField((String) "INTERFACE");
        ((Field) term2030136).setAccessible(true);
        Object enum3779 = ((Field) term2030136).get((Object) null);
        term2026473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2027027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2026473, term2026473.getClass(), "kind", enum3779);
        setField(term2026473, term2026473.getClass(), "typeOfThis", term2027027);
        Class<? extends Object> term2030431 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2030430 = ((Class) term2030431).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2030430).setAccessible(true);
        Object enum3780 = ((Field) term2030430).get((Object) null);
        term2027135 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2027135, term2027135.getClass(), "kind", enum3780);
        setField(term2027135, term2027135.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2027135;
        try {
            callMethod(klass, "isSubtype", argTypes, term2026473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


