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

public class PeepholeFoldConstants_tryFoldComparison_8484431791092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338477;
     Object term338569;
     Object term338661;
     Object term338753;
     Object term339125;
     Object term339126;
     Object term339127;
     Object term339128;
     Object term339105;

    public PeepholeFoldConstants_tryFoldComparison_8484431791092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term338569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term338569, term338569.getClass(), "type", 14);
        term338661 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term338661, term338661.getClass(), "type", 14);
        term338753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term339125 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term339125, term339125.getClass(), "currentTraversal", null);
        term339126 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term339126, term339126.getClass(), "str", null);
        setIntField(term339126, term339126.getClass(), "type", 14);
        setField(term339126, term339126.getClass(), "next", null);
        setField(term339126, term339126.getClass(), "first", null);
        setField(term339126, term339126.getClass(), "last", null);
        setField(term339126, term339126.getClass(), "propListHead", null);
        setIntField(term339126, term339126.getClass(), "sourcePosition", 0);
        setField(term339126, term339126.getClass(), "jsType", null);
        setField(term339126, term339126.getClass(), "parent", null);
        term339127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term339127, term339127.getClass(), "str", null);
        setIntField(term339127, term339127.getClass(), "type", 14);
        setField(term339127, term339127.getClass(), "next", null);
        setField(term339127, term339127.getClass(), "first", null);
        setField(term339127, term339127.getClass(), "last", null);
        setField(term339127, term339127.getClass(), "propListHead", null);
        setIntField(term339127, term339127.getClass(), "sourcePosition", 0);
        setField(term339127, term339127.getClass(), "jsType", null);
        setField(term339127, term339127.getClass(), "parent", null);
        term339128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term339128, term339128.getClass(), "str", null);
        setIntField(term339128, term339128.getClass(), "type", 0);
        setField(term339128, term339128.getClass(), "next", null);
        setField(term339128, term339128.getClass(), "first", null);
        setField(term339128, term339128.getClass(), "last", null);
        setField(term339128, term339128.getClass(), "propListHead", null);
        setIntField(term339128, term339128.getClass(), "sourcePosition", 0);
        setField(term339128, term339128.getClass(), "jsType", null);
        setField(term339128, term339128.getClass(), "parent", null);
        term339105 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term339105, term339105.getClass(), "str", null);
        setIntField(term339105, term339105.getClass(), "type", 14);
        setField(term339105, term339105.getClass(), "next", null);
        setField(term339105, term339105.getClass(), "first", null);
        setField(term339105, term339105.getClass(), "last", null);
        setField(term339105, term339105.getClass(), "propListHead", null);
        setIntField(term339105, term339105.getClass(), "sourcePosition", 0);
        setField(term339105, term339105.getClass(), "jsType", null);
        setField(term339105, term339105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term338569;
        args[1] = term338661;
        args[2] = term338753;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term338477, args);
        assertTrue(recursiveEquals(term338477, term339125));
        assertTrue(recursiveEquals(term338569, term339126));
        assertTrue(recursiveEquals(term338661, term339127));
        assertTrue(recursiveEquals(term338753, term339128));
        assertTrue(recursiveEquals(retValue, term339105));
    }

};


