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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2647931;
     Object term2648023;
     Object term2650167;
     Object term2650168;
     Object term2650111;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2647931 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2648023 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2648115 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2648185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2648277 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2648023, term2648023.getClass(), "type", 37);
        setIntField(term2648115, term2648115.getClass(), "type", 33);
        setField(term2648185, term2648185.getClass(), "next", term2648277);
        setIntField(term2648185, term2648185.getClass(), "type", 40);
        setField(term2648115, term2648115.getClass(), "first", term2648185);
        setField(term2648023, term2648023.getClass(), "first", term2648115);
        term2650167 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2650167, term2650167.getClass(), "currentTraversal", null);
        term2650168 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2650169 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2650170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2650171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2650168, term2650168.getClass(), "number", 0.0);
        setIntField(term2650168, term2650168.getClass(), "type", 37);
        setField(term2650168, term2650168.getClass(), "next", null);
        setField(term2650169, term2650169.getClass(), "str", null);
        setIntField(term2650169, term2650169.getClass(), "type", 33);
        setField(term2650169, term2650169.getClass(), "next", null);
        setIntField(term2650170, term2650170.getClass(), "type", 40);
        setField(term2650171, term2650171.getClass(), "str", null);
        setIntField(term2650171, term2650171.getClass(), "type", 0);
        setField(term2650171, term2650171.getClass(), "next", null);
        setField(term2650171, term2650171.getClass(), "first", null);
        setField(term2650171, term2650171.getClass(), "last", null);
        setField(term2650171, term2650171.getClass(), "propListHead", null);
        setIntField(term2650171, term2650171.getClass(), "sourcePosition", 0);
        setField(term2650171, term2650171.getClass(), "jsType", null);
        setField(term2650171, term2650171.getClass(), "parent", null);
        setField(term2650170, term2650170.getClass(), "next", term2650171);
        setField(term2650170, term2650170.getClass(), "first", null);
        setField(term2650170, term2650170.getClass(), "last", null);
        setField(term2650170, term2650170.getClass(), "propListHead", null);
        setIntField(term2650170, term2650170.getClass(), "sourcePosition", 0);
        setField(term2650170, term2650170.getClass(), "jsType", null);
        setField(term2650170, term2650170.getClass(), "parent", null);
        setField(term2650169, term2650169.getClass(), "first", term2650170);
        setField(term2650169, term2650169.getClass(), "last", null);
        setField(term2650169, term2650169.getClass(), "propListHead", null);
        setIntField(term2650169, term2650169.getClass(), "sourcePosition", 0);
        setField(term2650169, term2650169.getClass(), "jsType", null);
        setField(term2650169, term2650169.getClass(), "parent", null);
        setField(term2650168, term2650168.getClass(), "first", term2650169);
        setField(term2650168, term2650168.getClass(), "last", null);
        setField(term2650168, term2650168.getClass(), "propListHead", null);
        setIntField(term2650168, term2650168.getClass(), "sourcePosition", 0);
        setField(term2650168, term2650168.getClass(), "jsType", null);
        setField(term2650168, term2650168.getClass(), "parent", null);
        term2650111 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2650114 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2650116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2650118 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term2650111, term2650111.getClass(), "number", 0.0);
        setIntField(term2650111, term2650111.getClass(), "type", 37);
        setField(term2650111, term2650111.getClass(), "next", null);
        setField(term2650114, term2650114.getClass(), "str", null);
        setIntField(term2650114, term2650114.getClass(), "type", 33);
        setField(term2650114, term2650114.getClass(), "next", null);
        setIntField(term2650116, term2650116.getClass(), "type", 40);
        setField(term2650118, term2650118.getClass(), "str", null);
        setIntField(term2650118, term2650118.getClass(), "type", 0);
        setField(term2650118, term2650118.getClass(), "next", null);
        setField(term2650118, term2650118.getClass(), "first", null);
        setField(term2650118, term2650118.getClass(), "last", null);
        setField(term2650118, term2650118.getClass(), "propListHead", null);
        setIntField(term2650118, term2650118.getClass(), "sourcePosition", 0);
        setField(term2650118, term2650118.getClass(), "jsType", null);
        setField(term2650118, term2650118.getClass(), "parent", null);
        setField(term2650116, term2650116.getClass(), "next", term2650118);
        setField(term2650116, term2650116.getClass(), "first", null);
        setField(term2650116, term2650116.getClass(), "last", null);
        setField(term2650116, term2650116.getClass(), "propListHead", null);
        setIntField(term2650116, term2650116.getClass(), "sourcePosition", 0);
        setField(term2650116, term2650116.getClass(), "jsType", null);
        setField(term2650116, term2650116.getClass(), "parent", null);
        setField(term2650114, term2650114.getClass(), "first", term2650116);
        setField(term2650114, term2650114.getClass(), "last", null);
        setField(term2650114, term2650114.getClass(), "propListHead", null);
        setIntField(term2650114, term2650114.getClass(), "sourcePosition", 0);
        setField(term2650114, term2650114.getClass(), "jsType", null);
        setField(term2650114, term2650114.getClass(), "parent", null);
        setField(term2650111, term2650111.getClass(), "first", term2650114);
        setField(term2650111, term2650111.getClass(), "last", null);
        setField(term2650111, term2650111.getClass(), "propListHead", null);
        setIntField(term2650111, term2650111.getClass(), "sourcePosition", 0);
        setField(term2650111, term2650111.getClass(), "jsType", null);
        setField(term2650111, term2650111.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2648023;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2647931, args);
        assertTrue(recursiveEquals(term2647931, term2650167));
        assertTrue(recursiveEquals(term2648023, term2650168));
        assertTrue(recursiveEquals(retValue, term2650111));
    }

};


