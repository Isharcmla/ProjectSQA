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

public class IR_getelem_764717981110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426;
     Object term1453;

    public IR_getelem_764717981110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1426, term1426.getClass(), "type", -20614472);
        setIntField(term1428, term1428.getClass(), "type", 1126618861);
        setIntField(term1430, term1430.getClass(), "type", 947449400);
        setIntField(term1432, term1432.getClass(), "type", -763799087);
        setIntField(term1434, term1434.getClass(), "type", 1207142014);
        setField(term1434, term1434.getClass(), "next", null);
        setField(term1434, term1434.getClass(), "first", null);
        setField(term1434, term1434.getClass(), "last", null);
        setField(term1434, term1434.getClass(), "propListHead", null);
        setIntField(term1434, term1434.getClass(), "sourcePosition", 0);
        setField(term1434, term1434.getClass(), "jsType", null);
        setField(term1434, term1434.getClass(), "parent", null);
        setField(term1432, term1432.getClass(), "next", term1434);
        setIntField(term1437, term1437.getClass(), "type", -876426634);
        setField(term1437, term1437.getClass(), "next", null);
        setField(term1437, term1437.getClass(), "first", null);
        setField(term1437, term1437.getClass(), "last", term1434);
        setField(term1437, term1437.getClass(), "propListHead", null);
        setIntField(term1437, term1437.getClass(), "sourcePosition", 0);
        setField(term1437, term1437.getClass(), "jsType", null);
        setField(term1437, term1437.getClass(), "parent", null);
        setField(term1432, term1432.getClass(), "first", term1437);
        setField(term1432, term1432.getClass(), "last", term1430);
        setField(term1432, term1432.getClass(), "propListHead", null);
        setIntField(term1432, term1432.getClass(), "sourcePosition", 0);
        setField(term1432, term1432.getClass(), "jsType", null);
        setField(term1432, term1432.getClass(), "parent", null);
        setField(term1430, term1430.getClass(), "next", term1432);
        setField(term1430, term1430.getClass(), "first", term1434);
        setIntField(term1441, term1441.getClass(), "type", 330043745);
        setIntField(term1443, term1443.getClass(), "type", -509349195);
        setField(term1443, term1443.getClass(), "next", null);
        setField(term1443, term1443.getClass(), "first", term1437);
        setField(term1443, term1443.getClass(), "last", term1432);
        setField(term1443, term1443.getClass(), "propListHead", null);
        setIntField(term1443, term1443.getClass(), "sourcePosition", 0);
        setField(term1443, term1443.getClass(), "jsType", null);
        setField(term1443, term1443.getClass(), "parent", null);
        setField(term1441, term1441.getClass(), "next", term1443);
        setField(term1441, term1441.getClass(), "first", term1428);
        setField(term1441, term1441.getClass(), "last", term1428);
        setField(term1441, term1441.getClass(), "propListHead", null);
        setIntField(term1441, term1441.getClass(), "sourcePosition", 0);
        setField(term1441, term1441.getClass(), "jsType", null);
        setField(term1441, term1441.getClass(), "parent", null);
        setField(term1430, term1430.getClass(), "last", term1441);
        setField(term1430, term1430.getClass(), "propListHead", null);
        setIntField(term1430, term1430.getClass(), "sourcePosition", 0);
        setField(term1430, term1430.getClass(), "jsType", null);
        setField(term1430, term1430.getClass(), "parent", null);
        setField(term1428, term1428.getClass(), "next", term1430);
        setIntField(term1448, term1448.getClass(), "type", -1639041228);
        setField(term1448, term1448.getClass(), "next", term1441);
        setField(term1448, term1448.getClass(), "first", term1443);
        setField(term1448, term1448.getClass(), "last", term1426);
        setField(term1448, term1448.getClass(), "propListHead", null);
        setIntField(term1448, term1448.getClass(), "sourcePosition", 0);
        setField(term1448, term1448.getClass(), "jsType", null);
        setField(term1448, term1448.getClass(), "parent", null);
        setField(term1428, term1428.getClass(), "first", term1448);
        setField(term1428, term1428.getClass(), "last", term1448);
        setField(term1428, term1428.getClass(), "propListHead", null);
        setIntField(term1428, term1428.getClass(), "sourcePosition", 0);
        setField(term1428, term1428.getClass(), "jsType", null);
        setField(term1428, term1428.getClass(), "parent", null);
        setField(term1426, term1426.getClass(), "next", term1428);
        setField(term1426, term1426.getClass(), "first", term1432);
        setField(term1426, term1426.getClass(), "last", term1434);
        setField(term1426, term1426.getClass(), "propListHead", null);
        setIntField(term1426, term1426.getClass(), "sourcePosition", 0);
        setField(term1426, term1426.getClass(), "jsType", null);
        setField(term1426, term1426.getClass(), "parent", null);
        term1453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1453, term1453.getClass(), "type", 2027686272);
        setIntField(term1455, term1455.getClass(), "type", -1494356104);
        setIntField(term1457, term1457.getClass(), "type", -695279311);
        setIntField(term1459, term1459.getClass(), "type", 114279242);
        setIntField(term1461, term1461.getClass(), "type", 990883365);
        setField(term1461, term1461.getClass(), "next", null);
        setField(term1461, term1461.getClass(), "first", null);
        setField(term1461, term1461.getClass(), "last", null);
        setField(term1461, term1461.getClass(), "propListHead", null);
        setIntField(term1461, term1461.getClass(), "sourcePosition", 0);
        setField(term1461, term1461.getClass(), "jsType", null);
        setField(term1461, term1461.getClass(), "parent", null);
        setField(term1459, term1459.getClass(), "next", term1461);
        setIntField(term1464, term1464.getClass(), "type", 633598642);
        setField(term1464, term1464.getClass(), "next", null);
        setField(term1464, term1464.getClass(), "first", null);
        setField(term1464, term1464.getClass(), "last", term1461);
        setField(term1464, term1464.getClass(), "propListHead", null);
        setIntField(term1464, term1464.getClass(), "sourcePosition", 0);
        setField(term1464, term1464.getClass(), "jsType", null);
        setField(term1464, term1464.getClass(), "parent", null);
        setField(term1459, term1459.getClass(), "first", term1464);
        setField(term1459, term1459.getClass(), "last", term1457);
        setField(term1459, term1459.getClass(), "propListHead", null);
        setIntField(term1459, term1459.getClass(), "sourcePosition", 0);
        setField(term1459, term1459.getClass(), "jsType", null);
        setField(term1459, term1459.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "next", term1459);
        setField(term1457, term1457.getClass(), "first", term1461);
        setIntField(term1468, term1468.getClass(), "type", -1114668574);
        setIntField(term1470, term1470.getClass(), "type", 514511037);
        setField(term1470, term1470.getClass(), "next", null);
        setField(term1470, term1470.getClass(), "first", term1464);
        setField(term1470, term1470.getClass(), "last", term1459);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1468, term1468.getClass(), "next", term1470);
        setField(term1468, term1468.getClass(), "first", term1455);
        setField(term1468, term1468.getClass(), "last", term1455);
        setField(term1468, term1468.getClass(), "propListHead", null);
        setIntField(term1468, term1468.getClass(), "sourcePosition", 0);
        setField(term1468, term1468.getClass(), "jsType", null);
        setField(term1468, term1468.getClass(), "parent", null);
        setField(term1457, term1457.getClass(), "last", term1468);
        setField(term1457, term1457.getClass(), "propListHead", null);
        setIntField(term1457, term1457.getClass(), "sourcePosition", 0);
        setField(term1457, term1457.getClass(), "jsType", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "next", term1457);
        setIntField(term1475, term1475.getClass(), "type", 1713573821);
        setField(term1475, term1475.getClass(), "next", term1468);
        setField(term1475, term1475.getClass(), "first", term1470);
        setField(term1475, term1475.getClass(), "last", term1453);
        setField(term1475, term1475.getClass(), "propListHead", null);
        setIntField(term1475, term1475.getClass(), "sourcePosition", 0);
        setField(term1475, term1475.getClass(), "jsType", null);
        setField(term1475, term1475.getClass(), "parent", null);
        setField(term1455, term1455.getClass(), "first", term1475);
        setField(term1455, term1455.getClass(), "last", term1475);
        setField(term1455, term1455.getClass(), "propListHead", null);
        setIntField(term1455, term1455.getClass(), "sourcePosition", 0);
        setField(term1455, term1455.getClass(), "jsType", null);
        setField(term1455, term1455.getClass(), "parent", null);
        setField(term1453, term1453.getClass(), "next", term1455);
        setField(term1453, term1453.getClass(), "first", term1459);
        setField(term1453, term1453.getClass(), "last", term1461);
        setField(term1453, term1453.getClass(), "propListHead", null);
        setIntField(term1453, term1453.getClass(), "sourcePosition", 0);
        setField(term1453, term1453.getClass(), "jsType", null);
        setField(term1453, term1453.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1426;
        args[1] = term1453;
        try {
            callMethod(klass, "getelem", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


