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

public class FunctionType_isSubtype_21010021581329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860328;
     Object term1860794;

    public FunctionType_isSubtype_21010021581329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1862186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1862185 = ((Class) term1862186).getDeclaredField((String) "ORDINARY");
        ((Field) term1862185).setAccessible(true);
        Object enum3305 = ((Field) term1862185).get((Object) null);
        term1860328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1860576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1860686 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1860328, term1860328.getClass(), "kind", enum3305);
        setField(term1860576, term1860576.getClass(), "kind", enum3305);
        setField(term1860576, term1860576.getClass(), "typeOfThis", term1860686);
        setField(term1860328, term1860328.getClass(), "typeOfThis", term1860576);
        Class<? extends Object> term1862477 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1862476 = ((Class) term1862477).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1862476).setAccessible(true);
        Object enum3306 = ((Field) term1862476).get((Object) null);
        term1860794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1861052 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1860794, term1860794.getClass(), "kind", enum3306);
        setField(term1861052, term1861052.getClass(), "kind", enum3305);
        setField(term1861052, term1861052.getClass(), "typeOfThis", term1860794);
        setField(term1860794, term1860794.getClass(), "typeOfThis", term1861052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1860794;
        try {
            callMethod(klass, "isSubtype", argTypes, term1860328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


