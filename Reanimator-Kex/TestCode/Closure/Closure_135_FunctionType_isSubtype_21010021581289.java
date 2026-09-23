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

public class FunctionType_isSubtype_21010021581289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613672;
     Object term1614028;

    public FunctionType_isSubtype_21010021581289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1616610 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1616609 = ((Class) term1616610).getDeclaredField((String) "ORDINARY");
        ((Field) term1616609).setAccessible(true);
        Object enum3009 = ((Field) term1616609).get((Object) null);
        term1613672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1613920 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1613672, term1613672.getClass(), "kind", enum3009);
        setField(term1613920, term1613920.getClass(), "kind", enum3009);
        setField(term1613672, term1613672.getClass(), "typeOfThis", term1613920);
        Class<? extends Object> term1616901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1616900 = ((Class) term1616901).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1616900).setAccessible(true);
        Object enum3010 = ((Field) term1616900).get((Object) null);
        term1614028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1614210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1614028, term1614028.getClass(), "kind", enum3009);
        setField(term1614210, term1614210.getClass(), "kind", enum3010);
        setField(term1614028, term1614028.getClass(), "typeOfThis", term1614210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1614028;
        try {
            callMethod(klass, "isSubtype", argTypes, term1613672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


