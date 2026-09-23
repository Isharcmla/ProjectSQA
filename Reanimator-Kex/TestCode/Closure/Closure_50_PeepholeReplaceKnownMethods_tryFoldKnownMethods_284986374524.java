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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3499131;
     Object term3499223;
     Object term3501913;
     Object term3501914;
     Object term3501611;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3499131 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3499223 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3499315 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3499407 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3499499 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3499629 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3499699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3499315, term3499315.getClass(), "type", 35);
        setIntField(term3499499, term3499499.getClass(), "type", 40);
        setField(term3499499, term3499499.getClass(), "str", "substr");
        setField(term3499407, term3499407.getClass(), "next", term3499499);
        setIntField(term3499407, term3499407.getClass(), "type", 40);
        setField(term3499407, term3499407.getClass(), "str", null);
        setField(term3499315, term3499315.getClass(), "first", term3499407);
        setIntField(term3499629, term3499629.getClass(), "type", 39);
        setDoubleField(term3499629, term3499629.getClass(), "number", 0.0);
        setField(term3499629, term3499629.getClass(), "next", term3499699);
        setField(term3499315, term3499315.getClass(), "next", term3499629);
        setField(term3499223, term3499223.getClass(), "first", term3499315);
        setIntField(term3499223, term3499223.getClass(), "type", 37);
        term3501913 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3501913, term3501913.getClass(), "currentTraversal", null);
        term3501914 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501916 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3501917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3501918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501919 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3501914, term3501914.getClass(), "str", null);
        setIntField(term3501914, term3501914.getClass(), "type", 37);
        setField(term3501914, term3501914.getClass(), "next", null);
        setField(term3501915, term3501915.getClass(), "str", null);
        setIntField(term3501915, term3501915.getClass(), "type", 35);
        setDoubleField(term3501916, term3501916.getClass(), "number", 0.0);
        setIntField(term3501916, term3501916.getClass(), "type", 39);
        setIntField(term3501917, term3501917.getClass(), "type", 0);
        setField(term3501917, term3501917.getClass(), "next", null);
        setField(term3501917, term3501917.getClass(), "first", null);
        setField(term3501917, term3501917.getClass(), "last", null);
        setField(term3501917, term3501917.getClass(), "propListHead", null);
        setIntField(term3501917, term3501917.getClass(), "sourcePosition", 0);
        setField(term3501917, term3501917.getClass(), "jsType", null);
        setField(term3501917, term3501917.getClass(), "parent", null);
        setField(term3501916, term3501916.getClass(), "next", term3501917);
        setField(term3501916, term3501916.getClass(), "first", null);
        setField(term3501916, term3501916.getClass(), "last", null);
        setField(term3501916, term3501916.getClass(), "propListHead", null);
        setIntField(term3501916, term3501916.getClass(), "sourcePosition", 0);
        setField(term3501916, term3501916.getClass(), "jsType", null);
        setField(term3501916, term3501916.getClass(), "parent", null);
        setField(term3501915, term3501915.getClass(), "next", term3501916);
        setField(term3501918, term3501918.getClass(), "str", null);
        setIntField(term3501918, term3501918.getClass(), "type", 40);
        setField(term3501919, term3501919.getClass(), "str", "");
        setIntField(term3501919, term3501919.getClass(), "type", 40);
        setField(term3501919, term3501919.getClass(), "next", null);
        setField(term3501919, term3501919.getClass(), "first", null);
        setField(term3501919, term3501919.getClass(), "last", null);
        setField(term3501919, term3501919.getClass(), "propListHead", null);
        setIntField(term3501919, term3501919.getClass(), "sourcePosition", 0);
        setField(term3501919, term3501919.getClass(), "jsType", null);
        setField(term3501919, term3501919.getClass(), "parent", null);
        setField(term3501918, term3501918.getClass(), "next", term3501919);
        setField(term3501918, term3501918.getClass(), "first", null);
        setField(term3501918, term3501918.getClass(), "last", null);
        setField(term3501918, term3501918.getClass(), "propListHead", null);
        setIntField(term3501918, term3501918.getClass(), "sourcePosition", 0);
        setField(term3501918, term3501918.getClass(), "jsType", null);
        setField(term3501918, term3501918.getClass(), "parent", null);
        setField(term3501915, term3501915.getClass(), "first", term3501918);
        setField(term3501915, term3501915.getClass(), "last", null);
        setField(term3501915, term3501915.getClass(), "propListHead", null);
        setIntField(term3501915, term3501915.getClass(), "sourcePosition", 0);
        setField(term3501915, term3501915.getClass(), "jsType", null);
        setField(term3501915, term3501915.getClass(), "parent", null);
        setField(term3501914, term3501914.getClass(), "first", term3501915);
        setField(term3501914, term3501914.getClass(), "last", null);
        setField(term3501914, term3501914.getClass(), "propListHead", null);
        setIntField(term3501914, term3501914.getClass(), "sourcePosition", 0);
        setField(term3501914, term3501914.getClass(), "jsType", null);
        setField(term3501914, term3501914.getClass(), "parent", null);
        term3501611 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501613 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501615 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3501618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3501622 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3501624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3501611, term3501611.getClass(), "str", null);
        setIntField(term3501611, term3501611.getClass(), "type", 37);
        setField(term3501611, term3501611.getClass(), "next", null);
        setField(term3501613, term3501613.getClass(), "str", null);
        setIntField(term3501613, term3501613.getClass(), "type", 35);
        setDoubleField(term3501615, term3501615.getClass(), "number", 0.0);
        setIntField(term3501615, term3501615.getClass(), "type", 39);
        setIntField(term3501618, term3501618.getClass(), "type", 0);
        setField(term3501618, term3501618.getClass(), "next", null);
        setField(term3501618, term3501618.getClass(), "first", null);
        setField(term3501618, term3501618.getClass(), "last", null);
        setField(term3501618, term3501618.getClass(), "propListHead", null);
        setIntField(term3501618, term3501618.getClass(), "sourcePosition", 0);
        setField(term3501618, term3501618.getClass(), "jsType", null);
        setField(term3501618, term3501618.getClass(), "parent", null);
        setField(term3501615, term3501615.getClass(), "next", term3501618);
        setField(term3501615, term3501615.getClass(), "first", null);
        setField(term3501615, term3501615.getClass(), "last", null);
        setField(term3501615, term3501615.getClass(), "propListHead", null);
        setIntField(term3501615, term3501615.getClass(), "sourcePosition", 0);
        setField(term3501615, term3501615.getClass(), "jsType", null);
        setField(term3501615, term3501615.getClass(), "parent", null);
        setField(term3501613, term3501613.getClass(), "next", term3501615);
        setField(term3501622, term3501622.getClass(), "str", null);
        setIntField(term3501622, term3501622.getClass(), "type", 40);
        setField(term3501624, term3501624.getClass(), "str", "");
        setIntField(term3501624, term3501624.getClass(), "type", 40);
        setField(term3501624, term3501624.getClass(), "next", null);
        setField(term3501624, term3501624.getClass(), "first", null);
        setField(term3501624, term3501624.getClass(), "last", null);
        setField(term3501624, term3501624.getClass(), "propListHead", null);
        setIntField(term3501624, term3501624.getClass(), "sourcePosition", 0);
        setField(term3501624, term3501624.getClass(), "jsType", null);
        setField(term3501624, term3501624.getClass(), "parent", null);
        setField(term3501622, term3501622.getClass(), "next", term3501624);
        setField(term3501622, term3501622.getClass(), "first", null);
        setField(term3501622, term3501622.getClass(), "last", null);
        setField(term3501622, term3501622.getClass(), "propListHead", null);
        setIntField(term3501622, term3501622.getClass(), "sourcePosition", 0);
        setField(term3501622, term3501622.getClass(), "jsType", null);
        setField(term3501622, term3501622.getClass(), "parent", null);
        setField(term3501613, term3501613.getClass(), "first", term3501622);
        setField(term3501613, term3501613.getClass(), "last", null);
        setField(term3501613, term3501613.getClass(), "propListHead", null);
        setIntField(term3501613, term3501613.getClass(), "sourcePosition", 0);
        setField(term3501613, term3501613.getClass(), "jsType", null);
        setField(term3501613, term3501613.getClass(), "parent", null);
        setField(term3501611, term3501611.getClass(), "first", term3501613);
        setField(term3501611, term3501611.getClass(), "last", null);
        setField(term3501611, term3501611.getClass(), "propListHead", null);
        setIntField(term3501611, term3501611.getClass(), "sourcePosition", 0);
        setField(term3501611, term3501611.getClass(), "jsType", null);
        setField(term3501611, term3501611.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3499223;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3499131, args);
        assertTrue(recursiveEquals(term3499131, term3501913));
        assertTrue(recursiveEquals(term3499223, term3501914));
        assertTrue(recursiveEquals(retValue, term3501611));
    }

};


