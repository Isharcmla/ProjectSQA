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

public class Compiler_getAllInputsFromModules_49112942150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51420;

    public Compiler_getAllInputsFromModules_49112942150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51436 = new ArrayList();
        ((ArrayList) term51436).add((Object)null);
        ((ArrayList) term51436).add((Object)null);
        ((ArrayList) term51436).add((Object)null);
        ((ArrayList) term51436).add((Object)null);
        ArrayList term51440 = new ArrayList();
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        ((ArrayList) term51440).add((Object)null);
        Object term51423 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51423, term51423.getClass(), "name", "OTSPWPJefj");
        setField(term51423, term51423.getClass(), "inputs", term51436);
        setField(term51423, term51423.getClass(), "deps", term51440);
        setIntField(term51423, term51423.getClass(), "depth", 908108726);
        ArrayList term51448 = new ArrayList();
        ((ArrayList) term51448).add((Object)null);
        ((ArrayList) term51448).add((Object)null);
        ((ArrayList) term51448).add((Object)null);
        ArrayList term51451 = new ArrayList();
        Object term51446 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51446, term51446.getClass(), "name", "");
        setField(term51446, term51446.getClass(), "inputs", term51448);
        setField(term51446, term51446.getClass(), "deps", term51451);
        setIntField(term51446, term51446.getClass(), "depth", -1631697577);
        Object term51456 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term51456, term51456.getClass(), "name", null);
        setField(term51456, term51456.getClass(), "inputs", null);
        setField(term51456, term51456.getClass(), "deps", null);
        setIntField(term51456, term51456.getClass(), "depth", -525570815);
        term51420 = new LinkedList();
        ((LinkedList) term51420).add(term51423);
        ((LinkedList) term51420).add(term51446);
        ((LinkedList) term51420).add(term51456);
        ((LinkedList) term51420).add((Object)null);
        ((LinkedList) term51420).add((Object)null);
        ((LinkedList) term51420).add((Object)null);
        ((LinkedList) term51420).add((Object)null);
        ((LinkedList) term51420).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term51420;
        try {
            callMethod(klass, "getAllInputsFromModules", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


