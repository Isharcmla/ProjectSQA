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

public class FunctionType_isSubtype_2101002158723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778898;
     Object term779552;

    public FunctionType_isSubtype_2101002158723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term780981 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term780980 = ((Class) term780981).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term780980).setAccessible(true);
        Object enum1404 = ((Field) term780980).get((Object) null);
        Class<? extends Object> term781281 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term781280 = ((Class) term781281).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term781280).setAccessible(true);
        Object enum1405 = ((Field) term781280).get((Object) null);
        term778898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term779442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term778898, term778898.getClass(), "kind", enum1404);
        setField(term779442, term779442.getClass(), "kind", enum1405);
        setField(term778898, term778898.getClass(), "typeOfThis", term779442);
        term779552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term779882 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term779552, term779552.getClass(), "kind", enum1404);
        setField(term779552, term779552.getClass(), "typeOfThis", term779882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term779552;
        try {
            callMethod(klass, "isSubtype", argTypes, term778898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


