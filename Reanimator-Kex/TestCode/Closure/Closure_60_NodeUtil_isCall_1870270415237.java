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

public class NodeUtil_isCall_1870270415237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1729;
     Object term14158;

    public NodeUtil_isCall_1870270415237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1729, term1729.getClass(), "type", -2093862988);
        setIntField(term1731, term1731.getClass(), "type", -1695750603);
        setIntField(term1733, term1733.getClass(), "type", 0);
        setField(term1733, term1733.getClass(), "next", null);
        setField(term1733, term1733.getClass(), "first", null);
        setField(term1733, term1733.getClass(), "last", null);
        setField(term1733, term1733.getClass(), "propListHead", null);
        setIntField(term1733, term1733.getClass(), "sourcePosition", 0);
        setField(term1733, term1733.getClass(), "jsType", null);
        setField(term1733, term1733.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "next", term1733);
        setIntField(term1736, term1736.getClass(), "type", 0);
        setField(term1736, term1736.getClass(), "next", null);
        setField(term1736, term1736.getClass(), "first", null);
        setField(term1736, term1736.getClass(), "last", null);
        setField(term1736, term1736.getClass(), "propListHead", null);
        setIntField(term1736, term1736.getClass(), "sourcePosition", 0);
        setField(term1736, term1736.getClass(), "jsType", null);
        setField(term1736, term1736.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "first", term1736);
        setIntField(term1739, term1739.getClass(), "type", 0);
        setField(term1739, term1739.getClass(), "next", null);
        setField(term1739, term1739.getClass(), "first", null);
        setField(term1739, term1739.getClass(), "last", null);
        setField(term1739, term1739.getClass(), "propListHead", null);
        setIntField(term1739, term1739.getClass(), "sourcePosition", 0);
        setField(term1739, term1739.getClass(), "jsType", null);
        setField(term1739, term1739.getClass(), "parent", null);
        setField(term1731, term1731.getClass(), "last", term1739);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "next", term1731);
        setIntField(term1743, term1743.getClass(), "type", 0);
        setField(term1743, term1743.getClass(), "next", null);
        setField(term1743, term1743.getClass(), "first", null);
        setField(term1743, term1743.getClass(), "last", null);
        setField(term1743, term1743.getClass(), "propListHead", null);
        setIntField(term1743, term1743.getClass(), "sourcePosition", 0);
        setField(term1743, term1743.getClass(), "jsType", null);
        setField(term1743, term1743.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "first", term1743);
        setIntField(term1746, term1746.getClass(), "type", 0);
        setField(term1746, term1746.getClass(), "next", null);
        setField(term1746, term1746.getClass(), "first", null);
        setField(term1746, term1746.getClass(), "last", null);
        setField(term1746, term1746.getClass(), "propListHead", null);
        setIntField(term1746, term1746.getClass(), "sourcePosition", 0);
        setField(term1746, term1746.getClass(), "jsType", null);
        setField(term1746, term1746.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "last", term1746);
        setField(term1729, term1729.getClass(), "propListHead", null);
        setIntField(term1729, term1729.getClass(), "sourcePosition", 0);
        setField(term1729, term1729.getClass(), "jsType", null);
        setField(term1729, term1729.getClass(), "parent", null);
        term14158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14158, term14158.getClass(), "type", -2093862988);
        setIntField(term14159, term14159.getClass(), "type", -1695750603);
        setIntField(term14160, term14160.getClass(), "type", 0);
        setField(term14160, term14160.getClass(), "next", null);
        setField(term14160, term14160.getClass(), "first", null);
        setField(term14160, term14160.getClass(), "last", null);
        setField(term14160, term14160.getClass(), "propListHead", null);
        setIntField(term14160, term14160.getClass(), "sourcePosition", 0);
        setField(term14160, term14160.getClass(), "jsType", null);
        setField(term14160, term14160.getClass(), "parent", null);
        setField(term14159, term14159.getClass(), "next", term14160);
        setIntField(term14161, term14161.getClass(), "type", 0);
        setField(term14161, term14161.getClass(), "next", null);
        setField(term14161, term14161.getClass(), "first", null);
        setField(term14161, term14161.getClass(), "last", null);
        setField(term14161, term14161.getClass(), "propListHead", null);
        setIntField(term14161, term14161.getClass(), "sourcePosition", 0);
        setField(term14161, term14161.getClass(), "jsType", null);
        setField(term14161, term14161.getClass(), "parent", null);
        setField(term14159, term14159.getClass(), "first", term14161);
        setIntField(term14162, term14162.getClass(), "type", 0);
        setField(term14162, term14162.getClass(), "next", null);
        setField(term14162, term14162.getClass(), "first", null);
        setField(term14162, term14162.getClass(), "last", null);
        setField(term14162, term14162.getClass(), "propListHead", null);
        setIntField(term14162, term14162.getClass(), "sourcePosition", 0);
        setField(term14162, term14162.getClass(), "jsType", null);
        setField(term14162, term14162.getClass(), "parent", null);
        setField(term14159, term14159.getClass(), "last", term14162);
        setField(term14159, term14159.getClass(), "propListHead", null);
        setIntField(term14159, term14159.getClass(), "sourcePosition", 0);
        setField(term14159, term14159.getClass(), "jsType", null);
        setField(term14159, term14159.getClass(), "parent", null);
        setField(term14158, term14158.getClass(), "next", term14159);
        setIntField(term14163, term14163.getClass(), "type", 0);
        setField(term14163, term14163.getClass(), "next", null);
        setField(term14163, term14163.getClass(), "first", null);
        setField(term14163, term14163.getClass(), "last", null);
        setField(term14163, term14163.getClass(), "propListHead", null);
        setIntField(term14163, term14163.getClass(), "sourcePosition", 0);
        setField(term14163, term14163.getClass(), "jsType", null);
        setField(term14163, term14163.getClass(), "parent", null);
        setField(term14158, term14158.getClass(), "first", term14163);
        setIntField(term14164, term14164.getClass(), "type", 0);
        setField(term14164, term14164.getClass(), "next", null);
        setField(term14164, term14164.getClass(), "first", null);
        setField(term14164, term14164.getClass(), "last", null);
        setField(term14164, term14164.getClass(), "propListHead", null);
        setIntField(term14164, term14164.getClass(), "sourcePosition", 0);
        setField(term14164, term14164.getClass(), "jsType", null);
        setField(term14164, term14164.getClass(), "parent", null);
        setField(term14158, term14158.getClass(), "last", term14164);
        setField(term14158, term14158.getClass(), "propListHead", null);
        setIntField(term14158, term14158.getClass(), "sourcePosition", 0);
        setField(term14158, term14158.getClass(), "jsType", null);
        setField(term14158, term14158.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1729;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1729, term14158));
        assertTrue(recursiveEquals(retValue, false));
    }

};


