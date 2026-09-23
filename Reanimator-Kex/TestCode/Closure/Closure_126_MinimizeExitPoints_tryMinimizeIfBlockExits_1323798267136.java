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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35790;
     Object term35860;
     Object term35930;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35790 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term35860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35860, term35860.getClass(), "type", 0);
        setField(term35860, term35860.getClass(), "first", null);
        term35930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36108 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        setField(term35930, term35930.getClass(), "next", term36000);
        setField(term35930, term35930.getClass(), "propListHead", term36108);
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
        args[0] = term35860;
        args[1] = null;
        args[2] = term35930;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term35790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


