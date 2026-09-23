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

public class FunctionType_getGreatestSubtype_679591709851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003622;
     Object term1004204;

    public FunctionType_getGreatestSubtype_679591709851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1005514 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1005513 = ((Class) term1005514).getDeclaredField((String) "ORDINARY");
        ((Field) term1005513).setAccessible(true);
        Object enum1815 = ((Field) term1005513).get((Object) null);
        term1003622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1003880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1003990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1004094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1003622, term1003622.getClass(), "kind", enum1815);
        setField(term1003880, term1003880.getClass(), "kind", enum1815);
        setField(term1003880, term1003880.getClass(), "typeOfThis", term1003990);
        setField(term1003622, term1003622.getClass(), "typeOfThis", term1003880);
        setField(term1003622, term1003622.getClass(), "registry", term1004094);
        Class<? extends Object> term1005805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1005804 = ((Class) term1005805).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1005804).setAccessible(true);
        Object enum1816 = ((Field) term1005804).get((Object) null);
        term1004204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1004460 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1004204, term1004204.getClass(), "kind", enum1816);
        setField(term1004460, term1004460.getClass(), "kind", enum1816);
        setField(term1004460, term1004460.getClass(), "typeOfThis", null);
        setField(term1004204, term1004204.getClass(), "typeOfThis", term1004460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1004204;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1003622, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


