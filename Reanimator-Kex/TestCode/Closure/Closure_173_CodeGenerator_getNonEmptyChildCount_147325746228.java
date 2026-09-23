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

public class CodeGenerator_getNonEmptyChildCount_147325746228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15672;
     Object term15699;

    public CodeGenerator_getNonEmptyChildCount_147325746228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15672, term15672.getClass(), "type", 9726679);
        setIntField(term15674, term15674.getClass(), "type", -25637976);
        setIntField(term15676, term15676.getClass(), "type", 1555897383);
        setIntField(term15678, term15678.getClass(), "type", 202001407);
        setIntField(term15680, term15680.getClass(), "type", 158873461);
        setField(term15680, term15680.getClass(), "next", null);
        setField(term15680, term15680.getClass(), "first", null);
        setField(term15680, term15680.getClass(), "last", null);
        setField(term15680, term15680.getClass(), "propListHead", null);
        setIntField(term15680, term15680.getClass(), "sourcePosition", 0);
        setField(term15680, term15680.getClass(), "jsType", null);
        setField(term15680, term15680.getClass(), "parent", null);
        setField(term15678, term15678.getClass(), "next", term15680);
        setIntField(term15683, term15683.getClass(), "type", -430151637);
        setField(term15683, term15683.getClass(), "next", null);
        setField(term15683, term15683.getClass(), "first", null);
        setField(term15683, term15683.getClass(), "last", term15680);
        setField(term15683, term15683.getClass(), "propListHead", null);
        setIntField(term15683, term15683.getClass(), "sourcePosition", 0);
        setField(term15683, term15683.getClass(), "jsType", null);
        setField(term15683, term15683.getClass(), "parent", null);
        setField(term15678, term15678.getClass(), "first", term15683);
        setField(term15678, term15678.getClass(), "last", term15676);
        setField(term15678, term15678.getClass(), "propListHead", null);
        setIntField(term15678, term15678.getClass(), "sourcePosition", 0);
        setField(term15678, term15678.getClass(), "jsType", null);
        setField(term15678, term15678.getClass(), "parent", null);
        setField(term15676, term15676.getClass(), "next", term15678);
        setField(term15676, term15676.getClass(), "first", term15680);
        setIntField(term15687, term15687.getClass(), "type", 98922530);
        setIntField(term15689, term15689.getClass(), "type", -1388471422);
        setField(term15689, term15689.getClass(), "next", null);
        setField(term15689, term15689.getClass(), "first", term15683);
        setField(term15689, term15689.getClass(), "last", term15678);
        setField(term15689, term15689.getClass(), "propListHead", null);
        setIntField(term15689, term15689.getClass(), "sourcePosition", 0);
        setField(term15689, term15689.getClass(), "jsType", null);
        setField(term15689, term15689.getClass(), "parent", null);
        setField(term15687, term15687.getClass(), "next", term15689);
        setField(term15687, term15687.getClass(), "first", term15674);
        setField(term15687, term15687.getClass(), "last", term15674);
        setField(term15687, term15687.getClass(), "propListHead", null);
        setIntField(term15687, term15687.getClass(), "sourcePosition", 0);
        setField(term15687, term15687.getClass(), "jsType", null);
        setField(term15687, term15687.getClass(), "parent", null);
        setField(term15676, term15676.getClass(), "last", term15687);
        setField(term15676, term15676.getClass(), "propListHead", null);
        setIntField(term15676, term15676.getClass(), "sourcePosition", 0);
        setField(term15676, term15676.getClass(), "jsType", null);
        setField(term15676, term15676.getClass(), "parent", null);
        setField(term15674, term15674.getClass(), "next", term15676);
        setIntField(term15694, term15694.getClass(), "type", -1498296052);
        setField(term15694, term15694.getClass(), "next", term15687);
        setField(term15694, term15694.getClass(), "first", term15689);
        setField(term15694, term15694.getClass(), "last", term15672);
        setField(term15694, term15694.getClass(), "propListHead", null);
        setIntField(term15694, term15694.getClass(), "sourcePosition", 0);
        setField(term15694, term15694.getClass(), "jsType", null);
        setField(term15694, term15694.getClass(), "parent", null);
        setField(term15674, term15674.getClass(), "first", term15694);
        setField(term15674, term15674.getClass(), "last", term15694);
        setField(term15674, term15674.getClass(), "propListHead", null);
        setIntField(term15674, term15674.getClass(), "sourcePosition", 0);
        setField(term15674, term15674.getClass(), "jsType", null);
        setField(term15674, term15674.getClass(), "parent", null);
        setField(term15672, term15672.getClass(), "next", term15674);
        setField(term15672, term15672.getClass(), "first", term15678);
        setField(term15672, term15672.getClass(), "last", term15680);
        setField(term15672, term15672.getClass(), "propListHead", null);
        setIntField(term15672, term15672.getClass(), "sourcePosition", 0);
        setField(term15672, term15672.getClass(), "jsType", null);
        setField(term15672, term15672.getClass(), "parent", null);
        term15699 = new Integer(2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term15672;
        args[1] = term15699;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


