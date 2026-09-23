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
     Object term90599;
     Object term90829;
     Object term90783;
     Object term90849;
     Object term90850;
     Object term90851;

    public ReferenceCollectingCallback_visit_872273174391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90599 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term90829 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term90829, term90829.getClass(), "type", 100);
        term90783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term90783, term90783.getClass(), "type", 100);
        setField(term90783, term90783.getClass(), "first", term90829);
        term90849 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term90849, term90849.getClass(), "referenceMap", null);
        setField(term90849, term90849.getClass(), "blockStack", null);
        setField(term90849, term90849.getClass(), "behavior", null);
        setField(term90849, term90849.getClass(), "compiler", null);
        setField(term90849, term90849.getClass(), "varFilter", null);
        term90850 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term90850, term90850.getClass(), "str", null);
        setIntField(term90850, term90850.getClass(), "type", 100);
        setField(term90850, term90850.getClass(), "next", null);
        setField(term90850, term90850.getClass(), "first", null);
        setField(term90850, term90850.getClass(), "last", null);
        setField(term90850, term90850.getClass(), "propListHead", null);
        setIntField(term90850, term90850.getClass(), "sourcePosition", 0);
        setField(term90850, term90850.getClass(), "jsType", null);
        setField(term90850, term90850.getClass(), "parent", null);
        term90851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term90852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term90851, term90851.getClass(), "str", null);
        setIntField(term90851, term90851.getClass(), "type", 100);
        setField(term90851, term90851.getClass(), "next", null);
        setField(term90852, term90852.getClass(), "str", null);
        setIntField(term90852, term90852.getClass(), "type", 100);
        setField(term90852, term90852.getClass(), "next", null);
        setField(term90852, term90852.getClass(), "first", null);
        setField(term90852, term90852.getClass(), "last", null);
        setField(term90852, term90852.getClass(), "propListHead", null);
        setIntField(term90852, term90852.getClass(), "sourcePosition", 0);
        setField(term90852, term90852.getClass(), "jsType", null);
        setField(term90852, term90852.getClass(), "parent", null);
        setField(term90851, term90851.getClass(), "first", term90852);
        setField(term90851, term90851.getClass(), "last", null);
        setField(term90851, term90851.getClass(), "propListHead", null);
        setIntField(term90851, term90851.getClass(), "sourcePosition", 0);
        setField(term90851, term90851.getClass(), "jsType", null);
        setField(term90851, term90851.getClass(), "parent", null);
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
        args[1] = term90829;
        args[2] = term90783;
        callMethod(klass, "visit", argTypes, term90599, args);
        assertTrue(recursiveEquals(term90599, term90849));
        assertTrue(recursiveEquals(term90829, term90851));
        assertTrue(recursiveEquals(term90783, null));
    }

};


