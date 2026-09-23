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

public class FunctionType_isSubtype_21010021581233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522604;
     Object term1523244;

    public FunctionType_isSubtype_21010021581233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1524313 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1524312 = ((Class) term1524313).getDeclaredField((String) "INTERFACE");
        ((Field) term1524312).setAccessible(true);
        Object enum2845 = ((Field) term1524312).get((Object) null);
        term1522604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1523136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1522604, term1522604.getClass(), "kind", enum2845);
        setField(term1522604, term1522604.getClass(), "typeOfThis", term1523136);
        Class<? extends Object> term1524607 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1524606 = ((Class) term1524607).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1524606).setAccessible(true);
        Object enum2846 = ((Field) term1524606).get((Object) null);
        term1523244 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1523244, term1523244.getClass(), "kind", enum2846);
        setField(term1523244, term1523244.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1523244;
        try {
            callMethod(klass, "isSubtype", argTypes, term1522604, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


