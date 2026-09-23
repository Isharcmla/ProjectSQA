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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3697916;
     Object term3698008;
     Object term3699450;
     Object term3699451;
     Object term3699155;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3697916 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3698008 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3698100 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3698192 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3698284 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3698414 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3698100, term3698100.getClass(), "type", 35);
        setIntField(term3698284, term3698284.getClass(), "type", 40);
        setField(term3698284, term3698284.getClass(), "str", "charCodeAt");
        setField(term3698192, term3698192.getClass(), "next", term3698284);
        setIntField(term3698192, term3698192.getClass(), "type", 40);
        setField(term3698100, term3698100.getClass(), "first", term3698192);
        setIntField(term3698414, term3698414.getClass(), "type", 43);
        setField(term3698100, term3698100.getClass(), "next", term3698414);
        setField(term3698008, term3698008.getClass(), "first", term3698100);
        setIntField(term3698008, term3698008.getClass(), "type", 37);
        term3699450 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3699450, term3699450.getClass(), "currentTraversal", null);
        term3699451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699452 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699455 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3699451, term3699451.getClass(), "str", null);
        setIntField(term3699451, term3699451.getClass(), "type", 37);
        setField(term3699451, term3699451.getClass(), "next", null);
        setField(term3699452, term3699452.getClass(), "str", null);
        setIntField(term3699452, term3699452.getClass(), "type", 35);
        setField(term3699453, term3699453.getClass(), "str", null);
        setIntField(term3699453, term3699453.getClass(), "type", 43);
        setField(term3699453, term3699453.getClass(), "next", null);
        setField(term3699453, term3699453.getClass(), "first", null);
        setField(term3699453, term3699453.getClass(), "last", null);
        setField(term3699453, term3699453.getClass(), "propListHead", null);
        setIntField(term3699453, term3699453.getClass(), "sourcePosition", 0);
        setField(term3699453, term3699453.getClass(), "jsType", null);
        setField(term3699453, term3699453.getClass(), "parent", null);
        setField(term3699452, term3699452.getClass(), "next", term3699453);
        setField(term3699454, term3699454.getClass(), "str", null);
        setIntField(term3699454, term3699454.getClass(), "type", 40);
        setField(term3699455, term3699455.getClass(), "str", "");
        setIntField(term3699455, term3699455.getClass(), "type", 40);
        setField(term3699455, term3699455.getClass(), "next", null);
        setField(term3699455, term3699455.getClass(), "first", null);
        setField(term3699455, term3699455.getClass(), "last", null);
        setField(term3699455, term3699455.getClass(), "propListHead", null);
        setIntField(term3699455, term3699455.getClass(), "sourcePosition", 0);
        setField(term3699455, term3699455.getClass(), "jsType", null);
        setField(term3699455, term3699455.getClass(), "parent", null);
        setField(term3699454, term3699454.getClass(), "next", term3699455);
        setField(term3699454, term3699454.getClass(), "first", null);
        setField(term3699454, term3699454.getClass(), "last", null);
        setField(term3699454, term3699454.getClass(), "propListHead", null);
        setIntField(term3699454, term3699454.getClass(), "sourcePosition", 0);
        setField(term3699454, term3699454.getClass(), "jsType", null);
        setField(term3699454, term3699454.getClass(), "parent", null);
        setField(term3699452, term3699452.getClass(), "first", term3699454);
        setField(term3699452, term3699452.getClass(), "last", null);
        setField(term3699452, term3699452.getClass(), "propListHead", null);
        setIntField(term3699452, term3699452.getClass(), "sourcePosition", 0);
        setField(term3699452, term3699452.getClass(), "jsType", null);
        setField(term3699452, term3699452.getClass(), "parent", null);
        setField(term3699451, term3699451.getClass(), "first", term3699452);
        setField(term3699451, term3699451.getClass(), "last", null);
        setField(term3699451, term3699451.getClass(), "propListHead", null);
        setIntField(term3699451, term3699451.getClass(), "sourcePosition", 0);
        setField(term3699451, term3699451.getClass(), "jsType", null);
        setField(term3699451, term3699451.getClass(), "parent", null);
        term3699155 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699159 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699162 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3699164 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3699155, term3699155.getClass(), "str", null);
        setIntField(term3699155, term3699155.getClass(), "type", 37);
        setField(term3699155, term3699155.getClass(), "next", null);
        setField(term3699157, term3699157.getClass(), "str", null);
        setIntField(term3699157, term3699157.getClass(), "type", 35);
        setField(term3699159, term3699159.getClass(), "str", null);
        setIntField(term3699159, term3699159.getClass(), "type", 43);
        setField(term3699159, term3699159.getClass(), "next", null);
        setField(term3699159, term3699159.getClass(), "first", null);
        setField(term3699159, term3699159.getClass(), "last", null);
        setField(term3699159, term3699159.getClass(), "propListHead", null);
        setIntField(term3699159, term3699159.getClass(), "sourcePosition", 0);
        setField(term3699159, term3699159.getClass(), "jsType", null);
        setField(term3699159, term3699159.getClass(), "parent", null);
        setField(term3699157, term3699157.getClass(), "next", term3699159);
        setField(term3699162, term3699162.getClass(), "str", null);
        setIntField(term3699162, term3699162.getClass(), "type", 40);
        setField(term3699164, term3699164.getClass(), "str", "");
        setIntField(term3699164, term3699164.getClass(), "type", 40);
        setField(term3699164, term3699164.getClass(), "next", null);
        setField(term3699164, term3699164.getClass(), "first", null);
        setField(term3699164, term3699164.getClass(), "last", null);
        setField(term3699164, term3699164.getClass(), "propListHead", null);
        setIntField(term3699164, term3699164.getClass(), "sourcePosition", 0);
        setField(term3699164, term3699164.getClass(), "jsType", null);
        setField(term3699164, term3699164.getClass(), "parent", null);
        setField(term3699162, term3699162.getClass(), "next", term3699164);
        setField(term3699162, term3699162.getClass(), "first", null);
        setField(term3699162, term3699162.getClass(), "last", null);
        setField(term3699162, term3699162.getClass(), "propListHead", null);
        setIntField(term3699162, term3699162.getClass(), "sourcePosition", 0);
        setField(term3699162, term3699162.getClass(), "jsType", null);
        setField(term3699162, term3699162.getClass(), "parent", null);
        setField(term3699157, term3699157.getClass(), "first", term3699162);
        setField(term3699157, term3699157.getClass(), "last", null);
        setField(term3699157, term3699157.getClass(), "propListHead", null);
        setIntField(term3699157, term3699157.getClass(), "sourcePosition", 0);
        setField(term3699157, term3699157.getClass(), "jsType", null);
        setField(term3699157, term3699157.getClass(), "parent", null);
        setField(term3699155, term3699155.getClass(), "first", term3699157);
        setField(term3699155, term3699155.getClass(), "last", null);
        setField(term3699155, term3699155.getClass(), "propListHead", null);
        setIntField(term3699155, term3699155.getClass(), "sourcePosition", 0);
        setField(term3699155, term3699155.getClass(), "jsType", null);
        setField(term3699155, term3699155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3698008;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3697916, args);
        assertTrue(recursiveEquals(term3697916, term3699450));
        assertTrue(recursiveEquals(term3698008, term3699451));
        assertTrue(recursiveEquals(retValue, term3699155));
    }

};


