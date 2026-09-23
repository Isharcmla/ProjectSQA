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
     Object term51229;

    public Compiler_getAllInputsFromModules_49112942147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51245 = new ArrayList();
        ((ArrayList) term51245).add((Object)null);
        ((ArrayList) term51245).add((Object)null);
        ((ArrayList) term51245).add((Object)null);
        ((ArrayList) term51245).add((Object)null);
        ((ArrayList) term51245).add((Object)null);
        ((ArrayList) term51245).add((Object)null);
        ArrayList term51249 = new ArrayList();
        ((ArrayList) term51249).add((Object)null);
        Object term51232 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51232, term51232.getClass(), "name", "pLbTzSMbsN");
        setField(term51232, term51232.getClass(), "inputs", term51245);
        setField(term51232, term51232.getClass(), "deps", term51249);
        setIntField(term51232, term51232.getClass(), "depth", -1252345779);
        ArrayList term51257 = new ArrayList();
        ((ArrayList) term51257).add((Object)null);
        ((ArrayList) term51257).add((Object)null);
        ((ArrayList) term51257).add((Object)null);
        ((ArrayList) term51257).add((Object)null);
        ((ArrayList) term51257).add((Object)null);
        ArrayList term51260 = new ArrayList();
        ((ArrayList) term51260).add((Object)null);
        ((ArrayList) term51260).add((Object)null);
        ((ArrayList) term51260).add((Object)null);
        ((ArrayList) term51260).add((Object)null);
        Object term51255 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51255, term51255.getClass(), "name", "");
        setField(term51255, term51255.getClass(), "inputs", term51257);
        setField(term51255, term51255.getClass(), "deps", term51260);
        setIntField(term51255, term51255.getClass(), "depth", 873659088);
        Object term51265 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51265, term51265.getClass(), "name", null);
        setField(term51265, term51265.getClass(), "inputs", null);
        setField(term51265, term51265.getClass(), "deps", null);
        setIntField(term51265, term51265.getClass(), "depth", 947449400);
        term51229 = new LinkedList();
        ((LinkedList) term51229).add(term51232);
        ((LinkedList) term51229).add(term51255);
        ((LinkedList) term51229).add(term51265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term51229;
        try {
            callMethod(klass, "getAllInputsFromModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


