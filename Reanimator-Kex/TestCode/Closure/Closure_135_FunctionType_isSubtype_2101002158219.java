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

public class FunctionType_isSubtype_2101002158219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103218;
     Object term103582;

    public FunctionType_isSubtype_2101002158219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term104717 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term104716 = ((Class) term104717).getDeclaredField((String) "ORDINARY");
        ((Field) term104716).setAccessible(true);
        Object enum211 = ((Field) term104716).get((Object) null);
        term103218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term103474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term103218, term103218.getClass(), "kind", enum211);
        setField(term103218, term103218.getClass(), "typeOfThis", term103474);
        Class<? extends Object> term105008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term105007 = ((Class) term105008).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term105007).setAccessible(true);
        Object enum212 = ((Field) term105007).get((Object) null);
        term103582 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term103582, term103582.getClass(), "kind", enum212);
        setField(term103582, term103582.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term103582;
        try {
            callMethod(klass, "isSubtype", argTypes, term103218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


