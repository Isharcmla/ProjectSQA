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

public class FunctionType_isSubtype_21010021581279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596828;
     Object term1597284;

    public FunctionType_isSubtype_21010021581279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1600495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1600494 = ((Class) term1600495).getDeclaredField((String) "ORDINARY");
        ((Field) term1600494).setAccessible(true);
        Object enum2984 = ((Field) term1600494).get((Object) null);
        term1596828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1597076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1597176 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1596828, term1596828.getClass(), "kind", enum2984);
        setField(term1597076, term1597076.getClass(), "kind", enum2984);
        setField(term1597076, term1597076.getClass(), "typeOfThis", term1597176);
        setField(term1596828, term1596828.getClass(), "typeOfThis", term1597076);
        Class<? extends Object> term1600786 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1600785 = ((Class) term1600786).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1600785).setAccessible(true);
        Object enum2985 = ((Field) term1600785).get((Object) null);
        term1597284 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1597458 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1597284, term1597284.getClass(), "kind", enum2984);
        setField(term1597458, term1597458.getClass(), "kind", enum2985);
        setField(term1597458, term1597458.getClass(), "typeOfThis", null);
        setField(term1597284, term1597284.getClass(), "typeOfThis", term1597458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1597284;
        try {
            callMethod(klass, "isSubtype", argTypes, term1596828, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


