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

public class FunctionType_isSubtype_21010021581275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1760032;
     Object term1760594;

    public FunctionType_isSubtype_21010021581275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1762285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762284 = ((Class) term1762285).getDeclaredField((String) "ORDINARY");
        ((Field) term1762284).setAccessible(true);
        Object enum3134 = ((Field) term1762284).get((Object) null);
        term1760032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1760280 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1760390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1760486 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1760032, term1760032.getClass(), "kind", enum3134);
        setField(term1760280, term1760280.getClass(), "kind", enum3134);
        setField(term1760390, term1760390.getClass(), "kind", enum3134);
        setField(term1760390, term1760390.getClass(), "typeOfThis", term1760486);
        setField(term1760280, term1760280.getClass(), "typeOfThis", term1760390);
        setField(term1760032, term1760032.getClass(), "typeOfThis", term1760280);
        Class<? extends Object> term1762576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1762575 = ((Class) term1762576).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1762575).setAccessible(true);
        Object enum3135 = ((Field) term1762575).get((Object) null);
        term1760594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1760850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1761024 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1760594, term1760594.getClass(), "kind", enum3135);
        setField(term1760850, term1760850.getClass(), "kind", enum3134);
        setField(term1761024, term1761024.getClass(), "kind", enum3134);
        setField(term1761024, term1761024.getClass(), "typeOfThis", null);
        setField(term1760850, term1760850.getClass(), "typeOfThis", term1761024);
        setField(term1760594, term1760594.getClass(), "typeOfThis", term1760850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1760594;
        try {
            callMethod(klass, "isSubtype", argTypes, term1760032, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


