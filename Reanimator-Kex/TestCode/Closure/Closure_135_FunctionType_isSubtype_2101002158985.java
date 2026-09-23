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

public class FunctionType_isSubtype_2101002158985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1101304;
     Object term1102056;

    public FunctionType_isSubtype_2101002158985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1103335 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1103334 = ((Class) term1103335).getDeclaredField((String) "ORDINARY");
        ((Field) term1103334).setAccessible(true);
        Object enum2052 = ((Field) term1103334).get((Object) null);
        term1101304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1101848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1101948 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1101304, term1101304.getClass(), "kind", enum2052);
        setField(term1101848, term1101848.getClass(), "kind", enum2052);
        setField(term1101848, term1101848.getClass(), "typeOfThis", term1101948);
        setField(term1101304, term1101304.getClass(), "typeOfThis", term1101848);
        Class<? extends Object> term1103626 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1103625 = ((Class) term1103626).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1103625).setAccessible(true);
        Object enum2053 = ((Field) term1103625).get((Object) null);
        term1102056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1102238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1102056, term1102056.getClass(), "kind", enum2053);
        setField(term1102238, term1102238.getClass(), "kind", enum2053);
        setField(term1102238, term1102238.getClass(), "typeOfThis", null);
        setField(term1102056, term1102056.getClass(), "typeOfThis", term1102238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1102056;
        try {
            callMethod(klass, "isSubtype", argTypes, term1101304, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


