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

public class FunctionType_isSubtype_21010021581239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1697617;
     Object term1698269;

    public FunctionType_isSubtype_21010021581239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1699516 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1699515 = ((Class) term1699516).getDeclaredField((String) "ORDINARY");
        ((Field) term1699515).setAccessible(true);
        Object enum3032 = ((Field) term1699515).get((Object) null);
        Class<? extends Object> term1699807 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1699806 = ((Class) term1699807).getDeclaredField((String) "INTERFACE");
        ((Field) term1699806).setAccessible(true);
        Object enum3033 = ((Field) term1699806).get((Object) null);
        term1697617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1698161 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1697617, term1697617.getClass(), "kind", enum3032);
        setField(term1698161, term1698161.getClass(), "kind", enum3033);
        setField(term1697617, term1697617.getClass(), "typeOfThis", term1698161);
        term1698269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1698601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1698269, term1698269.getClass(), "kind", enum3032);
        setField(term1698601, term1698601.getClass(), "kind", enum3032);
        setField(term1698269, term1698269.getClass(), "typeOfThis", term1698601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1698269;
        try {
            callMethod(klass, "isSubtype", argTypes, term1697617, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


