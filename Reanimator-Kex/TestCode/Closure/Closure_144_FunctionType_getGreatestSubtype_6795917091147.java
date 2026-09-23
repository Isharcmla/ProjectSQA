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

public class FunctionType_getGreatestSubtype_6795917091147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527038;
     Object term1527700;

    public FunctionType_getGreatestSubtype_6795917091147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1528676 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1528675 = ((Class) term1528676).getDeclaredField((String) "INTERFACE");
        ((Field) term1528675).setAccessible(true);
        Object enum2726 = ((Field) term1528675).get((Object) null);
        term1527038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1527590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1527038, term1527038.getClass(), "kind", enum2726);
        setField(term1527038, term1527038.getClass(), "typeOfThis", term1527590);
        term1527700 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1528010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1527700, term1527700.getClass(), "kind", enum2726);
        setField(term1527700, term1527700.getClass(), "typeOfThis", term1528010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1527700;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1527038, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


