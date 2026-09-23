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

public class FunctionType_isSubtype_21010021581449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078005;
     Object term2078667;

    public FunctionType_isSubtype_21010021581449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2080881 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2080880 = ((Class) term2080881).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2080880).setAccessible(true);
        Object enum3702 = ((Field) term2080880).get((Object) null);
        term2078005 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2078559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2078005, term2078005.getClass(), "kind", enum3702);
        setField(term2078559, term2078559.getClass(), "kind", enum3702);
        setField(term2078005, term2078005.getClass(), "typeOfThis", term2078559);
        term2078667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2078997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2078667, term2078667.getClass(), "kind", enum3702);
        setField(term2078997, term2078997.getClass(), "kind", enum3702);
        setField(term2078667, term2078667.getClass(), "typeOfThis", term2078997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2078667;
        try {
            callMethod(klass, "isSubtype", argTypes, term2078005, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


