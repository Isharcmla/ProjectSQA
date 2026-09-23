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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_getTopMostDefiningType_1569120663257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252499;

    public FunctionType_getTopMostDefiningType_1569120663257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term253361 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term253360 = ((Class) term253361).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term253360).setAccessible(true);
        Object enum459 = ((Field) term253360).get((Object) null);
        term252499 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term252757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term252499, term252499.getClass(), "kind", enum459);
        setField(term252499, term252499.getClass(), "typeOfThis", term252757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term252499, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


