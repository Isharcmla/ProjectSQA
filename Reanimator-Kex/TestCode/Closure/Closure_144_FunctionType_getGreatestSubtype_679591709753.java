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

public class FunctionType_getGreatestSubtype_679591709753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term829944;
     Object term830504;

    public FunctionType_getGreatestSubtype_679591709753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term832298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term832297 = ((Class) term832298).getDeclaredField((String) "ORDINARY");
        ((Field) term832297).setAccessible(true);
        Object enum1499 = ((Field) term832297).get((Object) null);
        term829944 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term830202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term830290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term830394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term829944, term829944.getClass(), "kind", enum1499);
        setField(term830202, term830202.getClass(), "kind", enum1499);
        setField(term830202, term830202.getClass(), "typeOfThis", term830290);
        setField(term829944, term829944.getClass(), "typeOfThis", term830202);
        setField(term829944, term829944.getClass(), "registry", term830394);
        Class<? extends Object> term832589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term832588 = ((Class) term832589).getDeclaredField((String) "INTERFACE");
        ((Field) term832588).setAccessible(true);
        Object enum1500 = ((Field) term832588).get((Object) null);
        Class<? extends Object> term832883 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term832882 = ((Class) term832883).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term832882).setAccessible(true);
        Object enum1501 = ((Field) term832882).get((Object) null);
        term830504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term830740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term830996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term830504, term830504.getClass(), "kind", enum1500);
        setField(term830740, term830740.getClass(), "kind", enum1501);
        setField(term830740, term830740.getClass(), "typeOfThis", term830996);
        setField(term830504, term830504.getClass(), "typeOfThis", term830740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term830504;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term829944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


