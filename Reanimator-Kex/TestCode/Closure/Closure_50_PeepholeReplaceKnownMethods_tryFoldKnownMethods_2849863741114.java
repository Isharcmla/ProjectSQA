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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5493063;
     Object term5493155;
     Object term5495862;
     Object term5495863;
     Object term5495225;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5493063 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5493155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493247 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493431 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493599 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5493691 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term5493247, term5493247.getClass(), "type", 35);
        setIntField(term5493431, term5493431.getClass(), "type", 40);
        setField(term5493431, term5493431.getClass(), "str", "lastIndexOf");
        setField(term5493339, term5493339.getClass(), "next", term5493431);
        setIntField(term5493339, term5493339.getClass(), "type", 40);
        setField(term5493339, term5493339.getClass(), "str", "         ");
        setField(term5493247, term5493247.getClass(), "first", term5493339);
        setIntField(term5493599, term5493599.getClass(), "type", 40);
        setField(term5493599, term5493599.getClass(), "next", term5493691);
        setField(term5493599, term5493599.getClass(), "str", "lastIndexOf");
        setField(term5493247, term5493247.getClass(), "next", term5493599);
        setField(term5493155, term5493155.getClass(), "first", term5493247);
        setIntField(term5493155, term5493155.getClass(), "type", 37);
        term5495862 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term5495862, term5495862.getClass(), "currentTraversal", null);
        term5495863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495868 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5495869 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5495863, term5495863.getClass(), "str", null);
        setIntField(term5495863, term5495863.getClass(), "type", 37);
        setField(term5495863, term5495863.getClass(), "next", null);
        setField(term5495864, term5495864.getClass(), "str", null);
        setIntField(term5495864, term5495864.getClass(), "type", 35);
        setField(term5495865, term5495865.getClass(), "str", "lastIndexOf");
        setIntField(term5495865, term5495865.getClass(), "type", 40);
        setDoubleField(term5495868, term5495868.getClass(), "number", 0.0);
        setIntField(term5495868, term5495868.getClass(), "type", 0);
        setField(term5495868, term5495868.getClass(), "next", null);
        setField(term5495868, term5495868.getClass(), "first", null);
        setField(term5495868, term5495868.getClass(), "last", null);
        setField(term5495868, term5495868.getClass(), "propListHead", null);
        setIntField(term5495868, term5495868.getClass(), "sourcePosition", 0);
        setField(term5495868, term5495868.getClass(), "jsType", null);
        setField(term5495868, term5495868.getClass(), "parent", null);
        setField(term5495865, term5495865.getClass(), "next", term5495868);
        setField(term5495865, term5495865.getClass(), "first", null);
        setField(term5495865, term5495865.getClass(), "last", null);
        setField(term5495865, term5495865.getClass(), "propListHead", null);
        setIntField(term5495865, term5495865.getClass(), "sourcePosition", 0);
        setField(term5495865, term5495865.getClass(), "jsType", null);
        setField(term5495865, term5495865.getClass(), "parent", null);
        setField(term5495864, term5495864.getClass(), "next", term5495865);
        setField(term5495869, term5495869.getClass(), "str", "         ");
        setIntField(term5495869, term5495869.getClass(), "type", 40);
        setField(term5495872, term5495872.getClass(), "str", "");
        setIntField(term5495872, term5495872.getClass(), "type", 40);
        setField(term5495872, term5495872.getClass(), "next", null);
        setField(term5495872, term5495872.getClass(), "first", null);
        setField(term5495872, term5495872.getClass(), "last", null);
        setField(term5495872, term5495872.getClass(), "propListHead", null);
        setIntField(term5495872, term5495872.getClass(), "sourcePosition", 0);
        setField(term5495872, term5495872.getClass(), "jsType", null);
        setField(term5495872, term5495872.getClass(), "parent", null);
        setField(term5495869, term5495869.getClass(), "next", term5495872);
        setField(term5495869, term5495869.getClass(), "first", null);
        setField(term5495869, term5495869.getClass(), "last", null);
        setField(term5495869, term5495869.getClass(), "propListHead", null);
        setIntField(term5495869, term5495869.getClass(), "sourcePosition", 0);
        setField(term5495869, term5495869.getClass(), "jsType", null);
        setField(term5495869, term5495869.getClass(), "parent", null);
        setField(term5495864, term5495864.getClass(), "first", term5495869);
        setField(term5495864, term5495864.getClass(), "last", null);
        setField(term5495864, term5495864.getClass(), "propListHead", null);
        setIntField(term5495864, term5495864.getClass(), "sourcePosition", 0);
        setField(term5495864, term5495864.getClass(), "jsType", null);
        setField(term5495864, term5495864.getClass(), "parent", null);
        setField(term5495863, term5495863.getClass(), "first", term5495864);
        setField(term5495863, term5495863.getClass(), "last", null);
        setField(term5495863, term5495863.getClass(), "propListHead", null);
        setIntField(term5495863, term5495863.getClass(), "sourcePosition", 0);
        setField(term5495863, term5495863.getClass(), "jsType", null);
        setField(term5495863, term5495863.getClass(), "parent", null);
        term5495225 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495227 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495229 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495244 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5495249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5495262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term5495225, term5495225.getClass(), "str", null);
        setIntField(term5495225, term5495225.getClass(), "type", 37);
        setField(term5495225, term5495225.getClass(), "next", null);
        setField(term5495227, term5495227.getClass(), "str", null);
        setIntField(term5495227, term5495227.getClass(), "type", 35);
        setField(term5495229, term5495229.getClass(), "str", "lastIndexOf");
        setIntField(term5495229, term5495229.getClass(), "type", 40);
        setDoubleField(term5495244, term5495244.getClass(), "number", 0.0);
        setIntField(term5495244, term5495244.getClass(), "type", 0);
        setField(term5495244, term5495244.getClass(), "next", null);
        setField(term5495244, term5495244.getClass(), "first", null);
        setField(term5495244, term5495244.getClass(), "last", null);
        setField(term5495244, term5495244.getClass(), "propListHead", null);
        setIntField(term5495244, term5495244.getClass(), "sourcePosition", 0);
        setField(term5495244, term5495244.getClass(), "jsType", null);
        setField(term5495244, term5495244.getClass(), "parent", null);
        setField(term5495229, term5495229.getClass(), "next", term5495244);
        setField(term5495229, term5495229.getClass(), "first", null);
        setField(term5495229, term5495229.getClass(), "last", null);
        setField(term5495229, term5495229.getClass(), "propListHead", null);
        setIntField(term5495229, term5495229.getClass(), "sourcePosition", 0);
        setField(term5495229, term5495229.getClass(), "jsType", null);
        setField(term5495229, term5495229.getClass(), "parent", null);
        setField(term5495227, term5495227.getClass(), "next", term5495229);
        setField(term5495249, term5495249.getClass(), "str", "         ");
        setIntField(term5495249, term5495249.getClass(), "type", 40);
        setField(term5495262, term5495262.getClass(), "str", "");
        setIntField(term5495262, term5495262.getClass(), "type", 40);
        setField(term5495262, term5495262.getClass(), "next", null);
        setField(term5495262, term5495262.getClass(), "first", null);
        setField(term5495262, term5495262.getClass(), "last", null);
        setField(term5495262, term5495262.getClass(), "propListHead", null);
        setIntField(term5495262, term5495262.getClass(), "sourcePosition", 0);
        setField(term5495262, term5495262.getClass(), "jsType", null);
        setField(term5495262, term5495262.getClass(), "parent", null);
        setField(term5495249, term5495249.getClass(), "next", term5495262);
        setField(term5495249, term5495249.getClass(), "first", null);
        setField(term5495249, term5495249.getClass(), "last", null);
        setField(term5495249, term5495249.getClass(), "propListHead", null);
        setIntField(term5495249, term5495249.getClass(), "sourcePosition", 0);
        setField(term5495249, term5495249.getClass(), "jsType", null);
        setField(term5495249, term5495249.getClass(), "parent", null);
        setField(term5495227, term5495227.getClass(), "first", term5495249);
        setField(term5495227, term5495227.getClass(), "last", null);
        setField(term5495227, term5495227.getClass(), "propListHead", null);
        setIntField(term5495227, term5495227.getClass(), "sourcePosition", 0);
        setField(term5495227, term5495227.getClass(), "jsType", null);
        setField(term5495227, term5495227.getClass(), "parent", null);
        setField(term5495225, term5495225.getClass(), "first", term5495227);
        setField(term5495225, term5495225.getClass(), "last", null);
        setField(term5495225, term5495225.getClass(), "propListHead", null);
        setIntField(term5495225, term5495225.getClass(), "sourcePosition", 0);
        setField(term5495225, term5495225.getClass(), "jsType", null);
        setField(term5495225, term5495225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5493155;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term5493063, args);
        assertTrue(recursiveEquals(term5493063, term5495862));
        assertTrue(recursiveEquals(term5493155, term5495863));
        assertTrue(recursiveEquals(retValue, term5495225));
    }

};


