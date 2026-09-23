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

public class FunctionType_isSubtype_21010021581573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2303665;
     Object term2304317;

    public FunctionType_isSubtype_21010021581573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2305874 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2305873 = ((Class) term2305874).getDeclaredField((String) "INTERFACE");
        ((Field) term2305873).setAccessible(true);
        Object enum4113 = ((Field) term2305873).get((Object) null);
        Class<? extends Object> term2306168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2306167 = ((Class) term2306168).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2306167).setAccessible(true);
        Object enum4114 = ((Field) term2306167).get((Object) null);
        term2303665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2304209 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2303665, term2303665.getClass(), "kind", enum4113);
        setField(term2304209, term2304209.getClass(), "kind", enum4114);
        setField(term2303665, term2303665.getClass(), "typeOfThis", term2304209);
        Class<? extends Object> term2306468 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2306467 = ((Class) term2306468).getDeclaredField((String) "INTERFACE");
        ((Field) term2306467).setAccessible(true);
        Object enum4115 = ((Field) term2306467).get((Object) null);
        term2304317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2304647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2304317, term2304317.getClass(), "kind", enum4113);
        setField(term2304647, term2304647.getClass(), "kind", enum4115);
        setField(term2304317, term2304317.getClass(), "typeOfThis", term2304647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2304317;
        try {
            callMethod(klass, "isSubtype", argTypes, term2303665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


