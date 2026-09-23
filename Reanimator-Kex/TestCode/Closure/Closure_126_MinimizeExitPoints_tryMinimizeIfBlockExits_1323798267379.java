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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145030;
     Object term145122;
     Object term145214;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145030 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term145122 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term145122, term145122.getClass(), "type", 0);
        setField(term145122, term145122.getClass(), "first", null);
        term145214 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term145284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term145392 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term145462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145284, term145284.getClass(), "type", 0);
        setField(term145214, term145214.getClass(), "next", term145284);
        setIntField(term145392, term145392.getClass(), "propType", 40);
        setField(term145392, term145392.getClass(), "objectValue", null);
        setField(term145392, term145392.getClass(), "next", null);
        setField(term145214, term145214.getClass(), "propListHead", term145392);
        setIntField(term145214, term145214.getClass(), "sourcePosition", 0);
        setField(term145214, term145214.getClass(), "last", null);
        setField(term145214, term145214.getClass(), "first", null);
        setField(term145214, term145214.getClass(), "parent", term145462);
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
        args[0] = term145122;
        args[1] = null;
        args[2] = term145214;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term145030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


