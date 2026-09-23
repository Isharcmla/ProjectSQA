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
import java.util.HashMap;

public class PureFunctionIdentifier_getDebugReport_212911500929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20421;
     Object term21082;

    public PureFunctionIdentifier_getDebugReport_212911500929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20609 = new HashMap();
        term20421 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term20491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20491, term20491.getClass(), "type", 0);
        setField(term20491, term20491.getClass(), "first", null);
        setField(term20421, term20421.getClass(), "externs", term20491);
        setIntField(term20561, term20561.getClass(), "type", 0);
        setField(term20561, term20561.getClass(), "first", null);
        setField(term20421, term20421.getClass(), "root", term20561);
        setField(term20421, term20421.getClass(), "compiler", null);
        setField(term20421, term20421.getClass(), "functionSideEffectMap", term20609);
        HashMap term21083 = new HashMap();
        term21082 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term21085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21082, term21082.getClass(), "compiler", null);
        setField(term21082, term21082.getClass(), "definitionProvider", null);
        setField(term21082, term21082.getClass(), "functionSideEffectMap", term21083);
        setField(term21082, term21082.getClass(), "allFunctionCalls", null);
        setIntField(term21085, term21085.getClass(), "type", 0);
        setField(term21085, term21085.getClass(), "next", null);
        setField(term21085, term21085.getClass(), "first", null);
        setField(term21085, term21085.getClass(), "last", null);
        setField(term21085, term21085.getClass(), "propListHead", null);
        setIntField(term21085, term21085.getClass(), "sourcePosition", 0);
        setField(term21085, term21085.getClass(), "jsType", null);
        setField(term21085, term21085.getClass(), "parent", null);
        setField(term21082, term21082.getClass(), "externs", term21085);
        setIntField(term21086, term21086.getClass(), "type", 0);
        setField(term21086, term21086.getClass(), "next", null);
        setField(term21086, term21086.getClass(), "first", null);
        setField(term21086, term21086.getClass(), "last", null);
        setField(term21086, term21086.getClass(), "propListHead", null);
        setIntField(term21086, term21086.getClass(), "sourcePosition", 0);
        setField(term21086, term21086.getClass(), "jsType", null);
        setField(term21086, term21086.getClass(), "parent", null);
        setField(term21082, term21082.getClass(), "root", term21086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDebugReport", argTypes, term20421, args);
        assertTrue(recursiveEquals(term20421, term21082));
        assertTrue(recursiveEquals(retValue, "Pure functions:\n\n"));
    }

};


