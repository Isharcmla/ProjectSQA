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

public class ReferenceCollectingCallback_shouldTraverse_422855684886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227488;
     Object term227634;
     Object term227726;
     Object term227763;
     Object term227767;
     Object term227768;

    public ReferenceCollectingCallback_shouldTraverse_422855684886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term227542 = new ArrayDeque();
        term227488 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term227488, term227488.getClass(), "blockStack", term227542);
        term227634 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term227634, term227634.getClass(), "type", 111);
        term227726 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term227726, term227726.getClass(), "type", 111);
        ArrayDeque term227764 = new ArrayDeque();
        term227763 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term227763, term227763.getClass(), "referenceMap", null);
        setField(term227763, term227763.getClass(), "blockStack", term227764);
        setField(term227763, term227763.getClass(), "behavior", null);
        setField(term227763, term227763.getClass(), "compiler", null);
        setField(term227763, term227763.getClass(), "varFilter", null);
        term227767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term227767, term227767.getClass(), "number", 0.0);
        setIntField(term227767, term227767.getClass(), "type", 111);
        setField(term227767, term227767.getClass(), "next", null);
        setField(term227767, term227767.getClass(), "first", null);
        setField(term227767, term227767.getClass(), "last", null);
        setField(term227767, term227767.getClass(), "propListHead", null);
        setIntField(term227767, term227767.getClass(), "sourcePosition", 0);
        setField(term227767, term227767.getClass(), "jsType", null);
        setField(term227767, term227767.getClass(), "parent", null);
        term227768 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term227768, term227768.getClass(), "number", 0.0);
        setIntField(term227768, term227768.getClass(), "type", 111);
        setField(term227768, term227768.getClass(), "next", null);
        setField(term227768, term227768.getClass(), "first", null);
        setField(term227768, term227768.getClass(), "last", null);
        setField(term227768, term227768.getClass(), "propListHead", null);
        setIntField(term227768, term227768.getClass(), "sourcePosition", 0);
        setField(term227768, term227768.getClass(), "jsType", null);
        setField(term227768, term227768.getClass(), "parent", null);
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
        args[1] = term227634;
        args[2] = term227726;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term227488, args);
        assertTrue(recursiveEquals(term227488, term227763));
        assertTrue(recursiveEquals(term227634, term227768));
        assertTrue(recursiveEquals(term227726, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


