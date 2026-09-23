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

public class FunctionType_isSubtype_21010021581219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656765;
     Object term1657515;

    public FunctionType_isSubtype_21010021581219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1659010 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1659009 = ((Class) term1659010).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1659009).setAccessible(true);
        Object enum2963 = ((Field) term1659009).get((Object) null);
        term1656765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1657309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1657405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1656765, term1656765.getClass(), "kind", enum2963);
        setField(term1657309, term1657309.getClass(), "kind", enum2963);
        setField(term1657309, term1657309.getClass(), "typeOfThis", term1657405);
        setField(term1656765, term1656765.getClass(), "typeOfThis", term1657309);
        Class<? extends Object> term1659310 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1659309 = ((Class) term1659310).getDeclaredField((String) "INTERFACE");
        ((Field) term1659309).setAccessible(true);
        Object enum2964 = ((Field) term1659309).get((Object) null);
        term1657515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1657847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1657955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1657515, term1657515.getClass(), "kind", enum2963);
        setField(term1657847, term1657847.getClass(), "kind", enum2964);
        setField(term1657847, term1657847.getClass(), "typeOfThis", term1657955);
        setField(term1657515, term1657515.getClass(), "typeOfThis", term1657847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1657515;
        try {
            callMethod(klass, "isSubtype", argTypes, term1656765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


