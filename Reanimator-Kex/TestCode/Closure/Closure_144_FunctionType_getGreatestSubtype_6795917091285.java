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

public class FunctionType_getGreatestSubtype_6795917091285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1777365;
     Object term1778029;

    public FunctionType_getGreatestSubtype_6795917091285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1779241 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1779240 = ((Class) term1779241).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1779240).setAccessible(true);
        Object enum3163 = ((Field) term1779240).get((Object) null);
        Class<? extends Object> term1779541 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1779540 = ((Class) term1779541).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1779540).setAccessible(true);
        Object enum3164 = ((Field) term1779540).get((Object) null);
        term1777365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1777919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1777365, term1777365.getClass(), "kind", enum3163);
        setField(term1777919, term1777919.getClass(), "kind", enum3164);
        setField(term1777365, term1777365.getClass(), "typeOfThis", term1777919);
        term1778029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1778211 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1778029, term1778029.getClass(), "kind", enum3164);
        setField(term1778211, term1778211.getClass(), "kind", enum3164);
        setField(term1778029, term1778029.getClass(), "typeOfThis", term1778211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1778029;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1777365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


