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

public class NodeUtil_constructorCallHasSideEffects_1705978240177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;

    public NodeUtil_constructorCallHasSideEffects_1705978240177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term630 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term640 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term617, term617.getClass(), "type", 477625804);
        setIntField(term619, term619.getClass(), "type", 1743224434);
        setIntField(term621, term621.getClass(), "type", 0);
        setField(term621, term621.getClass(), "next", null);
        setField(term621, term621.getClass(), "first", null);
        setField(term621, term621.getClass(), "last", null);
        setField(term621, term621.getClass(), "propListHead", null);
        setIntField(term621, term621.getClass(), "sourcePosition", 0);
        setField(term621, term621.getClass(), "jsType", null);
        setField(term621, term621.getClass(), "parent", null);
        setField(term619, term619.getClass(), "next", term621);
        setIntField(term624, term624.getClass(), "type", 0);
        setField(term624, term624.getClass(), "next", null);
        setField(term624, term624.getClass(), "first", null);
        setField(term624, term624.getClass(), "last", null);
        setField(term624, term624.getClass(), "propListHead", null);
        setIntField(term624, term624.getClass(), "sourcePosition", 0);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        setField(term619, term619.getClass(), "first", term624);
        setIntField(term627, term627.getClass(), "type", 0);
        setField(term627, term627.getClass(), "next", null);
        setField(term627, term627.getClass(), "first", null);
        setField(term627, term627.getClass(), "last", null);
        setField(term627, term627.getClass(), "propListHead", null);
        setIntField(term627, term627.getClass(), "sourcePosition", 0);
        setField(term627, term627.getClass(), "jsType", null);
        setField(term627, term627.getClass(), "parent", null);
        setField(term619, term619.getClass(), "last", term627);
        setField(term630, term630.getClass(), "next", null);
        setIntField(term630, term630.getClass(), "type", 0);
        setIntField(term630, term630.getClass(), "intValue", 0);
        setField(term630, term630.getClass(), "objectValue", null);
        setField(term619, term619.getClass(), "propListHead", term630);
        setIntField(term619, term619.getClass(), "sourcePosition", 1935707624);
        setField(term619, term619.getClass(), "jsType", null);
        setField(term619, term619.getClass(), "parent", null);
        setField(term617, term617.getClass(), "next", term619);
        setIntField(term634, term634.getClass(), "type", 0);
        setField(term634, term634.getClass(), "next", null);
        setField(term634, term634.getClass(), "first", null);
        setField(term634, term634.getClass(), "last", null);
        setField(term634, term634.getClass(), "propListHead", null);
        setIntField(term634, term634.getClass(), "sourcePosition", 0);
        setField(term634, term634.getClass(), "jsType", null);
        setField(term634, term634.getClass(), "parent", null);
        setField(term617, term617.getClass(), "first", term634);
        setIntField(term637, term637.getClass(), "type", 0);
        setField(term637, term637.getClass(), "next", null);
        setField(term637, term637.getClass(), "first", null);
        setField(term637, term637.getClass(), "last", null);
        setField(term637, term637.getClass(), "propListHead", null);
        setIntField(term637, term637.getClass(), "sourcePosition", 0);
        setField(term637, term637.getClass(), "jsType", null);
        setField(term637, term637.getClass(), "parent", null);
        setField(term617, term617.getClass(), "last", term637);
        setField(term640, term640.getClass(), "next", null);
        setIntField(term640, term640.getClass(), "type", 0);
        setIntField(term640, term640.getClass(), "intValue", 0);
        setField(term640, term640.getClass(), "objectValue", null);
        setField(term617, term617.getClass(), "propListHead", term640);
        setIntField(term617, term617.getClass(), "sourcePosition", 1507074215);
        setField(term617, term617.getClass(), "jsType", null);
        setField(term617, term617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term617;
        args[1] = null;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


