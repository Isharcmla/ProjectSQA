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

public class FunctionType_isSubtype_21010021581131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1499181;
     Object term1499637;

    public FunctionType_isSubtype_21010021581131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1500651 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1500650 = ((Class) term1500651).getDeclaredField((String) "ORDINARY");
        ((Field) term1500650).setAccessible(true);
        Object enum2678 = ((Field) term1500650).get((Object) null);
        term1499181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1499429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1499529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1499181, term1499181.getClass(), "kind", enum2678);
        setField(term1499429, term1499429.getClass(), "kind", enum2678);
        setField(term1499429, term1499429.getClass(), "typeOfThis", term1499529);
        setField(term1499181, term1499181.getClass(), "typeOfThis", term1499429);
        term1499637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1499821 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1499637, term1499637.getClass(), "kind", enum2678);
        setField(term1499821, term1499821.getClass(), "kind", enum2678);
        setField(term1499821, term1499821.getClass(), "typeOfThis", null);
        setField(term1499637, term1499637.getClass(), "typeOfThis", term1499821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1499637;
        try {
            callMethod(klass, "isSubtype", argTypes, term1499181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


