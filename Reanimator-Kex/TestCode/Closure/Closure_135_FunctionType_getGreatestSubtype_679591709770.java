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

public class FunctionType_getGreatestSubtype_679591709770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744915;
     Object term745575;

    public FunctionType_getGreatestSubtype_679591709770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term750718 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term750717 = ((Class) term750718).getDeclaredField((String) "ORDINARY");
        ((Field) term750717).setAccessible(true);
        Object enum1396 = ((Field) term750717).get((Object) null);
        term744915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term745467 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term744915, term744915.getClass(), "kind", enum1396);
        setField(term745467, term745467.getClass(), "kind", enum1396);
        setField(term744915, term744915.getClass(), "typeOfThis", term745467);
        Class<? extends Object> term751009 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term751008 = ((Class) term751009).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term751008).setAccessible(true);
        Object enum1397 = ((Field) term751008).get((Object) null);
        Class<? extends Object> term751309 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term751308 = ((Class) term751309).getDeclaredField((String) "INTERFACE");
        ((Field) term751308).setAccessible(true);
        Object enum1398 = ((Field) term751308).get((Object) null);
        term745575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term745749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term745575, term745575.getClass(), "kind", enum1397);
        setField(term745749, term745749.getClass(), "kind", enum1398);
        setField(term745575, term745575.getClass(), "typeOfThis", term745749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term745575;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term744915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


