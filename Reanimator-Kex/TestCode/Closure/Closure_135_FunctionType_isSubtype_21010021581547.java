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

public class FunctionType_isSubtype_21010021581547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2051279;
     Object term2051635;

    public FunctionType_isSubtype_21010021581547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2054511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2054510 = ((Class) term2054511).getDeclaredField((String) "ORDINARY");
        ((Field) term2054510).setAccessible(true);
        Object enum3826 = ((Field) term2054510).get((Object) null);
        term2051279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2051527 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2051279, term2051279.getClass(), "kind", enum3826);
        setField(term2051527, term2051527.getClass(), "kind", enum3826);
        setField(term2051279, term2051279.getClass(), "typeOfThis", term2051527);
        Class<? extends Object> term2054802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2054801 = ((Class) term2054802).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2054801).setAccessible(true);
        Object enum3827 = ((Field) term2054801).get((Object) null);
        term2051635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2051817 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2051635, term2051635.getClass(), "kind", enum3826);
        setField(term2051817, term2051817.getClass(), "kind", enum3827);
        setField(term2051635, term2051635.getClass(), "typeOfThis", term2051817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2051635;
        try {
            callMethod(klass, "isSubtype", argTypes, term2051279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


