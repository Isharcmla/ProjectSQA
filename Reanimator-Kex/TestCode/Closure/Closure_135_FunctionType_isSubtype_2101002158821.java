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

public class FunctionType_isSubtype_2101002158821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829566;
     Object term830226;

    public FunctionType_isSubtype_2101002158821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term831567 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term831566 = ((Class) term831567).getDeclaredField((String) "INTERFACE");
        ((Field) term831566).setAccessible(true);
        Object enum1549 = ((Field) term831566).get((Object) null);
        Class<? extends Object> term831861 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term831860 = ((Class) term831861).getDeclaredField((String) "INTERFACE");
        ((Field) term831860).setAccessible(true);
        Object enum1550 = ((Field) term831860).get((Object) null);
        term829566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term830118 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term829566, term829566.getClass(), "kind", enum1549);
        setField(term830118, term830118.getClass(), "kind", enum1550);
        setField(term829566, term829566.getClass(), "typeOfThis", term830118);
        term830226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term830556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term830226, term830226.getClass(), "kind", enum1549);
        setField(term830556, term830556.getClass(), "kind", enum1550);
        setField(term830226, term830226.getClass(), "typeOfThis", term830556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term830226;
        try {
            callMethod(klass, "isSubtype", argTypes, term829566, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


