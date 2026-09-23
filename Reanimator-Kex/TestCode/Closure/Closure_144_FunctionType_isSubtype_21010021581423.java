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

public class FunctionType_isSubtype_21010021581423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2025549;
     Object term2026311;

    public FunctionType_isSubtype_21010021581423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2031555 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2031554 = ((Class) term2031555).getDeclaredField((String) "INTERFACE");
        ((Field) term2031554).setAccessible(true);
        Object enum3606 = ((Field) term2031554).get((Object) null);
        term2025549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2026093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2026203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2025549, term2025549.getClass(), "kind", enum3606);
        setField(term2026093, term2026093.getClass(), "kind", enum3606);
        setField(term2026093, term2026093.getClass(), "typeOfThis", term2026203);
        setField(term2025549, term2025549.getClass(), "typeOfThis", term2026093);
        Class<? extends Object> term2031849 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2031848 = ((Class) term2031849).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2031848).setAccessible(true);
        Object enum3607 = ((Field) term2031848).get((Object) null);
        term2026311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2026641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2026751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2026311, term2026311.getClass(), "kind", enum3606);
        setField(term2026641, term2026641.getClass(), "kind", enum3607);
        setField(term2026641, term2026641.getClass(), "typeOfThis", term2026751);
        setField(term2026311, term2026311.getClass(), "typeOfThis", term2026641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2026311;
        try {
            callMethod(klass, "isSubtype", argTypes, term2025549, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


