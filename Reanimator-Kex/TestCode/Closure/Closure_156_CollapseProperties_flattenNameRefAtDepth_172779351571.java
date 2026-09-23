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

public class CollapseProperties_flattenNameRefAtDepth_172779351571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58427;
     Object term58497;
     Object term59446;
     Object term59447;

    public CollapseProperties_flattenNameRefAtDepth_172779351571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58427 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term58497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58497, term58497.getClass(), "type", 38);
        term59446 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term59446, term59446.getClass(), "compiler", null);
        setField(term59446, term59446.getClass(), "globalNames", null);
        setField(term59446, term59446.getClass(), "nameMap", null);
        setBooleanField(term59446, term59446.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term59446, term59446.getClass(), "inlineAliases", false);
        term59447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term59447, term59447.getClass(), "type", 38);
        setField(term59447, term59447.getClass(), "next", null);
        setField(term59447, term59447.getClass(), "first", null);
        setField(term59447, term59447.getClass(), "last", null);
        setField(term59447, term59447.getClass(), "propListHead", null);
        setIntField(term59447, term59447.getClass(), "sourcePosition", 0);
        setField(term59447, term59447.getClass(), "jsType", null);
        setField(term59447, term59447.getClass(), "parent", null);
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
        args[1] = term58497;
        args[2] = 0;
        args[3] = null;
        callMethod(klass, "flattenNameRefAtDepth", argTypes, term58427, args);
        assertTrue(recursiveEquals(term58427, term59446));
        assertTrue(recursiveEquals(term58497, null));
    }

};


