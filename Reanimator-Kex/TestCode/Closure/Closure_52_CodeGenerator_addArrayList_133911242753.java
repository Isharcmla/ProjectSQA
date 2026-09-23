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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2174;
     Object term2185;

    public CodeGenerator_addArrayList_133911242753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2175 = new HashMap();
        term2174 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2174, term2174.getClass(), "ESCAPED_JS_STRINGS", term2175);
        setField(term2174, term2174.getClass(), "cc", null);
        setField(term2174, term2174.getClass(), "outputCharsetEncoder", null);
        term2185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2185, term2185.getClass(), "type", -893623680);
        setIntField(term2187, term2187.getClass(), "type", 1386130016);
        setIntField(term2189, term2189.getClass(), "type", 0);
        setField(term2189, term2189.getClass(), "next", null);
        setField(term2189, term2189.getClass(), "first", null);
        setField(term2189, term2189.getClass(), "last", null);
        setField(term2189, term2189.getClass(), "propListHead", null);
        setIntField(term2189, term2189.getClass(), "sourcePosition", 0);
        setField(term2189, term2189.getClass(), "jsType", null);
        setField(term2189, term2189.getClass(), "parent", null);
        setField(term2187, term2187.getClass(), "next", term2189);
        setIntField(term2192, term2192.getClass(), "type", 0);
        setField(term2192, term2192.getClass(), "next", null);
        setField(term2192, term2192.getClass(), "first", null);
        setField(term2192, term2192.getClass(), "last", null);
        setField(term2192, term2192.getClass(), "propListHead", null);
        setIntField(term2192, term2192.getClass(), "sourcePosition", 0);
        setField(term2192, term2192.getClass(), "jsType", null);
        setField(term2192, term2192.getClass(), "parent", null);
        setField(term2187, term2187.getClass(), "first", term2192);
        setIntField(term2195, term2195.getClass(), "type", 0);
        setField(term2195, term2195.getClass(), "next", null);
        setField(term2195, term2195.getClass(), "first", null);
        setField(term2195, term2195.getClass(), "last", null);
        setField(term2195, term2195.getClass(), "propListHead", null);
        setIntField(term2195, term2195.getClass(), "sourcePosition", 0);
        setField(term2195, term2195.getClass(), "jsType", null);
        setField(term2195, term2195.getClass(), "parent", null);
        setField(term2187, term2187.getClass(), "last", term2195);
        setField(term2187, term2187.getClass(), "propListHead", null);
        setIntField(term2187, term2187.getClass(), "sourcePosition", 0);
        setField(term2187, term2187.getClass(), "jsType", null);
        setField(term2187, term2187.getClass(), "parent", null);
        setField(term2185, term2185.getClass(), "next", term2187);
        setIntField(term2199, term2199.getClass(), "type", 0);
        setField(term2199, term2199.getClass(), "next", null);
        setField(term2199, term2199.getClass(), "first", null);
        setField(term2199, term2199.getClass(), "last", null);
        setField(term2199, term2199.getClass(), "propListHead", null);
        setIntField(term2199, term2199.getClass(), "sourcePosition", 0);
        setField(term2199, term2199.getClass(), "jsType", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2185, term2185.getClass(), "first", term2199);
        setIntField(term2202, term2202.getClass(), "type", 0);
        setField(term2202, term2202.getClass(), "next", null);
        setField(term2202, term2202.getClass(), "first", null);
        setField(term2202, term2202.getClass(), "last", null);
        setField(term2202, term2202.getClass(), "propListHead", null);
        setIntField(term2202, term2202.getClass(), "sourcePosition", 0);
        setField(term2202, term2202.getClass(), "jsType", null);
        setField(term2202, term2202.getClass(), "parent", null);
        setField(term2185, term2185.getClass(), "last", term2202);
        setField(term2185, term2185.getClass(), "propListHead", null);
        setIntField(term2185, term2185.getClass(), "sourcePosition", 0);
        setField(term2185, term2185.getClass(), "jsType", null);
        setField(term2185, term2185.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2185;
        try {
            callMethod(klass, "addArrayList", argTypes, term2174, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


