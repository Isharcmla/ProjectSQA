package com.google.javascript.jscomp;

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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47116;
     Object term47186;
     Object term47256;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47116 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term47186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47186, term47186.getClass(), "type", 4);
        setField(term47186, term47186.getClass(), "first", null);
        term47256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47428 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term47530 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term47256, term47256.getClass(), "next", term47326);
        setIntField(term47428, term47428.getClass(), "propType", 51);
        setIntField(term47530, term47530.getClass(), "propType", -41);
        setField(term47530, term47530.getClass(), "next", null);
        setField(term47428, term47428.getClass(), "next", term47530);
        setField(term47256, term47256.getClass(), "propListHead", term47428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term47186;
        args[1] = null;
        args[2] = term47256;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term47116, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


