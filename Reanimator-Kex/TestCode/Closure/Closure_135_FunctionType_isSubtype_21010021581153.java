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

public class FunctionType_isSubtype_21010021581153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377436;
     Object term1378090;

    public FunctionType_isSubtype_21010021581153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1379763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1379762 = ((Class) term1379763).getDeclaredField((String) "ORDINARY");
        ((Field) term1379762).setAccessible(true);
        Object enum2578 = ((Field) term1379762).get((Object) null);
        term1377436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1377980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1377436, term1377436.getClass(), "kind", enum2578);
        setField(term1377980, term1377980.getClass(), "kind", enum2578);
        setField(term1377436, term1377436.getClass(), "typeOfThis", term1377980);
        Class<? extends Object> term1380054 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1380053 = ((Class) term1380054).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1380053).setAccessible(true);
        Object enum2579 = ((Field) term1380053).get((Object) null);
        Class<? extends Object> term1380354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1380353 = ((Class) term1380354).getDeclaredField((String) "INTERFACE");
        ((Field) term1380353).setAccessible(true);
        Object enum2580 = ((Field) term1380353).get((Object) null);
        term1378090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1378272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1378090, term1378090.getClass(), "kind", enum2579);
        setField(term1378272, term1378272.getClass(), "kind", enum2580);
        setField(term1378090, term1378090.getClass(), "typeOfThis", term1378272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1378090;
        try {
            callMethod(klass, "isSubtype", argTypes, term1377436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


