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

public class NodeUtil_mayBeString_2061010946451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66652;
     Object term68246;

    public NodeUtil_mayBeString_2061010946451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66652, term66652.getClass(), "type", 50);
        term68246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68246, term68246.getClass(), "type", 50);
        setField(term68246, term68246.getClass(), "next", null);
        setField(term68246, term68246.getClass(), "first", null);
        setField(term68246, term68246.getClass(), "last", null);
        setField(term68246, term68246.getClass(), "propListHead", null);
        setIntField(term68246, term68246.getClass(), "sourcePosition", 0);
        setField(term68246, term68246.getClass(), "jsType", null);
        setField(term68246, term68246.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term66652;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term66652, term68246));
    }

};


