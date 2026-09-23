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

public class NodeUtil_newHasLocalResult_548645321187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;

    public NodeUtil_newHasLocalResult_548645321187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term783, term783.getClass(), "type", 2058711405);
        setIntField(term785, term785.getClass(), "type", 1743683601);
        setIntField(term787, term787.getClass(), "type", -945116798);
        setIntField(term789, term789.getClass(), "type", 1593461795);
        setIntField(term791, term791.getClass(), "type", 515182546);
        setField(term791, term791.getClass(), "next", null);
        setField(term791, term791.getClass(), "first", null);
        setField(term791, term791.getClass(), "last", null);
        setField(term791, term791.getClass(), "propListHead", null);
        setIntField(term791, term791.getClass(), "sourcePosition", 0);
        setField(term791, term791.getClass(), "jsType", null);
        setField(term791, term791.getClass(), "parent", null);
        setField(term789, term789.getClass(), "next", term791);
        setIntField(term794, term794.getClass(), "type", -936895502);
        setField(term794, term794.getClass(), "next", null);
        setField(term794, term794.getClass(), "first", null);
        setField(term794, term794.getClass(), "last", term791);
        setField(term794, term794.getClass(), "propListHead", null);
        setIntField(term794, term794.getClass(), "sourcePosition", 0);
        setField(term794, term794.getClass(), "jsType", null);
        setField(term794, term794.getClass(), "parent", null);
        setField(term789, term789.getClass(), "first", term794);
        setField(term789, term789.getClass(), "last", term787);
        setField(term789, term789.getClass(), "propListHead", null);
        setIntField(term789, term789.getClass(), "sourcePosition", 0);
        setField(term789, term789.getClass(), "jsType", null);
        setField(term789, term789.getClass(), "parent", null);
        setField(term787, term787.getClass(), "next", term789);
        setField(term787, term787.getClass(), "first", term791);
        setIntField(term798, term798.getClass(), "type", 199287428);
        setIntField(term800, term800.getClass(), "type", -1195339592);
        setField(term800, term800.getClass(), "next", null);
        setField(term800, term800.getClass(), "first", term794);
        setField(term800, term800.getClass(), "last", term789);
        setField(term800, term800.getClass(), "propListHead", null);
        setIntField(term800, term800.getClass(), "sourcePosition", 0);
        setField(term800, term800.getClass(), "jsType", null);
        setField(term800, term800.getClass(), "parent", null);
        setField(term798, term798.getClass(), "next", term800);
        setField(term798, term798.getClass(), "first", term785);
        setField(term798, term798.getClass(), "last", term785);
        setField(term798, term798.getClass(), "propListHead", null);
        setIntField(term798, term798.getClass(), "sourcePosition", 0);
        setField(term798, term798.getClass(), "jsType", null);
        setField(term798, term798.getClass(), "parent", null);
        setField(term787, term787.getClass(), "last", term798);
        setField(term787, term787.getClass(), "propListHead", null);
        setIntField(term787, term787.getClass(), "sourcePosition", 0);
        setField(term787, term787.getClass(), "jsType", null);
        setField(term787, term787.getClass(), "parent", null);
        setField(term785, term785.getClass(), "next", term787);
        setIntField(term805, term805.getClass(), "type", -376422566);
        setField(term805, term805.getClass(), "next", term798);
        setField(term805, term805.getClass(), "first", term800);
        setField(term805, term805.getClass(), "last", term783);
        setField(term805, term805.getClass(), "propListHead", null);
        setIntField(term805, term805.getClass(), "sourcePosition", 0);
        setField(term805, term805.getClass(), "jsType", null);
        setField(term805, term805.getClass(), "parent", null);
        setField(term785, term785.getClass(), "first", term805);
        setField(term785, term785.getClass(), "last", term805);
        setField(term785, term785.getClass(), "propListHead", null);
        setIntField(term785, term785.getClass(), "sourcePosition", 0);
        setField(term785, term785.getClass(), "jsType", null);
        setField(term785, term785.getClass(), "parent", null);
        setField(term783, term783.getClass(), "next", term785);
        setField(term783, term783.getClass(), "first", term789);
        setField(term783, term783.getClass(), "last", term791);
        setField(term783, term783.getClass(), "propListHead", null);
        setIntField(term783, term783.getClass(), "sourcePosition", 0);
        setField(term783, term783.getClass(), "jsType", null);
        setField(term783, term783.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term783;
        try {
            callMethod(klass, "newHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


