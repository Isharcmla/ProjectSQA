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

public class FunctionType_isSubtype_2101002158817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term824898;
     Object term825562;

    public FunctionType_isSubtype_2101002158817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term826462 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term826461 = ((Class) term826462).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term826461).setAccessible(true);
        Object enum1541 = ((Field) term826461).get((Object) null);
        term824898 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term825454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term824898, term824898.getClass(), "kind", enum1541);
        setField(term824898, term824898.getClass(), "typeOfThis", term825454);
        term825562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term825562, term825562.getClass(), "kind", enum1541);
        setField(term825562, term825562.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term825562;
        try {
            callMethod(klass, "isSubtype", argTypes, term824898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


