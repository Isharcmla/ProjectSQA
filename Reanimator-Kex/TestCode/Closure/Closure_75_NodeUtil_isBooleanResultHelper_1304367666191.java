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

public class NodeUtil_isBooleanResultHelper_1304367666191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;
     Object term10655;

    public NodeUtil_isBooleanResultHelper_1304367666191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1008 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1018 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term995, term995.getClass(), "type", -439048495);
        setIntField(term997, term997.getClass(), "type", 787278105);
        setIntField(term999, term999.getClass(), "type", 0);
        setField(term999, term999.getClass(), "next", null);
        setField(term999, term999.getClass(), "first", null);
        setField(term999, term999.getClass(), "last", null);
        setField(term999, term999.getClass(), "propListHead", null);
        setIntField(term999, term999.getClass(), "sourcePosition", 0);
        setField(term999, term999.getClass(), "jsType", null);
        setField(term999, term999.getClass(), "parent", null);
        setField(term997, term997.getClass(), "next", term999);
        setIntField(term1002, term1002.getClass(), "type", 0);
        setField(term1002, term1002.getClass(), "next", null);
        setField(term1002, term1002.getClass(), "first", null);
        setField(term1002, term1002.getClass(), "last", null);
        setField(term1002, term1002.getClass(), "propListHead", null);
        setIntField(term1002, term1002.getClass(), "sourcePosition", 0);
        setField(term1002, term1002.getClass(), "jsType", null);
        setField(term1002, term1002.getClass(), "parent", null);
        setField(term997, term997.getClass(), "first", term1002);
        setIntField(term1005, term1005.getClass(), "type", 0);
        setField(term1005, term1005.getClass(), "next", null);
        setField(term1005, term1005.getClass(), "first", null);
        setField(term1005, term1005.getClass(), "last", null);
        setField(term1005, term1005.getClass(), "propListHead", null);
        setIntField(term1005, term1005.getClass(), "sourcePosition", 0);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term997, term997.getClass(), "last", term1005);
        setField(term1008, term1008.getClass(), "next", null);
        setIntField(term1008, term1008.getClass(), "type", 0);
        setIntField(term1008, term1008.getClass(), "intValue", 0);
        setField(term1008, term1008.getClass(), "objectValue", null);
        setField(term997, term997.getClass(), "propListHead", term1008);
        setIntField(term997, term997.getClass(), "sourcePosition", 320711637);
        setField(term997, term997.getClass(), "jsType", null);
        setField(term997, term997.getClass(), "parent", null);
        setField(term995, term995.getClass(), "next", term997);
        setIntField(term1012, term1012.getClass(), "type", 0);
        setField(term1012, term1012.getClass(), "next", null);
        setField(term1012, term1012.getClass(), "first", null);
        setField(term1012, term1012.getClass(), "last", null);
        setField(term1012, term1012.getClass(), "propListHead", null);
        setIntField(term1012, term1012.getClass(), "sourcePosition", 0);
        setField(term1012, term1012.getClass(), "jsType", null);
        setField(term1012, term1012.getClass(), "parent", null);
        setField(term995, term995.getClass(), "first", term1012);
        setIntField(term1015, term1015.getClass(), "type", 0);
        setField(term1015, term1015.getClass(), "next", null);
        setField(term1015, term1015.getClass(), "first", null);
        setField(term1015, term1015.getClass(), "last", null);
        setField(term1015, term1015.getClass(), "propListHead", null);
        setIntField(term1015, term1015.getClass(), "sourcePosition", 0);
        setField(term1015, term1015.getClass(), "jsType", null);
        setField(term1015, term1015.getClass(), "parent", null);
        setField(term995, term995.getClass(), "last", term1015);
        setField(term1018, term1018.getClass(), "next", null);
        setIntField(term1018, term1018.getClass(), "type", 0);
        setIntField(term1018, term1018.getClass(), "intValue", 0);
        setField(term1018, term1018.getClass(), "objectValue", null);
        setField(term995, term995.getClass(), "propListHead", term1018);
        setIntField(term995, term995.getClass(), "sourcePosition", 1241164745);
        setField(term995, term995.getClass(), "jsType", null);
        setField(term995, term995.getClass(), "parent", null);
        term10655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10660 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10663 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10655, term10655.getClass(), "type", -439048495);
        setIntField(term10656, term10656.getClass(), "type", 787278105);
        setIntField(term10657, term10657.getClass(), "type", 0);
        setField(term10657, term10657.getClass(), "next", null);
        setField(term10657, term10657.getClass(), "first", null);
        setField(term10657, term10657.getClass(), "last", null);
        setField(term10657, term10657.getClass(), "propListHead", null);
        setIntField(term10657, term10657.getClass(), "sourcePosition", 0);
        setField(term10657, term10657.getClass(), "jsType", null);
        setField(term10657, term10657.getClass(), "parent", null);
        setField(term10656, term10656.getClass(), "next", term10657);
        setIntField(term10658, term10658.getClass(), "type", 0);
        setField(term10658, term10658.getClass(), "next", null);
        setField(term10658, term10658.getClass(), "first", null);
        setField(term10658, term10658.getClass(), "last", null);
        setField(term10658, term10658.getClass(), "propListHead", null);
        setIntField(term10658, term10658.getClass(), "sourcePosition", 0);
        setField(term10658, term10658.getClass(), "jsType", null);
        setField(term10658, term10658.getClass(), "parent", null);
        setField(term10656, term10656.getClass(), "first", term10658);
        setIntField(term10659, term10659.getClass(), "type", 0);
        setField(term10659, term10659.getClass(), "next", null);
        setField(term10659, term10659.getClass(), "first", null);
        setField(term10659, term10659.getClass(), "last", null);
        setField(term10659, term10659.getClass(), "propListHead", null);
        setIntField(term10659, term10659.getClass(), "sourcePosition", 0);
        setField(term10659, term10659.getClass(), "jsType", null);
        setField(term10659, term10659.getClass(), "parent", null);
        setField(term10656, term10656.getClass(), "last", term10659);
        setField(term10660, term10660.getClass(), "next", null);
        setIntField(term10660, term10660.getClass(), "type", 0);
        setIntField(term10660, term10660.getClass(), "intValue", 0);
        setField(term10660, term10660.getClass(), "objectValue", null);
        setField(term10656, term10656.getClass(), "propListHead", term10660);
        setIntField(term10656, term10656.getClass(), "sourcePosition", 320711637);
        setField(term10656, term10656.getClass(), "jsType", null);
        setField(term10656, term10656.getClass(), "parent", null);
        setField(term10655, term10655.getClass(), "next", term10656);
        setIntField(term10661, term10661.getClass(), "type", 0);
        setField(term10661, term10661.getClass(), "next", null);
        setField(term10661, term10661.getClass(), "first", null);
        setField(term10661, term10661.getClass(), "last", null);
        setField(term10661, term10661.getClass(), "propListHead", null);
        setIntField(term10661, term10661.getClass(), "sourcePosition", 0);
        setField(term10661, term10661.getClass(), "jsType", null);
        setField(term10661, term10661.getClass(), "parent", null);
        setField(term10655, term10655.getClass(), "first", term10661);
        setIntField(term10662, term10662.getClass(), "type", 0);
        setField(term10662, term10662.getClass(), "next", null);
        setField(term10662, term10662.getClass(), "first", null);
        setField(term10662, term10662.getClass(), "last", null);
        setField(term10662, term10662.getClass(), "propListHead", null);
        setIntField(term10662, term10662.getClass(), "sourcePosition", 0);
        setField(term10662, term10662.getClass(), "jsType", null);
        setField(term10662, term10662.getClass(), "parent", null);
        setField(term10655, term10655.getClass(), "last", term10662);
        setField(term10663, term10663.getClass(), "next", null);
        setIntField(term10663, term10663.getClass(), "type", 0);
        setIntField(term10663, term10663.getClass(), "intValue", 0);
        setField(term10663, term10663.getClass(), "objectValue", null);
        setField(term10655, term10655.getClass(), "propListHead", term10663);
        setIntField(term10655, term10655.getClass(), "sourcePosition", 1241164745);
        setField(term10655, term10655.getClass(), "jsType", null);
        setField(term10655, term10655.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term995;
        Object retValue = callMethod(klass, "isBooleanResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term995, term10655));
        assertTrue(recursiveEquals(retValue, false));
    }

};


