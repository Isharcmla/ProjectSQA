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

public class NodeUtil_isVarDeclaration_1285218278136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;
     Object term6569;

    public NodeUtil_isVarDeclaration_1285218278136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term800 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term787, term787.getClass(), "type", 1215150180);
        setIntField(term789, term789.getClass(), "type", -220791533);
        setIntField(term791, term791.getClass(), "type", 0);
        setField(term791, term791.getClass(), "next", null);
        setField(term791, term791.getClass(), "first", null);
        setField(term791, term791.getClass(), "last", null);
        setField(term791, term791.getClass(), "propListHead", null);
        setIntField(term791, term791.getClass(), "sourcePosition", 0);
        setField(term791, term791.getClass(), "jsType", null);
        setField(term791, term791.getClass(), "parent", null);
        setField(term789, term789.getClass(), "next", term791);
        setIntField(term794, term794.getClass(), "type", 0);
        setField(term794, term794.getClass(), "next", null);
        setField(term794, term794.getClass(), "first", null);
        setField(term794, term794.getClass(), "last", null);
        setField(term794, term794.getClass(), "propListHead", null);
        setIntField(term794, term794.getClass(), "sourcePosition", 0);
        setField(term794, term794.getClass(), "jsType", null);
        setField(term794, term794.getClass(), "parent", null);
        setField(term789, term789.getClass(), "first", term794);
        setIntField(term797, term797.getClass(), "type", 0);
        setField(term797, term797.getClass(), "next", null);
        setField(term797, term797.getClass(), "first", null);
        setField(term797, term797.getClass(), "last", null);
        setField(term797, term797.getClass(), "propListHead", null);
        setIntField(term797, term797.getClass(), "sourcePosition", 0);
        setField(term797, term797.getClass(), "jsType", null);
        setField(term797, term797.getClass(), "parent", null);
        setField(term789, term789.getClass(), "last", term797);
        setField(term800, term800.getClass(), "next", null);
        setIntField(term800, term800.getClass(), "type", 0);
        setIntField(term800, term800.getClass(), "intValue", 0);
        setField(term800, term800.getClass(), "objectValue", null);
        setField(term789, term789.getClass(), "propListHead", term800);
        setIntField(term789, term789.getClass(), "sourcePosition", -1127721881);
        setField(term789, term789.getClass(), "jsType", null);
        setField(term789, term789.getClass(), "parent", null);
        setField(term787, term787.getClass(), "next", term789);
        setIntField(term804, term804.getClass(), "type", 0);
        setField(term804, term804.getClass(), "next", null);
        setField(term804, term804.getClass(), "first", null);
        setField(term804, term804.getClass(), "last", null);
        setField(term804, term804.getClass(), "propListHead", null);
        setIntField(term804, term804.getClass(), "sourcePosition", 0);
        setField(term804, term804.getClass(), "jsType", null);
        setField(term804, term804.getClass(), "parent", null);
        setField(term787, term787.getClass(), "first", term804);
        setIntField(term807, term807.getClass(), "type", 0);
        setField(term807, term807.getClass(), "next", null);
        setField(term807, term807.getClass(), "first", null);
        setField(term807, term807.getClass(), "last", null);
        setField(term807, term807.getClass(), "propListHead", null);
        setIntField(term807, term807.getClass(), "sourcePosition", 0);
        setField(term807, term807.getClass(), "jsType", null);
        setField(term807, term807.getClass(), "parent", null);
        setField(term787, term787.getClass(), "last", term807);
        setField(term810, term810.getClass(), "next", null);
        setIntField(term810, term810.getClass(), "type", 0);
        setIntField(term810, term810.getClass(), "intValue", 0);
        setField(term810, term810.getClass(), "objectValue", null);
        setField(term787, term787.getClass(), "propListHead", term810);
        setIntField(term787, term787.getClass(), "sourcePosition", 1074848808);
        setField(term787, term787.getClass(), "jsType", null);
        setField(term787, term787.getClass(), "parent", null);
        term6569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6574 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6577 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6569, term6569.getClass(), "type", 1215150180);
        setIntField(term6570, term6570.getClass(), "type", -220791533);
        setIntField(term6571, term6571.getClass(), "type", 0);
        setField(term6571, term6571.getClass(), "next", null);
        setField(term6571, term6571.getClass(), "first", null);
        setField(term6571, term6571.getClass(), "last", null);
        setField(term6571, term6571.getClass(), "propListHead", null);
        setIntField(term6571, term6571.getClass(), "sourcePosition", 0);
        setField(term6571, term6571.getClass(), "jsType", null);
        setField(term6571, term6571.getClass(), "parent", null);
        setField(term6570, term6570.getClass(), "next", term6571);
        setIntField(term6572, term6572.getClass(), "type", 0);
        setField(term6572, term6572.getClass(), "next", null);
        setField(term6572, term6572.getClass(), "first", null);
        setField(term6572, term6572.getClass(), "last", null);
        setField(term6572, term6572.getClass(), "propListHead", null);
        setIntField(term6572, term6572.getClass(), "sourcePosition", 0);
        setField(term6572, term6572.getClass(), "jsType", null);
        setField(term6572, term6572.getClass(), "parent", null);
        setField(term6570, term6570.getClass(), "first", term6572);
        setIntField(term6573, term6573.getClass(), "type", 0);
        setField(term6573, term6573.getClass(), "next", null);
        setField(term6573, term6573.getClass(), "first", null);
        setField(term6573, term6573.getClass(), "last", null);
        setField(term6573, term6573.getClass(), "propListHead", null);
        setIntField(term6573, term6573.getClass(), "sourcePosition", 0);
        setField(term6573, term6573.getClass(), "jsType", null);
        setField(term6573, term6573.getClass(), "parent", null);
        setField(term6570, term6570.getClass(), "last", term6573);
        setField(term6574, term6574.getClass(), "next", null);
        setIntField(term6574, term6574.getClass(), "type", 0);
        setIntField(term6574, term6574.getClass(), "intValue", 0);
        setField(term6574, term6574.getClass(), "objectValue", null);
        setField(term6570, term6570.getClass(), "propListHead", term6574);
        setIntField(term6570, term6570.getClass(), "sourcePosition", -1127721881);
        setField(term6570, term6570.getClass(), "jsType", null);
        setField(term6570, term6570.getClass(), "parent", null);
        setField(term6569, term6569.getClass(), "next", term6570);
        setIntField(term6575, term6575.getClass(), "type", 0);
        setField(term6575, term6575.getClass(), "next", null);
        setField(term6575, term6575.getClass(), "first", null);
        setField(term6575, term6575.getClass(), "last", null);
        setField(term6575, term6575.getClass(), "propListHead", null);
        setIntField(term6575, term6575.getClass(), "sourcePosition", 0);
        setField(term6575, term6575.getClass(), "jsType", null);
        setField(term6575, term6575.getClass(), "parent", null);
        setField(term6569, term6569.getClass(), "first", term6575);
        setIntField(term6576, term6576.getClass(), "type", 0);
        setField(term6576, term6576.getClass(), "next", null);
        setField(term6576, term6576.getClass(), "first", null);
        setField(term6576, term6576.getClass(), "last", null);
        setField(term6576, term6576.getClass(), "propListHead", null);
        setIntField(term6576, term6576.getClass(), "sourcePosition", 0);
        setField(term6576, term6576.getClass(), "jsType", null);
        setField(term6576, term6576.getClass(), "parent", null);
        setField(term6569, term6569.getClass(), "last", term6576);
        setField(term6577, term6577.getClass(), "next", null);
        setIntField(term6577, term6577.getClass(), "type", 0);
        setIntField(term6577, term6577.getClass(), "intValue", 0);
        setField(term6577, term6577.getClass(), "objectValue", null);
        setField(term6569, term6569.getClass(), "propListHead", term6577);
        setIntField(term6569, term6569.getClass(), "sourcePosition", 1074848808);
        setField(term6569, term6569.getClass(), "jsType", null);
        setField(term6569, term6569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term787;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term787, term6569));
        assertTrue(recursiveEquals(retValue, false));
    }

};


