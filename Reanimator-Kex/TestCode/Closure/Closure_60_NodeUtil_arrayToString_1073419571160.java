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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_arrayToString_1073419571160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term4406;

    public NodeUtil_arrayToString_1073419571160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87, term87.getClass(), "type", -157887805);
        setIntField(term89, term89.getClass(), "type", -1968847291);
        setIntField(term91, term91.getClass(), "type", 0);
        setField(term91, term91.getClass(), "next", null);
        setField(term91, term91.getClass(), "first", null);
        setField(term91, term91.getClass(), "last", null);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term89, term89.getClass(), "next", term91);
        setIntField(term94, term94.getClass(), "type", 0);
        setField(term94, term94.getClass(), "next", null);
        setField(term94, term94.getClass(), "first", null);
        setField(term94, term94.getClass(), "last", null);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term89, term89.getClass(), "first", term94);
        setIntField(term97, term97.getClass(), "type", 0);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", null);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term89, term89.getClass(), "last", term97);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "next", term89);
        setIntField(term101, term101.getClass(), "type", 0);
        setField(term101, term101.getClass(), "next", null);
        setField(term101, term101.getClass(), "first", null);
        setField(term101, term101.getClass(), "last", null);
        setField(term101, term101.getClass(), "propListHead", null);
        setIntField(term101, term101.getClass(), "sourcePosition", 0);
        setField(term101, term101.getClass(), "jsType", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term87, term87.getClass(), "first", term101);
        setIntField(term104, term104.getClass(), "type", 0);
        setField(term104, term104.getClass(), "next", null);
        setField(term104, term104.getClass(), "first", null);
        setField(term104, term104.getClass(), "last", null);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term87, term87.getClass(), "last", term104);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        term4406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4406, term4406.getClass(), "type", -157887805);
        setIntField(term4407, term4407.getClass(), "type", -1968847291);
        setIntField(term4408, term4408.getClass(), "type", 0);
        setField(term4408, term4408.getClass(), "next", null);
        setField(term4408, term4408.getClass(), "first", null);
        setField(term4408, term4408.getClass(), "last", null);
        setField(term4408, term4408.getClass(), "propListHead", null);
        setIntField(term4408, term4408.getClass(), "sourcePosition", 0);
        setField(term4408, term4408.getClass(), "jsType", null);
        setField(term4408, term4408.getClass(), "parent", null);
        setField(term4407, term4407.getClass(), "next", term4408);
        setIntField(term4409, term4409.getClass(), "type", 0);
        setField(term4409, term4409.getClass(), "next", null);
        setField(term4409, term4409.getClass(), "first", null);
        setField(term4409, term4409.getClass(), "last", null);
        setField(term4409, term4409.getClass(), "propListHead", null);
        setIntField(term4409, term4409.getClass(), "sourcePosition", 0);
        setField(term4409, term4409.getClass(), "jsType", null);
        setField(term4409, term4409.getClass(), "parent", null);
        setField(term4407, term4407.getClass(), "first", term4409);
        setIntField(term4410, term4410.getClass(), "type", 0);
        setField(term4410, term4410.getClass(), "next", null);
        setField(term4410, term4410.getClass(), "first", null);
        setField(term4410, term4410.getClass(), "last", null);
        setField(term4410, term4410.getClass(), "propListHead", null);
        setIntField(term4410, term4410.getClass(), "sourcePosition", 0);
        setField(term4410, term4410.getClass(), "jsType", null);
        setField(term4410, term4410.getClass(), "parent", null);
        setField(term4407, term4407.getClass(), "last", term4410);
        setField(term4407, term4407.getClass(), "propListHead", null);
        setIntField(term4407, term4407.getClass(), "sourcePosition", 0);
        setField(term4407, term4407.getClass(), "jsType", null);
        setField(term4407, term4407.getClass(), "parent", null);
        setField(term4406, term4406.getClass(), "next", term4407);
        setIntField(term4411, term4411.getClass(), "type", 0);
        setField(term4411, term4411.getClass(), "next", null);
        setField(term4411, term4411.getClass(), "first", null);
        setField(term4411, term4411.getClass(), "last", null);
        setField(term4411, term4411.getClass(), "propListHead", null);
        setIntField(term4411, term4411.getClass(), "sourcePosition", 0);
        setField(term4411, term4411.getClass(), "jsType", null);
        setField(term4411, term4411.getClass(), "parent", null);
        setField(term4406, term4406.getClass(), "first", term4411);
        setIntField(term4412, term4412.getClass(), "type", 0);
        setField(term4412, term4412.getClass(), "next", null);
        setField(term4412, term4412.getClass(), "first", null);
        setField(term4412, term4412.getClass(), "last", null);
        setField(term4412, term4412.getClass(), "propListHead", null);
        setIntField(term4412, term4412.getClass(), "sourcePosition", 0);
        setField(term4412, term4412.getClass(), "jsType", null);
        setField(term4412, term4412.getClass(), "parent", null);
        setField(term4406, term4406.getClass(), "last", term4412);
        setField(term4406, term4406.getClass(), "propListHead", null);
        setIntField(term4406, term4406.getClass(), "sourcePosition", 0);
        setField(term4406, term4406.getClass(), "jsType", null);
        setField(term4406, term4406.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term87;
        Object retValue = callMethod(klass, "arrayToString", argTypes, null, args);
        assertTrue(recursiveEquals(term87, term4406));
        assertTrue(recursiveEquals(retValue, null));
    }

};


