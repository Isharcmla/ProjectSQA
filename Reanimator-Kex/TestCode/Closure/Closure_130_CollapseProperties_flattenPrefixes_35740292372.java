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

public class CollapseProperties_flattenPrefixes_35740292372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241185;
     Object term241289;
     Object term241603;
     Object term241604;

    public CollapseProperties_flattenPrefixes_35740292372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241185 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term241289 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term241603 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term241603, term241603.getClass(), "compiler", null);
        setField(term241603, term241603.getClass(), "globalNames", null);
        setField(term241603, term241603.getClass(), "nameMap", null);
        setBooleanField(term241603, term241603.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term241603, term241603.getClass(), "inlineAliases", false);
        term241604 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term241604, term241604.getClass(), "baseName", null);
        setField(term241604, term241604.getClass(), "parent", null);
        setField(term241604, term241604.getClass(), "props", null);
        setField(term241604, term241604.getClass(), "declaration", null);
        setField(term241604, term241604.getClass(), "refs", null);
        setField(term241604, term241604.getClass(), "type", null);
        setBooleanField(term241604, term241604.getClass(), "declaredType", false);
        setBooleanField(term241604, term241604.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term241604, term241604.getClass(), "globalSets", 0);
        setIntField(term241604, term241604.getClass(), "localSets", 0);
        setIntField(term241604, term241604.getClass(), "aliasingGets", 0);
        setIntField(term241604, term241604.getClass(), "totalGets", 0);
        setIntField(term241604, term241604.getClass(), "callGets", 0);
        setIntField(term241604, term241604.getClass(), "deleteProps", 0);
        setBooleanField(term241604, term241604.getClass(), "inExterns", false);
        setField(term241604, term241604.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term241289;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term241185, args);
        assertTrue(recursiveEquals(term241185, term241603));
        assertTrue(recursiveEquals(term241289, null));
    }

};


