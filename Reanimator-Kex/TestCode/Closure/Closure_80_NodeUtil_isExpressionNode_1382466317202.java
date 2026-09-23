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

public class NodeUtil_isExpressionNode_1382466317202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1244;
     Object term11263;

    public NodeUtil_isExpressionNode_1382466317202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1257 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1267 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1244, term1244.getClass(), "type", 947449400);
        setIntField(term1246, term1246.getClass(), "type", 213831054);
        setIntField(term1248, term1248.getClass(), "type", 0);
        setField(term1248, term1248.getClass(), "next", null);
        setField(term1248, term1248.getClass(), "first", null);
        setField(term1248, term1248.getClass(), "last", null);
        setField(term1248, term1248.getClass(), "propListHead", null);
        setIntField(term1248, term1248.getClass(), "sourcePosition", 0);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "next", term1248);
        setIntField(term1251, term1251.getClass(), "type", 0);
        setField(term1251, term1251.getClass(), "next", null);
        setField(term1251, term1251.getClass(), "first", null);
        setField(term1251, term1251.getClass(), "last", null);
        setField(term1251, term1251.getClass(), "propListHead", null);
        setIntField(term1251, term1251.getClass(), "sourcePosition", 0);
        setField(term1251, term1251.getClass(), "jsType", null);
        setField(term1251, term1251.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "first", term1251);
        setIntField(term1254, term1254.getClass(), "type", 0);
        setField(term1254, term1254.getClass(), "next", null);
        setField(term1254, term1254.getClass(), "first", null);
        setField(term1254, term1254.getClass(), "last", null);
        setField(term1254, term1254.getClass(), "propListHead", null);
        setIntField(term1254, term1254.getClass(), "sourcePosition", 0);
        setField(term1254, term1254.getClass(), "jsType", null);
        setField(term1254, term1254.getClass(), "parent", null);
        setField(term1246, term1246.getClass(), "last", term1254);
        setField(term1257, term1257.getClass(), "next", null);
        setIntField(term1257, term1257.getClass(), "type", 0);
        setIntField(term1257, term1257.getClass(), "intValue", 0);
        setField(term1257, term1257.getClass(), "objectValue", null);
        setField(term1246, term1246.getClass(), "propListHead", term1257);
        setIntField(term1246, term1246.getClass(), "sourcePosition", -1639041228);
        setField(term1246, term1246.getClass(), "jsType", null);
        setField(term1246, term1246.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "next", term1246);
        setIntField(term1261, term1261.getClass(), "type", 0);
        setField(term1261, term1261.getClass(), "next", null);
        setField(term1261, term1261.getClass(), "first", null);
        setField(term1261, term1261.getClass(), "last", null);
        setField(term1261, term1261.getClass(), "propListHead", null);
        setIntField(term1261, term1261.getClass(), "sourcePosition", 0);
        setField(term1261, term1261.getClass(), "jsType", null);
        setField(term1261, term1261.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "first", term1261);
        setIntField(term1264, term1264.getClass(), "type", 0);
        setField(term1264, term1264.getClass(), "next", null);
        setField(term1264, term1264.getClass(), "first", null);
        setField(term1264, term1264.getClass(), "last", null);
        setField(term1264, term1264.getClass(), "propListHead", null);
        setIntField(term1264, term1264.getClass(), "sourcePosition", 0);
        setField(term1264, term1264.getClass(), "jsType", null);
        setField(term1264, term1264.getClass(), "parent", null);
        setField(term1244, term1244.getClass(), "last", term1264);
        setField(term1267, term1267.getClass(), "next", null);
        setIntField(term1267, term1267.getClass(), "type", 0);
        setIntField(term1267, term1267.getClass(), "intValue", 0);
        setField(term1267, term1267.getClass(), "objectValue", null);
        setField(term1244, term1244.getClass(), "propListHead", term1267);
        setIntField(term1244, term1244.getClass(), "sourcePosition", 2027686272);
        setField(term1244, term1244.getClass(), "jsType", null);
        setField(term1244, term1244.getClass(), "parent", null);
        term11263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11268 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11271 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11263, term11263.getClass(), "type", 947449400);
        setIntField(term11264, term11264.getClass(), "type", 213831054);
        setIntField(term11265, term11265.getClass(), "type", 0);
        setField(term11265, term11265.getClass(), "next", null);
        setField(term11265, term11265.getClass(), "first", null);
        setField(term11265, term11265.getClass(), "last", null);
        setField(term11265, term11265.getClass(), "propListHead", null);
        setIntField(term11265, term11265.getClass(), "sourcePosition", 0);
        setField(term11265, term11265.getClass(), "jsType", null);
        setField(term11265, term11265.getClass(), "parent", null);
        setField(term11264, term11264.getClass(), "next", term11265);
        setIntField(term11266, term11266.getClass(), "type", 0);
        setField(term11266, term11266.getClass(), "next", null);
        setField(term11266, term11266.getClass(), "first", null);
        setField(term11266, term11266.getClass(), "last", null);
        setField(term11266, term11266.getClass(), "propListHead", null);
        setIntField(term11266, term11266.getClass(), "sourcePosition", 0);
        setField(term11266, term11266.getClass(), "jsType", null);
        setField(term11266, term11266.getClass(), "parent", null);
        setField(term11264, term11264.getClass(), "first", term11266);
        setIntField(term11267, term11267.getClass(), "type", 0);
        setField(term11267, term11267.getClass(), "next", null);
        setField(term11267, term11267.getClass(), "first", null);
        setField(term11267, term11267.getClass(), "last", null);
        setField(term11267, term11267.getClass(), "propListHead", null);
        setIntField(term11267, term11267.getClass(), "sourcePosition", 0);
        setField(term11267, term11267.getClass(), "jsType", null);
        setField(term11267, term11267.getClass(), "parent", null);
        setField(term11264, term11264.getClass(), "last", term11267);
        setField(term11268, term11268.getClass(), "next", null);
        setIntField(term11268, term11268.getClass(), "type", 0);
        setIntField(term11268, term11268.getClass(), "intValue", 0);
        setField(term11268, term11268.getClass(), "objectValue", null);
        setField(term11264, term11264.getClass(), "propListHead", term11268);
        setIntField(term11264, term11264.getClass(), "sourcePosition", -1639041228);
        setField(term11264, term11264.getClass(), "jsType", null);
        setField(term11264, term11264.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "next", term11264);
        setIntField(term11269, term11269.getClass(), "type", 0);
        setField(term11269, term11269.getClass(), "next", null);
        setField(term11269, term11269.getClass(), "first", null);
        setField(term11269, term11269.getClass(), "last", null);
        setField(term11269, term11269.getClass(), "propListHead", null);
        setIntField(term11269, term11269.getClass(), "sourcePosition", 0);
        setField(term11269, term11269.getClass(), "jsType", null);
        setField(term11269, term11269.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "first", term11269);
        setIntField(term11270, term11270.getClass(), "type", 0);
        setField(term11270, term11270.getClass(), "next", null);
        setField(term11270, term11270.getClass(), "first", null);
        setField(term11270, term11270.getClass(), "last", null);
        setField(term11270, term11270.getClass(), "propListHead", null);
        setIntField(term11270, term11270.getClass(), "sourcePosition", 0);
        setField(term11270, term11270.getClass(), "jsType", null);
        setField(term11270, term11270.getClass(), "parent", null);
        setField(term11263, term11263.getClass(), "last", term11270);
        setField(term11271, term11271.getClass(), "next", null);
        setIntField(term11271, term11271.getClass(), "type", 0);
        setIntField(term11271, term11271.getClass(), "intValue", 0);
        setField(term11271, term11271.getClass(), "objectValue", null);
        setField(term11263, term11263.getClass(), "propListHead", term11271);
        setIntField(term11263, term11263.getClass(), "sourcePosition", 2027686272);
        setField(term11263, term11263.getClass(), "jsType", null);
        setField(term11263, term11263.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1244;
        Object retValue = callMethod(klass, "isExpressionNode", argTypes, null, args);
        assertTrue(recursiveEquals(term1244, term11263));
        assertTrue(recursiveEquals(retValue, false));
    }

};


