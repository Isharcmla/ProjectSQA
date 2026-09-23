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

public class ReferenceCollectingCallback_shouldTraverse_422855684444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113481;
     Object term113573;
     Object term113665;
     Object term113682;
     Object term113683;
     Object term113684;

    public ReferenceCollectingCallback_shouldTraverse_422855684444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113481 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term113573 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term113665 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term113665, term113665.getClass(), "type", 12);
        term113682 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term113682, term113682.getClass(), "referenceMap", null);
        setField(term113682, term113682.getClass(), "blockStack", null);
        setField(term113682, term113682.getClass(), "behavior", null);
        setField(term113682, term113682.getClass(), "compiler", null);
        setField(term113682, term113682.getClass(), "varFilter", null);
        term113683 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term113683, term113683.getClass(), "str", null);
        setIntField(term113683, term113683.getClass(), "type", 12);
        setField(term113683, term113683.getClass(), "next", null);
        setField(term113683, term113683.getClass(), "first", null);
        setField(term113683, term113683.getClass(), "last", null);
        setField(term113683, term113683.getClass(), "propListHead", null);
        setIntField(term113683, term113683.getClass(), "sourcePosition", 0);
        setField(term113683, term113683.getClass(), "jsType", null);
        setField(term113683, term113683.getClass(), "parent", null);
        term113684 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term113684, term113684.getClass(), "number", 0.0);
        setIntField(term113684, term113684.getClass(), "type", 0);
        setField(term113684, term113684.getClass(), "next", null);
        setField(term113684, term113684.getClass(), "first", null);
        setField(term113684, term113684.getClass(), "last", null);
        setField(term113684, term113684.getClass(), "propListHead", null);
        setIntField(term113684, term113684.getClass(), "sourcePosition", 0);
        setField(term113684, term113684.getClass(), "jsType", null);
        setField(term113684, term113684.getClass(), "parent", null);
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
        args[1] = term113573;
        args[2] = term113665;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term113481, args);
        assertTrue(recursiveEquals(term113481, term113682));
        assertTrue(recursiveEquals(term113573, term113684));
        assertTrue(recursiveEquals(term113665, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


