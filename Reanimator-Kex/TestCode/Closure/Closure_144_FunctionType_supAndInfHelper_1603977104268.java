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

public class FunctionType_supAndInfHelper_1603977104268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153769;
     Object term154027;

    public FunctionType_supAndInfHelper_1603977104268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156532 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term156531 = ((Class) term156532).getDeclaredField((String) "INTERFACE");
        ((Field) term156531).setAccessible(true);
        Object enum303 = ((Field) term156531).get((Object) null);
        term153769 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term153769, term153769.getClass(), "kind", enum303);
        Class<? extends Object> term156826 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term156825 = ((Class) term156826).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term156825).setAccessible(true);
        Object enum304 = ((Field) term156825).get((Object) null);
        term154027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term154027, term154027.getClass(), "kind", enum304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term154027;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term153769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


