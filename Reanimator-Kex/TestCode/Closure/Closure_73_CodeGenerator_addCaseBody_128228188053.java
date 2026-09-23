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

public class CodeGenerator_addCaseBody_128228188053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2128;
     Object term2129;

    public CodeGenerator_addCaseBody_128228188053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2128 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2128, term2128.getClass(), "cc", null);
        setField(term2128, term2128.getClass(), "outputCharsetEncoder", null);
        term2129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2142 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2152 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2129, term2129.getClass(), "type", -1697741339);
        setIntField(term2131, term2131.getClass(), "type", 2098647989);
        setIntField(term2133, term2133.getClass(), "type", 0);
        setField(term2133, term2133.getClass(), "next", null);
        setField(term2133, term2133.getClass(), "first", null);
        setField(term2133, term2133.getClass(), "last", null);
        setField(term2133, term2133.getClass(), "propListHead", null);
        setIntField(term2133, term2133.getClass(), "sourcePosition", 0);
        setField(term2133, term2133.getClass(), "jsType", null);
        setField(term2133, term2133.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "next", term2133);
        setIntField(term2136, term2136.getClass(), "type", 0);
        setField(term2136, term2136.getClass(), "next", null);
        setField(term2136, term2136.getClass(), "first", null);
        setField(term2136, term2136.getClass(), "last", null);
        setField(term2136, term2136.getClass(), "propListHead", null);
        setIntField(term2136, term2136.getClass(), "sourcePosition", 0);
        setField(term2136, term2136.getClass(), "jsType", null);
        setField(term2136, term2136.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "first", term2136);
        setIntField(term2139, term2139.getClass(), "type", 0);
        setField(term2139, term2139.getClass(), "next", null);
        setField(term2139, term2139.getClass(), "first", null);
        setField(term2139, term2139.getClass(), "last", null);
        setField(term2139, term2139.getClass(), "propListHead", null);
        setIntField(term2139, term2139.getClass(), "sourcePosition", 0);
        setField(term2139, term2139.getClass(), "jsType", null);
        setField(term2139, term2139.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "last", term2139);
        setField(term2142, term2142.getClass(), "next", null);
        setIntField(term2142, term2142.getClass(), "type", 0);
        setIntField(term2142, term2142.getClass(), "intValue", 0);
        setField(term2142, term2142.getClass(), "objectValue", null);
        setField(term2131, term2131.getClass(), "propListHead", term2142);
        setIntField(term2131, term2131.getClass(), "sourcePosition", -227365013);
        setField(term2131, term2131.getClass(), "jsType", null);
        setField(term2131, term2131.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "next", term2131);
        setIntField(term2146, term2146.getClass(), "type", 0);
        setField(term2146, term2146.getClass(), "next", null);
        setField(term2146, term2146.getClass(), "first", null);
        setField(term2146, term2146.getClass(), "last", null);
        setField(term2146, term2146.getClass(), "propListHead", null);
        setIntField(term2146, term2146.getClass(), "sourcePosition", 0);
        setField(term2146, term2146.getClass(), "jsType", null);
        setField(term2146, term2146.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "first", term2146);
        setIntField(term2149, term2149.getClass(), "type", 0);
        setField(term2149, term2149.getClass(), "next", null);
        setField(term2149, term2149.getClass(), "first", null);
        setField(term2149, term2149.getClass(), "last", null);
        setField(term2149, term2149.getClass(), "propListHead", null);
        setIntField(term2149, term2149.getClass(), "sourcePosition", 0);
        setField(term2149, term2149.getClass(), "jsType", null);
        setField(term2149, term2149.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "last", term2149);
        setField(term2152, term2152.getClass(), "next", null);
        setIntField(term2152, term2152.getClass(), "type", 0);
        setIntField(term2152, term2152.getClass(), "intValue", 0);
        setField(term2152, term2152.getClass(), "objectValue", null);
        setField(term2129, term2129.getClass(), "propListHead", term2152);
        setIntField(term2129, term2129.getClass(), "sourcePosition", 11724947);
        setField(term2129, term2129.getClass(), "jsType", null);
        setField(term2129, term2129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2129;
        try {
            callMethod(klass, "addCaseBody", argTypes, term2128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


