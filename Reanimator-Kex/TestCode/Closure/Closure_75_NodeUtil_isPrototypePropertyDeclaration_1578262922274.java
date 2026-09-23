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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530;
     Object term20805;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3543 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3553 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3530, term3530.getClass(), "type", -1260562836);
        setIntField(term3532, term3532.getClass(), "type", 1169519385);
        setIntField(term3534, term3534.getClass(), "type", 0);
        setField(term3534, term3534.getClass(), "next", null);
        setField(term3534, term3534.getClass(), "first", null);
        setField(term3534, term3534.getClass(), "last", null);
        setField(term3534, term3534.getClass(), "propListHead", null);
        setIntField(term3534, term3534.getClass(), "sourcePosition", 0);
        setField(term3534, term3534.getClass(), "jsType", null);
        setField(term3534, term3534.getClass(), "parent", null);
        setField(term3532, term3532.getClass(), "next", term3534);
        setIntField(term3537, term3537.getClass(), "type", 0);
        setField(term3537, term3537.getClass(), "next", null);
        setField(term3537, term3537.getClass(), "first", null);
        setField(term3537, term3537.getClass(), "last", null);
        setField(term3537, term3537.getClass(), "propListHead", null);
        setIntField(term3537, term3537.getClass(), "sourcePosition", 0);
        setField(term3537, term3537.getClass(), "jsType", null);
        setField(term3537, term3537.getClass(), "parent", null);
        setField(term3532, term3532.getClass(), "first", term3537);
        setIntField(term3540, term3540.getClass(), "type", 0);
        setField(term3540, term3540.getClass(), "next", null);
        setField(term3540, term3540.getClass(), "first", null);
        setField(term3540, term3540.getClass(), "last", null);
        setField(term3540, term3540.getClass(), "propListHead", null);
        setIntField(term3540, term3540.getClass(), "sourcePosition", 0);
        setField(term3540, term3540.getClass(), "jsType", null);
        setField(term3540, term3540.getClass(), "parent", null);
        setField(term3532, term3532.getClass(), "last", term3540);
        setField(term3543, term3543.getClass(), "next", null);
        setIntField(term3543, term3543.getClass(), "type", 0);
        setIntField(term3543, term3543.getClass(), "intValue", 0);
        setField(term3543, term3543.getClass(), "objectValue", null);
        setField(term3532, term3532.getClass(), "propListHead", term3543);
        setIntField(term3532, term3532.getClass(), "sourcePosition", 376341151);
        setField(term3532, term3532.getClass(), "jsType", null);
        setField(term3532, term3532.getClass(), "parent", null);
        setField(term3530, term3530.getClass(), "next", term3532);
        setIntField(term3547, term3547.getClass(), "type", 0);
        setField(term3547, term3547.getClass(), "next", null);
        setField(term3547, term3547.getClass(), "first", null);
        setField(term3547, term3547.getClass(), "last", null);
        setField(term3547, term3547.getClass(), "propListHead", null);
        setIntField(term3547, term3547.getClass(), "sourcePosition", 0);
        setField(term3547, term3547.getClass(), "jsType", null);
        setField(term3547, term3547.getClass(), "parent", null);
        setField(term3530, term3530.getClass(), "first", term3547);
        setIntField(term3550, term3550.getClass(), "type", 0);
        setField(term3550, term3550.getClass(), "next", null);
        setField(term3550, term3550.getClass(), "first", null);
        setField(term3550, term3550.getClass(), "last", null);
        setField(term3550, term3550.getClass(), "propListHead", null);
        setIntField(term3550, term3550.getClass(), "sourcePosition", 0);
        setField(term3550, term3550.getClass(), "jsType", null);
        setField(term3550, term3550.getClass(), "parent", null);
        setField(term3530, term3530.getClass(), "last", term3550);
        setField(term3553, term3553.getClass(), "next", null);
        setIntField(term3553, term3553.getClass(), "type", 0);
        setIntField(term3553, term3553.getClass(), "intValue", 0);
        setField(term3553, term3553.getClass(), "objectValue", null);
        setField(term3530, term3530.getClass(), "propListHead", term3553);
        setIntField(term3530, term3530.getClass(), "sourcePosition", -1607267243);
        setField(term3530, term3530.getClass(), "jsType", null);
        setField(term3530, term3530.getClass(), "parent", null);
        term20805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20810 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20813 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20805, term20805.getClass(), "type", -1260562836);
        setIntField(term20806, term20806.getClass(), "type", 1169519385);
        setIntField(term20807, term20807.getClass(), "type", 0);
        setField(term20807, term20807.getClass(), "next", null);
        setField(term20807, term20807.getClass(), "first", null);
        setField(term20807, term20807.getClass(), "last", null);
        setField(term20807, term20807.getClass(), "propListHead", null);
        setIntField(term20807, term20807.getClass(), "sourcePosition", 0);
        setField(term20807, term20807.getClass(), "jsType", null);
        setField(term20807, term20807.getClass(), "parent", null);
        setField(term20806, term20806.getClass(), "next", term20807);
        setIntField(term20808, term20808.getClass(), "type", 0);
        setField(term20808, term20808.getClass(), "next", null);
        setField(term20808, term20808.getClass(), "first", null);
        setField(term20808, term20808.getClass(), "last", null);
        setField(term20808, term20808.getClass(), "propListHead", null);
        setIntField(term20808, term20808.getClass(), "sourcePosition", 0);
        setField(term20808, term20808.getClass(), "jsType", null);
        setField(term20808, term20808.getClass(), "parent", null);
        setField(term20806, term20806.getClass(), "first", term20808);
        setIntField(term20809, term20809.getClass(), "type", 0);
        setField(term20809, term20809.getClass(), "next", null);
        setField(term20809, term20809.getClass(), "first", null);
        setField(term20809, term20809.getClass(), "last", null);
        setField(term20809, term20809.getClass(), "propListHead", null);
        setIntField(term20809, term20809.getClass(), "sourcePosition", 0);
        setField(term20809, term20809.getClass(), "jsType", null);
        setField(term20809, term20809.getClass(), "parent", null);
        setField(term20806, term20806.getClass(), "last", term20809);
        setField(term20810, term20810.getClass(), "next", null);
        setIntField(term20810, term20810.getClass(), "type", 0);
        setIntField(term20810, term20810.getClass(), "intValue", 0);
        setField(term20810, term20810.getClass(), "objectValue", null);
        setField(term20806, term20806.getClass(), "propListHead", term20810);
        setIntField(term20806, term20806.getClass(), "sourcePosition", 376341151);
        setField(term20806, term20806.getClass(), "jsType", null);
        setField(term20806, term20806.getClass(), "parent", null);
        setField(term20805, term20805.getClass(), "next", term20806);
        setIntField(term20811, term20811.getClass(), "type", 0);
        setField(term20811, term20811.getClass(), "next", null);
        setField(term20811, term20811.getClass(), "first", null);
        setField(term20811, term20811.getClass(), "last", null);
        setField(term20811, term20811.getClass(), "propListHead", null);
        setIntField(term20811, term20811.getClass(), "sourcePosition", 0);
        setField(term20811, term20811.getClass(), "jsType", null);
        setField(term20811, term20811.getClass(), "parent", null);
        setField(term20805, term20805.getClass(), "first", term20811);
        setIntField(term20812, term20812.getClass(), "type", 0);
        setField(term20812, term20812.getClass(), "next", null);
        setField(term20812, term20812.getClass(), "first", null);
        setField(term20812, term20812.getClass(), "last", null);
        setField(term20812, term20812.getClass(), "propListHead", null);
        setIntField(term20812, term20812.getClass(), "sourcePosition", 0);
        setField(term20812, term20812.getClass(), "jsType", null);
        setField(term20812, term20812.getClass(), "parent", null);
        setField(term20805, term20805.getClass(), "last", term20812);
        setField(term20813, term20813.getClass(), "next", null);
        setIntField(term20813, term20813.getClass(), "type", 0);
        setIntField(term20813, term20813.getClass(), "intValue", 0);
        setField(term20813, term20813.getClass(), "objectValue", null);
        setField(term20805, term20805.getClass(), "propListHead", term20813);
        setIntField(term20805, term20805.getClass(), "sourcePosition", -1607267243);
        setField(term20805, term20805.getClass(), "jsType", null);
        setField(term20805, term20805.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3530;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term3530, term20805));
        assertTrue(recursiveEquals(retValue, false));
    }

};


