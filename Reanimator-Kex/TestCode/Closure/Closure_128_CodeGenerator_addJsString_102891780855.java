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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addJsString_102891780855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7315;
     Object term7328;

    public CodeGenerator_addJsString_102891780855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7316 = new HashMap();
        term7315 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7315, term7315.getClass(), "ESCAPED_JS_STRINGS", term7316);
        setField(term7315, term7315.getClass(), "cc", null);
        setField(term7315, term7315.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7315, term7315.getClass(), "preferSingleQuotes", false);
        setBooleanField(term7315, term7315.getClass(), "trustedStrings", false);
        term7328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7334 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7328, term7328.getClass(), "type", 107945604);
        setIntField(term7330, term7330.getClass(), "type", -1963464809);
        setIntField(term7332, term7332.getClass(), "type", 71190297);
        setIntField(term7334, term7334.getClass(), "type", 1202361360);
        setIntField(term7336, term7336.getClass(), "type", -2015048153);
        setField(term7336, term7336.getClass(), "next", null);
        setField(term7336, term7336.getClass(), "first", null);
        setField(term7336, term7336.getClass(), "last", null);
        setField(term7336, term7336.getClass(), "propListHead", null);
        setIntField(term7336, term7336.getClass(), "sourcePosition", 0);
        setField(term7336, term7336.getClass(), "jsType", null);
        setField(term7336, term7336.getClass(), "parent", null);
        setField(term7334, term7334.getClass(), "next", term7336);
        setIntField(term7339, term7339.getClass(), "type", -2063457669);
        setField(term7339, term7339.getClass(), "next", null);
        setField(term7339, term7339.getClass(), "first", null);
        setField(term7339, term7339.getClass(), "last", term7336);
        setField(term7339, term7339.getClass(), "propListHead", null);
        setIntField(term7339, term7339.getClass(), "sourcePosition", 0);
        setField(term7339, term7339.getClass(), "jsType", null);
        setField(term7339, term7339.getClass(), "parent", null);
        setField(term7334, term7334.getClass(), "first", term7339);
        setField(term7334, term7334.getClass(), "last", term7332);
        setField(term7334, term7334.getClass(), "propListHead", null);
        setIntField(term7334, term7334.getClass(), "sourcePosition", 0);
        setField(term7334, term7334.getClass(), "jsType", null);
        setField(term7334, term7334.getClass(), "parent", null);
        setField(term7332, term7332.getClass(), "next", term7334);
        setField(term7332, term7332.getClass(), "first", term7336);
        setIntField(term7343, term7343.getClass(), "type", 2095798786);
        setIntField(term7345, term7345.getClass(), "type", -1565502840);
        setField(term7345, term7345.getClass(), "next", null);
        setField(term7345, term7345.getClass(), "first", term7339);
        setField(term7345, term7345.getClass(), "last", term7334);
        setField(term7345, term7345.getClass(), "propListHead", null);
        setIntField(term7345, term7345.getClass(), "sourcePosition", 0);
        setField(term7345, term7345.getClass(), "jsType", null);
        setField(term7345, term7345.getClass(), "parent", null);
        setField(term7343, term7343.getClass(), "next", term7345);
        setField(term7343, term7343.getClass(), "first", term7330);
        setField(term7343, term7343.getClass(), "last", term7330);
        setField(term7343, term7343.getClass(), "propListHead", null);
        setIntField(term7343, term7343.getClass(), "sourcePosition", 0);
        setField(term7343, term7343.getClass(), "jsType", null);
        setField(term7343, term7343.getClass(), "parent", null);
        setField(term7332, term7332.getClass(), "last", term7343);
        setField(term7332, term7332.getClass(), "propListHead", null);
        setIntField(term7332, term7332.getClass(), "sourcePosition", 0);
        setField(term7332, term7332.getClass(), "jsType", null);
        setField(term7332, term7332.getClass(), "parent", null);
        setField(term7330, term7330.getClass(), "next", term7332);
        setIntField(term7350, term7350.getClass(), "type", 344323424);
        setField(term7350, term7350.getClass(), "next", term7343);
        setField(term7350, term7350.getClass(), "first", term7345);
        setField(term7350, term7350.getClass(), "last", term7328);
        setField(term7350, term7350.getClass(), "propListHead", null);
        setIntField(term7350, term7350.getClass(), "sourcePosition", 0);
        setField(term7350, term7350.getClass(), "jsType", null);
        setField(term7350, term7350.getClass(), "parent", null);
        setField(term7330, term7330.getClass(), "first", term7350);
        setField(term7330, term7330.getClass(), "last", term7350);
        setField(term7330, term7330.getClass(), "propListHead", null);
        setIntField(term7330, term7330.getClass(), "sourcePosition", 0);
        setField(term7330, term7330.getClass(), "jsType", null);
        setField(term7330, term7330.getClass(), "parent", null);
        setField(term7328, term7328.getClass(), "next", term7330);
        setField(term7328, term7328.getClass(), "first", term7334);
        setField(term7328, term7328.getClass(), "last", term7336);
        setField(term7328, term7328.getClass(), "propListHead", null);
        setIntField(term7328, term7328.getClass(), "sourcePosition", 0);
        setField(term7328, term7328.getClass(), "jsType", null);
        setField(term7328, term7328.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7328;
        try {
            callMethod(klass, "addJsString", argTypes, term7315, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


