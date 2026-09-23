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

public class FunctionType_isSubtype_2101002158777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761933;
     Object term762389;

    public FunctionType_isSubtype_2101002158777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term763979 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term763978 = ((Class) term763979).getDeclaredField((String) "ORDINARY");
        ((Field) term763978).setAccessible(true);
        Object enum1423 = ((Field) term763978).get((Object) null);
        term761933 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term762181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term762281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term761933, term761933.getClass(), "kind", enum1423);
        setField(term762181, term762181.getClass(), "kind", enum1423);
        setField(term762181, term762181.getClass(), "typeOfThis", term762281);
        setField(term761933, term761933.getClass(), "typeOfThis", term762181);
        Class<? extends Object> term764270 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term764269 = ((Class) term764270).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term764269).setAccessible(true);
        Object enum1424 = ((Field) term764269).get((Object) null);
        term762389 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term762571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term762389, term762389.getClass(), "kind", enum1423);
        setField(term762571, term762571.getClass(), "kind", enum1424);
        setField(term762571, term762571.getClass(), "typeOfThis", null);
        setField(term762389, term762389.getClass(), "typeOfThis", term762571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term762389;
        try {
            callMethod(klass, "isSubtype", argTypes, term761933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


