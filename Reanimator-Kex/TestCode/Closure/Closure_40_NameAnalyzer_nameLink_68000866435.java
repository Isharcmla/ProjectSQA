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

public class NameAnalyzer_nameLink_68000866435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term970;
     Object term11590;

    public NameAnalyzer_nameLink_68000866435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term971 = new HashMap();
        HashMap term985 = new HashMap();
        HashMap term1002 = new HashMap();
        Set<Object> term11605 =  ((Map) term1002).keySet();
        HashSet term1001 = new HashSet((Collection<? extends Object>) term11605);
        ArrayList term1021 = new ArrayList();
        HashMap term1026 = new HashMap();
        Set<Object> term11606 =  ((Map) term1026).keySet();
        HashSet term1025 = new HashSet((Collection<? extends Object>) term11606);
        ArrayList term1038 = new ArrayList();
        ((ArrayList) term1038).add((Object)null);
        ((ArrayList) term1038).add((Object)null);
        HashMap term1042 = new HashMap();
        term970 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1020 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term970, term970.getClass(), "compiler", null);
        setField(term970, term970.getClass(), "allNames", term971);
        setField(term970, term970.getClass(), "referenceGraph", null);
        setField(term970, term970.getClass(), "scopes", term985);
        setBooleanField(term970, term970.getClass(), "removeUnreferenced", true);
        setField(term970, term970.getClass(), "globalNames", term1001);
        setField(term1020, term1020.getClass(), "listeners", term1021);
        setField(term970, term970.getClass(), "changeProxy", term1020);
        setField(term970, term970.getClass(), "externalNames", term1025);
        setField(term970, term970.getClass(), "refNodes", term1038);
        setField(term970, term970.getClass(), "aliases", term1042);
        HashMap term11591 = new HashMap();
        HashMap term11592 = new HashMap();
        HashMap term11594 = new HashMap();
        Set<Object> term11617 =  ((Map) term11594).keySet();
        HashSet term11593 = new HashSet((Collection<? extends Object>) term11617);
        ArrayList term11596 = new ArrayList();
        HashMap term11599 = new HashMap();
        Set<Object> term11618 =  ((Map) term11599).keySet();
        HashSet term11598 = new HashSet((Collection<? extends Object>) term11618);
        ArrayList term11600 = new ArrayList();
        ((ArrayList) term11600).add((Object)null);
        ((ArrayList) term11600).add((Object)null);
        HashMap term11602 = new HashMap();
        term11590 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term11595 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term11590, term11590.getClass(), "compiler", null);
        setField(term11590, term11590.getClass(), "allNames", term11591);
        setField(term11590, term11590.getClass(), "referenceGraph", null);
        setField(term11590, term11590.getClass(), "scopes", term11592);
        setBooleanField(term11590, term11590.getClass(), "removeUnreferenced", true);
        setField(term11590, term11590.getClass(), "globalNames", term11593);
        setField(term11595, term11595.getClass(), "listeners", term11596);
        setField(term11590, term11590.getClass(), "changeProxy", term11595);
        setField(term11590, term11590.getClass(), "externalNames", term11598);
        setField(term11590, term11590.getClass(), "refNodes", term11600);
        setField(term11590, term11590.getClass(), "aliases", term11602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vQVyKLdtaz";
        Object retValue = callMethod(klass, "nameLink", argTypes, term970, args);
        assertTrue(recursiveEquals(term970, term11590));
        assertTrue(recursiveEquals(retValue, "<a href=\"#vQVyKLdtaz\">vQVyKLdtaz</a>"));
    }

};


