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

public class FunctionType_getGreatestSubtype_6795917091075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242888;
     Object term1243548;

    public FunctionType_getGreatestSubtype_6795917091075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1245651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1245650 = ((Class) term1245651).getDeclaredField((String) "INTERFACE");
        ((Field) term1245650).setAccessible(true);
        Object enum2321 = ((Field) term1245650).get((Object) null);
        Class<? extends Object> term1245945 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1245944 = ((Class) term1245945).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1245944).setAccessible(true);
        Object enum2322 = ((Field) term1245944).get((Object) null);
        term1242888 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1243440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1242888, term1242888.getClass(), "kind", enum2321);
        setField(term1243440, term1243440.getClass(), "kind", enum2322);
        setField(term1242888, term1242888.getClass(), "typeOfThis", term1243440);
        term1243548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1243732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1243548, term1243548.getClass(), "kind", enum2322);
        setField(term1243548, term1243548.getClass(), "typeOfThis", term1243732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1243548;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1242888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


