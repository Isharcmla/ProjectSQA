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

public class FunctionType_isSubtype_21010021581225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670382;
     Object term1671036;

    public FunctionType_isSubtype_21010021581225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1673008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673007 = ((Class) term1673008).getDeclaredField((String) "ORDINARY");
        ((Field) term1673007).setAccessible(true);
        Object enum2987 = ((Field) term1673007).get((Object) null);
        Class<? extends Object> term1673299 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673298 = ((Class) term1673299).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1673298).setAccessible(true);
        Object enum2988 = ((Field) term1673298).get((Object) null);
        term1670382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1670926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1670382, term1670382.getClass(), "kind", enum2987);
        setField(term1670926, term1670926.getClass(), "kind", enum2988);
        setField(term1670382, term1670382.getClass(), "typeOfThis", term1670926);
        Class<? extends Object> term1673599 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1673598 = ((Class) term1673599).getDeclaredField((String) "INTERFACE");
        ((Field) term1673598).setAccessible(true);
        Object enum2989 = ((Field) term1673598).get((Object) null);
        term1671036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1671368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1671036, term1671036.getClass(), "kind", enum2987);
        setField(term1671368, term1671368.getClass(), "kind", enum2989);
        setField(term1671036, term1671036.getClass(), "typeOfThis", term1671368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1671036;
        try {
            callMethod(klass, "isSubtype", argTypes, term1670382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


