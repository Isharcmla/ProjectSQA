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
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2340;
     Object term2367;

    public CodeGenerator_getNonEmptyChildCount_147325746225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2353 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2363 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2340, term2340.getClass(), "type", 663292551);
        setIntField(term2342, term2342.getClass(), "type", 197109649);
        setIntField(term2344, term2344.getClass(), "type", 0);
        setField(term2344, term2344.getClass(), "next", null);
        setField(term2344, term2344.getClass(), "first", null);
        setField(term2344, term2344.getClass(), "last", null);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "next", term2344);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setField(term2347, term2347.getClass(), "next", null);
        setField(term2347, term2347.getClass(), "first", null);
        setField(term2347, term2347.getClass(), "last", null);
        setField(term2347, term2347.getClass(), "propListHead", null);
        setIntField(term2347, term2347.getClass(), "sourcePosition", 0);
        setField(term2347, term2347.getClass(), "jsType", null);
        setField(term2347, term2347.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "first", term2347);
        setIntField(term2350, term2350.getClass(), "type", 0);
        setField(term2350, term2350.getClass(), "next", null);
        setField(term2350, term2350.getClass(), "first", null);
        setField(term2350, term2350.getClass(), "last", null);
        setField(term2350, term2350.getClass(), "propListHead", null);
        setIntField(term2350, term2350.getClass(), "sourcePosition", 0);
        setField(term2350, term2350.getClass(), "jsType", null);
        setField(term2350, term2350.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "last", term2350);
        setField(term2353, term2353.getClass(), "next", null);
        setIntField(term2353, term2353.getClass(), "type", 0);
        setIntField(term2353, term2353.getClass(), "intValue", 0);
        setField(term2353, term2353.getClass(), "objectValue", null);
        setField(term2342, term2342.getClass(), "propListHead", term2353);
        setIntField(term2342, term2342.getClass(), "sourcePosition", -1504890659);
        setField(term2342, term2342.getClass(), "jsType", null);
        setField(term2342, term2342.getClass(), "parent", null);
        setField(term2340, term2340.getClass(), "next", term2342);
        setIntField(term2357, term2357.getClass(), "type", 0);
        setField(term2357, term2357.getClass(), "next", null);
        setField(term2357, term2357.getClass(), "first", null);
        setField(term2357, term2357.getClass(), "last", null);
        setField(term2357, term2357.getClass(), "propListHead", null);
        setIntField(term2357, term2357.getClass(), "sourcePosition", 0);
        setField(term2357, term2357.getClass(), "jsType", null);
        setField(term2357, term2357.getClass(), "parent", null);
        setField(term2340, term2340.getClass(), "first", term2357);
        setIntField(term2360, term2360.getClass(), "type", 0);
        setField(term2360, term2360.getClass(), "next", null);
        setField(term2360, term2360.getClass(), "first", null);
        setField(term2360, term2360.getClass(), "last", null);
        setField(term2360, term2360.getClass(), "propListHead", null);
        setIntField(term2360, term2360.getClass(), "sourcePosition", 0);
        setField(term2360, term2360.getClass(), "jsType", null);
        setField(term2360, term2360.getClass(), "parent", null);
        setField(term2340, term2340.getClass(), "last", term2360);
        setField(term2363, term2363.getClass(), "next", null);
        setIntField(term2363, term2363.getClass(), "type", 0);
        setIntField(term2363, term2363.getClass(), "intValue", 0);
        setField(term2363, term2363.getClass(), "objectValue", null);
        setField(term2340, term2340.getClass(), "propListHead", term2363);
        setIntField(term2340, term2340.getClass(), "sourcePosition", 1358829571);
        setField(term2340, term2340.getClass(), "jsType", null);
        setField(term2340, term2340.getClass(), "parent", null);
        term2367 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2340;
        args[1] = term2367;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


