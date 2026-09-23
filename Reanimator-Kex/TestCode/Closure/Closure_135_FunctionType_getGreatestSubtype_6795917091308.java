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

public class FunctionType_getGreatestSubtype_6795917091308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1646665;
     Object term1646921;

    public FunctionType_getGreatestSubtype_6795917091308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1649510 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1649509 = ((Class) term1649510).getDeclaredField((String) "INTERFACE");
        ((Field) term1649509).setAccessible(true);
        Object enum3074 = ((Field) term1649509).get((Object) null);
        term1646665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1646665, term1646665.getClass(), "kind", enum3074);
        setField(term1646665, term1646665.getClass(), "typeOfThis", term1646665);
        Class<? extends Object> term1649804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1649803 = ((Class) term1649804).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1649803).setAccessible(true);
        Object enum3075 = ((Field) term1649803).get((Object) null);
        term1646921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1647169 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1646921, term1646921.getClass(), "kind", enum3075);
        setField(term1646921, term1646921.getClass(), "typeOfThis", term1647169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1646921;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1646665, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


