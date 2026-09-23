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

public class FunctionType_supAndInfHelper_1603977104521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456150;
     Object term456802;

    public FunctionType_supAndInfHelper_1603977104521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term457656 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term457655 = ((Class) term457656).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term457655).setAccessible(true);
        Object enum831 = ((Field) term457655).get((Object) null);
        term456150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term456692 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term456150, term456150.getClass(), "kind", enum831);
        setField(term456150, term456150.getClass(), "typeOfThis", term456692);
        term456802 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term456802, term456802.getClass(), "kind", enum831);
        setField(term456802, term456802.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term456802;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term456150, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


