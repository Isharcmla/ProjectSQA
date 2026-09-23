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

public class ReferenceCollectingCallback_visit_872273174290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68555;
     Object term68647;
     Object term68659;
     Object term68660;

    public ReferenceCollectingCallback_visit_872273174290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68555 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term68647 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term68659 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term68659, term68659.getClass(), "referenceMap", null);
        setField(term68659, term68659.getClass(), "blockStack", null);
        setField(term68659, term68659.getClass(), "behavior", null);
        setField(term68659, term68659.getClass(), "compiler", null);
        setField(term68659, term68659.getClass(), "varFilter", null);
        term68660 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term68660, term68660.getClass(), "str", null);
        setIntField(term68660, term68660.getClass(), "type", 0);
        setField(term68660, term68660.getClass(), "next", null);
        setField(term68660, term68660.getClass(), "first", null);
        setField(term68660, term68660.getClass(), "last", null);
        setField(term68660, term68660.getClass(), "propListHead", null);
        setIntField(term68660, term68660.getClass(), "sourcePosition", 0);
        setField(term68660, term68660.getClass(), "jsType", null);
        setField(term68660, term68660.getClass(), "parent", null);
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
        args[1] = term68647;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term68555, args);
        assertTrue(recursiveEquals(term68555, term68659));
        assertTrue(recursiveEquals(term68647, null));
    }

};


