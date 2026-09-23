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

public class FunctionType_isSubtype_21010021581215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1490616;
     Object term1491268;

    public FunctionType_isSubtype_21010021581215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1492370 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1492369 = ((Class) term1492370).getDeclaredField((String) "ORDINARY");
        ((Field) term1492369).setAccessible(true);
        Object enum2784 = ((Field) term1492369).get((Object) null);
        term1490616 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1491160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1490616, term1490616.getClass(), "kind", enum2784);
        setField(term1490616, term1490616.getClass(), "typeOfThis", term1491160);
        Class<? extends Object> term1492661 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1492660 = ((Class) term1492661).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1492660).setAccessible(true);
        Object enum2785 = ((Field) term1492660).get((Object) null);
        term1491268 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1491442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1491268, term1491268.getClass(), "kind", enum2785);
        setField(term1491268, term1491268.getClass(), "typeOfThis", term1491442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1491268;
        try {
            callMethod(klass, "isSubtype", argTypes, term1490616, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


