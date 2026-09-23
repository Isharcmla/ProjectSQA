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

public class ReferenceCollectingCallback_visit_872273174339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73201;
     Object term73431;
     Object term73385;
     Object term74085;
     Object term74086;
     Object term74087;

    public ReferenceCollectingCallback_visit_872273174339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73201 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term73431 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73431, term73431.getClass(), "type", 108);
        term73385 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term73385, term73385.getClass(), "type", 108);
        setField(term73385, term73385.getClass(), "first", term73431);
        term74085 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term74085, term74085.getClass(), "referenceMap", null);
        setField(term74085, term74085.getClass(), "blockStack", null);
        setField(term74085, term74085.getClass(), "behavior", null);
        setField(term74085, term74085.getClass(), "compiler", null);
        setField(term74085, term74085.getClass(), "varFilter", null);
        term74086 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74086, term74086.getClass(), "number", 0.0);
        setIntField(term74086, term74086.getClass(), "type", 108);
        setField(term74086, term74086.getClass(), "next", null);
        setField(term74086, term74086.getClass(), "first", null);
        setField(term74086, term74086.getClass(), "last", null);
        setField(term74086, term74086.getClass(), "propListHead", null);
        setIntField(term74086, term74086.getClass(), "sourcePosition", 0);
        setField(term74086, term74086.getClass(), "jsType", null);
        setField(term74086, term74086.getClass(), "parent", null);
        term74087 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term74088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term74087, term74087.getClass(), "number", 0.0);
        setIntField(term74087, term74087.getClass(), "type", 108);
        setField(term74087, term74087.getClass(), "next", null);
        setDoubleField(term74088, term74088.getClass(), "number", 0.0);
        setIntField(term74088, term74088.getClass(), "type", 108);
        setField(term74088, term74088.getClass(), "next", null);
        setField(term74088, term74088.getClass(), "first", null);
        setField(term74088, term74088.getClass(), "last", null);
        setField(term74088, term74088.getClass(), "propListHead", null);
        setIntField(term74088, term74088.getClass(), "sourcePosition", 0);
        setField(term74088, term74088.getClass(), "jsType", null);
        setField(term74088, term74088.getClass(), "parent", null);
        setField(term74087, term74087.getClass(), "first", term74088);
        setField(term74087, term74087.getClass(), "last", null);
        setField(term74087, term74087.getClass(), "propListHead", null);
        setIntField(term74087, term74087.getClass(), "sourcePosition", 0);
        setField(term74087, term74087.getClass(), "jsType", null);
        setField(term74087, term74087.getClass(), "parent", null);
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
        args[1] = term73431;
        args[2] = term73385;
        callMethod(klass, "visit", argTypes, term73201, args);
        assertTrue(recursiveEquals(term73201, term74085));
        assertTrue(recursiveEquals(term73431, term74087));
        assertTrue(recursiveEquals(term73385, null));
    }

};


