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
import java.lang.Object;

public class NodeUtil_functionCallHasSideEffects_2123814750195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;

    public NodeUtil_functionCallHasSideEffects_2123814750195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term729, term729.getClass(), "type", 1959097203);
        setIntField(term731, term731.getClass(), "type", -209654048);
        setIntField(term733, term733.getClass(), "type", 477625804);
        setIntField(term735, term735.getClass(), "type", 252575029);
        setIntField(term737, term737.getClass(), "type", 57189932);
        setField(term737, term737.getClass(), "next", null);
        setField(term737, term737.getClass(), "first", null);
        setField(term737, term737.getClass(), "last", null);
        setField(term737, term737.getClass(), "propListHead", null);
        setIntField(term737, term737.getClass(), "sourcePosition", 0);
        setField(term737, term737.getClass(), "jsType", null);
        setField(term737, term737.getClass(), "parent", null);
        setField(term735, term735.getClass(), "next", term737);
        setIntField(term740, term740.getClass(), "type", 1460722225);
        setField(term740, term740.getClass(), "next", null);
        setField(term740, term740.getClass(), "first", null);
        setField(term740, term740.getClass(), "last", term737);
        setField(term740, term740.getClass(), "propListHead", null);
        setIntField(term740, term740.getClass(), "sourcePosition", 0);
        setField(term740, term740.getClass(), "jsType", null);
        setField(term740, term740.getClass(), "parent", null);
        setField(term735, term735.getClass(), "first", term740);
        setField(term735, term735.getClass(), "last", term733);
        setField(term735, term735.getClass(), "propListHead", null);
        setIntField(term735, term735.getClass(), "sourcePosition", 0);
        setField(term735, term735.getClass(), "jsType", null);
        setField(term735, term735.getClass(), "parent", null);
        setField(term733, term733.getClass(), "next", term735);
        setField(term733, term733.getClass(), "first", term737);
        setIntField(term744, term744.getClass(), "type", 842904495);
        setIntField(term746, term746.getClass(), "type", 1008080511);
        setField(term746, term746.getClass(), "next", null);
        setField(term746, term746.getClass(), "first", term740);
        setField(term746, term746.getClass(), "last", term735);
        setField(term746, term746.getClass(), "propListHead", null);
        setIntField(term746, term746.getClass(), "sourcePosition", 0);
        setField(term746, term746.getClass(), "jsType", null);
        setField(term746, term746.getClass(), "parent", null);
        setField(term744, term744.getClass(), "next", term746);
        setField(term744, term744.getClass(), "first", term731);
        setField(term744, term744.getClass(), "last", term731);
        setField(term744, term744.getClass(), "propListHead", null);
        setIntField(term744, term744.getClass(), "sourcePosition", 0);
        setField(term744, term744.getClass(), "jsType", null);
        setField(term744, term744.getClass(), "parent", null);
        setField(term733, term733.getClass(), "last", term744);
        setField(term733, term733.getClass(), "propListHead", null);
        setIntField(term733, term733.getClass(), "sourcePosition", 0);
        setField(term733, term733.getClass(), "jsType", null);
        setField(term733, term733.getClass(), "parent", null);
        setField(term731, term731.getClass(), "next", term733);
        setIntField(term751, term751.getClass(), "type", 1935707624);
        setField(term751, term751.getClass(), "next", term744);
        setField(term751, term751.getClass(), "first", term746);
        setField(term751, term751.getClass(), "last", term729);
        setField(term751, term751.getClass(), "propListHead", null);
        setIntField(term751, term751.getClass(), "sourcePosition", 0);
        setField(term751, term751.getClass(), "jsType", null);
        setField(term751, term751.getClass(), "parent", null);
        setField(term731, term731.getClass(), "first", term751);
        setField(term731, term731.getClass(), "last", term751);
        setField(term731, term731.getClass(), "propListHead", null);
        setIntField(term731, term731.getClass(), "sourcePosition", 0);
        setField(term731, term731.getClass(), "jsType", null);
        setField(term731, term731.getClass(), "parent", null);
        setField(term729, term729.getClass(), "next", term731);
        setField(term729, term729.getClass(), "first", term735);
        setField(term729, term729.getClass(), "last", term737);
        setField(term729, term729.getClass(), "propListHead", null);
        setIntField(term729, term729.getClass(), "sourcePosition", 0);
        setField(term729, term729.getClass(), "jsType", null);
        setField(term729, term729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term729;
        args[1] = null;
        try {
            callMethod(klass, "functionCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


