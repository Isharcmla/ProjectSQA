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

public class FunctionType_isSubtype_21010021581211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1640833;
     Object term1641583;

    public FunctionType_isSubtype_21010021581211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1643149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1643148 = ((Class) term1643149).getDeclaredField((String) "ORDINARY");
        ((Field) term1643148).setAccessible(true);
        Object enum2933 = ((Field) term1643148).get((Object) null);
        Class<? extends Object> term1643440 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1643439 = ((Class) term1643440).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1643439).setAccessible(true);
        Object enum2934 = ((Field) term1643439).get((Object) null);
        term1640833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1641963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1642012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term1640833, term1640833.getClass(), "kind", enum2933);
        setField(term1641963, term1641963.getClass(), "kind", enum2934);
        setField(term1641963, term1641963.getClass(), "typeOfThis", term1642012);
        setField(term1641963, term1641963.getClass(), "call", null);
        setField(term1640833, term1640833.getClass(), "typeOfThis", term1641963);
        term1641583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1641913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1642106 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1641583, term1641583.getClass(), "kind", enum2933);
        setField(term1641913, term1641913.getClass(), "kind", enum2933);
        setField(term1641913, term1641913.getClass(), "typeOfThis", term1641963);
        setField(term1641913, term1641913.getClass(), "call", term1642106);
        setField(term1641583, term1641583.getClass(), "typeOfThis", term1641913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1641583;
        try {
            callMethod(klass, "isSubtype", argTypes, term1640833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


