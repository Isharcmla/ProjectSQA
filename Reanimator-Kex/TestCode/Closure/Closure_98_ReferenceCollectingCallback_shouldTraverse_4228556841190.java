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

public class ReferenceCollectingCallback_shouldTraverse_4228556841190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352491;
     Object term352583;
     Object term352807;
     Object term352808;

    public ReferenceCollectingCallback_shouldTraverse_4228556841190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352491 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term352583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term352807 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term352807, term352807.getClass(), "referenceMap", null);
        setField(term352807, term352807.getClass(), "blockStack", null);
        setField(term352807, term352807.getClass(), "behavior", null);
        setField(term352807, term352807.getClass(), "compiler", null);
        setField(term352807, term352807.getClass(), "varFilter", null);
        term352808 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term352808, term352808.getClass(), "number", 0.0);
        setIntField(term352808, term352808.getClass(), "type", 0);
        setField(term352808, term352808.getClass(), "next", null);
        setField(term352808, term352808.getClass(), "first", null);
        setField(term352808, term352808.getClass(), "last", null);
        setField(term352808, term352808.getClass(), "propListHead", null);
        setIntField(term352808, term352808.getClass(), "sourcePosition", 0);
        setField(term352808, term352808.getClass(), "jsType", null);
        setField(term352808, term352808.getClass(), "parent", null);
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
        args[1] = term352583;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term352491, args);
        assertTrue(recursiveEquals(term352491, term352807));
        assertTrue(recursiveEquals(term352583, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


