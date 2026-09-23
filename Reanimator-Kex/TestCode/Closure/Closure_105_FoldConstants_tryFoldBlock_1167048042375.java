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

public class FoldConstants_tryFoldBlock_1167048042375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106154;
     Object term106224;
     Object term106925;
     Object term106926;

    public FoldConstants_tryFoldBlock_1167048042375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106154 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term106224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term106504, term106504.getClass(), "next", term106574);
        setIntField(term106504, term106504.getClass(), "type", 109);
        setField(term106434, term106434.getClass(), "next", term106504);
        setIntField(term106434, term106434.getClass(), "type", 68);
        setField(term106364, term106364.getClass(), "next", term106434);
        setIntField(term106364, term106364.getClass(), "type", 55);
        setField(term106294, term106294.getClass(), "next", term106364);
        setIntField(term106294, term106294.getClass(), "type", 31);
        setField(term106224, term106224.getClass(), "first", term106294);
        term106925 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term106925, term106925.getClass(), "compiler", null);
        term106926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106926, term106926.getClass(), "type", 0);
        setField(term106926, term106926.getClass(), "next", null);
        setIntField(term106927, term106927.getClass(), "type", 31);
        setIntField(term106928, term106928.getClass(), "type", 55);
        setIntField(term106929, term106929.getClass(), "type", 68);
        setIntField(term106930, term106930.getClass(), "type", 109);
        setField(term106930, term106930.getClass(), "next", null);
        setField(term106930, term106930.getClass(), "first", null);
        setField(term106930, term106930.getClass(), "last", null);
        setField(term106930, term106930.getClass(), "propListHead", null);
        setIntField(term106930, term106930.getClass(), "sourcePosition", 0);
        setField(term106930, term106930.getClass(), "jsType", null);
        setField(term106930, term106930.getClass(), "parent", null);
        setField(term106929, term106929.getClass(), "next", term106930);
        setField(term106929, term106929.getClass(), "first", null);
        setField(term106929, term106929.getClass(), "last", null);
        setField(term106929, term106929.getClass(), "propListHead", null);
        setIntField(term106929, term106929.getClass(), "sourcePosition", 0);
        setField(term106929, term106929.getClass(), "jsType", null);
        setField(term106929, term106929.getClass(), "parent", null);
        setField(term106928, term106928.getClass(), "next", term106929);
        setField(term106928, term106928.getClass(), "first", null);
        setField(term106928, term106928.getClass(), "last", null);
        setField(term106928, term106928.getClass(), "propListHead", null);
        setIntField(term106928, term106928.getClass(), "sourcePosition", 0);
        setField(term106928, term106928.getClass(), "jsType", null);
        setField(term106928, term106928.getClass(), "parent", null);
        setField(term106927, term106927.getClass(), "next", term106928);
        setField(term106927, term106927.getClass(), "first", null);
        setField(term106927, term106927.getClass(), "last", null);
        setField(term106927, term106927.getClass(), "propListHead", null);
        setIntField(term106927, term106927.getClass(), "sourcePosition", 0);
        setField(term106927, term106927.getClass(), "jsType", null);
        setField(term106927, term106927.getClass(), "parent", null);
        setField(term106926, term106926.getClass(), "first", term106927);
        setField(term106926, term106926.getClass(), "last", null);
        setField(term106926, term106926.getClass(), "propListHead", null);
        setIntField(term106926, term106926.getClass(), "sourcePosition", 0);
        setField(term106926, term106926.getClass(), "jsType", null);
        setField(term106926, term106926.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term106224;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term106154, args);
        assertTrue(recursiveEquals(term106154, term106925));
        assertTrue(recursiveEquals(term106224, null));
    }

};


