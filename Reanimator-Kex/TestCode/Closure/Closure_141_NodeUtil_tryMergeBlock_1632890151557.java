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
import java.lang.Object;

public class NodeUtil_tryMergeBlock_1632890151557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48207;
     Object term48303;

    public NodeUtil_tryMergeBlock_1632890151557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48207, term48207.getClass(), "type", 125);
        setField(term48207, term48207.getClass(), "parent", term48277);
        term48303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48303, term48303.getClass(), "type", 125);
        setField(term48303, term48303.getClass(), "next", null);
        setField(term48303, term48303.getClass(), "first", null);
        setField(term48303, term48303.getClass(), "last", null);
        setField(term48303, term48303.getClass(), "propListHead", null);
        setIntField(term48303, term48303.getClass(), "sourcePosition", 0);
        setField(term48303, term48303.getClass(), "jsType", null);
        setIntField(term48304, term48304.getClass(), "type", 0);
        setField(term48304, term48304.getClass(), "next", null);
        setField(term48304, term48304.getClass(), "first", null);
        setField(term48304, term48304.getClass(), "last", null);
        setField(term48304, term48304.getClass(), "propListHead", null);
        setIntField(term48304, term48304.getClass(), "sourcePosition", 0);
        setField(term48304, term48304.getClass(), "jsType", null);
        setField(term48304, term48304.getClass(), "parent", null);
        setField(term48303, term48303.getClass(), "parent", term48304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48207;
        Object retValue = callMethod(klass, "tryMergeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term48207, term48303));
        assertTrue(recursiveEquals(retValue, false));
    }

};


