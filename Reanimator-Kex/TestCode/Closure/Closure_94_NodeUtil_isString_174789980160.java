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

public class NodeUtil_isString_174789980160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059;
     Object term9103;

    public NodeUtil_isString_174789980160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1076 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1059, term1059.getClass(), "type", 1607082164);
        setIntField(term1061, term1061.getClass(), "type", 91958879);
        setIntField(term1063, term1063.getClass(), "type", 0);
        setField(term1063, term1063.getClass(), "next", null);
        setField(term1063, term1063.getClass(), "first", null);
        setField(term1063, term1063.getClass(), "last", null);
        setField(term1063, term1063.getClass(), "propListHead", null);
        setIntField(term1063, term1063.getClass(), "sourcePosition", 0);
        setField(term1063, term1063.getClass(), "jsType", null);
        setField(term1063, term1063.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "next", term1063);
        setIntField(term1066, term1066.getClass(), "type", 0);
        setField(term1066, term1066.getClass(), "next", null);
        setField(term1066, term1066.getClass(), "first", null);
        setField(term1066, term1066.getClass(), "last", null);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "first", term1066);
        setIntField(term1069, term1069.getClass(), "type", 0);
        setField(term1069, term1069.getClass(), "next", null);
        setField(term1069, term1069.getClass(), "first", null);
        setField(term1069, term1069.getClass(), "last", null);
        setField(term1069, term1069.getClass(), "propListHead", null);
        setIntField(term1069, term1069.getClass(), "sourcePosition", 0);
        setField(term1069, term1069.getClass(), "jsType", null);
        setField(term1069, term1069.getClass(), "parent", null);
        setField(term1061, term1061.getClass(), "last", term1069);
        setField(term1072, term1072.getClass(), "next", null);
        setIntField(term1072, term1072.getClass(), "type", 0);
        setIntField(term1072, term1072.getClass(), "intValue", 0);
        setField(term1072, term1072.getClass(), "objectValue", null);
        setField(term1061, term1061.getClass(), "propListHead", term1072);
        setIntField(term1061, term1061.getClass(), "sourcePosition", 644154104);
        setField(term1061, term1061.getClass(), "jsType", null);
        setField(term1061, term1061.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "next", term1061);
        setIntField(term1076, term1076.getClass(), "type", 0);
        setField(term1076, term1076.getClass(), "next", null);
        setField(term1076, term1076.getClass(), "first", null);
        setField(term1076, term1076.getClass(), "last", null);
        setField(term1076, term1076.getClass(), "propListHead", null);
        setIntField(term1076, term1076.getClass(), "sourcePosition", 0);
        setField(term1076, term1076.getClass(), "jsType", null);
        setField(term1076, term1076.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "first", term1076);
        setIntField(term1079, term1079.getClass(), "type", 0);
        setField(term1079, term1079.getClass(), "next", null);
        setField(term1079, term1079.getClass(), "first", null);
        setField(term1079, term1079.getClass(), "last", null);
        setField(term1079, term1079.getClass(), "propListHead", null);
        setIntField(term1079, term1079.getClass(), "sourcePosition", 0);
        setField(term1079, term1079.getClass(), "jsType", null);
        setField(term1079, term1079.getClass(), "parent", null);
        setField(term1059, term1059.getClass(), "last", term1079);
        setField(term1082, term1082.getClass(), "next", null);
        setIntField(term1082, term1082.getClass(), "type", 0);
        setIntField(term1082, term1082.getClass(), "intValue", 0);
        setField(term1082, term1082.getClass(), "objectValue", null);
        setField(term1059, term1059.getClass(), "propListHead", term1082);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 76650923);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        term9103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9111 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9103, term9103.getClass(), "type", 1607082164);
        setIntField(term9104, term9104.getClass(), "type", 91958879);
        setIntField(term9105, term9105.getClass(), "type", 0);
        setField(term9105, term9105.getClass(), "next", null);
        setField(term9105, term9105.getClass(), "first", null);
        setField(term9105, term9105.getClass(), "last", null);
        setField(term9105, term9105.getClass(), "propListHead", null);
        setIntField(term9105, term9105.getClass(), "sourcePosition", 0);
        setField(term9105, term9105.getClass(), "jsType", null);
        setField(term9105, term9105.getClass(), "parent", null);
        setField(term9104, term9104.getClass(), "next", term9105);
        setIntField(term9106, term9106.getClass(), "type", 0);
        setField(term9106, term9106.getClass(), "next", null);
        setField(term9106, term9106.getClass(), "first", null);
        setField(term9106, term9106.getClass(), "last", null);
        setField(term9106, term9106.getClass(), "propListHead", null);
        setIntField(term9106, term9106.getClass(), "sourcePosition", 0);
        setField(term9106, term9106.getClass(), "jsType", null);
        setField(term9106, term9106.getClass(), "parent", null);
        setField(term9104, term9104.getClass(), "first", term9106);
        setIntField(term9107, term9107.getClass(), "type", 0);
        setField(term9107, term9107.getClass(), "next", null);
        setField(term9107, term9107.getClass(), "first", null);
        setField(term9107, term9107.getClass(), "last", null);
        setField(term9107, term9107.getClass(), "propListHead", null);
        setIntField(term9107, term9107.getClass(), "sourcePosition", 0);
        setField(term9107, term9107.getClass(), "jsType", null);
        setField(term9107, term9107.getClass(), "parent", null);
        setField(term9104, term9104.getClass(), "last", term9107);
        setField(term9108, term9108.getClass(), "next", null);
        setIntField(term9108, term9108.getClass(), "type", 0);
        setIntField(term9108, term9108.getClass(), "intValue", 0);
        setField(term9108, term9108.getClass(), "objectValue", null);
        setField(term9104, term9104.getClass(), "propListHead", term9108);
        setIntField(term9104, term9104.getClass(), "sourcePosition", 644154104);
        setField(term9104, term9104.getClass(), "jsType", null);
        setField(term9104, term9104.getClass(), "parent", null);
        setField(term9103, term9103.getClass(), "next", term9104);
        setIntField(term9109, term9109.getClass(), "type", 0);
        setField(term9109, term9109.getClass(), "next", null);
        setField(term9109, term9109.getClass(), "first", null);
        setField(term9109, term9109.getClass(), "last", null);
        setField(term9109, term9109.getClass(), "propListHead", null);
        setIntField(term9109, term9109.getClass(), "sourcePosition", 0);
        setField(term9109, term9109.getClass(), "jsType", null);
        setField(term9109, term9109.getClass(), "parent", null);
        setField(term9103, term9103.getClass(), "first", term9109);
        setIntField(term9110, term9110.getClass(), "type", 0);
        setField(term9110, term9110.getClass(), "next", null);
        setField(term9110, term9110.getClass(), "first", null);
        setField(term9110, term9110.getClass(), "last", null);
        setField(term9110, term9110.getClass(), "propListHead", null);
        setIntField(term9110, term9110.getClass(), "sourcePosition", 0);
        setField(term9110, term9110.getClass(), "jsType", null);
        setField(term9110, term9110.getClass(), "parent", null);
        setField(term9103, term9103.getClass(), "last", term9110);
        setField(term9111, term9111.getClass(), "next", null);
        setIntField(term9111, term9111.getClass(), "type", 0);
        setIntField(term9111, term9111.getClass(), "intValue", 0);
        setField(term9111, term9111.getClass(), "objectValue", null);
        setField(term9103, term9103.getClass(), "propListHead", term9111);
        setIntField(term9103, term9103.getClass(), "sourcePosition", 76650923);
        setField(term9103, term9103.getClass(), "jsType", null);
        setField(term9103, term9103.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1059;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term1059, term9103));
        assertTrue(recursiveEquals(retValue, false));
    }

};


