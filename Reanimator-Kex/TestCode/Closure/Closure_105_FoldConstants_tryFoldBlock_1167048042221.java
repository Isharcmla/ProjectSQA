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

public class FoldConstants_tryFoldBlock_1167048042221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57363;
     Object term57433;
     Object term57990;
     Object term57991;

    public FoldConstants_tryFoldBlock_1167048042221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57363 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term57433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57643, term57643.getClass(), "next", term57713);
        setIntField(term57643, term57643.getClass(), "type", 127);
        setField(term57573, term57573.getClass(), "next", term57643);
        setIntField(term57573, term57573.getClass(), "type", 78);
        setField(term57503, term57503.getClass(), "next", term57573);
        setIntField(term57503, term57503.getClass(), "type", 82);
        setField(term57433, term57433.getClass(), "first", term57503);
        term57990 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term57990, term57990.getClass(), "compiler", null);
        term57991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57991, term57991.getClass(), "type", 0);
        setField(term57991, term57991.getClass(), "next", null);
        setIntField(term57992, term57992.getClass(), "type", 82);
        setIntField(term57993, term57993.getClass(), "type", 78);
        setIntField(term57994, term57994.getClass(), "type", 127);
        setIntField(term57995, term57995.getClass(), "type", 0);
        setField(term57995, term57995.getClass(), "next", null);
        setField(term57995, term57995.getClass(), "first", null);
        setField(term57995, term57995.getClass(), "last", null);
        setField(term57995, term57995.getClass(), "propListHead", null);
        setIntField(term57995, term57995.getClass(), "sourcePosition", 0);
        setField(term57995, term57995.getClass(), "jsType", null);
        setField(term57995, term57995.getClass(), "parent", null);
        setField(term57994, term57994.getClass(), "next", term57995);
        setField(term57994, term57994.getClass(), "first", null);
        setField(term57994, term57994.getClass(), "last", null);
        setField(term57994, term57994.getClass(), "propListHead", null);
        setIntField(term57994, term57994.getClass(), "sourcePosition", 0);
        setField(term57994, term57994.getClass(), "jsType", null);
        setField(term57994, term57994.getClass(), "parent", null);
        setField(term57993, term57993.getClass(), "next", term57994);
        setField(term57993, term57993.getClass(), "first", null);
        setField(term57993, term57993.getClass(), "last", null);
        setField(term57993, term57993.getClass(), "propListHead", null);
        setIntField(term57993, term57993.getClass(), "sourcePosition", 0);
        setField(term57993, term57993.getClass(), "jsType", null);
        setField(term57993, term57993.getClass(), "parent", null);
        setField(term57992, term57992.getClass(), "next", term57993);
        setField(term57992, term57992.getClass(), "first", null);
        setField(term57992, term57992.getClass(), "last", null);
        setField(term57992, term57992.getClass(), "propListHead", null);
        setIntField(term57992, term57992.getClass(), "sourcePosition", 0);
        setField(term57992, term57992.getClass(), "jsType", null);
        setField(term57992, term57992.getClass(), "parent", null);
        setField(term57991, term57991.getClass(), "first", term57992);
        setField(term57991, term57991.getClass(), "last", null);
        setField(term57991, term57991.getClass(), "propListHead", null);
        setIntField(term57991, term57991.getClass(), "sourcePosition", 0);
        setField(term57991, term57991.getClass(), "jsType", null);
        setField(term57991, term57991.getClass(), "parent", null);
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
        args[1] = term57433;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term57363, args);
        assertTrue(recursiveEquals(term57363, term57990));
        assertTrue(recursiveEquals(term57433, null));
    }

};


