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

public class FunctionType_isSubtype_21010021581185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433846;
     Object term1434506;

    public FunctionType_isSubtype_21010021581185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1437278 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1437277 = ((Class) term1437278).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1437277).setAccessible(true);
        Object enum2681 = ((Field) term1437277).get((Object) null);
        Class<? extends Object> term1437578 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1437577 = ((Class) term1437578).getDeclaredField((String) "INTERFACE");
        ((Field) term1437577).setAccessible(true);
        Object enum2682 = ((Field) term1437577).get((Object) null);
        term1433846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1434398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1433846, term1433846.getClass(), "kind", enum2681);
        setField(term1434398, term1434398.getClass(), "kind", enum2682);
        setField(term1433846, term1433846.getClass(), "typeOfThis", term1434398);
        term1434506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1434836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1434506, term1434506.getClass(), "kind", enum2681);
        setField(term1434836, term1434836.getClass(), "kind", enum2682);
        setField(term1434506, term1434506.getClass(), "typeOfThis", term1434836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1434506;
        try {
            callMethod(klass, "isSubtype", argTypes, term1433846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


