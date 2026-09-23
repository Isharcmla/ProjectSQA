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
import java.util.LinkedList;

public class NameAnalyzer_collapseReplacements_213420461452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3639;
     Object term3707;
     Object term16458;
     Object term16471;

    public NameAnalyzer_collapseReplacements_213420461452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3640 = new HashMap();
        HashMap term3654 = new HashMap();
        HashMap term3671 = new HashMap();
        Set<Object> term16472 =  ((Map) term3671).keySet();
        HashSet term3670 = new HashSet((Collection<? extends Object>) term16472);
        ArrayList term3680 = new ArrayList();
        HashMap term3685 = new HashMap();
        Set<Object> term16473 =  ((Map) term3685).keySet();
        HashSet term3684 = new HashSet((Collection<? extends Object>) term16473);
        ArrayList term3693 = new ArrayList();
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        ((ArrayList) term3693).add((Object)null);
        HashMap term3697 = new HashMap();
        term3639 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3679 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3639, term3639.getClass(), "compiler", null);
        setField(term3639, term3639.getClass(), "allNames", term3640);
        setField(term3639, term3639.getClass(), "referenceGraph", null);
        setField(term3639, term3639.getClass(), "scopes", term3654);
        setBooleanField(term3639, term3639.getClass(), "removeUnreferenced", false);
        setField(term3639, term3639.getClass(), "globalNames", term3670);
        setField(term3679, term3679.getClass(), "listeners", term3680);
        setField(term3639, term3639.getClass(), "changeProxy", term3679);
        setField(term3639, term3639.getClass(), "externalNames", term3684);
        setField(term3639, term3639.getClass(), "refNodes", term3693);
        setField(term3639, term3639.getClass(), "aliases", term3697);
        term3707 = new LinkedList();
        HashMap term16459 = new HashMap();
        HashMap term16460 = new HashMap();
        HashMap term16462 = new HashMap();
        Set<Object> term16474 =  ((Map) term16462).keySet();
        HashSet term16461 = new HashSet((Collection<? extends Object>) term16474);
        ArrayList term16464 = new ArrayList();
        HashMap term16467 = new HashMap();
        Set<Object> term16475 =  ((Map) term16467).keySet();
        HashSet term16466 = new HashSet((Collection<? extends Object>) term16475);
        ArrayList term16468 = new ArrayList();
        ((ArrayList) term16468).add((Object)null);
        ((ArrayList) term16468).add((Object)null);
        ((ArrayList) term16468).add((Object)null);
        ((ArrayList) term16468).add((Object)null);
        ((ArrayList) term16468).add((Object)null);
        ((ArrayList) term16468).add((Object)null);
        HashMap term16470 = new HashMap();
        term16458 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term16463 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term16458, term16458.getClass(), "compiler", null);
        setField(term16458, term16458.getClass(), "allNames", term16459);
        setField(term16458, term16458.getClass(), "referenceGraph", null);
        setField(term16458, term16458.getClass(), "scopes", term16460);
        setBooleanField(term16458, term16458.getClass(), "removeUnreferenced", false);
        setField(term16458, term16458.getClass(), "globalNames", term16461);
        setField(term16463, term16463.getClass(), "listeners", term16464);
        setField(term16458, term16458.getClass(), "changeProxy", term16463);
        setField(term16458, term16458.getClass(), "externalNames", term16466);
        setField(term16458, term16458.getClass(), "refNodes", term16468);
        setField(term16458, term16458.getClass(), "aliases", term16470);
        term16471 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3707;
        Object retValue = callMethod(klass, "collapseReplacements", argTypes, term3639, args);
        assertTrue(recursiveEquals(term3639, term16458));
        assertTrue(recursiveEquals(term3707, term16471));
        assertTrue(recursiveEquals(retValue, null));
    }

};


