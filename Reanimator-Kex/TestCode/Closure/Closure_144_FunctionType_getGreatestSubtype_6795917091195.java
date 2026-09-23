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

public class FunctionType_getGreatestSubtype_6795917091195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613314;
     Object term1614088;

    public FunctionType_getGreatestSubtype_6795917091195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1615498 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1615497 = ((Class) term1615498).getDeclaredField((String) "ORDINARY");
        ((Field) term1615497).setAccessible(true);
        Object enum2885 = ((Field) term1615497).get((Object) null);
        Class<? extends Object> term1615789 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1615788 = ((Class) term1615789).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1615788).setAccessible(true);
        Object enum2886 = ((Field) term1615788).get((Object) null);
        term1613314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1613868 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1613978 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1613314, term1613314.getClass(), "kind", enum2885);
        setField(term1613868, term1613868.getClass(), "kind", enum2885);
        setField(term1613978, term1613978.getClass(), "kind", enum2886);
        setField(term1613868, term1613868.getClass(), "typeOfThis", term1613978);
        setField(term1613314, term1613314.getClass(), "typeOfThis", term1613868);
        term1614088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1614270 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1614518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1614088, term1614088.getClass(), "kind", enum2886);
        setField(term1614270, term1614270.getClass(), "kind", enum2885);
        setField(term1614270, term1614270.getClass(), "typeOfThis", term1614518);
        setField(term1614088, term1614088.getClass(), "typeOfThis", term1614270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1614088;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1613314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


