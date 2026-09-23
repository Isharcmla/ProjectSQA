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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_assign_916745689111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1480;
     Object term1507;

    public IR_assign_916745689111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1480, term1480.getClass(), "type", 1956590498);
        setIntField(term1482, term1482.getClass(), "type", 1467356494);
        setIntField(term1484, term1484.getClass(), "type", -26316536);
        setIntField(term1486, term1486.getClass(), "type", 1716165145);
        setIntField(term1488, term1488.getClass(), "type", 1692937831);
        setField(term1488, term1488.getClass(), "next", null);
        setField(term1488, term1488.getClass(), "first", null);
        setField(term1488, term1488.getClass(), "last", null);
        setField(term1488, term1488.getClass(), "propListHead", null);
        setIntField(term1488, term1488.getClass(), "sourcePosition", 0);
        setField(term1488, term1488.getClass(), "jsType", null);
        setField(term1488, term1488.getClass(), "parent", null);
        setField(term1486, term1486.getClass(), "next", term1488);
        setIntField(term1491, term1491.getClass(), "type", -1539747985);
        setField(term1491, term1491.getClass(), "next", null);
        setField(term1491, term1491.getClass(), "first", null);
        setField(term1491, term1491.getClass(), "last", term1488);
        setField(term1491, term1491.getClass(), "propListHead", null);
        setIntField(term1491, term1491.getClass(), "sourcePosition", 0);
        setField(term1491, term1491.getClass(), "jsType", null);
        setField(term1491, term1491.getClass(), "parent", null);
        setField(term1486, term1486.getClass(), "first", term1491);
        setField(term1486, term1486.getClass(), "last", term1484);
        setField(term1486, term1486.getClass(), "propListHead", null);
        setIntField(term1486, term1486.getClass(), "sourcePosition", 0);
        setField(term1486, term1486.getClass(), "jsType", null);
        setField(term1486, term1486.getClass(), "parent", null);
        setField(term1484, term1484.getClass(), "next", term1486);
        setField(term1484, term1484.getClass(), "first", term1488);
        setIntField(term1495, term1495.getClass(), "type", 550892835);
        setIntField(term1497, term1497.getClass(), "type", 1237549886);
        setField(term1497, term1497.getClass(), "next", null);
        setField(term1497, term1497.getClass(), "first", term1491);
        setField(term1497, term1497.getClass(), "last", term1486);
        setField(term1497, term1497.getClass(), "propListHead", null);
        setIntField(term1497, term1497.getClass(), "sourcePosition", 0);
        setField(term1497, term1497.getClass(), "jsType", null);
        setField(term1497, term1497.getClass(), "parent", null);
        setField(term1495, term1495.getClass(), "next", term1497);
        setField(term1495, term1495.getClass(), "first", term1482);
        setField(term1495, term1495.getClass(), "last", term1482);
        setField(term1495, term1495.getClass(), "propListHead", null);
        setIntField(term1495, term1495.getClass(), "sourcePosition", 0);
        setField(term1495, term1495.getClass(), "jsType", null);
        setField(term1495, term1495.getClass(), "parent", null);
        setField(term1484, term1484.getClass(), "last", term1495);
        setField(term1484, term1484.getClass(), "propListHead", null);
        setIntField(term1484, term1484.getClass(), "sourcePosition", 0);
        setField(term1484, term1484.getClass(), "jsType", null);
        setField(term1484, term1484.getClass(), "parent", null);
        setField(term1482, term1482.getClass(), "next", term1484);
        setIntField(term1502, term1502.getClass(), "type", -1945635750);
        setField(term1502, term1502.getClass(), "next", term1495);
        setField(term1502, term1502.getClass(), "first", term1497);
        setField(term1502, term1502.getClass(), "last", term1480);
        setField(term1502, term1502.getClass(), "propListHead", null);
        setIntField(term1502, term1502.getClass(), "sourcePosition", 0);
        setField(term1502, term1502.getClass(), "jsType", null);
        setField(term1502, term1502.getClass(), "parent", null);
        setField(term1482, term1482.getClass(), "first", term1502);
        setField(term1482, term1482.getClass(), "last", term1502);
        setField(term1482, term1482.getClass(), "propListHead", null);
        setIntField(term1482, term1482.getClass(), "sourcePosition", 0);
        setField(term1482, term1482.getClass(), "jsType", null);
        setField(term1482, term1482.getClass(), "parent", null);
        setField(term1480, term1480.getClass(), "next", term1482);
        setField(term1480, term1480.getClass(), "first", term1486);
        setField(term1480, term1480.getClass(), "last", term1488);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
        term1507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1507, term1507.getClass(), "type", -1622760744);
        setIntField(term1509, term1509.getClass(), "type", 2068435279);
        setIntField(term1511, term1511.getClass(), "type", -1556527718);
        setIntField(term1513, term1513.getClass(), "type", 895255351);
        setIntField(term1515, term1515.getClass(), "type", -1317044799);
        setField(term1515, term1515.getClass(), "next", null);
        setField(term1515, term1515.getClass(), "first", null);
        setField(term1515, term1515.getClass(), "last", null);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1513, term1513.getClass(), "next", term1515);
        setIntField(term1518, term1518.getClass(), "type", -1428063820);
        setField(term1518, term1518.getClass(), "next", null);
        setField(term1518, term1518.getClass(), "first", null);
        setField(term1518, term1518.getClass(), "last", term1515);
        setField(term1518, term1518.getClass(), "propListHead", null);
        setIntField(term1518, term1518.getClass(), "sourcePosition", 0);
        setField(term1518, term1518.getClass(), "jsType", null);
        setField(term1518, term1518.getClass(), "parent", null);
        setField(term1513, term1513.getClass(), "first", term1518);
        setField(term1513, term1513.getClass(), "last", term1511);
        setField(term1513, term1513.getClass(), "propListHead", null);
        setIntField(term1513, term1513.getClass(), "sourcePosition", 0);
        setField(term1513, term1513.getClass(), "jsType", null);
        setField(term1513, term1513.getClass(), "parent", null);
        setField(term1511, term1511.getClass(), "next", term1513);
        setField(term1511, term1511.getClass(), "first", term1515);
        setIntField(term1522, term1522.getClass(), "type", 1136208236);
        setIntField(term1524, term1524.getClass(), "type", -1220630391);
        setField(term1524, term1524.getClass(), "next", null);
        setField(term1524, term1524.getClass(), "first", term1518);
        setField(term1524, term1524.getClass(), "last", term1513);
        setField(term1524, term1524.getClass(), "propListHead", null);
        setIntField(term1524, term1524.getClass(), "sourcePosition", 0);
        setField(term1524, term1524.getClass(), "jsType", null);
        setField(term1524, term1524.getClass(), "parent", null);
        setField(term1522, term1522.getClass(), "next", term1524);
        setField(term1522, term1522.getClass(), "first", term1509);
        setField(term1522, term1522.getClass(), "last", term1509);
        setField(term1522, term1522.getClass(), "propListHead", null);
        setIntField(term1522, term1522.getClass(), "sourcePosition", 0);
        setField(term1522, term1522.getClass(), "jsType", null);
        setField(term1522, term1522.getClass(), "parent", null);
        setField(term1511, term1511.getClass(), "last", term1522);
        setField(term1511, term1511.getClass(), "propListHead", null);
        setIntField(term1511, term1511.getClass(), "sourcePosition", 0);
        setField(term1511, term1511.getClass(), "jsType", null);
        setField(term1511, term1511.getClass(), "parent", null);
        setField(term1509, term1509.getClass(), "next", term1511);
        setIntField(term1529, term1529.getClass(), "type", -995822131);
        setField(term1529, term1529.getClass(), "next", term1522);
        setField(term1529, term1529.getClass(), "first", term1524);
        setField(term1529, term1529.getClass(), "last", term1507);
        setField(term1529, term1529.getClass(), "propListHead", null);
        setIntField(term1529, term1529.getClass(), "sourcePosition", 0);
        setField(term1529, term1529.getClass(), "jsType", null);
        setField(term1529, term1529.getClass(), "parent", null);
        setField(term1509, term1509.getClass(), "first", term1529);
        setField(term1509, term1509.getClass(), "last", term1529);
        setField(term1509, term1509.getClass(), "propListHead", null);
        setIntField(term1509, term1509.getClass(), "sourcePosition", 0);
        setField(term1509, term1509.getClass(), "jsType", null);
        setField(term1509, term1509.getClass(), "parent", null);
        setField(term1507, term1507.getClass(), "next", term1509);
        setField(term1507, term1507.getClass(), "first", term1513);
        setField(term1507, term1507.getClass(), "last", term1515);
        setField(term1507, term1507.getClass(), "propListHead", null);
        setIntField(term1507, term1507.getClass(), "sourcePosition", 0);
        setField(term1507, term1507.getClass(), "jsType", null);
        setField(term1507, term1507.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1480;
        args[1] = term1507;
        try {
            callMethod(klass, "assign", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


