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

public class MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93946;
     Object term94038;
     Object term94130;

    public MinimizeExitPoints_tryMinimizeIfBlockExits_1323798267273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93946 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term94038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term94038, term94038.getClass(), "type", 0);
        setField(term94038, term94038.getClass(), "first", null);
        term94130 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term94222 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term94330 = newInstance(Class.forName("com.google.javascript.rhino.Node$ObjectPropListItem"));
        Object term94400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94222, term94222.getClass(), "type", 105);
        setField(term94130, term94130.getClass(), "next", term94222);
        setIntField(term94330, term94330.getClass(), "propType", 40);
        setField(term94330, term94330.getClass(), "objectValue", null);
        setField(term94330, term94330.getClass(), "next", null);
        setField(term94130, term94130.getClass(), "propListHead", term94330);
        setIntField(term94130, term94130.getClass(), "sourcePosition", 0);
        setField(term94130, term94130.getClass(), "last", null);
        setField(term94130, term94130.getClass(), "first", null);
        setField(term94130, term94130.getClass(), "parent", term94400);
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
        args[0] = term94038;
        args[1] = null;
        args[2] = term94130;
        args[3] = 0;
        args[4] = null;
        try {
            callMethod(klass, "tryMinimizeIfBlockExits", argTypes, term93946, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


