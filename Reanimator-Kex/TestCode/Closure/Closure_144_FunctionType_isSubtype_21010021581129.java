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

public class FunctionType_isSubtype_21010021581129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1494560;
     Object term1495110;

    public FunctionType_isSubtype_21010021581129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1498043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1498042 = ((Class) term1498043).getDeclaredField((String) "ORDINARY");
        ((Field) term1498042).setAccessible(true);
        Object enum2674 = ((Field) term1498042).get((Object) null);
        term1494560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1494808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1494908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1495002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1494560, term1494560.getClass(), "kind", enum2674);
        setField(term1494808, term1494808.getClass(), "kind", enum2674);
        setField(term1494808, term1494808.getClass(), "typeOfThis", term1494908);
        setField(term1494560, term1494560.getClass(), "typeOfThis", term1494808);
        setField(term1494560, term1494560.getClass(), "call", term1495002);
        Class<? extends Object> term1498334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1498333 = ((Class) term1498334).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1498333).setAccessible(true);
        Object enum2675 = ((Field) term1498333).get((Object) null);
        term1495110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1495366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1495474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1495110, term1495110.getClass(), "kind", enum2675);
        setField(term1495366, term1495366.getClass(), "kind", enum2675);
        setField(term1495366, term1495366.getClass(), "typeOfThis", term1495474);
        setField(term1495110, term1495110.getClass(), "typeOfThis", term1495366);
        setField(term1495110, term1495110.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1495110;
        try {
            callMethod(klass, "isSubtype", argTypes, term1494560, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


