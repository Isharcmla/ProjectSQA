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

public class FunctionType_isSubtype_21010021581173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1568827;
     Object term1569425;

    public FunctionType_isSubtype_21010021581173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1573470 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1573469 = ((Class) term1573470).getDeclaredField((String) "ORDINARY");
        ((Field) term1573469).setAccessible(true);
        Object enum2805 = ((Field) term1573469).get((Object) null);
        Class<? extends Object> term1573761 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1573760 = ((Class) term1573761).getDeclaredField((String) "INTERFACE");
        ((Field) term1573760).setAccessible(true);
        Object enum2806 = ((Field) term1573760).get((Object) null);
        term1568827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1569075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1569317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1568827, term1568827.getClass(), "kind", enum2805);
        setField(term1569075, term1569075.getClass(), "kind", enum2806);
        setField(term1568827, term1568827.getClass(), "typeOfThis", term1569075);
        setField(term1568827, term1568827.getClass(), "call", term1569317);
        Class<? extends Object> term1574055 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1574054 = ((Class) term1574055).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1574054).setAccessible(true);
        Object enum2807 = ((Field) term1574054).get((Object) null);
        term1569425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1569609 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1569851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1569425, term1569425.getClass(), "kind", enum2805);
        setField(term1569609, term1569609.getClass(), "kind", enum2807);
        setField(term1569425, term1569425.getClass(), "typeOfThis", term1569609);
        setField(term1569425, term1569425.getClass(), "call", term1569851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1569425;
        try {
            callMethod(klass, "isSubtype", argTypes, term1568827, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


