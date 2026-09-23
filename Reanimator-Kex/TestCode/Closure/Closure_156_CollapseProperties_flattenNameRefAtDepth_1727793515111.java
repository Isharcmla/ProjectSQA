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

public class CollapseProperties_flattenNameRefAtDepth_1727793515111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68758;
     Object term68828;
     Object term68855;
     Object term68856;

    public CollapseProperties_flattenNameRefAtDepth_1727793515111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68758 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term68828 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68828, term68828.getClass(), "type", 38);
        setField(term68828, term68828.getClass(), "parent", null);
        term68855 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term68855, term68855.getClass(), "compiler", null);
        setField(term68855, term68855.getClass(), "globalNames", null);
        setField(term68855, term68855.getClass(), "nameMap", null);
        setBooleanField(term68855, term68855.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term68855, term68855.getClass(), "inlineAliases", false);
        term68856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68856, term68856.getClass(), "type", 38);
        setField(term68856, term68856.getClass(), "next", null);
        setField(term68856, term68856.getClass(), "first", null);
        setField(term68856, term68856.getClass(), "last", null);
        setField(term68856, term68856.getClass(), "propListHead", null);
        setIntField(term68856, term68856.getClass(), "sourcePosition", 0);
        setField(term68856, term68856.getClass(), "jsType", null);
        setField(term68856, term68856.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term68828;
        args[2] = 2;
        args[3] = null;
        callMethod(klass, "flattenNameRefAtDepth", argTypes, term68758, args);
        assertTrue(recursiveEquals(term68758, term68855));
        assertTrue(recursiveEquals(term68828, null));
    }

};


