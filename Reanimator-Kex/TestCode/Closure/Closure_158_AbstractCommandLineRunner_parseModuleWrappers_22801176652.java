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

public class AbstractCommandLineRunner_parseModuleWrappers_22801176652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9140;
     Object term9143;

    public AbstractCommandLineRunner_parseModuleWrappers_22801176652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9140 = new LinkedList();
        ArrayList term9159 = new ArrayList();
        ((ArrayList) term9159).add((Object)null);
        ((ArrayList) term9159).add((Object)null);
        ((ArrayList) term9159).add((Object)null);
        ArrayList term9163 = new ArrayList();
        ((ArrayList) term9163).add((Object)null);
        ((ArrayList) term9163).add((Object)null);
        ((ArrayList) term9163).add((Object)null);
        Object term9146 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term9146, term9146.getClass(), "name", "UoYtihxVaS");
        setField(term9146, term9146.getClass(), "inputs", term9159);
        setField(term9146, term9146.getClass(), "deps", term9163);
        setIntField(term9146, term9146.getClass(), "depth", -2038273078);
        ArrayList term9171 = new ArrayList();
        ((ArrayList) term9171).add((Object)null);
        ((ArrayList) term9171).add((Object)null);
        ((ArrayList) term9171).add((Object)null);
        ((ArrayList) term9171).add((Object)null);
        ArrayList term9174 = new ArrayList();
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        ((ArrayList) term9174).add((Object)null);
        Object term9169 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term9169, term9169.getClass(), "name", "");
        setField(term9169, term9169.getClass(), "inputs", term9171);
        setField(term9169, term9169.getClass(), "deps", term9174);
        setIntField(term9169, term9169.getClass(), "depth", 1134449235);
        Object term9179 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term9179, term9179.getClass(), "name", null);
        setField(term9179, term9179.getClass(), "inputs", null);
        setField(term9179, term9179.getClass(), "deps", null);
        setIntField(term9179, term9179.getClass(), "depth", 1622346318);
        term9143 = new LinkedList();
        ((LinkedList) term9143).add(term9146);
        ((LinkedList) term9143).add(term9169);
        ((LinkedList) term9143).add(term9179);
        ((LinkedList) term9143).add((Object)null);
        ((LinkedList) term9143).add((Object)null);
        ((LinkedList) term9143).add((Object)null);
        ((LinkedList) term9143).add((Object)null);
        ((LinkedList) term9143).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term9140;
        args[1] = term9143;
        try {
            callMethod(klass, "parseModuleWrappers", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


