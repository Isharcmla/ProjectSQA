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

public class FunctionType_isSubtype_21010021581551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268314;
     Object term2268966;

    public FunctionType_isSubtype_21010021581551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2270415 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2270414 = ((Class) term2270415).getDeclaredField((String) "ORDINARY");
        ((Field) term2270414).setAccessible(true);
        Object enum4050 = ((Field) term2270414).get((Object) null);
        Class<? extends Object> term2270706 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2270705 = ((Class) term2270706).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2270705).setAccessible(true);
        Object enum4051 = ((Field) term2270705).get((Object) null);
        term2268314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2268858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2268314, term2268314.getClass(), "kind", enum4050);
        setField(term2268858, term2268858.getClass(), "kind", enum4051);
        setField(term2268858, term2268858.getClass(), "typeOfThis", null);
        setField(term2268314, term2268314.getClass(), "typeOfThis", term2268858);
        term2268966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2269298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2269398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2268966, term2268966.getClass(), "kind", enum4050);
        setField(term2269298, term2269298.getClass(), "kind", enum4050);
        setField(term2269298, term2269298.getClass(), "typeOfThis", term2269398);
        setField(term2268966, term2268966.getClass(), "typeOfThis", term2269298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2268966;
        try {
            callMethod(klass, "isSubtype", argTypes, term2268314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


