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

public class FunctionType_isSubtype_21010021581203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1628776;
     Object term1629528;

    public FunctionType_isSubtype_21010021581203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1631216 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1631215 = ((Class) term1631216).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1631215).setAccessible(true);
        Object enum2914 = ((Field) term1631215).get((Object) null);
        Class<? extends Object> term1631516 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1631515 = ((Class) term1631516).getDeclaredField((String) "INTERFACE");
        ((Field) term1631515).setAccessible(true);
        Object enum2915 = ((Field) term1631515).get((Object) null);
        term1628776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1629320 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1629420 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1628776, term1628776.getClass(), "kind", enum2914);
        setField(term1629320, term1629320.getClass(), "kind", enum2915);
        setField(term1629320, term1629320.getClass(), "typeOfThis", term1629420);
        setField(term1628776, term1628776.getClass(), "typeOfThis", term1629320);
        term1629528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1629858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1629970 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term1629528, term1629528.getClass(), "kind", enum2914);
        setField(term1629858, term1629858.getClass(), "kind", enum2914);
        setField(term1629858, term1629858.getClass(), "typeOfThis", term1629970);
        setField(term1629528, term1629528.getClass(), "typeOfThis", term1629858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1629528;
        try {
            callMethod(klass, "isSubtype", argTypes, term1628776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


