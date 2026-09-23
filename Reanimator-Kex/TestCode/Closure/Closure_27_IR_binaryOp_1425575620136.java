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
import java.lang.Integer;
import java.lang.Object;

public class IR_binaryOp_1425575620136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2311;
     Object term2313;
     Object term2340;

    public IR_binaryOp_1425575620136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2311 = new Integer(1743398246);
        term2313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2313, term2313.getClass(), "type", -934658823);
        setIntField(term2315, term2315.getClass(), "type", 1632177303);
        setIntField(term2317, term2317.getClass(), "type", -802592348);
        setIntField(term2319, term2319.getClass(), "type", -1576584269);
        setIntField(term2321, term2321.getClass(), "type", 1474899591);
        setField(term2321, term2321.getClass(), "next", null);
        setField(term2321, term2321.getClass(), "first", null);
        setField(term2321, term2321.getClass(), "last", null);
        setField(term2321, term2321.getClass(), "propListHead", null);
        setIntField(term2321, term2321.getClass(), "sourcePosition", 0);
        setField(term2321, term2321.getClass(), "jsType", null);
        setField(term2321, term2321.getClass(), "parent", null);
        setField(term2319, term2319.getClass(), "next", term2321);
        setIntField(term2324, term2324.getClass(), "type", 297582552);
        setField(term2324, term2324.getClass(), "next", null);
        setField(term2324, term2324.getClass(), "first", null);
        setField(term2324, term2324.getClass(), "last", term2321);
        setField(term2324, term2324.getClass(), "propListHead", null);
        setIntField(term2324, term2324.getClass(), "sourcePosition", 0);
        setField(term2324, term2324.getClass(), "jsType", null);
        setField(term2324, term2324.getClass(), "parent", null);
        setField(term2319, term2319.getClass(), "first", term2324);
        setField(term2319, term2319.getClass(), "last", term2317);
        setField(term2319, term2319.getClass(), "propListHead", null);
        setIntField(term2319, term2319.getClass(), "sourcePosition", 0);
        setField(term2319, term2319.getClass(), "jsType", null);
        setField(term2319, term2319.getClass(), "parent", null);
        setField(term2317, term2317.getClass(), "next", term2319);
        setField(term2317, term2317.getClass(), "first", term2321);
        setIntField(term2328, term2328.getClass(), "type", 722787672);
        setIntField(term2330, term2330.getClass(), "type", 2077491675);
        setField(term2330, term2330.getClass(), "next", null);
        setField(term2330, term2330.getClass(), "first", term2324);
        setField(term2330, term2330.getClass(), "last", term2319);
        setField(term2330, term2330.getClass(), "propListHead", null);
        setIntField(term2330, term2330.getClass(), "sourcePosition", 0);
        setField(term2330, term2330.getClass(), "jsType", null);
        setField(term2330, term2330.getClass(), "parent", null);
        setField(term2328, term2328.getClass(), "next", term2330);
        setField(term2328, term2328.getClass(), "first", term2315);
        setField(term2328, term2328.getClass(), "last", term2315);
        setField(term2328, term2328.getClass(), "propListHead", null);
        setIntField(term2328, term2328.getClass(), "sourcePosition", 0);
        setField(term2328, term2328.getClass(), "jsType", null);
        setField(term2328, term2328.getClass(), "parent", null);
        setField(term2317, term2317.getClass(), "last", term2328);
        setField(term2317, term2317.getClass(), "propListHead", null);
        setIntField(term2317, term2317.getClass(), "sourcePosition", 0);
        setField(term2317, term2317.getClass(), "jsType", null);
        setField(term2317, term2317.getClass(), "parent", null);
        setField(term2315, term2315.getClass(), "next", term2317);
        setIntField(term2335, term2335.getClass(), "type", -1728316609);
        setField(term2335, term2335.getClass(), "next", term2328);
        setField(term2335, term2335.getClass(), "first", term2330);
        setField(term2335, term2335.getClass(), "last", term2313);
        setField(term2335, term2335.getClass(), "propListHead", null);
        setIntField(term2335, term2335.getClass(), "sourcePosition", 0);
        setField(term2335, term2335.getClass(), "jsType", null);
        setField(term2335, term2335.getClass(), "parent", null);
        setField(term2315, term2315.getClass(), "first", term2335);
        setField(term2315, term2315.getClass(), "last", term2335);
        setField(term2315, term2315.getClass(), "propListHead", null);
        setIntField(term2315, term2315.getClass(), "sourcePosition", 0);
        setField(term2315, term2315.getClass(), "jsType", null);
        setField(term2315, term2315.getClass(), "parent", null);
        setField(term2313, term2313.getClass(), "next", term2315);
        setField(term2313, term2313.getClass(), "first", term2319);
        setField(term2313, term2313.getClass(), "last", term2321);
        setField(term2313, term2313.getClass(), "propListHead", null);
        setIntField(term2313, term2313.getClass(), "sourcePosition", 0);
        setField(term2313, term2313.getClass(), "jsType", null);
        setField(term2313, term2313.getClass(), "parent", null);
        term2340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2340, term2340.getClass(), "type", 47118909);
        setIntField(term2342, term2342.getClass(), "type", -2093707412);
        setIntField(term2344, term2344.getClass(), "type", -680627153);
        setIntField(term2346, term2346.getClass(), "type", 722519669);
        setIntField(term2348, term2348.getClass(), "type", -40335961);
        setField(term2348, term2348.getClass(), "next", null);
        setField(term2348, term2348.getClass(), "first", null);
        setField(term2348, term2348.getClass(), "last", null);
        setField(term2348, term2348.getClass(), "propListHead", null);
        setIntField(term2348, term2348.getClass(), "sourcePosition", 0);
        setField(term2348, term2348.getClass(), "jsType", null);
        setField(term2348, term2348.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "next", term2348);
        setIntField(term2351, term2351.getClass(), "type", 175343605);
        setField(term2351, term2351.getClass(), "next", null);
        setField(term2351, term2351.getClass(), "first", null);
        setField(term2351, term2351.getClass(), "last", term2348);
        setField(term2351, term2351.getClass(), "propListHead", null);
        setIntField(term2351, term2351.getClass(), "sourcePosition", 0);
        setField(term2351, term2351.getClass(), "jsType", null);
        setField(term2351, term2351.getClass(), "parent", null);
        setField(term2346, term2346.getClass(), "first", term2351);
        setField(term2346, term2346.getClass(), "last", term2344);
        setField(term2346, term2346.getClass(), "propListHead", null);
        setIntField(term2346, term2346.getClass(), "sourcePosition", 0);
        setField(term2346, term2346.getClass(), "jsType", null);
        setField(term2346, term2346.getClass(), "parent", null);
        setField(term2344, term2344.getClass(), "next", term2346);
        setField(term2344, term2344.getClass(), "first", term2348);
        setIntField(term2355, term2355.getClass(), "type", 848428785);
        setIntField(term2357, term2357.getClass(), "type", -1984436481);
        setField(term2357, term2357.getClass(), "next", null);
        setField(term2357, term2357.getClass(), "first", term2351);
        setField(term2357, term2357.getClass(), "last", term2346);
        setField(term2357, term2357.getClass(), "propListHead", null);
        setIntField(term2357, term2357.getClass(), "sourcePosition", 0);
        setField(term2357, term2357.getClass(), "jsType", null);
        setField(term2357, term2357.getClass(), "parent", null);
        setField(term2355, term2355.getClass(), "next", term2357);
        setField(term2355, term2355.getClass(), "first", term2342);
        setField(term2355, term2355.getClass(), "last", term2342);
        setField(term2355, term2355.getClass(), "propListHead", null);
        setIntField(term2355, term2355.getClass(), "sourcePosition", 0);
        setField(term2355, term2355.getClass(), "jsType", null);
        setField(term2355, term2355.getClass(), "parent", null);
        setField(term2344, term2344.getClass(), "last", term2355);
        setField(term2344, term2344.getClass(), "propListHead", null);
        setIntField(term2344, term2344.getClass(), "sourcePosition", 0);
        setField(term2344, term2344.getClass(), "jsType", null);
        setField(term2344, term2344.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "next", term2344);
        setIntField(term2362, term2362.getClass(), "type", -407582855);
        setField(term2362, term2362.getClass(), "next", term2355);
        setField(term2362, term2362.getClass(), "first", term2357);
        setField(term2362, term2362.getClass(), "last", term2340);
        setField(term2362, term2362.getClass(), "propListHead", null);
        setIntField(term2362, term2362.getClass(), "sourcePosition", 0);
        setField(term2362, term2362.getClass(), "jsType", null);
        setField(term2362, term2362.getClass(), "parent", null);
        setField(term2342, term2342.getClass(), "first", term2362);
        setField(term2342, term2342.getClass(), "last", term2362);
        setField(term2342, term2342.getClass(), "propListHead", null);
        setIntField(term2342, term2342.getClass(), "sourcePosition", 0);
        setField(term2342, term2342.getClass(), "jsType", null);
        setField(term2342, term2342.getClass(), "parent", null);
        setField(term2340, term2340.getClass(), "next", term2342);
        setField(term2340, term2340.getClass(), "first", term2346);
        setField(term2340, term2340.getClass(), "last", term2348);
        setField(term2340, term2340.getClass(), "propListHead", null);
        setIntField(term2340, term2340.getClass(), "sourcePosition", 0);
        setField(term2340, term2340.getClass(), "jsType", null);
        setField(term2340, term2340.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term2311;
        args[1] = term2313;
        args[2] = term2340;
        try {
            callMethod(klass, "binaryOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


