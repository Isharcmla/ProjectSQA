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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_isDirectCallNodeReplacementPossible_98814007932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1361;
     Object term1374;

    public FunctionInjector_isDirectCallNodeReplacementPossible_98814007932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1364 = new HashMap();
        Set<Object> term5923 =  ((Map) term1364).keySet();
        HashSet term1363 = new HashSet((Collection<? extends Object>) term5923);
        term1361 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1361, term1361.getClass(), "compiler", null);
        setField(term1361, term1361.getClass(), "safeNameIdSupplier", null);
        setBooleanField(term1361, term1361.getClass(), "allowDecomposition", true);
        setField(term1361, term1361.getClass(), "knownConstants", term1363);
        setBooleanField(term1361, term1361.getClass(), "assumeStrictThis", true);
        setBooleanField(term1361, term1361.getClass(), "assumeMinimumCapture", false);
        term1374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1380 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1382 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1385 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1374, term1374.getClass(), "type", 1107176718);
        setIntField(term1376, term1376.getClass(), "type", 480137250);
        setIntField(term1378, term1378.getClass(), "type", -341152642);
        setIntField(term1380, term1380.getClass(), "type", -2015854073);
        setIntField(term1382, term1382.getClass(), "type", 538259104);
        setField(term1382, term1382.getClass(), "next", null);
        setField(term1382, term1382.getClass(), "first", null);
        setField(term1382, term1382.getClass(), "last", null);
        setField(term1382, term1382.getClass(), "propListHead", null);
        setIntField(term1382, term1382.getClass(), "sourcePosition", 0);
        setField(term1382, term1382.getClass(), "jsType", null);
        setField(term1382, term1382.getClass(), "parent", null);
        setField(term1380, term1380.getClass(), "next", term1382);
        setIntField(term1385, term1385.getClass(), "type", 96566506);
        setField(term1385, term1385.getClass(), "next", null);
        setField(term1385, term1385.getClass(), "first", null);
        setField(term1385, term1385.getClass(), "last", term1382);
        setField(term1385, term1385.getClass(), "propListHead", null);
        setIntField(term1385, term1385.getClass(), "sourcePosition", 0);
        setField(term1385, term1385.getClass(), "jsType", null);
        setField(term1385, term1385.getClass(), "parent", null);
        setField(term1380, term1380.getClass(), "first", term1385);
        setField(term1380, term1380.getClass(), "last", term1378);
        setField(term1380, term1380.getClass(), "propListHead", null);
        setIntField(term1380, term1380.getClass(), "sourcePosition", 0);
        setField(term1380, term1380.getClass(), "jsType", null);
        setField(term1380, term1380.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "next", term1380);
        setField(term1378, term1378.getClass(), "first", term1382);
        setIntField(term1389, term1389.getClass(), "type", 107945604);
        setIntField(term1391, term1391.getClass(), "type", -1963464809);
        setField(term1391, term1391.getClass(), "next", null);
        setField(term1391, term1391.getClass(), "first", term1385);
        setField(term1391, term1391.getClass(), "last", term1380);
        setField(term1391, term1391.getClass(), "propListHead", null);
        setIntField(term1391, term1391.getClass(), "sourcePosition", 0);
        setField(term1391, term1391.getClass(), "jsType", null);
        setField(term1391, term1391.getClass(), "parent", null);
        setField(term1389, term1389.getClass(), "next", term1391);
        setField(term1389, term1389.getClass(), "first", term1376);
        setField(term1389, term1389.getClass(), "last", term1376);
        setField(term1389, term1389.getClass(), "propListHead", null);
        setIntField(term1389, term1389.getClass(), "sourcePosition", 0);
        setField(term1389, term1389.getClass(), "jsType", null);
        setField(term1389, term1389.getClass(), "parent", null);
        setField(term1378, term1378.getClass(), "last", term1389);
        setField(term1378, term1378.getClass(), "propListHead", null);
        setIntField(term1378, term1378.getClass(), "sourcePosition", 0);
        setField(term1378, term1378.getClass(), "jsType", null);
        setField(term1378, term1378.getClass(), "parent", null);
        setField(term1376, term1376.getClass(), "next", term1378);
        setIntField(term1396, term1396.getClass(), "type", 71190297);
        setField(term1396, term1396.getClass(), "next", term1389);
        setField(term1396, term1396.getClass(), "first", term1391);
        setField(term1396, term1396.getClass(), "last", term1374);
        setField(term1396, term1396.getClass(), "propListHead", null);
        setIntField(term1396, term1396.getClass(), "sourcePosition", 0);
        setField(term1396, term1396.getClass(), "jsType", null);
        setField(term1396, term1396.getClass(), "parent", null);
        setField(term1376, term1376.getClass(), "first", term1396);
        setField(term1376, term1376.getClass(), "last", term1396);
        setField(term1376, term1376.getClass(), "propListHead", null);
        setIntField(term1376, term1376.getClass(), "sourcePosition", 0);
        setField(term1376, term1376.getClass(), "jsType", null);
        setField(term1376, term1376.getClass(), "parent", null);
        setField(term1374, term1374.getClass(), "next", term1376);
        setField(term1374, term1374.getClass(), "first", term1380);
        setField(term1374, term1374.getClass(), "last", term1382);
        setField(term1374, term1374.getClass(), "propListHead", null);
        setIntField(term1374, term1374.getClass(), "sourcePosition", 0);
        setField(term1374, term1374.getClass(), "jsType", null);
        setField(term1374, term1374.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1374;
        try {
            callMethod(klass, "isDirectCallNodeReplacementPossible", argTypes, term1361, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


