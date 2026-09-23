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

public class NodeUtil_isExprAssign_892465175161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;
     Object term9143;

    public NodeUtil_isExprAssign_892465175161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1109 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1086, term1086.getClass(), "type", -1840305774);
        setIntField(term1088, term1088.getClass(), "type", 4900410);
        setIntField(term1090, term1090.getClass(), "type", 0);
        setField(term1090, term1090.getClass(), "next", null);
        setField(term1090, term1090.getClass(), "first", null);
        setField(term1090, term1090.getClass(), "last", null);
        setField(term1090, term1090.getClass(), "propListHead", null);
        setIntField(term1090, term1090.getClass(), "sourcePosition", 0);
        setField(term1090, term1090.getClass(), "jsType", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "next", term1090);
        setIntField(term1093, term1093.getClass(), "type", 0);
        setField(term1093, term1093.getClass(), "next", null);
        setField(term1093, term1093.getClass(), "first", null);
        setField(term1093, term1093.getClass(), "last", null);
        setField(term1093, term1093.getClass(), "propListHead", null);
        setIntField(term1093, term1093.getClass(), "sourcePosition", 0);
        setField(term1093, term1093.getClass(), "jsType", null);
        setField(term1093, term1093.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "first", term1093);
        setIntField(term1096, term1096.getClass(), "type", 0);
        setField(term1096, term1096.getClass(), "next", null);
        setField(term1096, term1096.getClass(), "first", null);
        setField(term1096, term1096.getClass(), "last", null);
        setField(term1096, term1096.getClass(), "propListHead", null);
        setIntField(term1096, term1096.getClass(), "sourcePosition", 0);
        setField(term1096, term1096.getClass(), "jsType", null);
        setField(term1096, term1096.getClass(), "parent", null);
        setField(term1088, term1088.getClass(), "last", term1096);
        setField(term1099, term1099.getClass(), "next", null);
        setIntField(term1099, term1099.getClass(), "type", 0);
        setIntField(term1099, term1099.getClass(), "intValue", 0);
        setField(term1099, term1099.getClass(), "objectValue", null);
        setField(term1088, term1088.getClass(), "propListHead", term1099);
        setIntField(term1088, term1088.getClass(), "sourcePosition", 812570053);
        setField(term1088, term1088.getClass(), "jsType", null);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "next", term1088);
        setIntField(term1103, term1103.getClass(), "type", 0);
        setField(term1103, term1103.getClass(), "next", null);
        setField(term1103, term1103.getClass(), "first", null);
        setField(term1103, term1103.getClass(), "last", null);
        setField(term1103, term1103.getClass(), "propListHead", null);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 0);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "first", term1103);
        setIntField(term1106, term1106.getClass(), "type", 0);
        setField(term1106, term1106.getClass(), "next", null);
        setField(term1106, term1106.getClass(), "first", null);
        setField(term1106, term1106.getClass(), "last", null);
        setField(term1106, term1106.getClass(), "propListHead", null);
        setIntField(term1106, term1106.getClass(), "sourcePosition", 0);
        setField(term1106, term1106.getClass(), "jsType", null);
        setField(term1106, term1106.getClass(), "parent", null);
        setField(term1086, term1086.getClass(), "last", term1106);
        setField(term1109, term1109.getClass(), "next", null);
        setIntField(term1109, term1109.getClass(), "type", 0);
        setIntField(term1109, term1109.getClass(), "intValue", 0);
        setField(term1109, term1109.getClass(), "objectValue", null);
        setField(term1086, term1086.getClass(), "propListHead", term1109);
        setIntField(term1086, term1086.getClass(), "sourcePosition", -1488938905);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        term9143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9148 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9151 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9143, term9143.getClass(), "type", -1840305774);
        setIntField(term9144, term9144.getClass(), "type", 4900410);
        setIntField(term9145, term9145.getClass(), "type", 0);
        setField(term9145, term9145.getClass(), "next", null);
        setField(term9145, term9145.getClass(), "first", null);
        setField(term9145, term9145.getClass(), "last", null);
        setField(term9145, term9145.getClass(), "propListHead", null);
        setIntField(term9145, term9145.getClass(), "sourcePosition", 0);
        setField(term9145, term9145.getClass(), "jsType", null);
        setField(term9145, term9145.getClass(), "parent", null);
        setField(term9144, term9144.getClass(), "next", term9145);
        setIntField(term9146, term9146.getClass(), "type", 0);
        setField(term9146, term9146.getClass(), "next", null);
        setField(term9146, term9146.getClass(), "first", null);
        setField(term9146, term9146.getClass(), "last", null);
        setField(term9146, term9146.getClass(), "propListHead", null);
        setIntField(term9146, term9146.getClass(), "sourcePosition", 0);
        setField(term9146, term9146.getClass(), "jsType", null);
        setField(term9146, term9146.getClass(), "parent", null);
        setField(term9144, term9144.getClass(), "first", term9146);
        setIntField(term9147, term9147.getClass(), "type", 0);
        setField(term9147, term9147.getClass(), "next", null);
        setField(term9147, term9147.getClass(), "first", null);
        setField(term9147, term9147.getClass(), "last", null);
        setField(term9147, term9147.getClass(), "propListHead", null);
        setIntField(term9147, term9147.getClass(), "sourcePosition", 0);
        setField(term9147, term9147.getClass(), "jsType", null);
        setField(term9147, term9147.getClass(), "parent", null);
        setField(term9144, term9144.getClass(), "last", term9147);
        setField(term9148, term9148.getClass(), "next", null);
        setIntField(term9148, term9148.getClass(), "type", 0);
        setIntField(term9148, term9148.getClass(), "intValue", 0);
        setField(term9148, term9148.getClass(), "objectValue", null);
        setField(term9144, term9144.getClass(), "propListHead", term9148);
        setIntField(term9144, term9144.getClass(), "sourcePosition", 812570053);
        setField(term9144, term9144.getClass(), "jsType", null);
        setField(term9144, term9144.getClass(), "parent", null);
        setField(term9143, term9143.getClass(), "next", term9144);
        setIntField(term9149, term9149.getClass(), "type", 0);
        setField(term9149, term9149.getClass(), "next", null);
        setField(term9149, term9149.getClass(), "first", null);
        setField(term9149, term9149.getClass(), "last", null);
        setField(term9149, term9149.getClass(), "propListHead", null);
        setIntField(term9149, term9149.getClass(), "sourcePosition", 0);
        setField(term9149, term9149.getClass(), "jsType", null);
        setField(term9149, term9149.getClass(), "parent", null);
        setField(term9143, term9143.getClass(), "first", term9149);
        setIntField(term9150, term9150.getClass(), "type", 0);
        setField(term9150, term9150.getClass(), "next", null);
        setField(term9150, term9150.getClass(), "first", null);
        setField(term9150, term9150.getClass(), "last", null);
        setField(term9150, term9150.getClass(), "propListHead", null);
        setIntField(term9150, term9150.getClass(), "sourcePosition", 0);
        setField(term9150, term9150.getClass(), "jsType", null);
        setField(term9150, term9150.getClass(), "parent", null);
        setField(term9143, term9143.getClass(), "last", term9150);
        setField(term9151, term9151.getClass(), "next", null);
        setIntField(term9151, term9151.getClass(), "type", 0);
        setIntField(term9151, term9151.getClass(), "intValue", 0);
        setField(term9151, term9151.getClass(), "objectValue", null);
        setField(term9143, term9143.getClass(), "propListHead", term9151);
        setIntField(term9143, term9143.getClass(), "sourcePosition", -1488938905);
        setField(term9143, term9143.getClass(), "jsType", null);
        setField(term9143, term9143.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1086;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1086, term9143));
        assertTrue(recursiveEquals(retValue, false));
    }

};


