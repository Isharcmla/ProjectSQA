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

public class ReferenceCollectingCallback_visit_872273174450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115469;
     Object term115561;
     Object term115653;
     Object term116103;
     Object term116104;
     Object term116105;

    public ReferenceCollectingCallback_visit_872273174450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115469 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term115561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term115561, term115561.getClass(), "type", -39);
        term115653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term116103 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term116103, term116103.getClass(), "referenceMap", null);
        setField(term116103, term116103.getClass(), "blockStack", null);
        setField(term116103, term116103.getClass(), "behavior", null);
        setField(term116103, term116103.getClass(), "compiler", null);
        setField(term116103, term116103.getClass(), "varFilter", null);
        term116104 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term116104, term116104.getClass(), "number", 0.0);
        setIntField(term116104, term116104.getClass(), "type", -39);
        setField(term116104, term116104.getClass(), "next", null);
        setField(term116104, term116104.getClass(), "first", null);
        setField(term116104, term116104.getClass(), "last", null);
        setField(term116104, term116104.getClass(), "propListHead", null);
        setIntField(term116104, term116104.getClass(), "sourcePosition", 0);
        setField(term116104, term116104.getClass(), "jsType", null);
        setField(term116104, term116104.getClass(), "parent", null);
        term116105 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term116105, term116105.getClass(), "number", 0.0);
        setIntField(term116105, term116105.getClass(), "type", 0);
        setField(term116105, term116105.getClass(), "next", null);
        setField(term116105, term116105.getClass(), "first", null);
        setField(term116105, term116105.getClass(), "last", null);
        setField(term116105, term116105.getClass(), "propListHead", null);
        setIntField(term116105, term116105.getClass(), "sourcePosition", 0);
        setField(term116105, term116105.getClass(), "jsType", null);
        setField(term116105, term116105.getClass(), "parent", null);
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
        args[1] = term115561;
        args[2] = term115653;
        callMethod(klass, "visit", argTypes, term115469, args);
        assertTrue(recursiveEquals(term115469, term116103));
        assertTrue(recursiveEquals(term115561, term116105));
        assertTrue(recursiveEquals(term115653, null));
    }

};


