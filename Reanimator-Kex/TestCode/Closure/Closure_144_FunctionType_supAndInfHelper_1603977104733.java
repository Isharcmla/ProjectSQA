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

public class FunctionType_supAndInfHelper_1603977104733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797424;
     Object term797786;

    public FunctionType_supAndInfHelper_1603977104733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term798863 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term798862 = ((Class) term798863).getDeclaredField((String) "ORDINARY");
        ((Field) term798862).setAccessible(true);
        Object enum1437 = ((Field) term798862).get((Object) null);
        term797424 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term797676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term797424, term797424.getClass(), "kind", enum1437);
        setField(term797424, term797424.getClass(), "registry", term797676);
        Class<? extends Object> term799154 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term799153 = ((Class) term799154).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term799153).setAccessible(true);
        Object enum1438 = ((Field) term799153).get((Object) null);
        term797786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term797786, term797786.getClass(), "kind", enum1438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term797786;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term797424, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


