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

public class FunctionType_isSubtype_21010021581021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301765;
     Object term1302515;

    public FunctionType_isSubtype_21010021581021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1303957 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1303956 = ((Class) term1303957).getDeclaredField((String) "INTERFACE");
        ((Field) term1303956).setAccessible(true);
        Object enum2339 = ((Field) term1303956).get((Object) null);
        term1301765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1302309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1302405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1301765, term1301765.getClass(), "kind", enum2339);
        setField(term1302309, term1302309.getClass(), "kind", enum2339);
        setField(term1302309, term1302309.getClass(), "typeOfThis", term1302405);
        setField(term1302309, term1302309.getClass(), "call", null);
        setField(term1301765, term1301765.getClass(), "typeOfThis", term1302309);
        Class<? extends Object> term1304251 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1304250 = ((Class) term1304251).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1304250).setAccessible(true);
        Object enum2340 = ((Field) term1304250).get((Object) null);
        term1302515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1302847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1302941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1302515, term1302515.getClass(), "kind", enum2339);
        setField(term1302847, term1302847.getClass(), "kind", enum2340);
        setField(term1302847, term1302847.getClass(), "typeOfThis", null);
        setField(term1302847, term1302847.getClass(), "call", term1302941);
        setField(term1302515, term1302515.getClass(), "typeOfThis", term1302847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1302515;
        try {
            callMethod(klass, "isSubtype", argTypes, term1301765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


