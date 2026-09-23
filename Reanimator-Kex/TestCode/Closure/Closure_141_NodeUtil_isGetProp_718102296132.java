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

public class NodeUtil_isGetProp_718102296132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;
     Object term6409;

    public NodeUtil_isGetProp_718102296132() {
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
        term6409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6417 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6409, term6409.getClass(), "type", 1870727665);
        setIntField(term6410, term6410.getClass(), "type", -919416536);
        setIntField(term6411, term6411.getClass(), "type", 0);
        setField(term6411, term6411.getClass(), "next", null);
        setField(term6411, term6411.getClass(), "first", null);
        setField(term6411, term6411.getClass(), "last", null);
        setField(term6411, term6411.getClass(), "propListHead", null);
        setIntField(term6411, term6411.getClass(), "sourcePosition", 0);
        setField(term6411, term6411.getClass(), "jsType", null);
        setField(term6411, term6411.getClass(), "parent", null);
        setField(term6410, term6410.getClass(), "next", term6411);
        setIntField(term6412, term6412.getClass(), "type", 0);
        setField(term6412, term6412.getClass(), "next", null);
        setField(term6412, term6412.getClass(), "first", null);
        setField(term6412, term6412.getClass(), "last", null);
        setField(term6412, term6412.getClass(), "propListHead", null);
        setIntField(term6412, term6412.getClass(), "sourcePosition", 0);
        setField(term6412, term6412.getClass(), "jsType", null);
        setField(term6412, term6412.getClass(), "parent", null);
        setField(term6410, term6410.getClass(), "first", term6412);
        setIntField(term6413, term6413.getClass(), "type", 0);
        setField(term6413, term6413.getClass(), "next", null);
        setField(term6413, term6413.getClass(), "first", null);
        setField(term6413, term6413.getClass(), "last", null);
        setField(term6413, term6413.getClass(), "propListHead", null);
        setIntField(term6413, term6413.getClass(), "sourcePosition", 0);
        setField(term6413, term6413.getClass(), "jsType", null);
        setField(term6413, term6413.getClass(), "parent", null);
        setField(term6410, term6410.getClass(), "last", term6413);
        setField(term6414, term6414.getClass(), "next", null);
        setIntField(term6414, term6414.getClass(), "type", 0);
        setIntField(term6414, term6414.getClass(), "intValue", 0);
        setField(term6414, term6414.getClass(), "objectValue", null);
        setField(term6410, term6410.getClass(), "propListHead", term6414);
        setIntField(term6410, term6410.getClass(), "sourcePosition", -123338791);
        setField(term6410, term6410.getClass(), "jsType", null);
        setField(term6410, term6410.getClass(), "parent", null);
        setField(term6409, term6409.getClass(), "next", term6410);
        setIntField(term6415, term6415.getClass(), "type", 0);
        setField(term6415, term6415.getClass(), "next", null);
        setField(term6415, term6415.getClass(), "first", null);
        setField(term6415, term6415.getClass(), "last", null);
        setField(term6415, term6415.getClass(), "propListHead", null);
        setIntField(term6415, term6415.getClass(), "sourcePosition", 0);
        setField(term6415, term6415.getClass(), "jsType", null);
        setField(term6415, term6415.getClass(), "parent", null);
        setField(term6409, term6409.getClass(), "first", term6415);
        setIntField(term6416, term6416.getClass(), "type", 0);
        setField(term6416, term6416.getClass(), "next", null);
        setField(term6416, term6416.getClass(), "first", null);
        setField(term6416, term6416.getClass(), "last", null);
        setField(term6416, term6416.getClass(), "propListHead", null);
        setIntField(term6416, term6416.getClass(), "sourcePosition", 0);
        setField(term6416, term6416.getClass(), "jsType", null);
        setField(term6416, term6416.getClass(), "parent", null);
        setField(term6409, term6409.getClass(), "last", term6416);
        setField(term6417, term6417.getClass(), "next", null);
        setIntField(term6417, term6417.getClass(), "type", 0);
        setIntField(term6417, term6417.getClass(), "intValue", 0);
        setField(term6417, term6417.getClass(), "objectValue", null);
        setField(term6409, term6409.getClass(), "propListHead", term6417);
        setIntField(term6409, term6409.getClass(), "sourcePosition", -1467089634);
        setField(term6409, term6409.getClass(), "jsType", null);
        setField(term6409, term6409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term679;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term679, term6409));
        assertTrue(recursiveEquals(retValue, false));
    }

};


