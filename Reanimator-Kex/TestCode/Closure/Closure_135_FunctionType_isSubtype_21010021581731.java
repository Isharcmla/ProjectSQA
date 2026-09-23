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

public class FunctionType_isSubtype_21010021581731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2359505;
     Object term2360165;

    public FunctionType_isSubtype_21010021581731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2363766 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2363765 = ((Class) term2363766).getDeclaredField((String) "INTERFACE");
        ((Field) term2363765).setAccessible(true);
        Object enum4416 = ((Field) term2363765).get((Object) null);
        term2359505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2360057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2359505, term2359505.getClass(), "kind", enum4416);
        setField(term2360057, term2360057.getClass(), "kind", enum4416);
        setField(term2359505, term2359505.getClass(), "typeOfThis", term2360057);
        Class<? extends Object> term2364060 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2364059 = ((Class) term2364060).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2364059).setAccessible(true);
        Object enum4417 = ((Field) term2364059).get((Object) null);
        Class<? extends Object> term2364360 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2364359 = ((Class) term2364360).getDeclaredField((String) "INTERFACE");
        ((Field) term2364359).setAccessible(true);
        Object enum4418 = ((Field) term2364359).get((Object) null);
        term2360165 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2360349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2360165, term2360165.getClass(), "kind", enum4417);
        setField(term2360349, term2360349.getClass(), "kind", enum4418);
        setField(term2360165, term2360165.getClass(), "typeOfThis", term2360349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2360165;
        try {
            callMethod(klass, "isSubtype", argTypes, term2359505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


