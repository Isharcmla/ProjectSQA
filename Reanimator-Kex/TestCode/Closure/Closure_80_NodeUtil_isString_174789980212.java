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
     Object term12115;

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
        term12115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12120 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12123 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12115, term12115.getClass(), "type", -838848221);
        setIntField(term12116, term12116.getClass(), "type", -124088550);
        setIntField(term12117, term12117.getClass(), "type", 0);
        setField(term12117, term12117.getClass(), "next", null);
        setField(term12117, term12117.getClass(), "first", null);
        setField(term12117, term12117.getClass(), "last", null);
        setField(term12117, term12117.getClass(), "propListHead", null);
        setIntField(term12117, term12117.getClass(), "sourcePosition", 0);
        setField(term12117, term12117.getClass(), "jsType", null);
        setField(term12117, term12117.getClass(), "parent", null);
        setField(term12116, term12116.getClass(), "next", term12117);
        setIntField(term12118, term12118.getClass(), "type", 0);
        setField(term12118, term12118.getClass(), "next", null);
        setField(term12118, term12118.getClass(), "first", null);
        setField(term12118, term12118.getClass(), "last", null);
        setField(term12118, term12118.getClass(), "propListHead", null);
        setIntField(term12118, term12118.getClass(), "sourcePosition", 0);
        setField(term12118, term12118.getClass(), "jsType", null);
        setField(term12118, term12118.getClass(), "parent", null);
        setField(term12116, term12116.getClass(), "first", term12118);
        setIntField(term12119, term12119.getClass(), "type", 0);
        setField(term12119, term12119.getClass(), "next", null);
        setField(term12119, term12119.getClass(), "first", null);
        setField(term12119, term12119.getClass(), "last", null);
        setField(term12119, term12119.getClass(), "propListHead", null);
        setIntField(term12119, term12119.getClass(), "sourcePosition", 0);
        setField(term12119, term12119.getClass(), "jsType", null);
        setField(term12119, term12119.getClass(), "parent", null);
        setField(term12116, term12116.getClass(), "last", term12119);
        setField(term12120, term12120.getClass(), "next", null);
        setIntField(term12120, term12120.getClass(), "type", 0);
        setIntField(term12120, term12120.getClass(), "intValue", 0);
        setField(term12120, term12120.getClass(), "objectValue", null);
        setField(term12116, term12116.getClass(), "propListHead", term12120);
        setIntField(term12116, term12116.getClass(), "sourcePosition", 255145822);
        setField(term12116, term12116.getClass(), "jsType", null);
        setField(term12116, term12116.getClass(), "parent", null);
        setField(term12115, term12115.getClass(), "next", term12116);
        setIntField(term12121, term12121.getClass(), "type", 0);
        setField(term12121, term12121.getClass(), "next", null);
        setField(term12121, term12121.getClass(), "first", null);
        setField(term12121, term12121.getClass(), "last", null);
        setField(term12121, term12121.getClass(), "propListHead", null);
        setIntField(term12121, term12121.getClass(), "sourcePosition", 0);
        setField(term12121, term12121.getClass(), "jsType", null);
        setField(term12121, term12121.getClass(), "parent", null);
        setField(term12115, term12115.getClass(), "first", term12121);
        setIntField(term12122, term12122.getClass(), "type", 0);
        setField(term12122, term12122.getClass(), "next", null);
        setField(term12122, term12122.getClass(), "first", null);
        setField(term12122, term12122.getClass(), "last", null);
        setField(term12122, term12122.getClass(), "propListHead", null);
        setIntField(term12122, term12122.getClass(), "sourcePosition", 0);
        setField(term12122, term12122.getClass(), "jsType", null);
        setField(term12122, term12122.getClass(), "parent", null);
        setField(term12115, term12115.getClass(), "last", term12122);
        setField(term12123, term12123.getClass(), "next", null);
        setIntField(term12123, term12123.getClass(), "type", 0);
        setIntField(term12123, term12123.getClass(), "intValue", 0);
        setField(term12123, term12123.getClass(), "objectValue", null);
        setField(term12115, term12115.getClass(), "propListHead", term12123);
        setIntField(term12115, term12115.getClass(), "sourcePosition", -573608449);
        setField(term12115, term12115.getClass(), "jsType", null);
        setField(term12115, term12115.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1514;
        Object retValue = callMethod(klass, "isString", argTypes, null, args);
        assertTrue(recursiveEquals(term1514, term12115));
        assertTrue(recursiveEquals(retValue, false));
    }

};


