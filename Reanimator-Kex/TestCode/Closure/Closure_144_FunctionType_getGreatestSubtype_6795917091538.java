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

public class FunctionType_getGreatestSubtype_6795917091538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2247941;
     Object term2248603;

    public FunctionType_getGreatestSubtype_6795917091538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2251606 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2251605 = ((Class) term2251606).getDeclaredField((String) "INTERFACE");
        ((Field) term2251605).setAccessible(true);
        Object enum4016 = ((Field) term2251605).get((Object) null);
        term2247941 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2248493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2247941, term2247941.getClass(), "kind", enum4016);
        setField(term2247941, term2247941.getClass(), "typeOfThis", term2248493);
        term2248603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2248935 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2248603, term2248603.getClass(), "kind", enum4016);
        setField(term2248603, term2248603.getClass(), "typeOfThis", term2248935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2248603;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2247941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


