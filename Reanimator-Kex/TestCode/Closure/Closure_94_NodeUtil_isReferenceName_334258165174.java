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

public class NodeUtil_isReferenceName_334258165174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1464;
     Object term10431;

    public NodeUtil_isReferenceName_334258165174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1487 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1464, term1464.getClass(), "type", -348612876);
        setIntField(term1466, term1466.getClass(), "type", 718742281);
        setIntField(term1468, term1468.getClass(), "type", 0);
        setField(term1468, term1468.getClass(), "next", null);
        setField(term1468, term1468.getClass(), "first", null);
        setField(term1468, term1468.getClass(), "last", null);
        setField(term1468, term1468.getClass(), "propListHead", null);
        setIntField(term1468, term1468.getClass(), "sourcePosition", 0);
        setField(term1468, term1468.getClass(), "jsType", null);
        setField(term1468, term1468.getClass(), "parent", null);
        setField(term1466, term1466.getClass(), "next", term1468);
        setIntField(term1471, term1471.getClass(), "type", 0);
        setField(term1471, term1471.getClass(), "next", null);
        setField(term1471, term1471.getClass(), "first", null);
        setField(term1471, term1471.getClass(), "last", null);
        setField(term1471, term1471.getClass(), "propListHead", null);
        setIntField(term1471, term1471.getClass(), "sourcePosition", 0);
        setField(term1471, term1471.getClass(), "jsType", null);
        setField(term1471, term1471.getClass(), "parent", null);
        setField(term1466, term1466.getClass(), "first", term1471);
        setIntField(term1474, term1474.getClass(), "type", 0);
        setField(term1474, term1474.getClass(), "next", null);
        setField(term1474, term1474.getClass(), "first", null);
        setField(term1474, term1474.getClass(), "last", null);
        setField(term1474, term1474.getClass(), "propListHead", null);
        setIntField(term1474, term1474.getClass(), "sourcePosition", 0);
        setField(term1474, term1474.getClass(), "jsType", null);
        setField(term1474, term1474.getClass(), "parent", null);
        setField(term1466, term1466.getClass(), "last", term1474);
        setField(term1477, term1477.getClass(), "next", null);
        setIntField(term1477, term1477.getClass(), "type", 0);
        setIntField(term1477, term1477.getClass(), "intValue", 0);
        setField(term1477, term1477.getClass(), "objectValue", null);
        setField(term1466, term1466.getClass(), "propListHead", term1477);
        setIntField(term1466, term1466.getClass(), "sourcePosition", 777492093);
        setField(term1466, term1466.getClass(), "jsType", null);
        setField(term1466, term1466.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "next", term1466);
        setIntField(term1481, term1481.getClass(), "type", 0);
        setField(term1481, term1481.getClass(), "next", null);
        setField(term1481, term1481.getClass(), "first", null);
        setField(term1481, term1481.getClass(), "last", null);
        setField(term1481, term1481.getClass(), "propListHead", null);
        setIntField(term1481, term1481.getClass(), "sourcePosition", 0);
        setField(term1481, term1481.getClass(), "jsType", null);
        setField(term1481, term1481.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "first", term1481);
        setIntField(term1484, term1484.getClass(), "type", 0);
        setField(term1484, term1484.getClass(), "next", null);
        setField(term1484, term1484.getClass(), "first", null);
        setField(term1484, term1484.getClass(), "last", null);
        setField(term1484, term1484.getClass(), "propListHead", null);
        setIntField(term1484, term1484.getClass(), "sourcePosition", 0);
        setField(term1484, term1484.getClass(), "jsType", null);
        setField(term1484, term1484.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "last", term1484);
        setField(term1487, term1487.getClass(), "next", null);
        setIntField(term1487, term1487.getClass(), "type", 0);
        setIntField(term1487, term1487.getClass(), "intValue", 0);
        setField(term1487, term1487.getClass(), "objectValue", null);
        setField(term1464, term1464.getClass(), "propListHead", term1487);
        setIntField(term1464, term1464.getClass(), "sourcePosition", 1414025609);
        setField(term1464, term1464.getClass(), "jsType", null);
        setField(term1464, term1464.getClass(), "parent", null);
        term10431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10436 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10439 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10431, term10431.getClass(), "type", -348612876);
        setIntField(term10432, term10432.getClass(), "type", 718742281);
        setIntField(term10433, term10433.getClass(), "type", 0);
        setField(term10433, term10433.getClass(), "next", null);
        setField(term10433, term10433.getClass(), "first", null);
        setField(term10433, term10433.getClass(), "last", null);
        setField(term10433, term10433.getClass(), "propListHead", null);
        setIntField(term10433, term10433.getClass(), "sourcePosition", 0);
        setField(term10433, term10433.getClass(), "jsType", null);
        setField(term10433, term10433.getClass(), "parent", null);
        setField(term10432, term10432.getClass(), "next", term10433);
        setIntField(term10434, term10434.getClass(), "type", 0);
        setField(term10434, term10434.getClass(), "next", null);
        setField(term10434, term10434.getClass(), "first", null);
        setField(term10434, term10434.getClass(), "last", null);
        setField(term10434, term10434.getClass(), "propListHead", null);
        setIntField(term10434, term10434.getClass(), "sourcePosition", 0);
        setField(term10434, term10434.getClass(), "jsType", null);
        setField(term10434, term10434.getClass(), "parent", null);
        setField(term10432, term10432.getClass(), "first", term10434);
        setIntField(term10435, term10435.getClass(), "type", 0);
        setField(term10435, term10435.getClass(), "next", null);
        setField(term10435, term10435.getClass(), "first", null);
        setField(term10435, term10435.getClass(), "last", null);
        setField(term10435, term10435.getClass(), "propListHead", null);
        setIntField(term10435, term10435.getClass(), "sourcePosition", 0);
        setField(term10435, term10435.getClass(), "jsType", null);
        setField(term10435, term10435.getClass(), "parent", null);
        setField(term10432, term10432.getClass(), "last", term10435);
        setField(term10436, term10436.getClass(), "next", null);
        setIntField(term10436, term10436.getClass(), "type", 0);
        setIntField(term10436, term10436.getClass(), "intValue", 0);
        setField(term10436, term10436.getClass(), "objectValue", null);
        setField(term10432, term10432.getClass(), "propListHead", term10436);
        setIntField(term10432, term10432.getClass(), "sourcePosition", 777492093);
        setField(term10432, term10432.getClass(), "jsType", null);
        setField(term10432, term10432.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "next", term10432);
        setIntField(term10437, term10437.getClass(), "type", 0);
        setField(term10437, term10437.getClass(), "next", null);
        setField(term10437, term10437.getClass(), "first", null);
        setField(term10437, term10437.getClass(), "last", null);
        setField(term10437, term10437.getClass(), "propListHead", null);
        setIntField(term10437, term10437.getClass(), "sourcePosition", 0);
        setField(term10437, term10437.getClass(), "jsType", null);
        setField(term10437, term10437.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "first", term10437);
        setIntField(term10438, term10438.getClass(), "type", 0);
        setField(term10438, term10438.getClass(), "next", null);
        setField(term10438, term10438.getClass(), "first", null);
        setField(term10438, term10438.getClass(), "last", null);
        setField(term10438, term10438.getClass(), "propListHead", null);
        setIntField(term10438, term10438.getClass(), "sourcePosition", 0);
        setField(term10438, term10438.getClass(), "jsType", null);
        setField(term10438, term10438.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "last", term10438);
        setField(term10439, term10439.getClass(), "next", null);
        setIntField(term10439, term10439.getClass(), "type", 0);
        setIntField(term10439, term10439.getClass(), "intValue", 0);
        setField(term10439, term10439.getClass(), "objectValue", null);
        setField(term10431, term10431.getClass(), "propListHead", term10439);
        setIntField(term10431, term10431.getClass(), "sourcePosition", 1414025609);
        setField(term10431, term10431.getClass(), "jsType", null);
        setField(term10431, term10431.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1464;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1464, term10431));
        assertTrue(recursiveEquals(retValue, false));
    }

};


