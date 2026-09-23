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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100266;
     Object term100336;
     Object term100406;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100266 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term100336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100336, term100336.getClass(), "type", 4);
        setField(term100336, term100336.getClass(), "first", null);
        term100406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100578 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term100680 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term100782 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term100852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term100476, term100476.getClass(), "type", 105);
        setField(term100406, term100406.getClass(), "next", term100476);
        setIntField(term100578, term100578.getClass(), "propType", 128);
        setIntField(term100680, term100680.getClass(), "propType", 4194304);
        setIntField(term100782, term100782.getClass(), "propType", 0);
        setField(term100782, term100782.getClass(), "next", null);
        setField(term100680, term100680.getClass(), "next", term100782);
        setField(term100578, term100578.getClass(), "next", term100680);
        setField(term100406, term100406.getClass(), "propListHead", term100578);
        setIntField(term100406, term100406.getClass(), "sourcePosition", 0);
        setField(term100406, term100406.getClass(), "last", null);
        setField(term100406, term100406.getClass(), "first", null);
        setField(term100406, term100406.getClass(), "parent", term100852);
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
        args[0] = term100336;
        args[1] = null;
        args[2] = term100406;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term100266, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


