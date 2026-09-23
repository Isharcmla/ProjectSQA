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

public class FunctionType_isSubtype_21010021581348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1891752;
     Object term1892504;

    public FunctionType_isSubtype_21010021581348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1895483 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1895482 = ((Class) term1895483).getDeclaredField((String) "INTERFACE");
        ((Field) term1895482).setAccessible(true);
        Object enum3361 = ((Field) term1895482).get((Object) null);
        term1891752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1892296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1892396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1891752, term1891752.getClass(), "kind", enum3361);
        setField(term1892296, term1892296.getClass(), "kind", enum3361);
        setField(term1892296, term1892296.getClass(), "typeOfThis", term1892396);
        setField(term1891752, term1891752.getClass(), "typeOfThis", term1892296);
        Class<? extends Object> term1895777 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1895776 = ((Class) term1895777).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1895776).setAccessible(true);
        Object enum3362 = ((Field) term1895776).get((Object) null);
        term1892504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1892834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1892504, term1892504.getClass(), "kind", enum3361);
        setField(term1892834, term1892834.getClass(), "kind", enum3362);
        setField(term1892834, term1892834.getClass(), "typeOfThis", null);
        setField(term1892504, term1892504.getClass(), "typeOfThis", term1892834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1892504;
        try {
            callMethod(klass, "isSubtype", argTypes, term1891752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


