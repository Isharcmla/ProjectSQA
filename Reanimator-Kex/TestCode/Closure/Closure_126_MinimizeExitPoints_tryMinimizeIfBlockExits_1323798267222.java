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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71575;
     Object term71667;
     Object term71759;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71575 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term71667 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term71667, term71667.getClass(), "type", 0);
        setField(term71667, term71667.getClass(), "first", null);
        term71759 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71937 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term71759, term71759.getClass(), "next", term71829);
        setIntField(term71937, term71937.getClass(), "propType", 40);
        setField(term71759, term71759.getClass(), "propListHead", term71937);
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
        args[0] = term71667;
        args[1] = null;
        args[2] = term71759;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term71575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


