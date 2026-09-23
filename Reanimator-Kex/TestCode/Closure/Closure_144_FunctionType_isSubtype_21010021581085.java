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

public class FunctionType_isSubtype_21010021581085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1416590;
     Object term1417244;

    public FunctionType_isSubtype_21010021581085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1420608 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1420607 = ((Class) term1420608).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1420607).setAccessible(true);
        Object enum2545 = ((Field) term1420607).get((Object) null);
        Class<? extends Object> term1420908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1420907 = ((Class) term1420908).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1420907).setAccessible(true);
        Object enum2546 = ((Field) term1420907).get((Object) null);
        term1416590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1417134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1416590, term1416590.getClass(), "kind", enum2545);
        setField(term1417134, term1417134.getClass(), "kind", enum2546);
        setField(term1417134, term1417134.getClass(), "call", null);
        setField(term1416590, term1416590.getClass(), "typeOfThis", term1417134);
        term1417244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1417576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1417670 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1417244, term1417244.getClass(), "kind", enum2545);
        setField(term1417576, term1417576.getClass(), "kind", enum2546);
        setField(term1417576, term1417576.getClass(), "call", term1417670);
        setField(term1417244, term1417244.getClass(), "typeOfThis", term1417576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1417244;
        try {
            callMethod(klass, "isSubtype", argTypes, term1416590, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


