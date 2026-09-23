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

public class ReferenceCollectingCallback_visit_872273174246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59365;
     Object term59457;
     Object term59549;
     Object term59587;
     Object term59588;
     Object term59589;

    public ReferenceCollectingCallback_visit_872273174246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59365 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term59457 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term59457, term59457.getClass(), "type", -39);
        term59549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term59587 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term59587, term59587.getClass(), "referenceMap", null);
        setField(term59587, term59587.getClass(), "blockStack", null);
        setField(term59587, term59587.getClass(), "behavior", null);
        setField(term59587, term59587.getClass(), "compiler", null);
        setField(term59587, term59587.getClass(), "varFilter", null);
        term59588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term59588, term59588.getClass(), "str", null);
        setIntField(term59588, term59588.getClass(), "type", -39);
        setField(term59588, term59588.getClass(), "next", null);
        setField(term59588, term59588.getClass(), "first", null);
        setField(term59588, term59588.getClass(), "last", null);
        setField(term59588, term59588.getClass(), "propListHead", null);
        setIntField(term59588, term59588.getClass(), "sourcePosition", 0);
        setField(term59588, term59588.getClass(), "jsType", null);
        setField(term59588, term59588.getClass(), "parent", null);
        term59589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term59589, term59589.getClass(), "number", 0.0);
        setIntField(term59589, term59589.getClass(), "type", 0);
        setField(term59589, term59589.getClass(), "next", null);
        setField(term59589, term59589.getClass(), "first", null);
        setField(term59589, term59589.getClass(), "last", null);
        setField(term59589, term59589.getClass(), "propListHead", null);
        setIntField(term59589, term59589.getClass(), "sourcePosition", 0);
        setField(term59589, term59589.getClass(), "jsType", null);
        setField(term59589, term59589.getClass(), "parent", null);
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
        args[1] = term59457;
        args[2] = term59549;
        callMethod(klass, "visit", argTypes, term59365, args);
        assertTrue(recursiveEquals(term59365, term59587));
        assertTrue(recursiveEquals(term59457, term59589));
        assertTrue(recursiveEquals(term59549, null));
    }

};


