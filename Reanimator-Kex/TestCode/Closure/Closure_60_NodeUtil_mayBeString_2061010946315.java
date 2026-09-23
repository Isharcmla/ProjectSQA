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

public class NodeUtil_mayBeString_2061010946315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26441;
     Object term26482;

    public NodeUtil_mayBeString_2061010946315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26441, term26441.getClass(), "type", 31);
        term26482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26482, term26482.getClass(), "type", 31);
        setField(term26482, term26482.getClass(), "next", null);
        setField(term26482, term26482.getClass(), "first", null);
        setField(term26482, term26482.getClass(), "last", null);
        setField(term26482, term26482.getClass(), "propListHead", null);
        setIntField(term26482, term26482.getClass(), "sourcePosition", 0);
        setField(term26482, term26482.getClass(), "jsType", null);
        setField(term26482, term26482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26441;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term26441, term26482));
    }

};


