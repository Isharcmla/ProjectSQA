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

public class NodeUtil_isAssign_1955286018214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1568;
     Object term12489;

    public NodeUtil_isAssign_1955286018214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1581 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1591 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1568, term1568.getClass(), "type", -31751777);
        setIntField(term1570, term1570.getClass(), "type", 872295704);
        setIntField(term1572, term1572.getClass(), "type", 0);
        setField(term1572, term1572.getClass(), "next", null);
        setField(term1572, term1572.getClass(), "first", null);
        setField(term1572, term1572.getClass(), "last", null);
        setField(term1572, term1572.getClass(), "propListHead", null);
        setIntField(term1572, term1572.getClass(), "sourcePosition", 0);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "next", term1572);
        setIntField(term1575, term1575.getClass(), "type", 0);
        setField(term1575, term1575.getClass(), "next", null);
        setField(term1575, term1575.getClass(), "first", null);
        setField(term1575, term1575.getClass(), "last", null);
        setField(term1575, term1575.getClass(), "propListHead", null);
        setIntField(term1575, term1575.getClass(), "sourcePosition", 0);
        setField(term1575, term1575.getClass(), "jsType", null);
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "first", term1575);
        setIntField(term1578, term1578.getClass(), "type", 0);
        setField(term1578, term1578.getClass(), "next", null);
        setField(term1578, term1578.getClass(), "first", null);
        setField(term1578, term1578.getClass(), "last", null);
        setField(term1578, term1578.getClass(), "propListHead", null);
        setIntField(term1578, term1578.getClass(), "sourcePosition", 0);
        setField(term1578, term1578.getClass(), "jsType", null);
        setField(term1578, term1578.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "last", term1578);
        setField(term1581, term1581.getClass(), "next", null);
        setIntField(term1581, term1581.getClass(), "type", 0);
        setIntField(term1581, term1581.getClass(), "intValue", 0);
        setField(term1581, term1581.getClass(), "objectValue", null);
        setField(term1570, term1570.getClass(), "propListHead", term1581);
        setIntField(term1570, term1570.getClass(), "sourcePosition", 27043781);
        setField(term1570, term1570.getClass(), "jsType", null);
        setField(term1570, term1570.getClass(), "parent", null);
        setField(term1568, term1568.getClass(), "next", term1570);
        setIntField(term1585, term1585.getClass(), "type", 0);
        setField(term1585, term1585.getClass(), "next", null);
        setField(term1585, term1585.getClass(), "first", null);
        setField(term1585, term1585.getClass(), "last", null);
        setField(term1585, term1585.getClass(), "propListHead", null);
        setIntField(term1585, term1585.getClass(), "sourcePosition", 0);
        setField(term1585, term1585.getClass(), "jsType", null);
        setField(term1585, term1585.getClass(), "parent", null);
        setField(term1568, term1568.getClass(), "first", term1585);
        setIntField(term1588, term1588.getClass(), "type", 0);
        setField(term1588, term1588.getClass(), "next", null);
        setField(term1588, term1588.getClass(), "first", null);
        setField(term1588, term1588.getClass(), "last", null);
        setField(term1588, term1588.getClass(), "propListHead", null);
        setIntField(term1588, term1588.getClass(), "sourcePosition", 0);
        setField(term1588, term1588.getClass(), "jsType", null);
        setField(term1588, term1588.getClass(), "parent", null);
        setField(term1568, term1568.getClass(), "last", term1588);
        setField(term1591, term1591.getClass(), "next", null);
        setIntField(term1591, term1591.getClass(), "type", 0);
        setIntField(term1591, term1591.getClass(), "intValue", 0);
        setField(term1591, term1591.getClass(), "objectValue", null);
        setField(term1568, term1568.getClass(), "propListHead", term1591);
        setIntField(term1568, term1568.getClass(), "sourcePosition", -1367122405);
        setField(term1568, term1568.getClass(), "jsType", null);
        setField(term1568, term1568.getClass(), "parent", null);
        term12489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12494 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12495 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12497 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12489, term12489.getClass(), "type", -31751777);
        setIntField(term12490, term12490.getClass(), "type", 872295704);
        setIntField(term12491, term12491.getClass(), "type", 0);
        setField(term12491, term12491.getClass(), "next", null);
        setField(term12491, term12491.getClass(), "first", null);
        setField(term12491, term12491.getClass(), "last", null);
        setField(term12491, term12491.getClass(), "propListHead", null);
        setIntField(term12491, term12491.getClass(), "sourcePosition", 0);
        setField(term12491, term12491.getClass(), "jsType", null);
        setField(term12491, term12491.getClass(), "parent", null);
        setField(term12490, term12490.getClass(), "next", term12491);
        setIntField(term12492, term12492.getClass(), "type", 0);
        setField(term12492, term12492.getClass(), "next", null);
        setField(term12492, term12492.getClass(), "first", null);
        setField(term12492, term12492.getClass(), "last", null);
        setField(term12492, term12492.getClass(), "propListHead", null);
        setIntField(term12492, term12492.getClass(), "sourcePosition", 0);
        setField(term12492, term12492.getClass(), "jsType", null);
        setField(term12492, term12492.getClass(), "parent", null);
        setField(term12490, term12490.getClass(), "first", term12492);
        setIntField(term12493, term12493.getClass(), "type", 0);
        setField(term12493, term12493.getClass(), "next", null);
        setField(term12493, term12493.getClass(), "first", null);
        setField(term12493, term12493.getClass(), "last", null);
        setField(term12493, term12493.getClass(), "propListHead", null);
        setIntField(term12493, term12493.getClass(), "sourcePosition", 0);
        setField(term12493, term12493.getClass(), "jsType", null);
        setField(term12493, term12493.getClass(), "parent", null);
        setField(term12490, term12490.getClass(), "last", term12493);
        setField(term12494, term12494.getClass(), "next", null);
        setIntField(term12494, term12494.getClass(), "type", 0);
        setIntField(term12494, term12494.getClass(), "intValue", 0);
        setField(term12494, term12494.getClass(), "objectValue", null);
        setField(term12490, term12490.getClass(), "propListHead", term12494);
        setIntField(term12490, term12490.getClass(), "sourcePosition", 27043781);
        setField(term12490, term12490.getClass(), "jsType", null);
        setField(term12490, term12490.getClass(), "parent", null);
        setField(term12489, term12489.getClass(), "next", term12490);
        setIntField(term12495, term12495.getClass(), "type", 0);
        setField(term12495, term12495.getClass(), "next", null);
        setField(term12495, term12495.getClass(), "first", null);
        setField(term12495, term12495.getClass(), "last", null);
        setField(term12495, term12495.getClass(), "propListHead", null);
        setIntField(term12495, term12495.getClass(), "sourcePosition", 0);
        setField(term12495, term12495.getClass(), "jsType", null);
        setField(term12495, term12495.getClass(), "parent", null);
        setField(term12489, term12489.getClass(), "first", term12495);
        setIntField(term12496, term12496.getClass(), "type", 0);
        setField(term12496, term12496.getClass(), "next", null);
        setField(term12496, term12496.getClass(), "first", null);
        setField(term12496, term12496.getClass(), "last", null);
        setField(term12496, term12496.getClass(), "propListHead", null);
        setIntField(term12496, term12496.getClass(), "sourcePosition", 0);
        setField(term12496, term12496.getClass(), "jsType", null);
        setField(term12496, term12496.getClass(), "parent", null);
        setField(term12489, term12489.getClass(), "last", term12496);
        setField(term12497, term12497.getClass(), "next", null);
        setIntField(term12497, term12497.getClass(), "type", 0);
        setIntField(term12497, term12497.getClass(), "intValue", 0);
        setField(term12497, term12497.getClass(), "objectValue", null);
        setField(term12489, term12489.getClass(), "propListHead", term12497);
        setIntField(term12489, term12489.getClass(), "sourcePosition", -1367122405);
        setField(term12489, term12489.getClass(), "jsType", null);
        setField(term12489, term12489.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1568;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1568, term12489));
        assertTrue(recursiveEquals(retValue, false));
    }

};


