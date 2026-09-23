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

public class GlobalNamespace_getNameIndex_22018420947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12967;
     Object term13115;

    public GlobalNamespace_getNameIndex_22018420947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12967 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term13037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setBooleanField(term12967, term12967.getClass(), "generated", false);
        setField(term12967, term12967.getClass(), "externsRoot", null);
        setBooleanField(term12967, term12967.getClass(), "inExterns", false);
        setField(term12967, term12967.getClass(), "compiler", null);
        setField(term12967, term12967.getClass(), "root", term13037);
        term13115 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term13116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13115, term13115.getClass(), "compiler", null);
        setIntField(term13116, term13116.getClass(), "type", 0);
        setField(term13116, term13116.getClass(), "next", null);
        setField(term13116, term13116.getClass(), "first", null);
        setField(term13116, term13116.getClass(), "last", null);
        setField(term13116, term13116.getClass(), "propListHead", null);
        setIntField(term13116, term13116.getClass(), "sourcePosition", 0);
        setField(term13116, term13116.getClass(), "jsType", null);
        setField(term13116, term13116.getClass(), "parent", null);
        setField(term13115, term13115.getClass(), "root", term13116);
        setField(term13115, term13115.getClass(), "externsRoot", null);
        setBooleanField(term13115, term13115.getClass(), "inExterns", false);
        setField(term13115, term13115.getClass(), "externsScope", null);
        setBooleanField(term13115, term13115.getClass(), "generated", true);
        setField(term13115, term13115.getClass(), "globalNames", null);
        setField(term13115, term13115.getClass(), "nameMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNameIndex", argTypes, term12967, args);
        assertTrue(recursiveEquals(term12967, term13115));
        assertTrue(recursiveEquals(retValue, null));
    }

};


