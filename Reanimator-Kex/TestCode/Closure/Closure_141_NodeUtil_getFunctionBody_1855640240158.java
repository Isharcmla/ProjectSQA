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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionBody_1855640240158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1462;

    public NodeUtil_getFunctionBody_1855640240158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1475 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1485 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1462, term1462.getClass(), "type", -348612876);
        setIntField(term1464, term1464.getClass(), "type", 718742281);
        setIntField(term1466, term1466.getClass(), "type", 0);
        setField(term1466, term1466.getClass(), "next", null);
        setField(term1466, term1466.getClass(), "first", null);
        setField(term1466, term1466.getClass(), "last", null);
        setField(term1466, term1466.getClass(), "propListHead", null);
        setIntField(term1466, term1466.getClass(), "sourcePosition", 0);
        setField(term1466, term1466.getClass(), "jsType", null);
        setField(term1466, term1466.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "next", term1466);
        setIntField(term1469, term1469.getClass(), "type", 0);
        setField(term1469, term1469.getClass(), "next", null);
        setField(term1469, term1469.getClass(), "first", null);
        setField(term1469, term1469.getClass(), "last", null);
        setField(term1469, term1469.getClass(), "propListHead", null);
        setIntField(term1469, term1469.getClass(), "sourcePosition", 0);
        setField(term1469, term1469.getClass(), "jsType", null);
        setField(term1469, term1469.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "first", term1469);
        setIntField(term1472, term1472.getClass(), "type", 0);
        setField(term1472, term1472.getClass(), "next", null);
        setField(term1472, term1472.getClass(), "first", null);
        setField(term1472, term1472.getClass(), "last", null);
        setField(term1472, term1472.getClass(), "propListHead", null);
        setIntField(term1472, term1472.getClass(), "sourcePosition", 0);
        setField(term1472, term1472.getClass(), "jsType", null);
        setField(term1472, term1472.getClass(), "parent", null);
        setField(term1464, term1464.getClass(), "last", term1472);
        setField(term1475, term1475.getClass(), "next", null);
        setIntField(term1475, term1475.getClass(), "type", 0);
        setIntField(term1475, term1475.getClass(), "intValue", 0);
        setField(term1475, term1475.getClass(), "objectValue", null);
        setField(term1464, term1464.getClass(), "propListHead", term1475);
        setIntField(term1464, term1464.getClass(), "sourcePosition", 777492093);
        setField(term1464, term1464.getClass(), "jsType", null);
        setField(term1464, term1464.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "next", term1464);
        setIntField(term1479, term1479.getClass(), "type", 0);
        setField(term1479, term1479.getClass(), "next", null);
        setField(term1479, term1479.getClass(), "first", null);
        setField(term1479, term1479.getClass(), "last", null);
        setField(term1479, term1479.getClass(), "propListHead", null);
        setIntField(term1479, term1479.getClass(), "sourcePosition", 0);
        setField(term1479, term1479.getClass(), "jsType", null);
        setField(term1479, term1479.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "first", term1479);
        setIntField(term1482, term1482.getClass(), "type", 0);
        setField(term1482, term1482.getClass(), "next", null);
        setField(term1482, term1482.getClass(), "first", null);
        setField(term1482, term1482.getClass(), "last", null);
        setField(term1482, term1482.getClass(), "propListHead", null);
        setIntField(term1482, term1482.getClass(), "sourcePosition", 0);
        setField(term1482, term1482.getClass(), "jsType", null);
        setField(term1482, term1482.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "last", term1482);
        setField(term1485, term1485.getClass(), "next", null);
        setIntField(term1485, term1485.getClass(), "type", 0);
        setIntField(term1485, term1485.getClass(), "intValue", 0);
        setField(term1485, term1485.getClass(), "objectValue", null);
        setField(term1462, term1462.getClass(), "propListHead", term1485);
        setIntField(term1462, term1462.getClass(), "sourcePosition", 1414025609);
        setField(term1462, term1462.getClass(), "jsType", null);
        setField(term1462, term1462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1462;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


