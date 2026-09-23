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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term142;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term138, term138.getClass(), "compiler", null);
        setField(term138, term138.getClass(), "codingConvention", null);
        setBooleanField(term138, term138.getClass(), "removeGlobals", true);
        setBooleanField(term138, term138.getClass(), "preserveFunctionExpressionNames", false);
        setField(term138, term138.getClass(), "referenced", null);
        setField(term138, term138.getClass(), "maybeUnreferenced", null);
        setField(term138, term138.getClass(), "allFunctionScopes", null);
        setField(term138, term138.getClass(), "assignsByVar", null);
        setField(term138, term138.getClass(), "assignsByNode", null);
        setField(term138, term138.getClass(), "inheritsCalls", null);
        setField(term138, term138.getClass(), "continuations", null);
        setBooleanField(term138, term138.getClass(), "modifyCallSites", false);
        setField(term138, term138.getClass(), "callSiteOptimizer", null);
        term142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term142, term142.getClass(), "type", -1588772968);
        setIntField(term144, term144.getClass(), "type", -93135961);
        setIntField(term146, term146.getClass(), "type", -112921587);
        setIntField(term148, term148.getClass(), "type", 933028652);
        setIntField(term150, term150.getClass(), "type", 287287233);
        setField(term150, term150.getClass(), "next", null);
        setField(term150, term150.getClass(), "first", null);
        setField(term150, term150.getClass(), "last", null);
        setField(term150, term150.getClass(), "propListHead", null);
        setIntField(term150, term150.getClass(), "sourcePosition", 0);
        setField(term150, term150.getClass(), "jsType", null);
        setField(term150, term150.getClass(), "parent", null);
        setField(term148, term148.getClass(), "next", term150);
        setIntField(term153, term153.getClass(), "type", 962840079);
        setField(term153, term153.getClass(), "next", null);
        setField(term153, term153.getClass(), "first", null);
        setField(term153, term153.getClass(), "last", term150);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
        setField(term148, term148.getClass(), "first", term153);
        setField(term148, term148.getClass(), "last", term146);
        setField(term148, term148.getClass(), "propListHead", null);
        setIntField(term148, term148.getClass(), "sourcePosition", 0);
        setField(term148, term148.getClass(), "jsType", null);
        setField(term148, term148.getClass(), "parent", null);
        setField(term146, term146.getClass(), "next", term148);
        setField(term146, term146.getClass(), "first", term150);
        setIntField(term157, term157.getClass(), "type", 1265463001);
        setIntField(term159, term159.getClass(), "type", 335112684);
        setField(term159, term159.getClass(), "next", null);
        setField(term159, term159.getClass(), "first", term153);
        setField(term159, term159.getClass(), "last", term148);
        setField(term159, term159.getClass(), "propListHead", null);
        setIntField(term159, term159.getClass(), "sourcePosition", 0);
        setField(term159, term159.getClass(), "jsType", null);
        setField(term159, term159.getClass(), "parent", null);
        setField(term157, term157.getClass(), "next", term159);
        setField(term157, term157.getClass(), "first", term144);
        setField(term157, term157.getClass(), "last", term144);
        setField(term157, term157.getClass(), "propListHead", null);
        setIntField(term157, term157.getClass(), "sourcePosition", 0);
        setField(term157, term157.getClass(), "jsType", null);
        setField(term157, term157.getClass(), "parent", null);
        setField(term146, term146.getClass(), "last", term157);
        setField(term146, term146.getClass(), "propListHead", null);
        setIntField(term146, term146.getClass(), "sourcePosition", 0);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term144, term144.getClass(), "next", term146);
        setIntField(term164, term164.getClass(), "type", 1551099402);
        setField(term164, term164.getClass(), "next", term157);
        setField(term164, term164.getClass(), "first", term159);
        setField(term164, term164.getClass(), "last", term142);
        setField(term164, term164.getClass(), "propListHead", null);
        setIntField(term164, term164.getClass(), "sourcePosition", 0);
        setField(term164, term164.getClass(), "jsType", null);
        setField(term164, term164.getClass(), "parent", null);
        setField(term144, term144.getClass(), "first", term164);
        setField(term144, term144.getClass(), "last", term164);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term142, term142.getClass(), "next", term144);
        setField(term142, term142.getClass(), "first", term148);
        setField(term142, term142.getClass(), "last", term150);
        setField(term142, term142.getClass(), "propListHead", null);
        setIntField(term142, term142.getClass(), "sourcePosition", 0);
        setField(term142, term142.getClass(), "jsType", null);
        setField(term142, term142.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term142;
        try {
            callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


