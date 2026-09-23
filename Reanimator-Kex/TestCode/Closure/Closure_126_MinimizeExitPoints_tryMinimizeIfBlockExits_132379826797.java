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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_132379826797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20864;
     Object term20969;
     Object term21039;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_132379826797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20864 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term20969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20969, term20969.getClass(), "type", 4);
        setField(term20969, term20969.getClass(), "first", null);
        term21039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21211 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term21039, term21039.getClass(), "next", term21109);
        setIntField(term21211, term21211.getClass(), "propType", 0);
        setField(term21211, term21211.getClass(), "next", null);
        setField(term21039, term21039.getClass(), "propListHead", term21211);
        setIntField(term21039, term21039.getClass(), "sourcePosition", 0);
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
        args[0] = term20969;
        args[1] = term20969;
        args[2] = term21039;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term20864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


