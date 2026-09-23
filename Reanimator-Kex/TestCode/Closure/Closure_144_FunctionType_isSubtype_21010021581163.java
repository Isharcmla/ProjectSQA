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

public class FunctionType_isSubtype_21010021581163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1551095;
     Object term1551567;

    public FunctionType_isSubtype_21010021581163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1554285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1554284 = ((Class) term1554285).getDeclaredField((String) "ORDINARY");
        ((Field) term1554284).setAccessible(true);
        Object enum2771 = ((Field) term1554284).get((Object) null);
        term1551095 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1551351 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1551459 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1551095, term1551095.getClass(), "kind", enum2771);
        setField(term1551351, term1551351.getClass(), "kind", enum2771);
        setField(term1551351, term1551351.getClass(), "typeOfThis", term1551459);
        setField(term1551095, term1551095.getClass(), "typeOfThis", term1551351);
        Class<? extends Object> term1554576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1554575 = ((Class) term1554576).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1554575).setAccessible(true);
        Object enum2772 = ((Field) term1554575).get((Object) null);
        term1551567 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1551823 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1552007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1551567, term1551567.getClass(), "kind", enum2772);
        setField(term1551823, term1551823.getClass(), "kind", enum2771);
        setField(term1551823, term1551823.getClass(), "typeOfThis", term1552007);
        setField(term1551567, term1551567.getClass(), "typeOfThis", term1551823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1551567;
        try {
            callMethod(klass, "isSubtype", argTypes, term1551095, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


