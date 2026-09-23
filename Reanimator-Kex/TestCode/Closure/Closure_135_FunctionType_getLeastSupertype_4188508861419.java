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

public class FunctionType_getLeastSupertype_4188508861419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1834672;
     Object term1835318;

    public FunctionType_getLeastSupertype_4188508861419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1836325 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1836324 = ((Class) term1836325).getDeclaredField((String) "ORDINARY");
        ((Field) term1836324).setAccessible(true);
        Object enum3420 = ((Field) term1836324).get((Object) null);
        term1834672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1835210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term1834672, term1834672.getClass(), "kind", enum3420);
        setField(term1834672, term1834672.getClass(), "typeOfThis", term1835210);
        Class<? extends Object> term1836616 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1836615 = ((Class) term1836616).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1836615).setAccessible(true);
        Object enum3421 = ((Field) term1836615).get((Object) null);
        term1835318 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1835318, term1835318.getClass(), "kind", enum3421);
        setField(term1835318, term1835318.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1835318;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1834672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


