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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term895193;
     Object term895285;
     Object term896046;
     Object term896047;
     Object term895978;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term895193 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term895285 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895469 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895561 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term895469, term895469.getClass(), "first", term895561);
        setField(term895377, term895377.getClass(), "next", term895469);
        setField(term895285, term895285.getClass(), "first", term895377);
        setIntField(term895285, term895285.getClass(), "type", 86);
        term896046 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term896046, term896046.getClass(), "currentTraversal", null);
        term896047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term896048 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term896049 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term896050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term896047, term896047.getClass(), "number", 0.0);
        setIntField(term896047, term896047.getClass(), "type", 86);
        setField(term896047, term896047.getClass(), "next", null);
        setDoubleField(term896048, term896048.getClass(), "number", 0.0);
        setIntField(term896048, term896048.getClass(), "type", 0);
        setDoubleField(term896049, term896049.getClass(), "number", 0.0);
        setIntField(term896049, term896049.getClass(), "type", 0);
        setField(term896049, term896049.getClass(), "next", null);
        setField(term896050, term896050.getClass(), "str", null);
        setIntField(term896050, term896050.getClass(), "type", 0);
        setField(term896050, term896050.getClass(), "next", null);
        setField(term896050, term896050.getClass(), "first", null);
        setField(term896050, term896050.getClass(), "last", null);
        setField(term896050, term896050.getClass(), "propListHead", null);
        setIntField(term896050, term896050.getClass(), "sourcePosition", 0);
        setField(term896050, term896050.getClass(), "jsType", null);
        setField(term896050, term896050.getClass(), "parent", null);
        setField(term896049, term896049.getClass(), "first", term896050);
        setField(term896049, term896049.getClass(), "last", null);
        setField(term896049, term896049.getClass(), "propListHead", null);
        setIntField(term896049, term896049.getClass(), "sourcePosition", 0);
        setField(term896049, term896049.getClass(), "jsType", null);
        setField(term896049, term896049.getClass(), "parent", null);
        setField(term896048, term896048.getClass(), "next", term896049);
        setField(term896048, term896048.getClass(), "first", null);
        setField(term896048, term896048.getClass(), "last", null);
        setField(term896048, term896048.getClass(), "propListHead", null);
        setIntField(term896048, term896048.getClass(), "sourcePosition", 0);
        setField(term896048, term896048.getClass(), "jsType", null);
        setField(term896048, term896048.getClass(), "parent", null);
        setField(term896047, term896047.getClass(), "first", term896048);
        setField(term896047, term896047.getClass(), "last", null);
        setField(term896047, term896047.getClass(), "propListHead", null);
        setIntField(term896047, term896047.getClass(), "sourcePosition", 0);
        setField(term896047, term896047.getClass(), "jsType", null);
        setField(term896047, term896047.getClass(), "parent", null);
        term895978 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895984 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term895987 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term895978, term895978.getClass(), "number", 0.0);
        setIntField(term895978, term895978.getClass(), "type", 86);
        setField(term895978, term895978.getClass(), "next", null);
        setDoubleField(term895981, term895981.getClass(), "number", 0.0);
        setIntField(term895981, term895981.getClass(), "type", 0);
        setDoubleField(term895984, term895984.getClass(), "number", 0.0);
        setIntField(term895984, term895984.getClass(), "type", 0);
        setField(term895984, term895984.getClass(), "next", null);
        setField(term895987, term895987.getClass(), "str", null);
        setIntField(term895987, term895987.getClass(), "type", 0);
        setField(term895987, term895987.getClass(), "next", null);
        setField(term895987, term895987.getClass(), "first", null);
        setField(term895987, term895987.getClass(), "last", null);
        setField(term895987, term895987.getClass(), "propListHead", null);
        setIntField(term895987, term895987.getClass(), "sourcePosition", 0);
        setField(term895987, term895987.getClass(), "jsType", null);
        setField(term895987, term895987.getClass(), "parent", null);
        setField(term895984, term895984.getClass(), "first", term895987);
        setField(term895984, term895984.getClass(), "last", null);
        setField(term895984, term895984.getClass(), "propListHead", null);
        setIntField(term895984, term895984.getClass(), "sourcePosition", 0);
        setField(term895984, term895984.getClass(), "jsType", null);
        setField(term895984, term895984.getClass(), "parent", null);
        setField(term895981, term895981.getClass(), "next", term895984);
        setField(term895981, term895981.getClass(), "first", null);
        setField(term895981, term895981.getClass(), "last", null);
        setField(term895981, term895981.getClass(), "propListHead", null);
        setIntField(term895981, term895981.getClass(), "sourcePosition", 0);
        setField(term895981, term895981.getClass(), "jsType", null);
        setField(term895981, term895981.getClass(), "parent", null);
        setField(term895978, term895978.getClass(), "first", term895981);
        setField(term895978, term895978.getClass(), "last", null);
        setField(term895978, term895978.getClass(), "propListHead", null);
        setIntField(term895978, term895978.getClass(), "sourcePosition", 0);
        setField(term895978, term895978.getClass(), "jsType", null);
        setField(term895978, term895978.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term895285;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term895193, args);
        assertTrue(recursiveEquals(term895193, term896046));
        assertTrue(recursiveEquals(term895285, term896047));
        assertTrue(recursiveEquals(retValue, term895978));
    }

};


