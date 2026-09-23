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

public class FunctionType_isSubtype_21010021581271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1581316;
     Object term1582076;

    public FunctionType_isSubtype_21010021581271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1585625 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1585624 = ((Class) term1585625).getDeclaredField((String) "ORDINARY");
        ((Field) term1585624).setAccessible(true);
        Object enum2954 = ((Field) term1585624).get((Object) null);
        term1581316 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1581860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1581968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1581316, term1581316.getClass(), "kind", enum2954);
        setField(term1581860, term1581860.getClass(), "kind", enum2954);
        setField(term1581968, term1581968.getClass(), "kind", enum2954);
        setField(term1581860, term1581860.getClass(), "typeOfThis", term1581968);
        setField(term1581316, term1581316.getClass(), "typeOfThis", term1581860);
        Class<? extends Object> term1585916 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1585915 = ((Class) term1585916).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1585915).setAccessible(true);
        Object enum2955 = ((Field) term1585915).get((Object) null);
        Class<? extends Object> term1586216 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1586215 = ((Class) term1586216).getDeclaredField((String) "INTERFACE");
        ((Field) term1586215).setAccessible(true);
        Object enum2956 = ((Field) term1586215).get((Object) null);
        term1582076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1582258 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1582514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1582076, term1582076.getClass(), "kind", enum2955);
        setField(term1582258, term1582258.getClass(), "kind", enum2954);
        setField(term1582514, term1582514.getClass(), "kind", enum2956);
        setField(term1582258, term1582258.getClass(), "typeOfThis", term1582514);
        setField(term1582076, term1582076.getClass(), "typeOfThis", term1582258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1582076;
        try {
            callMethod(klass, "isSubtype", argTypes, term1581316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


