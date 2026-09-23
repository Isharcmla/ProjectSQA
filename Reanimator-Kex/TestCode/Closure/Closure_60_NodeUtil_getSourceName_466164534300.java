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

public class NodeUtil_getSourceName_466164534300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3430;
     Object term24154;

    public NodeUtil_getSourceName_466164534300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3430, term3430.getClass(), "type", 1641377218);
        setIntField(term3432, term3432.getClass(), "type", -91068927);
        setIntField(term3434, term3434.getClass(), "type", 0);
        setField(term3434, term3434.getClass(), "next", null);
        setField(term3434, term3434.getClass(), "first", null);
        setField(term3434, term3434.getClass(), "last", null);
        setField(term3434, term3434.getClass(), "propListHead", null);
        setIntField(term3434, term3434.getClass(), "sourcePosition", 0);
        setField(term3434, term3434.getClass(), "jsType", null);
        setField(term3434, term3434.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "next", term3434);
        setIntField(term3437, term3437.getClass(), "type", 0);
        setField(term3437, term3437.getClass(), "next", null);
        setField(term3437, term3437.getClass(), "first", null);
        setField(term3437, term3437.getClass(), "last", null);
        setField(term3437, term3437.getClass(), "propListHead", null);
        setIntField(term3437, term3437.getClass(), "sourcePosition", 0);
        setField(term3437, term3437.getClass(), "jsType", null);
        setField(term3437, term3437.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "first", term3437);
        setIntField(term3440, term3440.getClass(), "type", 0);
        setField(term3440, term3440.getClass(), "next", null);
        setField(term3440, term3440.getClass(), "first", null);
        setField(term3440, term3440.getClass(), "last", null);
        setField(term3440, term3440.getClass(), "propListHead", null);
        setIntField(term3440, term3440.getClass(), "sourcePosition", 0);
        setField(term3440, term3440.getClass(), "jsType", null);
        setField(term3440, term3440.getClass(), "parent", null);
        setField(term3432, term3432.getClass(), "last", term3440);
        setField(term3432, term3432.getClass(), "propListHead", null);
        setIntField(term3432, term3432.getClass(), "sourcePosition", 0);
        setField(term3432, term3432.getClass(), "jsType", null);
        setField(term3432, term3432.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "next", term3432);
        setIntField(term3444, term3444.getClass(), "type", 0);
        setField(term3444, term3444.getClass(), "next", null);
        setField(term3444, term3444.getClass(), "first", null);
        setField(term3444, term3444.getClass(), "last", null);
        setField(term3444, term3444.getClass(), "propListHead", null);
        setIntField(term3444, term3444.getClass(), "sourcePosition", 0);
        setField(term3444, term3444.getClass(), "jsType", null);
        setField(term3444, term3444.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "first", term3444);
        setIntField(term3447, term3447.getClass(), "type", 0);
        setField(term3447, term3447.getClass(), "next", null);
        setField(term3447, term3447.getClass(), "first", null);
        setField(term3447, term3447.getClass(), "last", null);
        setField(term3447, term3447.getClass(), "propListHead", null);
        setIntField(term3447, term3447.getClass(), "sourcePosition", 0);
        setField(term3447, term3447.getClass(), "jsType", null);
        setField(term3447, term3447.getClass(), "parent", null);
        setField(term3430, term3430.getClass(), "last", term3447);
        setField(term3430, term3430.getClass(), "propListHead", null);
        setIntField(term3430, term3430.getClass(), "sourcePosition", 0);
        setField(term3430, term3430.getClass(), "jsType", null);
        setField(term3430, term3430.getClass(), "parent", null);
        term24154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24154, term24154.getClass(), "type", 1641377218);
        setIntField(term24155, term24155.getClass(), "type", -91068927);
        setIntField(term24156, term24156.getClass(), "type", 0);
        setField(term24156, term24156.getClass(), "next", null);
        setField(term24156, term24156.getClass(), "first", null);
        setField(term24156, term24156.getClass(), "last", null);
        setField(term24156, term24156.getClass(), "propListHead", null);
        setIntField(term24156, term24156.getClass(), "sourcePosition", 0);
        setField(term24156, term24156.getClass(), "jsType", null);
        setField(term24156, term24156.getClass(), "parent", null);
        setField(term24155, term24155.getClass(), "next", term24156);
        setIntField(term24157, term24157.getClass(), "type", 0);
        setField(term24157, term24157.getClass(), "next", null);
        setField(term24157, term24157.getClass(), "first", null);
        setField(term24157, term24157.getClass(), "last", null);
        setField(term24157, term24157.getClass(), "propListHead", null);
        setIntField(term24157, term24157.getClass(), "sourcePosition", 0);
        setField(term24157, term24157.getClass(), "jsType", null);
        setField(term24157, term24157.getClass(), "parent", null);
        setField(term24155, term24155.getClass(), "first", term24157);
        setIntField(term24158, term24158.getClass(), "type", 0);
        setField(term24158, term24158.getClass(), "next", null);
        setField(term24158, term24158.getClass(), "first", null);
        setField(term24158, term24158.getClass(), "last", null);
        setField(term24158, term24158.getClass(), "propListHead", null);
        setIntField(term24158, term24158.getClass(), "sourcePosition", 0);
        setField(term24158, term24158.getClass(), "jsType", null);
        setField(term24158, term24158.getClass(), "parent", null);
        setField(term24155, term24155.getClass(), "last", term24158);
        setField(term24155, term24155.getClass(), "propListHead", null);
        setIntField(term24155, term24155.getClass(), "sourcePosition", 0);
        setField(term24155, term24155.getClass(), "jsType", null);
        setField(term24155, term24155.getClass(), "parent", null);
        setField(term24154, term24154.getClass(), "next", term24155);
        setIntField(term24159, term24159.getClass(), "type", 0);
        setField(term24159, term24159.getClass(), "next", null);
        setField(term24159, term24159.getClass(), "first", null);
        setField(term24159, term24159.getClass(), "last", null);
        setField(term24159, term24159.getClass(), "propListHead", null);
        setIntField(term24159, term24159.getClass(), "sourcePosition", 0);
        setField(term24159, term24159.getClass(), "jsType", null);
        setField(term24159, term24159.getClass(), "parent", null);
        setField(term24154, term24154.getClass(), "first", term24159);
        setIntField(term24160, term24160.getClass(), "type", 0);
        setField(term24160, term24160.getClass(), "next", null);
        setField(term24160, term24160.getClass(), "first", null);
        setField(term24160, term24160.getClass(), "last", null);
        setField(term24160, term24160.getClass(), "propListHead", null);
        setIntField(term24160, term24160.getClass(), "sourcePosition", 0);
        setField(term24160, term24160.getClass(), "jsType", null);
        setField(term24160, term24160.getClass(), "parent", null);
        setField(term24154, term24154.getClass(), "last", term24160);
        setField(term24154, term24154.getClass(), "propListHead", null);
        setIntField(term24154, term24154.getClass(), "sourcePosition", 0);
        setField(term24154, term24154.getClass(), "jsType", null);
        setField(term24154, term24154.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3430;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term3430, term24154));
    }

};


