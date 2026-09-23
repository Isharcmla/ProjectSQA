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

public class ReferenceCollectingCallback_visit_872273174457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123191;
     Object term123421;
     Object term123375;
     Object term123821;
     Object term123822;
     Object term123823;

    public ReferenceCollectingCallback_visit_872273174457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123191 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term123421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term123421, term123421.getClass(), "type", 98);
        term123375 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term123375, term123375.getClass(), "type", 98);
        setField(term123375, term123375.getClass(), "first", term123421);
        term123821 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term123821, term123821.getClass(), "referenceMap", null);
        setField(term123821, term123821.getClass(), "blockStack", null);
        setField(term123821, term123821.getClass(), "behavior", null);
        setField(term123821, term123821.getClass(), "compiler", null);
        setField(term123821, term123821.getClass(), "varFilter", null);
        term123822 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term123822, term123822.getClass(), "number", 0.0);
        setIntField(term123822, term123822.getClass(), "type", 98);
        setField(term123822, term123822.getClass(), "next", null);
        setField(term123822, term123822.getClass(), "first", null);
        setField(term123822, term123822.getClass(), "last", null);
        setField(term123822, term123822.getClass(), "propListHead", null);
        setIntField(term123822, term123822.getClass(), "sourcePosition", 0);
        setField(term123822, term123822.getClass(), "jsType", null);
        setField(term123822, term123822.getClass(), "parent", null);
        term123823 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123824 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term123823, term123823.getClass(), "number", 0.0);
        setIntField(term123823, term123823.getClass(), "type", 98);
        setField(term123823, term123823.getClass(), "next", null);
        setDoubleField(term123824, term123824.getClass(), "number", 0.0);
        setIntField(term123824, term123824.getClass(), "type", 98);
        setField(term123824, term123824.getClass(), "next", null);
        setField(term123824, term123824.getClass(), "first", null);
        setField(term123824, term123824.getClass(), "last", null);
        setField(term123824, term123824.getClass(), "propListHead", null);
        setIntField(term123824, term123824.getClass(), "sourcePosition", 0);
        setField(term123824, term123824.getClass(), "jsType", null);
        setField(term123824, term123824.getClass(), "parent", null);
        setField(term123823, term123823.getClass(), "first", term123824);
        setField(term123823, term123823.getClass(), "last", null);
        setField(term123823, term123823.getClass(), "propListHead", null);
        setIntField(term123823, term123823.getClass(), "sourcePosition", 0);
        setField(term123823, term123823.getClass(), "jsType", null);
        setField(term123823, term123823.getClass(), "parent", null);
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
        args[1] = term123421;
        args[2] = term123375;
        callMethod(klass, "visit", argTypes, term123191, args);
        assertTrue(recursiveEquals(term123191, term123821));
        assertTrue(recursiveEquals(term123421, term123823));
        assertTrue(recursiveEquals(term123375, null));
    }

};


