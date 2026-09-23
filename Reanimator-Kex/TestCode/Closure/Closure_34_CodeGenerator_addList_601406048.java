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

public class CodeGenerator_addList_601406048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2108;
     Object term2119;

    public CodeGenerator_addList_601406048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2109 = new HashMap();
        term2108 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2108, term2108.getClass(), "ESCAPED_JS_STRINGS", term2109);
        setField(term2108, term2108.getClass(), "cc", null);
        setField(term2108, term2108.getClass(), "outputCharsetEncoder", null);
        term2119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2119, term2119.getClass(), "type", 335112684);
        setIntField(term2121, term2121.getClass(), "type", 1551099402);
        setIntField(term2123, term2123.getClass(), "type", -2027534003);
        setIntField(term2125, term2125.getClass(), "type", 1063420942);
        setIntField(term2127, term2127.getClass(), "type", 1375330971);
        setField(term2127, term2127.getClass(), "next", null);
        setField(term2127, term2127.getClass(), "first", null);
        setField(term2127, term2127.getClass(), "last", null);
        setField(term2127, term2127.getClass(), "propListHead", null);
        setIntField(term2127, term2127.getClass(), "sourcePosition", 0);
        setField(term2127, term2127.getClass(), "jsType", null);
        setField(term2127, term2127.getClass(), "parent", null);
        setField(term2125, term2125.getClass(), "next", term2127);
        setIntField(term2130, term2130.getClass(), "type", -478195677);
        setField(term2130, term2130.getClass(), "next", null);
        setField(term2130, term2130.getClass(), "first", null);
        setField(term2130, term2130.getClass(), "last", term2127);
        setField(term2130, term2130.getClass(), "propListHead", null);
        setIntField(term2130, term2130.getClass(), "sourcePosition", 0);
        setField(term2130, term2130.getClass(), "jsType", null);
        setField(term2130, term2130.getClass(), "parent", null);
        setField(term2125, term2125.getClass(), "first", term2130);
        setField(term2125, term2125.getClass(), "last", term2123);
        setField(term2125, term2125.getClass(), "propListHead", null);
        setIntField(term2125, term2125.getClass(), "sourcePosition", 0);
        setField(term2125, term2125.getClass(), "jsType", null);
        setField(term2125, term2125.getClass(), "parent", null);
        setField(term2123, term2123.getClass(), "next", term2125);
        setField(term2123, term2123.getClass(), "first", term2127);
        setIntField(term2134, term2134.getClass(), "type", 1655935355);
        setIntField(term2136, term2136.getClass(), "type", -481533957);
        setField(term2136, term2136.getClass(), "next", null);
        setField(term2136, term2136.getClass(), "first", term2130);
        setField(term2136, term2136.getClass(), "last", term2125);
        setField(term2136, term2136.getClass(), "propListHead", null);
        setIntField(term2136, term2136.getClass(), "sourcePosition", 0);
        setField(term2136, term2136.getClass(), "jsType", null);
        setField(term2136, term2136.getClass(), "parent", null);
        setField(term2134, term2134.getClass(), "next", term2136);
        setField(term2134, term2134.getClass(), "first", term2121);
        setField(term2134, term2134.getClass(), "last", term2121);
        setField(term2134, term2134.getClass(), "propListHead", null);
        setIntField(term2134, term2134.getClass(), "sourcePosition", 0);
        setField(term2134, term2134.getClass(), "jsType", null);
        setField(term2134, term2134.getClass(), "parent", null);
        setField(term2123, term2123.getClass(), "last", term2134);
        setField(term2123, term2123.getClass(), "propListHead", null);
        setIntField(term2123, term2123.getClass(), "sourcePosition", 0);
        setField(term2123, term2123.getClass(), "jsType", null);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2121, term2121.getClass(), "next", term2123);
        setIntField(term2141, term2141.getClass(), "type", 1240914516);
        setField(term2141, term2141.getClass(), "next", term2134);
        setField(term2141, term2141.getClass(), "first", term2136);
        setField(term2141, term2141.getClass(), "last", term2119);
        setField(term2141, term2141.getClass(), "propListHead", null);
        setIntField(term2141, term2141.getClass(), "sourcePosition", 0);
        setField(term2141, term2141.getClass(), "jsType", null);
        setField(term2141, term2141.getClass(), "parent", null);
        setField(term2121, term2121.getClass(), "first", term2141);
        setField(term2121, term2121.getClass(), "last", term2141);
        setField(term2121, term2121.getClass(), "propListHead", null);
        setIntField(term2121, term2121.getClass(), "sourcePosition", 0);
        setField(term2121, term2121.getClass(), "jsType", null);
        setField(term2121, term2121.getClass(), "parent", null);
        setField(term2119, term2119.getClass(), "next", term2121);
        setField(term2119, term2119.getClass(), "first", term2125);
        setField(term2119, term2119.getClass(), "last", term2127);
        setField(term2119, term2119.getClass(), "propListHead", null);
        setIntField(term2119, term2119.getClass(), "sourcePosition", 0);
        setField(term2119, term2119.getClass(), "jsType", null);
        setField(term2119, term2119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2119;
        try {
            callMethod(klass, "addList", argTypes, term2108, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


