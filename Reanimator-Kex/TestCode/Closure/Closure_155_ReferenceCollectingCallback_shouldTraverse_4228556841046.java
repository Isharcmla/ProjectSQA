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

public class ReferenceCollectingCallback_shouldTraverse_4228556841046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267085;
     Object term267177;
     Object term267269;
     Object term267287;
     Object term267288;
     Object term267289;

    public ReferenceCollectingCallback_shouldTraverse_4228556841046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267085 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term267177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term267269 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term267269, term267269.getClass(), "type", 12);
        term267287 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term267287, term267287.getClass(), "referenceMap", null);
        setField(term267287, term267287.getClass(), "blockStack", null);
        setField(term267287, term267287.getClass(), "behavior", null);
        setField(term267287, term267287.getClass(), "compiler", null);
        setField(term267287, term267287.getClass(), "varFilter", null);
        term267288 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term267288, term267288.getClass(), "str", null);
        setIntField(term267288, term267288.getClass(), "type", 12);
        setField(term267288, term267288.getClass(), "next", null);
        setField(term267288, term267288.getClass(), "first", null);
        setField(term267288, term267288.getClass(), "last", null);
        setField(term267288, term267288.getClass(), "propListHead", null);
        setIntField(term267288, term267288.getClass(), "sourcePosition", 0);
        setField(term267288, term267288.getClass(), "jsType", null);
        setField(term267288, term267288.getClass(), "parent", null);
        term267289 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term267289, term267289.getClass(), "number", 0.0);
        setIntField(term267289, term267289.getClass(), "type", 0);
        setField(term267289, term267289.getClass(), "next", null);
        setField(term267289, term267289.getClass(), "first", null);
        setField(term267289, term267289.getClass(), "last", null);
        setField(term267289, term267289.getClass(), "propListHead", null);
        setIntField(term267289, term267289.getClass(), "sourcePosition", 0);
        setField(term267289, term267289.getClass(), "jsType", null);
        setField(term267289, term267289.getClass(), "parent", null);
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
        args[1] = term267177;
        args[2] = term267269;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term267085, args);
        assertTrue(recursiveEquals(term267085, term267287));
        assertTrue(recursiveEquals(term267177, term267289));
        assertTrue(recursiveEquals(term267269, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


