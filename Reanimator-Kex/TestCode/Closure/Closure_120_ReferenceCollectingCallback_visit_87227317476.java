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

public class ReferenceCollectingCallback_visit_87227317476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9366;
     Object term9471;
     Object term9722;
     Object term9723;
     Object term9724;

    public ReferenceCollectingCallback_visit_87227317476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9366 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term9471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9471, term9471.getClass(), "type", -39);
        term9722 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term9722, term9722.getClass(), "referenceMap", null);
        setField(term9722, term9722.getClass(), "blockStack", null);
        setField(term9722, term9722.getClass(), "behavior", null);
        setField(term9722, term9722.getClass(), "compiler", null);
        setField(term9722, term9722.getClass(), "varFilter", null);
        term9723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9723, term9723.getClass(), "type", -39);
        setField(term9723, term9723.getClass(), "next", null);
        setField(term9723, term9723.getClass(), "first", null);
        setField(term9723, term9723.getClass(), "last", null);
        setField(term9723, term9723.getClass(), "propListHead", null);
        setIntField(term9723, term9723.getClass(), "sourcePosition", 0);
        setField(term9723, term9723.getClass(), "jsType", null);
        setField(term9723, term9723.getClass(), "parent", null);
        term9724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9724, term9724.getClass(), "type", -39);
        setField(term9724, term9724.getClass(), "next", null);
        setField(term9724, term9724.getClass(), "first", null);
        setField(term9724, term9724.getClass(), "last", null);
        setField(term9724, term9724.getClass(), "propListHead", null);
        setIntField(term9724, term9724.getClass(), "sourcePosition", 0);
        setField(term9724, term9724.getClass(), "jsType", null);
        setField(term9724, term9724.getClass(), "parent", null);
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
        args[1] = term9471;
        args[2] = term9471;
        callMethod(klass, "visit", argTypes, term9366, args);
        assertTrue(recursiveEquals(term9366, term9722));
        assertTrue(recursiveEquals(term9471, term9724));
        assertTrue(recursiveEquals(term9471, null));
    }

};


