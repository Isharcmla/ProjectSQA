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

public class NodeUtil_referencesThis_2041162929129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term6301;

    public NodeUtil_referencesThis_2041162929129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term638 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term625, term625.getClass(), "type", -1497710478);
        setIntField(term627, term627.getClass(), "type", 34470066);
        setIntField(term629, term629.getClass(), "type", 0);
        setField(term629, term629.getClass(), "next", null);
        setField(term629, term629.getClass(), "first", null);
        setField(term629, term629.getClass(), "last", null);
        setField(term629, term629.getClass(), "propListHead", null);
        setIntField(term629, term629.getClass(), "sourcePosition", 0);
        setField(term629, term629.getClass(), "jsType", null);
        setField(term629, term629.getClass(), "parent", null);
        setField(term627, term627.getClass(), "next", term629);
        setIntField(term632, term632.getClass(), "type", 0);
        setField(term632, term632.getClass(), "next", null);
        setField(term632, term632.getClass(), "first", null);
        setField(term632, term632.getClass(), "last", null);
        setField(term632, term632.getClass(), "propListHead", null);
        setIntField(term632, term632.getClass(), "sourcePosition", 0);
        setField(term632, term632.getClass(), "jsType", null);
        setField(term632, term632.getClass(), "parent", null);
        setField(term627, term627.getClass(), "first", term632);
        setIntField(term635, term635.getClass(), "type", 0);
        setField(term635, term635.getClass(), "next", null);
        setField(term635, term635.getClass(), "first", null);
        setField(term635, term635.getClass(), "last", null);
        setField(term635, term635.getClass(), "propListHead", null);
        setIntField(term635, term635.getClass(), "sourcePosition", 0);
        setField(term635, term635.getClass(), "jsType", null);
        setField(term635, term635.getClass(), "parent", null);
        setField(term627, term627.getClass(), "last", term635);
        setField(term638, term638.getClass(), "next", null);
        setIntField(term638, term638.getClass(), "type", 0);
        setIntField(term638, term638.getClass(), "intValue", 0);
        setField(term638, term638.getClass(), "objectValue", null);
        setField(term627, term627.getClass(), "propListHead", term638);
        setIntField(term627, term627.getClass(), "sourcePosition", -945116798);
        setField(term627, term627.getClass(), "jsType", null);
        setField(term627, term627.getClass(), "parent", null);
        setField(term625, term625.getClass(), "next", term627);
        setIntField(term642, term642.getClass(), "type", 0);
        setField(term642, term642.getClass(), "next", null);
        setField(term642, term642.getClass(), "first", null);
        setField(term642, term642.getClass(), "last", null);
        setField(term642, term642.getClass(), "propListHead", null);
        setIntField(term642, term642.getClass(), "sourcePosition", 0);
        setField(term642, term642.getClass(), "jsType", null);
        setField(term642, term642.getClass(), "parent", null);
        setField(term625, term625.getClass(), "first", term642);
        setIntField(term645, term645.getClass(), "type", 0);
        setField(term645, term645.getClass(), "next", null);
        setField(term645, term645.getClass(), "first", null);
        setField(term645, term645.getClass(), "last", null);
        setField(term645, term645.getClass(), "propListHead", null);
        setIntField(term645, term645.getClass(), "sourcePosition", 0);
        setField(term645, term645.getClass(), "jsType", null);
        setField(term645, term645.getClass(), "parent", null);
        setField(term625, term625.getClass(), "last", term645);
        setField(term648, term648.getClass(), "next", null);
        setIntField(term648, term648.getClass(), "type", 0);
        setIntField(term648, term648.getClass(), "intValue", 0);
        setField(term648, term648.getClass(), "objectValue", null);
        setField(term625, term625.getClass(), "propListHead", term648);
        setIntField(term625, term625.getClass(), "sourcePosition", 1593461795);
        setField(term625, term625.getClass(), "jsType", null);
        setField(term625, term625.getClass(), "parent", null);
        term6301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6306 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6309 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6301, term6301.getClass(), "type", -1497710478);
        setIntField(term6302, term6302.getClass(), "type", 34470066);
        setIntField(term6303, term6303.getClass(), "type", 0);
        setField(term6303, term6303.getClass(), "next", null);
        setField(term6303, term6303.getClass(), "first", null);
        setField(term6303, term6303.getClass(), "last", null);
        setField(term6303, term6303.getClass(), "propListHead", null);
        setIntField(term6303, term6303.getClass(), "sourcePosition", 0);
        setField(term6303, term6303.getClass(), "jsType", null);
        setField(term6303, term6303.getClass(), "parent", null);
        setField(term6302, term6302.getClass(), "next", term6303);
        setIntField(term6304, term6304.getClass(), "type", 0);
        setField(term6304, term6304.getClass(), "next", null);
        setField(term6304, term6304.getClass(), "first", null);
        setField(term6304, term6304.getClass(), "last", null);
        setField(term6304, term6304.getClass(), "propListHead", null);
        setIntField(term6304, term6304.getClass(), "sourcePosition", 0);
        setField(term6304, term6304.getClass(), "jsType", null);
        setField(term6304, term6304.getClass(), "parent", null);
        setField(term6302, term6302.getClass(), "first", term6304);
        setIntField(term6305, term6305.getClass(), "type", 0);
        setField(term6305, term6305.getClass(), "next", null);
        setField(term6305, term6305.getClass(), "first", null);
        setField(term6305, term6305.getClass(), "last", null);
        setField(term6305, term6305.getClass(), "propListHead", null);
        setIntField(term6305, term6305.getClass(), "sourcePosition", 0);
        setField(term6305, term6305.getClass(), "jsType", null);
        setField(term6305, term6305.getClass(), "parent", null);
        setField(term6302, term6302.getClass(), "last", term6305);
        setField(term6306, term6306.getClass(), "next", null);
        setIntField(term6306, term6306.getClass(), "type", 0);
        setIntField(term6306, term6306.getClass(), "intValue", 0);
        setField(term6306, term6306.getClass(), "objectValue", null);
        setField(term6302, term6302.getClass(), "propListHead", term6306);
        setIntField(term6302, term6302.getClass(), "sourcePosition", -945116798);
        setField(term6302, term6302.getClass(), "jsType", null);
        setField(term6302, term6302.getClass(), "parent", null);
        setField(term6301, term6301.getClass(), "next", term6302);
        setIntField(term6307, term6307.getClass(), "type", 0);
        setField(term6307, term6307.getClass(), "next", null);
        setField(term6307, term6307.getClass(), "first", null);
        setField(term6307, term6307.getClass(), "last", null);
        setField(term6307, term6307.getClass(), "propListHead", null);
        setIntField(term6307, term6307.getClass(), "sourcePosition", 0);
        setField(term6307, term6307.getClass(), "jsType", null);
        setField(term6307, term6307.getClass(), "parent", null);
        setField(term6301, term6301.getClass(), "first", term6307);
        setIntField(term6308, term6308.getClass(), "type", 0);
        setField(term6308, term6308.getClass(), "next", null);
        setField(term6308, term6308.getClass(), "first", null);
        setField(term6308, term6308.getClass(), "last", null);
        setField(term6308, term6308.getClass(), "propListHead", null);
        setIntField(term6308, term6308.getClass(), "sourcePosition", 0);
        setField(term6308, term6308.getClass(), "jsType", null);
        setField(term6308, term6308.getClass(), "parent", null);
        setField(term6301, term6301.getClass(), "last", term6308);
        setField(term6309, term6309.getClass(), "next", null);
        setIntField(term6309, term6309.getClass(), "type", 0);
        setIntField(term6309, term6309.getClass(), "intValue", 0);
        setField(term6309, term6309.getClass(), "objectValue", null);
        setField(term6301, term6301.getClass(), "propListHead", term6309);
        setIntField(term6301, term6301.getClass(), "sourcePosition", 1593461795);
        setField(term6301, term6301.getClass(), "jsType", null);
        setField(term6301, term6301.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term625;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term625, term6301));
    }

};


