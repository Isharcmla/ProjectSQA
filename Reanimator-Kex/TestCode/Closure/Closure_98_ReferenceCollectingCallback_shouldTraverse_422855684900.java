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

public class ReferenceCollectingCallback_shouldTraverse_422855684900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241322;
     Object term241414;
     Object term241506;
     Object term241619;
     Object term241620;
     Object term241621;

    public ReferenceCollectingCallback_shouldTraverse_422855684900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241322 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term241414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term241506 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term241506, term241506.getClass(), "type", 4);
        term241619 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term241619, term241619.getClass(), "referenceMap", null);
        setField(term241619, term241619.getClass(), "blockStack", null);
        setField(term241619, term241619.getClass(), "behavior", null);
        setField(term241619, term241619.getClass(), "compiler", null);
        setField(term241619, term241619.getClass(), "varFilter", null);
        term241620 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241620, term241620.getClass(), "str", null);
        setIntField(term241620, term241620.getClass(), "type", 4);
        setField(term241620, term241620.getClass(), "next", null);
        setField(term241620, term241620.getClass(), "first", null);
        setField(term241620, term241620.getClass(), "last", null);
        setField(term241620, term241620.getClass(), "propListHead", null);
        setIntField(term241620, term241620.getClass(), "sourcePosition", 0);
        setField(term241620, term241620.getClass(), "jsType", null);
        setField(term241620, term241620.getClass(), "parent", null);
        term241621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term241621, term241621.getClass(), "str", null);
        setIntField(term241621, term241621.getClass(), "type", 0);
        setField(term241621, term241621.getClass(), "next", null);
        setField(term241621, term241621.getClass(), "first", null);
        setField(term241621, term241621.getClass(), "last", null);
        setField(term241621, term241621.getClass(), "propListHead", null);
        setIntField(term241621, term241621.getClass(), "sourcePosition", 0);
        setField(term241621, term241621.getClass(), "jsType", null);
        setField(term241621, term241621.getClass(), "parent", null);
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
        args[1] = term241414;
        args[2] = term241506;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term241322, args);
        assertTrue(recursiveEquals(term241322, term241619));
        assertTrue(recursiveEquals(term241414, term241621));
        assertTrue(recursiveEquals(term241506, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


