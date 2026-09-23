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

public class ReferenceCollectingCallback_visit_872273174444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118518;
     Object term118748;
     Object term118702;
     Object term119531;
     Object term119532;
     Object term119533;

    public ReferenceCollectingCallback_visit_872273174444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118518 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term118748 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term118748, term118748.getClass(), "type", 98);
        term118702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term118702, term118702.getClass(), "type", 98);
        setField(term118702, term118702.getClass(), "first", term118748);
        term119531 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term119531, term119531.getClass(), "referenceMap", null);
        setField(term119531, term119531.getClass(), "blockStack", null);
        setField(term119531, term119531.getClass(), "behavior", null);
        setField(term119531, term119531.getClass(), "compiler", null);
        setField(term119531, term119531.getClass(), "varFilter", null);
        term119532 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term119532, term119532.getClass(), "str", null);
        setIntField(term119532, term119532.getClass(), "type", 98);
        setField(term119532, term119532.getClass(), "next", null);
        setField(term119532, term119532.getClass(), "first", null);
        setField(term119532, term119532.getClass(), "last", null);
        setField(term119532, term119532.getClass(), "propListHead", null);
        setIntField(term119532, term119532.getClass(), "sourcePosition", 0);
        setField(term119532, term119532.getClass(), "jsType", null);
        setField(term119532, term119532.getClass(), "parent", null);
        term119533 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term119534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term119533, term119533.getClass(), "str", null);
        setIntField(term119533, term119533.getClass(), "type", 98);
        setField(term119533, term119533.getClass(), "next", null);
        setField(term119534, term119534.getClass(), "str", null);
        setIntField(term119534, term119534.getClass(), "type", 98);
        setField(term119534, term119534.getClass(), "next", null);
        setField(term119534, term119534.getClass(), "first", null);
        setField(term119534, term119534.getClass(), "last", null);
        setField(term119534, term119534.getClass(), "propListHead", null);
        setIntField(term119534, term119534.getClass(), "sourcePosition", 0);
        setField(term119534, term119534.getClass(), "jsType", null);
        setField(term119534, term119534.getClass(), "parent", null);
        setField(term119533, term119533.getClass(), "first", term119534);
        setField(term119533, term119533.getClass(), "last", null);
        setField(term119533, term119533.getClass(), "propListHead", null);
        setIntField(term119533, term119533.getClass(), "sourcePosition", 0);
        setField(term119533, term119533.getClass(), "jsType", null);
        setField(term119533, term119533.getClass(), "parent", null);
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
        args[1] = term118748;
        args[2] = term118702;
        callMethod(klass, "visit", argTypes, term118518, args);
        assertTrue(recursiveEquals(term118518, term119531));
        assertTrue(recursiveEquals(term118748, term119533));
        assertTrue(recursiveEquals(term118702, null));
    }

};


