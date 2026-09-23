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

public class FunctionType_isSubtype_21010021581335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869856;
     Object term1870716;

    public FunctionType_isSubtype_21010021581335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1872463 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1872462 = ((Class) term1872463).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1872462).setAccessible(true);
        Object enum3322 = ((Field) term1872462).get((Object) null);
        term1869856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1870400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1870508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1870608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1869856, term1869856.getClass(), "kind", enum3322);
        setField(term1870400, term1870400.getClass(), "kind", enum3322);
        setField(term1870508, term1870508.getClass(), "kind", enum3322);
        setField(term1870508, term1870508.getClass(), "typeOfThis", term1870608);
        setField(term1870400, term1870400.getClass(), "typeOfThis", term1870508);
        setField(term1869856, term1869856.getClass(), "typeOfThis", term1870400);
        Class<? extends Object> term1872763 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1872762 = ((Class) term1872763).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1872762).setAccessible(true);
        Object enum3323 = ((Field) term1872762).get((Object) null);
        term1870716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1870900 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1871158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1870716, term1870716.getClass(), "kind", enum3323);
        setField(term1870900, term1870900.getClass(), "kind", enum3322);
        setField(term1871158, term1871158.getClass(), "kind", enum3323);
        setField(term1871158, term1871158.getClass(), "typeOfThis", null);
        setField(term1870900, term1870900.getClass(), "typeOfThis", term1871158);
        setField(term1870716, term1870716.getClass(), "typeOfThis", term1870900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1870716;
        try {
            callMethod(klass, "isSubtype", argTypes, term1869856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


