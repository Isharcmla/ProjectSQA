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

public class PeepholeFoldConstants_tryReduceVoid_942546715160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26443;
     Object term26603;
     Object term27010;
     Object term27012;
     Object term26983;

    public PeepholeFoldConstants_tryReduceVoid_942546715160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term26533 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term26533, term26533.getClass(), "compiler", null);
        setField(term26443, term26443.getClass(), "currentTraversal", term26533);
        term26603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26673, term26673.getClass(), "type", 31);
        setField(term26603, term26603.getClass(), "first", term26673);
        setIntField(term26603, term26603.getClass(), "type", 31);
        term27010 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term27011 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term27011, term27011.getClass(), "compiler", null);
        setField(term27011, term27011.getClass(), "callback", null);
        setField(term27011, term27011.getClass(), "curNode", null);
        setField(term27011, term27011.getClass(), "scopes", null);
        setField(term27011, term27011.getClass(), "scopeRoots", null);
        setField(term27011, term27011.getClass(), "cfgs", null);
        setField(term27011, term27011.getClass(), "sourceName", null);
        setField(term27011, term27011.getClass(), "scopeCreator", null);
        setField(term27011, term27011.getClass(), "scopeCallback", null);
        setField(term27010, term27010.getClass(), "currentTraversal", term27011);
        term27012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27012, term27012.getClass(), "type", 31);
        setField(term27012, term27012.getClass(), "next", null);
        setIntField(term27013, term27013.getClass(), "type", 31);
        setField(term27013, term27013.getClass(), "next", null);
        setField(term27013, term27013.getClass(), "first", null);
        setField(term27013, term27013.getClass(), "last", null);
        setField(term27013, term27013.getClass(), "propListHead", null);
        setIntField(term27013, term27013.getClass(), "sourcePosition", 0);
        setField(term27013, term27013.getClass(), "jsType", null);
        setField(term27013, term27013.getClass(), "parent", null);
        setField(term27012, term27012.getClass(), "first", term27013);
        setField(term27012, term27012.getClass(), "last", null);
        setField(term27012, term27012.getClass(), "propListHead", null);
        setIntField(term27012, term27012.getClass(), "sourcePosition", 0);
        setField(term27012, term27012.getClass(), "jsType", null);
        setField(term27012, term27012.getClass(), "parent", null);
        term26983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26983, term26983.getClass(), "type", 31);
        setField(term26983, term26983.getClass(), "next", null);
        setIntField(term26985, term26985.getClass(), "type", 31);
        setField(term26985, term26985.getClass(), "next", null);
        setField(term26985, term26985.getClass(), "first", null);
        setField(term26985, term26985.getClass(), "last", null);
        setField(term26985, term26985.getClass(), "propListHead", null);
        setIntField(term26985, term26985.getClass(), "sourcePosition", 0);
        setField(term26985, term26985.getClass(), "jsType", null);
        setField(term26985, term26985.getClass(), "parent", null);
        setField(term26983, term26983.getClass(), "first", term26985);
        setField(term26983, term26983.getClass(), "last", null);
        setField(term26983, term26983.getClass(), "propListHead", null);
        setIntField(term26983, term26983.getClass(), "sourcePosition", 0);
        setField(term26983, term26983.getClass(), "jsType", null);
        setField(term26983, term26983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26603;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term26443, args);
        assertTrue(recursiveEquals(term26443, term27010));
        assertTrue(recursiveEquals(term26603, term27012));
        assertTrue(recursiveEquals(retValue, term26983));
    }

};


