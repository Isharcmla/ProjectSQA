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
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_referenceAliases_160787909639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1394;
     Object term12130;

    public NameAnalyzer_referenceAliases_160787909639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1395 = new HashMap();
        HashMap term1409 = new HashMap();
        HashMap term1426 = new HashMap();
        Set<Object> term12144 =  ((Map) term1426).keySet();
        HashSet term1425 = new HashSet((Collection<? extends Object>) term12144);
        ArrayList term1443 = new ArrayList();
        HashMap term1448 = new HashMap();
        Set<Object> term12145 =  ((Map) term1448).keySet();
        HashSet term1447 = new HashSet((Collection<? extends Object>) term12145);
        ArrayList term1466 = new ArrayList();
        ((ArrayList) term1466).add((Object)null);
        ((ArrayList) term1466).add((Object)null);
        HashMap term1470 = new HashMap();
        term1394 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1442 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1394, term1394.getClass(), "compiler", null);
        setField(term1394, term1394.getClass(), "allNames", term1395);
        setField(term1394, term1394.getClass(), "referenceGraph", null);
        setField(term1394, term1394.getClass(), "scopes", term1409);
        setBooleanField(term1394, term1394.getClass(), "removeUnreferenced", false);
        setField(term1394, term1394.getClass(), "globalNames", term1425);
        setField(term1442, term1442.getClass(), "listeners", term1443);
        setField(term1394, term1394.getClass(), "changeProxy", term1442);
        setField(term1394, term1394.getClass(), "externalNames", term1447);
        setField(term1394, term1394.getClass(), "refNodes", term1466);
        setField(term1394, term1394.getClass(), "aliases", term1470);
        HashMap term12131 = new HashMap();
        HashMap term12132 = new HashMap();
        HashMap term12134 = new HashMap();
        Set<Object> term12146 =  ((Map) term12134).keySet();
        HashSet term12133 = new HashSet((Collection<? extends Object>) term12146);
        ArrayList term12136 = new ArrayList();
        HashMap term12139 = new HashMap();
        Set<Object> term12147 =  ((Map) term12139).keySet();
        HashSet term12138 = new HashSet((Collection<? extends Object>) term12147);
        ArrayList term12140 = new ArrayList();
        ((ArrayList) term12140).add((Object)null);
        ((ArrayList) term12140).add((Object)null);
        HashMap term12142 = new HashMap();
        term12130 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term12135 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term12130, term12130.getClass(), "compiler", null);
        setField(term12130, term12130.getClass(), "allNames", term12131);
        setField(term12130, term12130.getClass(), "referenceGraph", null);
        setField(term12130, term12130.getClass(), "scopes", term12132);
        setBooleanField(term12130, term12130.getClass(), "removeUnreferenced", false);
        setField(term12130, term12130.getClass(), "globalNames", term12133);
        setField(term12135, term12135.getClass(), "listeners", term12136);
        setField(term12130, term12130.getClass(), "changeProxy", term12135);
        setField(term12130, term12130.getClass(), "externalNames", term12138);
        setField(term12130, term12130.getClass(), "refNodes", term12140);
        setField(term12130, term12130.getClass(), "aliases", term12142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceAliases", argTypes, term1394, args);
        assertTrue(recursiveEquals(term1394, term12130));
    }

};


