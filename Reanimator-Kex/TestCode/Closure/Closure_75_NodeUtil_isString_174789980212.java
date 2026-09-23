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

public class NodeUtil_isString_174789980212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1514;
     Object term12409;

    public NodeUtil_isString_174789980212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1527 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1537 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1514, term1514.getClass(), "type", -838848221);
        setIntField(term1516, term1516.getClass(), "type", -124088550);
        setIntField(term1518, term1518.getClass(), "type", 0);
        setField(term1518, term1518.getClass(), "next", null);
        setField(term1518, term1518.getClass(), "first", null);
        setField(term1518, term1518.getClass(), "last", null);
        setField(term1518, term1518.getClass(), "propListHead", null);
        setIntField(term1518, term1518.getClass(), "sourcePosition", 0);
        setField(term1518, term1518.getClass(), "jsType", null);
        setField(term1518, term1518.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "next", term1518);
        setIntField(term1521, term1521.getClass(), "type", 0);
        setField(term1521, term1521.getClass(), "next", null);
        setField(term1521, term1521.getClass(), "first", null);
        setField(term1521, term1521.getClass(), "last", null);
        setField(term1521, term1521.getClass(), "propListHead", null);
        setIntField(term1521, term1521.getClass(), "sourcePosition", 0);
        setField(term1521, term1521.getClass(), "jsType", null);
        setField(term1521, term1521.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "first", term1521);
        setIntField(term1524, term1524.getClass(), "type", 0);
        setField(term1524, term1524.getClass(), "next", null);
        setField(term1524, term1524.getClass(), "first", null);
        setField(term1524, term1524.getClass(), "last", null);
        setField(term1524, term1524.getClass(), "propListHead", null);
        setIntField(term1524, term1524.getClass(), "sourcePosition", 0);
        setField(term1524, term1524.getClass(), "jsType", null);
        setField(term1524, term1524.getClass(), "parent", null);
        setField(term1516, term1516.getClass(), "last", term1524);
        setField(term1527, term1527.getClass(), "next", null);
        setIntField(term1527, term1527.getClass(), "type", 0);
        setIntField(term1527, term1527.getClass(), "intValue", 0);
        setField(term1527, term1527.getClass(), "objectValue", null);
        setField(term1516, term1516.getClass(), "propListHead", term1527);
        setIntField(term1516, term1516.getClass(), "sourcePosition", 255145822);
        setField(term1516, term1516.getClass(), "jsType", null);
        setField(term1516, term1516.getClass(), "parent", null);
        setField(term1514, term1514.getClass(), "next", term1516);
        setIntField(term1531, term1531.getClass(), "type", 0);
        setField(term1531, term1531.getClass(), "next", null);
        setField(term1531, term1531.getClass(), "first", null);
        setField(term1531, term1531.getClass(), "last", null);
        setField(term1531, term1531.getClass(), "propListHead", null);
        setIntField(term1531, term1531.getClass(), "sourcePosition", 0);
        setField(term1531, term1531.getClass(), "jsType", null);
        setField(term1531, term1531.getClass(), "parent", null);
        setField(term1514, term1514.getClass(), "first", term1531);
        setIntField(term1534, term1534.getClass(), "type", 0);
        setField(term1534, term1534.getClass(), "next", null);
        setField(term1534, term1534.getClass(), "first", null);
        setField(term1534, term1534.getClass(), "last", null);
        setField(term1534, term1534.getClass(), "propListHead", null);
        setIntField(term1534, term1534.getClass(), "sourcePosition", 0);
        setField(term1534, term1534.getClass(), "jsType", null);
        setField(term1534, term1534.getClass(), "parent", null);
        setField(term1514, term1514.getClass(), "last", term1534);
        setField(term1537, term1537.getClass(), "next", null);
        setIntField(term1537, term1537.getClass(), "type", 0);
        setIntField(term1537, term1537.getClass(), "intValue", 0);
        setField(term1537, term1537.getClass(), "objectValue", null);
        setField(term1514, term1514.getClass(), "propListHead", term1537);
        setIntField(term1514, term1514.getClass(), "sourcePosition", -573608449);
        setField(term1514, term1514.getClass(), "jsType", null);
        setField(term1514, term1514.getClass(), "parent", null);
        term12409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12414 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12417 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12409, term12409.getClass(), "type", -838848221);
        setIntField(term12410, term12410.getClass(), "type", -124088550);
        setIntField(term12411, term12411.getClass(), "type", 0);
        setField(term12411, term12411.getClass(), "next", null);
        setField(term12411, term12411.getClass(), "first", null);
        setField(term12411, term12411.getClass(), "last", null);
        setField(term12411, term12411.getClass(), "propListHead", null);
        setIntField(term12411, term12411.getClass(), "sourcePosition", 0);
        setField(term12411, term12411.getClass(), "jsType", null);
        setField(term12411, term12411.getClass(), "parent", null);
        setField(term12410, term12410.getClass(), "next", term12411);
        setIntField(term12412, term12412.getClass(), "type", 0);
        setField(term12412, term12412.getClass(), "next", null);
        setField(term12412, term12412.getClass(), "first", null);
        setField(term12412, term12412.getClass(), "last", null);
        setField(term12412, term12412.getClass(), "propListHead", null);
        setIntField(term12412, term12412.getClass(), "sourcePosition", 0);
        setField(term12412, term12412.getClass(), "jsType", null);
        setField(term12412, term12412.getClass(), "parent", null);
        setField(term12410, term12410.getClass(), "first", term12412);
        setIntField(term12413, term12413.getClass(), "type", 0);
        setField(term12413, term12413.getClass(), "next", null);
        setField(term12413, term12413.getClass(), "first", null);
        setField(term12413, term12413.getClass(), "last", null);
        setField(term12413, term12413.getClass(), "propListHead", null);
        setIntField(term12413, term12413.getClass(), "sourcePosition", 0);
        setField(term12413, term12413.getClass(), "jsType", null);
        setField(term12413, term12413.getClass(), "parent", null);
        setField(term12410, term12410.getClass(), "last", term12413);
        setField(term12414, term12414.getClass(), "next", null);
        setIntField(term12414, term12414.getClass(), "type", 0);
        setIntField(term12414, term12414.getClass(), "intValue", 0);
        setField(term12414, term12414.getClass(), "objectValue", null);
        setField(term12410, term12410.getClass(), "propListHead", term12414);
        setIntField(term12410, term12410.getClass(), "sourcePosition", 255145822);
        setField(term12410, term12410.getClass(), "jsType", null);
        setField(term12410, term12410.getClass(), "parent", null);
        setField(term12409, term12409.getClass(), "next", term12410);
        setIntField(term12415, term12415.getClass(), "type", 0);
        setField(term12415, term12415.getClass(), "next", null);
        setField(term12415, term12415.getClass(), "first", null);
        setField(term12415, term12415.getClass(), "last", null);
        setField(term12415, term12415.getClass(), "propListHead", null);
        setIntField(term12415, term12415.getClass(), "sourcePosition", 0);
        setField(term12415, term12415.getClass(), "jsType", null);
        setField(term12415, term12415.getClass(), "parent", null);
        setField(term12409, term12409.getClass(), "first", term12415);
        setIntField(term12416, term12416.getClass(), "type", 0);
        setField(term12416, term12416.getClass(), "next", null);
        setField(term12416, term12416.getClass(), "first", null);
        setField(term12416, term12416.getClass(), "last", null);
        setField(term12416, term12416.getClass(), "propListHead", null);
        setIntField(term12416, term12416.getClass(), "sourcePosition", 0);
        setField(term12416, term12416.getClass(), "jsType", null);
        setField(term12416, term12416.getClass(), "parent", null);
        setField(term12409, term12409.getClass(), "last", term12416);
        setField(term12417, term12417.getClass(), "next", null);
        setIntField(term12417, term12417.getClass(), "type", 0);
        setIntField(term12417, term12417.getClass(), "intValue", 0);
        setField(term12417, term12417.getClass(), "objectValue", null);
        setField(term12409, term12409.getClass(), "propListHead", term12417);
        setIntField(term12409, term12409.getClass(), "sourcePosition", -573608449);
        setField(term12409, term12409.getClass(), "jsType", null);
        setField(term12409, term12409.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1514;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term1514, term12409));
        assertTrue(recursiveEquals(retValue, false));
    }

};


