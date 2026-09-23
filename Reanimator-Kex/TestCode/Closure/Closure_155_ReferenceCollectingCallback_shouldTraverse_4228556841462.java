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

public class ReferenceCollectingCallback_shouldTraverse_4228556841462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431485;
     Object term431631;
     Object term431723;
     Object term431837;
     Object term431841;
     Object term431842;

    public ReferenceCollectingCallback_shouldTraverse_4228556841462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term431539 = new ArrayDeque();
        term431485 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term431485, term431485.getClass(), "blockStack", term431539);
        term431631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431631, term431631.getClass(), "type", 111);
        term431723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term431723, term431723.getClass(), "type", 111);
        ArrayDeque term431838 = new ArrayDeque();
        term431837 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term431837, term431837.getClass(), "referenceMap", null);
        setField(term431837, term431837.getClass(), "blockStack", term431838);
        setField(term431837, term431837.getClass(), "behavior", null);
        setField(term431837, term431837.getClass(), "compiler", null);
        setField(term431837, term431837.getClass(), "varFilter", null);
        term431841 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term431841, term431841.getClass(), "str", null);
        setIntField(term431841, term431841.getClass(), "type", 111);
        setField(term431841, term431841.getClass(), "next", null);
        setField(term431841, term431841.getClass(), "first", null);
        setField(term431841, term431841.getClass(), "last", null);
        setField(term431841, term431841.getClass(), "propListHead", null);
        setIntField(term431841, term431841.getClass(), "sourcePosition", 0);
        setField(term431841, term431841.getClass(), "jsType", null);
        setField(term431841, term431841.getClass(), "parent", null);
        term431842 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term431842, term431842.getClass(), "str", null);
        setIntField(term431842, term431842.getClass(), "type", 111);
        setField(term431842, term431842.getClass(), "next", null);
        setField(term431842, term431842.getClass(), "first", null);
        setField(term431842, term431842.getClass(), "last", null);
        setField(term431842, term431842.getClass(), "propListHead", null);
        setIntField(term431842, term431842.getClass(), "sourcePosition", 0);
        setField(term431842, term431842.getClass(), "jsType", null);
        setField(term431842, term431842.getClass(), "parent", null);
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
        args[1] = term431631;
        args[2] = term431723;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term431485, args);
        assertTrue(recursiveEquals(term431485, term431837));
        assertTrue(recursiveEquals(term431631, term431842));
        assertTrue(recursiveEquals(term431723, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


