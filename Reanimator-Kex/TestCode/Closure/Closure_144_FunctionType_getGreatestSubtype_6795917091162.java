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

public class FunctionType_getGreatestSubtype_6795917091162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1549595;
     Object term1550257;

    public FunctionType_getGreatestSubtype_6795917091162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1552978 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1552977 = ((Class) term1552978).getDeclaredField((String) "INTERFACE");
        ((Field) term1552977).setAccessible(true);
        Object enum2768 = ((Field) term1552977).get((Object) null);
        term1549595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1550147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1549595, term1549595.getClass(), "kind", enum2768);
        setField(term1549595, term1549595.getClass(), "typeOfThis", term1550147);
        term1550257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1550579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1550257, term1550257.getClass(), "kind", enum2768);
        setField(term1550257, term1550257.getClass(), "typeOfThis", term1550579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1550257;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1549595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


