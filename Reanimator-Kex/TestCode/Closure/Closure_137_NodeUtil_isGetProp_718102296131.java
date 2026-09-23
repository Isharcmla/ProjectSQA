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

public class NodeUtil_isGetProp_718102296131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;
     Object term6382;

    public NodeUtil_isGetProp_718102296131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term692 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term702 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term679, term679.getClass(), "type", 1870727665);
        setIntField(term681, term681.getClass(), "type", -919416536);
        setIntField(term683, term683.getClass(), "type", 0);
        setField(term683, term683.getClass(), "next", null);
        setField(term683, term683.getClass(), "first", null);
        setField(term683, term683.getClass(), "last", null);
        setField(term683, term683.getClass(), "propListHead", null);
        setIntField(term683, term683.getClass(), "sourcePosition", 0);
        setField(term683, term683.getClass(), "jsType", null);
        setField(term683, term683.getClass(), "parent", null);
        setField(term681, term681.getClass(), "next", term683);
        setIntField(term686, term686.getClass(), "type", 0);
        setField(term686, term686.getClass(), "next", null);
        setField(term686, term686.getClass(), "first", null);
        setField(term686, term686.getClass(), "last", null);
        setField(term686, term686.getClass(), "propListHead", null);
        setIntField(term686, term686.getClass(), "sourcePosition", 0);
        setField(term686, term686.getClass(), "jsType", null);
        setField(term686, term686.getClass(), "parent", null);
        setField(term681, term681.getClass(), "first", term686);
        setIntField(term689, term689.getClass(), "type", 0);
        setField(term689, term689.getClass(), "next", null);
        setField(term689, term689.getClass(), "first", null);
        setField(term689, term689.getClass(), "last", null);
        setField(term689, term689.getClass(), "propListHead", null);
        setIntField(term689, term689.getClass(), "sourcePosition", 0);
        setField(term689, term689.getClass(), "jsType", null);
        setField(term689, term689.getClass(), "parent", null);
        setField(term681, term681.getClass(), "last", term689);
        setField(term692, term692.getClass(), "next", null);
        setIntField(term692, term692.getClass(), "type", 0);
        setIntField(term692, term692.getClass(), "intValue", 0);
        setField(term692, term692.getClass(), "objectValue", null);
        setField(term681, term681.getClass(), "propListHead", term692);
        setIntField(term681, term681.getClass(), "sourcePosition", -123338791);
        setField(term681, term681.getClass(), "jsType", null);
        setField(term681, term681.getClass(), "parent", null);
        setField(term679, term679.getClass(), "next", term681);
        setIntField(term696, term696.getClass(), "type", 0);
        setField(term696, term696.getClass(), "next", null);
        setField(term696, term696.getClass(), "first", null);
        setField(term696, term696.getClass(), "last", null);
        setField(term696, term696.getClass(), "propListHead", null);
        setIntField(term696, term696.getClass(), "sourcePosition", 0);
        setField(term696, term696.getClass(), "jsType", null);
        setField(term696, term696.getClass(), "parent", null);
        setField(term679, term679.getClass(), "first", term696);
        setIntField(term699, term699.getClass(), "type", 0);
        setField(term699, term699.getClass(), "next", null);
        setField(term699, term699.getClass(), "first", null);
        setField(term699, term699.getClass(), "last", null);
        setField(term699, term699.getClass(), "propListHead", null);
        setIntField(term699, term699.getClass(), "sourcePosition", 0);
        setField(term699, term699.getClass(), "jsType", null);
        setField(term699, term699.getClass(), "parent", null);
        setField(term679, term679.getClass(), "last", term699);
        setField(term702, term702.getClass(), "next", null);
        setIntField(term702, term702.getClass(), "type", 0);
        setIntField(term702, term702.getClass(), "intValue", 0);
        setField(term702, term702.getClass(), "objectValue", null);
        setField(term679, term679.getClass(), "propListHead", term702);
        setIntField(term679, term679.getClass(), "sourcePosition", -1467089634);
        setField(term679, term679.getClass(), "jsType", null);
        setField(term679, term679.getClass(), "parent", null);
        term6382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6387 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6390 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6382, term6382.getClass(), "type", 1870727665);
        setIntField(term6383, term6383.getClass(), "type", -919416536);
        setIntField(term6384, term6384.getClass(), "type", 0);
        setField(term6384, term6384.getClass(), "next", null);
        setField(term6384, term6384.getClass(), "first", null);
        setField(term6384, term6384.getClass(), "last", null);
        setField(term6384, term6384.getClass(), "propListHead", null);
        setIntField(term6384, term6384.getClass(), "sourcePosition", 0);
        setField(term6384, term6384.getClass(), "jsType", null);
        setField(term6384, term6384.getClass(), "parent", null);
        setField(term6383, term6383.getClass(), "next", term6384);
        setIntField(term6385, term6385.getClass(), "type", 0);
        setField(term6385, term6385.getClass(), "next", null);
        setField(term6385, term6385.getClass(), "first", null);
        setField(term6385, term6385.getClass(), "last", null);
        setField(term6385, term6385.getClass(), "propListHead", null);
        setIntField(term6385, term6385.getClass(), "sourcePosition", 0);
        setField(term6385, term6385.getClass(), "jsType", null);
        setField(term6385, term6385.getClass(), "parent", null);
        setField(term6383, term6383.getClass(), "first", term6385);
        setIntField(term6386, term6386.getClass(), "type", 0);
        setField(term6386, term6386.getClass(), "next", null);
        setField(term6386, term6386.getClass(), "first", null);
        setField(term6386, term6386.getClass(), "last", null);
        setField(term6386, term6386.getClass(), "propListHead", null);
        setIntField(term6386, term6386.getClass(), "sourcePosition", 0);
        setField(term6386, term6386.getClass(), "jsType", null);
        setField(term6386, term6386.getClass(), "parent", null);
        setField(term6383, term6383.getClass(), "last", term6386);
        setField(term6387, term6387.getClass(), "next", null);
        setIntField(term6387, term6387.getClass(), "type", 0);
        setIntField(term6387, term6387.getClass(), "intValue", 0);
        setField(term6387, term6387.getClass(), "objectValue", null);
        setField(term6383, term6383.getClass(), "propListHead", term6387);
        setIntField(term6383, term6383.getClass(), "sourcePosition", -123338791);
        setField(term6383, term6383.getClass(), "jsType", null);
        setField(term6383, term6383.getClass(), "parent", null);
        setField(term6382, term6382.getClass(), "next", term6383);
        setIntField(term6388, term6388.getClass(), "type", 0);
        setField(term6388, term6388.getClass(), "next", null);
        setField(term6388, term6388.getClass(), "first", null);
        setField(term6388, term6388.getClass(), "last", null);
        setField(term6388, term6388.getClass(), "propListHead", null);
        setIntField(term6388, term6388.getClass(), "sourcePosition", 0);
        setField(term6388, term6388.getClass(), "jsType", null);
        setField(term6388, term6388.getClass(), "parent", null);
        setField(term6382, term6382.getClass(), "first", term6388);
        setIntField(term6389, term6389.getClass(), "type", 0);
        setField(term6389, term6389.getClass(), "next", null);
        setField(term6389, term6389.getClass(), "first", null);
        setField(term6389, term6389.getClass(), "last", null);
        setField(term6389, term6389.getClass(), "propListHead", null);
        setIntField(term6389, term6389.getClass(), "sourcePosition", 0);
        setField(term6389, term6389.getClass(), "jsType", null);
        setField(term6389, term6389.getClass(), "parent", null);
        setField(term6382, term6382.getClass(), "last", term6389);
        setField(term6390, term6390.getClass(), "next", null);
        setIntField(term6390, term6390.getClass(), "type", 0);
        setIntField(term6390, term6390.getClass(), "intValue", 0);
        setField(term6390, term6390.getClass(), "objectValue", null);
        setField(term6382, term6382.getClass(), "propListHead", term6390);
        setIntField(term6382, term6382.getClass(), "sourcePosition", -1467089634);
        setField(term6382, term6382.getClass(), "jsType", null);
        setField(term6382, term6382.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term679;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term679, term6382));
        assertTrue(recursiveEquals(retValue, false));
    }

};


