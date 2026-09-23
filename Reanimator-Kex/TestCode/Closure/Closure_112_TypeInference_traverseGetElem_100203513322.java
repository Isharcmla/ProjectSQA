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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseGetElem_100203513322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524214;
     Object term524284;

    public TypeInference_traverseGetElem_100203513322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524214 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term524284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term525614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term524354, term524354.getClass(), "type", 98);
        setField(term524424, term524424.getClass(), "next", null);
        setIntField(term524424, term524424.getClass(), "type", 98);
        setField(term524494, term524494.getClass(), "next", null);
        setIntField(term524494, term524494.getClass(), "type", 98);
        setField(term524564, term524564.getClass(), "next", null);
        setIntField(term524564, term524564.getClass(), "type", 98);
        setField(term524634, term524634.getClass(), "next", null);
        setIntField(term524634, term524634.getClass(), "type", 98);
        setField(term524704, term524704.getClass(), "next", null);
        setIntField(term524704, term524704.getClass(), "type", 98);
        setField(term524774, term524774.getClass(), "next", null);
        setIntField(term524774, term524774.getClass(), "type", 98);
        setField(term524844, term524844.getClass(), "next", null);
        setIntField(term524844, term524844.getClass(), "type", 98);
        setField(term524914, term524914.getClass(), "next", null);
        setIntField(term524914, term524914.getClass(), "type", 98);
        setField(term524984, term524984.getClass(), "next", null);
        setIntField(term524984, term524984.getClass(), "type", 98);
        setField(term525054, term525054.getClass(), "next", null);
        setIntField(term525054, term525054.getClass(), "type", 98);
        setField(term525124, term525124.getClass(), "next", null);
        setIntField(term525124, term525124.getClass(), "type", 98);
        setField(term525194, term525194.getClass(), "next", null);
        setIntField(term525194, term525194.getClass(), "type", 98);
        setField(term525264, term525264.getClass(), "next", null);
        setIntField(term525264, term525264.getClass(), "type", 98);
        setField(term525334, term525334.getClass(), "next", null);
        setIntField(term525334, term525334.getClass(), "type", 98);
        setField(term525404, term525404.getClass(), "next", null);
        setIntField(term525404, term525404.getClass(), "type", 98);
        setField(term525474, term525474.getClass(), "next", null);
        setIntField(term525474, term525474.getClass(), "type", 98);
        setField(term525544, term525544.getClass(), "next", null);
        setIntField(term525544, term525544.getClass(), "type", 98);
        setField(term525614, term525614.getClass(), "next", null);
        setIntField(term525614, term525614.getClass(), "type", 61);
        setField(term525544, term525544.getClass(), "first", term525614);
        setField(term525544, term525544.getClass(), "last", null);
        setField(term525474, term525474.getClass(), "first", term525544);
        setField(term525474, term525474.getClass(), "last", null);
        setField(term525404, term525404.getClass(), "first", term525474);
        setField(term525404, term525404.getClass(), "last", null);
        setField(term525334, term525334.getClass(), "first", term525404);
        setField(term525334, term525334.getClass(), "last", null);
        setField(term525264, term525264.getClass(), "first", term525334);
        setField(term525264, term525264.getClass(), "last", null);
        setField(term525194, term525194.getClass(), "first", term525264);
        setField(term525194, term525194.getClass(), "last", null);
        setField(term525124, term525124.getClass(), "first", term525194);
        setField(term525124, term525124.getClass(), "last", null);
        setField(term525054, term525054.getClass(), "first", term525124);
        setField(term525054, term525054.getClass(), "last", null);
        setField(term524984, term524984.getClass(), "first", term525054);
        setField(term524984, term524984.getClass(), "last", null);
        setField(term524914, term524914.getClass(), "first", term524984);
        setField(term524914, term524914.getClass(), "last", null);
        setField(term524844, term524844.getClass(), "first", term524914);
        setField(term524844, term524844.getClass(), "last", null);
        setField(term524774, term524774.getClass(), "first", term524844);
        setField(term524774, term524774.getClass(), "last", null);
        setField(term524704, term524704.getClass(), "first", term524774);
        setField(term524704, term524704.getClass(), "last", null);
        setField(term524634, term524634.getClass(), "first", term524704);
        setField(term524634, term524634.getClass(), "last", null);
        setField(term524564, term524564.getClass(), "first", term524634);
        setField(term524564, term524564.getClass(), "last", null);
        setField(term524494, term524494.getClass(), "first", term524564);
        setField(term524494, term524494.getClass(), "last", null);
        setField(term524424, term524424.getClass(), "first", term524494);
        setField(term524424, term524424.getClass(), "last", null);
        setField(term524354, term524354.getClass(), "first", term524424);
        setField(term524354, term524354.getClass(), "last", null);
        setField(term524284, term524284.getClass(), "first", term524354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term524284;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term524214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


