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

public class FunctionType_getGreatestSubtype_679591709560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513232;
     Object term513688;

    public FunctionType_getGreatestSubtype_679591709560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term515740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term515739 = ((Class) term515740).getDeclaredField((String) "ORDINARY");
        ((Field) term515739).setAccessible(true);
        Object enum939 = ((Field) term515739).get((Object) null);
        term513232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term513490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term513578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term513232, term513232.getClass(), "kind", enum939);
        setField(term513490, term513490.getClass(), "kind", enum939);
        setField(term513490, term513490.getClass(), "typeOfThis", term513578);
        setField(term513232, term513232.getClass(), "typeOfThis", term513490);
        Class<? extends Object> term516031 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term516030 = ((Class) term516031).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term516030).setAccessible(true);
        Object enum940 = ((Field) term516030).get((Object) null);
        term513688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term513862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term513688, term513688.getClass(), "kind", enum939);
        setField(term513862, term513862.getClass(), "kind", enum940);
        setField(term513862, term513862.getClass(), "typeOfThis", null);
        setField(term513688, term513688.getClass(), "typeOfThis", term513862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term513688;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term513232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


