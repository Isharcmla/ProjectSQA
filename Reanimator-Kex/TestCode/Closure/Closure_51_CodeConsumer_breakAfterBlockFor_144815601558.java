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
import java.lang.Boolean;

public class CodeConsumer_breakAfterBlockFor_144815601558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145;
     Object term166;

    public CodeConsumer_breakAfterBlockFor_144815601558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term145, term145.getClass(), "type", -117576464);
        setIntField(term147, term147.getClass(), "type", 865208305);
        setIntField(term149, term149.getClass(), "type", 0);
        setField(term149, term149.getClass(), "next", null);
        setField(term149, term149.getClass(), "first", null);
        setField(term149, term149.getClass(), "last", null);
        setField(term149, term149.getClass(), "propListHead", null);
        setIntField(term149, term149.getClass(), "sourcePosition", 0);
        setField(term149, term149.getClass(), "jsType", null);
        setField(term149, term149.getClass(), "parent", null);
        setField(term147, term147.getClass(), "next", term149);
        setIntField(term152, term152.getClass(), "type", 0);
        setField(term152, term152.getClass(), "next", null);
        setField(term152, term152.getClass(), "first", null);
        setField(term152, term152.getClass(), "last", null);
        setField(term152, term152.getClass(), "propListHead", null);
        setIntField(term152, term152.getClass(), "sourcePosition", 0);
        setField(term152, term152.getClass(), "jsType", null);
        setField(term152, term152.getClass(), "parent", null);
        setField(term147, term147.getClass(), "first", term152);
        setIntField(term155, term155.getClass(), "type", 0);
        setField(term155, term155.getClass(), "next", null);
        setField(term155, term155.getClass(), "first", null);
        setField(term155, term155.getClass(), "last", null);
        setField(term155, term155.getClass(), "propListHead", null);
        setIntField(term155, term155.getClass(), "sourcePosition", 0);
        setField(term155, term155.getClass(), "jsType", null);
        setField(term155, term155.getClass(), "parent", null);
        setField(term147, term147.getClass(), "last", term155);
        setField(term147, term147.getClass(), "propListHead", null);
        setIntField(term147, term147.getClass(), "sourcePosition", 0);
        setField(term147, term147.getClass(), "jsType", null);
        setField(term147, term147.getClass(), "parent", null);
        setField(term145, term145.getClass(), "next", term147);
        setIntField(term159, term159.getClass(), "type", 0);
        setField(term159, term159.getClass(), "next", null);
        setField(term159, term159.getClass(), "first", null);
        setField(term159, term159.getClass(), "last", null);
        setField(term159, term159.getClass(), "propListHead", null);
        setIntField(term159, term159.getClass(), "sourcePosition", 0);
        setField(term159, term159.getClass(), "jsType", null);
        setField(term159, term159.getClass(), "parent", null);
        setField(term145, term145.getClass(), "first", term159);
        setIntField(term162, term162.getClass(), "type", 0);
        setField(term162, term162.getClass(), "next", null);
        setField(term162, term162.getClass(), "first", null);
        setField(term162, term162.getClass(), "last", null);
        setField(term162, term162.getClass(), "propListHead", null);
        setIntField(term162, term162.getClass(), "sourcePosition", 0);
        setField(term162, term162.getClass(), "jsType", null);
        setField(term162, term162.getClass(), "parent", null);
        setField(term145, term145.getClass(), "last", term162);
        setField(term145, term145.getClass(), "propListHead", null);
        setIntField(term145, term145.getClass(), "sourcePosition", 0);
        setField(term145, term145.getClass(), "jsType", null);
        setField(term145, term145.getClass(), "parent", null);
        term166 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeConsumer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term145;
        args[1] = term166;
        try {
            callMethod(klass, "breakAfterBlockFor", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


