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

public class FunctionType_supAndInfHelper_1915298734471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433113;
     Object term433465;

    public FunctionType_supAndInfHelper_1915298734471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434219 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term434218 = ((Class) term434219).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term434218).setAccessible(true);
        Object enum712 = ((Field) term434218).get((Object) null);
        term433113 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term433365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term433113, term433113.getClass(), "unknown", false);
        setField(term433113, term433113.getClass(), "kind", enum712);
        setField(term433113, term433113.getClass(), "registry", term433365);
        term433465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term433465, term433465.getClass(), "unknown", false);
        setField(term433465, term433465.getClass(), "kind", enum712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term433465;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term433113, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


