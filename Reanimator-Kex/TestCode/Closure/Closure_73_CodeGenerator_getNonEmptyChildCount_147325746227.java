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

public class CodeGenerator_getNonEmptyChildCount_147325746227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2384;
     Object term2411;

    public CodeGenerator_getNonEmptyChildCount_147325746227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2384 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2388 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2397 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2407 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2384, term2384.getClass(), "type", 663292551);
        setIntField(term2386, term2386.getClass(), "type", 197109649);
        setIntField(term2388, term2388.getClass(), "type", 0);
        setField(term2388, term2388.getClass(), "next", null);
        setField(term2388, term2388.getClass(), "first", null);
        setField(term2388, term2388.getClass(), "last", null);
        setField(term2388, term2388.getClass(), "propListHead", null);
        setIntField(term2388, term2388.getClass(), "sourcePosition", 0);
        setField(term2388, term2388.getClass(), "jsType", null);
        setField(term2388, term2388.getClass(), "parent", null);
        setField(term2386, term2386.getClass(), "next", term2388);
        setIntField(term2391, term2391.getClass(), "type", 0);
        setField(term2391, term2391.getClass(), "next", null);
        setField(term2391, term2391.getClass(), "first", null);
        setField(term2391, term2391.getClass(), "last", null);
        setField(term2391, term2391.getClass(), "propListHead", null);
        setIntField(term2391, term2391.getClass(), "sourcePosition", 0);
        setField(term2391, term2391.getClass(), "jsType", null);
        setField(term2391, term2391.getClass(), "parent", null);
        setField(term2386, term2386.getClass(), "first", term2391);
        setIntField(term2394, term2394.getClass(), "type", 0);
        setField(term2394, term2394.getClass(), "next", null);
        setField(term2394, term2394.getClass(), "first", null);
        setField(term2394, term2394.getClass(), "last", null);
        setField(term2394, term2394.getClass(), "propListHead", null);
        setIntField(term2394, term2394.getClass(), "sourcePosition", 0);
        setField(term2394, term2394.getClass(), "jsType", null);
        setField(term2394, term2394.getClass(), "parent", null);
        setField(term2386, term2386.getClass(), "last", term2394);
        setField(term2397, term2397.getClass(), "next", null);
        setIntField(term2397, term2397.getClass(), "type", 0);
        setIntField(term2397, term2397.getClass(), "intValue", 0);
        setField(term2397, term2397.getClass(), "objectValue", null);
        setField(term2386, term2386.getClass(), "propListHead", term2397);
        setIntField(term2386, term2386.getClass(), "sourcePosition", -1504890659);
        setField(term2386, term2386.getClass(), "jsType", null);
        setField(term2386, term2386.getClass(), "parent", null);
        setField(term2384, term2384.getClass(), "next", term2386);
        setIntField(term2401, term2401.getClass(), "type", 0);
        setField(term2401, term2401.getClass(), "next", null);
        setField(term2401, term2401.getClass(), "first", null);
        setField(term2401, term2401.getClass(), "last", null);
        setField(term2401, term2401.getClass(), "propListHead", null);
        setIntField(term2401, term2401.getClass(), "sourcePosition", 0);
        setField(term2401, term2401.getClass(), "jsType", null);
        setField(term2401, term2401.getClass(), "parent", null);
        setField(term2384, term2384.getClass(), "first", term2401);
        setIntField(term2404, term2404.getClass(), "type", 0);
        setField(term2404, term2404.getClass(), "next", null);
        setField(term2404, term2404.getClass(), "first", null);
        setField(term2404, term2404.getClass(), "last", null);
        setField(term2404, term2404.getClass(), "propListHead", null);
        setIntField(term2404, term2404.getClass(), "sourcePosition", 0);
        setField(term2404, term2404.getClass(), "jsType", null);
        setField(term2404, term2404.getClass(), "parent", null);
        setField(term2384, term2384.getClass(), "last", term2404);
        setField(term2407, term2407.getClass(), "next", null);
        setIntField(term2407, term2407.getClass(), "type", 0);
        setIntField(term2407, term2407.getClass(), "intValue", 0);
        setField(term2407, term2407.getClass(), "objectValue", null);
        setField(term2384, term2384.getClass(), "propListHead", term2407);
        setIntField(term2384, term2384.getClass(), "sourcePosition", 1358829571);
        setField(term2384, term2384.getClass(), "jsType", null);
        setField(term2384, term2384.getClass(), "parent", null);
        term2411 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2384;
        args[1] = term2411;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


