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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87367;
     Object term87437;
     Object term87507;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87367 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term87437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87437, term87437.getClass(), "type", 0);
        setField(term87437, term87437.getClass(), "first", null);
        term87507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87685 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term87793 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term87863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87577, term87577.getClass(), "type", 0);
        setField(term87507, term87507.getClass(), "next", term87577);
        setIntField(term87685, term87685.getClass(), "propType", 8388608);
        setIntField(term87793, term87793.getClass(), "propType", 0);
        setField(term87793, term87793.getClass(), "next", null);
        setField(term87685, term87685.getClass(), "next", term87793);
        setField(term87507, term87507.getClass(), "propListHead", term87685);
        setIntField(term87507, term87507.getClass(), "sourcePosition", 0);
        setField(term87507, term87507.getClass(), "last", null);
        setField(term87507, term87507.getClass(), "first", null);
        setField(term87507, term87507.getClass(), "parent", term87863);
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
        args[0] = term87437;
        args[1] = null;
        args[2] = term87507;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term87367, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


