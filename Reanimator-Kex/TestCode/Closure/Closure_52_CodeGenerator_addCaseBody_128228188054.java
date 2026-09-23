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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addCaseBody_128228188054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2206;
     Object term2217;

    public CodeGenerator_addCaseBody_128228188054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2207 = new HashMap();
        term2206 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2206, term2206.getClass(), "ESCAPED_JS_STRINGS", term2207);
        setField(term2206, term2206.getClass(), "cc", null);
        setField(term2206, term2206.getClass(), "outputCharsetEncoder", null);
        term2217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2217, term2217.getClass(), "type", -375014958);
        setIntField(term2219, term2219.getClass(), "type", -2015854073);
        setIntField(term2221, term2221.getClass(), "type", 0);
        setField(term2221, term2221.getClass(), "next", null);
        setField(term2221, term2221.getClass(), "first", null);
        setField(term2221, term2221.getClass(), "last", null);
        setField(term2221, term2221.getClass(), "propListHead", null);
        setIntField(term2221, term2221.getClass(), "sourcePosition", 0);
        setField(term2221, term2221.getClass(), "jsType", null);
        setField(term2221, term2221.getClass(), "parent", null);
        setField(term2219, term2219.getClass(), "next", term2221);
        setIntField(term2224, term2224.getClass(), "type", 0);
        setField(term2224, term2224.getClass(), "next", null);
        setField(term2224, term2224.getClass(), "first", null);
        setField(term2224, term2224.getClass(), "last", null);
        setField(term2224, term2224.getClass(), "propListHead", null);
        setIntField(term2224, term2224.getClass(), "sourcePosition", 0);
        setField(term2224, term2224.getClass(), "jsType", null);
        setField(term2224, term2224.getClass(), "parent", null);
        setField(term2219, term2219.getClass(), "first", term2224);
        setIntField(term2227, term2227.getClass(), "type", 0);
        setField(term2227, term2227.getClass(), "next", null);
        setField(term2227, term2227.getClass(), "first", null);
        setField(term2227, term2227.getClass(), "last", null);
        setField(term2227, term2227.getClass(), "propListHead", null);
        setIntField(term2227, term2227.getClass(), "sourcePosition", 0);
        setField(term2227, term2227.getClass(), "jsType", null);
        setField(term2227, term2227.getClass(), "parent", null);
        setField(term2219, term2219.getClass(), "last", term2227);
        setField(term2219, term2219.getClass(), "propListHead", null);
        setIntField(term2219, term2219.getClass(), "sourcePosition", 0);
        setField(term2219, term2219.getClass(), "jsType", null);
        setField(term2219, term2219.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "next", term2219);
        setIntField(term2231, term2231.getClass(), "type", 0);
        setField(term2231, term2231.getClass(), "next", null);
        setField(term2231, term2231.getClass(), "first", null);
        setField(term2231, term2231.getClass(), "last", null);
        setField(term2231, term2231.getClass(), "propListHead", null);
        setIntField(term2231, term2231.getClass(), "sourcePosition", 0);
        setField(term2231, term2231.getClass(), "jsType", null);
        setField(term2231, term2231.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "first", term2231);
        setIntField(term2234, term2234.getClass(), "type", 0);
        setField(term2234, term2234.getClass(), "next", null);
        setField(term2234, term2234.getClass(), "first", null);
        setField(term2234, term2234.getClass(), "last", null);
        setField(term2234, term2234.getClass(), "propListHead", null);
        setIntField(term2234, term2234.getClass(), "sourcePosition", 0);
        setField(term2234, term2234.getClass(), "jsType", null);
        setField(term2234, term2234.getClass(), "parent", null);
        setField(term2217, term2217.getClass(), "last", term2234);
        setField(term2217, term2217.getClass(), "propListHead", null);
        setIntField(term2217, term2217.getClass(), "sourcePosition", 0);
        setField(term2217, term2217.getClass(), "jsType", null);
        setField(term2217, term2217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2217;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


