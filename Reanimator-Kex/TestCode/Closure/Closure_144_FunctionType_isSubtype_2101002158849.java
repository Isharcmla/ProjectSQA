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

public class FunctionType_isSubtype_2101002158849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998829;
     Object term999491;

    public FunctionType_isSubtype_2101002158849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1000657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1000656 = ((Class) term1000657).getDeclaredField((String) "INTERFACE");
        ((Field) term1000656).setAccessible(true);
        Object enum1809 = ((Field) term1000656).get((Object) null);
        term998829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term999381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term998829, term998829.getClass(), "kind", enum1809);
        setField(term998829, term998829.getClass(), "typeOfThis", term999381);
        Class<? extends Object> term1000951 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1000950 = ((Class) term1000951).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1000950).setAccessible(true);
        Object enum1810 = ((Field) term1000950).get((Object) null);
        term999491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term999665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term999491, term999491.getClass(), "kind", enum1810);
        setField(term999491, term999491.getClass(), "typeOfThis", term999665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term999491;
        try {
            callMethod(klass, "isSubtype", argTypes, term998829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


