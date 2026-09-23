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

public class NodeUtil_isConstantName_1511961570207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3143;
     Object term17409;

    public NodeUtil_isConstantName_1511961570207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3156 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3166 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3143, term3143.getClass(), "type", -1362132929);
        setIntField(term3145, term3145.getClass(), "type", 852281447);
        setIntField(term3147, term3147.getClass(), "type", 0);
        setField(term3147, term3147.getClass(), "next", null);
        setField(term3147, term3147.getClass(), "first", null);
        setField(term3147, term3147.getClass(), "last", null);
        setField(term3147, term3147.getClass(), "propListHead", null);
        setIntField(term3147, term3147.getClass(), "sourcePosition", 0);
        setField(term3147, term3147.getClass(), "jsType", null);
        setField(term3147, term3147.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "next", term3147);
        setIntField(term3150, term3150.getClass(), "type", 0);
        setField(term3150, term3150.getClass(), "next", null);
        setField(term3150, term3150.getClass(), "first", null);
        setField(term3150, term3150.getClass(), "last", null);
        setField(term3150, term3150.getClass(), "propListHead", null);
        setIntField(term3150, term3150.getClass(), "sourcePosition", 0);
        setField(term3150, term3150.getClass(), "jsType", null);
        setField(term3150, term3150.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "first", term3150);
        setIntField(term3153, term3153.getClass(), "type", 0);
        setField(term3153, term3153.getClass(), "next", null);
        setField(term3153, term3153.getClass(), "first", null);
        setField(term3153, term3153.getClass(), "last", null);
        setField(term3153, term3153.getClass(), "propListHead", null);
        setIntField(term3153, term3153.getClass(), "sourcePosition", 0);
        setField(term3153, term3153.getClass(), "jsType", null);
        setField(term3153, term3153.getClass(), "parent", null);
        setField(term3145, term3145.getClass(), "last", term3153);
        setField(term3156, term3156.getClass(), "next", null);
        setIntField(term3156, term3156.getClass(), "type", 0);
        setIntField(term3156, term3156.getClass(), "intValue", 0);
        setField(term3156, term3156.getClass(), "objectValue", null);
        setField(term3145, term3145.getClass(), "propListHead", term3156);
        setIntField(term3145, term3145.getClass(), "sourcePosition", 241725499);
        setField(term3145, term3145.getClass(), "jsType", null);
        setField(term3145, term3145.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "next", term3145);
        setIntField(term3160, term3160.getClass(), "type", 0);
        setField(term3160, term3160.getClass(), "next", null);
        setField(term3160, term3160.getClass(), "first", null);
        setField(term3160, term3160.getClass(), "last", null);
        setField(term3160, term3160.getClass(), "propListHead", null);
        setIntField(term3160, term3160.getClass(), "sourcePosition", 0);
        setField(term3160, term3160.getClass(), "jsType", null);
        setField(term3160, term3160.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "first", term3160);
        setIntField(term3163, term3163.getClass(), "type", 0);
        setField(term3163, term3163.getClass(), "next", null);
        setField(term3163, term3163.getClass(), "first", null);
        setField(term3163, term3163.getClass(), "last", null);
        setField(term3163, term3163.getClass(), "propListHead", null);
        setIntField(term3163, term3163.getClass(), "sourcePosition", 0);
        setField(term3163, term3163.getClass(), "jsType", null);
        setField(term3163, term3163.getClass(), "parent", null);
        setField(term3143, term3143.getClass(), "last", term3163);
        setField(term3166, term3166.getClass(), "next", null);
        setIntField(term3166, term3166.getClass(), "type", 0);
        setIntField(term3166, term3166.getClass(), "intValue", 0);
        setField(term3166, term3166.getClass(), "objectValue", null);
        setField(term3143, term3143.getClass(), "propListHead", term3166);
        setIntField(term3143, term3143.getClass(), "sourcePosition", 823179298);
        setField(term3143, term3143.getClass(), "jsType", null);
        setField(term3143, term3143.getClass(), "parent", null);
        term17409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term17415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17417 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term17409, term17409.getClass(), "type", -1362132929);
        setIntField(term17410, term17410.getClass(), "type", 852281447);
        setIntField(term17411, term17411.getClass(), "type", 0);
        setField(term17411, term17411.getClass(), "next", null);
        setField(term17411, term17411.getClass(), "first", null);
        setField(term17411, term17411.getClass(), "last", null);
        setField(term17411, term17411.getClass(), "propListHead", null);
        setIntField(term17411, term17411.getClass(), "sourcePosition", 0);
        setField(term17411, term17411.getClass(), "jsType", null);
        setField(term17411, term17411.getClass(), "parent", null);
        setField(term17410, term17410.getClass(), "next", term17411);
        setIntField(term17412, term17412.getClass(), "type", 0);
        setField(term17412, term17412.getClass(), "next", null);
        setField(term17412, term17412.getClass(), "first", null);
        setField(term17412, term17412.getClass(), "last", null);
        setField(term17412, term17412.getClass(), "propListHead", null);
        setIntField(term17412, term17412.getClass(), "sourcePosition", 0);
        setField(term17412, term17412.getClass(), "jsType", null);
        setField(term17412, term17412.getClass(), "parent", null);
        setField(term17410, term17410.getClass(), "first", term17412);
        setIntField(term17413, term17413.getClass(), "type", 0);
        setField(term17413, term17413.getClass(), "next", null);
        setField(term17413, term17413.getClass(), "first", null);
        setField(term17413, term17413.getClass(), "last", null);
        setField(term17413, term17413.getClass(), "propListHead", null);
        setIntField(term17413, term17413.getClass(), "sourcePosition", 0);
        setField(term17413, term17413.getClass(), "jsType", null);
        setField(term17413, term17413.getClass(), "parent", null);
        setField(term17410, term17410.getClass(), "last", term17413);
        setField(term17414, term17414.getClass(), "next", null);
        setIntField(term17414, term17414.getClass(), "type", 0);
        setIntField(term17414, term17414.getClass(), "intValue", 0);
        setField(term17414, term17414.getClass(), "objectValue", null);
        setField(term17410, term17410.getClass(), "propListHead", term17414);
        setIntField(term17410, term17410.getClass(), "sourcePosition", 241725499);
        setField(term17410, term17410.getClass(), "jsType", null);
        setField(term17410, term17410.getClass(), "parent", null);
        setField(term17409, term17409.getClass(), "next", term17410);
        setIntField(term17415, term17415.getClass(), "type", 0);
        setField(term17415, term17415.getClass(), "next", null);
        setField(term17415, term17415.getClass(), "first", null);
        setField(term17415, term17415.getClass(), "last", null);
        setField(term17415, term17415.getClass(), "propListHead", null);
        setIntField(term17415, term17415.getClass(), "sourcePosition", 0);
        setField(term17415, term17415.getClass(), "jsType", null);
        setField(term17415, term17415.getClass(), "parent", null);
        setField(term17409, term17409.getClass(), "first", term17415);
        setIntField(term17416, term17416.getClass(), "type", 0);
        setField(term17416, term17416.getClass(), "next", null);
        setField(term17416, term17416.getClass(), "first", null);
        setField(term17416, term17416.getClass(), "last", null);
        setField(term17416, term17416.getClass(), "propListHead", null);
        setIntField(term17416, term17416.getClass(), "sourcePosition", 0);
        setField(term17416, term17416.getClass(), "jsType", null);
        setField(term17416, term17416.getClass(), "parent", null);
        setField(term17409, term17409.getClass(), "last", term17416);
        setField(term17417, term17417.getClass(), "next", null);
        setIntField(term17417, term17417.getClass(), "type", 0);
        setIntField(term17417, term17417.getClass(), "intValue", 0);
        setField(term17417, term17417.getClass(), "objectValue", null);
        setField(term17409, term17409.getClass(), "propListHead", term17417);
        setIntField(term17409, term17409.getClass(), "sourcePosition", 823179298);
        setField(term17409, term17409.getClass(), "jsType", null);
        setField(term17409, term17409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3143;
        callMethod(klass, "isConstantName", argTypes, null, args);
        assertTrue(recursiveEquals(term3143, term17409));
    }

};


