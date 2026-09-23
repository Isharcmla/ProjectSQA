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
import java.lang.Object;

public class ReferenceCollectingCallback_visit_872273174715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189916;
     Object term190146;
     Object term190100;
     Object term190624;
     Object term190625;
     Object term190626;

    public ReferenceCollectingCallback_visit_872273174715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189916 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term190146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term190146, term190146.getClass(), "type", 0);
        term190100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term190100, term190100.getClass(), "type", 108);
        setField(term190100, term190100.getClass(), "first", term190146);
        term190624 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term190624, term190624.getClass(), "referenceMap", null);
        setField(term190624, term190624.getClass(), "blockStack", null);
        setField(term190624, term190624.getClass(), "behavior", null);
        setField(term190624, term190624.getClass(), "compiler", null);
        setField(term190624, term190624.getClass(), "varFilter", null);
        term190625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term190625, term190625.getClass(), "number", 0.0);
        setIntField(term190625, term190625.getClass(), "type", 0);
        setField(term190625, term190625.getClass(), "next", null);
        setField(term190625, term190625.getClass(), "first", null);
        setField(term190625, term190625.getClass(), "last", null);
        setField(term190625, term190625.getClass(), "propListHead", null);
        setIntField(term190625, term190625.getClass(), "sourcePosition", 0);
        setField(term190625, term190625.getClass(), "jsType", null);
        setField(term190625, term190625.getClass(), "parent", null);
        term190626 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term190627 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term190626, term190626.getClass(), "str", null);
        setIntField(term190626, term190626.getClass(), "type", 108);
        setField(term190626, term190626.getClass(), "next", null);
        setDoubleField(term190627, term190627.getClass(), "number", 0.0);
        setIntField(term190627, term190627.getClass(), "type", 0);
        setField(term190627, term190627.getClass(), "next", null);
        setField(term190627, term190627.getClass(), "first", null);
        setField(term190627, term190627.getClass(), "last", null);
        setField(term190627, term190627.getClass(), "propListHead", null);
        setIntField(term190627, term190627.getClass(), "sourcePosition", 0);
        setField(term190627, term190627.getClass(), "jsType", null);
        setField(term190627, term190627.getClass(), "parent", null);
        setField(term190626, term190626.getClass(), "first", term190627);
        setField(term190626, term190626.getClass(), "last", null);
        setField(term190626, term190626.getClass(), "propListHead", null);
        setIntField(term190626, term190626.getClass(), "sourcePosition", 0);
        setField(term190626, term190626.getClass(), "jsType", null);
        setField(term190626, term190626.getClass(), "parent", null);
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
        args[1] = term190146;
        args[2] = term190100;
        callMethod(klass, "visit", argTypes, term189916, args);
        assertTrue(recursiveEquals(term189916, term190624));
        assertTrue(recursiveEquals(term190146, term190626));
        assertTrue(recursiveEquals(term190100, null));
    }

};


