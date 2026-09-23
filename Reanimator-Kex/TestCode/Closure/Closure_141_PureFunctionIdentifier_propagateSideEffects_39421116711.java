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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class PureFunctionIdentifier_propagateSideEffects_39421116711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term1267;

    public PureFunctionIdentifier_propagateSideEffects_39421116711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term165 = new HashMap();
        Object term185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185, term185.getClass(), "type", 0);
        setField(term185, term185.getClass(), "next", null);
        setField(term185, term185.getClass(), "first", null);
        setField(term185, term185.getClass(), "last", null);
        setField(term185, term185.getClass(), "propListHead", null);
        setIntField(term185, term185.getClass(), "sourcePosition", 0);
        setField(term185, term185.getClass(), "jsType", null);
        setField(term185, term185.getClass(), "parent", null);
        Object term188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term188, term188.getClass(), "type", 0);
        setField(term188, term188.getClass(), "next", null);
        setField(term188, term188.getClass(), "first", null);
        setField(term188, term188.getClass(), "last", null);
        setField(term188, term188.getClass(), "propListHead", null);
        setIntField(term188, term188.getClass(), "sourcePosition", 0);
        setField(term188, term188.getClass(), "jsType", null);
        setField(term188, term188.getClass(), "parent", null);
        Object term191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term191, term191.getClass(), "type", 0);
        setField(term191, term191.getClass(), "next", null);
        setField(term191, term191.getClass(), "first", null);
        setField(term191, term191.getClass(), "last", null);
        setField(term191, term191.getClass(), "propListHead", null);
        setIntField(term191, term191.getClass(), "sourcePosition", 0);
        setField(term191, term191.getClass(), "jsType", null);
        setField(term191, term191.getClass(), "parent", null);
        ArrayList term183 = new ArrayList();
        ((ArrayList) term183).add(term185);
        ((ArrayList) term183).add(term188);
        ((ArrayList) term183).add(term191);
        term164 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term164, term164.getClass(), "compiler", null);
        setField(term164, term164.getClass(), "definitionProvider", null);
        setField(term164, term164.getClass(), "functionSideEffectMap", term165);
        setField(term164, term164.getClass(), "allFunctionCalls", term183);
        setIntField(term196, term196.getClass(), "type", 0);
        setField(term196, term196.getClass(), "next", null);
        setField(term196, term196.getClass(), "first", null);
        setField(term196, term196.getClass(), "last", null);
        setField(term196, term196.getClass(), "propListHead", null);
        setIntField(term196, term196.getClass(), "sourcePosition", 0);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
        setField(term164, term164.getClass(), "externs", term196);
        setIntField(term199, term199.getClass(), "type", 0);
        setField(term199, term199.getClass(), "next", null);
        setField(term199, term199.getClass(), "first", null);
        setField(term199, term199.getClass(), "last", null);
        setField(term199, term199.getClass(), "propListHead", null);
        setIntField(term199, term199.getClass(), "sourcePosition", 0);
        setField(term199, term199.getClass(), "jsType", null);
        setField(term199, term199.getClass(), "parent", null);
        setField(term164, term164.getClass(), "root", term199);
        HashMap term1268 = new HashMap();
        Object term1272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1272, term1272.getClass(), "type", 0);
        setField(term1272, term1272.getClass(), "next", null);
        setField(term1272, term1272.getClass(), "first", null);
        setField(term1272, term1272.getClass(), "last", null);
        setField(term1272, term1272.getClass(), "propListHead", null);
        setIntField(term1272, term1272.getClass(), "sourcePosition", 0);
        setField(term1272, term1272.getClass(), "jsType", null);
        setField(term1272, term1272.getClass(), "parent", null);
        Object term1273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1273, term1273.getClass(), "type", 0);
        setField(term1273, term1273.getClass(), "next", null);
        setField(term1273, term1273.getClass(), "first", null);
        setField(term1273, term1273.getClass(), "last", null);
        setField(term1273, term1273.getClass(), "propListHead", null);
        setIntField(term1273, term1273.getClass(), "sourcePosition", 0);
        setField(term1273, term1273.getClass(), "jsType", null);
        setField(term1273, term1273.getClass(), "parent", null);
        Object term1274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1274, term1274.getClass(), "type", 0);
        setField(term1274, term1274.getClass(), "next", null);
        setField(term1274, term1274.getClass(), "first", null);
        setField(term1274, term1274.getClass(), "last", null);
        setField(term1274, term1274.getClass(), "propListHead", null);
        setIntField(term1274, term1274.getClass(), "sourcePosition", 0);
        setField(term1274, term1274.getClass(), "jsType", null);
        setField(term1274, term1274.getClass(), "parent", null);
        ArrayList term1270 = new ArrayList();
        ((ArrayList) term1270).add(term1272);
        ((ArrayList) term1270).add(term1273);
        ((ArrayList) term1270).add(term1274);
        term1267 = newInstance(Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier"));
        Object term1275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1267, term1267.getClass(), "compiler", null);
        setField(term1267, term1267.getClass(), "definitionProvider", null);
        setField(term1267, term1267.getClass(), "functionSideEffectMap", term1268);
        setField(term1267, term1267.getClass(), "allFunctionCalls", term1270);
        setIntField(term1275, term1275.getClass(), "type", 0);
        setField(term1275, term1275.getClass(), "next", null);
        setField(term1275, term1275.getClass(), "first", null);
        setField(term1275, term1275.getClass(), "last", null);
        setField(term1275, term1275.getClass(), "propListHead", null);
        setIntField(term1275, term1275.getClass(), "sourcePosition", 0);
        setField(term1275, term1275.getClass(), "jsType", null);
        setField(term1275, term1275.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "externs", term1275);
        setIntField(term1276, term1276.getClass(), "type", 0);
        setField(term1276, term1276.getClass(), "next", null);
        setField(term1276, term1276.getClass(), "first", null);
        setField(term1276, term1276.getClass(), "last", null);
        setField(term1276, term1276.getClass(), "propListHead", null);
        setIntField(term1276, term1276.getClass(), "sourcePosition", 0);
        setField(term1276, term1276.getClass(), "jsType", null);
        setField(term1276, term1276.getClass(), "parent", null);
        setField(term1267, term1267.getClass(), "root", term1276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "propagateSideEffects", argTypes, term164, args);
        assertTrue(recursiveEquals(term164, term1267));
    }

};


