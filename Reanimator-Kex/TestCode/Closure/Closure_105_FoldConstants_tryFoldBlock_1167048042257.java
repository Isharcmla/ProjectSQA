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

public class FoldConstants_tryFoldBlock_1167048042257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68330;
     Object term68400;
     Object term68816;
     Object term68817;

    public FoldConstants_tryFoldBlock_1167048042257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68330 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term68400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68610, term68610.getClass(), "next", term68680);
        setIntField(term68610, term68610.getClass(), "type", 56);
        setField(term68540, term68540.getClass(), "next", term68610);
        setIntField(term68540, term68540.getClass(), "type", 99);
        setField(term68470, term68470.getClass(), "next", term68540);
        setIntField(term68470, term68470.getClass(), "type", 107);
        setField(term68400, term68400.getClass(), "first", term68470);
        term68816 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term68816, term68816.getClass(), "compiler", null);
        term68817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68817, term68817.getClass(), "type", 0);
        setField(term68817, term68817.getClass(), "next", null);
        setIntField(term68818, term68818.getClass(), "type", 107);
        setIntField(term68819, term68819.getClass(), "type", 99);
        setIntField(term68820, term68820.getClass(), "type", 56);
        setIntField(term68821, term68821.getClass(), "type", 0);
        setField(term68821, term68821.getClass(), "next", null);
        setField(term68821, term68821.getClass(), "first", null);
        setField(term68821, term68821.getClass(), "last", null);
        setField(term68821, term68821.getClass(), "propListHead", null);
        setIntField(term68821, term68821.getClass(), "sourcePosition", 0);
        setField(term68821, term68821.getClass(), "jsType", null);
        setField(term68821, term68821.getClass(), "parent", null);
        setField(term68820, term68820.getClass(), "next", term68821);
        setField(term68820, term68820.getClass(), "first", null);
        setField(term68820, term68820.getClass(), "last", null);
        setField(term68820, term68820.getClass(), "propListHead", null);
        setIntField(term68820, term68820.getClass(), "sourcePosition", 0);
        setField(term68820, term68820.getClass(), "jsType", null);
        setField(term68820, term68820.getClass(), "parent", null);
        setField(term68819, term68819.getClass(), "next", term68820);
        setField(term68819, term68819.getClass(), "first", null);
        setField(term68819, term68819.getClass(), "last", null);
        setField(term68819, term68819.getClass(), "propListHead", null);
        setIntField(term68819, term68819.getClass(), "sourcePosition", 0);
        setField(term68819, term68819.getClass(), "jsType", null);
        setField(term68819, term68819.getClass(), "parent", null);
        setField(term68818, term68818.getClass(), "next", term68819);
        setField(term68818, term68818.getClass(), "first", null);
        setField(term68818, term68818.getClass(), "last", null);
        setField(term68818, term68818.getClass(), "propListHead", null);
        setIntField(term68818, term68818.getClass(), "sourcePosition", 0);
        setField(term68818, term68818.getClass(), "jsType", null);
        setField(term68818, term68818.getClass(), "parent", null);
        setField(term68817, term68817.getClass(), "first", term68818);
        setField(term68817, term68817.getClass(), "last", null);
        setField(term68817, term68817.getClass(), "propListHead", null);
        setIntField(term68817, term68817.getClass(), "sourcePosition", 0);
        setField(term68817, term68817.getClass(), "jsType", null);
        setField(term68817, term68817.getClass(), "parent", null);
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
        args[1] = term68400;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term68330, args);
        assertTrue(recursiveEquals(term68330, term68816));
        assertTrue(recursiveEquals(term68400, null));
    }

};


