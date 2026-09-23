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
     Object term1391859;
     Object term1392599;

    public FunctionType_isSubtype_21010021581069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1394485 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1394484 = ((Class) term1394485).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1394484).setAccessible(true);
        Object enum2499 = ((Field) term1394484).get((Object) null);
        term1391859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1392403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1392491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1391859, term1391859.getClass(), "kind", enum2499);
        setField(term1392403, term1392403.getClass(), "kind", enum2499);
        setField(term1392403, term1392403.getClass(), "typeOfThis", term1392491);
        setField(term1392403, term1392403.getClass(), "call", null);
        setField(term1391859, term1391859.getClass(), "typeOfThis", term1392403);
        Class<? extends Object> term1394785 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1394784 = ((Class) term1394785).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1394784).setAccessible(true);
        Object enum2500 = ((Field) term1394784).get((Object) null);
        term1392599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1392929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1393023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1392599, term1392599.getClass(), "kind", enum2499);
        setField(term1392929, term1392929.getClass(), "kind", enum2500);
        setField(term1392929, term1392929.getClass(), "typeOfThis", null);
        setField(term1392929, term1392929.getClass(), "call", term1393023);
        setField(term1392599, term1392599.getClass(), "typeOfThis", term1392929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1392599;
        try {
            callMethod(klass, "isSubtype", argTypes, term1391859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


