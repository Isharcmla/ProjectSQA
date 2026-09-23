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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127973;
     Object term128043;
     Object term128113;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127973 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term128043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128043, term128043.getClass(), "type", 0);
        setField(term128043, term128043.getClass(), "first", null);
        term128113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128291 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term128361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128183, term128183.getClass(), "type", 105);
        setField(term128113, term128113.getClass(), "next", term128183);
        setIntField(term128291, term128291.getClass(), "propType", 40);
        setField(term128291, term128291.getClass(), "objectValue", null);
        setField(term128291, term128291.getClass(), "next", null);
        setField(term128113, term128113.getClass(), "propListHead", term128291);
        setIntField(term128113, term128113.getClass(), "sourcePosition", 0);
        setField(term128113, term128113.getClass(), "last", null);
        setField(term128113, term128113.getClass(), "first", term128361);
        setField(term128113, term128113.getClass(), "parent", null);
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
        args[0] = term128043;
        args[1] = null;
        args[2] = term128113;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term127973, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


