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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasImplementedInterfaces_1135786392523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485491;

    public FunctionType_hasImplementedInterfaces_1135786392523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term485543 = new ArrayList();
        Class<? extends Object> term487973 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term487972 = ((Class) term487973).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term487972).setAccessible(true);
        Object enum791 = ((Field) term487972).get((Object) null);
        term485491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term485805 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term485491, term485491.getClass(), "implementedInterfaces", term485543);
        setField(term485491, term485491.getClass(), "kind", enum791);
        setField(term485491, term485491.getClass(), "prototypeSlot", term485805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasImplementedInterfaces", argTypes, term485491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


