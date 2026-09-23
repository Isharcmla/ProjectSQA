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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_isLValue_828585480244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404;

    public NodeUtil_isLValue_828585480244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2404, term2404.getClass(), "type", 1361126430);
        setIntField(term2406, term2406.getClass(), "type", 1728588701);
        setIntField(term2408, term2408.getClass(), "type", -355769268);
        setIntField(term2410, term2410.getClass(), "type", -114460662);
        setIntField(term2412, term2412.getClass(), "type", -355376034);
        setField(term2412, term2412.getClass(), "next", null);
        setField(term2412, term2412.getClass(), "first", null);
        setField(term2412, term2412.getClass(), "last", null);
        setField(term2412, term2412.getClass(), "propListHead", null);
        setIntField(term2412, term2412.getClass(), "sourcePosition", 0);
        setField(term2412, term2412.getClass(), "jsType", null);
        setField(term2412, term2412.getClass(), "parent", null);
        setField(term2410, term2410.getClass(), "next", term2412);
        setIntField(term2415, term2415.getClass(), "type", 588390599);
        setField(term2415, term2415.getClass(), "next", null);
        setField(term2415, term2415.getClass(), "first", null);
        setField(term2415, term2415.getClass(), "last", term2412);
        setField(term2415, term2415.getClass(), "propListHead", null);
        setIntField(term2415, term2415.getClass(), "sourcePosition", 0);
        setField(term2415, term2415.getClass(), "jsType", null);
        setField(term2415, term2415.getClass(), "parent", null);
        setField(term2410, term2410.getClass(), "first", term2415);
        setField(term2410, term2410.getClass(), "last", term2408);
        setField(term2410, term2410.getClass(), "propListHead", null);
        setIntField(term2410, term2410.getClass(), "sourcePosition", 0);
        setField(term2410, term2410.getClass(), "jsType", null);
        setField(term2410, term2410.getClass(), "parent", null);
        setField(term2408, term2408.getClass(), "next", term2410);
        setField(term2408, term2408.getClass(), "first", term2412);
        setIntField(term2419, term2419.getClass(), "type", -68615285);
        setIntField(term2421, term2421.getClass(), "type", -337504086);
        setField(term2421, term2421.getClass(), "next", null);
        setField(term2421, term2421.getClass(), "first", term2415);
        setField(term2421, term2421.getClass(), "last", term2410);
        setField(term2421, term2421.getClass(), "propListHead", null);
        setIntField(term2421, term2421.getClass(), "sourcePosition", 0);
        setField(term2421, term2421.getClass(), "jsType", null);
        setField(term2421, term2421.getClass(), "parent", null);
        setField(term2419, term2419.getClass(), "next", term2421);
        setField(term2419, term2419.getClass(), "first", term2406);
        setField(term2419, term2419.getClass(), "last", term2406);
        setField(term2419, term2419.getClass(), "propListHead", null);
        setIntField(term2419, term2419.getClass(), "sourcePosition", 0);
        setField(term2419, term2419.getClass(), "jsType", null);
        setField(term2419, term2419.getClass(), "parent", null);
        setField(term2408, term2408.getClass(), "last", term2419);
        setField(term2408, term2408.getClass(), "propListHead", null);
        setIntField(term2408, term2408.getClass(), "sourcePosition", 0);
        setField(term2408, term2408.getClass(), "jsType", null);
        setField(term2408, term2408.getClass(), "parent", null);
        setField(term2406, term2406.getClass(), "next", term2408);
        setIntField(term2426, term2426.getClass(), "type", 2074130991);
        setField(term2426, term2426.getClass(), "next", term2419);
        setField(term2426, term2426.getClass(), "first", term2421);
        setField(term2426, term2426.getClass(), "last", term2404);
        setField(term2426, term2426.getClass(), "propListHead", null);
        setIntField(term2426, term2426.getClass(), "sourcePosition", 0);
        setField(term2426, term2426.getClass(), "jsType", null);
        setField(term2426, term2426.getClass(), "parent", null);
        setField(term2406, term2406.getClass(), "first", term2426);
        setField(term2406, term2406.getClass(), "last", term2426);
        setField(term2406, term2406.getClass(), "propListHead", null);
        setIntField(term2406, term2406.getClass(), "sourcePosition", 0);
        setField(term2406, term2406.getClass(), "jsType", null);
        setField(term2406, term2406.getClass(), "parent", null);
        setField(term2404, term2404.getClass(), "next", term2406);
        setField(term2404, term2404.getClass(), "first", term2410);
        setField(term2404, term2404.getClass(), "last", term2412);
        setField(term2404, term2404.getClass(), "propListHead", null);
        setIntField(term2404, term2404.getClass(), "sourcePosition", 0);
        setField(term2404, term2404.getClass(), "jsType", null);
        setField(term2404, term2404.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2404;
        try {
            callMethod(klass, "isLValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


