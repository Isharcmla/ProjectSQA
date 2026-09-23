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

public class NodeUtil_isAssign_1955286018162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;
     Object term9183;

    public NodeUtil_isAssign_1955286018162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1126 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1136 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1113, term1113.getClass(), "type", 243280944);
        setIntField(term1115, term1115.getClass(), "type", 202214133);
        setIntField(term1117, term1117.getClass(), "type", 0);
        setField(term1117, term1117.getClass(), "next", null);
        setField(term1117, term1117.getClass(), "first", null);
        setField(term1117, term1117.getClass(), "last", null);
        setField(term1117, term1117.getClass(), "propListHead", null);
        setIntField(term1117, term1117.getClass(), "sourcePosition", 0);
        setField(term1117, term1117.getClass(), "jsType", null);
        setField(term1117, term1117.getClass(), "parent", null);
        setField(term1115, term1115.getClass(), "next", term1117);
        setIntField(term1120, term1120.getClass(), "type", 0);
        setField(term1120, term1120.getClass(), "next", null);
        setField(term1120, term1120.getClass(), "first", null);
        setField(term1120, term1120.getClass(), "last", null);
        setField(term1120, term1120.getClass(), "propListHead", null);
        setIntField(term1120, term1120.getClass(), "sourcePosition", 0);
        setField(term1120, term1120.getClass(), "jsType", null);
        setField(term1120, term1120.getClass(), "parent", null);
        setField(term1115, term1115.getClass(), "first", term1120);
        setIntField(term1123, term1123.getClass(), "type", 0);
        setField(term1123, term1123.getClass(), "next", null);
        setField(term1123, term1123.getClass(), "first", null);
        setField(term1123, term1123.getClass(), "last", null);
        setField(term1123, term1123.getClass(), "propListHead", null);
        setIntField(term1123, term1123.getClass(), "sourcePosition", 0);
        setField(term1123, term1123.getClass(), "jsType", null);
        setField(term1123, term1123.getClass(), "parent", null);
        setField(term1115, term1115.getClass(), "last", term1123);
        setField(term1126, term1126.getClass(), "next", null);
        setIntField(term1126, term1126.getClass(), "type", 0);
        setIntField(term1126, term1126.getClass(), "intValue", 0);
        setField(term1126, term1126.getClass(), "objectValue", null);
        setField(term1115, term1115.getClass(), "propListHead", term1126);
        setIntField(term1115, term1115.getClass(), "sourcePosition", -222941705);
        setField(term1115, term1115.getClass(), "jsType", null);
        setField(term1115, term1115.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "next", term1115);
        setIntField(term1130, term1130.getClass(), "type", 0);
        setField(term1130, term1130.getClass(), "next", null);
        setField(term1130, term1130.getClass(), "first", null);
        setField(term1130, term1130.getClass(), "last", null);
        setField(term1130, term1130.getClass(), "propListHead", null);
        setIntField(term1130, term1130.getClass(), "sourcePosition", 0);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "first", term1130);
        setIntField(term1133, term1133.getClass(), "type", 0);
        setField(term1133, term1133.getClass(), "next", null);
        setField(term1133, term1133.getClass(), "first", null);
        setField(term1133, term1133.getClass(), "last", null);
        setField(term1133, term1133.getClass(), "propListHead", null);
        setIntField(term1133, term1133.getClass(), "sourcePosition", 0);
        setField(term1133, term1133.getClass(), "jsType", null);
        setField(term1133, term1133.getClass(), "parent", null);
        setField(term1113, term1113.getClass(), "last", term1133);
        setField(term1136, term1136.getClass(), "next", null);
        setIntField(term1136, term1136.getClass(), "type", 0);
        setIntField(term1136, term1136.getClass(), "intValue", 0);
        setField(term1136, term1136.getClass(), "objectValue", null);
        setField(term1113, term1113.getClass(), "propListHead", term1136);
        setIntField(term1113, term1113.getClass(), "sourcePosition", 291864719);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        term9183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9188 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9191 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9183, term9183.getClass(), "type", 243280944);
        setIntField(term9184, term9184.getClass(), "type", 202214133);
        setIntField(term9185, term9185.getClass(), "type", 0);
        setField(term9185, term9185.getClass(), "next", null);
        setField(term9185, term9185.getClass(), "first", null);
        setField(term9185, term9185.getClass(), "last", null);
        setField(term9185, term9185.getClass(), "propListHead", null);
        setIntField(term9185, term9185.getClass(), "sourcePosition", 0);
        setField(term9185, term9185.getClass(), "jsType", null);
        setField(term9185, term9185.getClass(), "parent", null);
        setField(term9184, term9184.getClass(), "next", term9185);
        setIntField(term9186, term9186.getClass(), "type", 0);
        setField(term9186, term9186.getClass(), "next", null);
        setField(term9186, term9186.getClass(), "first", null);
        setField(term9186, term9186.getClass(), "last", null);
        setField(term9186, term9186.getClass(), "propListHead", null);
        setIntField(term9186, term9186.getClass(), "sourcePosition", 0);
        setField(term9186, term9186.getClass(), "jsType", null);
        setField(term9186, term9186.getClass(), "parent", null);
        setField(term9184, term9184.getClass(), "first", term9186);
        setIntField(term9187, term9187.getClass(), "type", 0);
        setField(term9187, term9187.getClass(), "next", null);
        setField(term9187, term9187.getClass(), "first", null);
        setField(term9187, term9187.getClass(), "last", null);
        setField(term9187, term9187.getClass(), "propListHead", null);
        setIntField(term9187, term9187.getClass(), "sourcePosition", 0);
        setField(term9187, term9187.getClass(), "jsType", null);
        setField(term9187, term9187.getClass(), "parent", null);
        setField(term9184, term9184.getClass(), "last", term9187);
        setField(term9188, term9188.getClass(), "next", null);
        setIntField(term9188, term9188.getClass(), "type", 0);
        setIntField(term9188, term9188.getClass(), "intValue", 0);
        setField(term9188, term9188.getClass(), "objectValue", null);
        setField(term9184, term9184.getClass(), "propListHead", term9188);
        setIntField(term9184, term9184.getClass(), "sourcePosition", -222941705);
        setField(term9184, term9184.getClass(), "jsType", null);
        setField(term9184, term9184.getClass(), "parent", null);
        setField(term9183, term9183.getClass(), "next", term9184);
        setIntField(term9189, term9189.getClass(), "type", 0);
        setField(term9189, term9189.getClass(), "next", null);
        setField(term9189, term9189.getClass(), "first", null);
        setField(term9189, term9189.getClass(), "last", null);
        setField(term9189, term9189.getClass(), "propListHead", null);
        setIntField(term9189, term9189.getClass(), "sourcePosition", 0);
        setField(term9189, term9189.getClass(), "jsType", null);
        setField(term9189, term9189.getClass(), "parent", null);
        setField(term9183, term9183.getClass(), "first", term9189);
        setIntField(term9190, term9190.getClass(), "type", 0);
        setField(term9190, term9190.getClass(), "next", null);
        setField(term9190, term9190.getClass(), "first", null);
        setField(term9190, term9190.getClass(), "last", null);
        setField(term9190, term9190.getClass(), "propListHead", null);
        setIntField(term9190, term9190.getClass(), "sourcePosition", 0);
        setField(term9190, term9190.getClass(), "jsType", null);
        setField(term9190, term9190.getClass(), "parent", null);
        setField(term9183, term9183.getClass(), "last", term9190);
        setField(term9191, term9191.getClass(), "next", null);
        setIntField(term9191, term9191.getClass(), "type", 0);
        setIntField(term9191, term9191.getClass(), "intValue", 0);
        setField(term9191, term9191.getClass(), "objectValue", null);
        setField(term9183, term9183.getClass(), "propListHead", term9191);
        setIntField(term9183, term9183.getClass(), "sourcePosition", 291864719);
        setField(term9183, term9183.getClass(), "jsType", null);
        setField(term9183, term9183.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1113;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1113, term9183));
        assertTrue(recursiveEquals(retValue, false));
    }

};


