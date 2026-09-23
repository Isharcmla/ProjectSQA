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

public class FunctionType_isSubtype_21010021581365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1744941;
     Object term1745405;

    public FunctionType_isSubtype_21010021581365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1746983 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1746982 = ((Class) term1746983).getDeclaredField((String) "ORDINARY");
        ((Field) term1746982).setAccessible(true);
        Object enum3255 = ((Field) term1746982).get((Object) null);
        term1744941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1745197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1745297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1744941, term1744941.getClass(), "kind", enum3255);
        setField(term1745197, term1745197.getClass(), "kind", enum3255);
        setField(term1745197, term1745197.getClass(), "typeOfThis", term1745297);
        setField(term1744941, term1744941.getClass(), "typeOfThis", term1745197);
        Class<? extends Object> term1747274 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1747273 = ((Class) term1747274).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1747273).setAccessible(true);
        Object enum3256 = ((Field) term1747273).get((Object) null);
        term1745405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1745587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1745405, term1745405.getClass(), "kind", enum3255);
        setField(term1745587, term1745587.getClass(), "kind", enum3256);
        setField(term1745587, term1745587.getClass(), "typeOfThis", null);
        setField(term1745405, term1745405.getClass(), "typeOfThis", term1745587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1745405;
        try {
            callMethod(klass, "isSubtype", argTypes, term1744941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


