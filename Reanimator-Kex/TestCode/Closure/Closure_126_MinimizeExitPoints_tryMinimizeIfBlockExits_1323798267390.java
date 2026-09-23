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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149973;
     Object term150043;
     Object term150113;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149973 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term150043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term150043, term150043.getClass(), "type", 4);
        setField(term150043, term150043.getClass(), "first", null);
        term150113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150285 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term150387 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term150489 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term150113, term150113.getClass(), "next", term150183);
        setIntField(term150285, term150285.getClass(), "propType", 0);
        setIntField(term150387, term150387.getClass(), "propType", 0);
        setIntField(term150489, term150489.getClass(), "propType", 40);
        setField(term150387, term150387.getClass(), "next", term150489);
        setField(term150285, term150285.getClass(), "next", term150387);
        setField(term150113, term150113.getClass(), "propListHead", term150285);
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
        args[0] = term150043;
        args[1] = null;
        args[2] = term150113;
        args[3] = 4;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term149973, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


