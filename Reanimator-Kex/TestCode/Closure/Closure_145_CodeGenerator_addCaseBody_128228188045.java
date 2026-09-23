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

public class CodeGenerator_addCaseBody_128228188045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;
     Object term2067;

    public CodeGenerator_addCaseBody_128228188045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2066, term2066.getClass(), "cc", null);
        setField(term2066, term2066.getClass(), "outputCharsetEncoder", null);
        term2067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2080 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2090 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2067, term2067.getClass(), "type", 344323424);
        setIntField(term2069, term2069.getClass(), "type", 202001407);
        setIntField(term2071, term2071.getClass(), "type", 0);
        setField(term2071, term2071.getClass(), "next", null);
        setField(term2071, term2071.getClass(), "first", null);
        setField(term2071, term2071.getClass(), "last", null);
        setField(term2071, term2071.getClass(), "propListHead", null);
        setIntField(term2071, term2071.getClass(), "sourcePosition", 0);
        setField(term2071, term2071.getClass(), "jsType", null);
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2069, term2069.getClass(), "next", term2071);
        setIntField(term2074, term2074.getClass(), "type", 0);
        setField(term2074, term2074.getClass(), "next", null);
        setField(term2074, term2074.getClass(), "first", null);
        setField(term2074, term2074.getClass(), "last", null);
        setField(term2074, term2074.getClass(), "propListHead", null);
        setIntField(term2074, term2074.getClass(), "sourcePosition", 0);
        setField(term2074, term2074.getClass(), "jsType", null);
        setField(term2074, term2074.getClass(), "parent", null);
        setField(term2069, term2069.getClass(), "first", term2074);
        setIntField(term2077, term2077.getClass(), "type", 0);
        setField(term2077, term2077.getClass(), "next", null);
        setField(term2077, term2077.getClass(), "first", null);
        setField(term2077, term2077.getClass(), "last", null);
        setField(term2077, term2077.getClass(), "propListHead", null);
        setIntField(term2077, term2077.getClass(), "sourcePosition", 0);
        setField(term2077, term2077.getClass(), "jsType", null);
        setField(term2077, term2077.getClass(), "parent", null);
        setField(term2069, term2069.getClass(), "last", term2077);
        setField(term2080, term2080.getClass(), "next", null);
        setIntField(term2080, term2080.getClass(), "type", 0);
        setIntField(term2080, term2080.getClass(), "intValue", 0);
        setField(term2080, term2080.getClass(), "objectValue", null);
        setField(term2069, term2069.getClass(), "propListHead", term2080);
        setIntField(term2069, term2069.getClass(), "sourcePosition", -1697741339);
        setField(term2069, term2069.getClass(), "jsType", null);
        setField(term2069, term2069.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "next", term2069);
        setIntField(term2084, term2084.getClass(), "type", 0);
        setField(term2084, term2084.getClass(), "next", null);
        setField(term2084, term2084.getClass(), "first", null);
        setField(term2084, term2084.getClass(), "last", null);
        setField(term2084, term2084.getClass(), "propListHead", null);
        setIntField(term2084, term2084.getClass(), "sourcePosition", 0);
        setField(term2084, term2084.getClass(), "jsType", null);
        setField(term2084, term2084.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "first", term2084);
        setIntField(term2087, term2087.getClass(), "type", 0);
        setField(term2087, term2087.getClass(), "next", null);
        setField(term2087, term2087.getClass(), "first", null);
        setField(term2087, term2087.getClass(), "last", null);
        setField(term2087, term2087.getClass(), "propListHead", null);
        setIntField(term2087, term2087.getClass(), "sourcePosition", 0);
        setField(term2087, term2087.getClass(), "jsType", null);
        setField(term2087, term2087.getClass(), "parent", null);
        setField(term2067, term2067.getClass(), "last", term2087);
        setField(term2090, term2090.getClass(), "next", null);
        setIntField(term2090, term2090.getClass(), "type", 0);
        setIntField(term2090, term2090.getClass(), "intValue", 0);
        setField(term2090, term2090.getClass(), "objectValue", null);
        setField(term2067, term2067.getClass(), "propListHead", term2090);
        setIntField(term2067, term2067.getClass(), "sourcePosition", 98922530);
        setField(term2067, term2067.getClass(), "jsType", null);
        setField(term2067, term2067.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2067;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2066, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


