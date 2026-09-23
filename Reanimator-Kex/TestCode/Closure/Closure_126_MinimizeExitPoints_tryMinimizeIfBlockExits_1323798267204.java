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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65562;
     Object term65632;
     Object term65702;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65562 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term65632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65632, term65632.getClass(), "type", 4);
        setField(term65632, term65632.getClass(), "first", null);
        term65702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65874 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term65976 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term66078 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term66148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65772, term65772.getClass(), "type", 0);
        setField(term65702, term65702.getClass(), "next", term65772);
        setIntField(term65874, term65874.getClass(), "propType", 32);
        setIntField(term65976, term65976.getClass(), "propType", 4194304);
        setIntField(term66078, term66078.getClass(), "propType", 0);
        setField(term66078, term66078.getClass(), "next", null);
        setField(term65976, term65976.getClass(), "next", term66078);
        setField(term65874, term65874.getClass(), "next", term65976);
        setField(term65702, term65702.getClass(), "propListHead", term65874);
        setIntField(term65702, term65702.getClass(), "sourcePosition", 0);
        setField(term65702, term65702.getClass(), "last", null);
        setField(term65702, term65702.getClass(), "first", null);
        setField(term65702, term65702.getClass(), "parent", term66148);
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
        args[0] = term65632;
        args[1] = null;
        args[2] = term65702;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term65562, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


