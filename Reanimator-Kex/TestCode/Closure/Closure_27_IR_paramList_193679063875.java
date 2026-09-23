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

public class IR_paramList_193679063875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public IR_paramList_193679063875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82, term82.getClass(), "type", -203030934);
        setIntField(term84, term84.getClass(), "type", -1179120542);
        setIntField(term86, term86.getClass(), "type", -73683645);
        setIntField(term88, term88.getClass(), "type", -226514366);
        setIntField(term90, term90.getClass(), "type", 1193880199);
        setField(term90, term90.getClass(), "next", null);
        setField(term90, term90.getClass(), "first", null);
        setField(term90, term90.getClass(), "last", null);
        setField(term90, term90.getClass(), "propListHead", null);
        setIntField(term90, term90.getClass(), "sourcePosition", 0);
        setField(term90, term90.getClass(), "jsType", null);
        setField(term90, term90.getClass(), "parent", null);
        setField(term88, term88.getClass(), "next", term90);
        setIntField(term93, term93.getClass(), "type", -1087774327);
        setField(term93, term93.getClass(), "next", null);
        setField(term93, term93.getClass(), "first", null);
        setField(term93, term93.getClass(), "last", term90);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term88, term88.getClass(), "first", term93);
        setField(term88, term88.getClass(), "last", term86);
        setField(term88, term88.getClass(), "propListHead", null);
        setIntField(term88, term88.getClass(), "sourcePosition", 0);
        setField(term88, term88.getClass(), "jsType", null);
        setField(term88, term88.getClass(), "parent", null);
        setField(term86, term86.getClass(), "next", term88);
        setField(term86, term86.getClass(), "first", term90);
        setIntField(term97, term97.getClass(), "type", -469968304);
        setIntField(term99, term99.getClass(), "type", -1145578966);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", term93);
        setField(term99, term99.getClass(), "last", term88);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term97, term97.getClass(), "next", term99);
        setField(term97, term97.getClass(), "first", term84);
        setField(term97, term97.getClass(), "last", term84);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term86, term86.getClass(), "last", term97);
        setField(term86, term86.getClass(), "propListHead", null);
        setIntField(term86, term86.getClass(), "sourcePosition", 0);
        setField(term86, term86.getClass(), "jsType", null);
        setField(term86, term86.getClass(), "parent", null);
        setField(term84, term84.getClass(), "next", term86);
        setIntField(term104, term104.getClass(), "type", 679763016);
        setField(term104, term104.getClass(), "next", term97);
        setField(term104, term104.getClass(), "first", term99);
        setField(term104, term104.getClass(), "last", term82);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term84, term84.getClass(), "first", term104);
        setField(term84, term84.getClass(), "last", term104);
        setField(term84, term84.getClass(), "propListHead", null);
        setIntField(term84, term84.getClass(), "sourcePosition", 0);
        setField(term84, term84.getClass(), "jsType", null);
        setField(term84, term84.getClass(), "parent", null);
        setField(term82, term82.getClass(), "next", term84);
        setField(term82, term82.getClass(), "first", term88);
        setField(term82, term82.getClass(), "last", term90);
        setField(term82, term82.getClass(), "propListHead", null);
        setIntField(term82, term82.getClass(), "sourcePosition", 0);
        setField(term82, term82.getClass(), "jsType", null);
        setField(term82, term82.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term82;
        try {
            callMethod(klass, "paramList", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


