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
     Object term1238;
     Object term8433;

    public NameAnalyzer_referenceAliases_160787909639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1239 = new HashMap();
        HashMap term1255 = new HashMap();
        Set<Object> term8446 =  ((Map) term1255).keySet();
        HashSet term1254 = new HashSet((Collection<? extends Object>) term8446);
        ArrayList term1270 = new ArrayList();
        HashMap term1275 = new HashMap();
        Set<Object> term8447 =  ((Map) term1275).keySet();
        HashSet term1274 = new HashSet((Collection<? extends Object>) term8447);
        ArrayList term1293 = new ArrayList();
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        ((ArrayList) term1293).add((Object)null);
        HashMap term1297 = new HashMap();
        term1238 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1269 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1238, term1238.getClass(), "compiler", null);
        setField(term1238, term1238.getClass(), "allNames", term1239);
        setField(term1238, term1238.getClass(), "referenceGraph", null);
        setField(term1238, term1238.getClass(), "scopes", null);
        setBooleanField(term1238, term1238.getClass(), "removeUnreferenced", false);
        setField(term1238, term1238.getClass(), "globalNames", term1254);
        setField(term1269, term1269.getClass(), "listeners", term1270);
        setField(term1238, term1238.getClass(), "changeProxy", term1269);
        setField(term1238, term1238.getClass(), "externalNames", term1274);
        setField(term1238, term1238.getClass(), "refNodes", term1293);
        setField(term1238, term1238.getClass(), "aliases", term1297);
        HashMap term8434 = new HashMap();
        HashMap term8436 = new HashMap();
        Set<Object> term8448 =  ((Map) term8436).keySet();
        HashSet term8435 = new HashSet((Collection<? extends Object>) term8448);
        ArrayList term8438 = new ArrayList();
        HashMap term8441 = new HashMap();
        Set<Object> term8449 =  ((Map) term8441).keySet();
        HashSet term8440 = new HashSet((Collection<? extends Object>) term8449);
        ArrayList term8442 = new ArrayList();
        ((ArrayList) term8442).add((Object)null);
        ((ArrayList) term8442).add((Object)null);
        ((ArrayList) term8442).add((Object)null);
        ((ArrayList) term8442).add((Object)null);
        ((ArrayList) term8442).add((Object)null);
        ((ArrayList) term8442).add((Object)null);
        HashMap term8444 = new HashMap();
        term8433 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term8437 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term8433, term8433.getClass(), "compiler", null);
        setField(term8433, term8433.getClass(), "allNames", term8434);
        setField(term8433, term8433.getClass(), "referenceGraph", null);
        setField(term8433, term8433.getClass(), "scopes", null);
        setBooleanField(term8433, term8433.getClass(), "removeUnreferenced", false);
        setField(term8433, term8433.getClass(), "globalNames", term8435);
        setField(term8437, term8437.getClass(), "listeners", term8438);
        setField(term8433, term8433.getClass(), "changeProxy", term8437);
        setField(term8433, term8433.getClass(), "externalNames", term8440);
        setField(term8433, term8433.getClass(), "refNodes", term8442);
        setField(term8433, term8433.getClass(), "aliases", term8444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceAliases", argTypes, term1238, args);
        assertTrue(recursiveEquals(term1238, term8433));
    }

};


