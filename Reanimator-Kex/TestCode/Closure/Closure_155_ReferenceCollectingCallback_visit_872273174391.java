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

public class ReferenceCollectingCallback_visit_872273174391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93395;
     Object term93625;
     Object term93579;
     Object term94202;
     Object term94203;
     Object term94204;

    public ReferenceCollectingCallback_visit_872273174391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93395 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term93625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93625, term93625.getClass(), "type", 98);
        term93579 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term93579, term93579.getClass(), "type", 98);
        setField(term93579, term93579.getClass(), "first", term93625);
        term94202 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term94202, term94202.getClass(), "referenceMap", null);
        setField(term94202, term94202.getClass(), "blockStack", null);
        setField(term94202, term94202.getClass(), "behavior", null);
        setField(term94202, term94202.getClass(), "compiler", null);
        setField(term94202, term94202.getClass(), "varFilter", null);
        term94203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term94203, term94203.getClass(), "number", 0.0);
        setIntField(term94203, term94203.getClass(), "type", 98);
        setField(term94203, term94203.getClass(), "next", null);
        setField(term94203, term94203.getClass(), "first", null);
        setField(term94203, term94203.getClass(), "last", null);
        setField(term94203, term94203.getClass(), "propListHead", null);
        setIntField(term94203, term94203.getClass(), "sourcePosition", 0);
        setField(term94203, term94203.getClass(), "jsType", null);
        setField(term94203, term94203.getClass(), "parent", null);
        term94204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term94205 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term94204, term94204.getClass(), "number", 0.0);
        setIntField(term94204, term94204.getClass(), "type", 98);
        setField(term94204, term94204.getClass(), "next", null);
        setDoubleField(term94205, term94205.getClass(), "number", 0.0);
        setIntField(term94205, term94205.getClass(), "type", 98);
        setField(term94205, term94205.getClass(), "next", null);
        setField(term94205, term94205.getClass(), "first", null);
        setField(term94205, term94205.getClass(), "last", null);
        setField(term94205, term94205.getClass(), "propListHead", null);
        setIntField(term94205, term94205.getClass(), "sourcePosition", 0);
        setField(term94205, term94205.getClass(), "jsType", null);
        setField(term94205, term94205.getClass(), "parent", null);
        setField(term94204, term94204.getClass(), "first", term94205);
        setField(term94204, term94204.getClass(), "last", null);
        setField(term94204, term94204.getClass(), "propListHead", null);
        setIntField(term94204, term94204.getClass(), "sourcePosition", 0);
        setField(term94204, term94204.getClass(), "jsType", null);
        setField(term94204, term94204.getClass(), "parent", null);
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
        args[1] = term93625;
        args[2] = term93579;
        callMethod(klass, "visit", argTypes, term93395, args);
        assertTrue(recursiveEquals(term93395, term94202));
        assertTrue(recursiveEquals(term93625, term94204));
        assertTrue(recursiveEquals(term93579, null));
    }

};


