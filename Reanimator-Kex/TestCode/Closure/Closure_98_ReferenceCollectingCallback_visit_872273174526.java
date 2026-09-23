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

public class ReferenceCollectingCallback_visit_872273174526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143344;
     Object term143436;
     Object term143528;
     Object term143546;
     Object term143547;
     Object term143548;

    public ReferenceCollectingCallback_visit_872273174526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143344 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term143436 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term143436, term143436.getClass(), "type", -39);
        term143528 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term143546 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term143546, term143546.getClass(), "referenceMap", null);
        setField(term143546, term143546.getClass(), "blockStack", null);
        setField(term143546, term143546.getClass(), "behavior", null);
        setField(term143546, term143546.getClass(), "compiler", null);
        setField(term143546, term143546.getClass(), "varFilter", null);
        term143547 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term143547, term143547.getClass(), "number", 0.0);
        setIntField(term143547, term143547.getClass(), "type", -39);
        setField(term143547, term143547.getClass(), "next", null);
        setField(term143547, term143547.getClass(), "first", null);
        setField(term143547, term143547.getClass(), "last", null);
        setField(term143547, term143547.getClass(), "propListHead", null);
        setIntField(term143547, term143547.getClass(), "sourcePosition", 0);
        setField(term143547, term143547.getClass(), "jsType", null);
        setField(term143547, term143547.getClass(), "parent", null);
        term143548 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term143548, term143548.getClass(), "number", 0.0);
        setIntField(term143548, term143548.getClass(), "type", 0);
        setField(term143548, term143548.getClass(), "next", null);
        setField(term143548, term143548.getClass(), "first", null);
        setField(term143548, term143548.getClass(), "last", null);
        setField(term143548, term143548.getClass(), "propListHead", null);
        setIntField(term143548, term143548.getClass(), "sourcePosition", 0);
        setField(term143548, term143548.getClass(), "jsType", null);
        setField(term143548, term143548.getClass(), "parent", null);
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
        args[1] = term143436;
        args[2] = term143528;
        callMethod(klass, "visit", argTypes, term143344, args);
        assertTrue(recursiveEquals(term143344, term143546));
        assertTrue(recursiveEquals(term143436, term143548));
        assertTrue(recursiveEquals(term143528, null));
    }

};


