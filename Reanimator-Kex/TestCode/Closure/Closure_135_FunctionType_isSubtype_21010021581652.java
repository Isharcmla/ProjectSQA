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

public class FunctionType_isSubtype_21010021581652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229416;
     Object term2230166;

    public FunctionType_isSubtype_21010021581652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2231492 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2231491 = ((Class) term2231492).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2231491).setAccessible(true);
        Object enum4159 = ((Field) term2231491).get((Object) null);
        term2229416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2229960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2230058 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setField(term2229416, term2229416.getClass(), "kind", enum4159);
        setField(term2229960, term2229960.getClass(), "kind", enum4159);
        setField(term2229960, term2229960.getClass(), "typeOfThis", term2230058);
        setField(term2229416, term2229416.getClass(), "typeOfThis", term2229960);
        Class<? extends Object> term2231792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2231791 = ((Class) term2231792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2231791).setAccessible(true);
        Object enum4160 = ((Field) term2231791).get((Object) null);
        term2230166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2230496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2230166, term2230166.getClass(), "kind", enum4159);
        setField(term2230496, term2230496.getClass(), "kind", enum4160);
        setField(term2230496, term2230496.getClass(), "typeOfThis", null);
        setField(term2230166, term2230166.getClass(), "typeOfThis", term2230496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2230166;
        try {
            callMethod(klass, "isSubtype", argTypes, term2229416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


