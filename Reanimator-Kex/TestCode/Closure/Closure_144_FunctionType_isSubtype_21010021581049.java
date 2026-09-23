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

public class FunctionType_isSubtype_21010021581049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1353999;
     Object term1354659;

    public FunctionType_isSubtype_21010021581049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1356604 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1356603 = ((Class) term1356604).getDeclaredField((String) "INTERFACE");
        ((Field) term1356603).setAccessible(true);
        Object enum2429 = ((Field) term1356603).get((Object) null);
        term1353999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1354551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1353999, term1353999.getClass(), "kind", enum2429);
        setField(term1353999, term1353999.getClass(), "typeOfThis", term1354551);
        term1354659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1354991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1354659, term1354659.getClass(), "kind", enum2429);
        setField(term1354659, term1354659.getClass(), "typeOfThis", term1354991);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1354659;
        try {
            callMethod(klass, "isSubtype", argTypes, term1353999, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


