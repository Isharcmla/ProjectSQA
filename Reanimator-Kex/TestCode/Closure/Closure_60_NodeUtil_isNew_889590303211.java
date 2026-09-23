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

public class NodeUtil_isNew_889590303211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120;
     Object term10756;

    public NodeUtil_isNew_889590303211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1120, term1120.getClass(), "type", 873659088);
        setIntField(term1122, term1122.getClass(), "type", -1736183862);
        setIntField(term1124, term1124.getClass(), "type", 0);
        setField(term1124, term1124.getClass(), "next", null);
        setField(term1124, term1124.getClass(), "first", null);
        setField(term1124, term1124.getClass(), "last", null);
        setField(term1124, term1124.getClass(), "propListHead", null);
        setIntField(term1124, term1124.getClass(), "sourcePosition", 0);
        setField(term1124, term1124.getClass(), "jsType", null);
        setField(term1124, term1124.getClass(), "parent", null);
        setField(term1122, term1122.getClass(), "next", term1124);
        setIntField(term1127, term1127.getClass(), "type", 0);
        setField(term1127, term1127.getClass(), "next", null);
        setField(term1127, term1127.getClass(), "first", null);
        setField(term1127, term1127.getClass(), "last", null);
        setField(term1127, term1127.getClass(), "propListHead", null);
        setIntField(term1127, term1127.getClass(), "sourcePosition", 0);
        setField(term1127, term1127.getClass(), "jsType", null);
        setField(term1127, term1127.getClass(), "parent", null);
        setField(term1122, term1122.getClass(), "first", term1127);
        setIntField(term1130, term1130.getClass(), "type", 0);
        setField(term1130, term1130.getClass(), "next", null);
        setField(term1130, term1130.getClass(), "first", null);
        setField(term1130, term1130.getClass(), "last", null);
        setField(term1130, term1130.getClass(), "propListHead", null);
        setIntField(term1130, term1130.getClass(), "sourcePosition", 0);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        setField(term1122, term1122.getClass(), "last", term1130);
        setField(term1122, term1122.getClass(), "propListHead", null);
        setIntField(term1122, term1122.getClass(), "sourcePosition", 0);
        setField(term1122, term1122.getClass(), "jsType", null);
        setField(term1122, term1122.getClass(), "parent", null);
        setField(term1120, term1120.getClass(), "next", term1122);
        setIntField(term1134, term1134.getClass(), "type", 0);
        setField(term1134, term1134.getClass(), "next", null);
        setField(term1134, term1134.getClass(), "first", null);
        setField(term1134, term1134.getClass(), "last", null);
        setField(term1134, term1134.getClass(), "propListHead", null);
        setIntField(term1134, term1134.getClass(), "sourcePosition", 0);
        setField(term1134, term1134.getClass(), "jsType", null);
        setField(term1134, term1134.getClass(), "parent", null);
        setField(term1120, term1120.getClass(), "first", term1134);
        setIntField(term1137, term1137.getClass(), "type", 0);
        setField(term1137, term1137.getClass(), "next", null);
        setField(term1137, term1137.getClass(), "first", null);
        setField(term1137, term1137.getClass(), "last", null);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        setField(term1120, term1120.getClass(), "last", term1137);
        setField(term1120, term1120.getClass(), "propListHead", null);
        setIntField(term1120, term1120.getClass(), "sourcePosition", 0);
        setField(term1120, term1120.getClass(), "jsType", null);
        setField(term1120, term1120.getClass(), "parent", null);
        term10756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10756, term10756.getClass(), "type", 873659088);
        setIntField(term10757, term10757.getClass(), "type", -1736183862);
        setIntField(term10758, term10758.getClass(), "type", 0);
        setField(term10758, term10758.getClass(), "next", null);
        setField(term10758, term10758.getClass(), "first", null);
        setField(term10758, term10758.getClass(), "last", null);
        setField(term10758, term10758.getClass(), "propListHead", null);
        setIntField(term10758, term10758.getClass(), "sourcePosition", 0);
        setField(term10758, term10758.getClass(), "jsType", null);
        setField(term10758, term10758.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "next", term10758);
        setIntField(term10759, term10759.getClass(), "type", 0);
        setField(term10759, term10759.getClass(), "next", null);
        setField(term10759, term10759.getClass(), "first", null);
        setField(term10759, term10759.getClass(), "last", null);
        setField(term10759, term10759.getClass(), "propListHead", null);
        setIntField(term10759, term10759.getClass(), "sourcePosition", 0);
        setField(term10759, term10759.getClass(), "jsType", null);
        setField(term10759, term10759.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "first", term10759);
        setIntField(term10760, term10760.getClass(), "type", 0);
        setField(term10760, term10760.getClass(), "next", null);
        setField(term10760, term10760.getClass(), "first", null);
        setField(term10760, term10760.getClass(), "last", null);
        setField(term10760, term10760.getClass(), "propListHead", null);
        setIntField(term10760, term10760.getClass(), "sourcePosition", 0);
        setField(term10760, term10760.getClass(), "jsType", null);
        setField(term10760, term10760.getClass(), "parent", null);
        setField(term10757, term10757.getClass(), "last", term10760);
        setField(term10757, term10757.getClass(), "propListHead", null);
        setIntField(term10757, term10757.getClass(), "sourcePosition", 0);
        setField(term10757, term10757.getClass(), "jsType", null);
        setField(term10757, term10757.getClass(), "parent", null);
        setField(term10756, term10756.getClass(), "next", term10757);
        setIntField(term10761, term10761.getClass(), "type", 0);
        setField(term10761, term10761.getClass(), "next", null);
        setField(term10761, term10761.getClass(), "first", null);
        setField(term10761, term10761.getClass(), "last", null);
        setField(term10761, term10761.getClass(), "propListHead", null);
        setIntField(term10761, term10761.getClass(), "sourcePosition", 0);
        setField(term10761, term10761.getClass(), "jsType", null);
        setField(term10761, term10761.getClass(), "parent", null);
        setField(term10756, term10756.getClass(), "first", term10761);
        setIntField(term10762, term10762.getClass(), "type", 0);
        setField(term10762, term10762.getClass(), "next", null);
        setField(term10762, term10762.getClass(), "first", null);
        setField(term10762, term10762.getClass(), "last", null);
        setField(term10762, term10762.getClass(), "propListHead", null);
        setIntField(term10762, term10762.getClass(), "sourcePosition", 0);
        setField(term10762, term10762.getClass(), "jsType", null);
        setField(term10762, term10762.getClass(), "parent", null);
        setField(term10756, term10756.getClass(), "last", term10762);
        setField(term10756, term10756.getClass(), "propListHead", null);
        setIntField(term10756, term10756.getClass(), "sourcePosition", 0);
        setField(term10756, term10756.getClass(), "jsType", null);
        setField(term10756, term10756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1120;
        Object retValue = callMethod(klass, "isNew", argTypes, null, args);
        assertTrue(recursiveEquals(term1120, term10756));
        assertTrue(recursiveEquals(retValue, false));
    }

};


