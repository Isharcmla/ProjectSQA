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

public class NodeUtil_isVarDeclaration_1285218278135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;
     Object term6542;

    public NodeUtil_isVarDeclaration_1285218278135() {
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
        term6542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6547 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6550 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6542, term6542.getClass(), "type", 1215150180);
        setIntField(term6543, term6543.getClass(), "type", -220791533);
        setIntField(term6544, term6544.getClass(), "type", 0);
        setField(term6544, term6544.getClass(), "next", null);
        setField(term6544, term6544.getClass(), "first", null);
        setField(term6544, term6544.getClass(), "last", null);
        setField(term6544, term6544.getClass(), "propListHead", null);
        setIntField(term6544, term6544.getClass(), "sourcePosition", 0);
        setField(term6544, term6544.getClass(), "jsType", null);
        setField(term6544, term6544.getClass(), "parent", null);
        setField(term6543, term6543.getClass(), "next", term6544);
        setIntField(term6545, term6545.getClass(), "type", 0);
        setField(term6545, term6545.getClass(), "next", null);
        setField(term6545, term6545.getClass(), "first", null);
        setField(term6545, term6545.getClass(), "last", null);
        setField(term6545, term6545.getClass(), "propListHead", null);
        setIntField(term6545, term6545.getClass(), "sourcePosition", 0);
        setField(term6545, term6545.getClass(), "jsType", null);
        setField(term6545, term6545.getClass(), "parent", null);
        setField(term6543, term6543.getClass(), "first", term6545);
        setIntField(term6546, term6546.getClass(), "type", 0);
        setField(term6546, term6546.getClass(), "next", null);
        setField(term6546, term6546.getClass(), "first", null);
        setField(term6546, term6546.getClass(), "last", null);
        setField(term6546, term6546.getClass(), "propListHead", null);
        setIntField(term6546, term6546.getClass(), "sourcePosition", 0);
        setField(term6546, term6546.getClass(), "jsType", null);
        setField(term6546, term6546.getClass(), "parent", null);
        setField(term6543, term6543.getClass(), "last", term6546);
        setField(term6547, term6547.getClass(), "next", null);
        setIntField(term6547, term6547.getClass(), "type", 0);
        setIntField(term6547, term6547.getClass(), "intValue", 0);
        setField(term6547, term6547.getClass(), "objectValue", null);
        setField(term6543, term6543.getClass(), "propListHead", term6547);
        setIntField(term6543, term6543.getClass(), "sourcePosition", -1127721881);
        setField(term6543, term6543.getClass(), "jsType", null);
        setField(term6543, term6543.getClass(), "parent", null);
        setField(term6542, term6542.getClass(), "next", term6543);
        setIntField(term6548, term6548.getClass(), "type", 0);
        setField(term6548, term6548.getClass(), "next", null);
        setField(term6548, term6548.getClass(), "first", null);
        setField(term6548, term6548.getClass(), "last", null);
        setField(term6548, term6548.getClass(), "propListHead", null);
        setIntField(term6548, term6548.getClass(), "sourcePosition", 0);
        setField(term6548, term6548.getClass(), "jsType", null);
        setField(term6548, term6548.getClass(), "parent", null);
        setField(term6542, term6542.getClass(), "first", term6548);
        setIntField(term6549, term6549.getClass(), "type", 0);
        setField(term6549, term6549.getClass(), "next", null);
        setField(term6549, term6549.getClass(), "first", null);
        setField(term6549, term6549.getClass(), "last", null);
        setField(term6549, term6549.getClass(), "propListHead", null);
        setIntField(term6549, term6549.getClass(), "sourcePosition", 0);
        setField(term6549, term6549.getClass(), "jsType", null);
        setField(term6549, term6549.getClass(), "parent", null);
        setField(term6542, term6542.getClass(), "last", term6549);
        setField(term6550, term6550.getClass(), "next", null);
        setIntField(term6550, term6550.getClass(), "type", 0);
        setIntField(term6550, term6550.getClass(), "intValue", 0);
        setField(term6550, term6550.getClass(), "objectValue", null);
        setField(term6542, term6542.getClass(), "propListHead", term6550);
        setIntField(term6542, term6542.getClass(), "sourcePosition", 1074848808);
        setField(term6542, term6542.getClass(), "jsType", null);
        setField(term6542, term6542.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term787;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term787, term6542));
        assertTrue(recursiveEquals(retValue, false));
    }

};


