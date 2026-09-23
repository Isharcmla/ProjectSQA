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

public class FunctionType_isSubtype_21010021581561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2075393;
     Object term2076155;

    public FunctionType_isSubtype_21010021581561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2077175 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2077174 = ((Class) term2077175).getDeclaredField((String) "INTERFACE");
        ((Field) term2077174).setAccessible(true);
        Object enum3865 = ((Field) term2077174).get((Object) null);
        term2075393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2075937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2076047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2075393, term2075393.getClass(), "kind", enum3865);
        setField(term2075937, term2075937.getClass(), "kind", enum3865);
        setField(term2075937, term2075937.getClass(), "typeOfThis", term2076047);
        setField(term2075393, term2075393.getClass(), "typeOfThis", term2075937);
        term2076155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2076485 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2076155, term2076155.getClass(), "kind", enum3865);
        setField(term2076485, term2076485.getClass(), "kind", enum3865);
        setField(term2076485, term2076485.getClass(), "typeOfThis", null);
        setField(term2076155, term2076155.getClass(), "typeOfThis", term2076485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2076155;
        try {
            callMethod(klass, "isSubtype", argTypes, term2075393, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


