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

public class FunctionType_getGreatestSubtype_679591709566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521381;
     Object term521749;

    public FunctionType_getGreatestSubtype_679591709566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term524566 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term524565 = ((Class) term524566).getDeclaredField((String) "ORDINARY");
        ((Field) term524565).setAccessible(true);
        Object enum956 = ((Field) term524565).get((Object) null);
        term521381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term521639 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term521381, term521381.getClass(), "kind", enum956);
        setField(term521639, term521639.getClass(), "kind", enum956);
        setField(term521639, term521639.getClass(), "typeOfThis", term521639);
        setField(term521381, term521381.getClass(), "typeOfThis", term521639);
        Class<? extends Object> term524857 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term524856 = ((Class) term524857).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term524856).setAccessible(true);
        Object enum957 = ((Field) term524856).get((Object) null);
        term521749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term521997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term521749, term521749.getClass(), "kind", enum957);
        setField(term521997, term521997.getClass(), "kind", enum957);
        setField(term521997, term521997.getClass(), "typeOfThis", null);
        setField(term521749, term521749.getClass(), "typeOfThis", term521997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term521749;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term521381, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


