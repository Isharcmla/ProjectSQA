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

public class FunctionType_isEquivalentTo_230708275291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180580;
     Object term180946;

    public FunctionType_isEquivalentTo_230708275291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182134 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term182133 = ((Class) term182134).getDeclaredField((String) "ORDINARY");
        ((Field) term182133).setAccessible(true);
        Object enum332 = ((Field) term182133).get((Object) null);
        term180580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term180836 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term180580, term180580.getClass(), "kind", enum332);
        setField(term180580, term180580.getClass(), "typeOfThis", term180836);
        Class<? extends Object> term182425 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term182424 = ((Class) term182425).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term182424).setAccessible(true);
        Object enum333 = ((Field) term182424).get((Object) null);
        term180946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term181202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term180946, term180946.getClass(), "kind", enum333);
        setField(term180946, term180946.getClass(), "typeOfThis", term181202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term180946;
        try {
            callMethod(klass, "isEquivalentTo", argTypes, term180580, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


