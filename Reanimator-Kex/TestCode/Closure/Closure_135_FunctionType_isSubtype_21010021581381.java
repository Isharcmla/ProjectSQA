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

public class FunctionType_isSubtype_21010021581381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1772305;
     Object term1772957;

    public FunctionType_isSubtype_21010021581381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1774900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1774899 = ((Class) term1774900).getDeclaredField((String) "INTERFACE");
        ((Field) term1774899).setAccessible(true);
        Object enum3305 = ((Field) term1774899).get((Object) null);
        Class<? extends Object> term1775194 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1775193 = ((Class) term1775194).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1775193).setAccessible(true);
        Object enum3306 = ((Field) term1775193).get((Object) null);
        term1772305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1772849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1772305, term1772305.getClass(), "kind", enum3305);
        setField(term1772849, term1772849.getClass(), "kind", enum3306);
        setField(term1772305, term1772305.getClass(), "typeOfThis", term1772849);
        Class<? extends Object> term1775494 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1775493 = ((Class) term1775494).getDeclaredField((String) "INTERFACE");
        ((Field) term1775493).setAccessible(true);
        Object enum3307 = ((Field) term1775493).get((Object) null);
        term1772957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1773287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1772957, term1772957.getClass(), "kind", enum3305);
        setField(term1773287, term1773287.getClass(), "kind", enum3307);
        setField(term1772957, term1772957.getClass(), "typeOfThis", term1773287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1772957;
        try {
            callMethod(klass, "isSubtype", argTypes, term1772305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


