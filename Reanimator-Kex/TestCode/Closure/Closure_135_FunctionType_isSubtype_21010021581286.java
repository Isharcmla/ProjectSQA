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

public class FunctionType_isSubtype_21010021581286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1608367;
     Object term1608733;

    public FunctionType_isSubtype_21010021581286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1611959 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1611958 = ((Class) term1611959).getDeclaredField((String) "ORDINARY");
        ((Field) term1611958).setAccessible(true);
        Object enum2999 = ((Field) term1611958).get((Object) null);
        term1608367 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1608625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1608367, term1608367.getClass(), "kind", enum2999);
        setField(term1608625, term1608625.getClass(), "kind", enum2999);
        setField(term1608367, term1608367.getClass(), "typeOfThis", term1608625);
        Class<? extends Object> term1612250 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1612249 = ((Class) term1612250).getDeclaredField((String) "INTERFACE");
        ((Field) term1612249).setAccessible(true);
        Object enum3000 = ((Field) term1612249).get((Object) null);
        term1608733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1608915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1608733, term1608733.getClass(), "kind", enum2999);
        setField(term1608915, term1608915.getClass(), "kind", enum3000);
        setField(term1608733, term1608733.getClass(), "typeOfThis", term1608915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1608733;
        try {
            callMethod(klass, "isSubtype", argTypes, term1608367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


