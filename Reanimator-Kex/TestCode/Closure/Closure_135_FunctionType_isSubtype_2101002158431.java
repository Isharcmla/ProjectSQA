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

public class FunctionType_isSubtype_2101002158431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286837;
     Object term287193;

    public FunctionType_isSubtype_2101002158431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term288377 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term288376 = ((Class) term288377).getDeclaredField((String) "ORDINARY");
        ((Field) term288376).setAccessible(true);
        Object enum527 = ((Field) term288376).get((Object) null);
        term286837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term287085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term286837, term286837.getClass(), "kind", enum527);
        setField(term286837, term286837.getClass(), "typeOfThis", term287085);
        Class<? extends Object> term288668 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term288667 = ((Class) term288668).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term288667).setAccessible(true);
        Object enum528 = ((Field) term288667).get((Object) null);
        term287193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term287449 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term287193, term287193.getClass(), "kind", enum528);
        setField(term287193, term287193.getClass(), "typeOfThis", term287449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term287193;
        try {
            callMethod(klass, "isSubtype", argTypes, term286837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


