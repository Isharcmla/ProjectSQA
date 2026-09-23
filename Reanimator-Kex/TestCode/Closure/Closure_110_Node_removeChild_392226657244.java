package com.google.javascript.rhino;

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
import java.lang.RuntimeException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_removeChild_392226657244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;
     Object term1569;

    public Node_removeChild_392226657244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1542, term1542.getClass(), "type", -1428063820);
        setIntField(term1544, term1544.getClass(), "type", -1271375703);
        setIntField(term1546, term1546.getClass(), "type", 1136208236);
        setIntField(term1548, term1548.getClass(), "type", -1220630391);
        setIntField(term1550, term1550.getClass(), "type", -995822131);
        setField(term1550, term1550.getClass(), "next", null);
        setField(term1550, term1550.getClass(), "first", null);
        setField(term1550, term1550.getClass(), "last", null);
        setField(term1550, term1550.getClass(), "propListHead", null);
        setIntField(term1550, term1550.getClass(), "sourcePosition", 0);
        setField(term1550, term1550.getClass(), "jsType", null);
        setField(term1550, term1550.getClass(), "parent", null);
        setField(term1548, term1548.getClass(), "next", term1550);
        setIntField(term1553, term1553.getClass(), "type", -687282231);
        setField(term1553, term1553.getClass(), "next", null);
        setField(term1553, term1553.getClass(), "first", null);
        setField(term1553, term1553.getClass(), "last", term1550);
        setField(term1553, term1553.getClass(), "propListHead", null);
        setIntField(term1553, term1553.getClass(), "sourcePosition", 0);
        setField(term1553, term1553.getClass(), "jsType", null);
        setField(term1553, term1553.getClass(), "parent", null);
        setField(term1548, term1548.getClass(), "first", term1553);
        setField(term1548, term1548.getClass(), "last", term1546);
        setField(term1548, term1548.getClass(), "propListHead", null);
        setIntField(term1548, term1548.getClass(), "sourcePosition", 0);
        setField(term1548, term1548.getClass(), "jsType", null);
        setField(term1548, term1548.getClass(), "parent", null);
        setField(term1546, term1546.getClass(), "next", term1548);
        setField(term1546, term1546.getClass(), "first", term1550);
        setIntField(term1557, term1557.getClass(), "type", 40571662);
        setIntField(term1559, term1559.getClass(), "type", 1863910269);
        setField(term1559, term1559.getClass(), "next", null);
        setField(term1559, term1559.getClass(), "first", term1553);
        setField(term1559, term1559.getClass(), "last", term1548);
        setField(term1559, term1559.getClass(), "propListHead", null);
        setIntField(term1559, term1559.getClass(), "sourcePosition", 0);
        setField(term1559, term1559.getClass(), "jsType", null);
        setField(term1559, term1559.getClass(), "parent", null);
        setField(term1557, term1557.getClass(), "next", term1559);
        setField(term1557, term1557.getClass(), "first", term1544);
        setField(term1557, term1557.getClass(), "last", term1544);
        setField(term1557, term1557.getClass(), "propListHead", null);
        setIntField(term1557, term1557.getClass(), "sourcePosition", 0);
        setField(term1557, term1557.getClass(), "jsType", null);
        setField(term1557, term1557.getClass(), "parent", null);
        setField(term1546, term1546.getClass(), "last", term1557);
        setField(term1546, term1546.getClass(), "propListHead", null);
        setIntField(term1546, term1546.getClass(), "sourcePosition", 0);
        setField(term1546, term1546.getClass(), "jsType", null);
        setField(term1546, term1546.getClass(), "parent", null);
        setField(term1544, term1544.getClass(), "next", term1546);
        setIntField(term1564, term1564.getClass(), "type", 864645689);
        setField(term1564, term1564.getClass(), "next", term1557);
        setField(term1564, term1564.getClass(), "first", term1559);
        setField(term1564, term1564.getClass(), "last", term1542);
        setField(term1564, term1564.getClass(), "propListHead", null);
        setIntField(term1564, term1564.getClass(), "sourcePosition", 0);
        setField(term1564, term1564.getClass(), "jsType", null);
        setField(term1564, term1564.getClass(), "parent", null);
        setField(term1544, term1544.getClass(), "first", term1564);
        setField(term1544, term1544.getClass(), "last", term1564);
        setField(term1544, term1544.getClass(), "propListHead", null);
        setIntField(term1544, term1544.getClass(), "sourcePosition", 0);
        setField(term1544, term1544.getClass(), "jsType", null);
        setField(term1544, term1544.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "next", term1544);
        setField(term1542, term1542.getClass(), "first", term1548);
        setField(term1542, term1542.getClass(), "last", term1550);
        setField(term1542, term1542.getClass(), "propListHead", null);
        setIntField(term1542, term1542.getClass(), "sourcePosition", 0);
        setField(term1542, term1542.getClass(), "jsType", null);
        setField(term1542, term1542.getClass(), "parent", null);
        term1569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1569, term1569.getClass(), "type", 279384872);
        setIntField(term1571, term1571.getClass(), "type", 1427305953);
        setIntField(term1573, term1573.getClass(), "type", -781832877);
        setIntField(term1575, term1575.getClass(), "type", 797203987);
        setIntField(term1577, term1577.getClass(), "type", 1973060703);
        setField(term1577, term1577.getClass(), "next", null);
        setField(term1577, term1577.getClass(), "first", null);
        setField(term1577, term1577.getClass(), "last", null);
        setField(term1577, term1577.getClass(), "propListHead", null);
        setIntField(term1577, term1577.getClass(), "sourcePosition", 0);
        setField(term1577, term1577.getClass(), "jsType", null);
        setField(term1577, term1577.getClass(), "parent", null);
        setField(term1575, term1575.getClass(), "next", term1577);
        setIntField(term1580, term1580.getClass(), "type", -138239905);
        setField(term1580, term1580.getClass(), "next", null);
        setField(term1580, term1580.getClass(), "first", null);
        setField(term1580, term1580.getClass(), "last", term1577);
        setField(term1580, term1580.getClass(), "propListHead", null);
        setIntField(term1580, term1580.getClass(), "sourcePosition", 0);
        setField(term1580, term1580.getClass(), "jsType", null);
        setField(term1580, term1580.getClass(), "parent", null);
        setField(term1575, term1575.getClass(), "first", term1580);
        setField(term1575, term1575.getClass(), "last", term1573);
        setField(term1575, term1575.getClass(), "propListHead", null);
        setIntField(term1575, term1575.getClass(), "sourcePosition", 0);
        setField(term1575, term1575.getClass(), "jsType", null);
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1573, term1573.getClass(), "next", term1575);
        setField(term1573, term1573.getClass(), "first", term1577);
        setIntField(term1584, term1584.getClass(), "type", 1406617209);
        setIntField(term1586, term1586.getClass(), "type", 1706047059);
        setField(term1586, term1586.getClass(), "next", null);
        setField(term1586, term1586.getClass(), "first", term1580);
        setField(term1586, term1586.getClass(), "last", term1575);
        setField(term1586, term1586.getClass(), "propListHead", null);
        setIntField(term1586, term1586.getClass(), "sourcePosition", 0);
        setField(term1586, term1586.getClass(), "jsType", null);
        setField(term1586, term1586.getClass(), "parent", null);
        setField(term1584, term1584.getClass(), "next", term1586);
        setField(term1584, term1584.getClass(), "first", term1571);
        setField(term1584, term1584.getClass(), "last", term1571);
        setField(term1584, term1584.getClass(), "propListHead", null);
        setIntField(term1584, term1584.getClass(), "sourcePosition", 0);
        setField(term1584, term1584.getClass(), "jsType", null);
        setField(term1584, term1584.getClass(), "parent", null);
        setField(term1573, term1573.getClass(), "last", term1584);
        setField(term1573, term1573.getClass(), "propListHead", null);
        setIntField(term1573, term1573.getClass(), "sourcePosition", 0);
        setField(term1573, term1573.getClass(), "jsType", null);
        setField(term1573, term1573.getClass(), "parent", null);
        setField(term1571, term1571.getClass(), "next", term1573);
        setIntField(term1591, term1591.getClass(), "type", 590451710);
        setField(term1591, term1591.getClass(), "next", term1584);
        setField(term1591, term1591.getClass(), "first", term1586);
        setField(term1591, term1591.getClass(), "last", term1569);
        setField(term1591, term1591.getClass(), "propListHead", null);
        setIntField(term1591, term1591.getClass(), "sourcePosition", 0);
        setField(term1591, term1591.getClass(), "jsType", null);
        setField(term1591, term1591.getClass(), "parent", null);
        setField(term1571, term1571.getClass(), "first", term1591);
        setField(term1571, term1571.getClass(), "last", term1591);
        setField(term1571, term1571.getClass(), "propListHead", null);
        setIntField(term1571, term1571.getClass(), "sourcePosition", 0);
        setField(term1571, term1571.getClass(), "jsType", null);
        setField(term1571, term1571.getClass(), "parent", null);
        setField(term1569, term1569.getClass(), "next", term1571);
        setField(term1569, term1569.getClass(), "first", term1575);
        setField(term1569, term1569.getClass(), "last", term1577);
        setField(term1569, term1569.getClass(), "propListHead", null);
        setIntField(term1569, term1569.getClass(), "sourcePosition", 0);
        setField(term1569, term1569.getClass(), "jsType", null);
        setField(term1569, term1569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1569;
        try {
            callMethod(klass, "removeChild", argTypes, term1542, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


