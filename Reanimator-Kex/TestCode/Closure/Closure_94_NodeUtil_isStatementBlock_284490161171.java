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

public class NodeUtil_isStatementBlock_284490161171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1383;
     Object term10059;

    public NodeUtil_isStatementBlock_284490161171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1383 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1383, term1383.getClass(), "type", -344907703);
        setIntField(term1385, term1385.getClass(), "type", -457396133);
        setIntField(term1387, term1387.getClass(), "type", 0);
        setField(term1387, term1387.getClass(), "next", null);
        setField(term1387, term1387.getClass(), "first", null);
        setField(term1387, term1387.getClass(), "last", null);
        setField(term1387, term1387.getClass(), "propListHead", null);
        setIntField(term1387, term1387.getClass(), "sourcePosition", 0);
        setField(term1387, term1387.getClass(), "jsType", null);
        setField(term1387, term1387.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "next", term1387);
        setIntField(term1390, term1390.getClass(), "type", 0);
        setField(term1390, term1390.getClass(), "next", null);
        setField(term1390, term1390.getClass(), "first", null);
        setField(term1390, term1390.getClass(), "last", null);
        setField(term1390, term1390.getClass(), "propListHead", null);
        setIntField(term1390, term1390.getClass(), "sourcePosition", 0);
        setField(term1390, term1390.getClass(), "jsType", null);
        setField(term1390, term1390.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "first", term1390);
        setIntField(term1393, term1393.getClass(), "type", 0);
        setField(term1393, term1393.getClass(), "next", null);
        setField(term1393, term1393.getClass(), "first", null);
        setField(term1393, term1393.getClass(), "last", null);
        setField(term1393, term1393.getClass(), "propListHead", null);
        setIntField(term1393, term1393.getClass(), "sourcePosition", 0);
        setField(term1393, term1393.getClass(), "jsType", null);
        setField(term1393, term1393.getClass(), "parent", null);
        setField(term1385, term1385.getClass(), "last", term1393);
        setField(term1396, term1396.getClass(), "next", null);
        setIntField(term1396, term1396.getClass(), "type", 0);
        setIntField(term1396, term1396.getClass(), "intValue", 0);
        setField(term1396, term1396.getClass(), "objectValue", null);
        setField(term1385, term1385.getClass(), "propListHead", term1396);
        setIntField(term1385, term1385.getClass(), "sourcePosition", 1895143076);
        setField(term1385, term1385.getClass(), "jsType", null);
        setField(term1385, term1385.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "next", term1385);
        setIntField(term1400, term1400.getClass(), "type", 0);
        setField(term1400, term1400.getClass(), "next", null);
        setField(term1400, term1400.getClass(), "first", null);
        setField(term1400, term1400.getClass(), "last", null);
        setField(term1400, term1400.getClass(), "propListHead", null);
        setIntField(term1400, term1400.getClass(), "sourcePosition", 0);
        setField(term1400, term1400.getClass(), "jsType", null);
        setField(term1400, term1400.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "first", term1400);
        setIntField(term1403, term1403.getClass(), "type", 0);
        setField(term1403, term1403.getClass(), "next", null);
        setField(term1403, term1403.getClass(), "first", null);
        setField(term1403, term1403.getClass(), "last", null);
        setField(term1403, term1403.getClass(), "propListHead", null);
        setIntField(term1403, term1403.getClass(), "sourcePosition", 0);
        setField(term1403, term1403.getClass(), "jsType", null);
        setField(term1403, term1403.getClass(), "parent", null);
        setField(term1383, term1383.getClass(), "last", term1403);
        setField(term1406, term1406.getClass(), "next", null);
        setIntField(term1406, term1406.getClass(), "type", 0);
        setIntField(term1406, term1406.getClass(), "intValue", 0);
        setField(term1406, term1406.getClass(), "objectValue", null);
        setField(term1383, term1383.getClass(), "propListHead", term1406);
        setIntField(term1383, term1383.getClass(), "sourcePosition", 1981860404);
        setField(term1383, term1383.getClass(), "jsType", null);
        setField(term1383, term1383.getClass(), "parent", null);
        term10059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10064 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10067 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10059, term10059.getClass(), "type", -344907703);
        setIntField(term10060, term10060.getClass(), "type", -457396133);
        setIntField(term10061, term10061.getClass(), "type", 0);
        setField(term10061, term10061.getClass(), "next", null);
        setField(term10061, term10061.getClass(), "first", null);
        setField(term10061, term10061.getClass(), "last", null);
        setField(term10061, term10061.getClass(), "propListHead", null);
        setIntField(term10061, term10061.getClass(), "sourcePosition", 0);
        setField(term10061, term10061.getClass(), "jsType", null);
        setField(term10061, term10061.getClass(), "parent", null);
        setField(term10060, term10060.getClass(), "next", term10061);
        setIntField(term10062, term10062.getClass(), "type", 0);
        setField(term10062, term10062.getClass(), "next", null);
        setField(term10062, term10062.getClass(), "first", null);
        setField(term10062, term10062.getClass(), "last", null);
        setField(term10062, term10062.getClass(), "propListHead", null);
        setIntField(term10062, term10062.getClass(), "sourcePosition", 0);
        setField(term10062, term10062.getClass(), "jsType", null);
        setField(term10062, term10062.getClass(), "parent", null);
        setField(term10060, term10060.getClass(), "first", term10062);
        setIntField(term10063, term10063.getClass(), "type", 0);
        setField(term10063, term10063.getClass(), "next", null);
        setField(term10063, term10063.getClass(), "first", null);
        setField(term10063, term10063.getClass(), "last", null);
        setField(term10063, term10063.getClass(), "propListHead", null);
        setIntField(term10063, term10063.getClass(), "sourcePosition", 0);
        setField(term10063, term10063.getClass(), "jsType", null);
        setField(term10063, term10063.getClass(), "parent", null);
        setField(term10060, term10060.getClass(), "last", term10063);
        setField(term10064, term10064.getClass(), "next", null);
        setIntField(term10064, term10064.getClass(), "type", 0);
        setIntField(term10064, term10064.getClass(), "intValue", 0);
        setField(term10064, term10064.getClass(), "objectValue", null);
        setField(term10060, term10060.getClass(), "propListHead", term10064);
        setIntField(term10060, term10060.getClass(), "sourcePosition", 1895143076);
        setField(term10060, term10060.getClass(), "jsType", null);
        setField(term10060, term10060.getClass(), "parent", null);
        setField(term10059, term10059.getClass(), "next", term10060);
        setIntField(term10065, term10065.getClass(), "type", 0);
        setField(term10065, term10065.getClass(), "next", null);
        setField(term10065, term10065.getClass(), "first", null);
        setField(term10065, term10065.getClass(), "last", null);
        setField(term10065, term10065.getClass(), "propListHead", null);
        setIntField(term10065, term10065.getClass(), "sourcePosition", 0);
        setField(term10065, term10065.getClass(), "jsType", null);
        setField(term10065, term10065.getClass(), "parent", null);
        setField(term10059, term10059.getClass(), "first", term10065);
        setIntField(term10066, term10066.getClass(), "type", 0);
        setField(term10066, term10066.getClass(), "next", null);
        setField(term10066, term10066.getClass(), "first", null);
        setField(term10066, term10066.getClass(), "last", null);
        setField(term10066, term10066.getClass(), "propListHead", null);
        setIntField(term10066, term10066.getClass(), "sourcePosition", 0);
        setField(term10066, term10066.getClass(), "jsType", null);
        setField(term10066, term10066.getClass(), "parent", null);
        setField(term10059, term10059.getClass(), "last", term10066);
        setField(term10067, term10067.getClass(), "next", null);
        setIntField(term10067, term10067.getClass(), "type", 0);
        setIntField(term10067, term10067.getClass(), "intValue", 0);
        setField(term10067, term10067.getClass(), "objectValue", null);
        setField(term10059, term10059.getClass(), "propListHead", term10067);
        setIntField(term10059, term10059.getClass(), "sourcePosition", 1981860404);
        setField(term10059, term10059.getClass(), "jsType", null);
        setField(term10059, term10059.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1383;
        Object retValue = callMethod(klass, "isStatementBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term1383, term10059));
        assertTrue(recursiveEquals(retValue, false));
    }

};


