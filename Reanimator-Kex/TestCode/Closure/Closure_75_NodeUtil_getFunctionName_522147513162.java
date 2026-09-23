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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionName_522147513162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public NodeUtil_getFunctionName_522147513162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term232 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term209, term209.getClass(), "type", -2027534003);
        setIntField(term211, term211.getClass(), "type", 972867650);
        setIntField(term213, term213.getClass(), "type", 0);
        setField(term213, term213.getClass(), "next", null);
        setField(term213, term213.getClass(), "first", null);
        setField(term213, term213.getClass(), "last", null);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term211, term211.getClass(), "next", term213);
        setIntField(term216, term216.getClass(), "type", 0);
        setField(term216, term216.getClass(), "next", null);
        setField(term216, term216.getClass(), "first", null);
        setField(term216, term216.getClass(), "last", null);
        setField(term216, term216.getClass(), "propListHead", null);
        setIntField(term216, term216.getClass(), "sourcePosition", 0);
        setField(term216, term216.getClass(), "jsType", null);
        setField(term216, term216.getClass(), "parent", null);
        setField(term211, term211.getClass(), "first", term216);
        setIntField(term219, term219.getClass(), "type", 0);
        setField(term219, term219.getClass(), "next", null);
        setField(term219, term219.getClass(), "first", null);
        setField(term219, term219.getClass(), "last", null);
        setField(term219, term219.getClass(), "propListHead", null);
        setIntField(term219, term219.getClass(), "sourcePosition", 0);
        setField(term219, term219.getClass(), "jsType", null);
        setField(term219, term219.getClass(), "parent", null);
        setField(term211, term211.getClass(), "last", term219);
        setField(term222, term222.getClass(), "next", null);
        setIntField(term222, term222.getClass(), "type", 0);
        setIntField(term222, term222.getClass(), "intValue", 0);
        setField(term222, term222.getClass(), "objectValue", null);
        setField(term211, term211.getClass(), "propListHead", term222);
        setIntField(term211, term211.getClass(), "sourcePosition", 1240914516);
        setField(term211, term211.getClass(), "jsType", null);
        setField(term211, term211.getClass(), "parent", null);
        setField(term209, term209.getClass(), "next", term211);
        setIntField(term226, term226.getClass(), "type", 0);
        setField(term226, term226.getClass(), "next", null);
        setField(term226, term226.getClass(), "first", null);
        setField(term226, term226.getClass(), "last", null);
        setField(term226, term226.getClass(), "propListHead", null);
        setIntField(term226, term226.getClass(), "sourcePosition", 0);
        setField(term226, term226.getClass(), "jsType", null);
        setField(term226, term226.getClass(), "parent", null);
        setField(term209, term209.getClass(), "first", term226);
        setIntField(term229, term229.getClass(), "type", 0);
        setField(term229, term229.getClass(), "next", null);
        setField(term229, term229.getClass(), "first", null);
        setField(term229, term229.getClass(), "last", null);
        setField(term229, term229.getClass(), "propListHead", null);
        setIntField(term229, term229.getClass(), "sourcePosition", 0);
        setField(term229, term229.getClass(), "jsType", null);
        setField(term229, term229.getClass(), "parent", null);
        setField(term209, term209.getClass(), "last", term229);
        setField(term232, term232.getClass(), "next", null);
        setIntField(term232, term232.getClass(), "type", 0);
        setIntField(term232, term232.getClass(), "intValue", 0);
        setField(term232, term232.getClass(), "objectValue", null);
        setField(term209, term209.getClass(), "propListHead", term232);
        setIntField(term209, term209.getClass(), "sourcePosition", -1465035361);
        setField(term209, term209.getClass(), "jsType", null);
        setField(term209, term209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209;
        try {
            callMethod(klass, "getFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


