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

public class FunctionType_getTopMostDefiningType_1667499519357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210503;

    public FunctionType_getTopMostDefiningType_1667499519357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term211354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term211353 = ((Class) term211354).getDeclaredField((String) "INTERFACE");
        ((Field) term211353).setAccessible(true);
        Object enum382 = ((Field) term211353).get((Object) null);
        term210503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term210769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term210503, term210503.getClass(), "kind", enum382);
        setField(term210503, term210503.getClass(), "prototype", term210769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term210503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


