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

public class FunctionType_isSubtype_21010021581001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1126796;
     Object term1127448;

    public FunctionType_isSubtype_21010021581001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1128614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1128613 = ((Class) term1128614).getDeclaredField((String) "ORDINARY");
        ((Field) term1128613).setAccessible(true);
        Object enum2097 = ((Field) term1128613).get((Object) null);
        Class<? extends Object> term1128905 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1128904 = ((Class) term1128905).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1128904).setAccessible(true);
        Object enum2098 = ((Field) term1128904).get((Object) null);
        term1126796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1127340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1126796, term1126796.getClass(), "kind", enum2097);
        setField(term1127340, term1127340.getClass(), "kind", enum2098);
        setField(term1126796, term1126796.getClass(), "typeOfThis", term1127340);
        term1127448 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1127630 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1127448, term1127448.getClass(), "kind", enum2098);
        setField(term1127630, term1127630.getClass(), "kind", enum2098);
        setField(term1127448, term1127448.getClass(), "typeOfThis", term1127630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1127448;
        try {
            callMethod(klass, "isSubtype", argTypes, term1126796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


