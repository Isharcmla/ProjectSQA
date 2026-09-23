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

public class ReferenceCollectingCallback_visit_872273174201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49591;
     Object term49821;
     Object term49775;
     Object term50427;
     Object term50428;
     Object term50429;

    public ReferenceCollectingCallback_visit_872273174201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49591 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term49821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term49821, term49821.getClass(), "type", 0);
        term49775 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term49775, term49775.getClass(), "type", 108);
        setField(term49775, term49775.getClass(), "first", term49821);
        term50427 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term50427, term50427.getClass(), "referenceMap", null);
        setField(term50427, term50427.getClass(), "blockStack", null);
        setField(term50427, term50427.getClass(), "behavior", null);
        setField(term50427, term50427.getClass(), "compiler", null);
        setField(term50427, term50427.getClass(), "varFilter", null);
        term50428 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term50428, term50428.getClass(), "str", null);
        setIntField(term50428, term50428.getClass(), "type", 0);
        setField(term50428, term50428.getClass(), "next", null);
        setField(term50428, term50428.getClass(), "first", null);
        setField(term50428, term50428.getClass(), "last", null);
        setField(term50428, term50428.getClass(), "propListHead", null);
        setIntField(term50428, term50428.getClass(), "sourcePosition", 0);
        setField(term50428, term50428.getClass(), "jsType", null);
        setField(term50428, term50428.getClass(), "parent", null);
        term50429 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term50430 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term50429, term50429.getClass(), "number", 0.0);
        setIntField(term50429, term50429.getClass(), "type", 108);
        setField(term50429, term50429.getClass(), "next", null);
        setField(term50430, term50430.getClass(), "str", null);
        setIntField(term50430, term50430.getClass(), "type", 0);
        setField(term50430, term50430.getClass(), "next", null);
        setField(term50430, term50430.getClass(), "first", null);
        setField(term50430, term50430.getClass(), "last", null);
        setField(term50430, term50430.getClass(), "propListHead", null);
        setIntField(term50430, term50430.getClass(), "sourcePosition", 0);
        setField(term50430, term50430.getClass(), "jsType", null);
        setField(term50430, term50430.getClass(), "parent", null);
        setField(term50429, term50429.getClass(), "first", term50430);
        setField(term50429, term50429.getClass(), "last", null);
        setField(term50429, term50429.getClass(), "propListHead", null);
        setIntField(term50429, term50429.getClass(), "sourcePosition", 0);
        setField(term50429, term50429.getClass(), "jsType", null);
        setField(term50429, term50429.getClass(), "parent", null);
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
        args[1] = term49821;
        args[2] = term49775;
        callMethod(klass, "visit", argTypes, term49591, args);
        assertTrue(recursiveEquals(term49591, term50427));
        assertTrue(recursiveEquals(term49821, term50429));
        assertTrue(recursiveEquals(term49775, null));
    }

};


