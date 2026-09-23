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

public class CodeGenerator_add_29631458240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term89;

    public CodeGenerator_add_29631458240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term79 = new HashMap();
        term78 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term78, term78.getClass(), "ESCAPED_JS_STRINGS", term79);
        setField(term78, term78.getClass(), "cc", null);
        setField(term78, term78.getClass(), "outputCharsetEncoder", null);
        term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89, term89.getClass(), "type", 391863371);
        setIntField(term91, term91.getClass(), "type", -2038273078);
        setIntField(term93, term93.getClass(), "type", 0);
        setField(term93, term93.getClass(), "next", null);
        setField(term93, term93.getClass(), "first", null);
        setField(term93, term93.getClass(), "last", null);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term91, term91.getClass(), "next", term93);
        setIntField(term96, term96.getClass(), "type", 0);
        setField(term96, term96.getClass(), "next", null);
        setField(term96, term96.getClass(), "first", null);
        setField(term96, term96.getClass(), "last", null);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
        setField(term91, term91.getClass(), "first", term96);
        setIntField(term99, term99.getClass(), "type", 0);
        setField(term99, term99.getClass(), "next", null);
        setField(term99, term99.getClass(), "first", null);
        setField(term99, term99.getClass(), "last", null);
        setField(term99, term99.getClass(), "propListHead", null);
        setIntField(term99, term99.getClass(), "sourcePosition", 0);
        setField(term99, term99.getClass(), "jsType", null);
        setField(term99, term99.getClass(), "parent", null);
        setField(term91, term91.getClass(), "last", term99);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term89, term89.getClass(), "next", term91);
        setIntField(term103, term103.getClass(), "type", 0);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", null);
        setField(term103, term103.getClass(), "last", null);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term89, term89.getClass(), "first", term103);
        setIntField(term106, term106.getClass(), "type", 0);
        setField(term106, term106.getClass(), "next", null);
        setField(term106, term106.getClass(), "first", null);
        setField(term106, term106.getClass(), "last", null);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        setField(term89, term89.getClass(), "last", term106);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "add", argTypes, term78, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


