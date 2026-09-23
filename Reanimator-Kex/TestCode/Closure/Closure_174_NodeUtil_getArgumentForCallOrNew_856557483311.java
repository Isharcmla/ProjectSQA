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

public class NodeUtil_getArgumentForCallOrNew_856557483311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4775;
     Object term4802;

    public NodeUtil_getArgumentForCallOrNew_856557483311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4775, term4775.getClass(), "type", 848113442);
        setIntField(term4777, term4777.getClass(), "type", 793974213);
        setIntField(term4779, term4779.getClass(), "type", 722546287);
        setIntField(term4781, term4781.getClass(), "type", -2060284160);
        setIntField(term4783, term4783.getClass(), "type", -568450686);
        setField(term4783, term4783.getClass(), "next", null);
        setField(term4783, term4783.getClass(), "first", null);
        setField(term4783, term4783.getClass(), "last", null);
        setField(term4783, term4783.getClass(), "propListHead", null);
        setIntField(term4783, term4783.getClass(), "sourcePosition", 0);
        setField(term4783, term4783.getClass(), "jsType", null);
        setField(term4783, term4783.getClass(), "parent", null);
        setField(term4781, term4781.getClass(), "next", term4783);
        setIntField(term4786, term4786.getClass(), "type", 1314660281);
        setField(term4786, term4786.getClass(), "next", null);
        setField(term4786, term4786.getClass(), "first", null);
        setField(term4786, term4786.getClass(), "last", term4783);
        setField(term4786, term4786.getClass(), "propListHead", null);
        setIntField(term4786, term4786.getClass(), "sourcePosition", 0);
        setField(term4786, term4786.getClass(), "jsType", null);
        setField(term4786, term4786.getClass(), "parent", null);
        setField(term4781, term4781.getClass(), "first", term4786);
        setField(term4781, term4781.getClass(), "last", term4779);
        setField(term4781, term4781.getClass(), "propListHead", null);
        setIntField(term4781, term4781.getClass(), "sourcePosition", 0);
        setField(term4781, term4781.getClass(), "jsType", null);
        setField(term4781, term4781.getClass(), "parent", null);
        setField(term4779, term4779.getClass(), "next", term4781);
        setField(term4779, term4779.getClass(), "first", term4783);
        setIntField(term4790, term4790.getClass(), "type", 318982923);
        setIntField(term4792, term4792.getClass(), "type", -154210001);
        setField(term4792, term4792.getClass(), "next", null);
        setField(term4792, term4792.getClass(), "first", term4786);
        setField(term4792, term4792.getClass(), "last", term4781);
        setField(term4792, term4792.getClass(), "propListHead", null);
        setIntField(term4792, term4792.getClass(), "sourcePosition", 0);
        setField(term4792, term4792.getClass(), "jsType", null);
        setField(term4792, term4792.getClass(), "parent", null);
        setField(term4790, term4790.getClass(), "next", term4792);
        setField(term4790, term4790.getClass(), "first", term4777);
        setField(term4790, term4790.getClass(), "last", term4777);
        setField(term4790, term4790.getClass(), "propListHead", null);
        setIntField(term4790, term4790.getClass(), "sourcePosition", 0);
        setField(term4790, term4790.getClass(), "jsType", null);
        setField(term4790, term4790.getClass(), "parent", null);
        setField(term4779, term4779.getClass(), "last", term4790);
        setField(term4779, term4779.getClass(), "propListHead", null);
        setIntField(term4779, term4779.getClass(), "sourcePosition", 0);
        setField(term4779, term4779.getClass(), "jsType", null);
        setField(term4779, term4779.getClass(), "parent", null);
        setField(term4777, term4777.getClass(), "next", term4779);
        setIntField(term4797, term4797.getClass(), "type", 621910137);
        setField(term4797, term4797.getClass(), "next", term4790);
        setField(term4797, term4797.getClass(), "first", term4792);
        setField(term4797, term4797.getClass(), "last", term4775);
        setField(term4797, term4797.getClass(), "propListHead", null);
        setIntField(term4797, term4797.getClass(), "sourcePosition", 0);
        setField(term4797, term4797.getClass(), "jsType", null);
        setField(term4797, term4797.getClass(), "parent", null);
        setField(term4777, term4777.getClass(), "first", term4797);
        setField(term4777, term4777.getClass(), "last", term4797);
        setField(term4777, term4777.getClass(), "propListHead", null);
        setIntField(term4777, term4777.getClass(), "sourcePosition", 0);
        setField(term4777, term4777.getClass(), "jsType", null);
        setField(term4777, term4777.getClass(), "parent", null);
        setField(term4775, term4775.getClass(), "next", term4777);
        setField(term4775, term4775.getClass(), "first", term4781);
        setField(term4775, term4775.getClass(), "last", term4783);
        setField(term4775, term4775.getClass(), "propListHead", null);
        setIntField(term4775, term4775.getClass(), "sourcePosition", 0);
        setField(term4775, term4775.getClass(), "jsType", null);
        setField(term4775, term4775.getClass(), "parent", null);
        term4802 = new Integer(241533020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4775;
        args[1] = term4802;
        try {
            callMethod(klass, "getArgumentForCallOrNew", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


