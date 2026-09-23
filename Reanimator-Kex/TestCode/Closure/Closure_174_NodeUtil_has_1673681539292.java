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

public class NodeUtil_has_1673681539292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4206;

    public NodeUtil_has_1673681539292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4206, term4206.getClass(), "type", -1408678076);
        setIntField(term4208, term4208.getClass(), "type", 1201413899);
        setIntField(term4210, term4210.getClass(), "type", -376722373);
        setIntField(term4212, term4212.getClass(), "type", 1180687854);
        setIntField(term4214, term4214.getClass(), "type", 328631288);
        setField(term4214, term4214.getClass(), "next", null);
        setField(term4214, term4214.getClass(), "first", null);
        setField(term4214, term4214.getClass(), "last", null);
        setField(term4214, term4214.getClass(), "propListHead", null);
        setIntField(term4214, term4214.getClass(), "sourcePosition", 0);
        setField(term4214, term4214.getClass(), "jsType", null);
        setField(term4214, term4214.getClass(), "parent", null);
        setField(term4212, term4212.getClass(), "next", term4214);
        setIntField(term4217, term4217.getClass(), "type", -1631415805);
        setField(term4217, term4217.getClass(), "next", null);
        setField(term4217, term4217.getClass(), "first", null);
        setField(term4217, term4217.getClass(), "last", term4214);
        setField(term4217, term4217.getClass(), "propListHead", null);
        setIntField(term4217, term4217.getClass(), "sourcePosition", 0);
        setField(term4217, term4217.getClass(), "jsType", null);
        setField(term4217, term4217.getClass(), "parent", null);
        setField(term4212, term4212.getClass(), "first", term4217);
        setField(term4212, term4212.getClass(), "last", term4210);
        setField(term4212, term4212.getClass(), "propListHead", null);
        setIntField(term4212, term4212.getClass(), "sourcePosition", 0);
        setField(term4212, term4212.getClass(), "jsType", null);
        setField(term4212, term4212.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "next", term4212);
        setField(term4210, term4210.getClass(), "first", term4214);
        setIntField(term4221, term4221.getClass(), "type", -2025555268);
        setIntField(term4223, term4223.getClass(), "type", -746950289);
        setField(term4223, term4223.getClass(), "next", null);
        setField(term4223, term4223.getClass(), "first", term4217);
        setField(term4223, term4223.getClass(), "last", term4212);
        setField(term4223, term4223.getClass(), "propListHead", null);
        setIntField(term4223, term4223.getClass(), "sourcePosition", 0);
        setField(term4223, term4223.getClass(), "jsType", null);
        setField(term4223, term4223.getClass(), "parent", null);
        setField(term4221, term4221.getClass(), "next", term4223);
        setField(term4221, term4221.getClass(), "first", term4208);
        setField(term4221, term4221.getClass(), "last", term4208);
        setField(term4221, term4221.getClass(), "propListHead", null);
        setIntField(term4221, term4221.getClass(), "sourcePosition", 0);
        setField(term4221, term4221.getClass(), "jsType", null);
        setField(term4221, term4221.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "last", term4221);
        setField(term4210, term4210.getClass(), "propListHead", null);
        setIntField(term4210, term4210.getClass(), "sourcePosition", 0);
        setField(term4210, term4210.getClass(), "jsType", null);
        setField(term4210, term4210.getClass(), "parent", null);
        setField(term4208, term4208.getClass(), "next", term4210);
        setIntField(term4228, term4228.getClass(), "type", -137577510);
        setField(term4228, term4228.getClass(), "next", term4221);
        setField(term4228, term4228.getClass(), "first", term4223);
        setField(term4228, term4228.getClass(), "last", term4206);
        setField(term4228, term4228.getClass(), "propListHead", null);
        setIntField(term4228, term4228.getClass(), "sourcePosition", 0);
        setField(term4228, term4228.getClass(), "jsType", null);
        setField(term4228, term4228.getClass(), "parent", null);
        setField(term4208, term4208.getClass(), "first", term4228);
        setField(term4208, term4208.getClass(), "last", term4228);
        setField(term4208, term4208.getClass(), "propListHead", null);
        setIntField(term4208, term4208.getClass(), "sourcePosition", 0);
        setField(term4208, term4208.getClass(), "jsType", null);
        setField(term4208, term4208.getClass(), "parent", null);
        setField(term4206, term4206.getClass(), "next", term4208);
        setField(term4206, term4206.getClass(), "first", term4212);
        setField(term4206, term4206.getClass(), "last", term4214);
        setField(term4206, term4206.getClass(), "propListHead", null);
        setIntField(term4206, term4206.getClass(), "sourcePosition", 0);
        setField(term4206, term4206.getClass(), "jsType", null);
        setField(term4206, term4206.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4206;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


