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

public class NodeUtil_isExprCall_1790929530163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;
     Object term9263;

    public NodeUtil_isExprCall_1790929530163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1163 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1140, term1140.getClass(), "type", 723812297);
        setIntField(term1142, term1142.getClass(), "type", 433248783);
        setIntField(term1144, term1144.getClass(), "type", 0);
        setField(term1144, term1144.getClass(), "next", null);
        setField(term1144, term1144.getClass(), "first", null);
        setField(term1144, term1144.getClass(), "last", null);
        setField(term1144, term1144.getClass(), "propListHead", null);
        setIntField(term1144, term1144.getClass(), "sourcePosition", 0);
        setField(term1144, term1144.getClass(), "jsType", null);
        setField(term1144, term1144.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "next", term1144);
        setIntField(term1147, term1147.getClass(), "type", 0);
        setField(term1147, term1147.getClass(), "next", null);
        setField(term1147, term1147.getClass(), "first", null);
        setField(term1147, term1147.getClass(), "last", null);
        setField(term1147, term1147.getClass(), "propListHead", null);
        setIntField(term1147, term1147.getClass(), "sourcePosition", 0);
        setField(term1147, term1147.getClass(), "jsType", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "first", term1147);
        setIntField(term1150, term1150.getClass(), "type", 0);
        setField(term1150, term1150.getClass(), "next", null);
        setField(term1150, term1150.getClass(), "first", null);
        setField(term1150, term1150.getClass(), "last", null);
        setField(term1150, term1150.getClass(), "propListHead", null);
        setIntField(term1150, term1150.getClass(), "sourcePosition", 0);
        setField(term1150, term1150.getClass(), "jsType", null);
        setField(term1150, term1150.getClass(), "parent", null);
        setField(term1142, term1142.getClass(), "last", term1150);
        setField(term1153, term1153.getClass(), "next", null);
        setIntField(term1153, term1153.getClass(), "type", 0);
        setIntField(term1153, term1153.getClass(), "intValue", 0);
        setField(term1153, term1153.getClass(), "objectValue", null);
        setField(term1142, term1142.getClass(), "propListHead", term1153);
        setIntField(term1142, term1142.getClass(), "sourcePosition", 897010381);
        setField(term1142, term1142.getClass(), "jsType", null);
        setField(term1142, term1142.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "next", term1142);
        setIntField(term1157, term1157.getClass(), "type", 0);
        setField(term1157, term1157.getClass(), "next", null);
        setField(term1157, term1157.getClass(), "first", null);
        setField(term1157, term1157.getClass(), "last", null);
        setField(term1157, term1157.getClass(), "propListHead", null);
        setIntField(term1157, term1157.getClass(), "sourcePosition", 0);
        setField(term1157, term1157.getClass(), "jsType", null);
        setField(term1157, term1157.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "first", term1157);
        setIntField(term1160, term1160.getClass(), "type", 0);
        setField(term1160, term1160.getClass(), "next", null);
        setField(term1160, term1160.getClass(), "first", null);
        setField(term1160, term1160.getClass(), "last", null);
        setField(term1160, term1160.getClass(), "propListHead", null);
        setIntField(term1160, term1160.getClass(), "sourcePosition", 0);
        setField(term1160, term1160.getClass(), "jsType", null);
        setField(term1160, term1160.getClass(), "parent", null);
        setField(term1140, term1140.getClass(), "last", term1160);
        setField(term1163, term1163.getClass(), "next", null);
        setIntField(term1163, term1163.getClass(), "type", 0);
        setIntField(term1163, term1163.getClass(), "intValue", 0);
        setField(term1163, term1163.getClass(), "objectValue", null);
        setField(term1140, term1140.getClass(), "propListHead", term1163);
        setIntField(term1140, term1140.getClass(), "sourcePosition", -15712667);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
        term9263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9268 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9271 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9263, term9263.getClass(), "type", 723812297);
        setIntField(term9264, term9264.getClass(), "type", 433248783);
        setIntField(term9265, term9265.getClass(), "type", 0);
        setField(term9265, term9265.getClass(), "next", null);
        setField(term9265, term9265.getClass(), "first", null);
        setField(term9265, term9265.getClass(), "last", null);
        setField(term9265, term9265.getClass(), "propListHead", null);
        setIntField(term9265, term9265.getClass(), "sourcePosition", 0);
        setField(term9265, term9265.getClass(), "jsType", null);
        setField(term9265, term9265.getClass(), "parent", null);
        setField(term9264, term9264.getClass(), "next", term9265);
        setIntField(term9266, term9266.getClass(), "type", 0);
        setField(term9266, term9266.getClass(), "next", null);
        setField(term9266, term9266.getClass(), "first", null);
        setField(term9266, term9266.getClass(), "last", null);
        setField(term9266, term9266.getClass(), "propListHead", null);
        setIntField(term9266, term9266.getClass(), "sourcePosition", 0);
        setField(term9266, term9266.getClass(), "jsType", null);
        setField(term9266, term9266.getClass(), "parent", null);
        setField(term9264, term9264.getClass(), "first", term9266);
        setIntField(term9267, term9267.getClass(), "type", 0);
        setField(term9267, term9267.getClass(), "next", null);
        setField(term9267, term9267.getClass(), "first", null);
        setField(term9267, term9267.getClass(), "last", null);
        setField(term9267, term9267.getClass(), "propListHead", null);
        setIntField(term9267, term9267.getClass(), "sourcePosition", 0);
        setField(term9267, term9267.getClass(), "jsType", null);
        setField(term9267, term9267.getClass(), "parent", null);
        setField(term9264, term9264.getClass(), "last", term9267);
        setField(term9268, term9268.getClass(), "next", null);
        setIntField(term9268, term9268.getClass(), "type", 0);
        setIntField(term9268, term9268.getClass(), "intValue", 0);
        setField(term9268, term9268.getClass(), "objectValue", null);
        setField(term9264, term9264.getClass(), "propListHead", term9268);
        setIntField(term9264, term9264.getClass(), "sourcePosition", 897010381);
        setField(term9264, term9264.getClass(), "jsType", null);
        setField(term9264, term9264.getClass(), "parent", null);
        setField(term9263, term9263.getClass(), "next", term9264);
        setIntField(term9269, term9269.getClass(), "type", 0);
        setField(term9269, term9269.getClass(), "next", null);
        setField(term9269, term9269.getClass(), "first", null);
        setField(term9269, term9269.getClass(), "last", null);
        setField(term9269, term9269.getClass(), "propListHead", null);
        setIntField(term9269, term9269.getClass(), "sourcePosition", 0);
        setField(term9269, term9269.getClass(), "jsType", null);
        setField(term9269, term9269.getClass(), "parent", null);
        setField(term9263, term9263.getClass(), "first", term9269);
        setIntField(term9270, term9270.getClass(), "type", 0);
        setField(term9270, term9270.getClass(), "next", null);
        setField(term9270, term9270.getClass(), "first", null);
        setField(term9270, term9270.getClass(), "last", null);
        setField(term9270, term9270.getClass(), "propListHead", null);
        setIntField(term9270, term9270.getClass(), "sourcePosition", 0);
        setField(term9270, term9270.getClass(), "jsType", null);
        setField(term9270, term9270.getClass(), "parent", null);
        setField(term9263, term9263.getClass(), "last", term9270);
        setField(term9271, term9271.getClass(), "next", null);
        setIntField(term9271, term9271.getClass(), "type", 0);
        setIntField(term9271, term9271.getClass(), "intValue", 0);
        setField(term9271, term9271.getClass(), "objectValue", null);
        setField(term9263, term9263.getClass(), "propListHead", term9271);
        setIntField(term9263, term9263.getClass(), "sourcePosition", -15712667);
        setField(term9263, term9263.getClass(), "jsType", null);
        setField(term9263, term9263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1140;
        Object retValue = callMethod(klass, "isExprCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1140, term9263));
        assertTrue(recursiveEquals(retValue, false));
    }

};


