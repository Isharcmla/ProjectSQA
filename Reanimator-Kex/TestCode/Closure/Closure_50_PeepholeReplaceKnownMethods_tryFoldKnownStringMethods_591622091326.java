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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2627603;
     Object term2627673;
     Object term2628237;
     Object term2628238;
     Object term2628200;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2627603 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2627673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2627743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2627813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2627673, term2627673.getClass(), "type", 37);
        setIntField(term2627743, term2627743.getClass(), "type", 35);
        setField(term2627743, term2627743.getClass(), "first", term2627813);
        setField(term2627673, term2627673.getClass(), "first", term2627743);
        term2628237 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2628237, term2628237.getClass(), "currentTraversal", null);
        term2628238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2628238, term2628238.getClass(), "type", 37);
        setField(term2628238, term2628238.getClass(), "next", null);
        setIntField(term2628239, term2628239.getClass(), "type", 35);
        setField(term2628239, term2628239.getClass(), "next", null);
        setIntField(term2628240, term2628240.getClass(), "type", 0);
        setField(term2628240, term2628240.getClass(), "next", null);
        setField(term2628240, term2628240.getClass(), "first", null);
        setField(term2628240, term2628240.getClass(), "last", null);
        setField(term2628240, term2628240.getClass(), "propListHead", null);
        setIntField(term2628240, term2628240.getClass(), "sourcePosition", 0);
        setField(term2628240, term2628240.getClass(), "jsType", null);
        setField(term2628240, term2628240.getClass(), "parent", null);
        setField(term2628239, term2628239.getClass(), "first", term2628240);
        setField(term2628239, term2628239.getClass(), "last", null);
        setField(term2628239, term2628239.getClass(), "propListHead", null);
        setIntField(term2628239, term2628239.getClass(), "sourcePosition", 0);
        setField(term2628239, term2628239.getClass(), "jsType", null);
        setField(term2628239, term2628239.getClass(), "parent", null);
        setField(term2628238, term2628238.getClass(), "first", term2628239);
        setField(term2628238, term2628238.getClass(), "last", null);
        setField(term2628238, term2628238.getClass(), "propListHead", null);
        setIntField(term2628238, term2628238.getClass(), "sourcePosition", 0);
        setField(term2628238, term2628238.getClass(), "jsType", null);
        setField(term2628238, term2628238.getClass(), "parent", null);
        term2628200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2628204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2628200, term2628200.getClass(), "type", 37);
        setField(term2628200, term2628200.getClass(), "next", null);
        setIntField(term2628202, term2628202.getClass(), "type", 35);
        setField(term2628202, term2628202.getClass(), "next", null);
        setIntField(term2628204, term2628204.getClass(), "type", 0);
        setField(term2628204, term2628204.getClass(), "next", null);
        setField(term2628204, term2628204.getClass(), "first", null);
        setField(term2628204, term2628204.getClass(), "last", null);
        setField(term2628204, term2628204.getClass(), "propListHead", null);
        setIntField(term2628204, term2628204.getClass(), "sourcePosition", 0);
        setField(term2628204, term2628204.getClass(), "jsType", null);
        setField(term2628204, term2628204.getClass(), "parent", null);
        setField(term2628202, term2628202.getClass(), "first", term2628204);
        setField(term2628202, term2628202.getClass(), "last", null);
        setField(term2628202, term2628202.getClass(), "propListHead", null);
        setIntField(term2628202, term2628202.getClass(), "sourcePosition", 0);
        setField(term2628202, term2628202.getClass(), "jsType", null);
        setField(term2628202, term2628202.getClass(), "parent", null);
        setField(term2628200, term2628200.getClass(), "first", term2628202);
        setField(term2628200, term2628200.getClass(), "last", null);
        setField(term2628200, term2628200.getClass(), "propListHead", null);
        setIntField(term2628200, term2628200.getClass(), "sourcePosition", 0);
        setField(term2628200, term2628200.getClass(), "jsType", null);
        setField(term2628200, term2628200.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2627673;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2627603, args);
        assertTrue(recursiveEquals(term2627603, term2628237));
        assertTrue(recursiveEquals(term2627673, term2628238));
        assertTrue(recursiveEquals(retValue, term2628200));
    }

};


