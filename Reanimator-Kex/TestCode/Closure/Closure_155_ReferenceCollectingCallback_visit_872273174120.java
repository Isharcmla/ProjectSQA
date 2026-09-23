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

public class ReferenceCollectingCallback_visit_872273174120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24814;
     Object term24906;
     Object term24932;
     Object term24933;

    public ReferenceCollectingCallback_visit_872273174120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24814 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term24906 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term24906, term24906.getClass(), "type", -39);
        term24932 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term24932, term24932.getClass(), "referenceMap", null);
        setField(term24932, term24932.getClass(), "blockStack", null);
        setField(term24932, term24932.getClass(), "behavior", null);
        setField(term24932, term24932.getClass(), "compiler", null);
        setField(term24932, term24932.getClass(), "varFilter", null);
        term24933 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term24933, term24933.getClass(), "str", null);
        setIntField(term24933, term24933.getClass(), "type", -39);
        setField(term24933, term24933.getClass(), "next", null);
        setField(term24933, term24933.getClass(), "first", null);
        setField(term24933, term24933.getClass(), "last", null);
        setField(term24933, term24933.getClass(), "propListHead", null);
        setIntField(term24933, term24933.getClass(), "sourcePosition", 0);
        setField(term24933, term24933.getClass(), "jsType", null);
        setField(term24933, term24933.getClass(), "parent", null);
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
        args[1] = term24906;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term24814, args);
        assertTrue(recursiveEquals(term24814, term24932));
        assertTrue(recursiveEquals(term24906, null));
    }

};


