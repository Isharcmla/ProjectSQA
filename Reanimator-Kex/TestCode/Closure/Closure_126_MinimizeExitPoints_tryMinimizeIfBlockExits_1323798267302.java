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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109215;
     Object term109307;
     Object term109377;
     Object term109469;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109215 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term109307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term109307, term109307.getClass(), "type", 0);
        setField(term109307, term109307.getClass(), "first", null);
        term109377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term109469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term109539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109647 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term109755 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term109469, term109469.getClass(), "next", term109539);
        setIntField(term109647, term109647.getClass(), "propType", 40);
        setField(term109647, term109647.getClass(), "objectValue", null);
        setIntField(term109755, term109755.getClass(), "propType", 0);
        setField(term109755, term109755.getClass(), "next", null);
        setField(term109647, term109647.getClass(), "next", term109755);
        setField(term109469, term109469.getClass(), "propListHead", term109647);
        setIntField(term109469, term109469.getClass(), "sourcePosition", 0);
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
        args[0] = term109307;
        args[1] = term109377;
        args[2] = term109469;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term109215, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


