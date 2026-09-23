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

public class FunctionType_getGreatestSubtype_679591709301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180946;
     Object term181204;

    public FunctionType_getGreatestSubtype_679591709301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181805 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term181804 = ((Class) term181805).getDeclaredField((String) "INTERFACE");
        ((Field) term181804).setAccessible(true);
        Object enum328 = ((Field) term181804).get((Object) null);
        term180946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term180946, term180946.getClass(), "kind", enum328);
        term181204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term181204;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term180946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


