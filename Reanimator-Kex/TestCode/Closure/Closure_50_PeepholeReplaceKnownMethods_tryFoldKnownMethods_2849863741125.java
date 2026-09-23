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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5771673;
     Object term5771765;
     Object term5774318;
     Object term5774319;
     Object term5773976;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5771673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5771765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5771857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5771949 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5772041 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5772149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5771857, term5771857.getClass(), "type", 35);
        setIntField(term5772041, term5772041.getClass(), "type", 40);
        setField(term5772041, term5772041.getClass(), "str", "indexOf");
        setField(term5772041, term5772041.getClass(), "next", term5772149);
        setField(term5771949, term5771949.getClass(), "next", term5772041);
        setIntField(term5771949, term5771949.getClass(), "type", 40);
        setField(term5771949, term5771949.getClass(), "str", null);
        setField(term5771857, term5771857.getClass(), "first", term5771949);
        setField(term5771857, term5771857.getClass(), "next", term5772041);
        setField(term5771765, term5771765.getClass(), "first", term5771857);
        setIntField(term5771765, term5771765.getClass(), "type", 37);
        term5774318 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5774318, term5774318.getClass(), "currentTraversal", null);
        term5774319 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5774320 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5774321 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5774324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5774325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5774319, term5774319.getClass(), "str", null);
        setIntField(term5774319, term5774319.getClass(), "type", 37);
        setField(term5774319, term5774319.getClass(), "next", null);
        setField(term5774320, term5774320.getClass(), "str", null);
        setIntField(term5774320, term5774320.getClass(), "type", 35);
        setField(term5774321, term5774321.getClass(), "str", "indexOf");
        setIntField(term5774321, term5774321.getClass(), "type", 40);
        setIntField(term5774324, term5774324.getClass(), "type", 0);
        setField(term5774324, term5774324.getClass(), "next", null);
        setField(term5774324, term5774324.getClass(), "first", null);
        setField(term5774324, term5774324.getClass(), "last", null);
        setField(term5774324, term5774324.getClass(), "propListHead", null);
        setIntField(term5774324, term5774324.getClass(), "sourcePosition", 0);
        setField(term5774324, term5774324.getClass(), "jsType", null);
        setField(term5774324, term5774324.getClass(), "parent", null);
        setField(term5774321, term5774321.getClass(), "next", term5774324);
        setField(term5774321, term5774321.getClass(), "first", null);
        setField(term5774321, term5774321.getClass(), "last", null);
        setField(term5774321, term5774321.getClass(), "propListHead", null);
        setIntField(term5774321, term5774321.getClass(), "sourcePosition", 0);
        setField(term5774321, term5774321.getClass(), "jsType", null);
        setField(term5774321, term5774321.getClass(), "parent", null);
        setField(term5774320, term5774320.getClass(), "next", term5774321);
        setField(term5774325, term5774325.getClass(), "str", null);
        setIntField(term5774325, term5774325.getClass(), "type", 40);
        setField(term5774325, term5774325.getClass(), "next", term5774321);
        setField(term5774325, term5774325.getClass(), "first", null);
        setField(term5774325, term5774325.getClass(), "last", null);
        setField(term5774325, term5774325.getClass(), "propListHead", null);
        setIntField(term5774325, term5774325.getClass(), "sourcePosition", 0);
        setField(term5774325, term5774325.getClass(), "jsType", null);
        setField(term5774325, term5774325.getClass(), "parent", null);
        setField(term5774320, term5774320.getClass(), "first", term5774325);
        setField(term5774320, term5774320.getClass(), "last", null);
        setField(term5774320, term5774320.getClass(), "propListHead", null);
        setIntField(term5774320, term5774320.getClass(), "sourcePosition", 0);
        setField(term5774320, term5774320.getClass(), "jsType", null);
        setField(term5774320, term5774320.getClass(), "parent", null);
        setField(term5774319, term5774319.getClass(), "first", term5774320);
        setField(term5774319, term5774319.getClass(), "last", null);
        setField(term5774319, term5774319.getClass(), "propListHead", null);
        setIntField(term5774319, term5774319.getClass(), "sourcePosition", 0);
        setField(term5774319, term5774319.getClass(), "jsType", null);
        setField(term5774319, term5774319.getClass(), "parent", null);
        term5773976 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5773978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5773980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5773991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5773995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5773976, term5773976.getClass(), "str", null);
        setIntField(term5773976, term5773976.getClass(), "type", 37);
        setField(term5773976, term5773976.getClass(), "next", null);
        setField(term5773978, term5773978.getClass(), "str", null);
        setIntField(term5773978, term5773978.getClass(), "type", 35);
        setField(term5773980, term5773980.getClass(), "str", "indexOf");
        setIntField(term5773980, term5773980.getClass(), "type", 40);
        setIntField(term5773991, term5773991.getClass(), "type", 0);
        setField(term5773991, term5773991.getClass(), "next", null);
        setField(term5773991, term5773991.getClass(), "first", null);
        setField(term5773991, term5773991.getClass(), "last", null);
        setField(term5773991, term5773991.getClass(), "propListHead", null);
        setIntField(term5773991, term5773991.getClass(), "sourcePosition", 0);
        setField(term5773991, term5773991.getClass(), "jsType", null);
        setField(term5773991, term5773991.getClass(), "parent", null);
        setField(term5773980, term5773980.getClass(), "next", term5773991);
        setField(term5773980, term5773980.getClass(), "first", null);
        setField(term5773980, term5773980.getClass(), "last", null);
        setField(term5773980, term5773980.getClass(), "propListHead", null);
        setIntField(term5773980, term5773980.getClass(), "sourcePosition", 0);
        setField(term5773980, term5773980.getClass(), "jsType", null);
        setField(term5773980, term5773980.getClass(), "parent", null);
        setField(term5773978, term5773978.getClass(), "next", term5773980);
        setField(term5773995, term5773995.getClass(), "str", null);
        setIntField(term5773995, term5773995.getClass(), "type", 40);
        setField(term5773995, term5773995.getClass(), "next", term5773980);
        setField(term5773995, term5773995.getClass(), "first", null);
        setField(term5773995, term5773995.getClass(), "last", null);
        setField(term5773995, term5773995.getClass(), "propListHead", null);
        setIntField(term5773995, term5773995.getClass(), "sourcePosition", 0);
        setField(term5773995, term5773995.getClass(), "jsType", null);
        setField(term5773995, term5773995.getClass(), "parent", null);
        setField(term5773978, term5773978.getClass(), "first", term5773995);
        setField(term5773978, term5773978.getClass(), "last", null);
        setField(term5773978, term5773978.getClass(), "propListHead", null);
        setIntField(term5773978, term5773978.getClass(), "sourcePosition", 0);
        setField(term5773978, term5773978.getClass(), "jsType", null);
        setField(term5773978, term5773978.getClass(), "parent", null);
        setField(term5773976, term5773976.getClass(), "first", term5773978);
        setField(term5773976, term5773976.getClass(), "last", null);
        setField(term5773976, term5773976.getClass(), "propListHead", null);
        setIntField(term5773976, term5773976.getClass(), "sourcePosition", 0);
        setField(term5773976, term5773976.getClass(), "jsType", null);
        setField(term5773976, term5773976.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5771765;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term5771673, args);
        assertTrue(recursiveEquals(term5771673, term5774318));
        assertTrue(recursiveEquals(term5771765, term5774319));
        assertTrue(recursiveEquals(retValue, term5773976));
    }

};


