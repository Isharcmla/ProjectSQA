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

public class FunctionType_isSubtype_2101002158801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800240;
     Object term801002;

    public FunctionType_isSubtype_2101002158801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term802022 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term802021 = ((Class) term802022).getDeclaredField((String) "ORDINARY");
        ((Field) term802021).setAccessible(true);
        Object enum1495 = ((Field) term802021).get((Object) null);
        term800240 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term800784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term800894 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term800240, term800240.getClass(), "kind", enum1495);
        setField(term800784, term800784.getClass(), "kind", enum1495);
        setField(term800784, term800784.getClass(), "typeOfThis", term800894);
        setField(term800240, term800240.getClass(), "typeOfThis", term800784);
        term801002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term801332 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term801002, term801002.getClass(), "kind", enum1495);
        setField(term801332, term801332.getClass(), "kind", enum1495);
        setField(term801332, term801332.getClass(), "typeOfThis", null);
        setField(term801002, term801002.getClass(), "typeOfThis", term801332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term801002;
        try {
            callMethod(klass, "isSubtype", argTypes, term800240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


