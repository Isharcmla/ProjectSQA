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

public class FunctionType_isSubtype_21010021581184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1432236;
     Object term1432976;

    public FunctionType_isSubtype_21010021581184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1435950 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1435949 = ((Class) term1435950).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1435949).setAccessible(true);
        Object enum2678 = ((Field) term1435949).get((Object) null);
        term1432236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1432780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1432868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1432236, term1432236.getClass(), "kind", enum2678);
        setField(term1432780, term1432780.getClass(), "kind", enum2678);
        setField(term1432780, term1432780.getClass(), "typeOfThis", term1432868);
        setField(term1432236, term1432236.getClass(), "typeOfThis", term1432780);
        term1432976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1433306 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1432976, term1432976.getClass(), "kind", enum2678);
        setField(term1433306, term1433306.getClass(), "kind", enum2678);
        setField(term1433306, term1433306.getClass(), "typeOfThis", null);
        setField(term1432976, term1432976.getClass(), "typeOfThis", term1433306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1432976;
        try {
            callMethod(klass, "isSubtype", argTypes, term1432236, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


