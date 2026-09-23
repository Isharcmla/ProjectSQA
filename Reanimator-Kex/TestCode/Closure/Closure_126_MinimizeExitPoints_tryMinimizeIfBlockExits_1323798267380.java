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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145638;
     Object term145708;
     Object term145778;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145638 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term145708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145708, term145708.getClass(), "type", 0);
        setField(term145708, term145708.getClass(), "first", null);
        term145778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145956 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term146026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145848, term145848.getClass(), "type", 105);
        setField(term145778, term145778.getClass(), "next", term145848);
        setIntField(term145956, term145956.getClass(), "propType", 51);
        setField(term145956, term145956.getClass(), "next", null);
        setField(term145956, term145956.getClass(), "objectValue", null);
        setField(term145778, term145778.getClass(), "propListHead", term145956);
        setIntField(term145778, term145778.getClass(), "sourcePosition", 0);
        setField(term145778, term145778.getClass(), "last", null);
        setField(term145778, term145778.getClass(), "first", term146026);
        setField(term145778, term145778.getClass(), "parent", null);
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
        args[0] = term145708;
        args[1] = null;
        args[2] = term145778;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term145638, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


