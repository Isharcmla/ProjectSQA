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

public class CollapseProperties_flattenNameRefAtDepth_1727793515124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255867;
     Object term255937;
     Object term256019;
     Object term256020;

    public CollapseProperties_flattenNameRefAtDepth_1727793515124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255867 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term255937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term255937, term255937.getClass(), "type", 38);
        term256019 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term256019, term256019.getClass(), "compiler", null);
        setField(term256019, term256019.getClass(), "globalNames", null);
        setField(term256019, term256019.getClass(), "nameMap", null);
        setBooleanField(term256019, term256019.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term256019, term256019.getClass(), "inlineAliases", false);
        term256020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term256020, term256020.getClass(), "type", 38);
        setField(term256020, term256020.getClass(), "next", null);
        setField(term256020, term256020.getClass(), "first", null);
        setField(term256020, term256020.getClass(), "last", null);
        setField(term256020, term256020.getClass(), "propListHead", null);
        setIntField(term256020, term256020.getClass(), "sourcePosition", 0);
        setField(term256020, term256020.getClass(), "jsType", null);
        setField(term256020, term256020.getClass(), "parent", null);
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
        args[1] = term255937;
        args[2] = 0;
        args[3] = null;
        callMethod(klass, "flattenNameRefAtDepth", argTypes, term255867, args);
        assertTrue(recursiveEquals(term255867, term256019));
        assertTrue(recursiveEquals(term255937, null));
    }

};


