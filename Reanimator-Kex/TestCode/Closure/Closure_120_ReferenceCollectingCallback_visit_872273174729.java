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

public class ReferenceCollectingCallback_visit_872273174729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258517;
     Object term258747;
     Object term258701;
     Object term258769;
     Object term258770;
     Object term258771;

    public ReferenceCollectingCallback_visit_872273174729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258517 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term258747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term258747, term258747.getClass(), "type", 108);
        term258701 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term258701, term258701.getClass(), "type", 108);
        setField(term258701, term258701.getClass(), "first", term258747);
        term258769 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258769, term258769.getClass(), "referenceMap", null);
        setField(term258769, term258769.getClass(), "blockStack", null);
        setField(term258769, term258769.getClass(), "behavior", null);
        setField(term258769, term258769.getClass(), "compiler", null);
        setField(term258769, term258769.getClass(), "varFilter", null);
        term258770 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term258770, term258770.getClass(), "number", 0.0);
        setIntField(term258770, term258770.getClass(), "type", 108);
        setField(term258770, term258770.getClass(), "next", null);
        setField(term258770, term258770.getClass(), "first", null);
        setField(term258770, term258770.getClass(), "last", null);
        setField(term258770, term258770.getClass(), "propListHead", null);
        setIntField(term258770, term258770.getClass(), "sourcePosition", 0);
        setField(term258770, term258770.getClass(), "jsType", null);
        setField(term258770, term258770.getClass(), "parent", null);
        term258771 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term258772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term258771, term258771.getClass(), "str", null);
        setIntField(term258771, term258771.getClass(), "type", 108);
        setField(term258771, term258771.getClass(), "next", null);
        setDoubleField(term258772, term258772.getClass(), "number", 0.0);
        setIntField(term258772, term258772.getClass(), "type", 108);
        setField(term258772, term258772.getClass(), "next", null);
        setField(term258772, term258772.getClass(), "first", null);
        setField(term258772, term258772.getClass(), "last", null);
        setField(term258772, term258772.getClass(), "propListHead", null);
        setIntField(term258772, term258772.getClass(), "sourcePosition", 0);
        setField(term258772, term258772.getClass(), "jsType", null);
        setField(term258772, term258772.getClass(), "parent", null);
        setField(term258771, term258771.getClass(), "first", term258772);
        setField(term258771, term258771.getClass(), "last", null);
        setField(term258771, term258771.getClass(), "propListHead", null);
        setIntField(term258771, term258771.getClass(), "sourcePosition", 0);
        setField(term258771, term258771.getClass(), "jsType", null);
        setField(term258771, term258771.getClass(), "parent", null);
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
        args[1] = term258747;
        args[2] = term258701;
        callMethod(klass, "visit", argTypes, term258517, args);
        assertTrue(recursiveEquals(term258517, term258769));
        assertTrue(recursiveEquals(term258747, term258771));
        assertTrue(recursiveEquals(term258701, null));
    }

};


