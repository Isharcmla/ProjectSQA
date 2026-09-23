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

public class FunctionType_getGreatestSubtype_6795917091185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1593289;
     Object term1593951;

    public FunctionType_getGreatestSubtype_6795917091185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1595490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1595489 = ((Class) term1595490).getDeclaredField((String) "INTERFACE");
        ((Field) term1595489).setAccessible(true);
        Object enum2846 = ((Field) term1595489).get((Object) null);
        term1593289 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1593841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1593289, term1593289.getClass(), "kind", enum2846);
        setField(term1593841, term1593841.getClass(), "kind", enum2846);
        setField(term1593289, term1593289.getClass(), "typeOfThis", term1593841);
        Class<? extends Object> term1595784 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1595783 = ((Class) term1595784).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1595783).setAccessible(true);
        Object enum2847 = ((Field) term1595783).get((Object) null);
        Class<? extends Object> term1596084 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1596083 = ((Class) term1596084).getDeclaredField((String) "INTERFACE");
        ((Field) term1596083).setAccessible(true);
        Object enum2848 = ((Field) term1596083).get((Object) null);
        term1593951 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1594133 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1593951, term1593951.getClass(), "kind", enum2847);
        setField(term1594133, term1594133.getClass(), "kind", enum2848);
        setField(term1593951, term1593951.getClass(), "typeOfThis", term1594133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1593951;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1593289, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


