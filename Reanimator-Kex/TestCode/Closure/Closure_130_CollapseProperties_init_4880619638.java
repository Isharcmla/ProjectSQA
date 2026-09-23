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
import java.lang.Boolean;

public class CollapseProperties_init_4880619638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term36140;

    public CollapseProperties_init_4880619638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term3 = new Boolean(false);
        term36140 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term36140, term36140.getClass(), "compiler", null);
        setField(term36140, term36140.getClass(), "globalNames", null);
        setField(term36140, term36140.getClass(), "nameMap", null);
        setBooleanField(term36140, term36140.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term36140, term36140.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36140));
        assertTrue(recursiveEquals(term1, false));
        assertTrue(recursiveEquals(term3, false));
    }

};


