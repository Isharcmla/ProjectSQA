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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17286;
     Object term17356;
     Object term17601;
     Object term17496;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17286 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term17356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17356, term17356.getClass(), "type", 0);
        setField(term17356, term17356.getClass(), "first", null);
        term17601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17601, term17601.getClass(), "type", 0);
        setField(term17601, term17601.getClass(), "propListHead", null);
        setIntField(term17601, term17601.getClass(), "sourcePosition", 0);
        setField(term17601, term17601.getClass(), "next", null);
        term17496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17496, term17496.getClass(), "next", term17566);
        setField(term17496, term17496.getClass(), "propListHead", null);
        setIntField(term17496, term17496.getClass(), "sourcePosition", 0);
        setField(term17496, term17496.getClass(), "first", term17601);
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
        args[0] = term17356;
        args[1] = term17601;
        args[2] = term17496;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term17286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


