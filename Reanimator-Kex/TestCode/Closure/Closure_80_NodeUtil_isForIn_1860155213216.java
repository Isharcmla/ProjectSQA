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

public class NodeUtil_isForIn_1860155213216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1622;
     Object term12275;

    public NodeUtil_isForIn_1860155213216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1635 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1645 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1622, term1622.getClass(), "type", -2129828854);
        setIntField(term1624, term1624.getClass(), "type", -511077684);
        setIntField(term1626, term1626.getClass(), "type", 0);
        setField(term1626, term1626.getClass(), "next", null);
        setField(term1626, term1626.getClass(), "first", null);
        setField(term1626, term1626.getClass(), "last", null);
        setField(term1626, term1626.getClass(), "propListHead", null);
        setIntField(term1626, term1626.getClass(), "sourcePosition", 0);
        setField(term1626, term1626.getClass(), "jsType", null);
        setField(term1626, term1626.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "next", term1626);
        setIntField(term1629, term1629.getClass(), "type", 0);
        setField(term1629, term1629.getClass(), "next", null);
        setField(term1629, term1629.getClass(), "first", null);
        setField(term1629, term1629.getClass(), "last", null);
        setField(term1629, term1629.getClass(), "propListHead", null);
        setIntField(term1629, term1629.getClass(), "sourcePosition", 0);
        setField(term1629, term1629.getClass(), "jsType", null);
        setField(term1629, term1629.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "first", term1629);
        setIntField(term1632, term1632.getClass(), "type", 0);
        setField(term1632, term1632.getClass(), "next", null);
        setField(term1632, term1632.getClass(), "first", null);
        setField(term1632, term1632.getClass(), "last", null);
        setField(term1632, term1632.getClass(), "propListHead", null);
        setIntField(term1632, term1632.getClass(), "sourcePosition", 0);
        setField(term1632, term1632.getClass(), "jsType", null);
        setField(term1632, term1632.getClass(), "parent", null);
        setField(term1624, term1624.getClass(), "last", term1632);
        setField(term1635, term1635.getClass(), "next", null);
        setIntField(term1635, term1635.getClass(), "type", 0);
        setIntField(term1635, term1635.getClass(), "intValue", 0);
        setField(term1635, term1635.getClass(), "objectValue", null);
        setField(term1624, term1624.getClass(), "propListHead", term1635);
        setIntField(term1624, term1624.getClass(), "sourcePosition", 924127883);
        setField(term1624, term1624.getClass(), "jsType", null);
        setField(term1624, term1624.getClass(), "parent", null);
        setField(term1622, term1622.getClass(), "next", term1624);
        setIntField(term1639, term1639.getClass(), "type", 0);
        setField(term1639, term1639.getClass(), "next", null);
        setField(term1639, term1639.getClass(), "first", null);
        setField(term1639, term1639.getClass(), "last", null);
        setField(term1639, term1639.getClass(), "propListHead", null);
        setIntField(term1639, term1639.getClass(), "sourcePosition", 0);
        setField(term1639, term1639.getClass(), "jsType", null);
        setField(term1639, term1639.getClass(), "parent", null);
        setField(term1622, term1622.getClass(), "first", term1639);
        setIntField(term1642, term1642.getClass(), "type", 0);
        setField(term1642, term1642.getClass(), "next", null);
        setField(term1642, term1642.getClass(), "first", null);
        setField(term1642, term1642.getClass(), "last", null);
        setField(term1642, term1642.getClass(), "propListHead", null);
        setIntField(term1642, term1642.getClass(), "sourcePosition", 0);
        setField(term1642, term1642.getClass(), "jsType", null);
        setField(term1642, term1642.getClass(), "parent", null);
        setField(term1622, term1622.getClass(), "last", term1642);
        setField(term1645, term1645.getClass(), "next", null);
        setIntField(term1645, term1645.getClass(), "type", 0);
        setIntField(term1645, term1645.getClass(), "intValue", 0);
        setField(term1645, term1645.getClass(), "objectValue", null);
        setField(term1622, term1622.getClass(), "propListHead", term1645);
        setIntField(term1622, term1622.getClass(), "sourcePosition", -751079123);
        setField(term1622, term1622.getClass(), "jsType", null);
        setField(term1622, term1622.getClass(), "parent", null);
        term12275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12280 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12283 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12275, term12275.getClass(), "type", -2129828854);
        setIntField(term12276, term12276.getClass(), "type", -511077684);
        setIntField(term12277, term12277.getClass(), "type", 0);
        setField(term12277, term12277.getClass(), "next", null);
        setField(term12277, term12277.getClass(), "first", null);
        setField(term12277, term12277.getClass(), "last", null);
        setField(term12277, term12277.getClass(), "propListHead", null);
        setIntField(term12277, term12277.getClass(), "sourcePosition", 0);
        setField(term12277, term12277.getClass(), "jsType", null);
        setField(term12277, term12277.getClass(), "parent", null);
        setField(term12276, term12276.getClass(), "next", term12277);
        setIntField(term12278, term12278.getClass(), "type", 0);
        setField(term12278, term12278.getClass(), "next", null);
        setField(term12278, term12278.getClass(), "first", null);
        setField(term12278, term12278.getClass(), "last", null);
        setField(term12278, term12278.getClass(), "propListHead", null);
        setIntField(term12278, term12278.getClass(), "sourcePosition", 0);
        setField(term12278, term12278.getClass(), "jsType", null);
        setField(term12278, term12278.getClass(), "parent", null);
        setField(term12276, term12276.getClass(), "first", term12278);
        setIntField(term12279, term12279.getClass(), "type", 0);
        setField(term12279, term12279.getClass(), "next", null);
        setField(term12279, term12279.getClass(), "first", null);
        setField(term12279, term12279.getClass(), "last", null);
        setField(term12279, term12279.getClass(), "propListHead", null);
        setIntField(term12279, term12279.getClass(), "sourcePosition", 0);
        setField(term12279, term12279.getClass(), "jsType", null);
        setField(term12279, term12279.getClass(), "parent", null);
        setField(term12276, term12276.getClass(), "last", term12279);
        setField(term12280, term12280.getClass(), "next", null);
        setIntField(term12280, term12280.getClass(), "type", 0);
        setIntField(term12280, term12280.getClass(), "intValue", 0);
        setField(term12280, term12280.getClass(), "objectValue", null);
        setField(term12276, term12276.getClass(), "propListHead", term12280);
        setIntField(term12276, term12276.getClass(), "sourcePosition", 924127883);
        setField(term12276, term12276.getClass(), "jsType", null);
        setField(term12276, term12276.getClass(), "parent", null);
        setField(term12275, term12275.getClass(), "next", term12276);
        setIntField(term12281, term12281.getClass(), "type", 0);
        setField(term12281, term12281.getClass(), "next", null);
        setField(term12281, term12281.getClass(), "first", null);
        setField(term12281, term12281.getClass(), "last", null);
        setField(term12281, term12281.getClass(), "propListHead", null);
        setIntField(term12281, term12281.getClass(), "sourcePosition", 0);
        setField(term12281, term12281.getClass(), "jsType", null);
        setField(term12281, term12281.getClass(), "parent", null);
        setField(term12275, term12275.getClass(), "first", term12281);
        setIntField(term12282, term12282.getClass(), "type", 0);
        setField(term12282, term12282.getClass(), "next", null);
        setField(term12282, term12282.getClass(), "first", null);
        setField(term12282, term12282.getClass(), "last", null);
        setField(term12282, term12282.getClass(), "propListHead", null);
        setIntField(term12282, term12282.getClass(), "sourcePosition", 0);
        setField(term12282, term12282.getClass(), "jsType", null);
        setField(term12282, term12282.getClass(), "parent", null);
        setField(term12275, term12275.getClass(), "last", term12282);
        setField(term12283, term12283.getClass(), "next", null);
        setIntField(term12283, term12283.getClass(), "type", 0);
        setIntField(term12283, term12283.getClass(), "intValue", 0);
        setField(term12283, term12283.getClass(), "objectValue", null);
        setField(term12275, term12275.getClass(), "propListHead", term12283);
        setIntField(term12275, term12275.getClass(), "sourcePosition", -751079123);
        setField(term12275, term12275.getClass(), "jsType", null);
        setField(term12275, term12275.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1622;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term1622, term12275));
        assertTrue(recursiveEquals(retValue, false));
    }

};


