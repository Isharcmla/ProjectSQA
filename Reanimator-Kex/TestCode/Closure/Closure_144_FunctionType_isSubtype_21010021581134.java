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

public class FunctionType_isSubtype_21010021581134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501747;
     Object term1502399;

    public FunctionType_isSubtype_21010021581134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1505451 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1505450 = ((Class) term1505451).getDeclaredField((String) "INTERFACE");
        ((Field) term1505450).setAccessible(true);
        Object enum2685 = ((Field) term1505450).get((Object) null);
        Class<? extends Object> term1505745 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1505744 = ((Class) term1505745).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1505744).setAccessible(true);
        Object enum2686 = ((Field) term1505744).get((Object) null);
        term1501747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1502291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1501747, term1501747.getClass(), "kind", enum2685);
        setField(term1502291, term1502291.getClass(), "kind", enum2686);
        setField(term1501747, term1501747.getClass(), "typeOfThis", term1502291);
        term1502399 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1502583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1502399, term1502399.getClass(), "kind", enum2686);
        setField(term1502583, term1502583.getClass(), "kind", enum2686);
        setField(term1502399, term1502399.getClass(), "typeOfThis", term1502583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1502399;
        try {
            callMethod(klass, "isSubtype", argTypes, term1501747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


