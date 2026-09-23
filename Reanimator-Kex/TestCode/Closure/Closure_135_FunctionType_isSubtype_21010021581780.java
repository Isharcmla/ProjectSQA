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

public class FunctionType_isSubtype_21010021581780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2440191;
     Object term2440547;

    public FunctionType_isSubtype_21010021581780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2443247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2443246 = ((Class) term2443247).getDeclaredField((String) "ORDINARY");
        ((Field) term2443246).setAccessible(true);
        Object enum4565 = ((Field) term2443246).get((Object) null);
        term2440191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2440439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2440191, term2440191.getClass(), "kind", enum4565);
        setField(term2440191, term2440191.getClass(), "typeOfThis", term2440439);
        Class<? extends Object> term2443538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2443537 = ((Class) term2443538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2443537).setAccessible(true);
        Object enum4566 = ((Field) term2443537).get((Object) null);
        term2440547 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2440803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2440985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2440547, term2440547.getClass(), "kind", enum4566);
        setField(term2440803, term2440803.getClass(), "kind", enum4565);
        setField(term2440803, term2440803.getClass(), "typeOfThis", term2440985);
        setField(term2440547, term2440547.getClass(), "typeOfThis", term2440803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2440547;
        try {
            callMethod(klass, "isSubtype", argTypes, term2440191, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


