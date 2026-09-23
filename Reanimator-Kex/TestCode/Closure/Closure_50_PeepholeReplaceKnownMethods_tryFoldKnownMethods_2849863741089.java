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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4841313;
     Object term4841405;
     Object term4843174;
     Object term4843175;
     Object term4842844;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4841313 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4841405 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4841497 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4841589 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4841681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4841811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4841903 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4841497, term4841497.getClass(), "type", 35);
        setIntField(term4841681, term4841681.getClass(), "type", 40);
        setField(term4841681, term4841681.getClass(), "str", "substring");
        setField(term4841589, term4841589.getClass(), "next", term4841681);
        setIntField(term4841589, term4841589.getClass(), "type", 40);
        setField(term4841589, term4841589.getClass(), "str", null);
        setField(term4841497, term4841497.getClass(), "first", term4841589);
        setIntField(term4841811, term4841811.getClass(), "type", 39);
        setDoubleField(term4841811, term4841811.getClass(), "number", 0.0);
        setField(term4841811, term4841811.getClass(), "next", term4841903);
        setField(term4841497, term4841497.getClass(), "next", term4841811);
        setField(term4841405, term4841405.getClass(), "first", term4841497);
        setIntField(term4841405, term4841405.getClass(), "type", 37);
        term4843174 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term4843174, term4843174.getClass(), "currentTraversal", null);
        term4843175 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4843176 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4843177 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4843178 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4843179 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4843180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4843175, term4843175.getClass(), "str", null);
        setIntField(term4843175, term4843175.getClass(), "type", 37);
        setField(term4843175, term4843175.getClass(), "next", null);
        setField(term4843176, term4843176.getClass(), "str", null);
        setIntField(term4843176, term4843176.getClass(), "type", 35);
        setDoubleField(term4843177, term4843177.getClass(), "number", 0.0);
        setIntField(term4843177, term4843177.getClass(), "type", 39);
        setField(term4843178, term4843178.getClass(), "str", null);
        setIntField(term4843178, term4843178.getClass(), "type", 0);
        setField(term4843178, term4843178.getClass(), "next", null);
        setField(term4843178, term4843178.getClass(), "first", null);
        setField(term4843178, term4843178.getClass(), "last", null);
        setField(term4843178, term4843178.getClass(), "propListHead", null);
        setIntField(term4843178, term4843178.getClass(), "sourcePosition", 0);
        setField(term4843178, term4843178.getClass(), "jsType", null);
        setField(term4843178, term4843178.getClass(), "parent", null);
        setField(term4843177, term4843177.getClass(), "next", term4843178);
        setField(term4843177, term4843177.getClass(), "first", null);
        setField(term4843177, term4843177.getClass(), "last", null);
        setField(term4843177, term4843177.getClass(), "propListHead", null);
        setIntField(term4843177, term4843177.getClass(), "sourcePosition", 0);
        setField(term4843177, term4843177.getClass(), "jsType", null);
        setField(term4843177, term4843177.getClass(), "parent", null);
        setField(term4843176, term4843176.getClass(), "next", term4843177);
        setField(term4843179, term4843179.getClass(), "str", null);
        setIntField(term4843179, term4843179.getClass(), "type", 40);
        setField(term4843180, term4843180.getClass(), "str", "");
        setIntField(term4843180, term4843180.getClass(), "type", 40);
        setField(term4843180, term4843180.getClass(), "next", null);
        setField(term4843180, term4843180.getClass(), "first", null);
        setField(term4843180, term4843180.getClass(), "last", null);
        setField(term4843180, term4843180.getClass(), "propListHead", null);
        setIntField(term4843180, term4843180.getClass(), "sourcePosition", 0);
        setField(term4843180, term4843180.getClass(), "jsType", null);
        setField(term4843180, term4843180.getClass(), "parent", null);
        setField(term4843179, term4843179.getClass(), "next", term4843180);
        setField(term4843179, term4843179.getClass(), "first", null);
        setField(term4843179, term4843179.getClass(), "last", null);
        setField(term4843179, term4843179.getClass(), "propListHead", null);
        setIntField(term4843179, term4843179.getClass(), "sourcePosition", 0);
        setField(term4843179, term4843179.getClass(), "jsType", null);
        setField(term4843179, term4843179.getClass(), "parent", null);
        setField(term4843176, term4843176.getClass(), "first", term4843179);
        setField(term4843176, term4843176.getClass(), "last", null);
        setField(term4843176, term4843176.getClass(), "propListHead", null);
        setIntField(term4843176, term4843176.getClass(), "sourcePosition", 0);
        setField(term4843176, term4843176.getClass(), "jsType", null);
        setField(term4843176, term4843176.getClass(), "parent", null);
        setField(term4843175, term4843175.getClass(), "first", term4843176);
        setField(term4843175, term4843175.getClass(), "last", null);
        setField(term4843175, term4843175.getClass(), "propListHead", null);
        setIntField(term4843175, term4843175.getClass(), "sourcePosition", 0);
        setField(term4843175, term4843175.getClass(), "jsType", null);
        setField(term4843175, term4843175.getClass(), "parent", null);
        term4842844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4842851 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842855 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4842857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4842844, term4842844.getClass(), "str", null);
        setIntField(term4842844, term4842844.getClass(), "type", 37);
        setField(term4842844, term4842844.getClass(), "next", null);
        setField(term4842846, term4842846.getClass(), "str", null);
        setIntField(term4842846, term4842846.getClass(), "type", 35);
        setDoubleField(term4842848, term4842848.getClass(), "number", 0.0);
        setIntField(term4842848, term4842848.getClass(), "type", 39);
        setField(term4842851, term4842851.getClass(), "str", null);
        setIntField(term4842851, term4842851.getClass(), "type", 0);
        setField(term4842851, term4842851.getClass(), "next", null);
        setField(term4842851, term4842851.getClass(), "first", null);
        setField(term4842851, term4842851.getClass(), "last", null);
        setField(term4842851, term4842851.getClass(), "propListHead", null);
        setIntField(term4842851, term4842851.getClass(), "sourcePosition", 0);
        setField(term4842851, term4842851.getClass(), "jsType", null);
        setField(term4842851, term4842851.getClass(), "parent", null);
        setField(term4842848, term4842848.getClass(), "next", term4842851);
        setField(term4842848, term4842848.getClass(), "first", null);
        setField(term4842848, term4842848.getClass(), "last", null);
        setField(term4842848, term4842848.getClass(), "propListHead", null);
        setIntField(term4842848, term4842848.getClass(), "sourcePosition", 0);
        setField(term4842848, term4842848.getClass(), "jsType", null);
        setField(term4842848, term4842848.getClass(), "parent", null);
        setField(term4842846, term4842846.getClass(), "next", term4842848);
        setField(term4842855, term4842855.getClass(), "str", null);
        setIntField(term4842855, term4842855.getClass(), "type", 40);
        setField(term4842857, term4842857.getClass(), "str", "");
        setIntField(term4842857, term4842857.getClass(), "type", 40);
        setField(term4842857, term4842857.getClass(), "next", null);
        setField(term4842857, term4842857.getClass(), "first", null);
        setField(term4842857, term4842857.getClass(), "last", null);
        setField(term4842857, term4842857.getClass(), "propListHead", null);
        setIntField(term4842857, term4842857.getClass(), "sourcePosition", 0);
        setField(term4842857, term4842857.getClass(), "jsType", null);
        setField(term4842857, term4842857.getClass(), "parent", null);
        setField(term4842855, term4842855.getClass(), "next", term4842857);
        setField(term4842855, term4842855.getClass(), "first", null);
        setField(term4842855, term4842855.getClass(), "last", null);
        setField(term4842855, term4842855.getClass(), "propListHead", null);
        setIntField(term4842855, term4842855.getClass(), "sourcePosition", 0);
        setField(term4842855, term4842855.getClass(), "jsType", null);
        setField(term4842855, term4842855.getClass(), "parent", null);
        setField(term4842846, term4842846.getClass(), "first", term4842855);
        setField(term4842846, term4842846.getClass(), "last", null);
        setField(term4842846, term4842846.getClass(), "propListHead", null);
        setIntField(term4842846, term4842846.getClass(), "sourcePosition", 0);
        setField(term4842846, term4842846.getClass(), "jsType", null);
        setField(term4842846, term4842846.getClass(), "parent", null);
        setField(term4842844, term4842844.getClass(), "first", term4842846);
        setField(term4842844, term4842844.getClass(), "last", null);
        setField(term4842844, term4842844.getClass(), "propListHead", null);
        setIntField(term4842844, term4842844.getClass(), "sourcePosition", 0);
        setField(term4842844, term4842844.getClass(), "jsType", null);
        setField(term4842844, term4842844.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4841405;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term4841313, args);
        assertTrue(recursiveEquals(term4841313, term4843174));
        assertTrue(recursiveEquals(term4841405, term4843175));
        assertTrue(recursiveEquals(retValue, term4842844));
    }

};


