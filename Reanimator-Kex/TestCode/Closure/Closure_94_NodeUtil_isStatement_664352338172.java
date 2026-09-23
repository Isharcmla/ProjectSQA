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
import java.lang.Object;

public class NodeUtil_isStatement_664352338172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410;

    public NodeUtil_isStatement_664352338172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1423 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1433 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1410, term1410.getClass(), "type", 1470349147);
        setIntField(term1412, term1412.getClass(), "type", -728760750);
        setIntField(term1414, term1414.getClass(), "type", 0);
        setField(term1414, term1414.getClass(), "next", null);
        setField(term1414, term1414.getClass(), "first", null);
        setField(term1414, term1414.getClass(), "last", null);
        setField(term1414, term1414.getClass(), "propListHead", null);
        setIntField(term1414, term1414.getClass(), "sourcePosition", 0);
        setField(term1414, term1414.getClass(), "jsType", null);
        setField(term1414, term1414.getClass(), "parent", null);
        setField(term1412, term1412.getClass(), "next", term1414);
        setIntField(term1417, term1417.getClass(), "type", 0);
        setField(term1417, term1417.getClass(), "next", null);
        setField(term1417, term1417.getClass(), "first", null);
        setField(term1417, term1417.getClass(), "last", null);
        setField(term1417, term1417.getClass(), "propListHead", null);
        setIntField(term1417, term1417.getClass(), "sourcePosition", 0);
        setField(term1417, term1417.getClass(), "jsType", null);
        setField(term1417, term1417.getClass(), "parent", null);
        setField(term1412, term1412.getClass(), "first", term1417);
        setIntField(term1420, term1420.getClass(), "type", 0);
        setField(term1420, term1420.getClass(), "next", null);
        setField(term1420, term1420.getClass(), "first", null);
        setField(term1420, term1420.getClass(), "last", null);
        setField(term1420, term1420.getClass(), "propListHead", null);
        setIntField(term1420, term1420.getClass(), "sourcePosition", 0);
        setField(term1420, term1420.getClass(), "jsType", null);
        setField(term1420, term1420.getClass(), "parent", null);
        setField(term1412, term1412.getClass(), "last", term1420);
        setField(term1423, term1423.getClass(), "next", null);
        setIntField(term1423, term1423.getClass(), "type", 0);
        setIntField(term1423, term1423.getClass(), "intValue", 0);
        setField(term1423, term1423.getClass(), "objectValue", null);
        setField(term1412, term1412.getClass(), "propListHead", term1423);
        setIntField(term1412, term1412.getClass(), "sourcePosition", -885788574);
        setField(term1412, term1412.getClass(), "jsType", null);
        setField(term1412, term1412.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "next", term1412);
        setIntField(term1427, term1427.getClass(), "type", 0);
        setField(term1427, term1427.getClass(), "next", null);
        setField(term1427, term1427.getClass(), "first", null);
        setField(term1427, term1427.getClass(), "last", null);
        setField(term1427, term1427.getClass(), "propListHead", null);
        setIntField(term1427, term1427.getClass(), "sourcePosition", 0);
        setField(term1427, term1427.getClass(), "jsType", null);
        setField(term1427, term1427.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "first", term1427);
        setIntField(term1430, term1430.getClass(), "type", 0);
        setField(term1430, term1430.getClass(), "next", null);
        setField(term1430, term1430.getClass(), "first", null);
        setField(term1430, term1430.getClass(), "last", null);
        setField(term1430, term1430.getClass(), "propListHead", null);
        setIntField(term1430, term1430.getClass(), "sourcePosition", 0);
        setField(term1430, term1430.getClass(), "jsType", null);
        setField(term1430, term1430.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "last", term1430);
        setField(term1433, term1433.getClass(), "next", null);
        setIntField(term1433, term1433.getClass(), "type", 0);
        setIntField(term1433, term1433.getClass(), "intValue", 0);
        setField(term1433, term1433.getClass(), "objectValue", null);
        setField(term1410, term1410.getClass(), "propListHead", term1433);
        setIntField(term1410, term1410.getClass(), "sourcePosition", -865722613);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1410;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


