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

public class NodeUtil_isStatementBlock_284490161147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138;
     Object term7783;

    public NodeUtil_isStatementBlock_284490161147() {
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
        term7783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7788 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7791 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7783, term7783.getClass(), "type", 723812297);
        setIntField(term7784, term7784.getClass(), "type", 433248783);
        setIntField(term7785, term7785.getClass(), "type", 0);
        setField(term7785, term7785.getClass(), "next", null);
        setField(term7785, term7785.getClass(), "first", null);
        setField(term7785, term7785.getClass(), "last", null);
        setField(term7785, term7785.getClass(), "propListHead", null);
        setIntField(term7785, term7785.getClass(), "sourcePosition", 0);
        setField(term7785, term7785.getClass(), "jsType", null);
        setField(term7785, term7785.getClass(), "parent", null);
        setField(term7784, term7784.getClass(), "next", term7785);
        setIntField(term7786, term7786.getClass(), "type", 0);
        setField(term7786, term7786.getClass(), "next", null);
        setField(term7786, term7786.getClass(), "first", null);
        setField(term7786, term7786.getClass(), "last", null);
        setField(term7786, term7786.getClass(), "propListHead", null);
        setIntField(term7786, term7786.getClass(), "sourcePosition", 0);
        setField(term7786, term7786.getClass(), "jsType", null);
        setField(term7786, term7786.getClass(), "parent", null);
        setField(term7784, term7784.getClass(), "first", term7786);
        setIntField(term7787, term7787.getClass(), "type", 0);
        setField(term7787, term7787.getClass(), "next", null);
        setField(term7787, term7787.getClass(), "first", null);
        setField(term7787, term7787.getClass(), "last", null);
        setField(term7787, term7787.getClass(), "propListHead", null);
        setIntField(term7787, term7787.getClass(), "sourcePosition", 0);
        setField(term7787, term7787.getClass(), "jsType", null);
        setField(term7787, term7787.getClass(), "parent", null);
        setField(term7784, term7784.getClass(), "last", term7787);
        setField(term7788, term7788.getClass(), "next", null);
        setIntField(term7788, term7788.getClass(), "type", 0);
        setIntField(term7788, term7788.getClass(), "intValue", 0);
        setField(term7788, term7788.getClass(), "objectValue", null);
        setField(term7784, term7784.getClass(), "propListHead", term7788);
        setIntField(term7784, term7784.getClass(), "sourcePosition", 897010381);
        setField(term7784, term7784.getClass(), "jsType", null);
        setField(term7784, term7784.getClass(), "parent", null);
        setField(term7783, term7783.getClass(), "next", term7784);
        setIntField(term7789, term7789.getClass(), "type", 0);
        setField(term7789, term7789.getClass(), "next", null);
        setField(term7789, term7789.getClass(), "first", null);
        setField(term7789, term7789.getClass(), "last", null);
        setField(term7789, term7789.getClass(), "propListHead", null);
        setIntField(term7789, term7789.getClass(), "sourcePosition", 0);
        setField(term7789, term7789.getClass(), "jsType", null);
        setField(term7789, term7789.getClass(), "parent", null);
        setField(term7783, term7783.getClass(), "first", term7789);
        setIntField(term7790, term7790.getClass(), "type", 0);
        setField(term7790, term7790.getClass(), "next", null);
        setField(term7790, term7790.getClass(), "first", null);
        setField(term7790, term7790.getClass(), "last", null);
        setField(term7790, term7790.getClass(), "propListHead", null);
        setIntField(term7790, term7790.getClass(), "sourcePosition", 0);
        setField(term7790, term7790.getClass(), "jsType", null);
        setField(term7790, term7790.getClass(), "parent", null);
        setField(term7783, term7783.getClass(), "last", term7790);
        setField(term7791, term7791.getClass(), "next", null);
        setIntField(term7791, term7791.getClass(), "type", 0);
        setIntField(term7791, term7791.getClass(), "intValue", 0);
        setField(term7791, term7791.getClass(), "objectValue", null);
        setField(term7783, term7783.getClass(), "propListHead", term7791);
        setIntField(term7783, term7783.getClass(), "sourcePosition", -15712667);
        setField(term7783, term7783.getClass(), "jsType", null);
        setField(term7783, term7783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1138;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1138, term7783));
        assertTrue(recursiveEquals(retValue, false));
    }

};


