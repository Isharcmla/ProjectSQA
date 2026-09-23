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

public class ReferenceCollectingCallback_isBlockBoundary_684698721927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236639;
     Object term236731;
     Object term236743;
     Object term236744;

    public ReferenceCollectingCallback_isBlockBoundary_684698721927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236639 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term236639, term236639.getClass(), "type", 111);
        term236731 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term236731, term236731.getClass(), "type", 12);
        term236743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term236743, term236743.getClass(), "str", null);
        setIntField(term236743, term236743.getClass(), "type", 12);
        setField(term236743, term236743.getClass(), "next", null);
        setField(term236743, term236743.getClass(), "first", null);
        setField(term236743, term236743.getClass(), "last", null);
        setField(term236743, term236743.getClass(), "propListHead", null);
        setIntField(term236743, term236743.getClass(), "sourcePosition", 0);
        setField(term236743, term236743.getClass(), "jsType", null);
        setField(term236743, term236743.getClass(), "parent", null);
        term236744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term236744, term236744.getClass(), "str", null);
        setIntField(term236744, term236744.getClass(), "type", 111);
        setField(term236744, term236744.getClass(), "next", null);
        setField(term236744, term236744.getClass(), "first", null);
        setField(term236744, term236744.getClass(), "last", null);
        setField(term236744, term236744.getClass(), "propListHead", null);
        setIntField(term236744, term236744.getClass(), "sourcePosition", 0);
        setField(term236744, term236744.getClass(), "jsType", null);
        setField(term236744, term236744.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term236639;
        args[1] = term236731;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term236639, term236743));
        assertTrue(recursiveEquals(term236731, term236744));
        assertTrue(recursiveEquals(retValue, true));
    }

};


