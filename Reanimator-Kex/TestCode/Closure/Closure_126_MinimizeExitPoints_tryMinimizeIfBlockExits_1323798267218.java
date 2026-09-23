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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70013;
     Object term70105;
     Object term70197;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70013 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term70105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term70105, term70105.getClass(), "type", 0);
        setField(term70105, term70105.getClass(), "first", null);
        term70197 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term70267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70369 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term70197, term70197.getClass(), "next", term70267);
        setIntField(term70369, term70369.getClass(), "propType", 0);
        setField(term70369, term70369.getClass(), "next", null);
        setField(term70197, term70197.getClass(), "propListHead", term70369);
        setIntField(term70197, term70197.getClass(), "sourcePosition", 0);
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
        args[0] = term70105;
        args[1] = null;
        args[2] = term70197;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term70013, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


