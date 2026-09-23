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

public class NodeUtil_evaluatesToLocalValue_1770162587294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4036;

    public NodeUtil_evaluatesToLocalValue_1770162587294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4036, term4036.getClass(), "type", -1603460382);
        setIntField(term4038, term4038.getClass(), "type", -298939768);
        setIntField(term4040, term4040.getClass(), "type", -767031634);
        setIntField(term4042, term4042.getClass(), "type", -2072469750);
        setIntField(term4044, term4044.getClass(), "type", 2106616847);
        setField(term4044, term4044.getClass(), "next", null);
        setField(term4044, term4044.getClass(), "first", null);
        setField(term4044, term4044.getClass(), "last", null);
        setField(term4044, term4044.getClass(), "propListHead", null);
        setIntField(term4044, term4044.getClass(), "sourcePosition", 0);
        setField(term4044, term4044.getClass(), "jsType", null);
        setField(term4044, term4044.getClass(), "parent", null);
        setField(term4042, term4042.getClass(), "next", term4044);
        setIntField(term4047, term4047.getClass(), "type", 403107947);
        setField(term4047, term4047.getClass(), "next", null);
        setField(term4047, term4047.getClass(), "first", null);
        setField(term4047, term4047.getClass(), "last", term4044);
        setField(term4047, term4047.getClass(), "propListHead", null);
        setIntField(term4047, term4047.getClass(), "sourcePosition", 0);
        setField(term4047, term4047.getClass(), "jsType", null);
        setField(term4047, term4047.getClass(), "parent", null);
        setField(term4042, term4042.getClass(), "first", term4047);
        setField(term4042, term4042.getClass(), "last", term4040);
        setField(term4042, term4042.getClass(), "propListHead", null);
        setIntField(term4042, term4042.getClass(), "sourcePosition", 0);
        setField(term4042, term4042.getClass(), "jsType", null);
        setField(term4042, term4042.getClass(), "parent", null);
        setField(term4040, term4040.getClass(), "next", term4042);
        setField(term4040, term4040.getClass(), "first", term4044);
        setIntField(term4051, term4051.getClass(), "type", -1445089135);
        setIntField(term4053, term4053.getClass(), "type", -291618851);
        setField(term4053, term4053.getClass(), "next", null);
        setField(term4053, term4053.getClass(), "first", term4047);
        setField(term4053, term4053.getClass(), "last", term4042);
        setField(term4053, term4053.getClass(), "propListHead", null);
        setIntField(term4053, term4053.getClass(), "sourcePosition", 0);
        setField(term4053, term4053.getClass(), "jsType", null);
        setField(term4053, term4053.getClass(), "parent", null);
        setField(term4051, term4051.getClass(), "next", term4053);
        setField(term4051, term4051.getClass(), "first", term4038);
        setField(term4051, term4051.getClass(), "last", term4038);
        setField(term4051, term4051.getClass(), "propListHead", null);
        setIntField(term4051, term4051.getClass(), "sourcePosition", 0);
        setField(term4051, term4051.getClass(), "jsType", null);
        setField(term4051, term4051.getClass(), "parent", null);
        setField(term4040, term4040.getClass(), "last", term4051);
        setField(term4040, term4040.getClass(), "propListHead", null);
        setIntField(term4040, term4040.getClass(), "sourcePosition", 0);
        setField(term4040, term4040.getClass(), "jsType", null);
        setField(term4040, term4040.getClass(), "parent", null);
        setField(term4038, term4038.getClass(), "next", term4040);
        setIntField(term4058, term4058.getClass(), "type", -378436487);
        setField(term4058, term4058.getClass(), "next", term4051);
        setField(term4058, term4058.getClass(), "first", term4053);
        setField(term4058, term4058.getClass(), "last", term4036);
        setField(term4058, term4058.getClass(), "propListHead", null);
        setIntField(term4058, term4058.getClass(), "sourcePosition", 0);
        setField(term4058, term4058.getClass(), "jsType", null);
        setField(term4058, term4058.getClass(), "parent", null);
        setField(term4038, term4038.getClass(), "first", term4058);
        setField(term4038, term4038.getClass(), "last", term4058);
        setField(term4038, term4038.getClass(), "propListHead", null);
        setIntField(term4038, term4038.getClass(), "sourcePosition", 0);
        setField(term4038, term4038.getClass(), "jsType", null);
        setField(term4038, term4038.getClass(), "parent", null);
        setField(term4036, term4036.getClass(), "next", term4038);
        setField(term4036, term4036.getClass(), "first", term4042);
        setField(term4036, term4036.getClass(), "last", term4044);
        setField(term4036, term4036.getClass(), "propListHead", null);
        setIntField(term4036, term4036.getClass(), "sourcePosition", 0);
        setField(term4036, term4036.getClass(), "jsType", null);
        setField(term4036, term4036.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term4036;
        args[1] = null;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


