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
import java.lang.Object;

public class IR_var_143832007483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272;

    public IR_var_143832007483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term272, term272.getClass(), "type", -1347665717);
        setIntField(term274, term274.getClass(), "type", -1888585309);
        setIntField(term276, term276.getClass(), "type", 683666002);
        setIntField(term278, term278.getClass(), "type", 1596213415);
        setIntField(term280, term280.getClass(), "type", -268815336);
        setField(term280, term280.getClass(), "next", null);
        setField(term280, term280.getClass(), "first", null);
        setField(term280, term280.getClass(), "last", null);
        setField(term280, term280.getClass(), "propListHead", null);
        setIntField(term280, term280.getClass(), "sourcePosition", 0);
        setField(term280, term280.getClass(), "jsType", null);
        setField(term280, term280.getClass(), "parent", null);
        setField(term278, term278.getClass(), "next", term280);
        setIntField(term283, term283.getClass(), "type", -1210583429);
        setField(term283, term283.getClass(), "next", null);
        setField(term283, term283.getClass(), "first", null);
        setField(term283, term283.getClass(), "last", term280);
        setField(term283, term283.getClass(), "propListHead", null);
        setIntField(term283, term283.getClass(), "sourcePosition", 0);
        setField(term283, term283.getClass(), "jsType", null);
        setField(term283, term283.getClass(), "parent", null);
        setField(term278, term278.getClass(), "first", term283);
        setField(term278, term278.getClass(), "last", term276);
        setField(term278, term278.getClass(), "propListHead", null);
        setIntField(term278, term278.getClass(), "sourcePosition", 0);
        setField(term278, term278.getClass(), "jsType", null);
        setField(term278, term278.getClass(), "parent", null);
        setField(term276, term276.getClass(), "next", term278);
        setField(term276, term276.getClass(), "first", term280);
        setIntField(term287, term287.getClass(), "type", 339854490);
        setIntField(term289, term289.getClass(), "type", -615654495);
        setField(term289, term289.getClass(), "next", null);
        setField(term289, term289.getClass(), "first", term283);
        setField(term289, term289.getClass(), "last", term278);
        setField(term289, term289.getClass(), "propListHead", null);
        setIntField(term289, term289.getClass(), "sourcePosition", 0);
        setField(term289, term289.getClass(), "jsType", null);
        setField(term289, term289.getClass(), "parent", null);
        setField(term287, term287.getClass(), "next", term289);
        setField(term287, term287.getClass(), "first", term274);
        setField(term287, term287.getClass(), "last", term274);
        setField(term287, term287.getClass(), "propListHead", null);
        setIntField(term287, term287.getClass(), "sourcePosition", 0);
        setField(term287, term287.getClass(), "jsType", null);
        setField(term287, term287.getClass(), "parent", null);
        setField(term276, term276.getClass(), "last", term287);
        setField(term276, term276.getClass(), "propListHead", null);
        setIntField(term276, term276.getClass(), "sourcePosition", 0);
        setField(term276, term276.getClass(), "jsType", null);
        setField(term276, term276.getClass(), "parent", null);
        setField(term274, term274.getClass(), "next", term276);
        setIntField(term294, term294.getClass(), "type", -1476117762);
        setField(term294, term294.getClass(), "next", term287);
        setField(term294, term294.getClass(), "first", term289);
        setField(term294, term294.getClass(), "last", term272);
        setField(term294, term294.getClass(), "propListHead", null);
        setIntField(term294, term294.getClass(), "sourcePosition", 0);
        setField(term294, term294.getClass(), "jsType", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term274, term274.getClass(), "first", term294);
        setField(term274, term274.getClass(), "last", term294);
        setField(term274, term274.getClass(), "propListHead", null);
        setIntField(term274, term274.getClass(), "sourcePosition", 0);
        setField(term274, term274.getClass(), "jsType", null);
        setField(term274, term274.getClass(), "parent", null);
        setField(term272, term272.getClass(), "next", term274);
        setField(term272, term272.getClass(), "first", term278);
        setField(term272, term272.getClass(), "last", term280);
        setField(term272, term272.getClass(), "propListHead", null);
        setIntField(term272, term272.getClass(), "sourcePosition", 0);
        setField(term272, term272.getClass(), "jsType", null);
        setField(term272, term272.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term272;
        try {
            callMethod(klass, "var", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


