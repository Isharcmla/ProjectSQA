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
     Object term20758;

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
        term20758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20763 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20766 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term20758, term20758.getClass(), "type", -1260562836);
        setIntField(term20759, term20759.getClass(), "type", 1169519385);
        setIntField(term20760, term20760.getClass(), "type", 0);
        setField(term20760, term20760.getClass(), "next", null);
        setField(term20760, term20760.getClass(), "first", null);
        setField(term20760, term20760.getClass(), "last", null);
        setField(term20760, term20760.getClass(), "propListHead", null);
        setIntField(term20760, term20760.getClass(), "sourcePosition", 0);
        setField(term20760, term20760.getClass(), "jsType", null);
        setField(term20760, term20760.getClass(), "parent", null);
        setField(term20759, term20759.getClass(), "next", term20760);
        setIntField(term20761, term20761.getClass(), "type", 0);
        setField(term20761, term20761.getClass(), "next", null);
        setField(term20761, term20761.getClass(), "first", null);
        setField(term20761, term20761.getClass(), "last", null);
        setField(term20761, term20761.getClass(), "propListHead", null);
        setIntField(term20761, term20761.getClass(), "sourcePosition", 0);
        setField(term20761, term20761.getClass(), "jsType", null);
        setField(term20761, term20761.getClass(), "parent", null);
        setField(term20759, term20759.getClass(), "first", term20761);
        setIntField(term20762, term20762.getClass(), "type", 0);
        setField(term20762, term20762.getClass(), "next", null);
        setField(term20762, term20762.getClass(), "first", null);
        setField(term20762, term20762.getClass(), "last", null);
        setField(term20762, term20762.getClass(), "propListHead", null);
        setIntField(term20762, term20762.getClass(), "sourcePosition", 0);
        setField(term20762, term20762.getClass(), "jsType", null);
        setField(term20762, term20762.getClass(), "parent", null);
        setField(term20759, term20759.getClass(), "last", term20762);
        setField(term20763, term20763.getClass(), "next", null);
        setIntField(term20763, term20763.getClass(), "type", 0);
        setIntField(term20763, term20763.getClass(), "intValue", 0);
        setField(term20763, term20763.getClass(), "objectValue", null);
        setField(term20759, term20759.getClass(), "propListHead", term20763);
        setIntField(term20759, term20759.getClass(), "sourcePosition", 376341151);
        setField(term20759, term20759.getClass(), "jsType", null);
        setField(term20759, term20759.getClass(), "parent", null);
        setField(term20758, term20758.getClass(), "next", term20759);
        setIntField(term20764, term20764.getClass(), "type", 0);
        setField(term20764, term20764.getClass(), "next", null);
        setField(term20764, term20764.getClass(), "first", null);
        setField(term20764, term20764.getClass(), "last", null);
        setField(term20764, term20764.getClass(), "propListHead", null);
        setIntField(term20764, term20764.getClass(), "sourcePosition", 0);
        setField(term20764, term20764.getClass(), "jsType", null);
        setField(term20764, term20764.getClass(), "parent", null);
        setField(term20758, term20758.getClass(), "first", term20764);
        setIntField(term20765, term20765.getClass(), "type", 0);
        setField(term20765, term20765.getClass(), "next", null);
        setField(term20765, term20765.getClass(), "first", null);
        setField(term20765, term20765.getClass(), "last", null);
        setField(term20765, term20765.getClass(), "propListHead", null);
        setIntField(term20765, term20765.getClass(), "sourcePosition", 0);
        setField(term20765, term20765.getClass(), "jsType", null);
        setField(term20765, term20765.getClass(), "parent", null);
        setField(term20758, term20758.getClass(), "last", term20765);
        setField(term20766, term20766.getClass(), "next", null);
        setIntField(term20766, term20766.getClass(), "type", 0);
        setIntField(term20766, term20766.getClass(), "intValue", 0);
        setField(term20766, term20766.getClass(), "objectValue", null);
        setField(term20758, term20758.getClass(), "propListHead", term20766);
        setIntField(term20758, term20758.getClass(), "sourcePosition", -1607267243);
        setField(term20758, term20758.getClass(), "jsType", null);
        setField(term20758, term20758.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3530;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term3530, term20758));
        assertTrue(recursiveEquals(retValue, false));
    }

};


