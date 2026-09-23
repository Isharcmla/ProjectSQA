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

public class FunctionType_isSubtype_21010021581507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2187980;
     Object term2188632;

    public FunctionType_isSubtype_21010021581507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2191551 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191550 = ((Class) term2191551).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2191550).setAccessible(true);
        Object enum3905 = ((Field) term2191550).get((Object) null);
        Class<? extends Object> term2191851 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2191850 = ((Class) term2191851).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2191850).setAccessible(true);
        Object enum3906 = ((Field) term2191850).get((Object) null);
        term2187980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2188524 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2187980, term2187980.getClass(), "kind", enum3905);
        setField(term2188524, term2188524.getClass(), "kind", enum3906);
        setField(term2188524, term2188524.getClass(), "call", null);
        setField(term2187980, term2187980.getClass(), "typeOfThis", term2188524);
        term2188632 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2188962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2189056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2188632, term2188632.getClass(), "kind", enum3905);
        setField(term2188962, term2188962.getClass(), "kind", enum3906);
        setField(term2188962, term2188962.getClass(), "call", term2189056);
        setField(term2188632, term2188632.getClass(), "typeOfThis", term2188962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2188632;
        try {
            callMethod(klass, "isSubtype", argTypes, term2187980, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


