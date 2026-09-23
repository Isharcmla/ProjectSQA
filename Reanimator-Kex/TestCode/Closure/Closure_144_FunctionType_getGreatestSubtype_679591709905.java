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

public class FunctionType_getGreatestSubtype_679591709905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1101406;
     Object term1101026;

    public FunctionType_getGreatestSubtype_679591709905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1102521 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1102520 = ((Class) term1102521).getDeclaredField((String) "INTERFACE");
        ((Field) term1102520).setAccessible(true);
        Object enum1984 = ((Field) term1102520).get((Object) null);
        Class<? extends Object> term1102815 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1102814 = ((Class) term1102815).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1102814).setAccessible(true);
        Object enum1985 = ((Field) term1102814).get((Object) null);
        term1101406 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1101461 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1101515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1101406, term1101406.getClass(), "kind", enum1984);
        setField(term1101461, term1101461.getClass(), "kind", enum1984);
        setField(term1101515, term1101515.getClass(), "kind", enum1985);
        setField(term1101461, term1101461.getClass(), "typeOfThis", term1101515);
        setField(term1101406, term1101406.getClass(), "typeOfThis", term1101461);
        term1101026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1101208 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1101026, term1101026.getClass(), "kind", enum1985);
        setField(term1101208, term1101208.getClass(), "kind", enum1984);
        setField(term1101208, term1101208.getClass(), "typeOfThis", term1101406);
        setField(term1101026, term1101026.getClass(), "typeOfThis", term1101208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1101026;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1101406, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


