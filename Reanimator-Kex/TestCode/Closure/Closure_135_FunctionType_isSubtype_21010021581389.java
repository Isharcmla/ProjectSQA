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

public class FunctionType_isSubtype_21010021581389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1787665;
     Object term1788325;

    public FunctionType_isSubtype_21010021581389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1789339 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1789338 = ((Class) term1789339).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1789338).setAccessible(true);
        Object enum3334 = ((Field) term1789338).get((Object) null);
        term1787665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1788217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1787665, term1787665.getClass(), "kind", enum3334);
        setField(term1788217, term1788217.getClass(), "kind", enum3334);
        setField(term1787665, term1787665.getClass(), "typeOfThis", term1788217);
        term1788325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1788655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1788325, term1788325.getClass(), "kind", enum3334);
        setField(term1788655, term1788655.getClass(), "kind", enum3334);
        setField(term1788325, term1788325.getClass(), "typeOfThis", term1788655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1788325;
        try {
            callMethod(klass, "isSubtype", argTypes, term1787665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


