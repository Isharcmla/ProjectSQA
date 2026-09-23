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

public class FunctionType_getGreatestSubtype_6795917091307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816091;
     Object term1816675;

    public FunctionType_getGreatestSubtype_6795917091307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1818277 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1818276 = ((Class) term1818277).getDeclaredField((String) "ORDINARY");
        ((Field) term1818276).setAccessible(true);
        Object enum3229 = ((Field) term1818276).get((Object) null);
        term1816091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1816349 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1816457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1816565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1816091, term1816091.getClass(), "kind", enum3229);
        setField(term1816349, term1816349.getClass(), "kind", enum3229);
        setField(term1816457, term1816457.getClass(), "kind", enum3229);
        setField(term1816457, term1816457.getClass(), "typeOfThis", term1816565);
        setField(term1816349, term1816349.getClass(), "typeOfThis", term1816457);
        setField(term1816091, term1816091.getClass(), "typeOfThis", term1816349);
        Class<? extends Object> term1818568 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1818567 = ((Class) term1818568).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1818567).setAccessible(true);
        Object enum3230 = ((Field) term1818567).get((Object) null);
        term1816675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1816849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1816949 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1816675, term1816675.getClass(), "kind", enum3229);
        setField(term1816849, term1816849.getClass(), "kind", enum3229);
        setField(term1816949, term1816949.getClass(), "kind", enum3230);
        setField(term1816949, term1816949.getClass(), "typeOfThis", null);
        setField(term1816849, term1816849.getClass(), "typeOfThis", term1816949);
        setField(term1816675, term1816675.getClass(), "typeOfThis", term1816849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1816675;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1816091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


