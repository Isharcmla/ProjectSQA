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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123767;
     Object term123837;
     Object term123907;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123767 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term123837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123837, term123837.getClass(), "type", 4);
        setField(term123837, term123837.getClass(), "first", null);
        term123907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123977, term123977.getClass(), "type", 105);
        setField(term123907, term123907.getClass(), "next", term123977);
        setField(term123907, term123907.getClass(), "propListHead", null);
        setIntField(term123907, term123907.getClass(), "sourcePosition", 0);
        setField(term123907, term123907.getClass(), "last", null);
        setField(term123907, term123907.getClass(), "first", null);
        setField(term123907, term123907.getClass(), "parent", null);
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
        args[0] = term123837;
        args[1] = null;
        args[2] = term123907;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term123767, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


