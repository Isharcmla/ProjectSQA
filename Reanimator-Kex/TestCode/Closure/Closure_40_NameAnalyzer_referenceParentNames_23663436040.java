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
     Object term1482;
     Object term12207;

    public NameAnalyzer_referenceParentNames_23663436040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1483 = new HashMap();
        HashMap term1497 = new HashMap();
        HashMap term1514 = new HashMap();
        Set<Object> term12221 =  ((Map) term1514).keySet();
        HashSet term1513 = new HashSet((Collection<? extends Object>) term12221);
        ArrayList term1531 = new ArrayList();
        HashMap term1536 = new HashMap();
        Set<Object> term12222 =  ((Map) term1536).keySet();
        HashSet term1535 = new HashSet((Collection<? extends Object>) term12222);
        ArrayList term1548 = new ArrayList();
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        ((ArrayList) term1548).add((Object)null);
        HashMap term1552 = new HashMap();
        term1482 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1530 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1482, term1482.getClass(), "compiler", null);
        setField(term1482, term1482.getClass(), "allNames", term1483);
        setField(term1482, term1482.getClass(), "referenceGraph", null);
        setField(term1482, term1482.getClass(), "scopes", term1497);
        setBooleanField(term1482, term1482.getClass(), "removeUnreferenced", false);
        setField(term1482, term1482.getClass(), "globalNames", term1513);
        setField(term1530, term1530.getClass(), "listeners", term1531);
        setField(term1482, term1482.getClass(), "changeProxy", term1530);
        setField(term1482, term1482.getClass(), "externalNames", term1535);
        setField(term1482, term1482.getClass(), "refNodes", term1548);
        setField(term1482, term1482.getClass(), "aliases", term1552);
        HashMap term12208 = new HashMap();
        HashMap term12210 = new HashMap();
        HashMap term12212 = new HashMap();
        Set<Object> term12223 =  ((Map) term12212).keySet();
        HashSet term12211 = new HashSet((Collection<? extends Object>) term12223);
        ArrayList term12214 = new ArrayList();
        HashMap term12217 = new HashMap();
        Set<Object> term12224 =  ((Map) term12217).keySet();
        HashSet term12216 = new HashSet((Collection<? extends Object>) term12224);
        ArrayList term12218 = new ArrayList();
        ((ArrayList) term12218).add((Object)null);
        ((ArrayList) term12218).add((Object)null);
        ((ArrayList) term12218).add((Object)null);
        ((ArrayList) term12218).add((Object)null);
        ((ArrayList) term12218).add((Object)null);
        HashMap term12220 = new HashMap();
        term12207 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term12213 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term12207, term12207.getClass(), "compiler", null);
        setField(term12207, term12207.getClass(), "allNames", term12208);
        setField(term12207, term12207.getClass(), "referenceGraph", null);
        setField(term12207, term12207.getClass(), "scopes", term12210);
        setBooleanField(term12207, term12207.getClass(), "removeUnreferenced", false);
        setField(term12207, term12207.getClass(), "globalNames", term12211);
        setField(term12213, term12213.getClass(), "listeners", term12214);
        setField(term12207, term12207.getClass(), "changeProxy", term12213);
        setField(term12207, term12207.getClass(), "externalNames", term12216);
        setField(term12207, term12207.getClass(), "refNodes", term12218);
        setField(term12207, term12207.getClass(), "aliases", term12220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "referenceParentNames", argTypes, term1482, args);
        assertTrue(recursiveEquals(term1482, term12207));
    }

};


