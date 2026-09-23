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

public class NodeUtil_mayBeStringHelper_1019295344385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47612;
     Object term47882;

    public NodeUtil_mayBeStringHelper_1019295344385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47612, term47612.getClass(), "type", 23);
        term47882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47882, term47882.getClass(), "type", 23);
        setField(term47882, term47882.getClass(), "next", null);
        setField(term47882, term47882.getClass(), "first", null);
        setField(term47882, term47882.getClass(), "last", null);
        setField(term47882, term47882.getClass(), "propListHead", null);
        setIntField(term47882, term47882.getClass(), "sourcePosition", 0);
        setField(term47882, term47882.getClass(), "jsType", null);
        setField(term47882, term47882.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47612;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term47612, term47882));
        assertTrue(recursiveEquals(retValue, false));
    }

};


