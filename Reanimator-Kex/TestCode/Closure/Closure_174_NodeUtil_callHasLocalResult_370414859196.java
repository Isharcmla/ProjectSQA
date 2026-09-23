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

public class NodeUtil_callHasLocalResult_370414859196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756;

    public NodeUtil_callHasLocalResult_370414859196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term756, term756.getClass(), "type", 1507074215);
        setIntField(term758, term758.getClass(), "type", -282881827);
        setIntField(term760, term760.getClass(), "type", -1183353915);
        setIntField(term762, term762.getClass(), "type", -420030135);
        setIntField(term764, term764.getClass(), "type", 267763294);
        setField(term764, term764.getClass(), "next", null);
        setField(term764, term764.getClass(), "first", null);
        setField(term764, term764.getClass(), "last", null);
        setField(term764, term764.getClass(), "propListHead", null);
        setIntField(term764, term764.getClass(), "sourcePosition", 0);
        setField(term764, term764.getClass(), "jsType", null);
        setField(term764, term764.getClass(), "parent", null);
        setField(term762, term762.getClass(), "next", term764);
        setIntField(term767, term767.getClass(), "type", -1497710478);
        setField(term767, term767.getClass(), "next", null);
        setField(term767, term767.getClass(), "first", null);
        setField(term767, term767.getClass(), "last", term764);
        setField(term767, term767.getClass(), "propListHead", null);
        setIntField(term767, term767.getClass(), "sourcePosition", 0);
        setField(term767, term767.getClass(), "jsType", null);
        setField(term767, term767.getClass(), "parent", null);
        setField(term762, term762.getClass(), "first", term767);
        setField(term762, term762.getClass(), "last", term760);
        setField(term762, term762.getClass(), "propListHead", null);
        setIntField(term762, term762.getClass(), "sourcePosition", 0);
        setField(term762, term762.getClass(), "jsType", null);
        setField(term762, term762.getClass(), "parent", null);
        setField(term760, term760.getClass(), "next", term762);
        setField(term760, term760.getClass(), "first", term764);
        setIntField(term771, term771.getClass(), "type", -525257914);
        setIntField(term773, term773.getClass(), "type", 147209682);
        setField(term773, term773.getClass(), "next", null);
        setField(term773, term773.getClass(), "first", term767);
        setField(term773, term773.getClass(), "last", term762);
        setField(term773, term773.getClass(), "propListHead", null);
        setIntField(term773, term773.getClass(), "sourcePosition", 0);
        setField(term773, term773.getClass(), "jsType", null);
        setField(term773, term773.getClass(), "parent", null);
        setField(term771, term771.getClass(), "next", term773);
        setField(term771, term771.getClass(), "first", term758);
        setField(term771, term771.getClass(), "last", term758);
        setField(term771, term771.getClass(), "propListHead", null);
        setIntField(term771, term771.getClass(), "sourcePosition", 0);
        setField(term771, term771.getClass(), "jsType", null);
        setField(term771, term771.getClass(), "parent", null);
        setField(term760, term760.getClass(), "last", term771);
        setField(term760, term760.getClass(), "propListHead", null);
        setIntField(term760, term760.getClass(), "sourcePosition", 0);
        setField(term760, term760.getClass(), "jsType", null);
        setField(term760, term760.getClass(), "parent", null);
        setField(term758, term758.getClass(), "next", term760);
        setIntField(term778, term778.getClass(), "type", 34470066);
        setField(term778, term778.getClass(), "next", term771);
        setField(term778, term778.getClass(), "first", term773);
        setField(term778, term778.getClass(), "last", term756);
        setField(term778, term778.getClass(), "propListHead", null);
        setIntField(term778, term778.getClass(), "sourcePosition", 0);
        setField(term778, term778.getClass(), "jsType", null);
        setField(term778, term778.getClass(), "parent", null);
        setField(term758, term758.getClass(), "first", term778);
        setField(term758, term758.getClass(), "last", term778);
        setField(term758, term758.getClass(), "propListHead", null);
        setIntField(term758, term758.getClass(), "sourcePosition", 0);
        setField(term758, term758.getClass(), "jsType", null);
        setField(term758, term758.getClass(), "parent", null);
        setField(term756, term756.getClass(), "next", term758);
        setField(term756, term756.getClass(), "first", term762);
        setField(term756, term756.getClass(), "last", term764);
        setField(term756, term756.getClass(), "propListHead", null);
        setIntField(term756, term756.getClass(), "sourcePosition", 0);
        setField(term756, term756.getClass(), "jsType", null);
        setField(term756, term756.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term756;
        try {
            callMethod(klass, "callHasLocalResult", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


