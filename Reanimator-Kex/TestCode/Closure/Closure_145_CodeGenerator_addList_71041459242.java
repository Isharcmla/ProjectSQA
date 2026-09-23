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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_71041459242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650;
     Object term1651;
     Object term1678;

    public CodeGenerator_addList_71041459242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1650 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1650, term1650.getClass(), "cc", null);
        setField(term1650, term1650.getClass(), "outputCharsetEncoder", null);
        term1651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1664 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1674 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1651, term1651.getClass(), "type", 683666002);
        setIntField(term1653, term1653.getClass(), "type", -663691365);
        setIntField(term1655, term1655.getClass(), "type", 0);
        setField(term1655, term1655.getClass(), "next", null);
        setField(term1655, term1655.getClass(), "first", null);
        setField(term1655, term1655.getClass(), "last", null);
        setField(term1655, term1655.getClass(), "propListHead", null);
        setIntField(term1655, term1655.getClass(), "sourcePosition", 0);
        setField(term1655, term1655.getClass(), "jsType", null);
        setField(term1655, term1655.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "next", term1655);
        setIntField(term1658, term1658.getClass(), "type", 0);
        setField(term1658, term1658.getClass(), "next", null);
        setField(term1658, term1658.getClass(), "first", null);
        setField(term1658, term1658.getClass(), "last", null);
        setField(term1658, term1658.getClass(), "propListHead", null);
        setIntField(term1658, term1658.getClass(), "sourcePosition", 0);
        setField(term1658, term1658.getClass(), "jsType", null);
        setField(term1658, term1658.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "first", term1658);
        setIntField(term1661, term1661.getClass(), "type", 0);
        setField(term1661, term1661.getClass(), "next", null);
        setField(term1661, term1661.getClass(), "first", null);
        setField(term1661, term1661.getClass(), "last", null);
        setField(term1661, term1661.getClass(), "propListHead", null);
        setIntField(term1661, term1661.getClass(), "sourcePosition", 0);
        setField(term1661, term1661.getClass(), "jsType", null);
        setField(term1661, term1661.getClass(), "parent", null);
        setField(term1653, term1653.getClass(), "last", term1661);
        setField(term1664, term1664.getClass(), "next", null);
        setIntField(term1664, term1664.getClass(), "type", 0);
        setIntField(term1664, term1664.getClass(), "intValue", 0);
        setField(term1664, term1664.getClass(), "objectValue", null);
        setField(term1653, term1653.getClass(), "propListHead", term1664);
        setIntField(term1653, term1653.getClass(), "sourcePosition", -1476117762);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "next", term1653);
        setIntField(term1668, term1668.getClass(), "type", 0);
        setField(term1668, term1668.getClass(), "next", null);
        setField(term1668, term1668.getClass(), "first", null);
        setField(term1668, term1668.getClass(), "last", null);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "first", term1668);
        setIntField(term1671, term1671.getClass(), "type", 0);
        setField(term1671, term1671.getClass(), "next", null);
        setField(term1671, term1671.getClass(), "first", null);
        setField(term1671, term1671.getClass(), "last", null);
        setField(term1671, term1671.getClass(), "propListHead", null);
        setIntField(term1671, term1671.getClass(), "sourcePosition", 0);
        setField(term1671, term1671.getClass(), "jsType", null);
        setField(term1671, term1671.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "last", term1671);
        setField(term1674, term1674.getClass(), "next", null);
        setIntField(term1674, term1674.getClass(), "type", 0);
        setIntField(term1674, term1674.getClass(), "intValue", 0);
        setField(term1674, term1674.getClass(), "objectValue", null);
        setField(term1651, term1651.getClass(), "propListHead", term1674);
        setIntField(term1651, term1651.getClass(), "sourcePosition", -341962980);
        setField(term1651, term1651.getClass(), "jsType", null);
        setField(term1651, term1651.getClass(), "parent", null);
        term1678 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1651;
        args[1] = term1678;
        try {
            callMethod(klass, "addList", argTypes, term1650, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


