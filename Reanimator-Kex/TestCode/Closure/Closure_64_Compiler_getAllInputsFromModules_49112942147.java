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

public class Compiler_getAllInputsFromModules_49112942147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52665;

    public Compiler_getAllInputsFromModules_49112942147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52681 = new ArrayList();
        ((ArrayList) term52681).add((Object)null);
        ((ArrayList) term52681).add((Object)null);
        ((ArrayList) term52681).add((Object)null);
        ((ArrayList) term52681).add((Object)null);
        ((ArrayList) term52681).add((Object)null);
        ((ArrayList) term52681).add((Object)null);
        ArrayList term52685 = new ArrayList();
        ((ArrayList) term52685).add((Object)null);
        Object term52668 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term52668, term52668.getClass(), "name", "pLbTzSMbsN");
        setField(term52668, term52668.getClass(), "inputs", term52681);
        setField(term52668, term52668.getClass(), "deps", term52685);
        setIntField(term52668, term52668.getClass(), "depth", -1252345779);
        ArrayList term52693 = new ArrayList();
        ((ArrayList) term52693).add((Object)null);
        ((ArrayList) term52693).add((Object)null);
        ((ArrayList) term52693).add((Object)null);
        ((ArrayList) term52693).add((Object)null);
        ((ArrayList) term52693).add((Object)null);
        ArrayList term52696 = new ArrayList();
        ((ArrayList) term52696).add((Object)null);
        ((ArrayList) term52696).add((Object)null);
        ((ArrayList) term52696).add((Object)null);
        ((ArrayList) term52696).add((Object)null);
        Object term52691 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term52691, term52691.getClass(), "name", "");
        setField(term52691, term52691.getClass(), "inputs", term52693);
        setField(term52691, term52691.getClass(), "deps", term52696);
        setIntField(term52691, term52691.getClass(), "depth", 873659088);
        Object term52701 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term52701, term52701.getClass(), "name", null);
        setField(term52701, term52701.getClass(), "inputs", null);
        setField(term52701, term52701.getClass(), "deps", null);
        setIntField(term52701, term52701.getClass(), "depth", 947449400);
        term52665 = new LinkedList();
        ((LinkedList) term52665).add(term52668);
        ((LinkedList) term52665).add(term52691);
        ((LinkedList) term52665).add(term52701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term52665;
        try {
            callMethod(klass, "getAllInputsFromModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


