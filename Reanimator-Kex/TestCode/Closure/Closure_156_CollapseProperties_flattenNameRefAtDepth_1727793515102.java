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

public class CollapseProperties_flattenNameRefAtDepth_1727793515102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66870;
     Object term66940;
     Object term67298;
     Object term67299;

    public CollapseProperties_flattenNameRefAtDepth_1727793515102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66870 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term66940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66940, term66940.getClass(), "type", 33);
        setField(term66940, term66940.getClass(), "parent", null);
        term67298 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term67298, term67298.getClass(), "compiler", null);
        setField(term67298, term67298.getClass(), "globalNames", null);
        setField(term67298, term67298.getClass(), "nameMap", null);
        setBooleanField(term67298, term67298.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term67298, term67298.getClass(), "inlineAliases", false);
        term67299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67299, term67299.getClass(), "type", 33);
        setField(term67299, term67299.getClass(), "next", null);
        setField(term67299, term67299.getClass(), "first", null);
        setField(term67299, term67299.getClass(), "last", null);
        setField(term67299, term67299.getClass(), "propListHead", null);
        setIntField(term67299, term67299.getClass(), "sourcePosition", 0);
        setField(term67299, term67299.getClass(), "jsType", null);
        setField(term67299, term67299.getClass(), "parent", null);
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
        args[1] = term66940;
        args[2] = 2;
        args[3] = null;
        callMethod(klass, "flattenNameRefAtDepth", argTypes, term66870, args);
        assertTrue(recursiveEquals(term66870, term67298));
        assertTrue(recursiveEquals(term66940, null));
    }

};


