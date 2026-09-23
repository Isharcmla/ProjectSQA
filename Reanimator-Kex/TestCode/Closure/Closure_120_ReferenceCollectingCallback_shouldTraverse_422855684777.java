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

public class ReferenceCollectingCallback_shouldTraverse_422855684777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289379;
     Object term289525;
     Object term290096;
     Object term290100;

    public ReferenceCollectingCallback_shouldTraverse_422855684777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term289433 = new ArrayDeque();
        term289379 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term289379, term289379.getClass(), "blockStack", term289433);
        term289525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term289525, term289525.getClass(), "type", 111);
        ArrayDeque term290097 = new ArrayDeque();
        term290096 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term290096, term290096.getClass(), "referenceMap", null);
        setField(term290096, term290096.getClass(), "blockStack", term290097);
        setField(term290096, term290096.getClass(), "behavior", null);
        setField(term290096, term290096.getClass(), "compiler", null);
        setField(term290096, term290096.getClass(), "varFilter", null);
        term290100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term290100, term290100.getClass(), "str", null);
        setIntField(term290100, term290100.getClass(), "type", 111);
        setField(term290100, term290100.getClass(), "next", null);
        setField(term290100, term290100.getClass(), "first", null);
        setField(term290100, term290100.getClass(), "last", null);
        setField(term290100, term290100.getClass(), "propListHead", null);
        setIntField(term290100, term290100.getClass(), "sourcePosition", 0);
        setField(term290100, term290100.getClass(), "jsType", null);
        setField(term290100, term290100.getClass(), "parent", null);
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
        args[1] = term289525;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term289379, args);
        assertTrue(recursiveEquals(term289379, term290096));
        assertTrue(recursiveEquals(term289525, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


