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

public class IR_exprResult_10420369187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353;

    public IR_exprResult_10420369187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term364 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term353, term353.getClass(), "type", -2015854073);
        setIntField(term355, term355.getClass(), "type", 538259104);
        setIntField(term357, term357.getClass(), "type", 96566506);
        setIntField(term359, term359.getClass(), "type", -343325701);
        setIntField(term361, term361.getClass(), "type", 107945604);
        setField(term361, term361.getClass(), "next", null);
        setField(term361, term361.getClass(), "first", null);
        setField(term361, term361.getClass(), "last", null);
        setField(term361, term361.getClass(), "propListHead", null);
        setIntField(term361, term361.getClass(), "sourcePosition", 0);
        setField(term361, term361.getClass(), "jsType", null);
        setField(term361, term361.getClass(), "parent", null);
        setField(term359, term359.getClass(), "next", term361);
        setIntField(term364, term364.getClass(), "type", -1963464809);
        setField(term364, term364.getClass(), "next", null);
        setField(term364, term364.getClass(), "first", null);
        setField(term364, term364.getClass(), "last", term361);
        setField(term364, term364.getClass(), "propListHead", null);
        setIntField(term364, term364.getClass(), "sourcePosition", 0);
        setField(term364, term364.getClass(), "jsType", null);
        setField(term364, term364.getClass(), "parent", null);
        setField(term359, term359.getClass(), "first", term364);
        setField(term359, term359.getClass(), "last", term357);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term357, term357.getClass(), "next", term359);
        setField(term357, term357.getClass(), "first", term361);
        setIntField(term368, term368.getClass(), "type", 1202361360);
        setIntField(term370, term370.getClass(), "type", -2015048153);
        setField(term370, term370.getClass(), "next", null);
        setField(term370, term370.getClass(), "first", term364);
        setField(term370, term370.getClass(), "last", term359);
        setField(term370, term370.getClass(), "propListHead", null);
        setIntField(term370, term370.getClass(), "sourcePosition", 0);
        setField(term370, term370.getClass(), "jsType", null);
        setField(term370, term370.getClass(), "parent", null);
        setField(term368, term368.getClass(), "next", term370);
        setField(term368, term368.getClass(), "first", term355);
        setField(term368, term368.getClass(), "last", term355);
        setField(term368, term368.getClass(), "propListHead", null);
        setIntField(term368, term368.getClass(), "sourcePosition", 0);
        setField(term368, term368.getClass(), "jsType", null);
        setField(term368, term368.getClass(), "parent", null);
        setField(term357, term357.getClass(), "last", term368);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        setField(term355, term355.getClass(), "next", term357);
        setIntField(term375, term375.getClass(), "type", -2063457669);
        setField(term375, term375.getClass(), "next", term368);
        setField(term375, term375.getClass(), "first", term370);
        setField(term375, term375.getClass(), "last", term353);
        setField(term375, term375.getClass(), "propListHead", null);
        setIntField(term375, term375.getClass(), "sourcePosition", 0);
        setField(term375, term375.getClass(), "jsType", null);
        setField(term375, term375.getClass(), "parent", null);
        setField(term355, term355.getClass(), "first", term375);
        setField(term355, term355.getClass(), "last", term375);
        setField(term355, term355.getClass(), "propListHead", null);
        setIntField(term355, term355.getClass(), "sourcePosition", 0);
        setField(term355, term355.getClass(), "jsType", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term353, term353.getClass(), "next", term355);
        setField(term353, term353.getClass(), "first", term359);
        setField(term353, term353.getClass(), "last", term361);
        setField(term353, term353.getClass(), "propListHead", null);
        setIntField(term353, term353.getClass(), "sourcePosition", 0);
        setField(term353, term353.getClass(), "jsType", null);
        setField(term353, term353.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term353;
        try {
            callMethod(klass, "exprResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


