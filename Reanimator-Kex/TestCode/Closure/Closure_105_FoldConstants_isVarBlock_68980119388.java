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

public class FoldConstants_isVarBlock_68980119388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5085;
     Object term5086;
     Object term15270;
     Object term15271;

    public FoldConstants_isVarBlock_68980119388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5085 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term5085, term5085.getClass(), "compiler", null);
        term5086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5099 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5109 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5086, term5086.getClass(), "type", 249657454);
        setIntField(term5088, term5088.getClass(), "type", -1600748613);
        setIntField(term5090, term5090.getClass(), "type", 0);
        setField(term5090, term5090.getClass(), "next", null);
        setField(term5090, term5090.getClass(), "first", null);
        setField(term5090, term5090.getClass(), "last", null);
        setField(term5090, term5090.getClass(), "propListHead", null);
        setIntField(term5090, term5090.getClass(), "sourcePosition", 0);
        setField(term5090, term5090.getClass(), "jsType", null);
        setField(term5090, term5090.getClass(), "parent", null);
        setField(term5088, term5088.getClass(), "next", term5090);
        setIntField(term5093, term5093.getClass(), "type", 0);
        setField(term5093, term5093.getClass(), "next", null);
        setField(term5093, term5093.getClass(), "first", null);
        setField(term5093, term5093.getClass(), "last", null);
        setField(term5093, term5093.getClass(), "propListHead", null);
        setIntField(term5093, term5093.getClass(), "sourcePosition", 0);
        setField(term5093, term5093.getClass(), "jsType", null);
        setField(term5093, term5093.getClass(), "parent", null);
        setField(term5088, term5088.getClass(), "first", term5093);
        setIntField(term5096, term5096.getClass(), "type", 0);
        setField(term5096, term5096.getClass(), "next", null);
        setField(term5096, term5096.getClass(), "first", null);
        setField(term5096, term5096.getClass(), "last", null);
        setField(term5096, term5096.getClass(), "propListHead", null);
        setIntField(term5096, term5096.getClass(), "sourcePosition", 0);
        setField(term5096, term5096.getClass(), "jsType", null);
        setField(term5096, term5096.getClass(), "parent", null);
        setField(term5088, term5088.getClass(), "last", term5096);
        setField(term5099, term5099.getClass(), "next", null);
        setIntField(term5099, term5099.getClass(), "type", 0);
        setIntField(term5099, term5099.getClass(), "intValue", 0);
        setField(term5099, term5099.getClass(), "objectValue", null);
        setField(term5088, term5088.getClass(), "propListHead", term5099);
        setIntField(term5088, term5088.getClass(), "sourcePosition", 478422495);
        setField(term5088, term5088.getClass(), "jsType", null);
        setField(term5088, term5088.getClass(), "parent", null);
        setField(term5086, term5086.getClass(), "next", term5088);
        setIntField(term5103, term5103.getClass(), "type", 0);
        setField(term5103, term5103.getClass(), "next", null);
        setField(term5103, term5103.getClass(), "first", null);
        setField(term5103, term5103.getClass(), "last", null);
        setField(term5103, term5103.getClass(), "propListHead", null);
        setIntField(term5103, term5103.getClass(), "sourcePosition", 0);
        setField(term5103, term5103.getClass(), "jsType", null);
        setField(term5103, term5103.getClass(), "parent", null);
        setField(term5086, term5086.getClass(), "first", term5103);
        setIntField(term5106, term5106.getClass(), "type", 0);
        setField(term5106, term5106.getClass(), "next", null);
        setField(term5106, term5106.getClass(), "first", null);
        setField(term5106, term5106.getClass(), "last", null);
        setField(term5106, term5106.getClass(), "propListHead", null);
        setIntField(term5106, term5106.getClass(), "sourcePosition", 0);
        setField(term5106, term5106.getClass(), "jsType", null);
        setField(term5106, term5106.getClass(), "parent", null);
        setField(term5086, term5086.getClass(), "last", term5106);
        setField(term5109, term5109.getClass(), "next", null);
        setIntField(term5109, term5109.getClass(), "type", 0);
        setIntField(term5109, term5109.getClass(), "intValue", 0);
        setField(term5109, term5109.getClass(), "objectValue", null);
        setField(term5086, term5086.getClass(), "propListHead", term5109);
        setIntField(term5086, term5086.getClass(), "sourcePosition", 1727771237);
        setField(term5086, term5086.getClass(), "jsType", null);
        setField(term5086, term5086.getClass(), "parent", null);
        term15270 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term15270, term15270.getClass(), "compiler", null);
        term15271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15276 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15279 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15271, term15271.getClass(), "type", 249657454);
        setIntField(term15272, term15272.getClass(), "type", -1600748613);
        setIntField(term15273, term15273.getClass(), "type", 0);
        setField(term15273, term15273.getClass(), "next", null);
        setField(term15273, term15273.getClass(), "first", null);
        setField(term15273, term15273.getClass(), "last", null);
        setField(term15273, term15273.getClass(), "propListHead", null);
        setIntField(term15273, term15273.getClass(), "sourcePosition", 0);
        setField(term15273, term15273.getClass(), "jsType", null);
        setField(term15273, term15273.getClass(), "parent", null);
        setField(term15272, term15272.getClass(), "next", term15273);
        setIntField(term15274, term15274.getClass(), "type", 0);
        setField(term15274, term15274.getClass(), "next", null);
        setField(term15274, term15274.getClass(), "first", null);
        setField(term15274, term15274.getClass(), "last", null);
        setField(term15274, term15274.getClass(), "propListHead", null);
        setIntField(term15274, term15274.getClass(), "sourcePosition", 0);
        setField(term15274, term15274.getClass(), "jsType", null);
        setField(term15274, term15274.getClass(), "parent", null);
        setField(term15272, term15272.getClass(), "first", term15274);
        setIntField(term15275, term15275.getClass(), "type", 0);
        setField(term15275, term15275.getClass(), "next", null);
        setField(term15275, term15275.getClass(), "first", null);
        setField(term15275, term15275.getClass(), "last", null);
        setField(term15275, term15275.getClass(), "propListHead", null);
        setIntField(term15275, term15275.getClass(), "sourcePosition", 0);
        setField(term15275, term15275.getClass(), "jsType", null);
        setField(term15275, term15275.getClass(), "parent", null);
        setField(term15272, term15272.getClass(), "last", term15275);
        setField(term15276, term15276.getClass(), "next", null);
        setIntField(term15276, term15276.getClass(), "type", 0);
        setIntField(term15276, term15276.getClass(), "intValue", 0);
        setField(term15276, term15276.getClass(), "objectValue", null);
        setField(term15272, term15272.getClass(), "propListHead", term15276);
        setIntField(term15272, term15272.getClass(), "sourcePosition", 478422495);
        setField(term15272, term15272.getClass(), "jsType", null);
        setField(term15272, term15272.getClass(), "parent", null);
        setField(term15271, term15271.getClass(), "next", term15272);
        setIntField(term15277, term15277.getClass(), "type", 0);
        setField(term15277, term15277.getClass(), "next", null);
        setField(term15277, term15277.getClass(), "first", null);
        setField(term15277, term15277.getClass(), "last", null);
        setField(term15277, term15277.getClass(), "propListHead", null);
        setIntField(term15277, term15277.getClass(), "sourcePosition", 0);
        setField(term15277, term15277.getClass(), "jsType", null);
        setField(term15277, term15277.getClass(), "parent", null);
        setField(term15271, term15271.getClass(), "first", term15277);
        setIntField(term15278, term15278.getClass(), "type", 0);
        setField(term15278, term15278.getClass(), "next", null);
        setField(term15278, term15278.getClass(), "first", null);
        setField(term15278, term15278.getClass(), "last", null);
        setField(term15278, term15278.getClass(), "propListHead", null);
        setIntField(term15278, term15278.getClass(), "sourcePosition", 0);
        setField(term15278, term15278.getClass(), "jsType", null);
        setField(term15278, term15278.getClass(), "parent", null);
        setField(term15271, term15271.getClass(), "last", term15278);
        setField(term15279, term15279.getClass(), "next", null);
        setIntField(term15279, term15279.getClass(), "type", 0);
        setIntField(term15279, term15279.getClass(), "intValue", 0);
        setField(term15279, term15279.getClass(), "objectValue", null);
        setField(term15271, term15271.getClass(), "propListHead", term15279);
        setIntField(term15271, term15271.getClass(), "sourcePosition", 1727771237);
        setField(term15271, term15271.getClass(), "jsType", null);
        setField(term15271, term15271.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5086;
        callMethod(klass, "isVarBlock", argTypes, term5085, args);
        assertTrue(recursiveEquals(term5085, term15270));
        assertTrue(recursiveEquals(term5086, term15271));
    }

};


