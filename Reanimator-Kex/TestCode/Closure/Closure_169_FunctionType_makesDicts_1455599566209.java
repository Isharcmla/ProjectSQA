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

public class FunctionType_makesDicts_1455599566209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105627;

    public FunctionType_makesDicts_1455599566209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term227599 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term227598 = ((Class) term227599).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term227598).setAccessible(true);
        Object enum431 = ((Field) term227598).get((Object) null);
        term105627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term105627, term105627.getClass(), "kind", enum431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "makesDicts", argTypes, term105627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


