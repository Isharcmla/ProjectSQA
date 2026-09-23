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

public class FunctionType_isSubtype_2101002158313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174060;
     Object term174416;

    public FunctionType_isSubtype_2101002158313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175553 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term175552 = ((Class) term175553).getDeclaredField((String) "ORDINARY");
        ((Field) term175552).setAccessible(true);
        Object enum320 = ((Field) term175552).get((Object) null);
        term174060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term174308 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term174060, term174060.getClass(), "kind", enum320);
        setField(term174060, term174060.getClass(), "typeOfThis", term174308);
        Class<? extends Object> term175844 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term175843 = ((Class) term175844).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term175843).setAccessible(true);
        Object enum321 = ((Field) term175843).get((Object) null);
        term174416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term174416, term174416.getClass(), "kind", enum321);
        setField(term174416, term174416.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term174416;
        try {
            callMethod(klass, "isSubtype", argTypes, term174060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


