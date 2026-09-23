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

public class FunctionType_isSubtype_21010021581750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389291;
     Object term2389847;

    public FunctionType_isSubtype_21010021581750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2392557 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2392556 = ((Class) term2392557).getDeclaredField((String) "ORDINARY");
        ((Field) term2392556).setAccessible(true);
        Object enum4468 = ((Field) term2392556).get((Object) null);
        term2389291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2389539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2389645 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        Object term2389739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2389291, term2389291.getClass(), "kind", enum4468);
        setField(term2389539, term2389539.getClass(), "kind", enum4468);
        setField(term2389539, term2389539.getClass(), "typeOfThis", term2389645);
        setField(term2389539, term2389539.getClass(), "call", term2389739);
        setField(term2389291, term2389291.getClass(), "typeOfThis", term2389539);
        Class<? extends Object> term2392848 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2392847 = ((Class) term2392848).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2392847).setAccessible(true);
        Object enum4469 = ((Field) term2392847).get((Object) null);
        term2389847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2390029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2390271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2389847, term2389847.getClass(), "kind", enum4468);
        setField(term2390029, term2390029.getClass(), "kind", enum4469);
        setField(term2390029, term2390029.getClass(), "typeOfThis", null);
        setField(term2390029, term2390029.getClass(), "call", term2390271);
        setField(term2389847, term2389847.getClass(), "typeOfThis", term2390029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2389847;
        try {
            callMethod(klass, "isSubtype", argTypes, term2389291, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


