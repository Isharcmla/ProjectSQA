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

public class ReferenceCollectingCallback_shouldTraverse_42285568467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11068;
     Object term11138;
     Object term11428;
     Object term11429;

    public ReferenceCollectingCallback_shouldTraverse_42285568467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11068 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term11138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11138, term11138.getClass(), "type", 98);
        term11428 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term11428, term11428.getClass(), "referenceMap", null);
        setField(term11428, term11428.getClass(), "blockStack", null);
        setField(term11428, term11428.getClass(), "behavior", null);
        setField(term11428, term11428.getClass(), "compiler", null);
        setField(term11428, term11428.getClass(), "varFilter", null);
        term11429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11429, term11429.getClass(), "type", 98);
        setField(term11429, term11429.getClass(), "next", null);
        setField(term11429, term11429.getClass(), "first", null);
        setField(term11429, term11429.getClass(), "last", null);
        setField(term11429, term11429.getClass(), "propListHead", null);
        setIntField(term11429, term11429.getClass(), "sourcePosition", 0);
        setField(term11429, term11429.getClass(), "jsType", null);
        setField(term11429, term11429.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term11138;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term11068, args);
        assertTrue(recursiveEquals(term11068, term11428));
        assertTrue(recursiveEquals(term11138, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


