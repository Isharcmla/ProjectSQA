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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68442;
     Object term68512;
     Object term68582;
     Object term68652;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68442 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term68512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68512, term68512.getClass(), "type", 4);
        setField(term68512, term68512.getClass(), "first", null);
        term68582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term68652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68824 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term68926 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term69028 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term68652, term68652.getClass(), "next", term68722);
        setIntField(term68824, term68824.getClass(), "propType", 360251069);
        setIntField(term68926, term68926.getClass(), "propType", -360251070);
        setIntField(term69028, term69028.getClass(), "propType", 33882114);
        setField(term69028, term69028.getClass(), "next", null);
        setField(term68926, term68926.getClass(), "next", term69028);
        setField(term68824, term68824.getClass(), "next", term68926);
        setField(term68652, term68652.getClass(), "propListHead", term68824);
        setIntField(term68652, term68652.getClass(), "sourcePosition", 0);
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
        args[0] = term68512;
        args[1] = term68582;
        args[2] = term68652;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term68442, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


