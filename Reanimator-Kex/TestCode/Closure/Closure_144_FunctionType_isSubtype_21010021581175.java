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

public class FunctionType_isSubtype_21010021581175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1575825;
     Object term1576329;

    public FunctionType_isSubtype_21010021581175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1578059 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1578058 = ((Class) term1578059).getDeclaredField((String) "ORDINARY");
        ((Field) term1578058).setAccessible(true);
        Object enum2814 = ((Field) term1578058).get((Object) null);
        Class<? extends Object> term1578350 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1578349 = ((Class) term1578350).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1578349).setAccessible(true);
        Object enum2815 = ((Field) term1578349).get((Object) null);
        term1575825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1576073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1575825, term1575825.getClass(), "kind", enum2814);
        setField(term1576073, term1576073.getClass(), "kind", enum2815);
        setField(term1576073, term1576073.getClass(), "call", null);
        setField(term1575825, term1575825.getClass(), "typeOfThis", term1576073);
        term1576329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1576511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1576679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1576329, term1576329.getClass(), "kind", enum2814);
        setField(term1576511, term1576511.getClass(), "kind", enum2815);
        setField(term1576511, term1576511.getClass(), "call", term1576679);
        setField(term1576329, term1576329.getClass(), "typeOfThis", term1576511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1576329;
        try {
            callMethod(klass, "isSubtype", argTypes, term1575825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


