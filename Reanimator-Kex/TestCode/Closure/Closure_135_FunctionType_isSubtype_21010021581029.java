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

public class FunctionType_isSubtype_21010021581029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169621;
     Object term1170283;

    public FunctionType_isSubtype_21010021581029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1171603 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1171602 = ((Class) term1171603).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1171602).setAccessible(true);
        Object enum2181 = ((Field) term1171602).get((Object) null);
        Class<? extends Object> term1171903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1171902 = ((Class) term1171903).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1171902).setAccessible(true);
        Object enum2182 = ((Field) term1171902).get((Object) null);
        term1169621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1170175 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1169621, term1169621.getClass(), "kind", enum2181);
        setField(term1170175, term1170175.getClass(), "kind", enum2182);
        setField(term1169621, term1169621.getClass(), "typeOfThis", term1170175);
        term1170283 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1170613 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1170283, term1170283.getClass(), "kind", enum2181);
        setField(term1170613, term1170613.getClass(), "kind", enum2182);
        setField(term1170283, term1170283.getClass(), "typeOfThis", term1170613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1170283;
        try {
            callMethod(klass, "isSubtype", argTypes, term1169621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


