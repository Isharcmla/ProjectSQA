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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term626691;
     Object term626783;
     Object term626945;
     Object term627037;
     Object term627132;
     Object term627133;
     Object term627135;
     Object term627136;
     Object term627085;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term626691 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term626783 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term626853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term626783, term626783.getClass(), "parent", term626853);
        setIntField(term626783, term626783.getClass(), "type", 0);
        term626945 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term626945, term626945.getClass(), "type", 0);
        term627037 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term627037, term627037.getClass(), "type", 64);
        term627132 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term627132, term627132.getClass(), "currentTraversal", null);
        term627133 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term627134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term627133, term627133.getClass(), "str", null);
        setIntField(term627133, term627133.getClass(), "type", 0);
        setField(term627133, term627133.getClass(), "next", null);
        setField(term627133, term627133.getClass(), "first", null);
        setField(term627133, term627133.getClass(), "last", null);
        setField(term627133, term627133.getClass(), "propListHead", null);
        setIntField(term627133, term627133.getClass(), "sourcePosition", 0);
        setField(term627133, term627133.getClass(), "jsType", null);
        setIntField(term627134, term627134.getClass(), "type", 0);
        setField(term627134, term627134.getClass(), "next", null);
        setField(term627134, term627134.getClass(), "first", null);
        setField(term627134, term627134.getClass(), "last", null);
        setField(term627134, term627134.getClass(), "propListHead", null);
        setIntField(term627134, term627134.getClass(), "sourcePosition", 0);
        setField(term627134, term627134.getClass(), "jsType", null);
        setField(term627134, term627134.getClass(), "parent", null);
        setField(term627133, term627133.getClass(), "parent", term627134);
        term627135 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term627135, term627135.getClass(), "str", null);
        setIntField(term627135, term627135.getClass(), "type", 0);
        setField(term627135, term627135.getClass(), "next", null);
        setField(term627135, term627135.getClass(), "first", null);
        setField(term627135, term627135.getClass(), "last", null);
        setField(term627135, term627135.getClass(), "propListHead", null);
        setIntField(term627135, term627135.getClass(), "sourcePosition", 0);
        setField(term627135, term627135.getClass(), "jsType", null);
        setField(term627135, term627135.getClass(), "parent", null);
        term627136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term627136, term627136.getClass(), "str", null);
        setIntField(term627136, term627136.getClass(), "type", 64);
        setField(term627136, term627136.getClass(), "next", null);
        setField(term627136, term627136.getClass(), "first", null);
        setField(term627136, term627136.getClass(), "last", null);
        setField(term627136, term627136.getClass(), "propListHead", null);
        setIntField(term627136, term627136.getClass(), "sourcePosition", 0);
        setField(term627136, term627136.getClass(), "jsType", null);
        setField(term627136, term627136.getClass(), "parent", null);
        term627085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term627088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term627085, term627085.getClass(), "str", null);
        setIntField(term627085, term627085.getClass(), "type", 0);
        setField(term627085, term627085.getClass(), "next", null);
        setField(term627085, term627085.getClass(), "first", null);
        setField(term627085, term627085.getClass(), "last", null);
        setField(term627085, term627085.getClass(), "propListHead", null);
        setIntField(term627085, term627085.getClass(), "sourcePosition", 0);
        setField(term627085, term627085.getClass(), "jsType", null);
        setIntField(term627088, term627088.getClass(), "type", 0);
        setField(term627088, term627088.getClass(), "next", null);
        setField(term627088, term627088.getClass(), "first", null);
        setField(term627088, term627088.getClass(), "last", null);
        setField(term627088, term627088.getClass(), "propListHead", null);
        setIntField(term627088, term627088.getClass(), "sourcePosition", 0);
        setField(term627088, term627088.getClass(), "jsType", null);
        setField(term627088, term627088.getClass(), "parent", null);
        setField(term627085, term627085.getClass(), "parent", term627088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term626783;
        args[1] = term626945;
        args[2] = term627037;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term626691, args);
        assertTrue(recursiveEquals(term626691, term627132));
        assertTrue(recursiveEquals(term626783, term627133));
        assertTrue(recursiveEquals(term626945, term627135));
        assertTrue(recursiveEquals(term627037, term627136));
        assertTrue(recursiveEquals(retValue, term627085));
    }

};


