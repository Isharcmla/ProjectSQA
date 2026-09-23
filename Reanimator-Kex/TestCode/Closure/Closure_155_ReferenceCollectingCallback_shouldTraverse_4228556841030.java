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

public class ReferenceCollectingCallback_shouldTraverse_4228556841030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262221;
     Object term262367;
     Object term263456;
     Object term263460;

    public ReferenceCollectingCallback_shouldTraverse_4228556841030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term262275 = new ArrayDeque();
        term262221 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term262221, term262221.getClass(), "blockStack", term262275);
        term262367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term262367, term262367.getClass(), "type", 111);
        ArrayDeque term263457 = new ArrayDeque();
        term263456 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term263456, term263456.getClass(), "referenceMap", null);
        setField(term263456, term263456.getClass(), "blockStack", term263457);
        setField(term263456, term263456.getClass(), "behavior", null);
        setField(term263456, term263456.getClass(), "compiler", null);
        setField(term263456, term263456.getClass(), "varFilter", null);
        term263460 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term263460, term263460.getClass(), "str", null);
        setIntField(term263460, term263460.getClass(), "type", 111);
        setField(term263460, term263460.getClass(), "next", null);
        setField(term263460, term263460.getClass(), "first", null);
        setField(term263460, term263460.getClass(), "last", null);
        setField(term263460, term263460.getClass(), "propListHead", null);
        setIntField(term263460, term263460.getClass(), "sourcePosition", 0);
        setField(term263460, term263460.getClass(), "jsType", null);
        setField(term263460, term263460.getClass(), "parent", null);
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
        args[1] = term262367;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term262221, args);
        assertTrue(recursiveEquals(term262221, term263456));
        assertTrue(recursiveEquals(term262367, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


