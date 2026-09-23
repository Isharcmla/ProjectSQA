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

public class NodeUtil_isFunctionObjectCall_1433817400165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1700;
     Object term10231;

    public NodeUtil_isFunctionObjectCall_1433817400165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1723 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1700, term1700.getClass(), "type", 852806940);
        setIntField(term1702, term1702.getClass(), "type", -64893740);
        setIntField(term1704, term1704.getClass(), "type", 0);
        setField(term1704, term1704.getClass(), "next", null);
        setField(term1704, term1704.getClass(), "first", null);
        setField(term1704, term1704.getClass(), "last", null);
        setField(term1704, term1704.getClass(), "propListHead", null);
        setIntField(term1704, term1704.getClass(), "sourcePosition", 0);
        setField(term1704, term1704.getClass(), "jsType", null);
        setField(term1704, term1704.getClass(), "parent", null);
        setField(term1702, term1702.getClass(), "next", term1704);
        setIntField(term1707, term1707.getClass(), "type", 0);
        setField(term1707, term1707.getClass(), "next", null);
        setField(term1707, term1707.getClass(), "first", null);
        setField(term1707, term1707.getClass(), "last", null);
        setField(term1707, term1707.getClass(), "propListHead", null);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 0);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
        setField(term1702, term1702.getClass(), "first", term1707);
        setIntField(term1710, term1710.getClass(), "type", 0);
        setField(term1710, term1710.getClass(), "next", null);
        setField(term1710, term1710.getClass(), "first", null);
        setField(term1710, term1710.getClass(), "last", null);
        setField(term1710, term1710.getClass(), "propListHead", null);
        setIntField(term1710, term1710.getClass(), "sourcePosition", 0);
        setField(term1710, term1710.getClass(), "jsType", null);
        setField(term1710, term1710.getClass(), "parent", null);
        setField(term1702, term1702.getClass(), "last", term1710);
        setField(term1713, term1713.getClass(), "next", null);
        setIntField(term1713, term1713.getClass(), "type", 0);
        setIntField(term1713, term1713.getClass(), "intValue", 0);
        setField(term1713, term1713.getClass(), "objectValue", null);
        setField(term1702, term1702.getClass(), "propListHead", term1713);
        setIntField(term1702, term1702.getClass(), "sourcePosition", -83178716);
        setField(term1702, term1702.getClass(), "jsType", null);
        setField(term1702, term1702.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "next", term1702);
        setIntField(term1717, term1717.getClass(), "type", 0);
        setField(term1717, term1717.getClass(), "next", null);
        setField(term1717, term1717.getClass(), "first", null);
        setField(term1717, term1717.getClass(), "last", null);
        setField(term1717, term1717.getClass(), "propListHead", null);
        setIntField(term1717, term1717.getClass(), "sourcePosition", 0);
        setField(term1717, term1717.getClass(), "jsType", null);
        setField(term1717, term1717.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "first", term1717);
        setIntField(term1720, term1720.getClass(), "type", 0);
        setField(term1720, term1720.getClass(), "next", null);
        setField(term1720, term1720.getClass(), "first", null);
        setField(term1720, term1720.getClass(), "last", null);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1700, term1700.getClass(), "last", term1720);
        setField(term1723, term1723.getClass(), "next", null);
        setIntField(term1723, term1723.getClass(), "type", 0);
        setIntField(term1723, term1723.getClass(), "intValue", 0);
        setField(term1723, term1723.getClass(), "objectValue", null);
        setField(term1700, term1700.getClass(), "propListHead", term1723);
        setIntField(term1700, term1700.getClass(), "sourcePosition", -1292704466);
        setField(term1700, term1700.getClass(), "jsType", null);
        setField(term1700, term1700.getClass(), "parent", null);
        term10231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10239 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10231, term10231.getClass(), "type", 852806940);
        setIntField(term10232, term10232.getClass(), "type", -64893740);
        setIntField(term10233, term10233.getClass(), "type", 0);
        setField(term10233, term10233.getClass(), "next", null);
        setField(term10233, term10233.getClass(), "first", null);
        setField(term10233, term10233.getClass(), "last", null);
        setField(term10233, term10233.getClass(), "propListHead", null);
        setIntField(term10233, term10233.getClass(), "sourcePosition", 0);
        setField(term10233, term10233.getClass(), "jsType", null);
        setField(term10233, term10233.getClass(), "parent", null);
        setField(term10232, term10232.getClass(), "next", term10233);
        setIntField(term10234, term10234.getClass(), "type", 0);
        setField(term10234, term10234.getClass(), "next", null);
        setField(term10234, term10234.getClass(), "first", null);
        setField(term10234, term10234.getClass(), "last", null);
        setField(term10234, term10234.getClass(), "propListHead", null);
        setIntField(term10234, term10234.getClass(), "sourcePosition", 0);
        setField(term10234, term10234.getClass(), "jsType", null);
        setField(term10234, term10234.getClass(), "parent", null);
        setField(term10232, term10232.getClass(), "first", term10234);
        setIntField(term10235, term10235.getClass(), "type", 0);
        setField(term10235, term10235.getClass(), "next", null);
        setField(term10235, term10235.getClass(), "first", null);
        setField(term10235, term10235.getClass(), "last", null);
        setField(term10235, term10235.getClass(), "propListHead", null);
        setIntField(term10235, term10235.getClass(), "sourcePosition", 0);
        setField(term10235, term10235.getClass(), "jsType", null);
        setField(term10235, term10235.getClass(), "parent", null);
        setField(term10232, term10232.getClass(), "last", term10235);
        setField(term10236, term10236.getClass(), "next", null);
        setIntField(term10236, term10236.getClass(), "type", 0);
        setIntField(term10236, term10236.getClass(), "intValue", 0);
        setField(term10236, term10236.getClass(), "objectValue", null);
        setField(term10232, term10232.getClass(), "propListHead", term10236);
        setIntField(term10232, term10232.getClass(), "sourcePosition", -83178716);
        setField(term10232, term10232.getClass(), "jsType", null);
        setField(term10232, term10232.getClass(), "parent", null);
        setField(term10231, term10231.getClass(), "next", term10232);
        setIntField(term10237, term10237.getClass(), "type", 0);
        setField(term10237, term10237.getClass(), "next", null);
        setField(term10237, term10237.getClass(), "first", null);
        setField(term10237, term10237.getClass(), "last", null);
        setField(term10237, term10237.getClass(), "propListHead", null);
        setIntField(term10237, term10237.getClass(), "sourcePosition", 0);
        setField(term10237, term10237.getClass(), "jsType", null);
        setField(term10237, term10237.getClass(), "parent", null);
        setField(term10231, term10231.getClass(), "first", term10237);
        setIntField(term10238, term10238.getClass(), "type", 0);
        setField(term10238, term10238.getClass(), "next", null);
        setField(term10238, term10238.getClass(), "first", null);
        setField(term10238, term10238.getClass(), "last", null);
        setField(term10238, term10238.getClass(), "propListHead", null);
        setIntField(term10238, term10238.getClass(), "sourcePosition", 0);
        setField(term10238, term10238.getClass(), "jsType", null);
        setField(term10238, term10238.getClass(), "parent", null);
        setField(term10231, term10231.getClass(), "last", term10238);
        setField(term10239, term10239.getClass(), "next", null);
        setIntField(term10239, term10239.getClass(), "type", 0);
        setIntField(term10239, term10239.getClass(), "intValue", 0);
        setField(term10239, term10239.getClass(), "objectValue", null);
        setField(term10231, term10231.getClass(), "propListHead", term10239);
        setIntField(term10231, term10231.getClass(), "sourcePosition", -1292704466);
        setField(term10231, term10231.getClass(), "jsType", null);
        setField(term10231, term10231.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1700;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1700, term10231));
    }

};


