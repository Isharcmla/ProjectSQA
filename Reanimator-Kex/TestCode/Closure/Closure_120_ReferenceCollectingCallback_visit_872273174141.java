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

public class ReferenceCollectingCallback_visit_872273174141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23615;
     Object term23707;
     Object term23799;
     Object term24348;
     Object term24349;
     Object term24350;

    public ReferenceCollectingCallback_visit_872273174141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23615 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term23707 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term23707, term23707.getClass(), "type", -39);
        term23799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term24348 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term24348, term24348.getClass(), "referenceMap", null);
        setField(term24348, term24348.getClass(), "blockStack", null);
        setField(term24348, term24348.getClass(), "behavior", null);
        setField(term24348, term24348.getClass(), "compiler", null);
        setField(term24348, term24348.getClass(), "varFilter", null);
        term24349 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term24349, term24349.getClass(), "number", 0.0);
        setIntField(term24349, term24349.getClass(), "type", -39);
        setField(term24349, term24349.getClass(), "next", null);
        setField(term24349, term24349.getClass(), "first", null);
        setField(term24349, term24349.getClass(), "last", null);
        setField(term24349, term24349.getClass(), "propListHead", null);
        setIntField(term24349, term24349.getClass(), "sourcePosition", 0);
        setField(term24349, term24349.getClass(), "jsType", null);
        setField(term24349, term24349.getClass(), "parent", null);
        term24350 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term24350, term24350.getClass(), "number", 0.0);
        setIntField(term24350, term24350.getClass(), "type", 0);
        setField(term24350, term24350.getClass(), "next", null);
        setField(term24350, term24350.getClass(), "first", null);
        setField(term24350, term24350.getClass(), "last", null);
        setField(term24350, term24350.getClass(), "propListHead", null);
        setIntField(term24350, term24350.getClass(), "sourcePosition", 0);
        setField(term24350, term24350.getClass(), "jsType", null);
        setField(term24350, term24350.getClass(), "parent", null);
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
        args[1] = term23707;
        args[2] = term23799;
        callMethod(klass, "visit", argTypes, term23615, args);
        assertTrue(recursiveEquals(term23615, term24348));
        assertTrue(recursiveEquals(term23707, term24350));
        assertTrue(recursiveEquals(term23799, null));
    }

};


