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
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2056;
     Object term2057;

    public CodeGenerator_addArrayList_133911242748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2056 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2056, term2056.getClass(), "cc", null);
        setField(term2056, term2056.getClass(), "outputCharsetEncoder", null);
        term2057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2070 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2057, term2057.getClass(), "type", -2015048153);
        setIntField(term2059, term2059.getClass(), "type", -1565502840);
        setIntField(term2061, term2061.getClass(), "type", 0);
        setField(term2061, term2061.getClass(), "next", null);
        setField(term2061, term2061.getClass(), "first", null);
        setField(term2061, term2061.getClass(), "last", null);
        setField(term2061, term2061.getClass(), "propListHead", null);
        setIntField(term2061, term2061.getClass(), "sourcePosition", 0);
        setField(term2061, term2061.getClass(), "jsType", null);
        setField(term2061, term2061.getClass(), "parent", null);
        setField(term2059, term2059.getClass(), "next", term2061);
        setIntField(term2064, term2064.getClass(), "type", 0);
        setField(term2064, term2064.getClass(), "next", null);
        setField(term2064, term2064.getClass(), "first", null);
        setField(term2064, term2064.getClass(), "last", null);
        setField(term2064, term2064.getClass(), "propListHead", null);
        setIntField(term2064, term2064.getClass(), "sourcePosition", 0);
        setField(term2064, term2064.getClass(), "jsType", null);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2059, term2059.getClass(), "first", term2064);
        setIntField(term2067, term2067.getClass(), "type", 0);
        setField(term2067, term2067.getClass(), "next", null);
        setField(term2067, term2067.getClass(), "first", null);
        setField(term2067, term2067.getClass(), "last", null);
        setField(term2067, term2067.getClass(), "propListHead", null);
        setIntField(term2067, term2067.getClass(), "sourcePosition", 0);
        setField(term2067, term2067.getClass(), "jsType", null);
        setField(term2067, term2067.getClass(), "parent", null);
        setField(term2059, term2059.getClass(), "last", term2067);
        setField(term2070, term2070.getClass(), "next", null);
        setIntField(term2070, term2070.getClass(), "type", 0);
        setIntField(term2070, term2070.getClass(), "intValue", 0);
        setField(term2070, term2070.getClass(), "objectValue", null);
        setField(term2059, term2059.getClass(), "propListHead", term2070);
        setIntField(term2059, term2059.getClass(), "sourcePosition", -25637976);
        setField(term2059, term2059.getClass(), "jsType", null);
        setField(term2059, term2059.getClass(), "parent", null);
        setField(term2057, term2057.getClass(), "next", term2059);
        setIntField(term2074, term2074.getClass(), "type", 0);
        setField(term2074, term2074.getClass(), "next", null);
        setField(term2074, term2074.getClass(), "first", null);
        setField(term2074, term2074.getClass(), "last", null);
        setField(term2074, term2074.getClass(), "propListHead", null);
        setIntField(term2074, term2074.getClass(), "sourcePosition", 0);
        setField(term2074, term2074.getClass(), "jsType", null);
        setField(term2074, term2074.getClass(), "parent", null);
        setField(term2057, term2057.getClass(), "first", term2074);
        setIntField(term2077, term2077.getClass(), "type", 0);
        setField(term2077, term2077.getClass(), "next", null);
        setField(term2077, term2077.getClass(), "first", null);
        setField(term2077, term2077.getClass(), "last", null);
        setField(term2077, term2077.getClass(), "propListHead", null);
        setIntField(term2077, term2077.getClass(), "sourcePosition", 0);
        setField(term2077, term2077.getClass(), "jsType", null);
        setField(term2077, term2077.getClass(), "parent", null);
        setField(term2057, term2057.getClass(), "last", term2077);
        setField(term2080, term2080.getClass(), "next", null);
        setIntField(term2080, term2080.getClass(), "type", 0);
        setIntField(term2080, term2080.getClass(), "intValue", 0);
        setField(term2080, term2080.getClass(), "objectValue", null);
        setField(term2057, term2057.getClass(), "propListHead", term2080);
        setIntField(term2057, term2057.getClass(), "sourcePosition", 1555897383);
        setField(term2057, term2057.getClass(), "jsType", null);
        setField(term2057, term2057.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2057;
        try {
            callMethod(klass, "addArrayList", argTypes, term2056, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


