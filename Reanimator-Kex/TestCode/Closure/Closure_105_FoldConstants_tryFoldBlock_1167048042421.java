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

public class FoldConstants_tryFoldBlock_1167048042421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122594;
     Object term122664;
     Object term123080;
     Object term123081;

    public FoldConstants_tryFoldBlock_1167048042421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122594 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term122664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term122874, term122874.getClass(), "next", term122944);
        setIntField(term122874, term122874.getClass(), "type", 75);
        setField(term122804, term122804.getClass(), "next", term122874);
        setIntField(term122804, term122804.getClass(), "type", 54);
        setField(term122734, term122734.getClass(), "next", term122804);
        setIntField(term122734, term122734.getClass(), "type", 60);
        setField(term122664, term122664.getClass(), "first", term122734);
        term123080 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term123080, term123080.getClass(), "compiler", null);
        term123081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123081, term123081.getClass(), "type", 0);
        setField(term123081, term123081.getClass(), "next", null);
        setIntField(term123082, term123082.getClass(), "type", 60);
        setIntField(term123083, term123083.getClass(), "type", 54);
        setIntField(term123084, term123084.getClass(), "type", 75);
        setIntField(term123085, term123085.getClass(), "type", 0);
        setField(term123085, term123085.getClass(), "next", null);
        setField(term123085, term123085.getClass(), "first", null);
        setField(term123085, term123085.getClass(), "last", null);
        setField(term123085, term123085.getClass(), "propListHead", null);
        setIntField(term123085, term123085.getClass(), "sourcePosition", 0);
        setField(term123085, term123085.getClass(), "jsType", null);
        setField(term123085, term123085.getClass(), "parent", null);
        setField(term123084, term123084.getClass(), "next", term123085);
        setField(term123084, term123084.getClass(), "first", null);
        setField(term123084, term123084.getClass(), "last", null);
        setField(term123084, term123084.getClass(), "propListHead", null);
        setIntField(term123084, term123084.getClass(), "sourcePosition", 0);
        setField(term123084, term123084.getClass(), "jsType", null);
        setField(term123084, term123084.getClass(), "parent", null);
        setField(term123083, term123083.getClass(), "next", term123084);
        setField(term123083, term123083.getClass(), "first", null);
        setField(term123083, term123083.getClass(), "last", null);
        setField(term123083, term123083.getClass(), "propListHead", null);
        setIntField(term123083, term123083.getClass(), "sourcePosition", 0);
        setField(term123083, term123083.getClass(), "jsType", null);
        setField(term123083, term123083.getClass(), "parent", null);
        setField(term123082, term123082.getClass(), "next", term123083);
        setField(term123082, term123082.getClass(), "first", null);
        setField(term123082, term123082.getClass(), "last", null);
        setField(term123082, term123082.getClass(), "propListHead", null);
        setIntField(term123082, term123082.getClass(), "sourcePosition", 0);
        setField(term123082, term123082.getClass(), "jsType", null);
        setField(term123082, term123082.getClass(), "parent", null);
        setField(term123081, term123081.getClass(), "first", term123082);
        setField(term123081, term123081.getClass(), "last", null);
        setField(term123081, term123081.getClass(), "propListHead", null);
        setIntField(term123081, term123081.getClass(), "sourcePosition", 0);
        setField(term123081, term123081.getClass(), "jsType", null);
        setField(term123081, term123081.getClass(), "parent", null);
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
        args[1] = term122664;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term122594, args);
        assertTrue(recursiveEquals(term122594, term123080));
        assertTrue(recursiveEquals(term122664, null));
    }

};


