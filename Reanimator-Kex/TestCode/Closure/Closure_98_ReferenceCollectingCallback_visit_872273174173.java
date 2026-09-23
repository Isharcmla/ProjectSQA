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

public class ReferenceCollectingCallback_visit_872273174173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42103;
     Object term42278;
     Object term42243;
     Object term42659;
     Object term42660;
     Object term42661;

    public ReferenceCollectingCallback_visit_872273174173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42103 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term42278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42278, term42278.getClass(), "type", 98);
        term42243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42243, term42243.getClass(), "type", 98);
        setField(term42243, term42243.getClass(), "first", term42278);
        term42659 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term42659, term42659.getClass(), "referenceMap", null);
        setField(term42659, term42659.getClass(), "blockStack", null);
        setField(term42659, term42659.getClass(), "behavior", null);
        setField(term42659, term42659.getClass(), "compiler", null);
        setField(term42659, term42659.getClass(), "varFilter", null);
        term42660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42660, term42660.getClass(), "type", 98);
        setField(term42660, term42660.getClass(), "next", null);
        setField(term42660, term42660.getClass(), "first", null);
        setField(term42660, term42660.getClass(), "last", null);
        setField(term42660, term42660.getClass(), "propListHead", null);
        setIntField(term42660, term42660.getClass(), "sourcePosition", 0);
        setField(term42660, term42660.getClass(), "jsType", null);
        setField(term42660, term42660.getClass(), "parent", null);
        term42661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42661, term42661.getClass(), "type", 98);
        setField(term42661, term42661.getClass(), "next", null);
        setIntField(term42662, term42662.getClass(), "type", 98);
        setField(term42662, term42662.getClass(), "next", null);
        setField(term42662, term42662.getClass(), "first", null);
        setField(term42662, term42662.getClass(), "last", null);
        setField(term42662, term42662.getClass(), "propListHead", null);
        setIntField(term42662, term42662.getClass(), "sourcePosition", 0);
        setField(term42662, term42662.getClass(), "jsType", null);
        setField(term42662, term42662.getClass(), "parent", null);
        setField(term42661, term42661.getClass(), "first", term42662);
        setField(term42661, term42661.getClass(), "last", null);
        setField(term42661, term42661.getClass(), "propListHead", null);
        setIntField(term42661, term42661.getClass(), "sourcePosition", 0);
        setField(term42661, term42661.getClass(), "jsType", null);
        setField(term42661, term42661.getClass(), "parent", null);
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
        args[1] = term42278;
        args[2] = term42243;
        callMethod(klass, "visit", argTypes, term42103, args);
        assertTrue(recursiveEquals(term42103, term42659));
        assertTrue(recursiveEquals(term42278, term42661));
        assertTrue(recursiveEquals(term42243, null));
    }

};


