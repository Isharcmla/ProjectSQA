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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Compiler_fillEmptyModules_260847624171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48774;

    public Compiler_fillEmptyModules_260847624171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48790 = new ArrayList();
        ArrayList term48794 = new ArrayList();
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        ((ArrayList) term48794).add((Object)null);
        Object term48777 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48777, term48777.getClass(), "name", "EyojsbSjWT");
        setField(term48777, term48777.getClass(), "inputs", term48790);
        setField(term48777, term48777.getClass(), "deps", term48794);
        setIntField(term48777, term48777.getClass(), "depth", -243422082);
        ArrayList term48802 = new ArrayList();
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ((ArrayList) term48802).add((Object)null);
        ArrayList term48805 = new ArrayList();
        ((ArrayList) term48805).add((Object)null);
        ((ArrayList) term48805).add((Object)null);
        ((ArrayList) term48805).add((Object)null);
        ((ArrayList) term48805).add((Object)null);
        Object term48800 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48800, term48800.getClass(), "name", "");
        setField(term48800, term48800.getClass(), "inputs", term48802);
        setField(term48800, term48800.getClass(), "deps", term48805);
        setIntField(term48800, term48800.getClass(), "depth", 628918458);
        Object term48810 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48810, term48810.getClass(), "name", null);
        setField(term48810, term48810.getClass(), "inputs", null);
        setField(term48810, term48810.getClass(), "deps", null);
        setIntField(term48810, term48810.getClass(), "depth", -1885090354);
        term48774 = new LinkedList();
        ((LinkedList) term48774).add(term48777);
        ((LinkedList) term48774).add(term48800);
        ((LinkedList) term48774).add(term48810);
        ((LinkedList) term48774).add((Object)null);
        ((LinkedList) term48774).add((Object)null);
        ((LinkedList) term48774).add((Object)null);
        ((LinkedList) term48774).add((Object)null);
        ((LinkedList) term48774).add((Object)null);
        ((LinkedList) term48774).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term48774;
        try {
            callMethod(klass, "fillEmptyModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


