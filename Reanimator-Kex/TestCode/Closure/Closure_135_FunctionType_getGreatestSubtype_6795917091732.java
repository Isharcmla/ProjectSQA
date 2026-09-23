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

public class FunctionType_getGreatestSubtype_6795917091732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2361537;
     Object term2362197;

    public FunctionType_getGreatestSubtype_6795917091732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2365997 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2365996 = ((Class) term2365997).getDeclaredField((String) "ORDINARY");
        ((Field) term2365996).setAccessible(true);
        Object enum4422 = ((Field) term2365996).get((Object) null);
        term2361537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2362089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2361537, term2361537.getClass(), "kind", enum4422);
        setField(term2362089, term2362089.getClass(), "kind", enum4422);
        setField(term2361537, term2361537.getClass(), "typeOfThis", term2362089);
        Class<? extends Object> term2366288 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2366287 = ((Class) term2366288).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2366287).setAccessible(true);
        Object enum4423 = ((Field) term2366287).get((Object) null);
        Class<? extends Object> term2366588 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2366587 = ((Class) term2366588).getDeclaredField((String) "INTERFACE");
        ((Field) term2366587).setAccessible(true);
        Object enum4424 = ((Field) term2366587).get((Object) null);
        term2362197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2362381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2362197, term2362197.getClass(), "kind", enum4423);
        setField(term2362381, term2362381.getClass(), "kind", enum4424);
        setField(term2362197, term2362197.getClass(), "typeOfThis", term2362381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2362197;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2361537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


