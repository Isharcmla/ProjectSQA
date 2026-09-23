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

public class FunctionType_isSubtype_2101002158997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1119562;
     Object term1120222;

    public FunctionType_isSubtype_2101002158997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1121536 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1121535 = ((Class) term1121536).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1121535).setAccessible(true);
        Object enum2084 = ((Field) term1121535).get((Object) null);
        term1119562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1120114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1119562, term1119562.getClass(), "kind", enum2084);
        setField(term1120114, term1120114.getClass(), "kind", enum2084);
        setField(term1119562, term1119562.getClass(), "typeOfThis", term1120114);
        Class<? extends Object> term1121836 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1121835 = ((Class) term1121836).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1121835).setAccessible(true);
        Object enum2085 = ((Field) term1121835).get((Object) null);
        term1120222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1120552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1120222, term1120222.getClass(), "kind", enum2084);
        setField(term1120552, term1120552.getClass(), "kind", enum2085);
        setField(term1120222, term1120222.getClass(), "typeOfThis", term1120552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1120222;
        try {
            callMethod(klass, "isSubtype", argTypes, term1119562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


