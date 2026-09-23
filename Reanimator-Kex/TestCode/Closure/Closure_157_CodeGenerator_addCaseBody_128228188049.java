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

public class CodeGenerator_addCaseBody_128228188049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2084;
     Object term2085;

    public CodeGenerator_addCaseBody_128228188049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2084 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2084, term2084.getClass(), "cc", null);
        setField(term2084, term2084.getClass(), "outputCharsetEncoder", null);
        term2085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2098 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2085, term2085.getClass(), "type", -1697741339);
        setIntField(term2087, term2087.getClass(), "type", 2098647989);
        setIntField(term2089, term2089.getClass(), "type", 0);
        setField(term2089, term2089.getClass(), "next", null);
        setField(term2089, term2089.getClass(), "first", null);
        setField(term2089, term2089.getClass(), "last", null);
        setField(term2089, term2089.getClass(), "propListHead", null);
        setIntField(term2089, term2089.getClass(), "sourcePosition", 0);
        setField(term2089, term2089.getClass(), "jsType", null);
        setField(term2089, term2089.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "next", term2089);
        setIntField(term2092, term2092.getClass(), "type", 0);
        setField(term2092, term2092.getClass(), "next", null);
        setField(term2092, term2092.getClass(), "first", null);
        setField(term2092, term2092.getClass(), "last", null);
        setField(term2092, term2092.getClass(), "propListHead", null);
        setIntField(term2092, term2092.getClass(), "sourcePosition", 0);
        setField(term2092, term2092.getClass(), "jsType", null);
        setField(term2092, term2092.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "first", term2092);
        setIntField(term2095, term2095.getClass(), "type", 0);
        setField(term2095, term2095.getClass(), "next", null);
        setField(term2095, term2095.getClass(), "first", null);
        setField(term2095, term2095.getClass(), "last", null);
        setField(term2095, term2095.getClass(), "propListHead", null);
        setIntField(term2095, term2095.getClass(), "sourcePosition", 0);
        setField(term2095, term2095.getClass(), "jsType", null);
        setField(term2095, term2095.getClass(), "parent", null);
        setField(term2087, term2087.getClass(), "last", term2095);
        setField(term2098, term2098.getClass(), "next", null);
        setIntField(term2098, term2098.getClass(), "type", 0);
        setIntField(term2098, term2098.getClass(), "intValue", 0);
        setField(term2098, term2098.getClass(), "objectValue", null);
        setField(term2087, term2087.getClass(), "propListHead", term2098);
        setIntField(term2087, term2087.getClass(), "sourcePosition", -227365013);
        setField(term2087, term2087.getClass(), "jsType", null);
        setField(term2087, term2087.getClass(), "parent", null);
        setField(term2085, term2085.getClass(), "next", term2087);
        setIntField(term2102, term2102.getClass(), "type", 0);
        setField(term2102, term2102.getClass(), "next", null);
        setField(term2102, term2102.getClass(), "first", null);
        setField(term2102, term2102.getClass(), "last", null);
        setField(term2102, term2102.getClass(), "propListHead", null);
        setIntField(term2102, term2102.getClass(), "sourcePosition", 0);
        setField(term2102, term2102.getClass(), "jsType", null);
        setField(term2102, term2102.getClass(), "parent", null);
        setField(term2085, term2085.getClass(), "first", term2102);
        setIntField(term2105, term2105.getClass(), "type", 0);
        setField(term2105, term2105.getClass(), "next", null);
        setField(term2105, term2105.getClass(), "first", null);
        setField(term2105, term2105.getClass(), "last", null);
        setField(term2105, term2105.getClass(), "propListHead", null);
        setIntField(term2105, term2105.getClass(), "sourcePosition", 0);
        setField(term2105, term2105.getClass(), "jsType", null);
        setField(term2105, term2105.getClass(), "parent", null);
        setField(term2085, term2085.getClass(), "last", term2105);
        setField(term2108, term2108.getClass(), "next", null);
        setIntField(term2108, term2108.getClass(), "type", 0);
        setIntField(term2108, term2108.getClass(), "intValue", 0);
        setField(term2108, term2108.getClass(), "objectValue", null);
        setField(term2085, term2085.getClass(), "propListHead", term2108);
        setIntField(term2085, term2085.getClass(), "sourcePosition", 11724947);
        setField(term2085, term2085.getClass(), "jsType", null);
        setField(term2085, term2085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2085;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2084, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


