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

public class ReferenceCollectingCallback_shouldTraverse_422855684788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209741;
     Object term209833;
     Object term209925;
     Object term210618;
     Object term210619;
     Object term210620;

    public ReferenceCollectingCallback_shouldTraverse_422855684788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209741 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term209833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term209925 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term209925, term209925.getClass(), "type", 12);
        term210618 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term210618, term210618.getClass(), "referenceMap", null);
        setField(term210618, term210618.getClass(), "blockStack", null);
        setField(term210618, term210618.getClass(), "behavior", null);
        setField(term210618, term210618.getClass(), "compiler", null);
        setField(term210618, term210618.getClass(), "varFilter", null);
        term210619 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term210619, term210619.getClass(), "number", 0.0);
        setIntField(term210619, term210619.getClass(), "type", 12);
        setField(term210619, term210619.getClass(), "next", null);
        setField(term210619, term210619.getClass(), "first", null);
        setField(term210619, term210619.getClass(), "last", null);
        setField(term210619, term210619.getClass(), "propListHead", null);
        setIntField(term210619, term210619.getClass(), "sourcePosition", 0);
        setField(term210619, term210619.getClass(), "jsType", null);
        setField(term210619, term210619.getClass(), "parent", null);
        term210620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term210620, term210620.getClass(), "str", null);
        setIntField(term210620, term210620.getClass(), "type", 0);
        setField(term210620, term210620.getClass(), "next", null);
        setField(term210620, term210620.getClass(), "first", null);
        setField(term210620, term210620.getClass(), "last", null);
        setField(term210620, term210620.getClass(), "propListHead", null);
        setIntField(term210620, term210620.getClass(), "sourcePosition", 0);
        setField(term210620, term210620.getClass(), "jsType", null);
        setField(term210620, term210620.getClass(), "parent", null);
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
        args[1] = term209833;
        args[2] = term209925;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term209741, args);
        assertTrue(recursiveEquals(term209741, term210618));
        assertTrue(recursiveEquals(term209833, term210620));
        assertTrue(recursiveEquals(term209925, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


