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

public class FunctionType_isSubtype_21010021581497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1966446;
     Object term1966902;

    public FunctionType_isSubtype_21010021581497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1968480 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1968479 = ((Class) term1968480).getDeclaredField((String) "ORDINARY");
        ((Field) term1968479).setAccessible(true);
        Object enum3667 = ((Field) term1968479).get((Object) null);
        term1966446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1966694 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1966794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1966446, term1966446.getClass(), "kind", enum3667);
        setField(term1966694, term1966694.getClass(), "kind", enum3667);
        setField(term1966694, term1966694.getClass(), "typeOfThis", term1966794);
        setField(term1966446, term1966446.getClass(), "typeOfThis", term1966694);
        Class<? extends Object> term1968771 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1968770 = ((Class) term1968771).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1968770).setAccessible(true);
        Object enum3668 = ((Field) term1968770).get((Object) null);
        term1966902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1967084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1966902, term1966902.getClass(), "kind", enum3667);
        setField(term1967084, term1967084.getClass(), "kind", enum3668);
        setField(term1967084, term1967084.getClass(), "typeOfThis", null);
        setField(term1966902, term1966902.getClass(), "typeOfThis", term1967084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1966902;
        try {
            callMethod(klass, "isSubtype", argTypes, term1966446, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


