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

public class FunctionType_isSubtype_21010021581554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2061823;
     Object term2062373;

    public FunctionType_isSubtype_21010021581554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2065689 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2065688 = ((Class) term2065689).getDeclaredField((String) "ORDINARY");
        ((Field) term2065688).setAccessible(true);
        Object enum3845 = ((Field) term2065688).get((Object) null);
        term2061823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2062071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2062171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2062265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2061823, term2061823.getClass(), "kind", enum3845);
        setField(term2062071, term2062071.getClass(), "kind", enum3845);
        setField(term2062071, term2062071.getClass(), "typeOfThis", term2062171);
        setField(term2062071, term2062071.getClass(), "call", term2062265);
        setField(term2061823, term2061823.getClass(), "typeOfThis", term2062071);
        Class<? extends Object> term2065980 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2065979 = ((Class) term2065980).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2065979).setAccessible(true);
        Object enum3846 = ((Field) term2065979).get((Object) null);
        term2062373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2062555 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2062797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2062373, term2062373.getClass(), "kind", enum3845);
        setField(term2062555, term2062555.getClass(), "kind", enum3846);
        setField(term2062555, term2062555.getClass(), "typeOfThis", null);
        setField(term2062555, term2062555.getClass(), "call", term2062797);
        setField(term2062373, term2062373.getClass(), "typeOfThis", term2062555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2062373;
        try {
            callMethod(klass, "isSubtype", argTypes, term2061823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


