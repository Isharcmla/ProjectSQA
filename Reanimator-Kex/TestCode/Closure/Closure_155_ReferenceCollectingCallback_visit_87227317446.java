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

public class ReferenceCollectingCallback_visit_87227317446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6503;
     Object term6595;
     Object term6687;
     Object term6795;
     Object term6796;
     Object term6797;

    public ReferenceCollectingCallback_visit_87227317446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6503 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term6595 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term6595, term6595.getClass(), "type", -39);
        term6687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term6795 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term6795, term6795.getClass(), "referenceMap", null);
        setField(term6795, term6795.getClass(), "blockStack", null);
        setField(term6795, term6795.getClass(), "behavior", null);
        setField(term6795, term6795.getClass(), "compiler", null);
        setField(term6795, term6795.getClass(), "varFilter", null);
        term6796 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6796, term6796.getClass(), "number", 0.0);
        setIntField(term6796, term6796.getClass(), "type", -39);
        setField(term6796, term6796.getClass(), "next", null);
        setField(term6796, term6796.getClass(), "first", null);
        setField(term6796, term6796.getClass(), "last", null);
        setField(term6796, term6796.getClass(), "propListHead", null);
        setIntField(term6796, term6796.getClass(), "sourcePosition", 0);
        setField(term6796, term6796.getClass(), "jsType", null);
        setField(term6796, term6796.getClass(), "parent", null);
        term6797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term6797, term6797.getClass(), "number", 0.0);
        setIntField(term6797, term6797.getClass(), "type", 0);
        setField(term6797, term6797.getClass(), "next", null);
        setField(term6797, term6797.getClass(), "first", null);
        setField(term6797, term6797.getClass(), "last", null);
        setField(term6797, term6797.getClass(), "propListHead", null);
        setIntField(term6797, term6797.getClass(), "sourcePosition", 0);
        setField(term6797, term6797.getClass(), "jsType", null);
        setField(term6797, term6797.getClass(), "parent", null);
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
        args[1] = term6595;
        args[2] = term6687;
        callMethod(klass, "visit", argTypes, term6503, args);
        assertTrue(recursiveEquals(term6503, term6795));
        assertTrue(recursiveEquals(term6595, term6797));
        assertTrue(recursiveEquals(term6687, null));
    }

};


