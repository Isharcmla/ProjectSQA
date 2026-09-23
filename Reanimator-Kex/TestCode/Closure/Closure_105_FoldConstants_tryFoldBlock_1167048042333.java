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

public class FoldConstants_tryFoldBlock_1167048042333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91944;
     Object term92014;
     Object term92430;
     Object term92431;

    public FoldConstants_tryFoldBlock_1167048042333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91944 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term92014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term92224, term92224.getClass(), "next", term92294);
        setIntField(term92224, term92224.getClass(), "type", 78);
        setField(term92154, term92154.getClass(), "next", term92224);
        setIntField(term92154, term92154.getClass(), "type", 54);
        setField(term92084, term92084.getClass(), "next", term92154);
        setIntField(term92084, term92084.getClass(), "type", 112);
        setField(term92014, term92014.getClass(), "first", term92084);
        term92430 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term92430, term92430.getClass(), "compiler", null);
        term92431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92431, term92431.getClass(), "type", 0);
        setField(term92431, term92431.getClass(), "next", null);
        setIntField(term92432, term92432.getClass(), "type", 112);
        setIntField(term92433, term92433.getClass(), "type", 54);
        setIntField(term92434, term92434.getClass(), "type", 78);
        setIntField(term92435, term92435.getClass(), "type", 0);
        setField(term92435, term92435.getClass(), "next", null);
        setField(term92435, term92435.getClass(), "first", null);
        setField(term92435, term92435.getClass(), "last", null);
        setField(term92435, term92435.getClass(), "propListHead", null);
        setIntField(term92435, term92435.getClass(), "sourcePosition", 0);
        setField(term92435, term92435.getClass(), "jsType", null);
        setField(term92435, term92435.getClass(), "parent", null);
        setField(term92434, term92434.getClass(), "next", term92435);
        setField(term92434, term92434.getClass(), "first", null);
        setField(term92434, term92434.getClass(), "last", null);
        setField(term92434, term92434.getClass(), "propListHead", null);
        setIntField(term92434, term92434.getClass(), "sourcePosition", 0);
        setField(term92434, term92434.getClass(), "jsType", null);
        setField(term92434, term92434.getClass(), "parent", null);
        setField(term92433, term92433.getClass(), "next", term92434);
        setField(term92433, term92433.getClass(), "first", null);
        setField(term92433, term92433.getClass(), "last", null);
        setField(term92433, term92433.getClass(), "propListHead", null);
        setIntField(term92433, term92433.getClass(), "sourcePosition", 0);
        setField(term92433, term92433.getClass(), "jsType", null);
        setField(term92433, term92433.getClass(), "parent", null);
        setField(term92432, term92432.getClass(), "next", term92433);
        setField(term92432, term92432.getClass(), "first", null);
        setField(term92432, term92432.getClass(), "last", null);
        setField(term92432, term92432.getClass(), "propListHead", null);
        setIntField(term92432, term92432.getClass(), "sourcePosition", 0);
        setField(term92432, term92432.getClass(), "jsType", null);
        setField(term92432, term92432.getClass(), "parent", null);
        setField(term92431, term92431.getClass(), "first", term92432);
        setField(term92431, term92431.getClass(), "last", null);
        setField(term92431, term92431.getClass(), "propListHead", null);
        setIntField(term92431, term92431.getClass(), "sourcePosition", 0);
        setField(term92431, term92431.getClass(), "jsType", null);
        setField(term92431, term92431.getClass(), "parent", null);
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
        args[1] = term92014;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term91944, args);
        assertTrue(recursiveEquals(term91944, term92430));
        assertTrue(recursiveEquals(term92014, null));
    }

};


