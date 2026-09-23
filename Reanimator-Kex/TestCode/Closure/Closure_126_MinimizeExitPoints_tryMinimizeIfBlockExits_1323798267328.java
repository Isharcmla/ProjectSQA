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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118709;
     Object term118801;
     Object term118893;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118709 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term118801 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term118801, term118801.getClass(), "type", 0);
        setField(term118801, term118801.getClass(), "first", null);
        term118893 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term118963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119071 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term119179 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setIntField(term118963, term118963.getClass(), "type", 105);
        setField(term118893, term118893.getClass(), "next", term118963);
        setIntField(term119071, term119071.getClass(), "propType", 40);
        setField(term119071, term119071.getClass(), "objectValue", null);
        setIntField(term119179, term119179.getClass(), "propType", 0);
        setField(term119179, term119179.getClass(), "next", null);
        setField(term119071, term119071.getClass(), "next", term119179);
        setField(term118893, term118893.getClass(), "propListHead", term119071);
        setIntField(term118893, term118893.getClass(), "sourcePosition", 0);
        setField(term118893, term118893.getClass(), "last", null);
        setField(term118893, term118893.getClass(), "first", null);
        setField(term118893, term118893.getClass(), "parent", null);
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
        args[0] = term118801;
        args[1] = null;
        args[2] = term118893;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term118709, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


