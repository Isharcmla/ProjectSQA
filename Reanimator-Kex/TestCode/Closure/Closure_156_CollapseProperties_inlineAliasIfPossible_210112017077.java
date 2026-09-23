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

public class CollapseProperties_inlineAliasIfPossible_210112017077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60270;
     Object term60372;
     Object term60783;
     Object term60784;

    public CollapseProperties_inlineAliasIfPossible_210112017077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60270 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term60372 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term60442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60442, term60442.getClass(), "parent", term60512);
        setField(term60372, term60372.getClass(), "node", term60442);
        term60783 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term60783, term60783.getClass(), "compiler", null);
        setField(term60783, term60783.getClass(), "globalNames", null);
        setField(term60783, term60783.getClass(), "nameMap", null);
        setBooleanField(term60783, term60783.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term60783, term60783.getClass(), "inlineAliases", false);
        term60784 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term60785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60785, term60785.getClass(), "type", 0);
        setField(term60785, term60785.getClass(), "next", null);
        setField(term60785, term60785.getClass(), "first", null);
        setField(term60785, term60785.getClass(), "last", null);
        setField(term60785, term60785.getClass(), "propListHead", null);
        setIntField(term60785, term60785.getClass(), "sourcePosition", 0);
        setField(term60785, term60785.getClass(), "jsType", null);
        setIntField(term60786, term60786.getClass(), "type", 0);
        setField(term60786, term60786.getClass(), "next", null);
        setField(term60786, term60786.getClass(), "first", null);
        setField(term60786, term60786.getClass(), "last", null);
        setField(term60786, term60786.getClass(), "propListHead", null);
        setIntField(term60786, term60786.getClass(), "sourcePosition", 0);
        setField(term60786, term60786.getClass(), "jsType", null);
        setField(term60786, term60786.getClass(), "parent", null);
        setField(term60785, term60785.getClass(), "parent", term60786);
        setField(term60784, term60784.getClass(), "node", term60785);
        setField(term60784, term60784.getClass(), "type", null);
        setField(term60784, term60784.getClass(), "sourceName", null);
        setField(term60784, term60784.getClass(), "scope", null);
        setField(term60784, term60784.getClass(), "module", null);
        setField(term60784, term60784.getClass(), "twin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Object[] args = new Object[2];
        args[0] = term60372;
        args[1] = null;
        Object retValue = callMethod(klass, "inlineAliasIfPossible", argTypes, term60270, args);
        assertTrue(recursiveEquals(term60270, term60783));
        assertTrue(recursiveEquals(term60372, term60784));
        assertTrue(recursiveEquals(retValue, false));
    }

};


