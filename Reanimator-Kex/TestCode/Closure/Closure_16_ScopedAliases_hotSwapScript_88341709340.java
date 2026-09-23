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

public class ScopedAliases_hotSwapScript_88341709340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228706;
     Object term228798;
     Object term230828;
     Object term230829;

    public ScopedAliases_hotSwapScript_88341709340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228706 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term228706, term228706.getClass(), "compiler", null);
        term228798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term228960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term229052 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term229144 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term228798, term228798.getClass(), "type", 0);
        setField(term228798, term228798.getClass(), "parent", null);
        setField(term228960, term228960.getClass(), "next", null);
        setIntField(term228960, term228960.getClass(), "type", 37);
        setField(term229052, term229052.getClass(), "next", null);
        setIntField(term229052, term229052.getClass(), "type", 0);
        setField(term229052, term229052.getClass(), "first", null);
        setField(term228960, term228960.getClass(), "first", term229052);
        setField(term228890, term228890.getClass(), "next", term228960);
        setIntField(term228890, term228890.getClass(), "type", 0);
        setField(term229144, term229144.getClass(), "next", null);
        setIntField(term229144, term229144.getClass(), "type", 0);
        setField(term229144, term229144.getClass(), "first", null);
        setField(term228890, term228890.getClass(), "first", term229144);
        setField(term228798, term228798.getClass(), "first", term228890);
        term230828 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term230828, term230828.getClass(), "compiler", null);
        setField(term230828, term230828.getClass(), "preprocessorSymbolTable", null);
        setField(term230828, term230828.getClass(), "transformationHandler", null);
        term230829 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term230830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term230831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term230832 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term230833 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term230829, term230829.getClass(), "number", 0.0);
        setIntField(term230829, term230829.getClass(), "type", 0);
        setField(term230829, term230829.getClass(), "next", null);
        setDoubleField(term230830, term230830.getClass(), "number", 0.0);
        setIntField(term230830, term230830.getClass(), "type", 0);
        setIntField(term230831, term230831.getClass(), "type", 37);
        setField(term230831, term230831.getClass(), "next", null);
        setDoubleField(term230832, term230832.getClass(), "number", 0.0);
        setIntField(term230832, term230832.getClass(), "type", 0);
        setField(term230832, term230832.getClass(), "next", null);
        setField(term230832, term230832.getClass(), "first", null);
        setField(term230832, term230832.getClass(), "last", null);
        setField(term230832, term230832.getClass(), "propListHead", null);
        setIntField(term230832, term230832.getClass(), "sourcePosition", 0);
        setField(term230832, term230832.getClass(), "jsType", null);
        setField(term230832, term230832.getClass(), "parent", null);
        setField(term230831, term230831.getClass(), "first", term230832);
        setField(term230831, term230831.getClass(), "last", null);
        setField(term230831, term230831.getClass(), "propListHead", null);
        setIntField(term230831, term230831.getClass(), "sourcePosition", 0);
        setField(term230831, term230831.getClass(), "jsType", null);
        setField(term230831, term230831.getClass(), "parent", null);
        setField(term230830, term230830.getClass(), "next", term230831);
        setDoubleField(term230833, term230833.getClass(), "number", 0.0);
        setIntField(term230833, term230833.getClass(), "type", 0);
        setField(term230833, term230833.getClass(), "next", null);
        setField(term230833, term230833.getClass(), "first", null);
        setField(term230833, term230833.getClass(), "last", null);
        setField(term230833, term230833.getClass(), "propListHead", null);
        setIntField(term230833, term230833.getClass(), "sourcePosition", 0);
        setField(term230833, term230833.getClass(), "jsType", null);
        setField(term230833, term230833.getClass(), "parent", null);
        setField(term230830, term230830.getClass(), "first", term230833);
        setField(term230830, term230830.getClass(), "last", null);
        setField(term230830, term230830.getClass(), "propListHead", null);
        setIntField(term230830, term230830.getClass(), "sourcePosition", 0);
        setField(term230830, term230830.getClass(), "jsType", null);
        setField(term230830, term230830.getClass(), "parent", null);
        setField(term230829, term230829.getClass(), "first", term230830);
        setField(term230829, term230829.getClass(), "last", null);
        setField(term230829, term230829.getClass(), "propListHead", null);
        setIntField(term230829, term230829.getClass(), "sourcePosition", 0);
        setField(term230829, term230829.getClass(), "jsType", null);
        setField(term230829, term230829.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term228798;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term228706, args);
        assertTrue(recursiveEquals(term228706, term230828));
        assertTrue(recursiveEquals(term228798, term230829));
    }

};


