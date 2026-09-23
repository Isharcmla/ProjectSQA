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

public class FunctionType_getGreatestSubtype_6795917091060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373478;
     Object term1374142;

    public FunctionType_getGreatestSubtype_6795917091060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1377807 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1377806 = ((Class) term1377807).getDeclaredField((String) "ORDINARY");
        ((Field) term1377806).setAccessible(true);
        Object enum2468 = ((Field) term1377806).get((Object) null);
        term1373478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1374032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1373478, term1373478.getClass(), "kind", enum2468);
        setField(term1374032, term1374032.getClass(), "kind", enum2468);
        setField(term1373478, term1373478.getClass(), "typeOfThis", term1374032);
        Class<? extends Object> term1378098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1378097 = ((Class) term1378098).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1378097).setAccessible(true);
        Object enum2469 = ((Field) term1378097).get((Object) null);
        Class<? extends Object> term1378398 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1378397 = ((Class) term1378398).getDeclaredField((String) "INTERFACE");
        ((Field) term1378397).setAccessible(true);
        Object enum2470 = ((Field) term1378397).get((Object) null);
        term1374142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1374324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1374142, term1374142.getClass(), "kind", enum2469);
        setField(term1374324, term1374324.getClass(), "kind", enum2470);
        setField(term1374142, term1374142.getClass(), "typeOfThis", term1374324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1374142;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1373478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


