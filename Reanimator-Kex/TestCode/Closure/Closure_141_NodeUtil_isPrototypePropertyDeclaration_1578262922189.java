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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;
     Object term13321;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2576 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2586 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2563, term2563.getClass(), "type", 692873905);
        setIntField(term2565, term2565.getClass(), "type", 760218111);
        setIntField(term2567, term2567.getClass(), "type", 0);
        setField(term2567, term2567.getClass(), "next", null);
        setField(term2567, term2567.getClass(), "first", null);
        setField(term2567, term2567.getClass(), "last", null);
        setField(term2567, term2567.getClass(), "propListHead", null);
        setIntField(term2567, term2567.getClass(), "sourcePosition", 0);
        setField(term2567, term2567.getClass(), "jsType", null);
        setField(term2567, term2567.getClass(), "parent", null);
        setField(term2565, term2565.getClass(), "next", term2567);
        setIntField(term2570, term2570.getClass(), "type", 0);
        setField(term2570, term2570.getClass(), "next", null);
        setField(term2570, term2570.getClass(), "first", null);
        setField(term2570, term2570.getClass(), "last", null);
        setField(term2570, term2570.getClass(), "propListHead", null);
        setIntField(term2570, term2570.getClass(), "sourcePosition", 0);
        setField(term2570, term2570.getClass(), "jsType", null);
        setField(term2570, term2570.getClass(), "parent", null);
        setField(term2565, term2565.getClass(), "first", term2570);
        setIntField(term2573, term2573.getClass(), "type", 0);
        setField(term2573, term2573.getClass(), "next", null);
        setField(term2573, term2573.getClass(), "first", null);
        setField(term2573, term2573.getClass(), "last", null);
        setField(term2573, term2573.getClass(), "propListHead", null);
        setIntField(term2573, term2573.getClass(), "sourcePosition", 0);
        setField(term2573, term2573.getClass(), "jsType", null);
        setField(term2573, term2573.getClass(), "parent", null);
        setField(term2565, term2565.getClass(), "last", term2573);
        setField(term2576, term2576.getClass(), "next", null);
        setIntField(term2576, term2576.getClass(), "type", 0);
        setIntField(term2576, term2576.getClass(), "intValue", 0);
        setField(term2576, term2576.getClass(), "objectValue", null);
        setField(term2565, term2565.getClass(), "propListHead", term2576);
        setIntField(term2565, term2565.getClass(), "sourcePosition", -709868952);
        setField(term2565, term2565.getClass(), "jsType", null);
        setField(term2565, term2565.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "next", term2565);
        setIntField(term2580, term2580.getClass(), "type", 0);
        setField(term2580, term2580.getClass(), "next", null);
        setField(term2580, term2580.getClass(), "first", null);
        setField(term2580, term2580.getClass(), "last", null);
        setField(term2580, term2580.getClass(), "propListHead", null);
        setIntField(term2580, term2580.getClass(), "sourcePosition", 0);
        setField(term2580, term2580.getClass(), "jsType", null);
        setField(term2580, term2580.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "first", term2580);
        setIntField(term2583, term2583.getClass(), "type", 0);
        setField(term2583, term2583.getClass(), "next", null);
        setField(term2583, term2583.getClass(), "first", null);
        setField(term2583, term2583.getClass(), "last", null);
        setField(term2583, term2583.getClass(), "propListHead", null);
        setIntField(term2583, term2583.getClass(), "sourcePosition", 0);
        setField(term2583, term2583.getClass(), "jsType", null);
        setField(term2583, term2583.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "last", term2583);
        setField(term2586, term2586.getClass(), "next", null);
        setIntField(term2586, term2586.getClass(), "type", 0);
        setIntField(term2586, term2586.getClass(), "intValue", 0);
        setField(term2586, term2586.getClass(), "objectValue", null);
        setField(term2563, term2563.getClass(), "propListHead", term2586);
        setIntField(term2563, term2563.getClass(), "sourcePosition", 847207929);
        setField(term2563, term2563.getClass(), "jsType", null);
        setField(term2563, term2563.getClass(), "parent", null);
        term13321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13326 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13329 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13321, term13321.getClass(), "type", 692873905);
        setIntField(term13322, term13322.getClass(), "type", 760218111);
        setIntField(term13323, term13323.getClass(), "type", 0);
        setField(term13323, term13323.getClass(), "next", null);
        setField(term13323, term13323.getClass(), "first", null);
        setField(term13323, term13323.getClass(), "last", null);
        setField(term13323, term13323.getClass(), "propListHead", null);
        setIntField(term13323, term13323.getClass(), "sourcePosition", 0);
        setField(term13323, term13323.getClass(), "jsType", null);
        setField(term13323, term13323.getClass(), "parent", null);
        setField(term13322, term13322.getClass(), "next", term13323);
        setIntField(term13324, term13324.getClass(), "type", 0);
        setField(term13324, term13324.getClass(), "next", null);
        setField(term13324, term13324.getClass(), "first", null);
        setField(term13324, term13324.getClass(), "last", null);
        setField(term13324, term13324.getClass(), "propListHead", null);
        setIntField(term13324, term13324.getClass(), "sourcePosition", 0);
        setField(term13324, term13324.getClass(), "jsType", null);
        setField(term13324, term13324.getClass(), "parent", null);
        setField(term13322, term13322.getClass(), "first", term13324);
        setIntField(term13325, term13325.getClass(), "type", 0);
        setField(term13325, term13325.getClass(), "next", null);
        setField(term13325, term13325.getClass(), "first", null);
        setField(term13325, term13325.getClass(), "last", null);
        setField(term13325, term13325.getClass(), "propListHead", null);
        setIntField(term13325, term13325.getClass(), "sourcePosition", 0);
        setField(term13325, term13325.getClass(), "jsType", null);
        setField(term13325, term13325.getClass(), "parent", null);
        setField(term13322, term13322.getClass(), "last", term13325);
        setField(term13326, term13326.getClass(), "next", null);
        setIntField(term13326, term13326.getClass(), "type", 0);
        setIntField(term13326, term13326.getClass(), "intValue", 0);
        setField(term13326, term13326.getClass(), "objectValue", null);
        setField(term13322, term13322.getClass(), "propListHead", term13326);
        setIntField(term13322, term13322.getClass(), "sourcePosition", -709868952);
        setField(term13322, term13322.getClass(), "jsType", null);
        setField(term13322, term13322.getClass(), "parent", null);
        setField(term13321, term13321.getClass(), "next", term13322);
        setIntField(term13327, term13327.getClass(), "type", 0);
        setField(term13327, term13327.getClass(), "next", null);
        setField(term13327, term13327.getClass(), "first", null);
        setField(term13327, term13327.getClass(), "last", null);
        setField(term13327, term13327.getClass(), "propListHead", null);
        setIntField(term13327, term13327.getClass(), "sourcePosition", 0);
        setField(term13327, term13327.getClass(), "jsType", null);
        setField(term13327, term13327.getClass(), "parent", null);
        setField(term13321, term13321.getClass(), "first", term13327);
        setIntField(term13328, term13328.getClass(), "type", 0);
        setField(term13328, term13328.getClass(), "next", null);
        setField(term13328, term13328.getClass(), "first", null);
        setField(term13328, term13328.getClass(), "last", null);
        setField(term13328, term13328.getClass(), "propListHead", null);
        setIntField(term13328, term13328.getClass(), "sourcePosition", 0);
        setField(term13328, term13328.getClass(), "jsType", null);
        setField(term13328, term13328.getClass(), "parent", null);
        setField(term13321, term13321.getClass(), "last", term13328);
        setField(term13329, term13329.getClass(), "next", null);
        setIntField(term13329, term13329.getClass(), "type", 0);
        setIntField(term13329, term13329.getClass(), "intValue", 0);
        setField(term13329, term13329.getClass(), "objectValue", null);
        setField(term13321, term13321.getClass(), "propListHead", term13329);
        setIntField(term13321, term13321.getClass(), "sourcePosition", 847207929);
        setField(term13321, term13321.getClass(), "jsType", null);
        setField(term13321, term13321.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2563;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2563, term13321));
        assertTrue(recursiveEquals(retValue, false));
    }

};


