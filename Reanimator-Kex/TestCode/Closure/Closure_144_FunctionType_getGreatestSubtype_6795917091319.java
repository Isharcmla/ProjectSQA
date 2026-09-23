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

public class FunctionType_getGreatestSubtype_6795917091319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1841202;
     Object term1842078;

    public FunctionType_getGreatestSubtype_6795917091319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1843752 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1843751 = ((Class) term1843752).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1843751).setAccessible(true);
        Object enum3273 = ((Field) term1843751).get((Object) null);
        term1841202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1841756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1841864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1841968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1841202, term1841202.getClass(), "kind", enum3273);
        setField(term1841756, term1841756.getClass(), "kind", enum3273);
        setField(term1841864, term1841864.getClass(), "kind", enum3273);
        setField(term1841756, term1841756.getClass(), "typeOfThis", term1841864);
        setField(term1841202, term1841202.getClass(), "typeOfThis", term1841756);
        setField(term1841202, term1841202.getClass(), "registry", term1841968);
        Class<? extends Object> term1844052 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1844051 = ((Class) term1844052).getDeclaredField((String) "INTERFACE");
        ((Field) term1844051).setAccessible(true);
        Object enum3274 = ((Field) term1844051).get((Object) null);
        Class<? extends Object> term1844346 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1844345 = ((Class) term1844346).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1844345).setAccessible(true);
        Object enum3275 = ((Field) term1844345).get((Object) null);
        term1842078 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1842260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1842444 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1842078, term1842078.getClass(), "kind", enum3274);
        setField(term1842260, term1842260.getClass(), "kind", enum3275);
        setField(term1842444, term1842444.getClass(), "kind", enum3274);
        setField(term1842260, term1842260.getClass(), "typeOfThis", term1842444);
        setField(term1842078, term1842078.getClass(), "typeOfThis", term1842260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1842078;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1841202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


