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

public class FoldConstants_tryFoldBlock_1167048042220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56873;
     Object term56943;
     Object term57849;
     Object term57850;

    public FoldConstants_tryFoldBlock_1167048042220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56873 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term56943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57153, term57153.getClass(), "next", term57223);
        setIntField(term57153, term57153.getClass(), "type", 31);
        setField(term57083, term57083.getClass(), "next", term57153);
        setIntField(term57083, term57083.getClass(), "type", 81);
        setField(term57013, term57013.getClass(), "next", term57083);
        setIntField(term57013, term57013.getClass(), "type", 60);
        setField(term56943, term56943.getClass(), "first", term57013);
        term57849 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term57849, term57849.getClass(), "compiler", null);
        term57850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57850, term57850.getClass(), "type", 0);
        setField(term57850, term57850.getClass(), "next", null);
        setIntField(term57851, term57851.getClass(), "type", 60);
        setIntField(term57852, term57852.getClass(), "type", 81);
        setIntField(term57853, term57853.getClass(), "type", 31);
        setIntField(term57854, term57854.getClass(), "type", 0);
        setField(term57854, term57854.getClass(), "next", null);
        setField(term57854, term57854.getClass(), "first", null);
        setField(term57854, term57854.getClass(), "last", null);
        setField(term57854, term57854.getClass(), "propListHead", null);
        setIntField(term57854, term57854.getClass(), "sourcePosition", 0);
        setField(term57854, term57854.getClass(), "jsType", null);
        setField(term57854, term57854.getClass(), "parent", null);
        setField(term57853, term57853.getClass(), "next", term57854);
        setField(term57853, term57853.getClass(), "first", null);
        setField(term57853, term57853.getClass(), "last", null);
        setField(term57853, term57853.getClass(), "propListHead", null);
        setIntField(term57853, term57853.getClass(), "sourcePosition", 0);
        setField(term57853, term57853.getClass(), "jsType", null);
        setField(term57853, term57853.getClass(), "parent", null);
        setField(term57852, term57852.getClass(), "next", term57853);
        setField(term57852, term57852.getClass(), "first", null);
        setField(term57852, term57852.getClass(), "last", null);
        setField(term57852, term57852.getClass(), "propListHead", null);
        setIntField(term57852, term57852.getClass(), "sourcePosition", 0);
        setField(term57852, term57852.getClass(), "jsType", null);
        setField(term57852, term57852.getClass(), "parent", null);
        setField(term57851, term57851.getClass(), "next", term57852);
        setField(term57851, term57851.getClass(), "first", null);
        setField(term57851, term57851.getClass(), "last", null);
        setField(term57851, term57851.getClass(), "propListHead", null);
        setIntField(term57851, term57851.getClass(), "sourcePosition", 0);
        setField(term57851, term57851.getClass(), "jsType", null);
        setField(term57851, term57851.getClass(), "parent", null);
        setField(term57850, term57850.getClass(), "first", term57851);
        setField(term57850, term57850.getClass(), "last", null);
        setField(term57850, term57850.getClass(), "propListHead", null);
        setIntField(term57850, term57850.getClass(), "sourcePosition", 0);
        setField(term57850, term57850.getClass(), "jsType", null);
        setField(term57850, term57850.getClass(), "parent", null);
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
        args[1] = term56943;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term56873, args);
        assertTrue(recursiveEquals(term56873, term57849));
        assertTrue(recursiveEquals(term56943, null));
    }

};


