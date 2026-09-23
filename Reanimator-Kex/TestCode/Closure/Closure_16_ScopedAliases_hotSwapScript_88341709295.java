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

public class ScopedAliases_hotSwapScript_88341709295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191897;
     Object term191967;
     Object term193202;
     Object term193203;

    public ScopedAliases_hotSwapScript_88341709295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191897 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term191897, term191897.getClass(), "compiler", null);
        term191967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191967, term191967.getClass(), "type", 37);
        setField(term191967, term191967.getClass(), "parent", null);
        setField(term192177, term192177.getClass(), "next", null);
        setIntField(term192177, term192177.getClass(), "type", 0);
        setField(term192177, term192177.getClass(), "first", null);
        setField(term192107, term192107.getClass(), "next", term192177);
        setIntField(term192107, term192107.getClass(), "type", 37);
        setField(term192247, term192247.getClass(), "next", null);
        setIntField(term192247, term192247.getClass(), "type", 0);
        setField(term192247, term192247.getClass(), "first", null);
        setField(term192107, term192107.getClass(), "first", term192247);
        setField(term192037, term192037.getClass(), "next", term192107);
        setIntField(term192037, term192037.getClass(), "type", 0);
        setField(term192317, term192317.getClass(), "next", null);
        setIntField(term192317, term192317.getClass(), "type", 0);
        setField(term192317, term192317.getClass(), "first", null);
        setField(term192037, term192037.getClass(), "first", term192317);
        setField(term191967, term191967.getClass(), "first", term192037);
        term193202 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term193202, term193202.getClass(), "compiler", null);
        setField(term193202, term193202.getClass(), "preprocessorSymbolTable", null);
        setField(term193202, term193202.getClass(), "transformationHandler", null);
        term193203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term193208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term193203, term193203.getClass(), "type", 37);
        setField(term193203, term193203.getClass(), "next", null);
        setIntField(term193204, term193204.getClass(), "type", 0);
        setIntField(term193205, term193205.getClass(), "type", 37);
        setIntField(term193206, term193206.getClass(), "type", 0);
        setField(term193206, term193206.getClass(), "next", null);
        setField(term193206, term193206.getClass(), "first", null);
        setField(term193206, term193206.getClass(), "last", null);
        setField(term193206, term193206.getClass(), "propListHead", null);
        setIntField(term193206, term193206.getClass(), "sourcePosition", 0);
        setField(term193206, term193206.getClass(), "jsType", null);
        setField(term193206, term193206.getClass(), "parent", null);
        setField(term193205, term193205.getClass(), "next", term193206);
        setIntField(term193207, term193207.getClass(), "type", 0);
        setField(term193207, term193207.getClass(), "next", null);
        setField(term193207, term193207.getClass(), "first", null);
        setField(term193207, term193207.getClass(), "last", null);
        setField(term193207, term193207.getClass(), "propListHead", null);
        setIntField(term193207, term193207.getClass(), "sourcePosition", 0);
        setField(term193207, term193207.getClass(), "jsType", null);
        setField(term193207, term193207.getClass(), "parent", null);
        setField(term193205, term193205.getClass(), "first", term193207);
        setField(term193205, term193205.getClass(), "last", null);
        setField(term193205, term193205.getClass(), "propListHead", null);
        setIntField(term193205, term193205.getClass(), "sourcePosition", 0);
        setField(term193205, term193205.getClass(), "jsType", null);
        setField(term193205, term193205.getClass(), "parent", null);
        setField(term193204, term193204.getClass(), "next", term193205);
        setIntField(term193208, term193208.getClass(), "type", 0);
        setField(term193208, term193208.getClass(), "next", null);
        setField(term193208, term193208.getClass(), "first", null);
        setField(term193208, term193208.getClass(), "last", null);
        setField(term193208, term193208.getClass(), "propListHead", null);
        setIntField(term193208, term193208.getClass(), "sourcePosition", 0);
        setField(term193208, term193208.getClass(), "jsType", null);
        setField(term193208, term193208.getClass(), "parent", null);
        setField(term193204, term193204.getClass(), "first", term193208);
        setField(term193204, term193204.getClass(), "last", null);
        setField(term193204, term193204.getClass(), "propListHead", null);
        setIntField(term193204, term193204.getClass(), "sourcePosition", 0);
        setField(term193204, term193204.getClass(), "jsType", null);
        setField(term193204, term193204.getClass(), "parent", null);
        setField(term193203, term193203.getClass(), "first", term193204);
        setField(term193203, term193203.getClass(), "last", null);
        setField(term193203, term193203.getClass(), "propListHead", null);
        setIntField(term193203, term193203.getClass(), "sourcePosition", 0);
        setField(term193203, term193203.getClass(), "jsType", null);
        setField(term193203, term193203.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term191967;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term191897, args);
        assertTrue(recursiveEquals(term191897, term193202));
        assertTrue(recursiveEquals(term191967, term193203));
    }

};


