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

public class FunctionType_getGreatestSubtype_6795917091057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367016;
     Object term1367943;

    public FunctionType_getGreatestSubtype_6795917091057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1371767 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1371766 = ((Class) term1371767).getDeclaredField((String) "ORDINARY");
        ((Field) term1371766).setAccessible(true);
        Object enum2457 = ((Field) term1371766).get((Object) null);
        Class<? extends Object> term1372058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1372057 = ((Class) term1372058).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1372057).setAccessible(true);
        Object enum2458 = ((Field) term1372057).get((Object) null);
        Class<? extends Object> term1372358 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1372357 = ((Class) term1372358).getDeclaredField((String) "INTERFACE");
        ((Field) term1372357).setAccessible(true);
        Object enum2459 = ((Field) term1372357).get((Object) null);
        term1367016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1367570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term1367943 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1368219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1368269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1367016, term1367016.getClass(), "kind", enum2457);
        setField(term1367570, term1367570.getClass(), "kind", enum2457);
        setField(term1367943, term1367943.getClass(), "kind", enum2457);
        setField(term1368219, term1368219.getClass(), "kind", enum2458);
        setField(term1368269, term1368269.getClass(), "kind", enum2459);
        setField(term1368219, term1368219.getClass(), "typeOfThis", term1368269);
        setField(term1367943, term1367943.getClass(), "typeOfThis", term1368219);
        setField(term1367570, term1367570.getClass(), "typeOfThis", term1367943);
        setField(term1367016, term1367016.getClass(), "typeOfThis", term1367570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1367943;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1367016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


