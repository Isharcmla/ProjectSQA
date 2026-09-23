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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103222;
     Object term103292;
     Object term103818;
     Object term103476;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103222 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term103292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103292, term103292.getClass(), "type", 0);
        setField(term103292, term103292.getClass(), "first", null);
        term103818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term103818, term103818.getClass(), "type", 0);
        setField(term103818, term103818.getClass(), "propListHead", null);
        setIntField(term103818, term103818.getClass(), "sourcePosition", 0);
        setField(term103818, term103818.getClass(), "next", null);
        term103476 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term103568 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term103670 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term103772 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term103476, term103476.getClass(), "next", term103568);
        setIntField(term103670, term103670.getClass(), "propType", 16777216);
        setIntField(term103772, term103772.getClass(), "propType", 0);
        setField(term103772, term103772.getClass(), "next", null);
        setField(term103670, term103670.getClass(), "next", term103772);
        setField(term103476, term103476.getClass(), "propListHead", term103670);
        setIntField(term103476, term103476.getClass(), "sourcePosition", 0);
        setField(term103476, term103476.getClass(), "first", term103818);
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
        args[0] = term103292;
        args[1] = term103818;
        args[2] = term103476;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term103222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


