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

public class ReferenceCollectingCallback_shouldTraverse_4228556841016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258276;
     Object term258368;
     Object term258460;
     Object term258748;
     Object term258749;
     Object term258750;

    public ReferenceCollectingCallback_shouldTraverse_4228556841016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258276 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term258368 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term258460 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term258460, term258460.getClass(), "type", 12);
        term258748 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term258748, term258748.getClass(), "referenceMap", null);
        setField(term258748, term258748.getClass(), "blockStack", null);
        setField(term258748, term258748.getClass(), "behavior", null);
        setField(term258748, term258748.getClass(), "compiler", null);
        setField(term258748, term258748.getClass(), "varFilter", null);
        term258749 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term258749, term258749.getClass(), "number", 0.0);
        setIntField(term258749, term258749.getClass(), "type", 12);
        setField(term258749, term258749.getClass(), "next", null);
        setField(term258749, term258749.getClass(), "first", null);
        setField(term258749, term258749.getClass(), "last", null);
        setField(term258749, term258749.getClass(), "propListHead", null);
        setIntField(term258749, term258749.getClass(), "sourcePosition", 0);
        setField(term258749, term258749.getClass(), "jsType", null);
        setField(term258749, term258749.getClass(), "parent", null);
        term258750 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258750, term258750.getClass(), "str", null);
        setIntField(term258750, term258750.getClass(), "type", 0);
        setField(term258750, term258750.getClass(), "next", null);
        setField(term258750, term258750.getClass(), "first", null);
        setField(term258750, term258750.getClass(), "last", null);
        setField(term258750, term258750.getClass(), "propListHead", null);
        setIntField(term258750, term258750.getClass(), "sourcePosition", 0);
        setField(term258750, term258750.getClass(), "jsType", null);
        setField(term258750, term258750.getClass(), "parent", null);
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
        args[1] = term258368;
        args[2] = term258460;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term258276, args);
        assertTrue(recursiveEquals(term258276, term258748));
        assertTrue(recursiveEquals(term258368, term258750));
        assertTrue(recursiveEquals(term258460, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


