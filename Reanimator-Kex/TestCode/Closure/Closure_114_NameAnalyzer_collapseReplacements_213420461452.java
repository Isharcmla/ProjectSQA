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
     Object term3302;
     Object term3361;
     Object term12678;
     Object term12690;

    public NameAnalyzer_collapseReplacements_213420461452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3303 = new HashMap();
        HashMap term3319 = new HashMap();
        Set<Object> term12691 =  ((Map) term3319).keySet();
        HashSet term3318 = new HashSet((Collection<? extends Object>) term12691);
        ArrayList term3332 = new ArrayList();
        HashMap term3337 = new HashMap();
        Set<Object> term12692 =  ((Map) term3337).keySet();
        HashSet term3336 = new HashSet((Collection<? extends Object>) term12692);
        ArrayList term3347 = new ArrayList();
        ((ArrayList) term3347).add((Object)null);
        ((ArrayList) term3347).add((Object)null);
        ((ArrayList) term3347).add((Object)null);
        ((ArrayList) term3347).add((Object)null);
        HashMap term3351 = new HashMap();
        term3302 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3331 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3302, term3302.getClass(), "compiler", null);
        setField(term3302, term3302.getClass(), "allNames", term3303);
        setField(term3302, term3302.getClass(), "referenceGraph", null);
        setField(term3302, term3302.getClass(), "scopes", null);
        setBooleanField(term3302, term3302.getClass(), "removeUnreferenced", false);
        setField(term3302, term3302.getClass(), "globalNames", term3318);
        setField(term3331, term3331.getClass(), "listeners", term3332);
        setField(term3302, term3302.getClass(), "changeProxy", term3331);
        setField(term3302, term3302.getClass(), "externalNames", term3336);
        setField(term3302, term3302.getClass(), "refNodes", term3347);
        setField(term3302, term3302.getClass(), "aliases", term3351);
        term3361 = new LinkedList();
        HashMap term12679 = new HashMap();
        HashMap term12681 = new HashMap();
        Set<Object> term12693 =  ((Map) term12681).keySet();
        HashSet term12680 = new HashSet((Collection<? extends Object>) term12693);
        ArrayList term12683 = new ArrayList();
        HashMap term12686 = new HashMap();
        Set<Object> term12694 =  ((Map) term12686).keySet();
        HashSet term12685 = new HashSet((Collection<? extends Object>) term12694);
        ArrayList term12687 = new ArrayList();
        ((ArrayList) term12687).add((Object)null);
        ((ArrayList) term12687).add((Object)null);
        ((ArrayList) term12687).add((Object)null);
        ((ArrayList) term12687).add((Object)null);
        HashMap term12689 = new HashMap();
        term12678 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term12682 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term12678, term12678.getClass(), "compiler", null);
        setField(term12678, term12678.getClass(), "allNames", term12679);
        setField(term12678, term12678.getClass(), "referenceGraph", null);
        setField(term12678, term12678.getClass(), "scopes", null);
        setBooleanField(term12678, term12678.getClass(), "removeUnreferenced", false);
        setField(term12678, term12678.getClass(), "globalNames", term12680);
        setField(term12682, term12682.getClass(), "listeners", term12683);
        setField(term12678, term12678.getClass(), "changeProxy", term12682);
        setField(term12678, term12678.getClass(), "externalNames", term12685);
        setField(term12678, term12678.getClass(), "refNodes", term12687);
        setField(term12678, term12678.getClass(), "aliases", term12689);
        term12690 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3361;
        Object retValue = callMethod(klass, "collapseReplacements", argTypes, term3302, args);
        assertTrue(recursiveEquals(term3302, term12678));
        assertTrue(recursiveEquals(term3361, term12690));
        assertTrue(recursiveEquals(retValue, null));
    }

};


