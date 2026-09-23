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

public class CodeGenerator_getFirstNonEmptyChild_162111751029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2537;

    public CodeGenerator_getFirstNonEmptyChild_162111751029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2537, term2537.getClass(), "type", -227365013);
        setIntField(term2539, term2539.getClass(), "type", -523949691);
        setIntField(term2541, term2541.getClass(), "type", 0);
        setField(term2541, term2541.getClass(), "next", null);
        setField(term2541, term2541.getClass(), "first", null);
        setField(term2541, term2541.getClass(), "last", null);
        setField(term2541, term2541.getClass(), "propListHead", null);
        setIntField(term2541, term2541.getClass(), "sourcePosition", 0);
        setField(term2541, term2541.getClass(), "jsType", null);
        setField(term2541, term2541.getClass(), "parent", null);
        setField(term2539, term2539.getClass(), "next", term2541);
        setIntField(term2544, term2544.getClass(), "type", 0);
        setField(term2544, term2544.getClass(), "next", null);
        setField(term2544, term2544.getClass(), "first", null);
        setField(term2544, term2544.getClass(), "last", null);
        setField(term2544, term2544.getClass(), "propListHead", null);
        setIntField(term2544, term2544.getClass(), "sourcePosition", 0);
        setField(term2544, term2544.getClass(), "jsType", null);
        setField(term2544, term2544.getClass(), "parent", null);
        setField(term2539, term2539.getClass(), "first", term2544);
        setIntField(term2547, term2547.getClass(), "type", 0);
        setField(term2547, term2547.getClass(), "next", null);
        setField(term2547, term2547.getClass(), "first", null);
        setField(term2547, term2547.getClass(), "last", null);
        setField(term2547, term2547.getClass(), "propListHead", null);
        setIntField(term2547, term2547.getClass(), "sourcePosition", 0);
        setField(term2547, term2547.getClass(), "jsType", null);
        setField(term2547, term2547.getClass(), "parent", null);
        setField(term2539, term2539.getClass(), "last", term2547);
        setField(term2539, term2539.getClass(), "propListHead", null);
        setIntField(term2539, term2539.getClass(), "sourcePosition", 0);
        setField(term2539, term2539.getClass(), "jsType", null);
        setField(term2539, term2539.getClass(), "parent", null);
        setField(term2537, term2537.getClass(), "next", term2539);
        setIntField(term2551, term2551.getClass(), "type", 0);
        setField(term2551, term2551.getClass(), "next", null);
        setField(term2551, term2551.getClass(), "first", null);
        setField(term2551, term2551.getClass(), "last", null);
        setField(term2551, term2551.getClass(), "propListHead", null);
        setIntField(term2551, term2551.getClass(), "sourcePosition", 0);
        setField(term2551, term2551.getClass(), "jsType", null);
        setField(term2551, term2551.getClass(), "parent", null);
        setField(term2537, term2537.getClass(), "first", term2551);
        setIntField(term2554, term2554.getClass(), "type", 0);
        setField(term2554, term2554.getClass(), "next", null);
        setField(term2554, term2554.getClass(), "first", null);
        setField(term2554, term2554.getClass(), "last", null);
        setField(term2554, term2554.getClass(), "propListHead", null);
        setIntField(term2554, term2554.getClass(), "sourcePosition", 0);
        setField(term2554, term2554.getClass(), "jsType", null);
        setField(term2554, term2554.getClass(), "parent", null);
        setField(term2537, term2537.getClass(), "last", term2554);
        setField(term2537, term2537.getClass(), "propListHead", null);
        setIntField(term2537, term2537.getClass(), "sourcePosition", 0);
        setField(term2537, term2537.getClass(), "jsType", null);
        setField(term2537, term2537.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2537;
        callMethod(klass, "getFirstNonEmptyChild", argTypes, null, args);
    }

};


