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

public class Compiler_getAllInputsFromModules_49112942139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36567;

    public Compiler_getAllInputsFromModules_49112942139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36583 = new ArrayList();
        ((ArrayList) term36583).add((Object)null);
        ((ArrayList) term36583).add((Object)null);
        ArrayList term36587 = new ArrayList();
        ((ArrayList) term36587).add((Object)null);
        ((ArrayList) term36587).add((Object)null);
        ((ArrayList) term36587).add((Object)null);
        ((ArrayList) term36587).add((Object)null);
        ((ArrayList) term36587).add((Object)null);
        ((ArrayList) term36587).add((Object)null);
        Object term36570 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term36570, term36570.getClass(), "name", "CURQCMkqbZ");
        setField(term36570, term36570.getClass(), "inputs", term36583);
        setField(term36570, term36570.getClass(), "deps", term36587);
        setIntField(term36570, term36570.getClass(), "depth", 304775596);
        term36567 = new LinkedList();
        ((LinkedList) term36567).add(term36570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term36567;
        try {
            callMethod(klass, "getAllInputsFromModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


