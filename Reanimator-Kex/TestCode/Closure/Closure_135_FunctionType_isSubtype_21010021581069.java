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

public class FunctionType_isSubtype_21010021581069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1235218;
     Object term1235878;

    public FunctionType_isSubtype_21010021581069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1237228 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1237227 = ((Class) term1237228).getDeclaredField((String) "INTERFACE");
        ((Field) term1237227).setAccessible(true);
        Object enum2304 = ((Field) term1237227).get((Object) null);
        term1235218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1235770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1235218, term1235218.getClass(), "kind", enum2304);
        setField(term1235770, term1235770.getClass(), "kind", enum2304);
        setField(term1235218, term1235218.getClass(), "typeOfThis", term1235770);
        Class<? extends Object> term1237522 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1237521 = ((Class) term1237522).getDeclaredField((String) "INTERFACE");
        ((Field) term1237521).setAccessible(true);
        Object enum2305 = ((Field) term1237521).get((Object) null);
        term1235878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1236208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1235878, term1235878.getClass(), "kind", enum2304);
        setField(term1236208, term1236208.getClass(), "kind", enum2305);
        setField(term1235878, term1235878.getClass(), "typeOfThis", term1236208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1235878;
        try {
            callMethod(klass, "isSubtype", argTypes, term1235218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


