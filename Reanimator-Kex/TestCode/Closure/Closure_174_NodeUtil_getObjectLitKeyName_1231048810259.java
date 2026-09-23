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

public class NodeUtil_getObjectLitKeyName_1231048810259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2514;

    public NodeUtil_getObjectLitKeyName_1231048810259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2514, term2514.getClass(), "type", -979568);
        setIntField(term2516, term2516.getClass(), "type", -1422131197);
        setIntField(term2518, term2518.getClass(), "type", -20399281);
        setIntField(term2520, term2520.getClass(), "type", -830170410);
        setIntField(term2522, term2522.getClass(), "type", -1742790308);
        setField(term2522, term2522.getClass(), "next", null);
        setField(term2522, term2522.getClass(), "first", null);
        setField(term2522, term2522.getClass(), "last", null);
        setField(term2522, term2522.getClass(), "propListHead", null);
        setIntField(term2522, term2522.getClass(), "sourcePosition", 0);
        setField(term2522, term2522.getClass(), "jsType", null);
        setField(term2522, term2522.getClass(), "parent", null);
        setField(term2520, term2520.getClass(), "next", term2522);
        setIntField(term2525, term2525.getClass(), "type", -1592093430);
        setField(term2525, term2525.getClass(), "next", null);
        setField(term2525, term2525.getClass(), "first", null);
        setField(term2525, term2525.getClass(), "last", term2522);
        setField(term2525, term2525.getClass(), "propListHead", null);
        setIntField(term2525, term2525.getClass(), "sourcePosition", 0);
        setField(term2525, term2525.getClass(), "jsType", null);
        setField(term2525, term2525.getClass(), "parent", null);
        setField(term2520, term2520.getClass(), "first", term2525);
        setField(term2520, term2520.getClass(), "last", term2518);
        setField(term2520, term2520.getClass(), "propListHead", null);
        setIntField(term2520, term2520.getClass(), "sourcePosition", 0);
        setField(term2520, term2520.getClass(), "jsType", null);
        setField(term2520, term2520.getClass(), "parent", null);
        setField(term2518, term2518.getClass(), "next", term2520);
        setField(term2518, term2518.getClass(), "first", term2522);
        setIntField(term2529, term2529.getClass(), "type", -985334541);
        setIntField(term2531, term2531.getClass(), "type", -1870004228);
        setField(term2531, term2531.getClass(), "next", null);
        setField(term2531, term2531.getClass(), "first", term2525);
        setField(term2531, term2531.getClass(), "last", term2520);
        setField(term2531, term2531.getClass(), "propListHead", null);
        setIntField(term2531, term2531.getClass(), "sourcePosition", 0);
        setField(term2531, term2531.getClass(), "jsType", null);
        setField(term2531, term2531.getClass(), "parent", null);
        setField(term2529, term2529.getClass(), "next", term2531);
        setField(term2529, term2529.getClass(), "first", term2516);
        setField(term2529, term2529.getClass(), "last", term2516);
        setField(term2529, term2529.getClass(), "propListHead", null);
        setIntField(term2529, term2529.getClass(), "sourcePosition", 0);
        setField(term2529, term2529.getClass(), "jsType", null);
        setField(term2529, term2529.getClass(), "parent", null);
        setField(term2518, term2518.getClass(), "last", term2529);
        setField(term2518, term2518.getClass(), "propListHead", null);
        setIntField(term2518, term2518.getClass(), "sourcePosition", 0);
        setField(term2518, term2518.getClass(), "jsType", null);
        setField(term2518, term2518.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "next", term2518);
        setIntField(term2536, term2536.getClass(), "type", 380484139);
        setField(term2536, term2536.getClass(), "next", term2529);
        setField(term2536, term2536.getClass(), "first", term2531);
        setField(term2536, term2536.getClass(), "last", term2514);
        setField(term2536, term2536.getClass(), "propListHead", null);
        setIntField(term2536, term2536.getClass(), "sourcePosition", 0);
        setField(term2536, term2536.getClass(), "jsType", null);
        setField(term2536, term2536.getClass(), "parent", null);
        setField(term2516, term2516.getClass(), "first", term2536);
        setField(term2516, term2516.getClass(), "last", term2536);
        setField(term2516, term2516.getClass(), "propListHead", null);
        setIntField(term2516, term2516.getClass(), "sourcePosition", 0);
        setField(term2516, term2516.getClass(), "jsType", null);
        setField(term2516, term2516.getClass(), "parent", null);
        setField(term2514, term2514.getClass(), "next", term2516);
        setField(term2514, term2514.getClass(), "first", term2520);
        setField(term2514, term2514.getClass(), "last", term2522);
        setField(term2514, term2514.getClass(), "propListHead", null);
        setIntField(term2514, term2514.getClass(), "sourcePosition", 0);
        setField(term2514, term2514.getClass(), "jsType", null);
        setField(term2514, term2514.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2514;
        try {
            callMethod(klass, "getObjectLitKeyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


