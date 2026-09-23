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

public class FunctionType_isSubtype_21010021581249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1713852;
     Object term1714612;

    public FunctionType_isSubtype_21010021581249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1716631 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1716630 = ((Class) term1716631).getDeclaredField((String) "INTERFACE");
        ((Field) term1716630).setAccessible(true);
        Object enum3060 = ((Field) term1716630).get((Object) null);
        term1713852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1714396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1714504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1713852, term1713852.getClass(), "kind", enum3060);
        setField(term1714396, term1714396.getClass(), "kind", enum3060);
        setField(term1714504, term1714504.getClass(), "kind", enum3060);
        setField(term1714396, term1714396.getClass(), "typeOfThis", term1714504);
        setField(term1713852, term1713852.getClass(), "typeOfThis", term1714396);
        Class<? extends Object> term1716925 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1716924 = ((Class) term1716925).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1716924).setAccessible(true);
        Object enum3061 = ((Field) term1716924).get((Object) null);
        Class<? extends Object> term1717225 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1717224 = ((Class) term1717225).getDeclaredField((String) "INTERFACE");
        ((Field) term1717224).setAccessible(true);
        Object enum3062 = ((Field) term1717224).get((Object) null);
        term1714612 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1714796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1715054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1714612, term1714612.getClass(), "kind", enum3061);
        setField(term1714796, term1714796.getClass(), "kind", enum3060);
        setField(term1715054, term1715054.getClass(), "kind", enum3062);
        setField(term1714796, term1714796.getClass(), "typeOfThis", term1715054);
        setField(term1714612, term1714612.getClass(), "typeOfThis", term1714796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1714612;
        try {
            callMethod(klass, "isSubtype", argTypes, term1713852, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


