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

public class NodeUtil_isWithinLoop_46295102167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;
     Object term9386;

    public NodeUtil_isWithinLoop_46295102167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1261 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1271 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1248, term1248.getClass(), "type", 1692937831);
        setIntField(term1250, term1250.getClass(), "type", 1237549886);
        setIntField(term1252, term1252.getClass(), "type", 0);
        setField(term1252, term1252.getClass(), "next", null);
        setField(term1252, term1252.getClass(), "first", null);
        setField(term1252, term1252.getClass(), "last", null);
        setField(term1252, term1252.getClass(), "propListHead", null);
        setIntField(term1252, term1252.getClass(), "sourcePosition", 0);
        setField(term1252, term1252.getClass(), "jsType", null);
        setField(term1252, term1252.getClass(), "parent", null);
        setField(term1250, term1250.getClass(), "next", term1252);
        setIntField(term1255, term1255.getClass(), "type", 0);
        setField(term1255, term1255.getClass(), "next", null);
        setField(term1255, term1255.getClass(), "first", null);
        setField(term1255, term1255.getClass(), "last", null);
        setField(term1255, term1255.getClass(), "propListHead", null);
        setIntField(term1255, term1255.getClass(), "sourcePosition", 0);
        setField(term1255, term1255.getClass(), "jsType", null);
        setField(term1255, term1255.getClass(), "parent", null);
        setField(term1250, term1250.getClass(), "first", term1255);
        setIntField(term1258, term1258.getClass(), "type", 0);
        setField(term1258, term1258.getClass(), "next", null);
        setField(term1258, term1258.getClass(), "first", null);
        setField(term1258, term1258.getClass(), "last", null);
        setField(term1258, term1258.getClass(), "propListHead", null);
        setIntField(term1258, term1258.getClass(), "sourcePosition", 0);
        setField(term1258, term1258.getClass(), "jsType", null);
        setField(term1258, term1258.getClass(), "parent", null);
        setField(term1250, term1250.getClass(), "last", term1258);
        setField(term1261, term1261.getClass(), "next", null);
        setIntField(term1261, term1261.getClass(), "type", 0);
        setIntField(term1261, term1261.getClass(), "intValue", 0);
        setField(term1261, term1261.getClass(), "objectValue", null);
        setField(term1250, term1250.getClass(), "propListHead", term1261);
        setIntField(term1250, term1250.getClass(), "sourcePosition", 2068435279);
        setField(term1250, term1250.getClass(), "jsType", null);
        setField(term1250, term1250.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "next", term1250);
        setIntField(term1265, term1265.getClass(), "type", 0);
        setField(term1265, term1265.getClass(), "next", null);
        setField(term1265, term1265.getClass(), "first", null);
        setField(term1265, term1265.getClass(), "last", null);
        setField(term1265, term1265.getClass(), "propListHead", null);
        setIntField(term1265, term1265.getClass(), "sourcePosition", 0);
        setField(term1265, term1265.getClass(), "jsType", null);
        setField(term1265, term1265.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "first", term1265);
        setIntField(term1268, term1268.getClass(), "type", 0);
        setField(term1268, term1268.getClass(), "next", null);
        setField(term1268, term1268.getClass(), "first", null);
        setField(term1268, term1268.getClass(), "last", null);
        setField(term1268, term1268.getClass(), "propListHead", null);
        setIntField(term1268, term1268.getClass(), "sourcePosition", 0);
        setField(term1268, term1268.getClass(), "jsType", null);
        setField(term1268, term1268.getClass(), "parent", null);
        setField(term1248, term1248.getClass(), "last", term1268);
        setField(term1271, term1271.getClass(), "next", null);
        setIntField(term1271, term1271.getClass(), "type", 0);
        setIntField(term1271, term1271.getClass(), "intValue", 0);
        setField(term1271, term1271.getClass(), "objectValue", null);
        setField(term1248, term1248.getClass(), "propListHead", term1271);
        setIntField(term1248, term1248.getClass(), "sourcePosition", -1556527718);
        setField(term1248, term1248.getClass(), "jsType", null);
        setField(term1248, term1248.getClass(), "parent", null);
        term9386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9391 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9394 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9386, term9386.getClass(), "type", 1692937831);
        setIntField(term9387, term9387.getClass(), "type", 1237549886);
        setIntField(term9388, term9388.getClass(), "type", 0);
        setField(term9388, term9388.getClass(), "next", null);
        setField(term9388, term9388.getClass(), "first", null);
        setField(term9388, term9388.getClass(), "last", null);
        setField(term9388, term9388.getClass(), "propListHead", null);
        setIntField(term9388, term9388.getClass(), "sourcePosition", 0);
        setField(term9388, term9388.getClass(), "jsType", null);
        setField(term9388, term9388.getClass(), "parent", null);
        setField(term9387, term9387.getClass(), "next", term9388);
        setIntField(term9389, term9389.getClass(), "type", 0);
        setField(term9389, term9389.getClass(), "next", null);
        setField(term9389, term9389.getClass(), "first", null);
        setField(term9389, term9389.getClass(), "last", null);
        setField(term9389, term9389.getClass(), "propListHead", null);
        setIntField(term9389, term9389.getClass(), "sourcePosition", 0);
        setField(term9389, term9389.getClass(), "jsType", null);
        setField(term9389, term9389.getClass(), "parent", null);
        setField(term9387, term9387.getClass(), "first", term9389);
        setIntField(term9390, term9390.getClass(), "type", 0);
        setField(term9390, term9390.getClass(), "next", null);
        setField(term9390, term9390.getClass(), "first", null);
        setField(term9390, term9390.getClass(), "last", null);
        setField(term9390, term9390.getClass(), "propListHead", null);
        setIntField(term9390, term9390.getClass(), "sourcePosition", 0);
        setField(term9390, term9390.getClass(), "jsType", null);
        setField(term9390, term9390.getClass(), "parent", null);
        setField(term9387, term9387.getClass(), "last", term9390);
        setField(term9391, term9391.getClass(), "next", null);
        setIntField(term9391, term9391.getClass(), "type", 0);
        setIntField(term9391, term9391.getClass(), "intValue", 0);
        setField(term9391, term9391.getClass(), "objectValue", null);
        setField(term9387, term9387.getClass(), "propListHead", term9391);
        setIntField(term9387, term9387.getClass(), "sourcePosition", 2068435279);
        setField(term9387, term9387.getClass(), "jsType", null);
        setField(term9387, term9387.getClass(), "parent", null);
        setField(term9386, term9386.getClass(), "next", term9387);
        setIntField(term9392, term9392.getClass(), "type", 0);
        setField(term9392, term9392.getClass(), "next", null);
        setField(term9392, term9392.getClass(), "first", null);
        setField(term9392, term9392.getClass(), "last", null);
        setField(term9392, term9392.getClass(), "propListHead", null);
        setIntField(term9392, term9392.getClass(), "sourcePosition", 0);
        setField(term9392, term9392.getClass(), "jsType", null);
        setField(term9392, term9392.getClass(), "parent", null);
        setField(term9386, term9386.getClass(), "first", term9392);
        setIntField(term9393, term9393.getClass(), "type", 0);
        setField(term9393, term9393.getClass(), "next", null);
        setField(term9393, term9393.getClass(), "first", null);
        setField(term9393, term9393.getClass(), "last", null);
        setField(term9393, term9393.getClass(), "propListHead", null);
        setIntField(term9393, term9393.getClass(), "sourcePosition", 0);
        setField(term9393, term9393.getClass(), "jsType", null);
        setField(term9393, term9393.getClass(), "parent", null);
        setField(term9386, term9386.getClass(), "last", term9393);
        setField(term9394, term9394.getClass(), "next", null);
        setIntField(term9394, term9394.getClass(), "type", 0);
        setIntField(term9394, term9394.getClass(), "intValue", 0);
        setField(term9394, term9394.getClass(), "objectValue", null);
        setField(term9386, term9386.getClass(), "propListHead", term9394);
        setIntField(term9386, term9386.getClass(), "sourcePosition", -1556527718);
        setField(term9386, term9386.getClass(), "jsType", null);
        setField(term9386, term9386.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1248;
        Object retValue = callMethod(klass, "isWithinLoop", argTypes, null, args);
        assertTrue(recursiveEquals(term1248, term9386));
        assertTrue(recursiveEquals(retValue, false));
    }

};


