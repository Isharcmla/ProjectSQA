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
import java.util.HashMap;

public class MustBeReachingVariableDef_getDef_162214915022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;
     Object term573;

    public MustBeReachingVariableDef_getDef_162214915022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term545 = new HashMap();
        term543 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term544 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term553 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term544, term544.getClass(), "vars", term545);
        setField(term553, term553.getClass(), "vars", null);
        setField(term553, term553.getClass(), "parent", null);
        setIntField(term553, term553.getClass(), "depth", 0);
        setField(term553, term553.getClass(), "rootNode", null);
        setField(term553, term553.getClass(), "thisType", null);
        setBooleanField(term553, term553.getClass(), "isBottom", false);
        setField(term553, term553.getClass(), "arguments", null);
        setField(term544, term544.getClass(), "parent", term553);
        setIntField(term544, term544.getClass(), "depth", 1557431527);
        setIntField(term557, term557.getClass(), "type", 0);
        setField(term557, term557.getClass(), "next", null);
        setField(term557, term557.getClass(), "first", null);
        setField(term557, term557.getClass(), "last", null);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term544, term544.getClass(), "rootNode", term557);
        setField(term544, term544.getClass(), "thisType", null);
        setBooleanField(term544, term544.getClass(), "isBottom", false);
        setField(term544, term544.getClass(), "arguments", null);
        setField(term543, term543.getClass(), "jsScope", term544);
        setField(term543, term543.getClass(), "compiler", null);
        setField(term543, term543.getClass(), "escaped", null);
        setField(term543, term543.getClass(), "cfg", null);
        setField(term543, term543.getClass(), "joinOp", null);
        setField(term543, term543.getClass(), "orderedWorkSet", null);
        term573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term573, term573.getClass(), "type", -1504890659);
        setIntField(term575, term575.getClass(), "type", 1358829571);
        setIntField(term577, term577.getClass(), "type", 991356662);
        setIntField(term579, term579.getClass(), "type", -506958186);
        setIntField(term581, term581.getClass(), "type", -507387516);
        setField(term581, term581.getClass(), "next", null);
        setField(term581, term581.getClass(), "first", null);
        setField(term581, term581.getClass(), "last", null);
        setField(term581, term581.getClass(), "propListHead", null);
        setIntField(term581, term581.getClass(), "sourcePosition", 0);
        setField(term581, term581.getClass(), "jsType", null);
        setField(term581, term581.getClass(), "parent", null);
        setField(term579, term579.getClass(), "next", term581);
        setIntField(term584, term584.getClass(), "type", -1970452551);
        setField(term584, term584.getClass(), "next", null);
        setField(term584, term584.getClass(), "first", null);
        setField(term584, term584.getClass(), "last", term581);
        setField(term584, term584.getClass(), "propListHead", null);
        setIntField(term584, term584.getClass(), "sourcePosition", 0);
        setField(term584, term584.getClass(), "jsType", null);
        setField(term584, term584.getClass(), "parent", null);
        setField(term579, term579.getClass(), "first", term584);
        setField(term579, term579.getClass(), "last", term577);
        setField(term579, term579.getClass(), "propListHead", null);
        setIntField(term579, term579.getClass(), "sourcePosition", 0);
        setField(term579, term579.getClass(), "jsType", null);
        setField(term579, term579.getClass(), "parent", null);
        setField(term577, term577.getClass(), "next", term579);
        setField(term577, term577.getClass(), "first", term581);
        setIntField(term588, term588.getClass(), "type", 729658803);
        setIntField(term590, term590.getClass(), "type", 114754804);
        setField(term590, term590.getClass(), "next", null);
        setField(term590, term590.getClass(), "first", term584);
        setField(term590, term590.getClass(), "last", term579);
        setField(term590, term590.getClass(), "propListHead", null);
        setIntField(term590, term590.getClass(), "sourcePosition", 0);
        setField(term590, term590.getClass(), "jsType", null);
        setField(term590, term590.getClass(), "parent", null);
        setField(term588, term588.getClass(), "next", term590);
        setField(term588, term588.getClass(), "first", term575);
        setField(term588, term588.getClass(), "last", term575);
        setField(term588, term588.getClass(), "propListHead", null);
        setIntField(term588, term588.getClass(), "sourcePosition", 0);
        setField(term588, term588.getClass(), "jsType", null);
        setField(term588, term588.getClass(), "parent", null);
        setField(term577, term577.getClass(), "last", term588);
        setField(term577, term577.getClass(), "propListHead", null);
        setIntField(term577, term577.getClass(), "sourcePosition", 0);
        setField(term577, term577.getClass(), "jsType", null);
        setField(term577, term577.getClass(), "parent", null);
        setField(term575, term575.getClass(), "next", term577);
        setIntField(term595, term595.getClass(), "type", 1687361082);
        setField(term595, term595.getClass(), "next", term588);
        setField(term595, term595.getClass(), "first", term590);
        setField(term595, term595.getClass(), "last", term573);
        setField(term595, term595.getClass(), "propListHead", null);
        setIntField(term595, term595.getClass(), "sourcePosition", 0);
        setField(term595, term595.getClass(), "jsType", null);
        setField(term595, term595.getClass(), "parent", null);
        setField(term575, term575.getClass(), "first", term595);
        setField(term575, term575.getClass(), "last", term595);
        setField(term575, term575.getClass(), "propListHead", null);
        setIntField(term575, term575.getClass(), "sourcePosition", 0);
        setField(term575, term575.getClass(), "jsType", null);
        setField(term575, term575.getClass(), "parent", null);
        setField(term573, term573.getClass(), "next", term575);
        setField(term573, term573.getClass(), "first", term579);
        setField(term573, term573.getClass(), "last", term581);
        setField(term573, term573.getClass(), "propListHead", null);
        setIntField(term573, term573.getClass(), "sourcePosition", 0);
        setField(term573, term573.getClass(), "jsType", null);
        setField(term573, term573.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "BYqFIqCKAV";
        args[1] = term573;
        try {
            callMethod(klass, "getDef", argTypes, term543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


