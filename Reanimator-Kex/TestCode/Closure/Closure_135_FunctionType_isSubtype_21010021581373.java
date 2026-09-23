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

public class FunctionType_isSubtype_21010021581373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1756594;
     Object term1757346;

    public FunctionType_isSubtype_21010021581373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1758790 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1758789 = ((Class) term1758790).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1758789).setAccessible(true);
        Object enum3277 = ((Field) term1758789).get((Object) null);
        term1756594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1757138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1757238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1756594, term1756594.getClass(), "kind", enum3277);
        setField(term1757138, term1757138.getClass(), "kind", enum3277);
        setField(term1757138, term1757138.getClass(), "typeOfThis", term1757238);
        setField(term1756594, term1756594.getClass(), "typeOfThis", term1757138);
        Class<? extends Object> term1759090 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1759089 = ((Class) term1759090).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1759089).setAccessible(true);
        Object enum3278 = ((Field) term1759089).get((Object) null);
        term1757346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1757528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1757784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1757346, term1757346.getClass(), "kind", enum3278);
        setField(term1757528, term1757528.getClass(), "kind", enum3277);
        setField(term1757528, term1757528.getClass(), "typeOfThis", term1757784);
        setField(term1757346, term1757346.getClass(), "typeOfThis", term1757528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1757346;
        try {
            callMethod(klass, "isSubtype", argTypes, term1756594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


