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
import java.util.HashMap;
import java.lang.Object;

public class ScopedAliases_init_18788969773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term172;
     Object term179;

    public ScopedAliases_init_18788969773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1, term1.getClass(), "symbols", term2);
        setField(term1, term1.getClass(), "refs", null);
        setIntField(term13, term13.getClass(), "type", 391863371);
        setIntField(term15, term15.getClass(), "type", 0);
        setField(term15, term15.getClass(), "next", null);
        setField(term15, term15.getClass(), "first", null);
        setField(term15, term15.getClass(), "last", null);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term18);
        setIntField(term21, term21.getClass(), "type", 0);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term13, term13.getClass(), "last", term21);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term1, term1.getClass(), "root", term13);
        HashMap term174 = new HashMap();
        term172 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        Object term173 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term172, term172.getClass(), "compiler", null);
        setField(term173, term173.getClass(), "symbols", term174);
        setField(term173, term173.getClass(), "refs", null);
        setIntField(term175, term175.getClass(), "type", 391863371);
        setIntField(term176, term176.getClass(), "type", 0);
        setField(term176, term176.getClass(), "next", null);
        setField(term176, term176.getClass(), "first", null);
        setField(term176, term176.getClass(), "last", null);
        setField(term176, term176.getClass(), "propListHead", null);
        setIntField(term176, term176.getClass(), "sourcePosition", 0);
        setField(term176, term176.getClass(), "jsType", null);
        setField(term176, term176.getClass(), "parent", null);
        setField(term175, term175.getClass(), "next", term176);
        setIntField(term177, term177.getClass(), "type", 0);
        setField(term177, term177.getClass(), "next", null);
        setField(term177, term177.getClass(), "first", null);
        setField(term177, term177.getClass(), "last", null);
        setField(term177, term177.getClass(), "propListHead", null);
        setIntField(term177, term177.getClass(), "sourcePosition", 0);
        setField(term177, term177.getClass(), "jsType", null);
        setField(term177, term177.getClass(), "parent", null);
        setField(term175, term175.getClass(), "first", term177);
        setIntField(term178, term178.getClass(), "type", 0);
        setField(term178, term178.getClass(), "next", null);
        setField(term178, term178.getClass(), "first", null);
        setField(term178, term178.getClass(), "last", null);
        setField(term178, term178.getClass(), "propListHead", null);
        setIntField(term178, term178.getClass(), "sourcePosition", 0);
        setField(term178, term178.getClass(), "jsType", null);
        setField(term178, term178.getClass(), "parent", null);
        setField(term175, term175.getClass(), "last", term178);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        setField(term173, term173.getClass(), "root", term175);
        setField(term172, term172.getClass(), "preprocessorSymbolTable", term173);
        setField(term172, term172.getClass(), "transformationHandler", null);
        HashMap term180 = new HashMap();
        term179 = newInstance(Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        Object term181 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term179, term179.getClass(), "symbols", term180);
        setField(term179, term179.getClass(), "refs", null);
        setIntField(term181, term181.getClass(), "type", 391863371);
        setIntField(term182, term182.getClass(), "type", 0);
        setField(term182, term182.getClass(), "next", null);
        setField(term182, term182.getClass(), "first", null);
        setField(term182, term182.getClass(), "last", null);
        setField(term182, term182.getClass(), "propListHead", null);
        setIntField(term182, term182.getClass(), "sourcePosition", 0);
        setField(term182, term182.getClass(), "jsType", null);
        setField(term182, term182.getClass(), "parent", null);
        setField(term181, term181.getClass(), "next", term182);
        setIntField(term183, term183.getClass(), "type", 0);
        setField(term183, term183.getClass(), "next", null);
        setField(term183, term183.getClass(), "first", null);
        setField(term183, term183.getClass(), "last", null);
        setField(term183, term183.getClass(), "propListHead", null);
        setIntField(term183, term183.getClass(), "sourcePosition", 0);
        setField(term183, term183.getClass(), "jsType", null);
        setField(term183, term183.getClass(), "parent", null);
        setField(term181, term181.getClass(), "first", term183);
        setIntField(term184, term184.getClass(), "type", 0);
        setField(term184, term184.getClass(), "next", null);
        setField(term184, term184.getClass(), "first", null);
        setField(term184, term184.getClass(), "last", null);
        setField(term184, term184.getClass(), "propListHead", null);
        setIntField(term184, term184.getClass(), "sourcePosition", 0);
        setField(term184, term184.getClass(), "jsType", null);
        setField(term184, term184.getClass(), "parent", null);
        setField(term181, term181.getClass(), "last", term184);
        setField(term181, term181.getClass(), "propListHead", null);
        setIntField(term181, term181.getClass(), "sourcePosition", 0);
        setField(term181, term181.getClass(), "jsType", null);
        setField(term181, term181.getClass(), "parent", null);
        setField(term179, term179.getClass(), "root", term181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.PreprocessorSymbolTable");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CompilerOptions$AliasTransformationHandler");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term172));
        assertTrue(recursiveEquals(term1, term179));
    }

};


