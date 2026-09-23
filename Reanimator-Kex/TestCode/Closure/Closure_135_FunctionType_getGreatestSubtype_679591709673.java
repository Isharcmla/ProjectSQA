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

public class FunctionType_getGreatestSubtype_679591709673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604599;
     Object term604963;

    public FunctionType_getGreatestSubtype_679591709673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term606171 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term606170 = ((Class) term606171).getDeclaredField((String) "ORDINARY");
        ((Field) term606170).setAccessible(true);
        Object enum1122 = ((Field) term606170).get((Object) null);
        term604599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term604855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term604599, term604599.getClass(), "kind", enum1122);
        setField(term604599, term604599.getClass(), "typeOfThis", term604855);
        Class<? extends Object> term606462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term606461 = ((Class) term606462).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term606461).setAccessible(true);
        Object enum1123 = ((Field) term606461).get((Object) null);
        term604963 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term605211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term604963, term604963.getClass(), "kind", enum1123);
        setField(term604963, term604963.getClass(), "typeOfThis", term605211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term604963;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term604599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


