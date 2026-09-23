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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105530;
     Object term105600;
     Object term105670;
     Object term105740;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105530 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term105600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105600, term105600.getClass(), "type", 4);
        setField(term105600, term105600.getClass(), "first", null);
        term105670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term105740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105912 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term106014 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term106116 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term106218 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term105740, term105740.getClass(), "next", term105810);
        setIntField(term105912, term105912.getClass(), "propType", 1336553600);
        setIntField(term106014, term106014.getClass(), "propType", 2085667027);
        setIntField(term106116, term106116.getClass(), "propType", -1336611028);
        setIntField(term106218, term106218.getClass(), "propType", 1201676288);
        setField(term106218, term106218.getClass(), "next", null);
        setField(term106116, term106116.getClass(), "next", term106218);
        setField(term106014, term106014.getClass(), "next", term106116);
        setField(term105912, term105912.getClass(), "next", term106014);
        setField(term105740, term105740.getClass(), "propListHead", term105912);
        setIntField(term105740, term105740.getClass(), "sourcePosition", 0);
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
        args[0] = term105600;
        args[1] = term105670;
        args[2] = term105740;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term105530, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


