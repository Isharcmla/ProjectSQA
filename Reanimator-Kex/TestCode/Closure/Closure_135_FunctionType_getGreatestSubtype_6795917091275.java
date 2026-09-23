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

public class FunctionType_getGreatestSubtype_6795917091275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1591452;
     Object term1592112;

    public FunctionType_getGreatestSubtype_6795917091275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1593254 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1593253 = ((Class) term1593254).getDeclaredField((String) "INTERFACE");
        ((Field) term1593253).setAccessible(true);
        Object enum2970 = ((Field) term1593253).get((Object) null);
        term1591452 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1592004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1591452, term1591452.getClass(), "kind", enum2970);
        setField(term1591452, term1591452.getClass(), "typeOfThis", term1592004);
        Class<? extends Object> term1593548 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1593547 = ((Class) term1593548).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1593547).setAccessible(true);
        Object enum2971 = ((Field) term1593547).get((Object) null);
        term1592112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1592294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1592112, term1592112.getClass(), "kind", enum2971);
        setField(term1592112, term1592112.getClass(), "typeOfThis", term1592294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1592112;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1591452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


