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

public class NodeUtil_isNull_1536879334196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term841;
     Object term9630;

    public NodeUtil_isNull_1536879334196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term851 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term841, term841.getClass(), "type", 1094107751);
        setIntField(term843, term843.getClass(), "type", 719656595);
        setIntField(term845, term845.getClass(), "type", 0);
        setField(term845, term845.getClass(), "next", null);
        setField(term845, term845.getClass(), "first", null);
        setField(term845, term845.getClass(), "last", null);
        setField(term845, term845.getClass(), "propListHead", null);
        setIntField(term845, term845.getClass(), "sourcePosition", 0);
        setField(term845, term845.getClass(), "jsType", null);
        setField(term845, term845.getClass(), "parent", null);
        setField(term843, term843.getClass(), "next", term845);
        setIntField(term848, term848.getClass(), "type", 0);
        setField(term848, term848.getClass(), "next", null);
        setField(term848, term848.getClass(), "first", null);
        setField(term848, term848.getClass(), "last", null);
        setField(term848, term848.getClass(), "propListHead", null);
        setIntField(term848, term848.getClass(), "sourcePosition", 0);
        setField(term848, term848.getClass(), "jsType", null);
        setField(term848, term848.getClass(), "parent", null);
        setField(term843, term843.getClass(), "first", term848);
        setIntField(term851, term851.getClass(), "type", 0);
        setField(term851, term851.getClass(), "next", null);
        setField(term851, term851.getClass(), "first", null);
        setField(term851, term851.getClass(), "last", null);
        setField(term851, term851.getClass(), "propListHead", null);
        setIntField(term851, term851.getClass(), "sourcePosition", 0);
        setField(term851, term851.getClass(), "jsType", null);
        setField(term851, term851.getClass(), "parent", null);
        setField(term843, term843.getClass(), "last", term851);
        setField(term843, term843.getClass(), "propListHead", null);
        setIntField(term843, term843.getClass(), "sourcePosition", 0);
        setField(term843, term843.getClass(), "jsType", null);
        setField(term843, term843.getClass(), "parent", null);
        setField(term841, term841.getClass(), "next", term843);
        setIntField(term855, term855.getClass(), "type", 0);
        setField(term855, term855.getClass(), "next", null);
        setField(term855, term855.getClass(), "first", null);
        setField(term855, term855.getClass(), "last", null);
        setField(term855, term855.getClass(), "propListHead", null);
        setIntField(term855, term855.getClass(), "sourcePosition", 0);
        setField(term855, term855.getClass(), "jsType", null);
        setField(term855, term855.getClass(), "parent", null);
        setField(term841, term841.getClass(), "first", term855);
        setIntField(term858, term858.getClass(), "type", 0);
        setField(term858, term858.getClass(), "next", null);
        setField(term858, term858.getClass(), "first", null);
        setField(term858, term858.getClass(), "last", null);
        setField(term858, term858.getClass(), "propListHead", null);
        setIntField(term858, term858.getClass(), "sourcePosition", 0);
        setField(term858, term858.getClass(), "jsType", null);
        setField(term858, term858.getClass(), "parent", null);
        setField(term841, term841.getClass(), "last", term858);
        setField(term841, term841.getClass(), "propListHead", null);
        setIntField(term841, term841.getClass(), "sourcePosition", 0);
        setField(term841, term841.getClass(), "jsType", null);
        setField(term841, term841.getClass(), "parent", null);
        term9630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9630, term9630.getClass(), "type", 1094107751);
        setIntField(term9631, term9631.getClass(), "type", 719656595);
        setIntField(term9632, term9632.getClass(), "type", 0);
        setField(term9632, term9632.getClass(), "next", null);
        setField(term9632, term9632.getClass(), "first", null);
        setField(term9632, term9632.getClass(), "last", null);
        setField(term9632, term9632.getClass(), "propListHead", null);
        setIntField(term9632, term9632.getClass(), "sourcePosition", 0);
        setField(term9632, term9632.getClass(), "jsType", null);
        setField(term9632, term9632.getClass(), "parent", null);
        setField(term9631, term9631.getClass(), "next", term9632);
        setIntField(term9633, term9633.getClass(), "type", 0);
        setField(term9633, term9633.getClass(), "next", null);
        setField(term9633, term9633.getClass(), "first", null);
        setField(term9633, term9633.getClass(), "last", null);
        setField(term9633, term9633.getClass(), "propListHead", null);
        setIntField(term9633, term9633.getClass(), "sourcePosition", 0);
        setField(term9633, term9633.getClass(), "jsType", null);
        setField(term9633, term9633.getClass(), "parent", null);
        setField(term9631, term9631.getClass(), "first", term9633);
        setIntField(term9634, term9634.getClass(), "type", 0);
        setField(term9634, term9634.getClass(), "next", null);
        setField(term9634, term9634.getClass(), "first", null);
        setField(term9634, term9634.getClass(), "last", null);
        setField(term9634, term9634.getClass(), "propListHead", null);
        setIntField(term9634, term9634.getClass(), "sourcePosition", 0);
        setField(term9634, term9634.getClass(), "jsType", null);
        setField(term9634, term9634.getClass(), "parent", null);
        setField(term9631, term9631.getClass(), "last", term9634);
        setField(term9631, term9631.getClass(), "propListHead", null);
        setIntField(term9631, term9631.getClass(), "sourcePosition", 0);
        setField(term9631, term9631.getClass(), "jsType", null);
        setField(term9631, term9631.getClass(), "parent", null);
        setField(term9630, term9630.getClass(), "next", term9631);
        setIntField(term9635, term9635.getClass(), "type", 0);
        setField(term9635, term9635.getClass(), "next", null);
        setField(term9635, term9635.getClass(), "first", null);
        setField(term9635, term9635.getClass(), "last", null);
        setField(term9635, term9635.getClass(), "propListHead", null);
        setIntField(term9635, term9635.getClass(), "sourcePosition", 0);
        setField(term9635, term9635.getClass(), "jsType", null);
        setField(term9635, term9635.getClass(), "parent", null);
        setField(term9630, term9630.getClass(), "first", term9635);
        setIntField(term9665, term9665.getClass(), "type", 0);
        setField(term9665, term9665.getClass(), "next", null);
        setField(term9665, term9665.getClass(), "first", null);
        setField(term9665, term9665.getClass(), "last", null);
        setField(term9665, term9665.getClass(), "propListHead", null);
        setIntField(term9665, term9665.getClass(), "sourcePosition", 0);
        setField(term9665, term9665.getClass(), "jsType", null);
        setField(term9665, term9665.getClass(), "parent", null);
        setField(term9630, term9630.getClass(), "last", term9665);
        setField(term9630, term9630.getClass(), "propListHead", null);
        setIntField(term9630, term9630.getClass(), "sourcePosition", 0);
        setField(term9630, term9630.getClass(), "jsType", null);
        setField(term9630, term9630.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term841;
        Object retValue = callMethod(klass, "isNull", argTypes, null, args);
        assertTrue(recursiveEquals(term841, term9630));
        assertTrue(recursiveEquals(retValue, false));
    }

};


