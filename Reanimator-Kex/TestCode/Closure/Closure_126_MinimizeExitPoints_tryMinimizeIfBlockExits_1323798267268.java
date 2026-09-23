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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92501;
     Object term92593;
     Object term92685;
     Object term92777;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92501 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term92593 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term92593, term92593.getClass(), "type", 0);
        setField(term92593, term92593.getClass(), "first", null);
        term92685 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term92777 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92955 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term92777, term92777.getClass(), "next", term92847);
        setIntField(term92955, term92955.getClass(), "propType", 0);
        setField(term92955, term92955.getClass(), "next", null);
        setField(term92777, term92777.getClass(), "propListHead", term92955);
        setIntField(term92777, term92777.getClass(), "sourcePosition", 0);
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
        args[0] = term92593;
        args[1] = term92685;
        args[2] = term92777;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term92501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


