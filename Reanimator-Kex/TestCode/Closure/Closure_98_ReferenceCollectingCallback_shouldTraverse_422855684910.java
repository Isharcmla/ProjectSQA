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
import java.util.ArrayDeque;

public class ReferenceCollectingCallback_shouldTraverse_422855684910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244095;
     Object term244219;
     Object term244289;
     Object term244661;
     Object term244665;
     Object term244666;

    public ReferenceCollectingCallback_shouldTraverse_422855684910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term244149 = new ArrayDeque();
        term244095 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term244095, term244095.getClass(), "blockStack", term244149);
        term244219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term244219, term244219.getClass(), "type", 111);
        term244289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term244289, term244289.getClass(), "type", 111);
        ArrayDeque term244662 = new ArrayDeque();
        term244661 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term244661, term244661.getClass(), "referenceMap", null);
        setField(term244661, term244661.getClass(), "blockStack", term244662);
        setField(term244661, term244661.getClass(), "behavior", null);
        setField(term244661, term244661.getClass(), "compiler", null);
        setField(term244661, term244661.getClass(), "varFilter", null);
        term244665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term244665, term244665.getClass(), "type", 111);
        setField(term244665, term244665.getClass(), "next", null);
        setField(term244665, term244665.getClass(), "first", null);
        setField(term244665, term244665.getClass(), "last", null);
        setField(term244665, term244665.getClass(), "propListHead", null);
        setIntField(term244665, term244665.getClass(), "sourcePosition", 0);
        setField(term244665, term244665.getClass(), "jsType", null);
        setField(term244665, term244665.getClass(), "parent", null);
        term244666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term244666, term244666.getClass(), "type", 111);
        setField(term244666, term244666.getClass(), "next", null);
        setField(term244666, term244666.getClass(), "first", null);
        setField(term244666, term244666.getClass(), "last", null);
        setField(term244666, term244666.getClass(), "propListHead", null);
        setIntField(term244666, term244666.getClass(), "sourcePosition", 0);
        setField(term244666, term244666.getClass(), "jsType", null);
        setField(term244666, term244666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term244219;
        args[2] = term244289;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term244095, args);
        assertTrue(recursiveEquals(term244095, term244661));
        assertTrue(recursiveEquals(term244219, term244666));
        assertTrue(recursiveEquals(term244289, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


