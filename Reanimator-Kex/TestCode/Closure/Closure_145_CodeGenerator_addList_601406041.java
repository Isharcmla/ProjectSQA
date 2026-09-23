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

public class CodeGenerator_addList_601406041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1622;
     Object term1623;

    public CodeGenerator_addList_601406041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1622 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1622, term1622.getClass(), "cc", null);
        setField(term1622, term1622.getClass(), "outputCharsetEncoder", null);
        term1623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1636 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1646 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1623, term1623.getClass(), "type", -1772434990);
        setIntField(term1625, term1625.getClass(), "type", 941650513);
        setIntField(term1627, term1627.getClass(), "type", 0);
        setField(term1627, term1627.getClass(), "next", null);
        setField(term1627, term1627.getClass(), "first", null);
        setField(term1627, term1627.getClass(), "last", null);
        setField(term1627, term1627.getClass(), "propListHead", null);
        setIntField(term1627, term1627.getClass(), "sourcePosition", 0);
        setField(term1627, term1627.getClass(), "jsType", null);
        setField(term1627, term1627.getClass(), "parent", null);
        setField(term1625, term1625.getClass(), "next", term1627);
        setIntField(term1630, term1630.getClass(), "type", 0);
        setField(term1630, term1630.getClass(), "next", null);
        setField(term1630, term1630.getClass(), "first", null);
        setField(term1630, term1630.getClass(), "last", null);
        setField(term1630, term1630.getClass(), "propListHead", null);
        setIntField(term1630, term1630.getClass(), "sourcePosition", 0);
        setField(term1630, term1630.getClass(), "jsType", null);
        setField(term1630, term1630.getClass(), "parent", null);
        setField(term1625, term1625.getClass(), "first", term1630);
        setIntField(term1633, term1633.getClass(), "type", 0);
        setField(term1633, term1633.getClass(), "next", null);
        setField(term1633, term1633.getClass(), "first", null);
        setField(term1633, term1633.getClass(), "last", null);
        setField(term1633, term1633.getClass(), "propListHead", null);
        setIntField(term1633, term1633.getClass(), "sourcePosition", 0);
        setField(term1633, term1633.getClass(), "jsType", null);
        setField(term1633, term1633.getClass(), "parent", null);
        setField(term1625, term1625.getClass(), "last", term1633);
        setField(term1636, term1636.getClass(), "next", null);
        setIntField(term1636, term1636.getClass(), "type", 0);
        setIntField(term1636, term1636.getClass(), "intValue", 0);
        setField(term1636, term1636.getClass(), "objectValue", null);
        setField(term1625, term1625.getClass(), "propListHead", term1636);
        setIntField(term1625, term1625.getClass(), "sourcePosition", -1263114719);
        setField(term1625, term1625.getClass(), "jsType", null);
        setField(term1625, term1625.getClass(), "parent", null);
        setField(term1623, term1623.getClass(), "next", term1625);
        setIntField(term1640, term1640.getClass(), "type", 0);
        setField(term1640, term1640.getClass(), "next", null);
        setField(term1640, term1640.getClass(), "first", null);
        setField(term1640, term1640.getClass(), "last", null);
        setField(term1640, term1640.getClass(), "propListHead", null);
        setIntField(term1640, term1640.getClass(), "sourcePosition", 0);
        setField(term1640, term1640.getClass(), "jsType", null);
        setField(term1640, term1640.getClass(), "parent", null);
        setField(term1623, term1623.getClass(), "first", term1640);
        setIntField(term1643, term1643.getClass(), "type", 0);
        setField(term1643, term1643.getClass(), "next", null);
        setField(term1643, term1643.getClass(), "first", null);
        setField(term1643, term1643.getClass(), "last", null);
        setField(term1643, term1643.getClass(), "propListHead", null);
        setIntField(term1643, term1643.getClass(), "sourcePosition", 0);
        setField(term1643, term1643.getClass(), "jsType", null);
        setField(term1643, term1643.getClass(), "parent", null);
        setField(term1623, term1623.getClass(), "last", term1643);
        setField(term1646, term1646.getClass(), "next", null);
        setIntField(term1646, term1646.getClass(), "type", 0);
        setIntField(term1646, term1646.getClass(), "intValue", 0);
        setField(term1646, term1646.getClass(), "objectValue", null);
        setField(term1623, term1623.getClass(), "propListHead", term1646);
        setIntField(term1623, term1623.getClass(), "sourcePosition", -894662986);
        setField(term1623, term1623.getClass(), "jsType", null);
        setField(term1623, term1623.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1623;
        try {
            callMethod(klass, "addList", argTypes, term1622, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


