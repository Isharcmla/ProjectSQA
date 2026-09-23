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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79124;
     Object term79194;
     Object term79264;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79124 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term79194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79194, term79194.getClass(), "type", 4);
        setField(term79194, term79194.getClass(), "first", null);
        term79264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79436 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term79538 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term79640 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term79742 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term79264, term79264.getClass(), "next", term79334);
        setIntField(term79436, term79436.getClass(), "propType", 0);
        setIntField(term79538, term79538.getClass(), "propType", 0);
        setIntField(term79640, term79640.getClass(), "propType", 0);
        setField(term79640, term79640.getClass(), "next", term79742);
        setField(term79538, term79538.getClass(), "next", term79640);
        setField(term79436, term79436.getClass(), "next", term79538);
        setField(term79264, term79264.getClass(), "propListHead", term79436);
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
        args[0] = term79194;
        args[1] = null;
        args[2] = term79264;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term79124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


