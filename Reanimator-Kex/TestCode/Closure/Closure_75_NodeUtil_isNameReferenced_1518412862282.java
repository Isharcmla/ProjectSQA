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

public class NodeUtil_isNameReferenced_1518412862282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;
     Object term22574;

    public NodeUtil_isNameReferenced_1518412862282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3805 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3815 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3792, term3792.getClass(), "type", 301438568);
        setIntField(term3794, term3794.getClass(), "type", 1217804703);
        setIntField(term3796, term3796.getClass(), "type", 0);
        setField(term3796, term3796.getClass(), "next", null);
        setField(term3796, term3796.getClass(), "first", null);
        setField(term3796, term3796.getClass(), "last", null);
        setField(term3796, term3796.getClass(), "propListHead", null);
        setIntField(term3796, term3796.getClass(), "sourcePosition", 0);
        setField(term3796, term3796.getClass(), "jsType", null);
        setField(term3796, term3796.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "next", term3796);
        setIntField(term3799, term3799.getClass(), "type", 0);
        setField(term3799, term3799.getClass(), "next", null);
        setField(term3799, term3799.getClass(), "first", null);
        setField(term3799, term3799.getClass(), "last", null);
        setField(term3799, term3799.getClass(), "propListHead", null);
        setIntField(term3799, term3799.getClass(), "sourcePosition", 0);
        setField(term3799, term3799.getClass(), "jsType", null);
        setField(term3799, term3799.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "first", term3799);
        setIntField(term3802, term3802.getClass(), "type", 0);
        setField(term3802, term3802.getClass(), "next", null);
        setField(term3802, term3802.getClass(), "first", null);
        setField(term3802, term3802.getClass(), "last", null);
        setField(term3802, term3802.getClass(), "propListHead", null);
        setIntField(term3802, term3802.getClass(), "sourcePosition", 0);
        setField(term3802, term3802.getClass(), "jsType", null);
        setField(term3802, term3802.getClass(), "parent", null);
        setField(term3794, term3794.getClass(), "last", term3802);
        setField(term3805, term3805.getClass(), "next", null);
        setIntField(term3805, term3805.getClass(), "type", 0);
        setIntField(term3805, term3805.getClass(), "intValue", 0);
        setField(term3805, term3805.getClass(), "objectValue", null);
        setField(term3794, term3794.getClass(), "propListHead", term3805);
        setIntField(term3794, term3794.getClass(), "sourcePosition", 494400151);
        setField(term3794, term3794.getClass(), "jsType", null);
        setField(term3794, term3794.getClass(), "parent", null);
        setField(term3792, term3792.getClass(), "next", term3794);
        setIntField(term3809, term3809.getClass(), "type", 0);
        setField(term3809, term3809.getClass(), "next", null);
        setField(term3809, term3809.getClass(), "first", null);
        setField(term3809, term3809.getClass(), "last", null);
        setField(term3809, term3809.getClass(), "propListHead", null);
        setIntField(term3809, term3809.getClass(), "sourcePosition", 0);
        setField(term3809, term3809.getClass(), "jsType", null);
        setField(term3809, term3809.getClass(), "parent", null);
        setField(term3792, term3792.getClass(), "first", term3809);
        setIntField(term3812, term3812.getClass(), "type", 0);
        setField(term3812, term3812.getClass(), "next", null);
        setField(term3812, term3812.getClass(), "first", null);
        setField(term3812, term3812.getClass(), "last", null);
        setField(term3812, term3812.getClass(), "propListHead", null);
        setIntField(term3812, term3812.getClass(), "sourcePosition", 0);
        setField(term3812, term3812.getClass(), "jsType", null);
        setField(term3812, term3812.getClass(), "parent", null);
        setField(term3792, term3792.getClass(), "last", term3812);
        setField(term3815, term3815.getClass(), "next", null);
        setIntField(term3815, term3815.getClass(), "type", 0);
        setIntField(term3815, term3815.getClass(), "intValue", 0);
        setField(term3815, term3815.getClass(), "objectValue", null);
        setField(term3792, term3792.getClass(), "propListHead", term3815);
        setIntField(term3792, term3792.getClass(), "sourcePosition", 1588058685);
        setField(term3792, term3792.getClass(), "jsType", null);
        setField(term3792, term3792.getClass(), "parent", null);
        term22574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22579 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term22580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22582 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term22574, term22574.getClass(), "type", 301438568);
        setIntField(term22575, term22575.getClass(), "type", 1217804703);
        setIntField(term22576, term22576.getClass(), "type", 0);
        setField(term22576, term22576.getClass(), "next", null);
        setField(term22576, term22576.getClass(), "first", null);
        setField(term22576, term22576.getClass(), "last", null);
        setField(term22576, term22576.getClass(), "propListHead", null);
        setIntField(term22576, term22576.getClass(), "sourcePosition", 0);
        setField(term22576, term22576.getClass(), "jsType", null);
        setField(term22576, term22576.getClass(), "parent", null);
        setField(term22575, term22575.getClass(), "next", term22576);
        setIntField(term22577, term22577.getClass(), "type", 0);
        setField(term22577, term22577.getClass(), "next", null);
        setField(term22577, term22577.getClass(), "first", null);
        setField(term22577, term22577.getClass(), "last", null);
        setField(term22577, term22577.getClass(), "propListHead", null);
        setIntField(term22577, term22577.getClass(), "sourcePosition", 0);
        setField(term22577, term22577.getClass(), "jsType", null);
        setField(term22577, term22577.getClass(), "parent", null);
        setField(term22575, term22575.getClass(), "first", term22577);
        setIntField(term22578, term22578.getClass(), "type", 0);
        setField(term22578, term22578.getClass(), "next", null);
        setField(term22578, term22578.getClass(), "first", null);
        setField(term22578, term22578.getClass(), "last", null);
        setField(term22578, term22578.getClass(), "propListHead", null);
        setIntField(term22578, term22578.getClass(), "sourcePosition", 0);
        setField(term22578, term22578.getClass(), "jsType", null);
        setField(term22578, term22578.getClass(), "parent", null);
        setField(term22575, term22575.getClass(), "last", term22578);
        setField(term22579, term22579.getClass(), "next", null);
        setIntField(term22579, term22579.getClass(), "type", 0);
        setIntField(term22579, term22579.getClass(), "intValue", 0);
        setField(term22579, term22579.getClass(), "objectValue", null);
        setField(term22575, term22575.getClass(), "propListHead", term22579);
        setIntField(term22575, term22575.getClass(), "sourcePosition", 494400151);
        setField(term22575, term22575.getClass(), "jsType", null);
        setField(term22575, term22575.getClass(), "parent", null);
        setField(term22574, term22574.getClass(), "next", term22575);
        setIntField(term22580, term22580.getClass(), "type", 0);
        setField(term22580, term22580.getClass(), "next", null);
        setField(term22580, term22580.getClass(), "first", null);
        setField(term22580, term22580.getClass(), "last", null);
        setField(term22580, term22580.getClass(), "propListHead", null);
        setIntField(term22580, term22580.getClass(), "sourcePosition", 0);
        setField(term22580, term22580.getClass(), "jsType", null);
        setField(term22580, term22580.getClass(), "parent", null);
        setField(term22574, term22574.getClass(), "first", term22580);
        setIntField(term22581, term22581.getClass(), "type", 0);
        setField(term22581, term22581.getClass(), "next", null);
        setField(term22581, term22581.getClass(), "first", null);
        setField(term22581, term22581.getClass(), "last", null);
        setField(term22581, term22581.getClass(), "propListHead", null);
        setIntField(term22581, term22581.getClass(), "sourcePosition", 0);
        setField(term22581, term22581.getClass(), "jsType", null);
        setField(term22581, term22581.getClass(), "parent", null);
        setField(term22574, term22574.getClass(), "last", term22581);
        setField(term22582, term22582.getClass(), "next", null);
        setIntField(term22582, term22582.getClass(), "type", 0);
        setIntField(term22582, term22582.getClass(), "intValue", 0);
        setField(term22582, term22582.getClass(), "objectValue", null);
        setField(term22574, term22574.getClass(), "propListHead", term22582);
        setIntField(term22574, term22574.getClass(), "sourcePosition", 1588058685);
        setField(term22574, term22574.getClass(), "jsType", null);
        setField(term22574, term22574.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term3792;
        args[1] = "OclPbYPkcH";
        callMethod(klass, "isNameReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term3792, "OclPbYPkcH"));
    }

};


