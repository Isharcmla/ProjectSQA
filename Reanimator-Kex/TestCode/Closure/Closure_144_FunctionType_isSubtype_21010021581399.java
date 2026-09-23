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

public class FunctionType_isSubtype_21010021581399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1982564;
     Object term1983216;

    public FunctionType_isSubtype_21010021581399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1987000 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1986999 = ((Class) term1987000).getDeclaredField((String) "ORDINARY");
        ((Field) term1986999).setAccessible(true);
        Object enum3525 = ((Field) term1986999).get((Object) null);
        Class<? extends Object> term1987291 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1987290 = ((Class) term1987291).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1987290).setAccessible(true);
        Object enum3526 = ((Field) term1987290).get((Object) null);
        term1982564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1983108 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1982564, term1982564.getClass(), "kind", enum3525);
        setField(term1983108, term1983108.getClass(), "kind", enum3526);
        setField(term1982564, term1982564.getClass(), "typeOfThis", term1983108);
        Class<? extends Object> term1987591 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1987590 = ((Class) term1987591).getDeclaredField((String) "INTERFACE");
        ((Field) term1987590).setAccessible(true);
        Object enum3527 = ((Field) term1987590).get((Object) null);
        term1983216 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1983546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1983216, term1983216.getClass(), "kind", enum3525);
        setField(term1983546, term1983546.getClass(), "kind", enum3527);
        setField(term1983216, term1983216.getClass(), "typeOfThis", term1983546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1983216;
        try {
            callMethod(klass, "isSubtype", argTypes, term1982564, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


