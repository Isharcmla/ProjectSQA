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

public class FunctionType_getGreatestSubtype_6795917091514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2200457;
     Object term2201121;

    public FunctionType_getGreatestSubtype_6795917091514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2204279 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204278 = ((Class) term2204279).getDeclaredField((String) "INTERFACE");
        ((Field) term2204278).setAccessible(true);
        Object enum3929 = ((Field) term2204278).get((Object) null);
        Class<? extends Object> term2204573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204572 = ((Class) term2204573).getDeclaredField((String) "INTERFACE");
        ((Field) term2204572).setAccessible(true);
        Object enum3930 = ((Field) term2204572).get((Object) null);
        term2200457 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2201011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2200457, term2200457.getClass(), "kind", enum3929);
        setField(term2201011, term2201011.getClass(), "kind", enum3930);
        setField(term2200457, term2200457.getClass(), "typeOfThis", term2201011);
        Class<? extends Object> term2204867 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2204866 = ((Class) term2204867).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2204866).setAccessible(true);
        Object enum3931 = ((Field) term2204866).get((Object) null);
        term2201121 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2201305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2201121, term2201121.getClass(), "kind", enum3931);
        setField(term2201121, term2201121.getClass(), "typeOfThis", term2201305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2201121;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2200457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


