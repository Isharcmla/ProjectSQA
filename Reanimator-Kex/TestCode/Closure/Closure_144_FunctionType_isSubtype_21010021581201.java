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

public class FunctionType_isSubtype_21010021581201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1624880;
     Object term1625634;

    public FunctionType_isSubtype_21010021581201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1627001 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1627000 = ((Class) term1627001).getDeclaredField((String) "ORDINARY");
        ((Field) term1627000).setAccessible(true);
        Object enum2907 = ((Field) term1627000).get((Object) null);
        term1624880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1625424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1625524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1624880, term1624880.getClass(), "kind", enum2907);
        setField(term1625424, term1625424.getClass(), "kind", enum2907);
        setField(term1625424, term1625424.getClass(), "typeOfThis", term1625524);
        setField(term1624880, term1624880.getClass(), "typeOfThis", term1625424);
        Class<? extends Object> term1627292 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1627291 = ((Class) term1627292).getDeclaredField((String) "INTERFACE");
        ((Field) term1627291).setAccessible(true);
        Object enum2908 = ((Field) term1627291).get((Object) null);
        term1625634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1625966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1625634, term1625634.getClass(), "kind", enum2907);
        setField(term1625966, term1625966.getClass(), "kind", enum2908);
        setField(term1625966, term1625966.getClass(), "typeOfThis", null);
        setField(term1625634, term1625634.getClass(), "typeOfThis", term1625966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1625634;
        try {
            callMethod(klass, "isSubtype", argTypes, term1624880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


