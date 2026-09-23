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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionToBlockMutator_addDummyAssignment_11413461220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;

    public FunctionToBlockMutator_addDummyAssignment_11413461220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term461 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term438, term438.getClass(), "type", -1963464809);
        setIntField(term440, term440.getClass(), "type", -2063457669);
        setIntField(term442, term442.getClass(), "type", 0);
        setField(term442, term442.getClass(), "next", null);
        setField(term442, term442.getClass(), "first", null);
        setField(term442, term442.getClass(), "last", null);
        setField(term442, term442.getClass(), "propListHead", null);
        setIntField(term442, term442.getClass(), "sourcePosition", 0);
        setField(term442, term442.getClass(), "jsType", null);
        setField(term442, term442.getClass(), "parent", null);
        setField(term440, term440.getClass(), "next", term442);
        setIntField(term445, term445.getClass(), "type", 0);
        setField(term445, term445.getClass(), "next", null);
        setField(term445, term445.getClass(), "first", null);
        setField(term445, term445.getClass(), "last", null);
        setField(term445, term445.getClass(), "propListHead", null);
        setIntField(term445, term445.getClass(), "sourcePosition", 0);
        setField(term445, term445.getClass(), "jsType", null);
        setField(term445, term445.getClass(), "parent", null);
        setField(term440, term440.getClass(), "first", term445);
        setIntField(term448, term448.getClass(), "type", 0);
        setField(term448, term448.getClass(), "next", null);
        setField(term448, term448.getClass(), "first", null);
        setField(term448, term448.getClass(), "last", null);
        setField(term448, term448.getClass(), "propListHead", null);
        setIntField(term448, term448.getClass(), "sourcePosition", 0);
        setField(term448, term448.getClass(), "jsType", null);
        setField(term448, term448.getClass(), "parent", null);
        setField(term440, term440.getClass(), "last", term448);
        setField(term451, term451.getClass(), "next", null);
        setIntField(term451, term451.getClass(), "type", 0);
        setIntField(term451, term451.getClass(), "intValue", 0);
        setField(term451, term451.getClass(), "objectValue", null);
        setField(term440, term440.getClass(), "propListHead", term451);
        setIntField(term440, term440.getClass(), "sourcePosition", -1565502840);
        setField(term440, term440.getClass(), "jsType", null);
        setField(term440, term440.getClass(), "parent", null);
        setField(term438, term438.getClass(), "next", term440);
        setIntField(term455, term455.getClass(), "type", 0);
        setField(term455, term455.getClass(), "next", null);
        setField(term455, term455.getClass(), "first", null);
        setField(term455, term455.getClass(), "last", null);
        setField(term455, term455.getClass(), "propListHead", null);
        setIntField(term455, term455.getClass(), "sourcePosition", 0);
        setField(term455, term455.getClass(), "jsType", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term438, term438.getClass(), "first", term455);
        setIntField(term458, term458.getClass(), "type", 0);
        setField(term458, term458.getClass(), "next", null);
        setField(term458, term458.getClass(), "first", null);
        setField(term458, term458.getClass(), "last", null);
        setField(term458, term458.getClass(), "propListHead", null);
        setIntField(term458, term458.getClass(), "sourcePosition", 0);
        setField(term458, term458.getClass(), "jsType", null);
        setField(term458, term458.getClass(), "parent", null);
        setField(term438, term438.getClass(), "last", term458);
        setField(term461, term461.getClass(), "next", null);
        setIntField(term461, term461.getClass(), "type", 0);
        setIntField(term461, term461.getClass(), "intValue", 0);
        setField(term461, term461.getClass(), "objectValue", null);
        setField(term438, term438.getClass(), "propListHead", term461);
        setIntField(term438, term438.getClass(), "sourcePosition", 344323424);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term438;
        args[1] = "ZiaGIbnzTs";
        try {
            callMethod(klass, "addDummyAssignment", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


