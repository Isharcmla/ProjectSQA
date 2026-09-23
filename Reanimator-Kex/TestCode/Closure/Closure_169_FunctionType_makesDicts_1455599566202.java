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

public class FunctionType_makesDicts_1455599566202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102931;

    public FunctionType_makesDicts_1455599566202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term224520 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term224519 = ((Class) term224520).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term224519).setAccessible(true);
        Object enum425 = ((Field) term224519).get((Object) null);
        Class<? extends Object> term224820 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term224819 = ((Class) term224820).getDeclaredField((String) "ANY");
        ((Field) term224819).setAccessible(true);
        Object enum426 = ((Field) term224819).get((Object) null);
        term102931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term102931, term102931.getClass(), "kind", enum425);
        setField(term102931, term102931.getClass(), "propAccess", enum426);
        setField(term102931, term102931.getClass(), "prototypeSlot", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesDicts", argTypes, term102931, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


