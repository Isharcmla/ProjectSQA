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
import java.lang.Object;

public class NodeUtil_getRootOfQualifiedName_883329160205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2512;

    public NodeUtil_getRootOfQualifiedName_883329160205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2525 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2535 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2512, term2512.getClass(), "type", 735987104);
        setIntField(term2514, term2514.getClass(), "type", -963198667);
        setIntField(term2516, term2516.getClass(), "type", 0);
        setField(term2516, term2516.getClass(), "next", null);
        setField(term2516, term2516.getClass(), "first", null);
        setField(term2516, term2516.getClass(), "last", null);
        setField(term2516, term2516.getClass(), "propListHead", null);
        setIntField(term2516, term2516.getClass(), "sourcePosition", 0);
        setField(term2516, term2516.getClass(), "jsType", null);
        setField(term2516, term2516.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "next", term2516);
        setIntField(term2519, term2519.getClass(), "type", 0);
        setField(term2519, term2519.getClass(), "next", null);
        setField(term2519, term2519.getClass(), "first", null);
        setField(term2519, term2519.getClass(), "last", null);
        setField(term2519, term2519.getClass(), "propListHead", null);
        setIntField(term2519, term2519.getClass(), "sourcePosition", 0);
        setField(term2519, term2519.getClass(), "jsType", null);
        setField(term2519, term2519.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "first", term2519);
        setIntField(term2522, term2522.getClass(), "type", 0);
        setField(term2522, term2522.getClass(), "next", null);
        setField(term2522, term2522.getClass(), "first", null);
        setField(term2522, term2522.getClass(), "last", null);
        setField(term2522, term2522.getClass(), "propListHead", null);
        setIntField(term2522, term2522.getClass(), "sourcePosition", 0);
        setField(term2522, term2522.getClass(), "jsType", null);
        setField(term2522, term2522.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "last", term2522);
        setField(term2525, term2525.getClass(), "next", null);
        setIntField(term2525, term2525.getClass(), "type", 0);
        setIntField(term2525, term2525.getClass(), "intValue", 0);
        setField(term2525, term2525.getClass(), "objectValue", null);
        setField(term2514, term2514.getClass(), "propListHead", term2525);
        setIntField(term2514, term2514.getClass(), "sourcePosition", 1304396087);
        setField(term2514, term2514.getClass(), "jsType", null);
        setField(term2514, term2514.getClass(), "parent", null);
        setField(term2512, term2512.getClass(), "next", term2514);
        setIntField(term2529, term2529.getClass(), "type", 0);
        setField(term2529, term2529.getClass(), "next", null);
        setField(term2529, term2529.getClass(), "first", null);
        setField(term2529, term2529.getClass(), "last", null);
        setField(term2529, term2529.getClass(), "propListHead", null);
        setIntField(term2529, term2529.getClass(), "sourcePosition", 0);
        setField(term2529, term2529.getClass(), "jsType", null);
        setField(term2529, term2529.getClass(), "parent", null);
        setField(term2512, term2512.getClass(), "first", term2529);
        setIntField(term2532, term2532.getClass(), "type", 0);
        setField(term2532, term2532.getClass(), "next", null);
        setField(term2532, term2532.getClass(), "first", null);
        setField(term2532, term2532.getClass(), "last", null);
        setField(term2532, term2532.getClass(), "propListHead", null);
        setIntField(term2532, term2532.getClass(), "sourcePosition", 0);
        setField(term2532, term2532.getClass(), "jsType", null);
        setField(term2532, term2532.getClass(), "parent", null);
        setField(term2512, term2512.getClass(), "last", term2532);
        setField(term2535, term2535.getClass(), "next", null);
        setIntField(term2535, term2535.getClass(), "type", 0);
        setIntField(term2535, term2535.getClass(), "intValue", 0);
        setField(term2535, term2535.getClass(), "objectValue", null);
        setField(term2512, term2512.getClass(), "propListHead", term2535);
        setIntField(term2512, term2512.getClass(), "sourcePosition", 1782600602);
        setField(term2512, term2512.getClass(), "jsType", null);
        setField(term2512, term2512.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2512;
        try {
            callMethod(klass, "getRootOfQualifiedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


