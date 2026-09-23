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

public class NodeUtil_constructorCallHasSideEffects_566563438137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;

    public NodeUtil_constructorCallHasSideEffects_566563438137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term472 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term475 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term485 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term462, term462.getClass(), "type", 389427431);
        setIntField(term464, term464.getClass(), "type", -1214628358);
        setIntField(term466, term466.getClass(), "type", 0);
        setField(term466, term466.getClass(), "next", null);
        setField(term466, term466.getClass(), "first", null);
        setField(term466, term466.getClass(), "last", null);
        setField(term466, term466.getClass(), "propListHead", null);
        setIntField(term466, term466.getClass(), "sourcePosition", 0);
        setField(term466, term466.getClass(), "jsType", null);
        setField(term466, term466.getClass(), "parent", null);
        setField(term464, term464.getClass(), "next", term466);
        setIntField(term469, term469.getClass(), "type", 0);
        setField(term469, term469.getClass(), "next", null);
        setField(term469, term469.getClass(), "first", null);
        setField(term469, term469.getClass(), "last", null);
        setField(term469, term469.getClass(), "propListHead", null);
        setIntField(term469, term469.getClass(), "sourcePosition", 0);
        setField(term469, term469.getClass(), "jsType", null);
        setField(term469, term469.getClass(), "parent", null);
        setField(term464, term464.getClass(), "first", term469);
        setIntField(term472, term472.getClass(), "type", 0);
        setField(term472, term472.getClass(), "next", null);
        setField(term472, term472.getClass(), "first", null);
        setField(term472, term472.getClass(), "last", null);
        setField(term472, term472.getClass(), "propListHead", null);
        setIntField(term472, term472.getClass(), "sourcePosition", 0);
        setField(term472, term472.getClass(), "jsType", null);
        setField(term472, term472.getClass(), "parent", null);
        setField(term464, term464.getClass(), "last", term472);
        setField(term475, term475.getClass(), "next", null);
        setIntField(term475, term475.getClass(), "type", 0);
        setIntField(term475, term475.getClass(), "intValue", 0);
        setField(term475, term475.getClass(), "objectValue", null);
        setField(term464, term464.getClass(), "propListHead", term475);
        setIntField(term464, term464.getClass(), "sourcePosition", -1222614956);
        setField(term464, term464.getClass(), "jsType", null);
        setField(term464, term464.getClass(), "parent", null);
        setField(term462, term462.getClass(), "next", term464);
        setIntField(term479, term479.getClass(), "type", 0);
        setField(term479, term479.getClass(), "next", null);
        setField(term479, term479.getClass(), "first", null);
        setField(term479, term479.getClass(), "last", null);
        setField(term479, term479.getClass(), "propListHead", null);
        setIntField(term479, term479.getClass(), "sourcePosition", 0);
        setField(term479, term479.getClass(), "jsType", null);
        setField(term479, term479.getClass(), "parent", null);
        setField(term462, term462.getClass(), "first", term479);
        setIntField(term482, term482.getClass(), "type", 0);
        setField(term482, term482.getClass(), "next", null);
        setField(term482, term482.getClass(), "first", null);
        setField(term482, term482.getClass(), "last", null);
        setField(term482, term482.getClass(), "propListHead", null);
        setIntField(term482, term482.getClass(), "sourcePosition", 0);
        setField(term482, term482.getClass(), "jsType", null);
        setField(term482, term482.getClass(), "parent", null);
        setField(term462, term462.getClass(), "last", term482);
        setField(term485, term485.getClass(), "next", null);
        setIntField(term485, term485.getClass(), "type", 0);
        setIntField(term485, term485.getClass(), "intValue", 0);
        setField(term485, term485.getClass(), "objectValue", null);
        setField(term462, term462.getClass(), "propListHead", term485);
        setIntField(term462, term462.getClass(), "sourcePosition", -1870495012);
        setField(term462, term462.getClass(), "jsType", null);
        setField(term462, term462.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term462;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


