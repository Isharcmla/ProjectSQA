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

public class FunctionType_isSubtype_21010021581324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1674421;
     Object term1675073;

    public FunctionType_isSubtype_21010021581324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1677908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1677907 = ((Class) term1677908).getDeclaredField((String) "INTERFACE");
        ((Field) term1677907).setAccessible(true);
        Object enum3129 = ((Field) term1677907).get((Object) null);
        Class<? extends Object> term1678202 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1678201 = ((Class) term1678202).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1678201).setAccessible(true);
        Object enum3130 = ((Field) term1678201).get((Object) null);
        term1674421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1674965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1674421, term1674421.getClass(), "kind", enum3129);
        setField(term1674965, term1674965.getClass(), "kind", enum3130);
        setField(term1674421, term1674421.getClass(), "typeOfThis", term1674965);
        term1675073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1675255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1675073, term1675073.getClass(), "kind", enum3130);
        setField(term1675073, term1675073.getClass(), "typeOfThis", term1675255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1675073;
        try {
            callMethod(klass, "isSubtype", argTypes, term1674421, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


