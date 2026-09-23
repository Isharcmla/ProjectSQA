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

public class PeepholeFoldConstants_tryReduceVoid_94254671567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10682;
     Object term10842;
     Object term10955;
     Object term10957;
     Object term10928;

    public PeepholeFoldConstants_tryReduceVoid_94254671567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10682 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term10772 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term10772, term10772.getClass(), "compiler", null);
        setField(term10682, term10682.getClass(), "currentTraversal", term10772);
        term10842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10912, term10912.getClass(), "type", 129);
        setField(term10842, term10842.getClass(), "first", term10912);
        setIntField(term10842, term10842.getClass(), "type", 129);
        term10955 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term10956 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term10956, term10956.getClass(), "compiler", null);
        setField(term10956, term10956.getClass(), "callback", null);
        setField(term10956, term10956.getClass(), "curNode", null);
        setField(term10956, term10956.getClass(), "scopes", null);
        setField(term10956, term10956.getClass(), "scopeRoots", null);
        setField(term10956, term10956.getClass(), "cfgs", null);
        setField(term10956, term10956.getClass(), "sourceName", null);
        setField(term10956, term10956.getClass(), "scopeCreator", null);
        setField(term10956, term10956.getClass(), "scopeCallback", null);
        setField(term10955, term10955.getClass(), "currentTraversal", term10956);
        term10957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10957, term10957.getClass(), "type", 129);
        setField(term10957, term10957.getClass(), "next", null);
        setIntField(term10958, term10958.getClass(), "type", 129);
        setField(term10958, term10958.getClass(), "next", null);
        setField(term10958, term10958.getClass(), "first", null);
        setField(term10958, term10958.getClass(), "last", null);
        setField(term10958, term10958.getClass(), "propListHead", null);
        setIntField(term10958, term10958.getClass(), "sourcePosition", 0);
        setField(term10958, term10958.getClass(), "jsType", null);
        setField(term10958, term10958.getClass(), "parent", null);
        setField(term10957, term10957.getClass(), "first", term10958);
        setField(term10957, term10957.getClass(), "last", null);
        setField(term10957, term10957.getClass(), "propListHead", null);
        setIntField(term10957, term10957.getClass(), "sourcePosition", 0);
        setField(term10957, term10957.getClass(), "jsType", null);
        setField(term10957, term10957.getClass(), "parent", null);
        term10928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10928, term10928.getClass(), "type", 129);
        setField(term10928, term10928.getClass(), "next", null);
        setIntField(term10930, term10930.getClass(), "type", 129);
        setField(term10930, term10930.getClass(), "next", null);
        setField(term10930, term10930.getClass(), "first", null);
        setField(term10930, term10930.getClass(), "last", null);
        setField(term10930, term10930.getClass(), "propListHead", null);
        setIntField(term10930, term10930.getClass(), "sourcePosition", 0);
        setField(term10930, term10930.getClass(), "jsType", null);
        setField(term10930, term10930.getClass(), "parent", null);
        setField(term10928, term10928.getClass(), "first", term10930);
        setField(term10928, term10928.getClass(), "last", null);
        setField(term10928, term10928.getClass(), "propListHead", null);
        setIntField(term10928, term10928.getClass(), "sourcePosition", 0);
        setField(term10928, term10928.getClass(), "jsType", null);
        setField(term10928, term10928.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10842;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term10682, args);
        assertTrue(recursiveEquals(term10682, term10955));
        assertTrue(recursiveEquals(term10842, term10957));
        assertTrue(recursiveEquals(retValue, term10928));
    }

};


