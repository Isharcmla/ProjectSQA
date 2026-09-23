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

public class FunctionType_getGreatestSubtype_6795917091387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963573;
     Object term1964237;

    public FunctionType_getGreatestSubtype_6795917091387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1965397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1965396 = ((Class) term1965397).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1965396).setAccessible(true);
        Object enum3483 = ((Field) term1965396).get((Object) null);
        Class<? extends Object> term1965697 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1965696 = ((Class) term1965697).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1965696).setAccessible(true);
        Object enum3484 = ((Field) term1965696).get((Object) null);
        term1963573 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1964127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1963573, term1963573.getClass(), "kind", enum3483);
        setField(term1964127, term1964127.getClass(), "kind", enum3484);
        setField(term1963573, term1963573.getClass(), "typeOfThis", term1964127);
        term1964237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1964419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1964237, term1964237.getClass(), "kind", enum3484);
        setField(term1964237, term1964237.getClass(), "typeOfThis", term1964419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1964237;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1963573, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


