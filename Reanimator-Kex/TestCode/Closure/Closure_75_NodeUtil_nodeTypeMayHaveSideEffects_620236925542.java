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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class NodeUtil_nodeTypeMayHaveSideEffects_620236925542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42098;
     Object term81407;

    public NodeUtil_nodeTypeMayHaveSideEffects_620236925542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42098, term42098.getClass(), "type", 88);
        term81407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81407, term81407.getClass(), "type", 88);
        setField(term81407, term81407.getClass(), "next", null);
        setField(term81407, term81407.getClass(), "first", null);
        setField(term81407, term81407.getClass(), "last", null);
        setField(term81407, term81407.getClass(), "propListHead", null);
        setIntField(term81407, term81407.getClass(), "sourcePosition", 0);
        setField(term81407, term81407.getClass(), "jsType", null);
        setField(term81407, term81407.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42098;
        callMethod(klass, "nodeTypeMayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term42098, term81407));
    }

};


