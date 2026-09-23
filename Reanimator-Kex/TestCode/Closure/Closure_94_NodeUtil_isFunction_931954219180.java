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

public class NodeUtil_isFunction_931954219180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;
     Object term11277;

    public NodeUtil_isFunction_931954219180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1693 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1680, term1680.getClass(), "type", 852806940);
        setIntField(term1682, term1682.getClass(), "type", -64893740);
        setIntField(term1684, term1684.getClass(), "type", 0);
        setField(term1684, term1684.getClass(), "next", null);
        setField(term1684, term1684.getClass(), "first", null);
        setField(term1684, term1684.getClass(), "last", null);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "next", term1684);
        setIntField(term1687, term1687.getClass(), "type", 0);
        setField(term1687, term1687.getClass(), "next", null);
        setField(term1687, term1687.getClass(), "first", null);
        setField(term1687, term1687.getClass(), "last", null);
        setField(term1687, term1687.getClass(), "propListHead", null);
        setIntField(term1687, term1687.getClass(), "sourcePosition", 0);
        setField(term1687, term1687.getClass(), "jsType", null);
        setField(term1687, term1687.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "first", term1687);
        setIntField(term1690, term1690.getClass(), "type", 0);
        setField(term1690, term1690.getClass(), "next", null);
        setField(term1690, term1690.getClass(), "first", null);
        setField(term1690, term1690.getClass(), "last", null);
        setField(term1690, term1690.getClass(), "propListHead", null);
        setIntField(term1690, term1690.getClass(), "sourcePosition", 0);
        setField(term1690, term1690.getClass(), "jsType", null);
        setField(term1690, term1690.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "last", term1690);
        setField(term1693, term1693.getClass(), "next", null);
        setIntField(term1693, term1693.getClass(), "type", 0);
        setIntField(term1693, term1693.getClass(), "intValue", 0);
        setField(term1693, term1693.getClass(), "objectValue", null);
        setField(term1682, term1682.getClass(), "propListHead", term1693);
        setIntField(term1682, term1682.getClass(), "sourcePosition", -83178716);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "next", term1682);
        setIntField(term1697, term1697.getClass(), "type", 0);
        setField(term1697, term1697.getClass(), "next", null);
        setField(term1697, term1697.getClass(), "first", null);
        setField(term1697, term1697.getClass(), "last", null);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "first", term1697);
        setIntField(term1700, term1700.getClass(), "type", 0);
        setField(term1700, term1700.getClass(), "next", null);
        setField(term1700, term1700.getClass(), "first", null);
        setField(term1700, term1700.getClass(), "last", null);
        setField(term1700, term1700.getClass(), "propListHead", null);
        setIntField(term1700, term1700.getClass(), "sourcePosition", 0);
        setField(term1700, term1700.getClass(), "jsType", null);
        setField(term1700, term1700.getClass(), "parent", null);
        setField(term1680, term1680.getClass(), "last", term1700);
        setField(term1703, term1703.getClass(), "next", null);
        setIntField(term1703, term1703.getClass(), "type", 0);
        setIntField(term1703, term1703.getClass(), "intValue", 0);
        setField(term1703, term1703.getClass(), "objectValue", null);
        setField(term1680, term1680.getClass(), "propListHead", term1703);
        setIntField(term1680, term1680.getClass(), "sourcePosition", -1292704466);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        term11277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11282 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11285 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11277, term11277.getClass(), "type", 852806940);
        setIntField(term11278, term11278.getClass(), "type", -64893740);
        setIntField(term11279, term11279.getClass(), "type", 0);
        setField(term11279, term11279.getClass(), "next", null);
        setField(term11279, term11279.getClass(), "first", null);
        setField(term11279, term11279.getClass(), "last", null);
        setField(term11279, term11279.getClass(), "propListHead", null);
        setIntField(term11279, term11279.getClass(), "sourcePosition", 0);
        setField(term11279, term11279.getClass(), "jsType", null);
        setField(term11279, term11279.getClass(), "parent", null);
        setField(term11278, term11278.getClass(), "next", term11279);
        setIntField(term11280, term11280.getClass(), "type", 0);
        setField(term11280, term11280.getClass(), "next", null);
        setField(term11280, term11280.getClass(), "first", null);
        setField(term11280, term11280.getClass(), "last", null);
        setField(term11280, term11280.getClass(), "propListHead", null);
        setIntField(term11280, term11280.getClass(), "sourcePosition", 0);
        setField(term11280, term11280.getClass(), "jsType", null);
        setField(term11280, term11280.getClass(), "parent", null);
        setField(term11278, term11278.getClass(), "first", term11280);
        setIntField(term11281, term11281.getClass(), "type", 0);
        setField(term11281, term11281.getClass(), "next", null);
        setField(term11281, term11281.getClass(), "first", null);
        setField(term11281, term11281.getClass(), "last", null);
        setField(term11281, term11281.getClass(), "propListHead", null);
        setIntField(term11281, term11281.getClass(), "sourcePosition", 0);
        setField(term11281, term11281.getClass(), "jsType", null);
        setField(term11281, term11281.getClass(), "parent", null);
        setField(term11278, term11278.getClass(), "last", term11281);
        setField(term11282, term11282.getClass(), "next", null);
        setIntField(term11282, term11282.getClass(), "type", 0);
        setIntField(term11282, term11282.getClass(), "intValue", 0);
        setField(term11282, term11282.getClass(), "objectValue", null);
        setField(term11278, term11278.getClass(), "propListHead", term11282);
        setIntField(term11278, term11278.getClass(), "sourcePosition", -83178716);
        setField(term11278, term11278.getClass(), "jsType", null);
        setField(term11278, term11278.getClass(), "parent", null);
        setField(term11277, term11277.getClass(), "next", term11278);
        setIntField(term11283, term11283.getClass(), "type", 0);
        setField(term11283, term11283.getClass(), "next", null);
        setField(term11283, term11283.getClass(), "first", null);
        setField(term11283, term11283.getClass(), "last", null);
        setField(term11283, term11283.getClass(), "propListHead", null);
        setIntField(term11283, term11283.getClass(), "sourcePosition", 0);
        setField(term11283, term11283.getClass(), "jsType", null);
        setField(term11283, term11283.getClass(), "parent", null);
        setField(term11277, term11277.getClass(), "first", term11283);
        setIntField(term11284, term11284.getClass(), "type", 0);
        setField(term11284, term11284.getClass(), "next", null);
        setField(term11284, term11284.getClass(), "first", null);
        setField(term11284, term11284.getClass(), "last", null);
        setField(term11284, term11284.getClass(), "propListHead", null);
        setIntField(term11284, term11284.getClass(), "sourcePosition", 0);
        setField(term11284, term11284.getClass(), "jsType", null);
        setField(term11284, term11284.getClass(), "parent", null);
        setField(term11277, term11277.getClass(), "last", term11284);
        setField(term11285, term11285.getClass(), "next", null);
        setIntField(term11285, term11285.getClass(), "type", 0);
        setIntField(term11285, term11285.getClass(), "intValue", 0);
        setField(term11285, term11285.getClass(), "objectValue", null);
        setField(term11277, term11277.getClass(), "propListHead", term11285);
        setIntField(term11277, term11277.getClass(), "sourcePosition", -1292704466);
        setField(term11277, term11277.getClass(), "jsType", null);
        setField(term11277, term11277.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1680;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1680, term11277));
        assertTrue(recursiveEquals(retValue, false));
    }

};


