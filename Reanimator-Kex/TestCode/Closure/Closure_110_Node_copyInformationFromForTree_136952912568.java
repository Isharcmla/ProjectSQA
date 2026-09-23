package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class Node_copyInformationFromForTree_136952912568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47561;
     Object term47911;
     Object term48430;
     Object term48435;
     Object term48283;

    public Node_copyInformationFromForTree_136952912568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47561, term47561.getClass(), "propListHead", null);
        setIntField(term47561, term47561.getClass(), "sourcePosition", 0);
        setField(term47631, term47631.getClass(), "propListHead", null);
        setIntField(term47631, term47631.getClass(), "sourcePosition", 0);
        setField(term47701, term47701.getClass(), "propListHead", null);
        setIntField(term47701, term47701.getClass(), "sourcePosition", 0);
        setField(term47701, term47701.getClass(), "first", null);
        setField(term47701, term47701.getClass(), "next", null);
        setField(term47631, term47631.getClass(), "first", term47701);
        setField(term47771, term47771.getClass(), "propListHead", null);
        setIntField(term47771, term47771.getClass(), "sourcePosition", 0);
        setField(term47771, term47771.getClass(), "first", null);
        setField(term47771, term47771.getClass(), "next", term47841);
        setField(term47631, term47631.getClass(), "next", term47771);
        setField(term47561, term47561.getClass(), "first", term47631);
        term47911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47911, term47911.getClass(), "propListHead", null);
        setIntField(term47911, term47911.getClass(), "sourcePosition", 0);
        term48430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48430, term48430.getClass(), "type", 0);
        setField(term48430, term48430.getClass(), "next", null);
        setIntField(term48431, term48431.getClass(), "type", 0);
        setIntField(term48432, term48432.getClass(), "type", 0);
        setIntField(term48433, term48433.getClass(), "type", 0);
        setField(term48433, term48433.getClass(), "next", null);
        setField(term48433, term48433.getClass(), "first", null);
        setField(term48433, term48433.getClass(), "last", null);
        setField(term48433, term48433.getClass(), "propListHead", null);
        setIntField(term48433, term48433.getClass(), "sourcePosition", 0);
        setField(term48433, term48433.getClass(), "jsType", null);
        setField(term48433, term48433.getClass(), "parent", null);
        setField(term48432, term48432.getClass(), "next", term48433);
        setField(term48432, term48432.getClass(), "first", null);
        setField(term48432, term48432.getClass(), "last", null);
        setField(term48432, term48432.getClass(), "propListHead", null);
        setIntField(term48432, term48432.getClass(), "sourcePosition", 0);
        setField(term48432, term48432.getClass(), "jsType", null);
        setField(term48432, term48432.getClass(), "parent", null);
        setField(term48431, term48431.getClass(), "next", term48432);
        setIntField(term48434, term48434.getClass(), "type", 0);
        setField(term48434, term48434.getClass(), "next", null);
        setField(term48434, term48434.getClass(), "first", null);
        setField(term48434, term48434.getClass(), "last", null);
        setField(term48434, term48434.getClass(), "propListHead", null);
        setIntField(term48434, term48434.getClass(), "sourcePosition", 0);
        setField(term48434, term48434.getClass(), "jsType", null);
        setField(term48434, term48434.getClass(), "parent", null);
        setField(term48431, term48431.getClass(), "first", term48434);
        setField(term48431, term48431.getClass(), "last", null);
        setField(term48431, term48431.getClass(), "propListHead", null);
        setIntField(term48431, term48431.getClass(), "sourcePosition", 0);
        setField(term48431, term48431.getClass(), "jsType", null);
        setField(term48431, term48431.getClass(), "parent", null);
        setField(term48430, term48430.getClass(), "first", term48431);
        setField(term48430, term48430.getClass(), "last", null);
        setField(term48430, term48430.getClass(), "propListHead", null);
        setIntField(term48430, term48430.getClass(), "sourcePosition", 0);
        setField(term48430, term48430.getClass(), "jsType", null);
        setField(term48430, term48430.getClass(), "parent", null);
        term48435 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48435, term48435.getClass(), "type", 0);
        setField(term48435, term48435.getClass(), "next", null);
        setField(term48435, term48435.getClass(), "first", null);
        setField(term48435, term48435.getClass(), "last", null);
        setField(term48435, term48435.getClass(), "propListHead", null);
        setIntField(term48435, term48435.getClass(), "sourcePosition", 0);
        setField(term48435, term48435.getClass(), "jsType", null);
        setField(term48435, term48435.getClass(), "parent", null);
        term48283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term48283, term48283.getClass(), "type", 0);
        setField(term48283, term48283.getClass(), "next", null);
        setIntField(term48285, term48285.getClass(), "type", 0);
        setIntField(term48287, term48287.getClass(), "type", 0);
        setIntField(term48289, term48289.getClass(), "type", 0);
        setField(term48289, term48289.getClass(), "next", null);
        setField(term48289, term48289.getClass(), "first", null);
        setField(term48289, term48289.getClass(), "last", null);
        setField(term48289, term48289.getClass(), "propListHead", null);
        setIntField(term48289, term48289.getClass(), "sourcePosition", 0);
        setField(term48289, term48289.getClass(), "jsType", null);
        setField(term48289, term48289.getClass(), "parent", null);
        setField(term48287, term48287.getClass(), "next", term48289);
        setField(term48287, term48287.getClass(), "first", null);
        setField(term48287, term48287.getClass(), "last", null);
        setField(term48287, term48287.getClass(), "propListHead", null);
        setIntField(term48287, term48287.getClass(), "sourcePosition", 0);
        setField(term48287, term48287.getClass(), "jsType", null);
        setField(term48287, term48287.getClass(), "parent", null);
        setField(term48285, term48285.getClass(), "next", term48287);
        setIntField(term48293, term48293.getClass(), "type", 0);
        setField(term48293, term48293.getClass(), "next", null);
        setField(term48293, term48293.getClass(), "first", null);
        setField(term48293, term48293.getClass(), "last", null);
        setField(term48293, term48293.getClass(), "propListHead", null);
        setIntField(term48293, term48293.getClass(), "sourcePosition", 0);
        setField(term48293, term48293.getClass(), "jsType", null);
        setField(term48293, term48293.getClass(), "parent", null);
        setField(term48285, term48285.getClass(), "first", term48293);
        setField(term48285, term48285.getClass(), "last", null);
        setField(term48285, term48285.getClass(), "propListHead", null);
        setIntField(term48285, term48285.getClass(), "sourcePosition", 0);
        setField(term48285, term48285.getClass(), "jsType", null);
        setField(term48285, term48285.getClass(), "parent", null);
        setField(term48283, term48283.getClass(), "first", term48285);
        setField(term48283, term48283.getClass(), "last", null);
        setField(term48283, term48283.getClass(), "propListHead", null);
        setIntField(term48283, term48283.getClass(), "sourcePosition", 0);
        setField(term48283, term48283.getClass(), "jsType", null);
        setField(term48283, term48283.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47911;
        Object retValue = callMethod(klass, "copyInformationFromForTree", argTypes, term47561, args);
        assertTrue(recursiveEquals(term47561, term48430));
        assertTrue(recursiveEquals(term47911, term48435));
        assertTrue(recursiveEquals(retValue, term48283));
    }

};


