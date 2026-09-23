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

public class FunctionType_getLeastSupertype_418850886519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386006;
     Object term386668;

    public FunctionType_getLeastSupertype_418850886519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term389044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term389043 = ((Class) term389044).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term389043).setAccessible(true);
        Object enum713 = ((Field) term389043).get((Object) null);
        Class<? extends Object> term389344 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term389343 = ((Class) term389344).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term389343).setAccessible(true);
        Object enum714 = ((Field) term389343).get((Object) null);
        term386006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term386560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term386006, term386006.getClass(), "kind", enum713);
        setField(term386560, term386560.getClass(), "kind", enum714);
        setField(term386006, term386006.getClass(), "typeOfThis", term386560);
        term386668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term386842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term386668, term386668.getClass(), "kind", enum714);
        setField(term386668, term386668.getClass(), "typeOfThis", term386842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term386668;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term386006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


