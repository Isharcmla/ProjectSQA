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

public class FunctionType_isSubtype_21010021581236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525718;
     Object term1526488;

    public FunctionType_isSubtype_21010021581236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1529267 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1529266 = ((Class) term1529267).getDeclaredField((String) "ORDINARY");
        ((Field) term1529266).setAccessible(true);
        Object enum2852 = ((Field) term1529266).get((Object) null);
        term1525718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1526270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1526380 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1525718, term1525718.getClass(), "kind", enum2852);
        setField(term1526270, term1526270.getClass(), "kind", enum2852);
        setField(term1526270, term1526270.getClass(), "typeOfThis", term1526380);
        setField(term1525718, term1525718.getClass(), "typeOfThis", term1526270);
        term1526488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1526818 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1526488, term1526488.getClass(), "kind", enum2852);
        setField(term1526818, term1526818.getClass(), "kind", enum2852);
        setField(term1526818, term1526818.getClass(), "typeOfThis", null);
        setField(term1526488, term1526488.getClass(), "typeOfThis", term1526818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1526488;
        try {
            callMethod(klass, "isSubtype", argTypes, term1525718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


