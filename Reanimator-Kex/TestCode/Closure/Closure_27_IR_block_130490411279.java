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

public class IR_block_130490411279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;

    public IR_block_130490411279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term162, term162.getClass(), "type", 1596070772);
        setIntField(term164, term164.getClass(), "type", 97029295);
        setIntField(term166, term166.getClass(), "type", -1371869594);
        setIntField(term168, term168.getClass(), "type", -2095575670);
        setIntField(term170, term170.getClass(), "type", 1225272962);
        setField(term170, term170.getClass(), "next", null);
        setField(term170, term170.getClass(), "first", null);
        setField(term170, term170.getClass(), "last", null);
        setField(term170, term170.getClass(), "propListHead", null);
        setIntField(term170, term170.getClass(), "sourcePosition", 0);
        setField(term170, term170.getClass(), "jsType", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term168, term168.getClass(), "next", term170);
        setIntField(term173, term173.getClass(), "type", 1324040357);
        setField(term173, term173.getClass(), "next", null);
        setField(term173, term173.getClass(), "first", null);
        setField(term173, term173.getClass(), "last", term170);
        setField(term173, term173.getClass(), "propListHead", null);
        setIntField(term173, term173.getClass(), "sourcePosition", 0);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        setField(term168, term168.getClass(), "first", term173);
        setField(term168, term168.getClass(), "last", term166);
        setField(term168, term168.getClass(), "propListHead", null);
        setIntField(term168, term168.getClass(), "sourcePosition", 0);
        setField(term168, term168.getClass(), "jsType", null);
        setField(term168, term168.getClass(), "parent", null);
        setField(term166, term166.getClass(), "next", term168);
        setField(term166, term166.getClass(), "first", term170);
        setIntField(term177, term177.getClass(), "type", -93135961);
        setIntField(term179, term179.getClass(), "type", -112921587);
        setField(term179, term179.getClass(), "next", null);
        setField(term179, term179.getClass(), "first", term173);
        setField(term179, term179.getClass(), "last", term168);
        setField(term179, term179.getClass(), "propListHead", null);
        setIntField(term179, term179.getClass(), "sourcePosition", 0);
        setField(term179, term179.getClass(), "jsType", null);
        setField(term179, term179.getClass(), "parent", null);
        setField(term177, term177.getClass(), "next", term179);
        setField(term177, term177.getClass(), "first", term164);
        setField(term177, term177.getClass(), "last", term164);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
        setField(term166, term166.getClass(), "last", term177);
        setField(term166, term166.getClass(), "propListHead", null);
        setIntField(term166, term166.getClass(), "sourcePosition", 0);
        setField(term166, term166.getClass(), "jsType", null);
        setField(term166, term166.getClass(), "parent", null);
        setField(term164, term164.getClass(), "next", term166);
        setIntField(term184, term184.getClass(), "type", 933028652);
        setField(term184, term184.getClass(), "next", term177);
        setField(term184, term184.getClass(), "first", term179);
        setField(term184, term184.getClass(), "last", term162);
        setField(term184, term184.getClass(), "propListHead", null);
        setIntField(term184, term184.getClass(), "sourcePosition", 0);
        setField(term184, term184.getClass(), "jsType", null);
        setField(term184, term184.getClass(), "parent", null);
        setField(term164, term164.getClass(), "first", term184);
        setField(term164, term164.getClass(), "last", term184);
        setField(term164, term164.getClass(), "propListHead", null);
        setIntField(term164, term164.getClass(), "sourcePosition", 0);
        setField(term164, term164.getClass(), "jsType", null);
        setField(term164, term164.getClass(), "parent", null);
        setField(term162, term162.getClass(), "next", term164);
        setField(term162, term162.getClass(), "first", term168);
        setField(term162, term162.getClass(), "last", term170);
        setField(term162, term162.getClass(), "propListHead", null);
        setIntField(term162, term162.getClass(), "sourcePosition", 0);
        setField(term162, term162.getClass(), "jsType", null);
        setField(term162, term162.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term162;
        try {
            callMethod(klass, "block", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


