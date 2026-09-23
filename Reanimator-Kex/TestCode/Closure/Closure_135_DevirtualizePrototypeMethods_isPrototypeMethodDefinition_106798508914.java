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

public class DevirtualizePrototypeMethods_isPrototypeMethodDefinition_106798508914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;
     Object term1637;

    public DevirtualizePrototypeMethods_isPrototypeMethodDefinition_106798508914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term85, term85.getClass(), "type", -1145578966);
        setIntField(term87, term87.getClass(), "type", -602026508);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "next", term89);
        setIntField(term92, term92.getClass(), "type", 0);
        setField(term92, term92.getClass(), "next", null);
        setField(term92, term92.getClass(), "first", null);
        setField(term92, term92.getClass(), "last", null);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        setField(term87, term87.getClass(), "first", term92);
        setIntField(term95, term95.getClass(), "type", 0);
        setField(term95, term95.getClass(), "next", null);
        setField(term95, term95.getClass(), "first", null);
        setField(term95, term95.getClass(), "last", null);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term87, term87.getClass(), "last", term95);
        setField(term98, term98.getClass(), "next", null);
        setIntField(term98, term98.getClass(), "type", 0);
        setIntField(term98, term98.getClass(), "intValue", 0);
        setField(term98, term98.getClass(), "objectValue", null);
        setField(term87, term87.getClass(), "propListHead", term98);
        setIntField(term87, term87.getClass(), "sourcePosition", -817164822);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term85, term85.getClass(), "next", term87);
        setIntField(term102, term102.getClass(), "type", 0);
        setField(term102, term102.getClass(), "next", null);
        setField(term102, term102.getClass(), "first", null);
        setField(term102, term102.getClass(), "last", null);
        setField(term102, term102.getClass(), "propListHead", null);
        setIntField(term102, term102.getClass(), "sourcePosition", 0);
        setField(term102, term102.getClass(), "jsType", null);
        setField(term102, term102.getClass(), "parent", null);
        setField(term85, term85.getClass(), "first", term102);
        setIntField(term105, term105.getClass(), "type", 0);
        setField(term105, term105.getClass(), "next", null);
        setField(term105, term105.getClass(), "first", null);
        setField(term105, term105.getClass(), "last", null);
        setField(term105, term105.getClass(), "propListHead", null);
        setIntField(term105, term105.getClass(), "sourcePosition", 0);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        setField(term85, term85.getClass(), "last", term105);
        setField(term108, term108.getClass(), "next", null);
        setIntField(term108, term108.getClass(), "type", 0);
        setIntField(term108, term108.getClass(), "intValue", 0);
        setField(term108, term108.getClass(), "objectValue", null);
        setField(term85, term85.getClass(), "propListHead", term108);
        setIntField(term85, term85.getClass(), "sourcePosition", -1016503459);
        setField(term85, term85.getClass(), "jsType", null);
        setField(term85, term85.getClass(), "parent", null);
        term1637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1642 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1645 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1637, term1637.getClass(), "type", -1145578966);
        setIntField(term1638, term1638.getClass(), "type", -602026508);
        setIntField(term1639, term1639.getClass(), "type", 0);
        setField(term1639, term1639.getClass(), "next", null);
        setField(term1639, term1639.getClass(), "first", null);
        setField(term1639, term1639.getClass(), "last", null);
        setField(term1639, term1639.getClass(), "propListHead", null);
        setIntField(term1639, term1639.getClass(), "sourcePosition", 0);
        setField(term1639, term1639.getClass(), "jsType", null);
        setField(term1639, term1639.getClass(), "parent", null);
        setField(term1638, term1638.getClass(), "next", term1639);
        setIntField(term1640, term1640.getClass(), "type", 0);
        setField(term1640, term1640.getClass(), "next", null);
        setField(term1640, term1640.getClass(), "first", null);
        setField(term1640, term1640.getClass(), "last", null);
        setField(term1640, term1640.getClass(), "propListHead", null);
        setIntField(term1640, term1640.getClass(), "sourcePosition", 0);
        setField(term1640, term1640.getClass(), "jsType", null);
        setField(term1640, term1640.getClass(), "parent", null);
        setField(term1638, term1638.getClass(), "first", term1640);
        setIntField(term1641, term1641.getClass(), "type", 0);
        setField(term1641, term1641.getClass(), "next", null);
        setField(term1641, term1641.getClass(), "first", null);
        setField(term1641, term1641.getClass(), "last", null);
        setField(term1641, term1641.getClass(), "propListHead", null);
        setIntField(term1641, term1641.getClass(), "sourcePosition", 0);
        setField(term1641, term1641.getClass(), "jsType", null);
        setField(term1641, term1641.getClass(), "parent", null);
        setField(term1638, term1638.getClass(), "last", term1641);
        setField(term1642, term1642.getClass(), "next", null);
        setIntField(term1642, term1642.getClass(), "type", 0);
        setIntField(term1642, term1642.getClass(), "intValue", 0);
        setField(term1642, term1642.getClass(), "objectValue", null);
        setField(term1638, term1638.getClass(), "propListHead", term1642);
        setIntField(term1638, term1638.getClass(), "sourcePosition", -817164822);
        setField(term1638, term1638.getClass(), "jsType", null);
        setField(term1638, term1638.getClass(), "parent", null);
        setField(term1637, term1637.getClass(), "next", term1638);
        setIntField(term1643, term1643.getClass(), "type", 0);
        setField(term1643, term1643.getClass(), "next", null);
        setField(term1643, term1643.getClass(), "first", null);
        setField(term1643, term1643.getClass(), "last", null);
        setField(term1643, term1643.getClass(), "propListHead", null);
        setIntField(term1643, term1643.getClass(), "sourcePosition", 0);
        setField(term1643, term1643.getClass(), "jsType", null);
        setField(term1643, term1643.getClass(), "parent", null);
        setField(term1637, term1637.getClass(), "first", term1643);
        setIntField(term1644, term1644.getClass(), "type", 0);
        setField(term1644, term1644.getClass(), "next", null);
        setField(term1644, term1644.getClass(), "first", null);
        setField(term1644, term1644.getClass(), "last", null);
        setField(term1644, term1644.getClass(), "propListHead", null);
        setIntField(term1644, term1644.getClass(), "sourcePosition", 0);
        setField(term1644, term1644.getClass(), "jsType", null);
        setField(term1644, term1644.getClass(), "parent", null);
        setField(term1637, term1637.getClass(), "last", term1644);
        setField(term1645, term1645.getClass(), "next", null);
        setIntField(term1645, term1645.getClass(), "type", 0);
        setIntField(term1645, term1645.getClass(), "intValue", 0);
        setField(term1645, term1645.getClass(), "objectValue", null);
        setField(term1637, term1637.getClass(), "propListHead", term1645);
        setIntField(term1637, term1637.getClass(), "sourcePosition", -1016503459);
        setField(term1637, term1637.getClass(), "jsType", null);
        setField(term1637, term1637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term85;
        Object retValue = callMethod(klass, "isPrototypeMethodDefinition", argTypes, null, args);
        assertTrue(recursiveEquals(term85, term1637));
        assertTrue(recursiveEquals(retValue, false));
    }

};


