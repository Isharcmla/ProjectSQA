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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75747;
     Object term75839;
     Object term75931;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75747 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term75839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term75839, term75839.getClass(), "type", 0);
        setField(term75839, term75839.getClass(), "first", null);
        term75931 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term76125 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term76195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76023, term76023.getClass(), "type", 0);
        setField(term75931, term75931.getClass(), "next", term76023);
        setIntField(term76125, term76125.getClass(), "propType", 0);
        setField(term76125, term76125.getClass(), "next", null);
        setField(term75931, term75931.getClass(), "propListHead", term76125);
        setIntField(term75931, term75931.getClass(), "sourcePosition", 0);
        setField(term75931, term75931.getClass(), "last", null);
        setField(term75931, term75931.getClass(), "first", null);
        setField(term75931, term75931.getClass(), "parent", term76195);
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
        args[0] = term75839;
        args[1] = null;
        args[2] = term75931;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term75747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


