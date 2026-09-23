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

public class FunctionType_isSubtype_21010021581296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1623831;
     Object term1624343;

    public FunctionType_isSubtype_21010021581296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1627815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1627814 = ((Class) term1627815).getDeclaredField((String) "ORDINARY");
        ((Field) term1627814).setAccessible(true);
        Object enum3029 = ((Field) term1627814).get((Object) null);
        Class<? extends Object> term1628106 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1628105 = ((Class) term1628106).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1628105).setAccessible(true);
        Object enum3030 = ((Field) term1628105).get((Object) null);
        term1623831 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1624087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1623831, term1623831.getClass(), "kind", enum3029);
        setField(term1624087, term1624087.getClass(), "kind", enum3030);
        setField(term1623831, term1623831.getClass(), "typeOfThis", term1624087);
        Class<? extends Object> term1628406 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1628405 = ((Class) term1628406).getDeclaredField((String) "INTERFACE");
        ((Field) term1628405).setAccessible(true);
        Object enum3031 = ((Field) term1628405).get((Object) null);
        term1624343 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1624525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1624343, term1624343.getClass(), "kind", enum3029);
        setField(term1624525, term1624525.getClass(), "kind", enum3031);
        setField(term1624343, term1624343.getClass(), "typeOfThis", term1624525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1624343;
        try {
            callMethod(klass, "isSubtype", argTypes, term1623831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


