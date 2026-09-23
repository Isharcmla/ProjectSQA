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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedHashMap;

public class NodeUtil_getVarsDeclaredInBranch_1317953546186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2509;
     Object term13214;
     Object term13207;

    public NodeUtil_getVarsDeclaredInBranch_1317953546186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2522 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2532 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2509, term2509.getClass(), "type", -1641507499);
        setIntField(term2511, term2511.getClass(), "type", -1348703436);
        setIntField(term2513, term2513.getClass(), "type", 0);
        setField(term2513, term2513.getClass(), "next", null);
        setField(term2513, term2513.getClass(), "first", null);
        setField(term2513, term2513.getClass(), "last", null);
        setField(term2513, term2513.getClass(), "propListHead", null);
        setIntField(term2513, term2513.getClass(), "sourcePosition", 0);
        setField(term2513, term2513.getClass(), "jsType", null);
        setField(term2513, term2513.getClass(), "parent", null);
        setField(term2511, term2511.getClass(), "next", term2513);
        setIntField(term2516, term2516.getClass(), "type", 0);
        setField(term2516, term2516.getClass(), "next", null);
        setField(term2516, term2516.getClass(), "first", null);
        setField(term2516, term2516.getClass(), "last", null);
        setField(term2516, term2516.getClass(), "propListHead", null);
        setIntField(term2516, term2516.getClass(), "sourcePosition", 0);
        setField(term2516, term2516.getClass(), "jsType", null);
        setField(term2516, term2516.getClass(), "parent", null);
        setField(term2511, term2511.getClass(), "first", term2516);
        setIntField(term2519, term2519.getClass(), "type", 0);
        setField(term2519, term2519.getClass(), "next", null);
        setField(term2519, term2519.getClass(), "first", null);
        setField(term2519, term2519.getClass(), "last", null);
        setField(term2519, term2519.getClass(), "propListHead", null);
        setIntField(term2519, term2519.getClass(), "sourcePosition", 0);
        setField(term2519, term2519.getClass(), "jsType", null);
        setField(term2519, term2519.getClass(), "parent", null);
        setField(term2511, term2511.getClass(), "last", term2519);
        setField(term2522, term2522.getClass(), "next", null);
        setIntField(term2522, term2522.getClass(), "type", 0);
        setIntField(term2522, term2522.getClass(), "intValue", 0);
        setField(term2522, term2522.getClass(), "objectValue", null);
        setField(term2511, term2511.getClass(), "propListHead", term2522);
        setIntField(term2511, term2511.getClass(), "sourcePosition", -1767079160);
        setField(term2511, term2511.getClass(), "jsType", null);
        setField(term2511, term2511.getClass(), "parent", null);
        setField(term2509, term2509.getClass(), "next", term2511);
        setIntField(term2526, term2526.getClass(), "type", 0);
        setField(term2526, term2526.getClass(), "next", null);
        setField(term2526, term2526.getClass(), "first", null);
        setField(term2526, term2526.getClass(), "last", null);
        setField(term2526, term2526.getClass(), "propListHead", null);
        setIntField(term2526, term2526.getClass(), "sourcePosition", 0);
        setField(term2526, term2526.getClass(), "jsType", null);
        setField(term2526, term2526.getClass(), "parent", null);
        setField(term2509, term2509.getClass(), "first", term2526);
        setIntField(term2529, term2529.getClass(), "type", 0);
        setField(term2529, term2529.getClass(), "next", null);
        setField(term2529, term2529.getClass(), "first", null);
        setField(term2529, term2529.getClass(), "last", null);
        setField(term2529, term2529.getClass(), "propListHead", null);
        setIntField(term2529, term2529.getClass(), "sourcePosition", 0);
        setField(term2529, term2529.getClass(), "jsType", null);
        setField(term2529, term2529.getClass(), "parent", null);
        setField(term2509, term2509.getClass(), "last", term2529);
        setField(term2532, term2532.getClass(), "next", null);
        setIntField(term2532, term2532.getClass(), "type", 0);
        setIntField(term2532, term2532.getClass(), "intValue", 0);
        setField(term2532, term2532.getClass(), "objectValue", null);
        setField(term2509, term2509.getClass(), "propListHead", term2532);
        setIntField(term2509, term2509.getClass(), "sourcePosition", -201010601);
        setField(term2509, term2509.getClass(), "jsType", null);
        setField(term2509, term2509.getClass(), "parent", null);
        term13214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13219 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13222 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13214, term13214.getClass(), "type", -1641507499);
        setIntField(term13215, term13215.getClass(), "type", -1348703436);
        setIntField(term13216, term13216.getClass(), "type", 0);
        setField(term13216, term13216.getClass(), "next", null);
        setField(term13216, term13216.getClass(), "first", null);
        setField(term13216, term13216.getClass(), "last", null);
        setField(term13216, term13216.getClass(), "propListHead", null);
        setIntField(term13216, term13216.getClass(), "sourcePosition", 0);
        setField(term13216, term13216.getClass(), "jsType", null);
        setField(term13216, term13216.getClass(), "parent", null);
        setField(term13215, term13215.getClass(), "next", term13216);
        setIntField(term13217, term13217.getClass(), "type", 0);
        setField(term13217, term13217.getClass(), "next", null);
        setField(term13217, term13217.getClass(), "first", null);
        setField(term13217, term13217.getClass(), "last", null);
        setField(term13217, term13217.getClass(), "propListHead", null);
        setIntField(term13217, term13217.getClass(), "sourcePosition", 0);
        setField(term13217, term13217.getClass(), "jsType", null);
        setField(term13217, term13217.getClass(), "parent", null);
        setField(term13215, term13215.getClass(), "first", term13217);
        setIntField(term13218, term13218.getClass(), "type", 0);
        setField(term13218, term13218.getClass(), "next", null);
        setField(term13218, term13218.getClass(), "first", null);
        setField(term13218, term13218.getClass(), "last", null);
        setField(term13218, term13218.getClass(), "propListHead", null);
        setIntField(term13218, term13218.getClass(), "sourcePosition", 0);
        setField(term13218, term13218.getClass(), "jsType", null);
        setField(term13218, term13218.getClass(), "parent", null);
        setField(term13215, term13215.getClass(), "last", term13218);
        setField(term13219, term13219.getClass(), "next", null);
        setIntField(term13219, term13219.getClass(), "type", 0);
        setIntField(term13219, term13219.getClass(), "intValue", 0);
        setField(term13219, term13219.getClass(), "objectValue", null);
        setField(term13215, term13215.getClass(), "propListHead", term13219);
        setIntField(term13215, term13215.getClass(), "sourcePosition", -1767079160);
        setField(term13215, term13215.getClass(), "jsType", null);
        setField(term13215, term13215.getClass(), "parent", null);
        setField(term13214, term13214.getClass(), "next", term13215);
        setIntField(term13220, term13220.getClass(), "type", 0);
        setField(term13220, term13220.getClass(), "next", null);
        setField(term13220, term13220.getClass(), "first", null);
        setField(term13220, term13220.getClass(), "last", null);
        setField(term13220, term13220.getClass(), "propListHead", null);
        setIntField(term13220, term13220.getClass(), "sourcePosition", 0);
        setField(term13220, term13220.getClass(), "jsType", null);
        setField(term13220, term13220.getClass(), "parent", null);
        setField(term13214, term13214.getClass(), "first", term13220);
        setIntField(term13221, term13221.getClass(), "type", 0);
        setField(term13221, term13221.getClass(), "next", null);
        setField(term13221, term13221.getClass(), "first", null);
        setField(term13221, term13221.getClass(), "last", null);
        setField(term13221, term13221.getClass(), "propListHead", null);
        setIntField(term13221, term13221.getClass(), "sourcePosition", 0);
        setField(term13221, term13221.getClass(), "jsType", null);
        setField(term13221, term13221.getClass(), "parent", null);
        setField(term13214, term13214.getClass(), "last", term13221);
        setField(term13222, term13222.getClass(), "next", null);
        setIntField(term13222, term13222.getClass(), "type", 0);
        setIntField(term13222, term13222.getClass(), "intValue", 0);
        setField(term13222, term13222.getClass(), "objectValue", null);
        setField(term13214, term13214.getClass(), "propListHead", term13222);
        setIntField(term13214, term13214.getClass(), "sourcePosition", -201010601);
        setField(term13214, term13214.getClass(), "jsType", null);
        setField(term13214, term13214.getClass(), "parent", null);
        LinkedHashMap term13208 = new LinkedHashMap();
        term13207 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term13207, term13207.getClass(), "this$0", term13208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2509;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2509, term13214));
        assertTrue(recursiveEquals(retValue, term13207));
    }

};


