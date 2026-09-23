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

public class ReferenceCollectingCallback_visit_872273174135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22462;
     Object term22637;
     Object term22602;
     Object term22922;
     Object term22923;
     Object term22924;

    public ReferenceCollectingCallback_visit_872273174135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22462 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term22637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22637, term22637.getClass(), "type", 101);
        term22602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22602, term22602.getClass(), "type", 101);
        setField(term22602, term22602.getClass(), "first", term22637);
        term22922 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term22922, term22922.getClass(), "referenceMap", null);
        setField(term22922, term22922.getClass(), "blockStack", null);
        setField(term22922, term22922.getClass(), "behavior", null);
        setField(term22922, term22922.getClass(), "compiler", null);
        setField(term22922, term22922.getClass(), "varFilter", null);
        term22923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22923, term22923.getClass(), "type", 101);
        setField(term22923, term22923.getClass(), "next", null);
        setField(term22923, term22923.getClass(), "first", null);
        setField(term22923, term22923.getClass(), "last", null);
        setField(term22923, term22923.getClass(), "propListHead", null);
        setIntField(term22923, term22923.getClass(), "sourcePosition", 0);
        setField(term22923, term22923.getClass(), "jsType", null);
        setField(term22923, term22923.getClass(), "parent", null);
        term22924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22924, term22924.getClass(), "type", 101);
        setField(term22924, term22924.getClass(), "next", null);
        setIntField(term22925, term22925.getClass(), "type", 101);
        setField(term22925, term22925.getClass(), "next", null);
        setField(term22925, term22925.getClass(), "first", null);
        setField(term22925, term22925.getClass(), "last", null);
        setField(term22925, term22925.getClass(), "propListHead", null);
        setIntField(term22925, term22925.getClass(), "sourcePosition", 0);
        setField(term22925, term22925.getClass(), "jsType", null);
        setField(term22925, term22925.getClass(), "parent", null);
        setField(term22924, term22924.getClass(), "first", term22925);
        setField(term22924, term22924.getClass(), "last", null);
        setField(term22924, term22924.getClass(), "propListHead", null);
        setIntField(term22924, term22924.getClass(), "sourcePosition", 0);
        setField(term22924, term22924.getClass(), "jsType", null);
        setField(term22924, term22924.getClass(), "parent", null);
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
        args[1] = term22637;
        args[2] = term22602;
        callMethod(klass, "visit", argTypes, term22462, args);
        assertTrue(recursiveEquals(term22462, term22922));
        assertTrue(recursiveEquals(term22637, term22924));
        assertTrue(recursiveEquals(term22602, null));
    }

};


