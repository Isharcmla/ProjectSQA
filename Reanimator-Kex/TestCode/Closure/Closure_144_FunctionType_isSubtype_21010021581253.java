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

public class FunctionType_isSubtype_21010021581253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1721367;
     Object term1721873;

    public FunctionType_isSubtype_21010021581253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1723362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1723361 = ((Class) term1723362).getDeclaredField((String) "ORDINARY");
        ((Field) term1723361).setAccessible(true);
        Object enum3072 = ((Field) term1723361).get((Object) null);
        Class<? extends Object> term1723653 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1723652 = ((Class) term1723653).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1723652).setAccessible(true);
        Object enum3073 = ((Field) term1723652).get((Object) null);
        term1721367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1721615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1721367, term1721367.getClass(), "kind", enum3072);
        setField(term1721615, term1721615.getClass(), "kind", enum3073);
        setField(term1721615, term1721615.getClass(), "typeOfThis", null);
        setField(term1721367, term1721367.getClass(), "typeOfThis", term1721615);
        term1721873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1722057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1722169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1721873, term1721873.getClass(), "kind", enum3072);
        setField(term1722057, term1722057.getClass(), "kind", enum3072);
        setField(term1722057, term1722057.getClass(), "typeOfThis", term1722169);
        setField(term1721873, term1721873.getClass(), "typeOfThis", term1722057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1721873;
        try {
            callMethod(klass, "isSubtype", argTypes, term1721367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


