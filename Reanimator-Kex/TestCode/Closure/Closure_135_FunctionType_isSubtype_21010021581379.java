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

public class FunctionType_isSubtype_21010021581379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767993;
     Object term1768745;

    public FunctionType_isSubtype_21010021581379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1770583 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1770582 = ((Class) term1770583).getDeclaredField((String) "INTERFACE");
        ((Field) term1770582).setAccessible(true);
        Object enum3297 = ((Field) term1770582).get((Object) null);
        term1767993 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1768537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1768637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1767993, term1767993.getClass(), "kind", enum3297);
        setField(term1768537, term1768537.getClass(), "kind", enum3297);
        setField(term1768537, term1768537.getClass(), "typeOfThis", term1768637);
        setField(term1768537, term1768537.getClass(), "call", null);
        setField(term1767993, term1767993.getClass(), "typeOfThis", term1768537);
        Class<? extends Object> term1770877 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1770876 = ((Class) term1770877).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1770876).setAccessible(true);
        Object enum3298 = ((Field) term1770876).get((Object) null);
        term1768745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1769075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1769169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1768745, term1768745.getClass(), "kind", enum3297);
        setField(term1769075, term1769075.getClass(), "kind", enum3298);
        setField(term1769075, term1769075.getClass(), "typeOfThis", null);
        setField(term1769075, term1769075.getClass(), "call", term1769169);
        setField(term1768745, term1768745.getClass(), "typeOfThis", term1769075);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1768745;
        try {
            callMethod(klass, "isSubtype", argTypes, term1767993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


