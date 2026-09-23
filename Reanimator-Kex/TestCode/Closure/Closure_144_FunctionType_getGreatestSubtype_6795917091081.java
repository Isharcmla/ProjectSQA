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

public class FunctionType_getGreatestSubtype_6795917091081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1409297;
     Object term1410069;

    public FunctionType_getGreatestSubtype_6795917091081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1413490 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1413489 = ((Class) term1413490).getDeclaredField((String) "ORDINARY");
        ((Field) term1413489).setAccessible(true);
        Object enum2533 = ((Field) term1413489).get((Object) null);
        Class<? extends Object> term1413781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1413780 = ((Class) term1413781).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1413780).setAccessible(true);
        Object enum2534 = ((Field) term1413780).get((Object) null);
        term1409297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1409851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1409959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1409297, term1409297.getClass(), "kind", enum2533);
        setField(term1409851, term1409851.getClass(), "kind", enum2533);
        setField(term1409959, term1409959.getClass(), "kind", enum2534);
        setField(term1409851, term1409851.getClass(), "typeOfThis", term1409959);
        setField(term1409297, term1409297.getClass(), "typeOfThis", term1409851);
        term1410069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1410243 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1410353 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1410069, term1410069.getClass(), "kind", enum2534);
        setField(term1410243, term1410243.getClass(), "kind", enum2534);
        setField(term1410243, term1410243.getClass(), "typeOfThis", term1410353);
        setField(term1410069, term1410069.getClass(), "typeOfThis", term1410243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1410069;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1409297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


