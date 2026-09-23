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

public class FunctionType_getTopMostDefiningType_1667499519353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249184;

    public FunctionType_getTopMostDefiningType_1667499519353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250042 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term250041 = ((Class) term250042).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term250041).setAccessible(true);
        Object enum466 = ((Field) term250041).get((Object) null);
        term249184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term249450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term249184, term249184.getClass(), "kind", enum466);
        setField(term249184, term249184.getClass(), "prototype", term249450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getTopMostDefiningType", argTypes, term249184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


