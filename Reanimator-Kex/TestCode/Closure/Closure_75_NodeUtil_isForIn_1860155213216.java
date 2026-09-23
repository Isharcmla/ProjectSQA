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
     Object term12569;

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
        term12569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12574 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12577 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12569, term12569.getClass(), "type", -2129828854);
        setIntField(term12570, term12570.getClass(), "type", -511077684);
        setIntField(term12571, term12571.getClass(), "type", 0);
        setField(term12571, term12571.getClass(), "next", null);
        setField(term12571, term12571.getClass(), "first", null);
        setField(term12571, term12571.getClass(), "last", null);
        setField(term12571, term12571.getClass(), "propListHead", null);
        setIntField(term12571, term12571.getClass(), "sourcePosition", 0);
        setField(term12571, term12571.getClass(), "jsType", null);
        setField(term12571, term12571.getClass(), "parent", null);
        setField(term12570, term12570.getClass(), "next", term12571);
        setIntField(term12572, term12572.getClass(), "type", 0);
        setField(term12572, term12572.getClass(), "next", null);
        setField(term12572, term12572.getClass(), "first", null);
        setField(term12572, term12572.getClass(), "last", null);
        setField(term12572, term12572.getClass(), "propListHead", null);
        setIntField(term12572, term12572.getClass(), "sourcePosition", 0);
        setField(term12572, term12572.getClass(), "jsType", null);
        setField(term12572, term12572.getClass(), "parent", null);
        setField(term12570, term12570.getClass(), "first", term12572);
        setIntField(term12573, term12573.getClass(), "type", 0);
        setField(term12573, term12573.getClass(), "next", null);
        setField(term12573, term12573.getClass(), "first", null);
        setField(term12573, term12573.getClass(), "last", null);
        setField(term12573, term12573.getClass(), "propListHead", null);
        setIntField(term12573, term12573.getClass(), "sourcePosition", 0);
        setField(term12573, term12573.getClass(), "jsType", null);
        setField(term12573, term12573.getClass(), "parent", null);
        setField(term12570, term12570.getClass(), "last", term12573);
        setField(term12574, term12574.getClass(), "next", null);
        setIntField(term12574, term12574.getClass(), "type", 0);
        setIntField(term12574, term12574.getClass(), "intValue", 0);
        setField(term12574, term12574.getClass(), "objectValue", null);
        setField(term12570, term12570.getClass(), "propListHead", term12574);
        setIntField(term12570, term12570.getClass(), "sourcePosition", 924127883);
        setField(term12570, term12570.getClass(), "jsType", null);
        setField(term12570, term12570.getClass(), "parent", null);
        setField(term12569, term12569.getClass(), "next", term12570);
        setIntField(term12575, term12575.getClass(), "type", 0);
        setField(term12575, term12575.getClass(), "next", null);
        setField(term12575, term12575.getClass(), "first", null);
        setField(term12575, term12575.getClass(), "last", null);
        setField(term12575, term12575.getClass(), "propListHead", null);
        setIntField(term12575, term12575.getClass(), "sourcePosition", 0);
        setField(term12575, term12575.getClass(), "jsType", null);
        setField(term12575, term12575.getClass(), "parent", null);
        setField(term12569, term12569.getClass(), "first", term12575);
        setIntField(term12576, term12576.getClass(), "type", 0);
        setField(term12576, term12576.getClass(), "next", null);
        setField(term12576, term12576.getClass(), "first", null);
        setField(term12576, term12576.getClass(), "last", null);
        setField(term12576, term12576.getClass(), "propListHead", null);
        setIntField(term12576, term12576.getClass(), "sourcePosition", 0);
        setField(term12576, term12576.getClass(), "jsType", null);
        setField(term12576, term12576.getClass(), "parent", null);
        setField(term12569, term12569.getClass(), "last", term12576);
        setField(term12577, term12577.getClass(), "next", null);
        setIntField(term12577, term12577.getClass(), "type", 0);
        setIntField(term12577, term12577.getClass(), "intValue", 0);
        setField(term12577, term12577.getClass(), "objectValue", null);
        setField(term12569, term12569.getClass(), "propListHead", term12577);
        setIntField(term12569, term12569.getClass(), "sourcePosition", -751079123);
        setField(term12569, term12569.getClass(), "jsType", null);
        setField(term12569, term12569.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1622;
        Object retValue = callMethod(klass, "isForIn", argTypes, null, args);
        assertTrue(recursiveEquals(term1622, term12569));
        assertTrue(recursiveEquals(retValue, false));
    }

};


