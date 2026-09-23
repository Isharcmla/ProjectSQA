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

public class NodeUtil_getCount_725644382279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3576;

    public NodeUtil_getCount_725644382279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3576, term3576.getClass(), "type", -179937218);
        setIntField(term3578, term3578.getClass(), "type", 940896043);
        setIntField(term3580, term3580.getClass(), "type", -1156002984);
        setIntField(term3582, term3582.getClass(), "type", 1676254730);
        setIntField(term3584, term3584.getClass(), "type", -1661200819);
        setField(term3584, term3584.getClass(), "next", null);
        setField(term3584, term3584.getClass(), "first", null);
        setField(term3584, term3584.getClass(), "last", null);
        setField(term3584, term3584.getClass(), "propListHead", null);
        setIntField(term3584, term3584.getClass(), "sourcePosition", 0);
        setField(term3584, term3584.getClass(), "jsType", null);
        setField(term3584, term3584.getClass(), "parent", null);
        setField(term3582, term3582.getClass(), "next", term3584);
        setIntField(term3587, term3587.getClass(), "type", -235039141);
        setField(term3587, term3587.getClass(), "next", null);
        setField(term3587, term3587.getClass(), "first", null);
        setField(term3587, term3587.getClass(), "last", term3584);
        setField(term3587, term3587.getClass(), "propListHead", null);
        setIntField(term3587, term3587.getClass(), "sourcePosition", 0);
        setField(term3587, term3587.getClass(), "jsType", null);
        setField(term3587, term3587.getClass(), "parent", null);
        setField(term3582, term3582.getClass(), "first", term3587);
        setField(term3582, term3582.getClass(), "last", term3580);
        setField(term3582, term3582.getClass(), "propListHead", null);
        setIntField(term3582, term3582.getClass(), "sourcePosition", 0);
        setField(term3582, term3582.getClass(), "jsType", null);
        setField(term3582, term3582.getClass(), "parent", null);
        setField(term3580, term3580.getClass(), "next", term3582);
        setField(term3580, term3580.getClass(), "first", term3584);
        setIntField(term3591, term3591.getClass(), "type", -1174440096);
        setIntField(term3593, term3593.getClass(), "type", -679614653);
        setField(term3593, term3593.getClass(), "next", null);
        setField(term3593, term3593.getClass(), "first", term3587);
        setField(term3593, term3593.getClass(), "last", term3582);
        setField(term3593, term3593.getClass(), "propListHead", null);
        setIntField(term3593, term3593.getClass(), "sourcePosition", 0);
        setField(term3593, term3593.getClass(), "jsType", null);
        setField(term3593, term3593.getClass(), "parent", null);
        setField(term3591, term3591.getClass(), "next", term3593);
        setField(term3591, term3591.getClass(), "first", term3578);
        setField(term3591, term3591.getClass(), "last", term3578);
        setField(term3591, term3591.getClass(), "propListHead", null);
        setIntField(term3591, term3591.getClass(), "sourcePosition", 0);
        setField(term3591, term3591.getClass(), "jsType", null);
        setField(term3591, term3591.getClass(), "parent", null);
        setField(term3580, term3580.getClass(), "last", term3591);
        setField(term3580, term3580.getClass(), "propListHead", null);
        setIntField(term3580, term3580.getClass(), "sourcePosition", 0);
        setField(term3580, term3580.getClass(), "jsType", null);
        setField(term3580, term3580.getClass(), "parent", null);
        setField(term3578, term3578.getClass(), "next", term3580);
        setIntField(term3598, term3598.getClass(), "type", -561851867);
        setField(term3598, term3598.getClass(), "next", term3591);
        setField(term3598, term3598.getClass(), "first", term3593);
        setField(term3598, term3598.getClass(), "last", term3576);
        setField(term3598, term3598.getClass(), "propListHead", null);
        setIntField(term3598, term3598.getClass(), "sourcePosition", 0);
        setField(term3598, term3598.getClass(), "jsType", null);
        setField(term3598, term3598.getClass(), "parent", null);
        setField(term3578, term3578.getClass(), "first", term3598);
        setField(term3578, term3578.getClass(), "last", term3598);
        setField(term3578, term3578.getClass(), "propListHead", null);
        setIntField(term3578, term3578.getClass(), "sourcePosition", 0);
        setField(term3578, term3578.getClass(), "jsType", null);
        setField(term3578, term3578.getClass(), "parent", null);
        setField(term3576, term3576.getClass(), "next", term3578);
        setField(term3576, term3576.getClass(), "first", term3582);
        setField(term3576, term3576.getClass(), "last", term3584);
        setField(term3576, term3576.getClass(), "propListHead", null);
        setIntField(term3576, term3576.getClass(), "sourcePosition", 0);
        setField(term3576, term3576.getClass(), "jsType", null);
        setField(term3576, term3576.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3576;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


