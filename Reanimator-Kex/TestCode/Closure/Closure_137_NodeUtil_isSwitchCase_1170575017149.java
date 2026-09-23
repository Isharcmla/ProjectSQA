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

public class NodeUtil_isSwitchCase_1170575017149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term8113;

    public NodeUtil_isSwitchCase_1170575017149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1205 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1215 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1192, term1192.getClass(), "type", -20614472);
        setIntField(term1194, term1194.getClass(), "type", 1207142014);
        setIntField(term1196, term1196.getClass(), "type", 0);
        setField(term1196, term1196.getClass(), "next", null);
        setField(term1196, term1196.getClass(), "first", null);
        setField(term1196, term1196.getClass(), "last", null);
        setField(term1196, term1196.getClass(), "propListHead", null);
        setIntField(term1196, term1196.getClass(), "sourcePosition", 0);
        setField(term1196, term1196.getClass(), "jsType", null);
        setField(term1196, term1196.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "next", term1196);
        setIntField(term1199, term1199.getClass(), "type", 0);
        setField(term1199, term1199.getClass(), "next", null);
        setField(term1199, term1199.getClass(), "first", null);
        setField(term1199, term1199.getClass(), "last", null);
        setField(term1199, term1199.getClass(), "propListHead", null);
        setIntField(term1199, term1199.getClass(), "sourcePosition", 0);
        setField(term1199, term1199.getClass(), "jsType", null);
        setField(term1199, term1199.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "first", term1199);
        setIntField(term1202, term1202.getClass(), "type", 0);
        setField(term1202, term1202.getClass(), "next", null);
        setField(term1202, term1202.getClass(), "first", null);
        setField(term1202, term1202.getClass(), "last", null);
        setField(term1202, term1202.getClass(), "propListHead", null);
        setIntField(term1202, term1202.getClass(), "sourcePosition", 0);
        setField(term1202, term1202.getClass(), "jsType", null);
        setField(term1202, term1202.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "last", term1202);
        setField(term1205, term1205.getClass(), "next", null);
        setIntField(term1205, term1205.getClass(), "type", 0);
        setIntField(term1205, term1205.getClass(), "intValue", 0);
        setField(term1205, term1205.getClass(), "objectValue", null);
        setField(term1194, term1194.getClass(), "propListHead", term1205);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 330043745);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1209, term1209.getClass(), "type", 0);
        setField(term1209, term1209.getClass(), "next", null);
        setField(term1209, term1209.getClass(), "first", null);
        setField(term1209, term1209.getClass(), "last", null);
        setField(term1209, term1209.getClass(), "propListHead", null);
        setIntField(term1209, term1209.getClass(), "sourcePosition", 0);
        setField(term1209, term1209.getClass(), "jsType", null);
        setField(term1209, term1209.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1209);
        setIntField(term1212, term1212.getClass(), "type", 0);
        setField(term1212, term1212.getClass(), "next", null);
        setField(term1212, term1212.getClass(), "first", null);
        setField(term1212, term1212.getClass(), "last", null);
        setField(term1212, term1212.getClass(), "propListHead", null);
        setIntField(term1212, term1212.getClass(), "sourcePosition", 0);
        setField(term1212, term1212.getClass(), "jsType", null);
        setField(term1212, term1212.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "last", term1212);
        setField(term1215, term1215.getClass(), "next", null);
        setIntField(term1215, term1215.getClass(), "type", 0);
        setIntField(term1215, term1215.getClass(), "intValue", 0);
        setField(term1215, term1215.getClass(), "objectValue", null);
        setField(term1192, term1192.getClass(), "propListHead", term1215);
        setIntField(term1192, term1192.getClass(), "sourcePosition", -509349195);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        term8113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8118 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8121 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8113, term8113.getClass(), "type", -20614472);
        setIntField(term8114, term8114.getClass(), "type", 1207142014);
        setIntField(term8115, term8115.getClass(), "type", 0);
        setField(term8115, term8115.getClass(), "next", null);
        setField(term8115, term8115.getClass(), "first", null);
        setField(term8115, term8115.getClass(), "last", null);
        setField(term8115, term8115.getClass(), "propListHead", null);
        setIntField(term8115, term8115.getClass(), "sourcePosition", 0);
        setField(term8115, term8115.getClass(), "jsType", null);
        setField(term8115, term8115.getClass(), "parent", null);
        setField(term8114, term8114.getClass(), "next", term8115);
        setIntField(term8116, term8116.getClass(), "type", 0);
        setField(term8116, term8116.getClass(), "next", null);
        setField(term8116, term8116.getClass(), "first", null);
        setField(term8116, term8116.getClass(), "last", null);
        setField(term8116, term8116.getClass(), "propListHead", null);
        setIntField(term8116, term8116.getClass(), "sourcePosition", 0);
        setField(term8116, term8116.getClass(), "jsType", null);
        setField(term8116, term8116.getClass(), "parent", null);
        setField(term8114, term8114.getClass(), "first", term8116);
        setIntField(term8117, term8117.getClass(), "type", 0);
        setField(term8117, term8117.getClass(), "next", null);
        setField(term8117, term8117.getClass(), "first", null);
        setField(term8117, term8117.getClass(), "last", null);
        setField(term8117, term8117.getClass(), "propListHead", null);
        setIntField(term8117, term8117.getClass(), "sourcePosition", 0);
        setField(term8117, term8117.getClass(), "jsType", null);
        setField(term8117, term8117.getClass(), "parent", null);
        setField(term8114, term8114.getClass(), "last", term8117);
        setField(term8118, term8118.getClass(), "next", null);
        setIntField(term8118, term8118.getClass(), "type", 0);
        setIntField(term8118, term8118.getClass(), "intValue", 0);
        setField(term8118, term8118.getClass(), "objectValue", null);
        setField(term8114, term8114.getClass(), "propListHead", term8118);
        setIntField(term8114, term8114.getClass(), "sourcePosition", 330043745);
        setField(term8114, term8114.getClass(), "jsType", null);
        setField(term8114, term8114.getClass(), "parent", null);
        setField(term8113, term8113.getClass(), "next", term8114);
        setIntField(term8119, term8119.getClass(), "type", 0);
        setField(term8119, term8119.getClass(), "next", null);
        setField(term8119, term8119.getClass(), "first", null);
        setField(term8119, term8119.getClass(), "last", null);
        setField(term8119, term8119.getClass(), "propListHead", null);
        setIntField(term8119, term8119.getClass(), "sourcePosition", 0);
        setField(term8119, term8119.getClass(), "jsType", null);
        setField(term8119, term8119.getClass(), "parent", null);
        setField(term8113, term8113.getClass(), "first", term8119);
        setIntField(term8120, term8120.getClass(), "type", 0);
        setField(term8120, term8120.getClass(), "next", null);
        setField(term8120, term8120.getClass(), "first", null);
        setField(term8120, term8120.getClass(), "last", null);
        setField(term8120, term8120.getClass(), "propListHead", null);
        setIntField(term8120, term8120.getClass(), "sourcePosition", 0);
        setField(term8120, term8120.getClass(), "jsType", null);
        setField(term8120, term8120.getClass(), "parent", null);
        setField(term8113, term8113.getClass(), "last", term8120);
        setField(term8121, term8121.getClass(), "next", null);
        setIntField(term8121, term8121.getClass(), "type", 0);
        setIntField(term8121, term8121.getClass(), "intValue", 0);
        setField(term8121, term8121.getClass(), "objectValue", null);
        setField(term8113, term8113.getClass(), "propListHead", term8121);
        setIntField(term8113, term8113.getClass(), "sourcePosition", -509349195);
        setField(term8113, term8113.getClass(), "jsType", null);
        setField(term8113, term8113.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1192;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1192, term8113));
        assertTrue(recursiveEquals(retValue, false));
    }

};


