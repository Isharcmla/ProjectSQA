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

public class NodeUtil_isPrototypeProperty_1449633110188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;
     Object term13297;

    public NodeUtil_isPrototypeProperty_1449633110188() {
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
        term13297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13302 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13305 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13297, term13297.getClass(), "type", 692873905);
        setIntField(term13298, term13298.getClass(), "type", 760218111);
        setIntField(term13299, term13299.getClass(), "type", 0);
        setField(term13299, term13299.getClass(), "next", null);
        setField(term13299, term13299.getClass(), "first", null);
        setField(term13299, term13299.getClass(), "last", null);
        setField(term13299, term13299.getClass(), "propListHead", null);
        setIntField(term13299, term13299.getClass(), "sourcePosition", 0);
        setField(term13299, term13299.getClass(), "jsType", null);
        setField(term13299, term13299.getClass(), "parent", null);
        setField(term13298, term13298.getClass(), "next", term13299);
        setIntField(term13300, term13300.getClass(), "type", 0);
        setField(term13300, term13300.getClass(), "next", null);
        setField(term13300, term13300.getClass(), "first", null);
        setField(term13300, term13300.getClass(), "last", null);
        setField(term13300, term13300.getClass(), "propListHead", null);
        setIntField(term13300, term13300.getClass(), "sourcePosition", 0);
        setField(term13300, term13300.getClass(), "jsType", null);
        setField(term13300, term13300.getClass(), "parent", null);
        setField(term13298, term13298.getClass(), "first", term13300);
        setIntField(term13301, term13301.getClass(), "type", 0);
        setField(term13301, term13301.getClass(), "next", null);
        setField(term13301, term13301.getClass(), "first", null);
        setField(term13301, term13301.getClass(), "last", null);
        setField(term13301, term13301.getClass(), "propListHead", null);
        setIntField(term13301, term13301.getClass(), "sourcePosition", 0);
        setField(term13301, term13301.getClass(), "jsType", null);
        setField(term13301, term13301.getClass(), "parent", null);
        setField(term13298, term13298.getClass(), "last", term13301);
        setField(term13302, term13302.getClass(), "next", null);
        setIntField(term13302, term13302.getClass(), "type", 0);
        setIntField(term13302, term13302.getClass(), "intValue", 0);
        setField(term13302, term13302.getClass(), "objectValue", null);
        setField(term13298, term13298.getClass(), "propListHead", term13302);
        setIntField(term13298, term13298.getClass(), "sourcePosition", -709868952);
        setField(term13298, term13298.getClass(), "jsType", null);
        setField(term13298, term13298.getClass(), "parent", null);
        setField(term13297, term13297.getClass(), "next", term13298);
        setIntField(term13303, term13303.getClass(), "type", 0);
        setField(term13303, term13303.getClass(), "next", null);
        setField(term13303, term13303.getClass(), "first", null);
        setField(term13303, term13303.getClass(), "last", null);
        setField(term13303, term13303.getClass(), "propListHead", null);
        setIntField(term13303, term13303.getClass(), "sourcePosition", 0);
        setField(term13303, term13303.getClass(), "jsType", null);
        setField(term13303, term13303.getClass(), "parent", null);
        setField(term13297, term13297.getClass(), "first", term13303);
        setIntField(term13304, term13304.getClass(), "type", 0);
        setField(term13304, term13304.getClass(), "next", null);
        setField(term13304, term13304.getClass(), "first", null);
        setField(term13304, term13304.getClass(), "last", null);
        setField(term13304, term13304.getClass(), "propListHead", null);
        setIntField(term13304, term13304.getClass(), "sourcePosition", 0);
        setField(term13304, term13304.getClass(), "jsType", null);
        setField(term13304, term13304.getClass(), "parent", null);
        setField(term13297, term13297.getClass(), "last", term13304);
        setField(term13305, term13305.getClass(), "next", null);
        setIntField(term13305, term13305.getClass(), "type", 0);
        setIntField(term13305, term13305.getClass(), "intValue", 0);
        setField(term13305, term13305.getClass(), "objectValue", null);
        setField(term13297, term13297.getClass(), "propListHead", term13305);
        setIntField(term13297, term13297.getClass(), "sourcePosition", 847207929);
        setField(term13297, term13297.getClass(), "jsType", null);
        setField(term13297, term13297.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2563;
        Object retValue = callMethod(klass, "isPrototypeProperty", argTypes, null, args);
        assertTrue(recursiveEquals(term2563, term13297));
        assertTrue(recursiveEquals(retValue, false));
    }

};


