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
     Object term12195;

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
        term12195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12200 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12203 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12195, term12195.getClass(), "type", -31751777);
        setIntField(term12196, term12196.getClass(), "type", 872295704);
        setIntField(term12197, term12197.getClass(), "type", 0);
        setField(term12197, term12197.getClass(), "next", null);
        setField(term12197, term12197.getClass(), "first", null);
        setField(term12197, term12197.getClass(), "last", null);
        setField(term12197, term12197.getClass(), "propListHead", null);
        setIntField(term12197, term12197.getClass(), "sourcePosition", 0);
        setField(term12197, term12197.getClass(), "jsType", null);
        setField(term12197, term12197.getClass(), "parent", null);
        setField(term12196, term12196.getClass(), "next", term12197);
        setIntField(term12198, term12198.getClass(), "type", 0);
        setField(term12198, term12198.getClass(), "next", null);
        setField(term12198, term12198.getClass(), "first", null);
        setField(term12198, term12198.getClass(), "last", null);
        setField(term12198, term12198.getClass(), "propListHead", null);
        setIntField(term12198, term12198.getClass(), "sourcePosition", 0);
        setField(term12198, term12198.getClass(), "jsType", null);
        setField(term12198, term12198.getClass(), "parent", null);
        setField(term12196, term12196.getClass(), "first", term12198);
        setIntField(term12199, term12199.getClass(), "type", 0);
        setField(term12199, term12199.getClass(), "next", null);
        setField(term12199, term12199.getClass(), "first", null);
        setField(term12199, term12199.getClass(), "last", null);
        setField(term12199, term12199.getClass(), "propListHead", null);
        setIntField(term12199, term12199.getClass(), "sourcePosition", 0);
        setField(term12199, term12199.getClass(), "jsType", null);
        setField(term12199, term12199.getClass(), "parent", null);
        setField(term12196, term12196.getClass(), "last", term12199);
        setField(term12200, term12200.getClass(), "next", null);
        setIntField(term12200, term12200.getClass(), "type", 0);
        setIntField(term12200, term12200.getClass(), "intValue", 0);
        setField(term12200, term12200.getClass(), "objectValue", null);
        setField(term12196, term12196.getClass(), "propListHead", term12200);
        setIntField(term12196, term12196.getClass(), "sourcePosition", 27043781);
        setField(term12196, term12196.getClass(), "jsType", null);
        setField(term12196, term12196.getClass(), "parent", null);
        setField(term12195, term12195.getClass(), "next", term12196);
        setIntField(term12201, term12201.getClass(), "type", 0);
        setField(term12201, term12201.getClass(), "next", null);
        setField(term12201, term12201.getClass(), "first", null);
        setField(term12201, term12201.getClass(), "last", null);
        setField(term12201, term12201.getClass(), "propListHead", null);
        setIntField(term12201, term12201.getClass(), "sourcePosition", 0);
        setField(term12201, term12201.getClass(), "jsType", null);
        setField(term12201, term12201.getClass(), "parent", null);
        setField(term12195, term12195.getClass(), "first", term12201);
        setIntField(term12202, term12202.getClass(), "type", 0);
        setField(term12202, term12202.getClass(), "next", null);
        setField(term12202, term12202.getClass(), "first", null);
        setField(term12202, term12202.getClass(), "last", null);
        setField(term12202, term12202.getClass(), "propListHead", null);
        setIntField(term12202, term12202.getClass(), "sourcePosition", 0);
        setField(term12202, term12202.getClass(), "jsType", null);
        setField(term12202, term12202.getClass(), "parent", null);
        setField(term12195, term12195.getClass(), "last", term12202);
        setField(term12203, term12203.getClass(), "next", null);
        setIntField(term12203, term12203.getClass(), "type", 0);
        setIntField(term12203, term12203.getClass(), "intValue", 0);
        setField(term12203, term12203.getClass(), "objectValue", null);
        setField(term12195, term12195.getClass(), "propListHead", term12203);
        setIntField(term12195, term12195.getClass(), "sourcePosition", -1367122405);
        setField(term12195, term12195.getClass(), "jsType", null);
        setField(term12195, term12195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1568;
        Object retValue = callMethod(klass, "isAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1568, term12195));
        assertTrue(recursiveEquals(retValue, false));
    }

};


