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

public class ReferenceCollectingCallback_shouldTraverse_422855684802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206442;
     Object term206534;
     Object term206626;
     Object term207171;
     Object term207172;
     Object term207173;

    public ReferenceCollectingCallback_shouldTraverse_422855684802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206442 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term206534 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term206626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term206626, term206626.getClass(), "type", 4);
        term207171 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term207171, term207171.getClass(), "referenceMap", null);
        setField(term207171, term207171.getClass(), "blockStack", null);
        setField(term207171, term207171.getClass(), "behavior", null);
        setField(term207171, term207171.getClass(), "compiler", null);
        setField(term207171, term207171.getClass(), "varFilter", null);
        term207172 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term207172, term207172.getClass(), "str", null);
        setIntField(term207172, term207172.getClass(), "type", 4);
        setField(term207172, term207172.getClass(), "next", null);
        setField(term207172, term207172.getClass(), "first", null);
        setField(term207172, term207172.getClass(), "last", null);
        setField(term207172, term207172.getClass(), "propListHead", null);
        setIntField(term207172, term207172.getClass(), "sourcePosition", 0);
        setField(term207172, term207172.getClass(), "jsType", null);
        setField(term207172, term207172.getClass(), "parent", null);
        term207173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term207173, term207173.getClass(), "str", null);
        setIntField(term207173, term207173.getClass(), "type", 0);
        setField(term207173, term207173.getClass(), "next", null);
        setField(term207173, term207173.getClass(), "first", null);
        setField(term207173, term207173.getClass(), "last", null);
        setField(term207173, term207173.getClass(), "propListHead", null);
        setIntField(term207173, term207173.getClass(), "sourcePosition", 0);
        setField(term207173, term207173.getClass(), "jsType", null);
        setField(term207173, term207173.getClass(), "parent", null);
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
        args[1] = term206534;
        args[2] = term206626;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term206442, args);
        assertTrue(recursiveEquals(term206442, term207171));
        assertTrue(recursiveEquals(term206534, term207173));
        assertTrue(recursiveEquals(term206626, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


