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

public class NodeUtil_getBestLValue_1191268575300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4204;

    public NodeUtil_getBestLValue_1191268575300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4204, term4204.getClass(), "type", 793974213);
        setIntField(term4206, term4206.getClass(), "type", 722546287);
        setIntField(term4208, term4208.getClass(), "type", -2060284160);
        setIntField(term4210, term4210.getClass(), "type", -568450686);
        setIntField(term4212, term4212.getClass(), "type", 1314660281);
        setField(term4212, term4212.getClass(), "next", null);
        setField(term4212, term4212.getClass(), "first", null);
        setField(term4212, term4212.getClass(), "last", null);
        setField(term4212, term4212.getClass(), "propListHead", null);
        setIntField(term4212, term4212.getClass(), "sourcePosition", 0);
        setField(term4212, term4212.getClass(), "jsType", null);
        setField(term4212, term4212.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "next", term4212);
        setIntField(term4215, term4215.getClass(), "type", -126399768);
        setField(term4215, term4215.getClass(), "next", null);
        setField(term4215, term4215.getClass(), "first", null);
        setField(term4215, term4215.getClass(), "last", term4212);
        setField(term4215, term4215.getClass(), "propListHead", null);
        setIntField(term4215, term4215.getClass(), "sourcePosition", 0);
        setField(term4215, term4215.getClass(), "jsType", null);
        setField(term4215, term4215.getClass(), "parent", null);
        setField(term4210, term4210.getClass(), "first", term4215);
        setField(term4210, term4210.getClass(), "last", term4208);
        setField(term4210, term4210.getClass(), "propListHead", null);
        setIntField(term4210, term4210.getClass(), "sourcePosition", 0);
        setField(term4210, term4210.getClass(), "jsType", null);
        setField(term4210, term4210.getClass(), "parent", null);
        setField(term4208, term4208.getClass(), "next", term4210);
        setField(term4208, term4208.getClass(), "first", term4212);
        setIntField(term4219, term4219.getClass(), "type", -154210001);
        setIntField(term4221, term4221.getClass(), "type", 621910137);
        setField(term4221, term4221.getClass(), "next", null);
        setField(term4221, term4221.getClass(), "first", term4215);
        setField(term4221, term4221.getClass(), "last", term4210);
        setField(term4221, term4221.getClass(), "propListHead", null);
        setIntField(term4221, term4221.getClass(), "sourcePosition", 0);
        setField(term4221, term4221.getClass(), "jsType", null);
        setField(term4221, term4221.getClass(), "parent", null);
        setField(term4219, term4219.getClass(), "next", term4221);
        setField(term4219, term4219.getClass(), "first", term4206);
        setField(term4219, term4219.getClass(), "last", term4206);
        setField(term4219, term4219.getClass(), "propListHead", null);
        setIntField(term4219, term4219.getClass(), "sourcePosition", 0);
        setField(term4219, term4219.getClass(), "jsType", null);
        setField(term4219, term4219.getClass(), "parent", null);
        setField(term4208, term4208.getClass(), "last", term4219);
        setField(term4208, term4208.getClass(), "propListHead", null);
        setIntField(term4208, term4208.getClass(), "sourcePosition", 0);
        setField(term4208, term4208.getClass(), "jsType", null);
        setField(term4208, term4208.getClass(), "parent", null);
        setField(term4206, term4206.getClass(), "next", term4208);
        setIntField(term4226, term4226.getClass(), "type", 241533020);
        setField(term4226, term4226.getClass(), "next", term4219);
        setField(term4226, term4226.getClass(), "first", term4221);
        setField(term4226, term4226.getClass(), "last", term4204);
        setField(term4226, term4226.getClass(), "propListHead", null);
        setIntField(term4226, term4226.getClass(), "sourcePosition", 0);
        setField(term4226, term4226.getClass(), "jsType", null);
        setField(term4226, term4226.getClass(), "parent", null);
        setField(term4206, term4206.getClass(), "first", term4226);
        setField(term4206, term4206.getClass(), "last", term4226);
        setField(term4206, term4206.getClass(), "propListHead", null);
        setIntField(term4206, term4206.getClass(), "sourcePosition", 0);
        setField(term4206, term4206.getClass(), "jsType", null);
        setField(term4206, term4206.getClass(), "parent", null);
        setField(term4204, term4204.getClass(), "next", term4206);
        setField(term4204, term4204.getClass(), "first", term4210);
        setField(term4204, term4204.getClass(), "last", term4212);
        setField(term4204, term4204.getClass(), "propListHead", null);
        setIntField(term4204, term4204.getClass(), "sourcePosition", 0);
        setField(term4204, term4204.getClass(), "jsType", null);
        setField(term4204, term4204.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4204;
        try {
            callMethod(klass, "getBestLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


