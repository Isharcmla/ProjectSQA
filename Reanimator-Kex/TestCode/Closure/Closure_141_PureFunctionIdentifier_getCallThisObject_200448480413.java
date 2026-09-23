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

public class PureFunctionIdentifier_getCallThisObject_200448480413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term1572;

    public PureFunctionIdentifier_getCallThisObject_200448480413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term253 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term256 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term266 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term243, term243.getClass(), "type", 962840079);
        setIntField(term245, term245.getClass(), "type", 1551099402);
        setIntField(term247, term247.getClass(), "type", 0);
        setField(term247, term247.getClass(), "next", null);
        setField(term247, term247.getClass(), "first", null);
        setField(term247, term247.getClass(), "last", null);
        setField(term247, term247.getClass(), "propListHead", null);
        setIntField(term247, term247.getClass(), "sourcePosition", 0);
        setField(term247, term247.getClass(), "jsType", null);
        setField(term247, term247.getClass(), "parent", null);
        setField(term245, term245.getClass(), "next", term247);
        setIntField(term250, term250.getClass(), "type", 0);
        setField(term250, term250.getClass(), "next", null);
        setField(term250, term250.getClass(), "first", null);
        setField(term250, term250.getClass(), "last", null);
        setField(term250, term250.getClass(), "propListHead", null);
        setIntField(term250, term250.getClass(), "sourcePosition", 0);
        setField(term250, term250.getClass(), "jsType", null);
        setField(term250, term250.getClass(), "parent", null);
        setField(term245, term245.getClass(), "first", term250);
        setIntField(term253, term253.getClass(), "type", 0);
        setField(term253, term253.getClass(), "next", null);
        setField(term253, term253.getClass(), "first", null);
        setField(term253, term253.getClass(), "last", null);
        setField(term253, term253.getClass(), "propListHead", null);
        setIntField(term253, term253.getClass(), "sourcePosition", 0);
        setField(term253, term253.getClass(), "jsType", null);
        setField(term253, term253.getClass(), "parent", null);
        setField(term245, term245.getClass(), "last", term253);
        setField(term256, term256.getClass(), "next", null);
        setIntField(term256, term256.getClass(), "type", 0);
        setIntField(term256, term256.getClass(), "intValue", 0);
        setField(term256, term256.getClass(), "objectValue", null);
        setField(term245, term245.getClass(), "propListHead", term256);
        setIntField(term245, term245.getClass(), "sourcePosition", 1375330971);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term243, term243.getClass(), "next", term245);
        setIntField(term260, term260.getClass(), "type", 0);
        setField(term260, term260.getClass(), "next", null);
        setField(term260, term260.getClass(), "first", null);
        setField(term260, term260.getClass(), "last", null);
        setField(term260, term260.getClass(), "propListHead", null);
        setIntField(term260, term260.getClass(), "sourcePosition", 0);
        setField(term260, term260.getClass(), "jsType", null);
        setField(term260, term260.getClass(), "parent", null);
        setField(term243, term243.getClass(), "first", term260);
        setIntField(term263, term263.getClass(), "type", 0);
        setField(term263, term263.getClass(), "next", null);
        setField(term263, term263.getClass(), "first", null);
        setField(term263, term263.getClass(), "last", null);
        setField(term263, term263.getClass(), "propListHead", null);
        setIntField(term263, term263.getClass(), "sourcePosition", 0);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        setField(term243, term243.getClass(), "last", term263);
        setField(term266, term266.getClass(), "next", null);
        setIntField(term266, term266.getClass(), "type", 0);
        setIntField(term266, term266.getClass(), "intValue", 0);
        setField(term266, term266.getClass(), "objectValue", null);
        setField(term243, term243.getClass(), "propListHead", term266);
        setIntField(term243, term243.getClass(), "sourcePosition", -478195677);
        setField(term243, term243.getClass(), "jsType", null);
        setField(term243, term243.getClass(), "parent", null);
        term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1577 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1580 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1572, term1572.getClass(), "type", 962840079);
        setIntField(term1573, term1573.getClass(), "type", 1551099402);
        setIntField(term1574, term1574.getClass(), "type", 0);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "first", null);
        setField(term1574, term1574.getClass(), "last", null);
        setField(term1574, term1574.getClass(), "propListHead", null);
        setIntField(term1574, term1574.getClass(), "sourcePosition", 0);
        setField(term1574, term1574.getClass(), "jsType", null);
        setField(term1574, term1574.getClass(), "parent", null);
        setField(term1573, term1573.getClass(), "next", term1574);
        setIntField(term1575, term1575.getClass(), "type", 0);
        setField(term1575, term1575.getClass(), "next", null);
        setField(term1575, term1575.getClass(), "first", null);
        setField(term1575, term1575.getClass(), "last", null);
        setField(term1575, term1575.getClass(), "propListHead", null);
        setIntField(term1575, term1575.getClass(), "sourcePosition", 0);
        setField(term1575, term1575.getClass(), "jsType", null);
        setField(term1575, term1575.getClass(), "parent", null);
        setField(term1573, term1573.getClass(), "first", term1575);
        setIntField(term1576, term1576.getClass(), "type", 0);
        setField(term1576, term1576.getClass(), "next", null);
        setField(term1576, term1576.getClass(), "first", null);
        setField(term1576, term1576.getClass(), "last", null);
        setField(term1576, term1576.getClass(), "propListHead", null);
        setIntField(term1576, term1576.getClass(), "sourcePosition", 0);
        setField(term1576, term1576.getClass(), "jsType", null);
        setField(term1576, term1576.getClass(), "parent", null);
        setField(term1573, term1573.getClass(), "last", term1576);
        setField(term1577, term1577.getClass(), "next", null);
        setIntField(term1577, term1577.getClass(), "type", 0);
        setIntField(term1577, term1577.getClass(), "intValue", 0);
        setField(term1577, term1577.getClass(), "objectValue", null);
        setField(term1573, term1573.getClass(), "propListHead", term1577);
        setIntField(term1573, term1573.getClass(), "sourcePosition", 1375330971);
        setField(term1573, term1573.getClass(), "jsType", null);
        setField(term1573, term1573.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "next", term1573);
        setIntField(term1578, term1578.getClass(), "type", 0);
        setField(term1578, term1578.getClass(), "next", null);
        setField(term1578, term1578.getClass(), "first", null);
        setField(term1578, term1578.getClass(), "last", null);
        setField(term1578, term1578.getClass(), "propListHead", null);
        setIntField(term1578, term1578.getClass(), "sourcePosition", 0);
        setField(term1578, term1578.getClass(), "jsType", null);
        setField(term1578, term1578.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "first", term1578);
        setIntField(term1579, term1579.getClass(), "type", 0);
        setField(term1579, term1579.getClass(), "next", null);
        setField(term1579, term1579.getClass(), "first", null);
        setField(term1579, term1579.getClass(), "last", null);
        setField(term1579, term1579.getClass(), "propListHead", null);
        setIntField(term1579, term1579.getClass(), "sourcePosition", 0);
        setField(term1579, term1579.getClass(), "jsType", null);
        setField(term1579, term1579.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "last", term1579);
        setField(term1580, term1580.getClass(), "next", null);
        setIntField(term1580, term1580.getClass(), "type", 0);
        setIntField(term1580, term1580.getClass(), "intValue", 0);
        setField(term1580, term1580.getClass(), "objectValue", null);
        setField(term1572, term1572.getClass(), "propListHead", term1580);
        setIntField(term1572, term1572.getClass(), "sourcePosition", -478195677);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term243;
        Object retValue = callMethod(klass, "getCallThisObject", argTypes, null, args);
        assertTrue(recursiveEquals(term243, term1572));
        assertTrue(recursiveEquals(retValue, null));
    }

};


