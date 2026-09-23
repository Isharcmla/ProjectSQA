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

public class NodeUtil_isStatementBlock_284490161148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138;
     Object term7810;

    public NodeUtil_isStatementBlock_284490161148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1151 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1161 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1138, term1138.getClass(), "type", 723812297);
        setIntField(term1140, term1140.getClass(), "type", 433248783);
        setIntField(term1142, term1142.getClass(), "type", 0);
        setField(term1142, term1142.getClass(), "next", null);
        setField(term1142, term1142.getClass(), "first", null);
        setField(term1142, term1142.getClass(), "last", null);
        setField(term1142, term1142.getClass(), "propListHead", null);
        setIntField(term1142, term1142.getClass(), "sourcePosition", 0);
        setField(term1142, term1142.getClass(), "jsType", null);
        setField(term1142, term1142.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "next", term1142);
        setIntField(term1145, term1145.getClass(), "type", 0);
        setField(term1145, term1145.getClass(), "next", null);
        setField(term1145, term1145.getClass(), "first", null);
        setField(term1145, term1145.getClass(), "last", null);
        setField(term1145, term1145.getClass(), "propListHead", null);
        setIntField(term1145, term1145.getClass(), "sourcePosition", 0);
        setField(term1145, term1145.getClass(), "jsType", null);
        setField(term1145, term1145.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "first", term1145);
        setIntField(term1148, term1148.getClass(), "type", 0);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", null);
        setField(term1148, term1148.getClass(), "last", null);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "last", term1148);
        setField(term1151, term1151.getClass(), "next", null);
        setIntField(term1151, term1151.getClass(), "type", 0);
        setIntField(term1151, term1151.getClass(), "intValue", 0);
        setField(term1151, term1151.getClass(), "objectValue", null);
        setField(term1140, term1140.getClass(), "propListHead", term1151);
        setIntField(term1140, term1140.getClass(), "sourcePosition", 897010381);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
        setField(term1138, term1138.getClass(), "next", term1140);
        setIntField(term1155, term1155.getClass(), "type", 0);
        setField(term1155, term1155.getClass(), "next", null);
        setField(term1155, term1155.getClass(), "first", null);
        setField(term1155, term1155.getClass(), "last", null);
        setField(term1155, term1155.getClass(), "propListHead", null);
        setIntField(term1155, term1155.getClass(), "sourcePosition", 0);
        setField(term1155, term1155.getClass(), "jsType", null);
        setField(term1155, term1155.getClass(), "parent", null);
        setField(term1138, term1138.getClass(), "first", term1155);
        setIntField(term1158, term1158.getClass(), "type", 0);
        setField(term1158, term1158.getClass(), "next", null);
        setField(term1158, term1158.getClass(), "first", null);
        setField(term1158, term1158.getClass(), "last", null);
        setField(term1158, term1158.getClass(), "propListHead", null);
        setIntField(term1158, term1158.getClass(), "sourcePosition", 0);
        setField(term1158, term1158.getClass(), "jsType", null);
        setField(term1158, term1158.getClass(), "parent", null);
        setField(term1138, term1138.getClass(), "last", term1158);
        setField(term1161, term1161.getClass(), "next", null);
        setIntField(term1161, term1161.getClass(), "type", 0);
        setIntField(term1161, term1161.getClass(), "intValue", 0);
        setField(term1161, term1161.getClass(), "objectValue", null);
        setField(term1138, term1138.getClass(), "propListHead", term1161);
        setIntField(term1138, term1138.getClass(), "sourcePosition", -15712667);
        setField(term1138, term1138.getClass(), "jsType", null);
        setField(term1138, term1138.getClass(), "parent", null);
        term7810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7815 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7818 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7810, term7810.getClass(), "type", 723812297);
        setIntField(term7811, term7811.getClass(), "type", 433248783);
        setIntField(term7812, term7812.getClass(), "type", 0);
        setField(term7812, term7812.getClass(), "next", null);
        setField(term7812, term7812.getClass(), "first", null);
        setField(term7812, term7812.getClass(), "last", null);
        setField(term7812, term7812.getClass(), "propListHead", null);
        setIntField(term7812, term7812.getClass(), "sourcePosition", 0);
        setField(term7812, term7812.getClass(), "jsType", null);
        setField(term7812, term7812.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "next", term7812);
        setIntField(term7813, term7813.getClass(), "type", 0);
        setField(term7813, term7813.getClass(), "next", null);
        setField(term7813, term7813.getClass(), "first", null);
        setField(term7813, term7813.getClass(), "last", null);
        setField(term7813, term7813.getClass(), "propListHead", null);
        setIntField(term7813, term7813.getClass(), "sourcePosition", 0);
        setField(term7813, term7813.getClass(), "jsType", null);
        setField(term7813, term7813.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "first", term7813);
        setIntField(term7814, term7814.getClass(), "type", 0);
        setField(term7814, term7814.getClass(), "next", null);
        setField(term7814, term7814.getClass(), "first", null);
        setField(term7814, term7814.getClass(), "last", null);
        setField(term7814, term7814.getClass(), "propListHead", null);
        setIntField(term7814, term7814.getClass(), "sourcePosition", 0);
        setField(term7814, term7814.getClass(), "jsType", null);
        setField(term7814, term7814.getClass(), "parent", null);
        setField(term7811, term7811.getClass(), "last", term7814);
        setField(term7815, term7815.getClass(), "next", null);
        setIntField(term7815, term7815.getClass(), "type", 0);
        setIntField(term7815, term7815.getClass(), "intValue", 0);
        setField(term7815, term7815.getClass(), "objectValue", null);
        setField(term7811, term7811.getClass(), "propListHead", term7815);
        setIntField(term7811, term7811.getClass(), "sourcePosition", 897010381);
        setField(term7811, term7811.getClass(), "jsType", null);
        setField(term7811, term7811.getClass(), "parent", null);
        setField(term7810, term7810.getClass(), "next", term7811);
        setIntField(term7816, term7816.getClass(), "type", 0);
        setField(term7816, term7816.getClass(), "next", null);
        setField(term7816, term7816.getClass(), "first", null);
        setField(term7816, term7816.getClass(), "last", null);
        setField(term7816, term7816.getClass(), "propListHead", null);
        setIntField(term7816, term7816.getClass(), "sourcePosition", 0);
        setField(term7816, term7816.getClass(), "jsType", null);
        setField(term7816, term7816.getClass(), "parent", null);
        setField(term7810, term7810.getClass(), "first", term7816);
        setIntField(term7817, term7817.getClass(), "type", 0);
        setField(term7817, term7817.getClass(), "next", null);
        setField(term7817, term7817.getClass(), "first", null);
        setField(term7817, term7817.getClass(), "last", null);
        setField(term7817, term7817.getClass(), "propListHead", null);
        setIntField(term7817, term7817.getClass(), "sourcePosition", 0);
        setField(term7817, term7817.getClass(), "jsType", null);
        setField(term7817, term7817.getClass(), "parent", null);
        setField(term7810, term7810.getClass(), "last", term7817);
        setField(term7818, term7818.getClass(), "next", null);
        setIntField(term7818, term7818.getClass(), "type", 0);
        setIntField(term7818, term7818.getClass(), "intValue", 0);
        setField(term7818, term7818.getClass(), "objectValue", null);
        setField(term7810, term7810.getClass(), "propListHead", term7818);
        setIntField(term7810, term7810.getClass(), "sourcePosition", -15712667);
        setField(term7810, term7810.getClass(), "jsType", null);
        setField(term7810, term7810.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1138;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1138, term7810));
        assertTrue(recursiveEquals(retValue, false));
    }

};


