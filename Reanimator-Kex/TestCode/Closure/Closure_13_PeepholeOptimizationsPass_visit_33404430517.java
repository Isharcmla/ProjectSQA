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

public class PeepholeOptimizationsPass_visit_33404430517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;
     Object term241;

    public PeepholeOptimizationsPass_visit_33404430517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term235, term235.getClass(), "changed", false);
        setBooleanField(term235, term235.getClass(), "traverseChildScopes", true);
        ArrayList term233 = new ArrayList();
        ((ArrayList) term233).add(term235);
        term230 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term231 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 6);
        Object term232 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term230, term230.getClass(), "compiler", null);
        setField(term230, term230.getClass(), "peepholeOptimizations", term231);
        setField(term232, term232.getClass(), "states", term233);
        setIntField(term232, term232.getClass(), "currentDepth", -1588772968);
        setField(term230, term230.getClass(), "traversalState", term232);
        term241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term241, term241.getClass(), "type", -93135961);
        setIntField(term243, term243.getClass(), "type", -112921587);
        setIntField(term245, term245.getClass(), "type", 933028652);
        setIntField(term247, term247.getClass(), "type", 287287233);
        setIntField(term249, term249.getClass(), "type", 962840079);
        setField(term249, term249.getClass(), "next", null);
        setField(term249, term249.getClass(), "first", null);
        setField(term249, term249.getClass(), "last", null);
        setField(term249, term249.getClass(), "propListHead", null);
        setIntField(term249, term249.getClass(), "sourcePosition", 0);
        setField(term249, term249.getClass(), "jsType", null);
        setField(term249, term249.getClass(), "parent", null);
        setField(term247, term247.getClass(), "next", term249);
        setIntField(term252, term252.getClass(), "type", 1540719661);
        setField(term252, term252.getClass(), "next", null);
        setField(term252, term252.getClass(), "first", null);
        setField(term252, term252.getClass(), "last", term249);
        setField(term252, term252.getClass(), "propListHead", null);
        setIntField(term252, term252.getClass(), "sourcePosition", 0);
        setField(term252, term252.getClass(), "jsType", null);
        setField(term252, term252.getClass(), "parent", null);
        setField(term247, term247.getClass(), "first", term252);
        setField(term247, term247.getClass(), "last", term245);
        setField(term247, term247.getClass(), "propListHead", null);
        setIntField(term247, term247.getClass(), "sourcePosition", 0);
        setField(term247, term247.getClass(), "jsType", null);
        setField(term247, term247.getClass(), "parent", null);
        setField(term245, term245.getClass(), "next", term247);
        setField(term245, term245.getClass(), "first", term249);
        setIntField(term256, term256.getClass(), "type", 335112684);
        setIntField(term258, term258.getClass(), "type", 1551099402);
        setField(term258, term258.getClass(), "next", null);
        setField(term258, term258.getClass(), "first", term252);
        setField(term258, term258.getClass(), "last", term247);
        setField(term258, term258.getClass(), "propListHead", null);
        setIntField(term258, term258.getClass(), "sourcePosition", 0);
        setField(term258, term258.getClass(), "jsType", null);
        setField(term258, term258.getClass(), "parent", null);
        setField(term256, term256.getClass(), "next", term258);
        setField(term256, term256.getClass(), "first", term243);
        setField(term256, term256.getClass(), "last", term243);
        setField(term256, term256.getClass(), "propListHead", null);
        setIntField(term256, term256.getClass(), "sourcePosition", 0);
        setField(term256, term256.getClass(), "jsType", null);
        setField(term256, term256.getClass(), "parent", null);
        setField(term245, term245.getClass(), "last", term256);
        setField(term245, term245.getClass(), "propListHead", null);
        setIntField(term245, term245.getClass(), "sourcePosition", 0);
        setField(term245, term245.getClass(), "jsType", null);
        setField(term245, term245.getClass(), "parent", null);
        setField(term243, term243.getClass(), "next", term245);
        setIntField(term263, term263.getClass(), "type", -2027534003);
        setField(term263, term263.getClass(), "next", term256);
        setField(term263, term263.getClass(), "first", term258);
        setField(term263, term263.getClass(), "last", term241);
        setField(term263, term263.getClass(), "propListHead", null);
        setIntField(term263, term263.getClass(), "sourcePosition", 0);
        setField(term263, term263.getClass(), "jsType", null);
        setField(term263, term263.getClass(), "parent", null);
        setField(term243, term243.getClass(), "first", term263);
        setField(term243, term243.getClass(), "last", term263);
        setField(term243, term243.getClass(), "propListHead", null);
        setIntField(term243, term243.getClass(), "sourcePosition", 0);
        setField(term243, term243.getClass(), "jsType", null);
        setField(term243, term243.getClass(), "parent", null);
        setField(term241, term241.getClass(), "next", term243);
        setField(term241, term241.getClass(), "first", term247);
        setField(term241, term241.getClass(), "last", term249);
        setField(term241, term241.getClass(), "propListHead", null);
        setIntField(term241, term241.getClass(), "sourcePosition", 0);
        setField(term241, term241.getClass(), "jsType", null);
        setField(term241, term241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term241;
        try {
            callMethod(klass, "visit", argTypes, term230, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


