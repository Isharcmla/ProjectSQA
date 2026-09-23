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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3561862;
     Object term3561954;
     Object term3562855;
     Object term3562856;
     Object term3562514;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3561862 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3561954 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562046 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562360 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3562452 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3562046, term3562046.getClass(), "type", 35);
        setIntField(term3562230, term3562230.getClass(), "type", 40);
        setField(term3562230, term3562230.getClass(), "str", "substring");
        setField(term3562138, term3562138.getClass(), "next", term3562230);
        setIntField(term3562138, term3562138.getClass(), "type", 40);
        setField(term3562138, term3562138.getClass(), "str", null);
        setField(term3562046, term3562046.getClass(), "first", term3562138);
        setIntField(term3562360, term3562360.getClass(), "type", 39);
        setDoubleField(term3562360, term3562360.getClass(), "number", 0.0);
        setField(term3562360, term3562360.getClass(), "next", term3562452);
        setField(term3562046, term3562046.getClass(), "next", term3562360);
        setField(term3561954, term3561954.getClass(), "first", term3562046);
        setIntField(term3561954, term3561954.getClass(), "type", 37);
        term3562855 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3562855, term3562855.getClass(), "currentTraversal", null);
        term3562856 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562858 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3562859 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3562860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3562856, term3562856.getClass(), "str", null);
        setIntField(term3562856, term3562856.getClass(), "type", 37);
        setField(term3562856, term3562856.getClass(), "next", null);
        setField(term3562857, term3562857.getClass(), "str", null);
        setIntField(term3562857, term3562857.getClass(), "type", 35);
        setDoubleField(term3562858, term3562858.getClass(), "number", 0.0);
        setIntField(term3562858, term3562858.getClass(), "type", 39);
        setDoubleField(term3562859, term3562859.getClass(), "number", 0.0);
        setIntField(term3562859, term3562859.getClass(), "type", 0);
        setField(term3562859, term3562859.getClass(), "next", null);
        setField(term3562859, term3562859.getClass(), "first", null);
        setField(term3562859, term3562859.getClass(), "last", null);
        setField(term3562859, term3562859.getClass(), "propListHead", null);
        setIntField(term3562859, term3562859.getClass(), "sourcePosition", 0);
        setField(term3562859, term3562859.getClass(), "jsType", null);
        setField(term3562859, term3562859.getClass(), "parent", null);
        setField(term3562858, term3562858.getClass(), "next", term3562859);
        setField(term3562858, term3562858.getClass(), "first", null);
        setField(term3562858, term3562858.getClass(), "last", null);
        setField(term3562858, term3562858.getClass(), "propListHead", null);
        setIntField(term3562858, term3562858.getClass(), "sourcePosition", 0);
        setField(term3562858, term3562858.getClass(), "jsType", null);
        setField(term3562858, term3562858.getClass(), "parent", null);
        setField(term3562857, term3562857.getClass(), "next", term3562858);
        setField(term3562860, term3562860.getClass(), "str", null);
        setIntField(term3562860, term3562860.getClass(), "type", 40);
        setField(term3562861, term3562861.getClass(), "str", "");
        setIntField(term3562861, term3562861.getClass(), "type", 40);
        setField(term3562861, term3562861.getClass(), "next", null);
        setField(term3562861, term3562861.getClass(), "first", null);
        setField(term3562861, term3562861.getClass(), "last", null);
        setField(term3562861, term3562861.getClass(), "propListHead", null);
        setIntField(term3562861, term3562861.getClass(), "sourcePosition", 0);
        setField(term3562861, term3562861.getClass(), "jsType", null);
        setField(term3562861, term3562861.getClass(), "parent", null);
        setField(term3562860, term3562860.getClass(), "next", term3562861);
        setField(term3562860, term3562860.getClass(), "first", null);
        setField(term3562860, term3562860.getClass(), "last", null);
        setField(term3562860, term3562860.getClass(), "propListHead", null);
        setIntField(term3562860, term3562860.getClass(), "sourcePosition", 0);
        setField(term3562860, term3562860.getClass(), "jsType", null);
        setField(term3562860, term3562860.getClass(), "parent", null);
        setField(term3562857, term3562857.getClass(), "first", term3562860);
        setField(term3562857, term3562857.getClass(), "last", null);
        setField(term3562857, term3562857.getClass(), "propListHead", null);
        setIntField(term3562857, term3562857.getClass(), "sourcePosition", 0);
        setField(term3562857, term3562857.getClass(), "jsType", null);
        setField(term3562857, term3562857.getClass(), "parent", null);
        setField(term3562856, term3562856.getClass(), "first", term3562857);
        setField(term3562856, term3562856.getClass(), "last", null);
        setField(term3562856, term3562856.getClass(), "propListHead", null);
        setIntField(term3562856, term3562856.getClass(), "sourcePosition", 0);
        setField(term3562856, term3562856.getClass(), "jsType", null);
        setField(term3562856, term3562856.getClass(), "parent", null);
        term3562514 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3562521 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3562526 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3562528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3562514, term3562514.getClass(), "str", null);
        setIntField(term3562514, term3562514.getClass(), "type", 37);
        setField(term3562514, term3562514.getClass(), "next", null);
        setField(term3562516, term3562516.getClass(), "str", null);
        setIntField(term3562516, term3562516.getClass(), "type", 35);
        setDoubleField(term3562518, term3562518.getClass(), "number", 0.0);
        setIntField(term3562518, term3562518.getClass(), "type", 39);
        setDoubleField(term3562521, term3562521.getClass(), "number", 0.0);
        setIntField(term3562521, term3562521.getClass(), "type", 0);
        setField(term3562521, term3562521.getClass(), "next", null);
        setField(term3562521, term3562521.getClass(), "first", null);
        setField(term3562521, term3562521.getClass(), "last", null);
        setField(term3562521, term3562521.getClass(), "propListHead", null);
        setIntField(term3562521, term3562521.getClass(), "sourcePosition", 0);
        setField(term3562521, term3562521.getClass(), "jsType", null);
        setField(term3562521, term3562521.getClass(), "parent", null);
        setField(term3562518, term3562518.getClass(), "next", term3562521);
        setField(term3562518, term3562518.getClass(), "first", null);
        setField(term3562518, term3562518.getClass(), "last", null);
        setField(term3562518, term3562518.getClass(), "propListHead", null);
        setIntField(term3562518, term3562518.getClass(), "sourcePosition", 0);
        setField(term3562518, term3562518.getClass(), "jsType", null);
        setField(term3562518, term3562518.getClass(), "parent", null);
        setField(term3562516, term3562516.getClass(), "next", term3562518);
        setField(term3562526, term3562526.getClass(), "str", null);
        setIntField(term3562526, term3562526.getClass(), "type", 40);
        setField(term3562528, term3562528.getClass(), "str", "");
        setIntField(term3562528, term3562528.getClass(), "type", 40);
        setField(term3562528, term3562528.getClass(), "next", null);
        setField(term3562528, term3562528.getClass(), "first", null);
        setField(term3562528, term3562528.getClass(), "last", null);
        setField(term3562528, term3562528.getClass(), "propListHead", null);
        setIntField(term3562528, term3562528.getClass(), "sourcePosition", 0);
        setField(term3562528, term3562528.getClass(), "jsType", null);
        setField(term3562528, term3562528.getClass(), "parent", null);
        setField(term3562526, term3562526.getClass(), "next", term3562528);
        setField(term3562526, term3562526.getClass(), "first", null);
        setField(term3562526, term3562526.getClass(), "last", null);
        setField(term3562526, term3562526.getClass(), "propListHead", null);
        setIntField(term3562526, term3562526.getClass(), "sourcePosition", 0);
        setField(term3562526, term3562526.getClass(), "jsType", null);
        setField(term3562526, term3562526.getClass(), "parent", null);
        setField(term3562516, term3562516.getClass(), "first", term3562526);
        setField(term3562516, term3562516.getClass(), "last", null);
        setField(term3562516, term3562516.getClass(), "propListHead", null);
        setIntField(term3562516, term3562516.getClass(), "sourcePosition", 0);
        setField(term3562516, term3562516.getClass(), "jsType", null);
        setField(term3562516, term3562516.getClass(), "parent", null);
        setField(term3562514, term3562514.getClass(), "first", term3562516);
        setField(term3562514, term3562514.getClass(), "last", null);
        setField(term3562514, term3562514.getClass(), "propListHead", null);
        setIntField(term3562514, term3562514.getClass(), "sourcePosition", 0);
        setField(term3562514, term3562514.getClass(), "jsType", null);
        setField(term3562514, term3562514.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3561954;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3561862, args);
        assertTrue(recursiveEquals(term3561862, term3562855));
        assertTrue(recursiveEquals(term3561954, term3562856));
        assertTrue(recursiveEquals(retValue, term3562514));
    }

};


