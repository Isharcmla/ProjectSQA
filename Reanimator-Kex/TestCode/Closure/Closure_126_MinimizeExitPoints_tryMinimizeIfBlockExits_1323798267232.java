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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76714;
     Object term76784;
     Object term76854;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76714 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term76784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76784, term76784.getClass(), "type", 0);
        setField(term76784, term76784.getClass(), "first", null);
        term76854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77032 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term76854, term76854.getClass(), "next", term76924);
        setIntField(term77032, term77032.getClass(), "propType", 40);
        setField(term76854, term76854.getClass(), "propListHead", term77032);
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
        args[0] = term76784;
        args[1] = null;
        args[2] = term76854;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term76714, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


