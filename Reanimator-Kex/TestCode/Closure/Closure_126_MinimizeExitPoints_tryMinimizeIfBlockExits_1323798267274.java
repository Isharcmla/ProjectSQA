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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94564;
     Object term94976;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94564 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term94976 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term95011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95062 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        Object term95113 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setIntField(term94976, term94976.getClass(), "type", 0);
        setField(term94976, term94976.getClass(), "first", null);
        setField(term94976, term94976.getClass(), "next", term95011);
        setIntField(term95062, term95062.getClass(), "propType", 51);
        setIntField(term95113, term95113.getClass(), "propType", 0);
        setField(term95113, term95113.getClass(), "next", null);
        setField(term95062, term95062.getClass(), "next", term95113);
        setField(term94976, term94976.getClass(), "propListHead", term95062);
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
        args[0] = term94976;
        args[1] = null;
        args[2] = term94976;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term94564, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


