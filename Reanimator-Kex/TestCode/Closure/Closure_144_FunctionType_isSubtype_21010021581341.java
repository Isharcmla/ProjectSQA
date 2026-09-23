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

public class FunctionType_isSubtype_21010021581341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1881228;
     Object term1881878;

    public FunctionType_isSubtype_21010021581341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1883347 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1883346 = ((Class) term1883347).getDeclaredField((String) "ORDINARY");
        ((Field) term1883346).setAccessible(true);
        Object enum3341 = ((Field) term1883346).get((Object) null);
        term1881228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1881768 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1881228, term1881228.getClass(), "kind", enum3341);
        setField(term1881228, term1881228.getClass(), "typeOfThis", term1881768);
        Class<? extends Object> term1883638 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1883637 = ((Class) term1883638).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1883637).setAccessible(true);
        Object enum3342 = ((Field) term1883637).get((Object) null);
        term1881878 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1882210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1881878, term1881878.getClass(), "kind", enum3341);
        setField(term1882210, term1882210.getClass(), "kind", enum3342);
        setField(term1882210, term1882210.getClass(), "typeOfThis", null);
        setField(term1881878, term1881878.getClass(), "typeOfThis", term1882210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1881878;
        try {
            callMethod(klass, "isSubtype", argTypes, term1881228, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


