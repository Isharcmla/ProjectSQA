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

public class Compiler_fillEmptyModules_260847624148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47026;

    public Compiler_fillEmptyModules_260847624148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term47042 = new ArrayList();
        ((ArrayList) term47042).add((Object)null);
        ((ArrayList) term47042).add((Object)null);
        ((ArrayList) term47042).add((Object)null);
        ((ArrayList) term47042).add((Object)null);
        ArrayList term47046 = new ArrayList();
        ((ArrayList) term47046).add((Object)null);
        Object term47029 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term47029, term47029.getClass(), "name", "wgRGBNrTGP");
        setField(term47029, term47029.getClass(), "inputs", term47042);
        setField(term47029, term47029.getClass(), "deps", term47046);
        setIntField(term47029, term47029.getClass(), "depth", 729658803);
        ArrayList term47054 = new ArrayList();
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ((ArrayList) term47054).add((Object)null);
        ArrayList term47057 = new ArrayList();
        ((ArrayList) term47057).add((Object)null);
        ((ArrayList) term47057).add((Object)null);
        ((ArrayList) term47057).add((Object)null);
        ((ArrayList) term47057).add((Object)null);
        Object term47052 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term47052, term47052.getClass(), "name", "");
        setField(term47052, term47052.getClass(), "inputs", term47054);
        setField(term47052, term47052.getClass(), "deps", term47057);
        setIntField(term47052, term47052.getClass(), "depth", -1347358701);
        Object term47062 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term47062, term47062.getClass(), "name", null);
        setField(term47062, term47062.getClass(), "inputs", null);
        setField(term47062, term47062.getClass(), "deps", null);
        setIntField(term47062, term47062.getClass(), "depth", 1743224434);
        term47026 = new LinkedList();
        ((LinkedList) term47026).add(term47029);
        ((LinkedList) term47026).add(term47052);
        ((LinkedList) term47026).add(term47062);
        ((LinkedList) term47026).add((Object)null);
        ((LinkedList) term47026).add((Object)null);
        ((LinkedList) term47026).add((Object)null);
        ((LinkedList) term47026).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term47026;
        try {
            callMethod(klass, "fillEmptyModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


