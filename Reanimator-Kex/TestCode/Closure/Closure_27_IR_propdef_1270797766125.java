package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_propdef_1270797766125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2102;
     Object term2129;

    public IR_propdef_1270797766125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2102, term2102.getClass(), "type", -886200503);
        setIntField(term2104, term2104.getClass(), "type", 1136393691);
        setIntField(term2106, term2106.getClass(), "type", -1288536479);
        setIntField(term2108, term2108.getClass(), "type", 1092038167);
        setIntField(term2110, term2110.getClass(), "type", 1879729823);
        setField(term2110, term2110.getClass(), "next", null);
        setField(term2110, term2110.getClass(), "first", null);
        setField(term2110, term2110.getClass(), "last", null);
        setField(term2110, term2110.getClass(), "propListHead", null);
        setIntField(term2110, term2110.getClass(), "sourcePosition", 0);
        setField(term2110, term2110.getClass(), "jsType", null);
        setField(term2110, term2110.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "next", term2110);
        setIntField(term2113, term2113.getClass(), "type", 1443855558);
        setField(term2113, term2113.getClass(), "next", null);
        setField(term2113, term2113.getClass(), "first", null);
        setField(term2113, term2113.getClass(), "last", term2110);
        setField(term2113, term2113.getClass(), "propListHead", null);
        setIntField(term2113, term2113.getClass(), "sourcePosition", 0);
        setField(term2113, term2113.getClass(), "jsType", null);
        setField(term2113, term2113.getClass(), "parent", null);
        setField(term2108, term2108.getClass(), "first", term2113);
        setField(term2108, term2108.getClass(), "last", term2106);
        setField(term2108, term2108.getClass(), "propListHead", null);
        setIntField(term2108, term2108.getClass(), "sourcePosition", 0);
        setField(term2108, term2108.getClass(), "jsType", null);
        setField(term2108, term2108.getClass(), "parent", null);
        setField(term2106, term2106.getClass(), "next", term2108);
        setField(term2106, term2106.getClass(), "first", term2110);
        setIntField(term2117, term2117.getClass(), "type", -1804322375);
        setIntField(term2119, term2119.getClass(), "type", 1595814906);
        setField(term2119, term2119.getClass(), "next", null);
        setField(term2119, term2119.getClass(), "first", term2113);
        setField(term2119, term2119.getClass(), "last", term2108);
        setField(term2119, term2119.getClass(), "propListHead", null);
        setIntField(term2119, term2119.getClass(), "sourcePosition", 0);
        setField(term2119, term2119.getClass(), "jsType", null);
        setField(term2119, term2119.getClass(), "parent", null);
        setField(term2117, term2117.getClass(), "next", term2119);
        setField(term2117, term2117.getClass(), "first", term2104);
        setField(term2117, term2117.getClass(), "last", term2104);
        setField(term2117, term2117.getClass(), "propListHead", null);
        setIntField(term2117, term2117.getClass(), "sourcePosition", 0);
        setField(term2117, term2117.getClass(), "jsType", null);
        setField(term2117, term2117.getClass(), "parent", null);
        setField(term2106, term2106.getClass(), "last", term2117);
        setField(term2106, term2106.getClass(), "propListHead", null);
        setIntField(term2106, term2106.getClass(), "sourcePosition", 0);
        setField(term2106, term2106.getClass(), "jsType", null);
        setField(term2106, term2106.getClass(), "parent", null);
        setField(term2104, term2104.getClass(), "next", term2106);
        setIntField(term2124, term2124.getClass(), "type", -834193529);
        setField(term2124, term2124.getClass(), "next", term2117);
        setField(term2124, term2124.getClass(), "first", term2119);
        setField(term2124, term2124.getClass(), "last", term2102);
        setField(term2124, term2124.getClass(), "propListHead", null);
        setIntField(term2124, term2124.getClass(), "sourcePosition", 0);
        setField(term2124, term2124.getClass(), "jsType", null);
        setField(term2124, term2124.getClass(), "parent", null);
        setField(term2104, term2104.getClass(), "first", term2124);
        setField(term2104, term2104.getClass(), "last", term2124);
        setField(term2104, term2104.getClass(), "propListHead", null);
        setIntField(term2104, term2104.getClass(), "sourcePosition", 0);
        setField(term2104, term2104.getClass(), "jsType", null);
        setField(term2104, term2104.getClass(), "parent", null);
        setField(term2102, term2102.getClass(), "next", term2104);
        setField(term2102, term2102.getClass(), "first", term2108);
        setField(term2102, term2102.getClass(), "last", term2110);
        setField(term2102, term2102.getClass(), "propListHead", null);
        setIntField(term2102, term2102.getClass(), "sourcePosition", 0);
        setField(term2102, term2102.getClass(), "jsType", null);
        setField(term2102, term2102.getClass(), "parent", null);
        term2129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2129, term2129.getClass(), "type", 335780735);
        setIntField(term2131, term2131.getClass(), "type", -1541981599);
        setIntField(term2133, term2133.getClass(), "type", 1605456363);
        setIntField(term2135, term2135.getClass(), "type", 2059896693);
        setIntField(term2137, term2137.getClass(), "type", 2109912812);
        setField(term2137, term2137.getClass(), "next", null);
        setField(term2137, term2137.getClass(), "first", null);
        setField(term2137, term2137.getClass(), "last", null);
        setField(term2137, term2137.getClass(), "propListHead", null);
        setIntField(term2137, term2137.getClass(), "sourcePosition", 0);
        setField(term2137, term2137.getClass(), "jsType", null);
        setField(term2137, term2137.getClass(), "parent", null);
        setField(term2135, term2135.getClass(), "next", term2137);
        setIntField(term2140, term2140.getClass(), "type", 1841286431);
        setField(term2140, term2140.getClass(), "next", null);
        setField(term2140, term2140.getClass(), "first", null);
        setField(term2140, term2140.getClass(), "last", term2137);
        setField(term2140, term2140.getClass(), "propListHead", null);
        setIntField(term2140, term2140.getClass(), "sourcePosition", 0);
        setField(term2140, term2140.getClass(), "jsType", null);
        setField(term2140, term2140.getClass(), "parent", null);
        setField(term2135, term2135.getClass(), "first", term2140);
        setField(term2135, term2135.getClass(), "last", term2133);
        setField(term2135, term2135.getClass(), "propListHead", null);
        setIntField(term2135, term2135.getClass(), "sourcePosition", 0);
        setField(term2135, term2135.getClass(), "jsType", null);
        setField(term2135, term2135.getClass(), "parent", null);
        setField(term2133, term2133.getClass(), "next", term2135);
        setField(term2133, term2133.getClass(), "first", term2137);
        setIntField(term2144, term2144.getClass(), "type", -675283917);
        setIntField(term2146, term2146.getClass(), "type", -2093862988);
        setField(term2146, term2146.getClass(), "next", null);
        setField(term2146, term2146.getClass(), "first", term2140);
        setField(term2146, term2146.getClass(), "last", term2135);
        setField(term2146, term2146.getClass(), "propListHead", null);
        setIntField(term2146, term2146.getClass(), "sourcePosition", 0);
        setField(term2146, term2146.getClass(), "jsType", null);
        setField(term2146, term2146.getClass(), "parent", null);
        setField(term2144, term2144.getClass(), "next", term2146);
        setField(term2144, term2144.getClass(), "first", term2131);
        setField(term2144, term2144.getClass(), "last", term2131);
        setField(term2144, term2144.getClass(), "propListHead", null);
        setIntField(term2144, term2144.getClass(), "sourcePosition", 0);
        setField(term2144, term2144.getClass(), "jsType", null);
        setField(term2144, term2144.getClass(), "parent", null);
        setField(term2133, term2133.getClass(), "last", term2144);
        setField(term2133, term2133.getClass(), "propListHead", null);
        setIntField(term2133, term2133.getClass(), "sourcePosition", 0);
        setField(term2133, term2133.getClass(), "jsType", null);
        setField(term2133, term2133.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "next", term2133);
        setIntField(term2151, term2151.getClass(), "type", 1337828646);
        setField(term2151, term2151.getClass(), "next", term2144);
        setField(term2151, term2151.getClass(), "first", term2146);
        setField(term2151, term2151.getClass(), "last", term2129);
        setField(term2151, term2151.getClass(), "propListHead", null);
        setIntField(term2151, term2151.getClass(), "sourcePosition", 0);
        setField(term2151, term2151.getClass(), "jsType", null);
        setField(term2151, term2151.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "first", term2151);
        setField(term2131, term2131.getClass(), "last", term2151);
        setField(term2131, term2131.getClass(), "propListHead", null);
        setIntField(term2131, term2131.getClass(), "sourcePosition", 0);
        setField(term2131, term2131.getClass(), "jsType", null);
        setField(term2131, term2131.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "next", term2131);
        setField(term2129, term2129.getClass(), "first", term2135);
        setField(term2129, term2129.getClass(), "last", term2137);
        setField(term2129, term2129.getClass(), "propListHead", null);
        setIntField(term2129, term2129.getClass(), "sourcePosition", 0);
        setField(term2129, term2129.getClass(), "jsType", null);
        setField(term2129, term2129.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term2102;
        args[1] = term2129;
        try {
            callMethod(klass, "propdef", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


