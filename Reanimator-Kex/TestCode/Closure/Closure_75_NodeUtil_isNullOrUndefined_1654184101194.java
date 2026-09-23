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

public class NodeUtil_isNullOrUndefined_1654184101194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1076;
     Object term10779;

    public NodeUtil_isNullOrUndefined_1654184101194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1076, term1076.getClass(), "type", -941356098);
        setIntField(term1078, term1078.getClass(), "type", 1374790203);
        setIntField(term1080, term1080.getClass(), "type", 0);
        setField(term1080, term1080.getClass(), "next", null);
        setField(term1080, term1080.getClass(), "first", null);
        setField(term1080, term1080.getClass(), "last", null);
        setField(term1080, term1080.getClass(), "propListHead", null);
        setIntField(term1080, term1080.getClass(), "sourcePosition", 0);
        setField(term1080, term1080.getClass(), "jsType", null);
        setField(term1080, term1080.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "next", term1080);
        setIntField(term1083, term1083.getClass(), "type", 0);
        setField(term1083, term1083.getClass(), "next", null);
        setField(term1083, term1083.getClass(), "first", null);
        setField(term1083, term1083.getClass(), "last", null);
        setField(term1083, term1083.getClass(), "propListHead", null);
        setIntField(term1083, term1083.getClass(), "sourcePosition", 0);
        setField(term1083, term1083.getClass(), "jsType", null);
        setField(term1083, term1083.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "first", term1083);
        setIntField(term1086, term1086.getClass(), "type", 0);
        setField(term1086, term1086.getClass(), "next", null);
        setField(term1086, term1086.getClass(), "first", null);
        setField(term1086, term1086.getClass(), "last", null);
        setField(term1086, term1086.getClass(), "propListHead", null);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 0);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "last", term1086);
        setField(term1089, term1089.getClass(), "next", null);
        setIntField(term1089, term1089.getClass(), "type", 0);
        setIntField(term1089, term1089.getClass(), "intValue", 0);
        setField(term1089, term1089.getClass(), "objectValue", null);
        setField(term1078, term1078.getClass(), "propListHead", term1089);
        setIntField(term1078, term1078.getClass(), "sourcePosition", -525570815);
        setField(term1078, term1078.getClass(), "jsType", null);
        setField(term1078, term1078.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "next", term1078);
        setIntField(term1093, term1093.getClass(), "type", 0);
        setField(term1093, term1093.getClass(), "next", null);
        setField(term1093, term1093.getClass(), "first", null);
        setField(term1093, term1093.getClass(), "last", null);
        setField(term1093, term1093.getClass(), "propListHead", null);
        setIntField(term1093, term1093.getClass(), "sourcePosition", 0);
        setField(term1093, term1093.getClass(), "jsType", null);
        setField(term1093, term1093.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "first", term1093);
        setIntField(term1096, term1096.getClass(), "type", 0);
        setField(term1096, term1096.getClass(), "next", null);
        setField(term1096, term1096.getClass(), "first", null);
        setField(term1096, term1096.getClass(), "last", null);
        setField(term1096, term1096.getClass(), "propListHead", null);
        setIntField(term1096, term1096.getClass(), "sourcePosition", 0);
        setField(term1096, term1096.getClass(), "jsType", null);
        setField(term1096, term1096.getClass(), "parent", null);
        setField(term1076, term1076.getClass(), "last", term1096);
        setField(term1099, term1099.getClass(), "next", null);
        setIntField(term1099, term1099.getClass(), "type", 0);
        setIntField(term1099, term1099.getClass(), "intValue", 0);
        setField(term1099, term1099.getClass(), "objectValue", null);
        setField(term1076, term1076.getClass(), "propListHead", term1099);
        setIntField(term1076, term1076.getClass(), "sourcePosition", 754055848);
        setField(term1076, term1076.getClass(), "jsType", null);
        setField(term1076, term1076.getClass(), "parent", null);
        term10779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10784 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10787 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10779, term10779.getClass(), "type", -941356098);
        setIntField(term10780, term10780.getClass(), "type", 1374790203);
        setIntField(term10781, term10781.getClass(), "type", 0);
        setField(term10781, term10781.getClass(), "next", null);
        setField(term10781, term10781.getClass(), "first", null);
        setField(term10781, term10781.getClass(), "last", null);
        setField(term10781, term10781.getClass(), "propListHead", null);
        setIntField(term10781, term10781.getClass(), "sourcePosition", 0);
        setField(term10781, term10781.getClass(), "jsType", null);
        setField(term10781, term10781.getClass(), "parent", null);
        setField(term10780, term10780.getClass(), "next", term10781);
        setIntField(term10782, term10782.getClass(), "type", 0);
        setField(term10782, term10782.getClass(), "next", null);
        setField(term10782, term10782.getClass(), "first", null);
        setField(term10782, term10782.getClass(), "last", null);
        setField(term10782, term10782.getClass(), "propListHead", null);
        setIntField(term10782, term10782.getClass(), "sourcePosition", 0);
        setField(term10782, term10782.getClass(), "jsType", null);
        setField(term10782, term10782.getClass(), "parent", null);
        setField(term10780, term10780.getClass(), "first", term10782);
        setIntField(term10783, term10783.getClass(), "type", 0);
        setField(term10783, term10783.getClass(), "next", null);
        setField(term10783, term10783.getClass(), "first", null);
        setField(term10783, term10783.getClass(), "last", null);
        setField(term10783, term10783.getClass(), "propListHead", null);
        setIntField(term10783, term10783.getClass(), "sourcePosition", 0);
        setField(term10783, term10783.getClass(), "jsType", null);
        setField(term10783, term10783.getClass(), "parent", null);
        setField(term10780, term10780.getClass(), "last", term10783);
        setField(term10784, term10784.getClass(), "next", null);
        setIntField(term10784, term10784.getClass(), "type", 0);
        setIntField(term10784, term10784.getClass(), "intValue", 0);
        setField(term10784, term10784.getClass(), "objectValue", null);
        setField(term10780, term10780.getClass(), "propListHead", term10784);
        setIntField(term10780, term10780.getClass(), "sourcePosition", -525570815);
        setField(term10780, term10780.getClass(), "jsType", null);
        setField(term10780, term10780.getClass(), "parent", null);
        setField(term10779, term10779.getClass(), "next", term10780);
        setIntField(term10785, term10785.getClass(), "type", 0);
        setField(term10785, term10785.getClass(), "next", null);
        setField(term10785, term10785.getClass(), "first", null);
        setField(term10785, term10785.getClass(), "last", null);
        setField(term10785, term10785.getClass(), "propListHead", null);
        setIntField(term10785, term10785.getClass(), "sourcePosition", 0);
        setField(term10785, term10785.getClass(), "jsType", null);
        setField(term10785, term10785.getClass(), "parent", null);
        setField(term10779, term10779.getClass(), "first", term10785);
        setIntField(term10786, term10786.getClass(), "type", 0);
        setField(term10786, term10786.getClass(), "next", null);
        setField(term10786, term10786.getClass(), "first", null);
        setField(term10786, term10786.getClass(), "last", null);
        setField(term10786, term10786.getClass(), "propListHead", null);
        setIntField(term10786, term10786.getClass(), "sourcePosition", 0);
        setField(term10786, term10786.getClass(), "jsType", null);
        setField(term10786, term10786.getClass(), "parent", null);
        setField(term10779, term10779.getClass(), "last", term10786);
        setField(term10787, term10787.getClass(), "next", null);
        setIntField(term10787, term10787.getClass(), "type", 0);
        setIntField(term10787, term10787.getClass(), "intValue", 0);
        setField(term10787, term10787.getClass(), "objectValue", null);
        setField(term10779, term10779.getClass(), "propListHead", term10787);
        setIntField(term10779, term10779.getClass(), "sourcePosition", 754055848);
        setField(term10779, term10779.getClass(), "jsType", null);
        setField(term10779, term10779.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1076;
        Object retValue = callMethod(klass, "isNullOrUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term1076, term10779));
        assertTrue(recursiveEquals(retValue, false));
    }

};


