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

public class NameAnalyzer_referenceParentNames_23663436040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;
     Object term8504;

    public NameAnalyzer_referenceParentNames_23663436040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1310 = new HashMap();
        HashMap term1326 = new HashMap();
        Set<Object> term8517 =  ((Map) term1326).keySet();
        HashSet term1325 = new HashSet((Collection<? extends Object>) term8517);
        ArrayList term1347 = new ArrayList();
        HashMap term1352 = new HashMap();
        Set<Object> term8518 =  ((Map) term1352).keySet();
        HashSet term1351 = new HashSet((Collection<? extends Object>) term8518);
        ArrayList term1364 = new ArrayList();
        ((ArrayList) term1364).add((Object)null);
        ((ArrayList) term1364).add((Object)null);
        ((ArrayList) term1364).add((Object)null);
        ((ArrayList) term1364).add((Object)null);
        ((ArrayList) term1364).add((Object)null);
        ((ArrayList) term1364).add((Object)null);
        HashMap term1368 = new HashMap();
        term1309 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1346 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1309, term1309.getClass(), "compiler", null);
        setField(term1309, term1309.getClass(), "allNames", term1310);
        setField(term1309, term1309.getClass(), "referenceGraph", null);
        setField(term1309, term1309.getClass(), "scopes", null);
        setBooleanField(term1309, term1309.getClass(), "removeUnreferenced", false);
        setField(term1309, term1309.getClass(), "globalNames", term1325);
        setField(term1346, term1346.getClass(), "listeners", term1347);
        setField(term1309, term1309.getClass(), "changeProxy", term1346);
        setField(term1309, term1309.getClass(), "externalNames", term1351);
        setField(term1309, term1309.getClass(), "refNodes", term1364);
        setField(term1309, term1309.getClass(), "aliases", term1368);
        HashMap term8505 = new HashMap();
        HashMap term8508 = new HashMap();
        Set<Object> term8519 =  ((Map) term8508).keySet();
        HashSet term8507 = new HashSet((Collection<? extends Object>) term8519);
        ArrayList term8510 = new ArrayList();
        HashMap term8513 = new HashMap();
        Set<Object> term8520 =  ((Map) term8513).keySet();
        HashSet term8512 = new HashSet((Collection<? extends Object>) term8520);
        ArrayList term8514 = new ArrayList();
        ((ArrayList) term8514).add((Object)null);
        ((ArrayList) term8514).add((Object)null);
        ((ArrayList) term8514).add((Object)null);
        ((ArrayList) term8514).add((Object)null);
        ((ArrayList) term8514).add((Object)null);
        ((ArrayList) term8514).add((Object)null);
        HashMap term8516 = new HashMap();
        term8504 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term8509 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term8504, term8504.getClass(), "compiler", null);
        setField(term8504, term8504.getClass(), "allNames", term8505);
        setField(term8504, term8504.getClass(), "referenceGraph", null);
        setField(term8504, term8504.getClass(), "scopes", null);
        setBooleanField(term8504, term8504.getClass(), "removeUnreferenced", false);
        setField(term8504, term8504.getClass(), "globalNames", term8507);
        setField(term8509, term8509.getClass(), "listeners", term8510);
        setField(term8504, term8504.getClass(), "changeProxy", term8509);
        setField(term8504, term8504.getClass(), "externalNames", term8512);
        setField(term8504, term8504.getClass(), "refNodes", term8514);
        setField(term8504, term8504.getClass(), "aliases", term8516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceParentNames", argTypes, term1309, args);
        assertTrue(recursiveEquals(term1309, term8504));
    }

};


