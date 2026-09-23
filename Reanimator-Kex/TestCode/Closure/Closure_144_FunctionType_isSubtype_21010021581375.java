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

public class FunctionType_isSubtype_21010021581375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1941266;
     Object term1941832;

    public FunctionType_isSubtype_21010021581375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1944998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1944997 = ((Class) term1944998).getDeclaredField((String) "ORDINARY");
        ((Field) term1944997).setAccessible(true);
        Object enum3447 = ((Field) term1944997).get((Object) null);
        term1941266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1941514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1942035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1942159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1941266, term1941266.getClass(), "kind", enum3447);
        setField(term1941514, term1941514.getClass(), "kind", enum3447);
        setField(term1942035, term1942035.getClass(), "kind", enum3447);
        setField(term1942035, term1942035.getClass(), "typeOfThis", term1942159);
        setField(term1941514, term1941514.getClass(), "typeOfThis", term1942035);
        setField(term1941266, term1941266.getClass(), "typeOfThis", term1941514);
        Class<? extends Object> term1945289 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1945288 = ((Class) term1945289).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1945288).setAccessible(true);
        Object enum3448 = ((Field) term1945288).get((Object) null);
        term1941832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1941832, term1941832.getClass(), "kind", enum3448);
        setField(term1941832, term1941832.getClass(), "typeOfThis", term1942035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1941832;
        try {
            callMethod(klass, "isSubtype", argTypes, term1941266, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


