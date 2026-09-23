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

public class FunctionType_isSubtype_21010021581543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2046409;
     Object term2047069;

    public FunctionType_isSubtype_21010021581543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2048179 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2048178 = ((Class) term2048179).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2048178).setAccessible(true);
        Object enum3814 = ((Field) term2048178).get((Object) null);
        Class<? extends Object> term2048479 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2048478 = ((Class) term2048479).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2048478).setAccessible(true);
        Object enum3815 = ((Field) term2048478).get((Object) null);
        term2046409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2047197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2046409, term2046409.getClass(), "kind", enum3814);
        setField(term2047197, term2047197.getClass(), "kind", enum3815);
        setField(term2046409, term2046409.getClass(), "typeOfThis", term2047197);
        term2047069 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2047069, term2047069.getClass(), "kind", enum3815);
        setField(term2047069, term2047069.getClass(), "typeOfThis", term2047197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2047069;
        try {
            callMethod(klass, "isSubtype", argTypes, term2046409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


