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

public class NodeUtil_isPrototypePropertyDeclaration_1578262922187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;
     Object term13255;

    public NodeUtil_isPrototypePropertyDeclaration_1578262922187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2549 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2559 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2536, term2536.getClass(), "type", 1425342686);
        setIntField(term2538, term2538.getClass(), "type", 805176809);
        setIntField(term2540, term2540.getClass(), "type", 0);
        setField(term2540, term2540.getClass(), "next", null);
        setField(term2540, term2540.getClass(), "first", null);
        setField(term2540, term2540.getClass(), "last", null);
        setField(term2540, term2540.getClass(), "propListHead", null);
        setIntField(term2540, term2540.getClass(), "sourcePosition", 0);
        setField(term2540, term2540.getClass(), "jsType", null);
        setField(term2540, term2540.getClass(), "parent", null);
        setField(term2538, term2538.getClass(), "next", term2540);
        setIntField(term2543, term2543.getClass(), "type", 0);
        setField(term2543, term2543.getClass(), "next", null);
        setField(term2543, term2543.getClass(), "first", null);
        setField(term2543, term2543.getClass(), "last", null);
        setField(term2543, term2543.getClass(), "propListHead", null);
        setIntField(term2543, term2543.getClass(), "sourcePosition", 0);
        setField(term2543, term2543.getClass(), "jsType", null);
        setField(term2543, term2543.getClass(), "parent", null);
        setField(term2538, term2538.getClass(), "first", term2543);
        setIntField(term2546, term2546.getClass(), "type", 0);
        setField(term2546, term2546.getClass(), "next", null);
        setField(term2546, term2546.getClass(), "first", null);
        setField(term2546, term2546.getClass(), "last", null);
        setField(term2546, term2546.getClass(), "propListHead", null);
        setIntField(term2546, term2546.getClass(), "sourcePosition", 0);
        setField(term2546, term2546.getClass(), "jsType", null);
        setField(term2546, term2546.getClass(), "parent", null);
        setField(term2538, term2538.getClass(), "last", term2546);
        setField(term2549, term2549.getClass(), "next", null);
        setIntField(term2549, term2549.getClass(), "type", 0);
        setIntField(term2549, term2549.getClass(), "intValue", 0);
        setField(term2549, term2549.getClass(), "objectValue", null);
        setField(term2538, term2538.getClass(), "propListHead", term2549);
        setIntField(term2538, term2538.getClass(), "sourcePosition", -1389314671);
        setField(term2538, term2538.getClass(), "jsType", null);
        setField(term2538, term2538.getClass(), "parent", null);
        setField(term2536, term2536.getClass(), "next", term2538);
        setIntField(term2553, term2553.getClass(), "type", 0);
        setField(term2553, term2553.getClass(), "next", null);
        setField(term2553, term2553.getClass(), "first", null);
        setField(term2553, term2553.getClass(), "last", null);
        setField(term2553, term2553.getClass(), "propListHead", null);
        setIntField(term2553, term2553.getClass(), "sourcePosition", 0);
        setField(term2553, term2553.getClass(), "jsType", null);
        setField(term2553, term2553.getClass(), "parent", null);
        setField(term2536, term2536.getClass(), "first", term2553);
        setIntField(term2556, term2556.getClass(), "type", 0);
        setField(term2556, term2556.getClass(), "next", null);
        setField(term2556, term2556.getClass(), "first", null);
        setField(term2556, term2556.getClass(), "last", null);
        setField(term2556, term2556.getClass(), "propListHead", null);
        setIntField(term2556, term2556.getClass(), "sourcePosition", 0);
        setField(term2556, term2556.getClass(), "jsType", null);
        setField(term2556, term2556.getClass(), "parent", null);
        setField(term2536, term2536.getClass(), "last", term2556);
        setField(term2559, term2559.getClass(), "next", null);
        setIntField(term2559, term2559.getClass(), "type", 0);
        setIntField(term2559, term2559.getClass(), "intValue", 0);
        setField(term2559, term2559.getClass(), "objectValue", null);
        setField(term2536, term2536.getClass(), "propListHead", term2559);
        setIntField(term2536, term2536.getClass(), "sourcePosition", -499699841);
        setField(term2536, term2536.getClass(), "jsType", null);
        setField(term2536, term2536.getClass(), "parent", null);
        term13255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13260 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13263 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13255, term13255.getClass(), "type", 1425342686);
        setIntField(term13256, term13256.getClass(), "type", 805176809);
        setIntField(term13257, term13257.getClass(), "type", 0);
        setField(term13257, term13257.getClass(), "next", null);
        setField(term13257, term13257.getClass(), "first", null);
        setField(term13257, term13257.getClass(), "last", null);
        setField(term13257, term13257.getClass(), "propListHead", null);
        setIntField(term13257, term13257.getClass(), "sourcePosition", 0);
        setField(term13257, term13257.getClass(), "jsType", null);
        setField(term13257, term13257.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "next", term13257);
        setIntField(term13258, term13258.getClass(), "type", 0);
        setField(term13258, term13258.getClass(), "next", null);
        setField(term13258, term13258.getClass(), "first", null);
        setField(term13258, term13258.getClass(), "last", null);
        setField(term13258, term13258.getClass(), "propListHead", null);
        setIntField(term13258, term13258.getClass(), "sourcePosition", 0);
        setField(term13258, term13258.getClass(), "jsType", null);
        setField(term13258, term13258.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "first", term13258);
        setIntField(term13259, term13259.getClass(), "type", 0);
        setField(term13259, term13259.getClass(), "next", null);
        setField(term13259, term13259.getClass(), "first", null);
        setField(term13259, term13259.getClass(), "last", null);
        setField(term13259, term13259.getClass(), "propListHead", null);
        setIntField(term13259, term13259.getClass(), "sourcePosition", 0);
        setField(term13259, term13259.getClass(), "jsType", null);
        setField(term13259, term13259.getClass(), "parent", null);
        setField(term13256, term13256.getClass(), "last", term13259);
        setField(term13260, term13260.getClass(), "next", null);
        setIntField(term13260, term13260.getClass(), "type", 0);
        setIntField(term13260, term13260.getClass(), "intValue", 0);
        setField(term13260, term13260.getClass(), "objectValue", null);
        setField(term13256, term13256.getClass(), "propListHead", term13260);
        setIntField(term13256, term13256.getClass(), "sourcePosition", -1389314671);
        setField(term13256, term13256.getClass(), "jsType", null);
        setField(term13256, term13256.getClass(), "parent", null);
        setField(term13255, term13255.getClass(), "next", term13256);
        setIntField(term13261, term13261.getClass(), "type", 0);
        setField(term13261, term13261.getClass(), "next", null);
        setField(term13261, term13261.getClass(), "first", null);
        setField(term13261, term13261.getClass(), "last", null);
        setField(term13261, term13261.getClass(), "propListHead", null);
        setIntField(term13261, term13261.getClass(), "sourcePosition", 0);
        setField(term13261, term13261.getClass(), "jsType", null);
        setField(term13261, term13261.getClass(), "parent", null);
        setField(term13255, term13255.getClass(), "first", term13261);
        setIntField(term13262, term13262.getClass(), "type", 0);
        setField(term13262, term13262.getClass(), "next", null);
        setField(term13262, term13262.getClass(), "first", null);
        setField(term13262, term13262.getClass(), "last", null);
        setField(term13262, term13262.getClass(), "propListHead", null);
        setIntField(term13262, term13262.getClass(), "sourcePosition", 0);
        setField(term13262, term13262.getClass(), "jsType", null);
        setField(term13262, term13262.getClass(), "parent", null);
        setField(term13255, term13255.getClass(), "last", term13262);
        setField(term13263, term13263.getClass(), "next", null);
        setIntField(term13263, term13263.getClass(), "type", 0);
        setIntField(term13263, term13263.getClass(), "intValue", 0);
        setField(term13263, term13263.getClass(), "objectValue", null);
        setField(term13255, term13255.getClass(), "propListHead", term13263);
        setIntField(term13255, term13255.getClass(), "sourcePosition", -499699841);
        setField(term13255, term13255.getClass(), "jsType", null);
        setField(term13255, term13255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2536;
        Object retValue = callMethod(klass, "isPrototypePropertyDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2536, term13255));
        assertTrue(recursiveEquals(retValue, false));
    }

};


