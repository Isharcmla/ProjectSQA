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

public class FoldConstants_tryFoldBlock_1167048042134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21568;
     Object term21638;
     Object term30993;
     Object term30994;

    public FoldConstants_tryFoldBlock_1167048042134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21568 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term21638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21638, term21638.getClass(), "first", term21638);
        setField(term21638, term21638.getClass(), "next", term21708);
        setIntField(term21638, term21638.getClass(), "type", 48);
        term30993 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term30993, term30993.getClass(), "compiler", null);
        term30994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30994, term30994.getClass(), "type", 48);
        setIntField(term30995, term30995.getClass(), "type", 0);
        setField(term30995, term30995.getClass(), "next", null);
        setField(term30995, term30995.getClass(), "first", null);
        setField(term30995, term30995.getClass(), "last", null);
        setField(term30995, term30995.getClass(), "propListHead", null);
        setIntField(term30995, term30995.getClass(), "sourcePosition", 0);
        setField(term30995, term30995.getClass(), "jsType", null);
        setField(term30995, term30995.getClass(), "parent", null);
        setField(term30994, term30994.getClass(), "next", term30995);
        setField(term30994, term30994.getClass(), "first", term30994);
        setField(term30994, term30994.getClass(), "last", null);
        setField(term30994, term30994.getClass(), "propListHead", null);
        setIntField(term30994, term30994.getClass(), "sourcePosition", 0);
        setField(term30994, term30994.getClass(), "jsType", null);
        setField(term30994, term30994.getClass(), "parent", null);
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
        args[1] = term21638;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term21568, args);
        assertTrue(recursiveEquals(term21568, term30993));
        assertTrue(recursiveEquals(term21638, null));
    }

};


