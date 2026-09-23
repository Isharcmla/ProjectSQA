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

public class FunctionType_getGreatestSubtype_679591709383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281851;
     Object term282109;

    public FunctionType_getGreatestSubtype_679591709383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term282823 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term282822 = ((Class) term282823).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term282822).setAccessible(true);
        Object enum490 = ((Field) term282822).get((Object) null);
        term281851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term281851, term281851.getClass(), "kind", enum490);
        term282109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term282109, term282109.getClass(), "kind", enum490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term282109;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term281851, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


