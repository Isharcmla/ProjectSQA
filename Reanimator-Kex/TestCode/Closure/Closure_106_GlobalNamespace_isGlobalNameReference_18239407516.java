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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class GlobalNamespace_isGlobalNameReference_18239407516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491;
     Object term560;

    public GlobalNamespace_isGlobalNameReference_18239407516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term526 = new ArrayList();
        HashMap term530 = new HashMap();
        term491 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace"));
        Object term492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term505 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term515 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term523 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term491, term491.getClass(), "compiler", null);
        setIntField(term492, term492.getClass(), "type", -556405712);
        setIntField(term494, term494.getClass(), "type", -344842608);
        setIntField(term496, term496.getClass(), "type", 0);
        setField(term496, term496.getClass(), "next", null);
        setField(term496, term496.getClass(), "first", null);
        setField(term496, term496.getClass(), "last", null);
        setField(term496, term496.getClass(), "propListHead", null);
        setIntField(term496, term496.getClass(), "sourcePosition", 0);
        setField(term496, term496.getClass(), "jsType", null);
        setField(term496, term496.getClass(), "parent", null);
        setField(term494, term494.getClass(), "next", term496);
        setIntField(term499, term499.getClass(), "type", 0);
        setField(term499, term499.getClass(), "next", null);
        setField(term499, term499.getClass(), "first", null);
        setField(term499, term499.getClass(), "last", null);
        setField(term499, term499.getClass(), "propListHead", null);
        setIntField(term499, term499.getClass(), "sourcePosition", 0);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
        setField(term494, term494.getClass(), "first", term499);
        setIntField(term502, term502.getClass(), "type", 0);
        setField(term502, term502.getClass(), "next", null);
        setField(term502, term502.getClass(), "first", null);
        setField(term502, term502.getClass(), "last", null);
        setField(term502, term502.getClass(), "propListHead", null);
        setIntField(term502, term502.getClass(), "sourcePosition", 0);
        setField(term502, term502.getClass(), "jsType", null);
        setField(term502, term502.getClass(), "parent", null);
        setField(term494, term494.getClass(), "last", term502);
        setField(term505, term505.getClass(), "next", null);
        setIntField(term505, term505.getClass(), "type", 0);
        setIntField(term505, term505.getClass(), "intValue", 0);
        setField(term505, term505.getClass(), "objectValue", null);
        setField(term494, term494.getClass(), "propListHead", term505);
        setIntField(term494, term494.getClass(), "sourcePosition", 941650513);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term492, term492.getClass(), "next", term494);
        setIntField(term509, term509.getClass(), "type", 0);
        setField(term509, term509.getClass(), "next", null);
        setField(term509, term509.getClass(), "first", null);
        setField(term509, term509.getClass(), "last", null);
        setField(term509, term509.getClass(), "propListHead", null);
        setIntField(term509, term509.getClass(), "sourcePosition", 0);
        setField(term509, term509.getClass(), "jsType", null);
        setField(term509, term509.getClass(), "parent", null);
        setField(term492, term492.getClass(), "first", term509);
        setIntField(term512, term512.getClass(), "type", 0);
        setField(term512, term512.getClass(), "next", null);
        setField(term512, term512.getClass(), "first", null);
        setField(term512, term512.getClass(), "last", null);
        setField(term512, term512.getClass(), "propListHead", null);
        setIntField(term512, term512.getClass(), "sourcePosition", 0);
        setField(term512, term512.getClass(), "jsType", null);
        setField(term512, term512.getClass(), "parent", null);
        setField(term492, term492.getClass(), "last", term512);
        setField(term515, term515.getClass(), "next", null);
        setIntField(term515, term515.getClass(), "type", 0);
        setIntField(term515, term515.getClass(), "intValue", 0);
        setField(term515, term515.getClass(), "objectValue", null);
        setField(term492, term492.getClass(), "propListHead", term515);
        setIntField(term492, term492.getClass(), "sourcePosition", 444029505);
        setField(term492, term492.getClass(), "jsType", null);
        setField(term492, term492.getClass(), "parent", null);
        setField(term491, term491.getClass(), "root", term492);
        setIntField(term519, term519.getClass(), "type", 0);
        setField(term519, term519.getClass(), "next", null);
        setField(term519, term519.getClass(), "first", null);
        setField(term519, term519.getClass(), "last", null);
        setField(term519, term519.getClass(), "propListHead", null);
        setIntField(term519, term519.getClass(), "sourcePosition", 0);
        setField(term519, term519.getClass(), "jsType", null);
        setField(term519, term519.getClass(), "parent", null);
        setField(term491, term491.getClass(), "externsRoot", term519);
        setBooleanField(term491, term491.getClass(), "inExterns", false);
        setField(term523, term523.getClass(), "vars", null);
        setField(term523, term523.getClass(), "parent", null);
        setField(term523, term523.getClass(), "rootNode", null);
        setField(term523, term523.getClass(), "thisType", null);
        setBooleanField(term523, term523.getClass(), "isBottom", false);
        setField(term491, term491.getClass(), "externsScope", term523);
        setBooleanField(term491, term491.getClass(), "generated", true);
        setField(term491, term491.getClass(), "globalNames", term526);
        setField(term491, term491.getClass(), "nameMap", term530);
        HashMap term561 = new HashMap();
        term560 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term575 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term560, term560.getClass(), "vars", term561);
        setField(term575, term575.getClass(), "vars", null);
        setField(term575, term575.getClass(), "parent", null);
        setField(term575, term575.getClass(), "rootNode", null);
        setField(term575, term575.getClass(), "thisType", null);
        setBooleanField(term575, term575.getClass(), "isBottom", false);
        setField(term560, term560.getClass(), "parent", term575);
        setIntField(term577, term577.getClass(), "type", 0);
        setField(term577, term577.getClass(), "next", null);
        setField(term577, term577.getClass(), "first", null);
        setField(term577, term577.getClass(), "last", null);
        setField(term577, term577.getClass(), "propListHead", null);
        setIntField(term577, term577.getClass(), "sourcePosition", 0);
        setField(term577, term577.getClass(), "jsType", null);
        setField(term577, term577.getClass(), "parent", null);
        setField(term560, term560.getClass(), "rootNode", term577);
        setField(term560, term560.getClass(), "thisType", null);
        setBooleanField(term560, term560.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = "MjGYSRKTNF";
        args[1] = term560;
        try {
            callMethod(klass, "isGlobalNameReference", argTypes, term491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


