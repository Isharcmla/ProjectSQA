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

public class NodeUtil_mayBeStringHelper_1019295344511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44673;
     Object term51933;

    public NodeUtil_mayBeStringHelper_1019295344511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44673, term44673.getClass(), "type", 34);
        term51933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51933, term51933.getClass(), "type", 34);
        setField(term51933, term51933.getClass(), "next", null);
        setField(term51933, term51933.getClass(), "first", null);
        setField(term51933, term51933.getClass(), "last", null);
        setField(term51933, term51933.getClass(), "propListHead", null);
        setIntField(term51933, term51933.getClass(), "sourcePosition", 0);
        setField(term51933, term51933.getClass(), "jsType", null);
        setField(term51933, term51933.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term44673;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term44673, term51933));
        assertTrue(recursiveEquals(retValue, true));
    }

};


