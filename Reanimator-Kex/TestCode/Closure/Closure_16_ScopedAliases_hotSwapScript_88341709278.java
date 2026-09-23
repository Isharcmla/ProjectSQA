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

public class ScopedAliases_hotSwapScript_88341709278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178958;
     Object term179028;
     Object term180661;
     Object term180662;

    public ScopedAliases_hotSwapScript_88341709278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178958 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term178958, term178958.getClass(), "compiler", null);
        term179028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term179028, term179028.getClass(), "type", 0);
        setField(term179028, term179028.getClass(), "parent", null);
        setField(term179168, term179168.getClass(), "next", term179238);
        setIntField(term179168, term179168.getClass(), "type", 0);
        setField(term179168, term179168.getClass(), "first", null);
        setField(term179098, term179098.getClass(), "next", term179168);
        setIntField(term179098, term179098.getClass(), "type", 0);
        setField(term179308, term179308.getClass(), "next", null);
        setIntField(term179308, term179308.getClass(), "type", 0);
        setField(term179308, term179308.getClass(), "first", null);
        setField(term179098, term179098.getClass(), "first", term179308);
        setField(term179028, term179028.getClass(), "first", term179098);
        term180661 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term180661, term180661.getClass(), "compiler", null);
        setField(term180661, term180661.getClass(), "preprocessorSymbolTable", null);
        setField(term180661, term180661.getClass(), "transformationHandler", null);
        term180662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term180666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term180662, term180662.getClass(), "type", 0);
        setField(term180662, term180662.getClass(), "next", null);
        setIntField(term180663, term180663.getClass(), "type", 0);
        setIntField(term180664, term180664.getClass(), "type", 0);
        setIntField(term180665, term180665.getClass(), "type", 0);
        setField(term180665, term180665.getClass(), "next", null);
        setField(term180665, term180665.getClass(), "first", null);
        setField(term180665, term180665.getClass(), "last", null);
        setField(term180665, term180665.getClass(), "propListHead", null);
        setIntField(term180665, term180665.getClass(), "sourcePosition", 0);
        setField(term180665, term180665.getClass(), "jsType", null);
        setField(term180665, term180665.getClass(), "parent", null);
        setField(term180664, term180664.getClass(), "next", term180665);
        setField(term180664, term180664.getClass(), "first", null);
        setField(term180664, term180664.getClass(), "last", null);
        setField(term180664, term180664.getClass(), "propListHead", null);
        setIntField(term180664, term180664.getClass(), "sourcePosition", 0);
        setField(term180664, term180664.getClass(), "jsType", null);
        setField(term180664, term180664.getClass(), "parent", null);
        setField(term180663, term180663.getClass(), "next", term180664);
        setIntField(term180666, term180666.getClass(), "type", 0);
        setField(term180666, term180666.getClass(), "next", null);
        setField(term180666, term180666.getClass(), "first", null);
        setField(term180666, term180666.getClass(), "last", null);
        setField(term180666, term180666.getClass(), "propListHead", null);
        setIntField(term180666, term180666.getClass(), "sourcePosition", 0);
        setField(term180666, term180666.getClass(), "jsType", null);
        setField(term180666, term180666.getClass(), "parent", null);
        setField(term180663, term180663.getClass(), "first", term180666);
        setField(term180663, term180663.getClass(), "last", null);
        setField(term180663, term180663.getClass(), "propListHead", null);
        setIntField(term180663, term180663.getClass(), "sourcePosition", 0);
        setField(term180663, term180663.getClass(), "jsType", null);
        setField(term180663, term180663.getClass(), "parent", null);
        setField(term180662, term180662.getClass(), "first", term180663);
        setField(term180662, term180662.getClass(), "last", null);
        setField(term180662, term180662.getClass(), "propListHead", null);
        setIntField(term180662, term180662.getClass(), "sourcePosition", 0);
        setField(term180662, term180662.getClass(), "jsType", null);
        setField(term180662, term180662.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term179028;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term178958, args);
        assertTrue(recursiveEquals(term178958, term180661));
        assertTrue(recursiveEquals(term179028, term180662));
    }

};


