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

public class NodeUtil_isObjectCallMethod_1353612968189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923;
     Object term12234;

    public NodeUtil_isObjectCallMethod_1353612968189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1936 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1946 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1923, term1923.getClass(), "type", 722519669);
        setIntField(term1925, term1925.getClass(), "type", 848428785);
        setIntField(term1927, term1927.getClass(), "type", 0);
        setField(term1927, term1927.getClass(), "next", null);
        setField(term1927, term1927.getClass(), "first", null);
        setField(term1927, term1927.getClass(), "last", null);
        setField(term1927, term1927.getClass(), "propListHead", null);
        setIntField(term1927, term1927.getClass(), "sourcePosition", 0);
        setField(term1927, term1927.getClass(), "jsType", null);
        setField(term1927, term1927.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "next", term1927);
        setIntField(term1930, term1930.getClass(), "type", 0);
        setField(term1930, term1930.getClass(), "next", null);
        setField(term1930, term1930.getClass(), "first", null);
        setField(term1930, term1930.getClass(), "last", null);
        setField(term1930, term1930.getClass(), "propListHead", null);
        setIntField(term1930, term1930.getClass(), "sourcePosition", 0);
        setField(term1930, term1930.getClass(), "jsType", null);
        setField(term1930, term1930.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "first", term1930);
        setIntField(term1933, term1933.getClass(), "type", 0);
        setField(term1933, term1933.getClass(), "next", null);
        setField(term1933, term1933.getClass(), "first", null);
        setField(term1933, term1933.getClass(), "last", null);
        setField(term1933, term1933.getClass(), "propListHead", null);
        setIntField(term1933, term1933.getClass(), "sourcePosition", 0);
        setField(term1933, term1933.getClass(), "jsType", null);
        setField(term1933, term1933.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "last", term1933);
        setField(term1936, term1936.getClass(), "next", null);
        setIntField(term1936, term1936.getClass(), "type", 0);
        setIntField(term1936, term1936.getClass(), "intValue", 0);
        setField(term1936, term1936.getClass(), "objectValue", null);
        setField(term1925, term1925.getClass(), "propListHead", term1936);
        setIntField(term1925, term1925.getClass(), "sourcePosition", 1190753616);
        setField(term1925, term1925.getClass(), "jsType", null);
        setField(term1925, term1925.getClass(), "parent", null);
        setField(term1923, term1923.getClass(), "next", term1925);
        setIntField(term1940, term1940.getClass(), "type", 0);
        setField(term1940, term1940.getClass(), "next", null);
        setField(term1940, term1940.getClass(), "first", null);
        setField(term1940, term1940.getClass(), "last", null);
        setField(term1940, term1940.getClass(), "propListHead", null);
        setIntField(term1940, term1940.getClass(), "sourcePosition", 0);
        setField(term1940, term1940.getClass(), "jsType", null);
        setField(term1940, term1940.getClass(), "parent", null);
        setField(term1923, term1923.getClass(), "first", term1940);
        setIntField(term1943, term1943.getClass(), "type", 0);
        setField(term1943, term1943.getClass(), "next", null);
        setField(term1943, term1943.getClass(), "first", null);
        setField(term1943, term1943.getClass(), "last", null);
        setField(term1943, term1943.getClass(), "propListHead", null);
        setIntField(term1943, term1943.getClass(), "sourcePosition", 0);
        setField(term1943, term1943.getClass(), "jsType", null);
        setField(term1943, term1943.getClass(), "parent", null);
        setField(term1923, term1923.getClass(), "last", term1943);
        setField(term1946, term1946.getClass(), "next", null);
        setIntField(term1946, term1946.getClass(), "type", 0);
        setIntField(term1946, term1946.getClass(), "intValue", 0);
        setField(term1946, term1946.getClass(), "objectValue", null);
        setField(term1923, term1923.getClass(), "propListHead", term1946);
        setIntField(term1923, term1923.getClass(), "sourcePosition", -752378450);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        term12234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12239 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12242 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12234, term12234.getClass(), "type", 722519669);
        setIntField(term12235, term12235.getClass(), "type", 848428785);
        setIntField(term12236, term12236.getClass(), "type", 0);
        setField(term12236, term12236.getClass(), "next", null);
        setField(term12236, term12236.getClass(), "first", null);
        setField(term12236, term12236.getClass(), "last", null);
        setField(term12236, term12236.getClass(), "propListHead", null);
        setIntField(term12236, term12236.getClass(), "sourcePosition", 0);
        setField(term12236, term12236.getClass(), "jsType", null);
        setField(term12236, term12236.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "next", term12236);
        setIntField(term12237, term12237.getClass(), "type", 0);
        setField(term12237, term12237.getClass(), "next", null);
        setField(term12237, term12237.getClass(), "first", null);
        setField(term12237, term12237.getClass(), "last", null);
        setField(term12237, term12237.getClass(), "propListHead", null);
        setIntField(term12237, term12237.getClass(), "sourcePosition", 0);
        setField(term12237, term12237.getClass(), "jsType", null);
        setField(term12237, term12237.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "first", term12237);
        setIntField(term12238, term12238.getClass(), "type", 0);
        setField(term12238, term12238.getClass(), "next", null);
        setField(term12238, term12238.getClass(), "first", null);
        setField(term12238, term12238.getClass(), "last", null);
        setField(term12238, term12238.getClass(), "propListHead", null);
        setIntField(term12238, term12238.getClass(), "sourcePosition", 0);
        setField(term12238, term12238.getClass(), "jsType", null);
        setField(term12238, term12238.getClass(), "parent", null);
        setField(term12235, term12235.getClass(), "last", term12238);
        setField(term12239, term12239.getClass(), "next", null);
        setIntField(term12239, term12239.getClass(), "type", 0);
        setIntField(term12239, term12239.getClass(), "intValue", 0);
        setField(term12239, term12239.getClass(), "objectValue", null);
        setField(term12235, term12235.getClass(), "propListHead", term12239);
        setIntField(term12235, term12235.getClass(), "sourcePosition", 1190753616);
        setField(term12235, term12235.getClass(), "jsType", null);
        setField(term12235, term12235.getClass(), "parent", null);
        setField(term12234, term12234.getClass(), "next", term12235);
        setIntField(term12240, term12240.getClass(), "type", 0);
        setField(term12240, term12240.getClass(), "next", null);
        setField(term12240, term12240.getClass(), "first", null);
        setField(term12240, term12240.getClass(), "last", null);
        setField(term12240, term12240.getClass(), "propListHead", null);
        setIntField(term12240, term12240.getClass(), "sourcePosition", 0);
        setField(term12240, term12240.getClass(), "jsType", null);
        setField(term12240, term12240.getClass(), "parent", null);
        setField(term12234, term12234.getClass(), "first", term12240);
        setIntField(term12241, term12241.getClass(), "type", 0);
        setField(term12241, term12241.getClass(), "next", null);
        setField(term12241, term12241.getClass(), "first", null);
        setField(term12241, term12241.getClass(), "last", null);
        setField(term12241, term12241.getClass(), "propListHead", null);
        setIntField(term12241, term12241.getClass(), "sourcePosition", 0);
        setField(term12241, term12241.getClass(), "jsType", null);
        setField(term12241, term12241.getClass(), "parent", null);
        setField(term12234, term12234.getClass(), "last", term12241);
        setField(term12242, term12242.getClass(), "next", null);
        setIntField(term12242, term12242.getClass(), "type", 0);
        setIntField(term12242, term12242.getClass(), "intValue", 0);
        setField(term12242, term12242.getClass(), "objectValue", null);
        setField(term12234, term12234.getClass(), "propListHead", term12242);
        setIntField(term12234, term12234.getClass(), "sourcePosition", -752378450);
        setField(term12234, term12234.getClass(), "jsType", null);
        setField(term12234, term12234.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1923;
        args[1] = "uuaPigETmJ";
        callMethod(klass, "isObjectCallMethod", argTypes, null, args);
        assertTrue(recursiveEquals(term1923, term12234));
    }

};


