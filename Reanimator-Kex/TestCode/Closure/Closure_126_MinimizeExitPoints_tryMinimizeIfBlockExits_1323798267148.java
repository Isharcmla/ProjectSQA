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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42315;
     Object term42764;
     Object term42729;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42315 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term42764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42850 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term42901 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term42764, term42764.getClass(), "type", 4);
        setField(term42764, term42764.getClass(), "first", null);
        setField(term42764, term42764.getClass(), "next", term42799);
        setIntField(term42850, term42850.getClass(), "propType", 0);
        setIntField(term42901, term42901.getClass(), "propType", 0);
        setField(term42901, term42901.getClass(), "next", null);
        setField(term42850, term42850.getClass(), "next", term42901);
        setField(term42764, term42764.getClass(), "propListHead", term42850);
        setIntField(term42764, term42764.getClass(), "sourcePosition", 0);
        term42729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
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
        args[0] = term42764;
        args[1] = term42729;
        args[2] = term42764;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term42315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


