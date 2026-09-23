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

public class NodeUtil_isLoopStructure_1113179246217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;
     Object term12314;

    public NodeUtil_isLoopStructure_1113179246217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1672 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1649, term1649.getClass(), "type", -1632929393);
        setIntField(term1651, term1651.getClass(), "type", -1511130237);
        setIntField(term1653, term1653.getClass(), "type", 0);
        setField(term1653, term1653.getClass(), "next", null);
        setField(term1653, term1653.getClass(), "first", null);
        setField(term1653, term1653.getClass(), "last", null);
        setField(term1653, term1653.getClass(), "propListHead", null);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 0);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "next", term1653);
        setIntField(term1656, term1656.getClass(), "type", 0);
        setField(term1656, term1656.getClass(), "next", null);
        setField(term1656, term1656.getClass(), "first", null);
        setField(term1656, term1656.getClass(), "last", null);
        setField(term1656, term1656.getClass(), "propListHead", null);
        setIntField(term1656, term1656.getClass(), "sourcePosition", 0);
        setField(term1656, term1656.getClass(), "jsType", null);
        setField(term1656, term1656.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "first", term1656);
        setIntField(term1659, term1659.getClass(), "type", 0);
        setField(term1659, term1659.getClass(), "next", null);
        setField(term1659, term1659.getClass(), "first", null);
        setField(term1659, term1659.getClass(), "last", null);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "last", term1659);
        setField(term1662, term1662.getClass(), "next", null);
        setIntField(term1662, term1662.getClass(), "type", 0);
        setIntField(term1662, term1662.getClass(), "intValue", 0);
        setField(term1662, term1662.getClass(), "objectValue", null);
        setField(term1651, term1651.getClass(), "propListHead", term1662);
        setIntField(term1651, term1651.getClass(), "sourcePosition", 1499735894);
        setField(term1651, term1651.getClass(), "jsType", null);
        setField(term1651, term1651.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "next", term1651);
        setIntField(term1666, term1666.getClass(), "type", 0);
        setField(term1666, term1666.getClass(), "next", null);
        setField(term1666, term1666.getClass(), "first", null);
        setField(term1666, term1666.getClass(), "last", null);
        setField(term1666, term1666.getClass(), "propListHead", null);
        setIntField(term1666, term1666.getClass(), "sourcePosition", 0);
        setField(term1666, term1666.getClass(), "jsType", null);
        setField(term1666, term1666.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "first", term1666);
        setIntField(term1669, term1669.getClass(), "type", 0);
        setField(term1669, term1669.getClass(), "next", null);
        setField(term1669, term1669.getClass(), "first", null);
        setField(term1669, term1669.getClass(), "last", null);
        setField(term1669, term1669.getClass(), "propListHead", null);
        setIntField(term1669, term1669.getClass(), "sourcePosition", 0);
        setField(term1669, term1669.getClass(), "jsType", null);
        setField(term1669, term1669.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "last", term1669);
        setField(term1672, term1672.getClass(), "next", null);
        setIntField(term1672, term1672.getClass(), "type", 0);
        setIntField(term1672, term1672.getClass(), "intValue", 0);
        setField(term1672, term1672.getClass(), "objectValue", null);
        setField(term1649, term1649.getClass(), "propListHead", term1672);
        setIntField(term1649, term1649.getClass(), "sourcePosition", 716486048);
        setField(term1649, term1649.getClass(), "jsType", null);
        setField(term1649, term1649.getClass(), "parent", null);
        term12314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12318 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12319 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12322 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12314, term12314.getClass(), "type", -1632929393);
        setIntField(term12315, term12315.getClass(), "type", -1511130237);
        setIntField(term12316, term12316.getClass(), "type", 0);
        setField(term12316, term12316.getClass(), "next", null);
        setField(term12316, term12316.getClass(), "first", null);
        setField(term12316, term12316.getClass(), "last", null);
        setField(term12316, term12316.getClass(), "propListHead", null);
        setIntField(term12316, term12316.getClass(), "sourcePosition", 0);
        setField(term12316, term12316.getClass(), "jsType", null);
        setField(term12316, term12316.getClass(), "parent", null);
        setField(term12315, term12315.getClass(), "next", term12316);
        setIntField(term12317, term12317.getClass(), "type", 0);
        setField(term12317, term12317.getClass(), "next", null);
        setField(term12317, term12317.getClass(), "first", null);
        setField(term12317, term12317.getClass(), "last", null);
        setField(term12317, term12317.getClass(), "propListHead", null);
        setIntField(term12317, term12317.getClass(), "sourcePosition", 0);
        setField(term12317, term12317.getClass(), "jsType", null);
        setField(term12317, term12317.getClass(), "parent", null);
        setField(term12315, term12315.getClass(), "first", term12317);
        setIntField(term12318, term12318.getClass(), "type", 0);
        setField(term12318, term12318.getClass(), "next", null);
        setField(term12318, term12318.getClass(), "first", null);
        setField(term12318, term12318.getClass(), "last", null);
        setField(term12318, term12318.getClass(), "propListHead", null);
        setIntField(term12318, term12318.getClass(), "sourcePosition", 0);
        setField(term12318, term12318.getClass(), "jsType", null);
        setField(term12318, term12318.getClass(), "parent", null);
        setField(term12315, term12315.getClass(), "last", term12318);
        setField(term12319, term12319.getClass(), "next", null);
        setIntField(term12319, term12319.getClass(), "type", 0);
        setIntField(term12319, term12319.getClass(), "intValue", 0);
        setField(term12319, term12319.getClass(), "objectValue", null);
        setField(term12315, term12315.getClass(), "propListHead", term12319);
        setIntField(term12315, term12315.getClass(), "sourcePosition", 1499735894);
        setField(term12315, term12315.getClass(), "jsType", null);
        setField(term12315, term12315.getClass(), "parent", null);
        setField(term12314, term12314.getClass(), "next", term12315);
        setIntField(term12320, term12320.getClass(), "type", 0);
        setField(term12320, term12320.getClass(), "next", null);
        setField(term12320, term12320.getClass(), "first", null);
        setField(term12320, term12320.getClass(), "last", null);
        setField(term12320, term12320.getClass(), "propListHead", null);
        setIntField(term12320, term12320.getClass(), "sourcePosition", 0);
        setField(term12320, term12320.getClass(), "jsType", null);
        setField(term12320, term12320.getClass(), "parent", null);
        setField(term12314, term12314.getClass(), "first", term12320);
        setIntField(term12321, term12321.getClass(), "type", 0);
        setField(term12321, term12321.getClass(), "next", null);
        setField(term12321, term12321.getClass(), "first", null);
        setField(term12321, term12321.getClass(), "last", null);
        setField(term12321, term12321.getClass(), "propListHead", null);
        setIntField(term12321, term12321.getClass(), "sourcePosition", 0);
        setField(term12321, term12321.getClass(), "jsType", null);
        setField(term12321, term12321.getClass(), "parent", null);
        setField(term12314, term12314.getClass(), "last", term12321);
        setField(term12322, term12322.getClass(), "next", null);
        setIntField(term12322, term12322.getClass(), "type", 0);
        setIntField(term12322, term12322.getClass(), "intValue", 0);
        setField(term12322, term12322.getClass(), "objectValue", null);
        setField(term12314, term12314.getClass(), "propListHead", term12322);
        setIntField(term12314, term12314.getClass(), "sourcePosition", 716486048);
        setField(term12314, term12314.getClass(), "jsType", null);
        setField(term12314, term12314.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1649;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1649, term12314));
        assertTrue(recursiveEquals(retValue, false));
    }

};


