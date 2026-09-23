package com.google.javascript.rhino.jstype;

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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ArrowType_resolveInternal_128941235725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;

    public ArrowType_resolveInternal_128941235725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term499, term499.getClass(), "type", 1861318859);
        setIntField(term501, term501.getClass(), "type", 1474524152);
        setIntField(term503, term503.getClass(), "type", 568954359);
        setIntField(term505, term505.getClass(), "type", 53410913);
        setField(term505, term505.getClass(), "next", null);
        setField(term505, term505.getClass(), "first", null);
        setField(term505, term505.getClass(), "last", null);
        setField(term505, term505.getClass(), "propListHead", null);
        setIntField(term505, term505.getClass(), "sourcePosition", 0);
        setField(term505, term505.getClass(), "jsType", null);
        setField(term505, term505.getClass(), "parent", null);
        setField(term503, term503.getClass(), "next", term505);
        setIntField(term508, term508.getClass(), "type", -341152642);
        setField(term508, term508.getClass(), "next", null);
        setField(term508, term508.getClass(), "first", term499);
        setField(term508, term508.getClass(), "last", null);
        setField(term508, term508.getClass(), "propListHead", null);
        setIntField(term508, term508.getClass(), "sourcePosition", 0);
        setField(term508, term508.getClass(), "jsType", null);
        setField(term508, term508.getClass(), "parent", null);
        setField(term503, term503.getClass(), "first", term508);
        setIntField(term511, term511.getClass(), "type", 1107176718);
        setField(term511, term511.getClass(), "next", null);
        setField(term511, term511.getClass(), "first", term501);
        setField(term511, term511.getClass(), "last", null);
        setField(term511, term511.getClass(), "propListHead", null);
        setIntField(term511, term511.getClass(), "sourcePosition", 0);
        setField(term511, term511.getClass(), "jsType", null);
        setField(term511, term511.getClass(), "parent", null);
        setField(term503, term503.getClass(), "last", term511);
        setField(term503, term503.getClass(), "propListHead", null);
        setIntField(term503, term503.getClass(), "sourcePosition", 0);
        setField(term503, term503.getClass(), "jsType", null);
        setField(term503, term503.getClass(), "parent", null);
        setField(term501, term501.getClass(), "next", term503);
        setField(term501, term501.getClass(), "first", term503);
        setIntField(term515, term515.getClass(), "type", -375014958);
        setField(term515, term515.getClass(), "next", term511);
        setField(term515, term515.getClass(), "first", term508);
        setField(term515, term515.getClass(), "last", term508);
        setField(term515, term515.getClass(), "propListHead", null);
        setIntField(term515, term515.getClass(), "sourcePosition", 0);
        setField(term515, term515.getClass(), "jsType", null);
        setField(term515, term515.getClass(), "parent", null);
        setField(term501, term501.getClass(), "last", term515);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term499, term499.getClass(), "next", term501);
        setField(term499, term499.getClass(), "first", term508);
        setIntField(term519, term519.getClass(), "type", 0);
        setField(term519, term519.getClass(), "next", null);
        setField(term519, term519.getClass(), "first", null);
        setField(term519, term519.getClass(), "last", null);
        setField(term519, term519.getClass(), "propListHead", null);
        setIntField(term519, term519.getClass(), "sourcePosition", 0);
        setField(term519, term519.getClass(), "jsType", null);
        setField(term519, term519.getClass(), "parent", null);
        setField(term499, term499.getClass(), "last", term519);
        setField(term499, term499.getClass(), "propListHead", null);
        setIntField(term499, term499.getClass(), "sourcePosition", 0);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
        setField(term498, term498.getClass(), "parameters", term499);
        setField(term498, term498.getClass(), "returnType", null);
        setBooleanField(term498, term498.getClass(), "returnTypeInferred", false);
        setBooleanField(term498, term498.getClass(), "resolved", false);
        setField(term498, term498.getClass(), "resolveResult", null);
        setField(term498, term498.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term498, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


