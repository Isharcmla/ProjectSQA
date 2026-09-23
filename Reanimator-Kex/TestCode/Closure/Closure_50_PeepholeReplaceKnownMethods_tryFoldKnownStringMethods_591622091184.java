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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54400;
     Object term54492;
     Object term57133;
     Object term57134;
     Object term57107;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term54492 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term54584 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term54492, term54492.getClass(), "type", 37);
        setField(term54492, term54492.getClass(), "first", term54584);
        term57133 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term57133, term57133.getClass(), "currentTraversal", null);
        term57134 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57135 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term57134, term57134.getClass(), "str", null);
        setIntField(term57134, term57134.getClass(), "type", 37);
        setField(term57134, term57134.getClass(), "next", null);
        setDoubleField(term57135, term57135.getClass(), "number", 0.0);
        setIntField(term57135, term57135.getClass(), "type", 0);
        setField(term57135, term57135.getClass(), "next", null);
        setField(term57135, term57135.getClass(), "first", null);
        setField(term57135, term57135.getClass(), "last", null);
        setField(term57135, term57135.getClass(), "propListHead", null);
        setIntField(term57135, term57135.getClass(), "sourcePosition", 0);
        setField(term57135, term57135.getClass(), "jsType", null);
        setField(term57135, term57135.getClass(), "parent", null);
        setField(term57134, term57134.getClass(), "first", term57135);
        setField(term57134, term57134.getClass(), "last", null);
        setField(term57134, term57134.getClass(), "propListHead", null);
        setIntField(term57134, term57134.getClass(), "sourcePosition", 0);
        setField(term57134, term57134.getClass(), "jsType", null);
        setField(term57134, term57134.getClass(), "parent", null);
        term57107 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term57109 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term57107, term57107.getClass(), "str", null);
        setIntField(term57107, term57107.getClass(), "type", 37);
        setField(term57107, term57107.getClass(), "next", null);
        setDoubleField(term57109, term57109.getClass(), "number", 0.0);
        setIntField(term57109, term57109.getClass(), "type", 0);
        setField(term57109, term57109.getClass(), "next", null);
        setField(term57109, term57109.getClass(), "first", null);
        setField(term57109, term57109.getClass(), "last", null);
        setField(term57109, term57109.getClass(), "propListHead", null);
        setIntField(term57109, term57109.getClass(), "sourcePosition", 0);
        setField(term57109, term57109.getClass(), "jsType", null);
        setField(term57109, term57109.getClass(), "parent", null);
        setField(term57107, term57107.getClass(), "first", term57109);
        setField(term57107, term57107.getClass(), "last", null);
        setField(term57107, term57107.getClass(), "propListHead", null);
        setIntField(term57107, term57107.getClass(), "sourcePosition", 0);
        setField(term57107, term57107.getClass(), "jsType", null);
        setField(term57107, term57107.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54492;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term54400, args);
        assertTrue(recursiveEquals(term54400, term57133));
        assertTrue(recursiveEquals(term54492, term57134));
        assertTrue(recursiveEquals(retValue, term57107));
    }

};


