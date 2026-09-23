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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3215704;
     Object term3215796;
     Object term3217008;
     Object term3217009;
     Object term3216819;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3215704 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3215796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3215980 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216072 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216202 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3215888, term3215888.getClass(), "type", 35);
        setIntField(term3216072, term3216072.getClass(), "type", 40);
        setField(term3216072, term3216072.getClass(), "str", "");
        setField(term3215980, term3215980.getClass(), "next", term3216072);
        setIntField(term3215980, term3215980.getClass(), "type", 40);
        setField(term3215888, term3215888.getClass(), "first", term3215980);
        setIntField(term3216202, term3216202.getClass(), "type", 44);
        setField(term3215888, term3215888.getClass(), "next", term3216202);
        setField(term3215796, term3215796.getClass(), "first", term3215888);
        setIntField(term3215796, term3215796.getClass(), "type", 37);
        term3217008 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3217008, term3217008.getClass(), "currentTraversal", null);
        term3217009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217010 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217012 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3217013 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3217009, term3217009.getClass(), "str", null);
        setIntField(term3217009, term3217009.getClass(), "type", 37);
        setField(term3217009, term3217009.getClass(), "next", null);
        setField(term3217010, term3217010.getClass(), "str", null);
        setIntField(term3217010, term3217010.getClass(), "type", 35);
        setField(term3217011, term3217011.getClass(), "str", null);
        setIntField(term3217011, term3217011.getClass(), "type", 44);
        setField(term3217011, term3217011.getClass(), "next", null);
        setField(term3217011, term3217011.getClass(), "first", null);
        setField(term3217011, term3217011.getClass(), "last", null);
        setField(term3217011, term3217011.getClass(), "propListHead", null);
        setIntField(term3217011, term3217011.getClass(), "sourcePosition", 0);
        setField(term3217011, term3217011.getClass(), "jsType", null);
        setField(term3217011, term3217011.getClass(), "parent", null);
        setField(term3217010, term3217010.getClass(), "next", term3217011);
        setField(term3217012, term3217012.getClass(), "str", null);
        setIntField(term3217012, term3217012.getClass(), "type", 40);
        setField(term3217013, term3217013.getClass(), "str", "");
        setIntField(term3217013, term3217013.getClass(), "type", 40);
        setField(term3217013, term3217013.getClass(), "next", null);
        setField(term3217013, term3217013.getClass(), "first", null);
        setField(term3217013, term3217013.getClass(), "last", null);
        setField(term3217013, term3217013.getClass(), "propListHead", null);
        setIntField(term3217013, term3217013.getClass(), "sourcePosition", 0);
        setField(term3217013, term3217013.getClass(), "jsType", null);
        setField(term3217013, term3217013.getClass(), "parent", null);
        setField(term3217012, term3217012.getClass(), "next", term3217013);
        setField(term3217012, term3217012.getClass(), "first", null);
        setField(term3217012, term3217012.getClass(), "last", null);
        setField(term3217012, term3217012.getClass(), "propListHead", null);
        setIntField(term3217012, term3217012.getClass(), "sourcePosition", 0);
        setField(term3217012, term3217012.getClass(), "jsType", null);
        setField(term3217012, term3217012.getClass(), "parent", null);
        setField(term3217010, term3217010.getClass(), "first", term3217012);
        setField(term3217010, term3217010.getClass(), "last", null);
        setField(term3217010, term3217010.getClass(), "propListHead", null);
        setIntField(term3217010, term3217010.getClass(), "sourcePosition", 0);
        setField(term3217010, term3217010.getClass(), "jsType", null);
        setField(term3217010, term3217010.getClass(), "parent", null);
        setField(term3217009, term3217009.getClass(), "first", term3217010);
        setField(term3217009, term3217009.getClass(), "last", null);
        setField(term3217009, term3217009.getClass(), "propListHead", null);
        setIntField(term3217009, term3217009.getClass(), "sourcePosition", 0);
        setField(term3217009, term3217009.getClass(), "jsType", null);
        setField(term3217009, term3217009.getClass(), "parent", null);
        term3216819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216828 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3216819, term3216819.getClass(), "str", null);
        setIntField(term3216819, term3216819.getClass(), "type", 37);
        setField(term3216819, term3216819.getClass(), "next", null);
        setField(term3216821, term3216821.getClass(), "str", null);
        setIntField(term3216821, term3216821.getClass(), "type", 35);
        setField(term3216823, term3216823.getClass(), "str", null);
        setIntField(term3216823, term3216823.getClass(), "type", 44);
        setField(term3216823, term3216823.getClass(), "next", null);
        setField(term3216823, term3216823.getClass(), "first", null);
        setField(term3216823, term3216823.getClass(), "last", null);
        setField(term3216823, term3216823.getClass(), "propListHead", null);
        setIntField(term3216823, term3216823.getClass(), "sourcePosition", 0);
        setField(term3216823, term3216823.getClass(), "jsType", null);
        setField(term3216823, term3216823.getClass(), "parent", null);
        setField(term3216821, term3216821.getClass(), "next", term3216823);
        setField(term3216826, term3216826.getClass(), "str", null);
        setIntField(term3216826, term3216826.getClass(), "type", 40);
        setField(term3216828, term3216828.getClass(), "str", "");
        setIntField(term3216828, term3216828.getClass(), "type", 40);
        setField(term3216828, term3216828.getClass(), "next", null);
        setField(term3216828, term3216828.getClass(), "first", null);
        setField(term3216828, term3216828.getClass(), "last", null);
        setField(term3216828, term3216828.getClass(), "propListHead", null);
        setIntField(term3216828, term3216828.getClass(), "sourcePosition", 0);
        setField(term3216828, term3216828.getClass(), "jsType", null);
        setField(term3216828, term3216828.getClass(), "parent", null);
        setField(term3216826, term3216826.getClass(), "next", term3216828);
        setField(term3216826, term3216826.getClass(), "first", null);
        setField(term3216826, term3216826.getClass(), "last", null);
        setField(term3216826, term3216826.getClass(), "propListHead", null);
        setIntField(term3216826, term3216826.getClass(), "sourcePosition", 0);
        setField(term3216826, term3216826.getClass(), "jsType", null);
        setField(term3216826, term3216826.getClass(), "parent", null);
        setField(term3216821, term3216821.getClass(), "first", term3216826);
        setField(term3216821, term3216821.getClass(), "last", null);
        setField(term3216821, term3216821.getClass(), "propListHead", null);
        setIntField(term3216821, term3216821.getClass(), "sourcePosition", 0);
        setField(term3216821, term3216821.getClass(), "jsType", null);
        setField(term3216821, term3216821.getClass(), "parent", null);
        setField(term3216819, term3216819.getClass(), "first", term3216821);
        setField(term3216819, term3216819.getClass(), "last", null);
        setField(term3216819, term3216819.getClass(), "propListHead", null);
        setIntField(term3216819, term3216819.getClass(), "sourcePosition", 0);
        setField(term3216819, term3216819.getClass(), "jsType", null);
        setField(term3216819, term3216819.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3215796;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3215704, args);
        assertTrue(recursiveEquals(term3215704, term3217008));
        assertTrue(recursiveEquals(term3215796, term3217009));
        assertTrue(recursiveEquals(retValue, term3216819));
    }

};


