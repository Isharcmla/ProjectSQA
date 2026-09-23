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

public class NodeUtil_getVarsDeclaredInBranch_1317953546188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;
     Object term13280;
     Object term13273;

    public NodeUtil_getVarsDeclaredInBranch_1317953546188() {
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
        term13280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13285 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13288 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13280, term13280.getClass(), "type", 1425342686);
        setIntField(term13281, term13281.getClass(), "type", 805176809);
        setIntField(term13282, term13282.getClass(), "type", 0);
        setField(term13282, term13282.getClass(), "next", null);
        setField(term13282, term13282.getClass(), "first", null);
        setField(term13282, term13282.getClass(), "last", null);
        setField(term13282, term13282.getClass(), "propListHead", null);
        setIntField(term13282, term13282.getClass(), "sourcePosition", 0);
        setField(term13282, term13282.getClass(), "jsType", null);
        setField(term13282, term13282.getClass(), "parent", null);
        setField(term13281, term13281.getClass(), "next", term13282);
        setIntField(term13283, term13283.getClass(), "type", 0);
        setField(term13283, term13283.getClass(), "next", null);
        setField(term13283, term13283.getClass(), "first", null);
        setField(term13283, term13283.getClass(), "last", null);
        setField(term13283, term13283.getClass(), "propListHead", null);
        setIntField(term13283, term13283.getClass(), "sourcePosition", 0);
        setField(term13283, term13283.getClass(), "jsType", null);
        setField(term13283, term13283.getClass(), "parent", null);
        setField(term13281, term13281.getClass(), "first", term13283);
        setIntField(term13284, term13284.getClass(), "type", 0);
        setField(term13284, term13284.getClass(), "next", null);
        setField(term13284, term13284.getClass(), "first", null);
        setField(term13284, term13284.getClass(), "last", null);
        setField(term13284, term13284.getClass(), "propListHead", null);
        setIntField(term13284, term13284.getClass(), "sourcePosition", 0);
        setField(term13284, term13284.getClass(), "jsType", null);
        setField(term13284, term13284.getClass(), "parent", null);
        setField(term13281, term13281.getClass(), "last", term13284);
        setField(term13285, term13285.getClass(), "next", null);
        setIntField(term13285, term13285.getClass(), "type", 0);
        setIntField(term13285, term13285.getClass(), "intValue", 0);
        setField(term13285, term13285.getClass(), "objectValue", null);
        setField(term13281, term13281.getClass(), "propListHead", term13285);
        setIntField(term13281, term13281.getClass(), "sourcePosition", -1389314671);
        setField(term13281, term13281.getClass(), "jsType", null);
        setField(term13281, term13281.getClass(), "parent", null);
        setField(term13280, term13280.getClass(), "next", term13281);
        setIntField(term13286, term13286.getClass(), "type", 0);
        setField(term13286, term13286.getClass(), "next", null);
        setField(term13286, term13286.getClass(), "first", null);
        setField(term13286, term13286.getClass(), "last", null);
        setField(term13286, term13286.getClass(), "propListHead", null);
        setIntField(term13286, term13286.getClass(), "sourcePosition", 0);
        setField(term13286, term13286.getClass(), "jsType", null);
        setField(term13286, term13286.getClass(), "parent", null);
        setField(term13280, term13280.getClass(), "first", term13286);
        setIntField(term13287, term13287.getClass(), "type", 0);
        setField(term13287, term13287.getClass(), "next", null);
        setField(term13287, term13287.getClass(), "first", null);
        setField(term13287, term13287.getClass(), "last", null);
        setField(term13287, term13287.getClass(), "propListHead", null);
        setIntField(term13287, term13287.getClass(), "sourcePosition", 0);
        setField(term13287, term13287.getClass(), "jsType", null);
        setField(term13287, term13287.getClass(), "parent", null);
        setField(term13280, term13280.getClass(), "last", term13287);
        setField(term13288, term13288.getClass(), "next", null);
        setIntField(term13288, term13288.getClass(), "type", 0);
        setIntField(term13288, term13288.getClass(), "intValue", 0);
        setField(term13288, term13288.getClass(), "objectValue", null);
        setField(term13280, term13280.getClass(), "propListHead", term13288);
        setIntField(term13280, term13280.getClass(), "sourcePosition", -499699841);
        setField(term13280, term13280.getClass(), "jsType", null);
        setField(term13280, term13280.getClass(), "parent", null);
        LinkedHashMap term13274 = new LinkedHashMap();
        term13273 = newInstance(Class.forName("java.util.LinkedHashMap$LinkedValues"));
        setField(term13273, term13273.getClass(), "this$0", term13274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2536;
        Object retValue = callMethod(klass, "getVarsDeclaredInBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2536, term13280));
        assertTrue(recursiveEquals(retValue, term13273));
    }

};


