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

public class FunctionType_isSubtype_21010021581332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863311;
     Object term1863763;

    public FunctionType_isSubtype_21010021581332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1867040 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1867039 = ((Class) term1867040).getDeclaredField((String) "ORDINARY");
        ((Field) term1867039).setAccessible(true);
        Object enum3312 = ((Field) term1867039).get((Object) null);
        term1863311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1863559 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1863653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1863311, term1863311.getClass(), "kind", enum3312);
        setField(term1863311, term1863311.getClass(), "typeOfThis", term1863559);
        setField(term1863311, term1863311.getClass(), "call", term1863653);
        Class<? extends Object> term1867331 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1867330 = ((Class) term1867331).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1867330).setAccessible(true);
        Object enum3313 = ((Field) term1867330).get((Object) null);
        term1863763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1864029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term1864123 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1863763, term1863763.getClass(), "kind", enum3313);
        setField(term1863763, term1863763.getClass(), "typeOfThis", term1864029);
        setField(term1863763, term1863763.getClass(), "call", term1864123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1863763;
        try {
            callMethod(klass, "isSubtype", argTypes, term1863311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


