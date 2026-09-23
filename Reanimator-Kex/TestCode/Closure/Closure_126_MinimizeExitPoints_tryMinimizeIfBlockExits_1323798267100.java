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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22636;
     Object term22706;
     Object term22798;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22636 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term22706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22706, term22706.getClass(), "type", 0);
        setField(term22706, term22706.getClass(), "first", null);
        term22798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term22868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22798, term22798.getClass(), "next", term22868);
        setField(term22798, term22798.getClass(), "propListHead", null);
        setIntField(term22798, term22798.getClass(), "sourcePosition", 0);
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
        args[0] = term22706;
        args[1] = null;
        args[2] = term22798;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term22636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


