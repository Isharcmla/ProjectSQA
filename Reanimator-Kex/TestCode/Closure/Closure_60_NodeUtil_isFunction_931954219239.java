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

public class NodeUtil_isFunction_931954219239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;
     Object term14174;

    public NodeUtil_isFunction_931954219239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1771, term1771.getClass(), "type", 1868344256);
        setIntField(term1773, term1773.getClass(), "type", -932147928);
        setIntField(term1775, term1775.getClass(), "type", 0);
        setField(term1775, term1775.getClass(), "next", null);
        setField(term1775, term1775.getClass(), "first", null);
        setField(term1775, term1775.getClass(), "last", null);
        setField(term1775, term1775.getClass(), "propListHead", null);
        setIntField(term1775, term1775.getClass(), "sourcePosition", 0);
        setField(term1775, term1775.getClass(), "jsType", null);
        setField(term1775, term1775.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "next", term1775);
        setIntField(term1778, term1778.getClass(), "type", 0);
        setField(term1778, term1778.getClass(), "next", null);
        setField(term1778, term1778.getClass(), "first", null);
        setField(term1778, term1778.getClass(), "last", null);
        setField(term1778, term1778.getClass(), "propListHead", null);
        setIntField(term1778, term1778.getClass(), "sourcePosition", 0);
        setField(term1778, term1778.getClass(), "jsType", null);
        setField(term1778, term1778.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "first", term1778);
        setIntField(term1781, term1781.getClass(), "type", 0);
        setField(term1781, term1781.getClass(), "next", null);
        setField(term1781, term1781.getClass(), "first", null);
        setField(term1781, term1781.getClass(), "last", null);
        setField(term1781, term1781.getClass(), "propListHead", null);
        setIntField(term1781, term1781.getClass(), "sourcePosition", 0);
        setField(term1781, term1781.getClass(), "jsType", null);
        setField(term1781, term1781.getClass(), "parent", null);
        setField(term1773, term1773.getClass(), "last", term1781);
        setField(term1773, term1773.getClass(), "propListHead", null);
        setIntField(term1773, term1773.getClass(), "sourcePosition", 0);
        setField(term1773, term1773.getClass(), "jsType", null);
        setField(term1773, term1773.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "next", term1773);
        setIntField(term1785, term1785.getClass(), "type", 0);
        setField(term1785, term1785.getClass(), "next", null);
        setField(term1785, term1785.getClass(), "first", null);
        setField(term1785, term1785.getClass(), "last", null);
        setField(term1785, term1785.getClass(), "propListHead", null);
        setIntField(term1785, term1785.getClass(), "sourcePosition", 0);
        setField(term1785, term1785.getClass(), "jsType", null);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "first", term1785);
        setIntField(term1788, term1788.getClass(), "type", 0);
        setField(term1788, term1788.getClass(), "next", null);
        setField(term1788, term1788.getClass(), "first", null);
        setField(term1788, term1788.getClass(), "last", null);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1771, term1771.getClass(), "last", term1788);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        term14174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14174, term14174.getClass(), "type", 1868344256);
        setIntField(term14175, term14175.getClass(), "type", -932147928);
        setIntField(term14176, term14176.getClass(), "type", 0);
        setField(term14176, term14176.getClass(), "next", null);
        setField(term14176, term14176.getClass(), "first", null);
        setField(term14176, term14176.getClass(), "last", null);
        setField(term14176, term14176.getClass(), "propListHead", null);
        setIntField(term14176, term14176.getClass(), "sourcePosition", 0);
        setField(term14176, term14176.getClass(), "jsType", null);
        setField(term14176, term14176.getClass(), "parent", null);
        setField(term14175, term14175.getClass(), "next", term14176);
        setIntField(term14177, term14177.getClass(), "type", 0);
        setField(term14177, term14177.getClass(), "next", null);
        setField(term14177, term14177.getClass(), "first", null);
        setField(term14177, term14177.getClass(), "last", null);
        setField(term14177, term14177.getClass(), "propListHead", null);
        setIntField(term14177, term14177.getClass(), "sourcePosition", 0);
        setField(term14177, term14177.getClass(), "jsType", null);
        setField(term14177, term14177.getClass(), "parent", null);
        setField(term14175, term14175.getClass(), "first", term14177);
        setIntField(term14178, term14178.getClass(), "type", 0);
        setField(term14178, term14178.getClass(), "next", null);
        setField(term14178, term14178.getClass(), "first", null);
        setField(term14178, term14178.getClass(), "last", null);
        setField(term14178, term14178.getClass(), "propListHead", null);
        setIntField(term14178, term14178.getClass(), "sourcePosition", 0);
        setField(term14178, term14178.getClass(), "jsType", null);
        setField(term14178, term14178.getClass(), "parent", null);
        setField(term14175, term14175.getClass(), "last", term14178);
        setField(term14175, term14175.getClass(), "propListHead", null);
        setIntField(term14175, term14175.getClass(), "sourcePosition", 0);
        setField(term14175, term14175.getClass(), "jsType", null);
        setField(term14175, term14175.getClass(), "parent", null);
        setField(term14174, term14174.getClass(), "next", term14175);
        setIntField(term14179, term14179.getClass(), "type", 0);
        setField(term14179, term14179.getClass(), "next", null);
        setField(term14179, term14179.getClass(), "first", null);
        setField(term14179, term14179.getClass(), "last", null);
        setField(term14179, term14179.getClass(), "propListHead", null);
        setIntField(term14179, term14179.getClass(), "sourcePosition", 0);
        setField(term14179, term14179.getClass(), "jsType", null);
        setField(term14179, term14179.getClass(), "parent", null);
        setField(term14174, term14174.getClass(), "first", term14179);
        setIntField(term14180, term14180.getClass(), "type", 0);
        setField(term14180, term14180.getClass(), "next", null);
        setField(term14180, term14180.getClass(), "first", null);
        setField(term14180, term14180.getClass(), "last", null);
        setField(term14180, term14180.getClass(), "propListHead", null);
        setIntField(term14180, term14180.getClass(), "sourcePosition", 0);
        setField(term14180, term14180.getClass(), "jsType", null);
        setField(term14180, term14180.getClass(), "parent", null);
        setField(term14174, term14174.getClass(), "last", term14180);
        setField(term14174, term14174.getClass(), "propListHead", null);
        setIntField(term14174, term14174.getClass(), "sourcePosition", 0);
        setField(term14174, term14174.getClass(), "jsType", null);
        setField(term14174, term14174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1771;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1771, term14174));
        assertTrue(recursiveEquals(retValue, false));
    }

};


