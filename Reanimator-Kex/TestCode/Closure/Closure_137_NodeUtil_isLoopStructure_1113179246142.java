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

public class NodeUtil_isLoopStructure_1113179246142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term976;
     Object term7147;

    public NodeUtil_isLoopStructure_1113179246142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term989 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term976, term976.getClass(), "type", 765731371);
        setIntField(term978, term978.getClass(), "type", -1941343035);
        setIntField(term980, term980.getClass(), "type", 0);
        setField(term980, term980.getClass(), "next", null);
        setField(term980, term980.getClass(), "first", null);
        setField(term980, term980.getClass(), "last", null);
        setField(term980, term980.getClass(), "propListHead", null);
        setIntField(term980, term980.getClass(), "sourcePosition", 0);
        setField(term980, term980.getClass(), "jsType", null);
        setField(term980, term980.getClass(), "parent", null);
        setField(term978, term978.getClass(), "next", term980);
        setIntField(term983, term983.getClass(), "type", 0);
        setField(term983, term983.getClass(), "next", null);
        setField(term983, term983.getClass(), "first", null);
        setField(term983, term983.getClass(), "last", null);
        setField(term983, term983.getClass(), "propListHead", null);
        setIntField(term983, term983.getClass(), "sourcePosition", 0);
        setField(term983, term983.getClass(), "jsType", null);
        setField(term983, term983.getClass(), "parent", null);
        setField(term978, term978.getClass(), "first", term983);
        setIntField(term986, term986.getClass(), "type", 0);
        setField(term986, term986.getClass(), "next", null);
        setField(term986, term986.getClass(), "first", null);
        setField(term986, term986.getClass(), "last", null);
        setField(term986, term986.getClass(), "propListHead", null);
        setIntField(term986, term986.getClass(), "sourcePosition", 0);
        setField(term986, term986.getClass(), "jsType", null);
        setField(term986, term986.getClass(), "parent", null);
        setField(term978, term978.getClass(), "last", term986);
        setField(term989, term989.getClass(), "next", null);
        setIntField(term989, term989.getClass(), "type", 0);
        setIntField(term989, term989.getClass(), "intValue", 0);
        setField(term989, term989.getClass(), "objectValue", null);
        setField(term978, term978.getClass(), "propListHead", term989);
        setIntField(term978, term978.getClass(), "sourcePosition", -1748391876);
        setField(term978, term978.getClass(), "jsType", null);
        setField(term978, term978.getClass(), "parent", null);
        setField(term976, term976.getClass(), "next", term978);
        setIntField(term993, term993.getClass(), "type", 0);
        setField(term993, term993.getClass(), "next", null);
        setField(term993, term993.getClass(), "first", null);
        setField(term993, term993.getClass(), "last", null);
        setField(term993, term993.getClass(), "propListHead", null);
        setIntField(term993, term993.getClass(), "sourcePosition", 0);
        setField(term993, term993.getClass(), "jsType", null);
        setField(term993, term993.getClass(), "parent", null);
        setField(term976, term976.getClass(), "first", term993);
        setIntField(term996, term996.getClass(), "type", 0);
        setField(term996, term996.getClass(), "next", null);
        setField(term996, term996.getClass(), "first", null);
        setField(term996, term996.getClass(), "last", null);
        setField(term996, term996.getClass(), "propListHead", null);
        setIntField(term996, term996.getClass(), "sourcePosition", 0);
        setField(term996, term996.getClass(), "jsType", null);
        setField(term996, term996.getClass(), "parent", null);
        setField(term976, term976.getClass(), "last", term996);
        setField(term999, term999.getClass(), "next", null);
        setIntField(term999, term999.getClass(), "type", 0);
        setIntField(term999, term999.getClass(), "intValue", 0);
        setField(term999, term999.getClass(), "objectValue", null);
        setField(term976, term976.getClass(), "propListHead", term999);
        setIntField(term976, term976.getClass(), "sourcePosition", 43258317);
        setField(term976, term976.getClass(), "jsType", null);
        setField(term976, term976.getClass(), "parent", null);
        term7147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7152 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7155 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7147, term7147.getClass(), "type", 765731371);
        setIntField(term7148, term7148.getClass(), "type", -1941343035);
        setIntField(term7149, term7149.getClass(), "type", 0);
        setField(term7149, term7149.getClass(), "next", null);
        setField(term7149, term7149.getClass(), "first", null);
        setField(term7149, term7149.getClass(), "last", null);
        setField(term7149, term7149.getClass(), "propListHead", null);
        setIntField(term7149, term7149.getClass(), "sourcePosition", 0);
        setField(term7149, term7149.getClass(), "jsType", null);
        setField(term7149, term7149.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "next", term7149);
        setIntField(term7150, term7150.getClass(), "type", 0);
        setField(term7150, term7150.getClass(), "next", null);
        setField(term7150, term7150.getClass(), "first", null);
        setField(term7150, term7150.getClass(), "last", null);
        setField(term7150, term7150.getClass(), "propListHead", null);
        setIntField(term7150, term7150.getClass(), "sourcePosition", 0);
        setField(term7150, term7150.getClass(), "jsType", null);
        setField(term7150, term7150.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "first", term7150);
        setIntField(term7151, term7151.getClass(), "type", 0);
        setField(term7151, term7151.getClass(), "next", null);
        setField(term7151, term7151.getClass(), "first", null);
        setField(term7151, term7151.getClass(), "last", null);
        setField(term7151, term7151.getClass(), "propListHead", null);
        setIntField(term7151, term7151.getClass(), "sourcePosition", 0);
        setField(term7151, term7151.getClass(), "jsType", null);
        setField(term7151, term7151.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "last", term7151);
        setField(term7152, term7152.getClass(), "next", null);
        setIntField(term7152, term7152.getClass(), "type", 0);
        setIntField(term7152, term7152.getClass(), "intValue", 0);
        setField(term7152, term7152.getClass(), "objectValue", null);
        setField(term7148, term7148.getClass(), "propListHead", term7152);
        setIntField(term7148, term7148.getClass(), "sourcePosition", -1748391876);
        setField(term7148, term7148.getClass(), "jsType", null);
        setField(term7148, term7148.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "next", term7148);
        setIntField(term7153, term7153.getClass(), "type", 0);
        setField(term7153, term7153.getClass(), "next", null);
        setField(term7153, term7153.getClass(), "first", null);
        setField(term7153, term7153.getClass(), "last", null);
        setField(term7153, term7153.getClass(), "propListHead", null);
        setIntField(term7153, term7153.getClass(), "sourcePosition", 0);
        setField(term7153, term7153.getClass(), "jsType", null);
        setField(term7153, term7153.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "first", term7153);
        setIntField(term7154, term7154.getClass(), "type", 0);
        setField(term7154, term7154.getClass(), "next", null);
        setField(term7154, term7154.getClass(), "first", null);
        setField(term7154, term7154.getClass(), "last", null);
        setField(term7154, term7154.getClass(), "propListHead", null);
        setIntField(term7154, term7154.getClass(), "sourcePosition", 0);
        setField(term7154, term7154.getClass(), "jsType", null);
        setField(term7154, term7154.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "last", term7154);
        setField(term7155, term7155.getClass(), "next", null);
        setIntField(term7155, term7155.getClass(), "type", 0);
        setIntField(term7155, term7155.getClass(), "intValue", 0);
        setField(term7155, term7155.getClass(), "objectValue", null);
        setField(term7147, term7147.getClass(), "propListHead", term7155);
        setIntField(term7147, term7147.getClass(), "sourcePosition", 43258317);
        setField(term7147, term7147.getClass(), "jsType", null);
        setField(term7147, term7147.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term976;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term976, term7147));
        assertTrue(recursiveEquals(retValue, false));
    }

};


