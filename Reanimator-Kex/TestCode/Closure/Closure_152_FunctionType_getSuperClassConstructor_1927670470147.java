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

public class FunctionType_getSuperClassConstructor_1927670470147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73730;

    public FunctionType_getSuperClassConstructor_1927670470147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term74746 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term74745 = ((Class) term74746).getDeclaredField((String) "ORDINARY");
        ((Field) term74745).setAccessible(true);
        Object enum174 = ((Field) term74745).get((Object) null);
        term73730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term73730, term73730.getClass(), "kind", enum174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSuperClassConstructor", argTypes, term73730, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


