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

public class NodeUtil_referencesThis_2041162929130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term625;
     Object term6328;

    public NodeUtil_referencesThis_2041162929130() {
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
        term6328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6333 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6336 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6328, term6328.getClass(), "type", -1497710478);
        setIntField(term6329, term6329.getClass(), "type", 34470066);
        setIntField(term6330, term6330.getClass(), "type", 0);
        setField(term6330, term6330.getClass(), "next", null);
        setField(term6330, term6330.getClass(), "first", null);
        setField(term6330, term6330.getClass(), "last", null);
        setField(term6330, term6330.getClass(), "propListHead", null);
        setIntField(term6330, term6330.getClass(), "sourcePosition", 0);
        setField(term6330, term6330.getClass(), "jsType", null);
        setField(term6330, term6330.getClass(), "parent", null);
        setField(term6329, term6329.getClass(), "next", term6330);
        setIntField(term6331, term6331.getClass(), "type", 0);
        setField(term6331, term6331.getClass(), "next", null);
        setField(term6331, term6331.getClass(), "first", null);
        setField(term6331, term6331.getClass(), "last", null);
        setField(term6331, term6331.getClass(), "propListHead", null);
        setIntField(term6331, term6331.getClass(), "sourcePosition", 0);
        setField(term6331, term6331.getClass(), "jsType", null);
        setField(term6331, term6331.getClass(), "parent", null);
        setField(term6329, term6329.getClass(), "first", term6331);
        setIntField(term6332, term6332.getClass(), "type", 0);
        setField(term6332, term6332.getClass(), "next", null);
        setField(term6332, term6332.getClass(), "first", null);
        setField(term6332, term6332.getClass(), "last", null);
        setField(term6332, term6332.getClass(), "propListHead", null);
        setIntField(term6332, term6332.getClass(), "sourcePosition", 0);
        setField(term6332, term6332.getClass(), "jsType", null);
        setField(term6332, term6332.getClass(), "parent", null);
        setField(term6329, term6329.getClass(), "last", term6332);
        setField(term6333, term6333.getClass(), "next", null);
        setIntField(term6333, term6333.getClass(), "type", 0);
        setIntField(term6333, term6333.getClass(), "intValue", 0);
        setField(term6333, term6333.getClass(), "objectValue", null);
        setField(term6329, term6329.getClass(), "propListHead", term6333);
        setIntField(term6329, term6329.getClass(), "sourcePosition", -945116798);
        setField(term6329, term6329.getClass(), "jsType", null);
        setField(term6329, term6329.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "next", term6329);
        setIntField(term6334, term6334.getClass(), "type", 0);
        setField(term6334, term6334.getClass(), "next", null);
        setField(term6334, term6334.getClass(), "first", null);
        setField(term6334, term6334.getClass(), "last", null);
        setField(term6334, term6334.getClass(), "propListHead", null);
        setIntField(term6334, term6334.getClass(), "sourcePosition", 0);
        setField(term6334, term6334.getClass(), "jsType", null);
        setField(term6334, term6334.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "first", term6334);
        setIntField(term6335, term6335.getClass(), "type", 0);
        setField(term6335, term6335.getClass(), "next", null);
        setField(term6335, term6335.getClass(), "first", null);
        setField(term6335, term6335.getClass(), "last", null);
        setField(term6335, term6335.getClass(), "propListHead", null);
        setIntField(term6335, term6335.getClass(), "sourcePosition", 0);
        setField(term6335, term6335.getClass(), "jsType", null);
        setField(term6335, term6335.getClass(), "parent", null);
        setField(term6328, term6328.getClass(), "last", term6335);
        setField(term6336, term6336.getClass(), "next", null);
        setIntField(term6336, term6336.getClass(), "type", 0);
        setIntField(term6336, term6336.getClass(), "intValue", 0);
        setField(term6336, term6336.getClass(), "objectValue", null);
        setField(term6328, term6328.getClass(), "propListHead", term6336);
        setIntField(term6328, term6328.getClass(), "sourcePosition", 1593461795);
        setField(term6328, term6328.getClass(), "jsType", null);
        setField(term6328, term6328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term625;
        callMethod(klass, "referencesThis", argTypes, null, args);
        assertTrue(recursiveEquals(term625, term6328));
    }

};


