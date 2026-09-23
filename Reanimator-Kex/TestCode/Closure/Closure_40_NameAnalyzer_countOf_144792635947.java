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
import java.lang.String;

public class NameAnalyzer_countOf_144792635947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2475;
     Object enum4;
     Object enum5;
     Object term13880;
     Object enum6;
     Object enum7;

    public NameAnalyzer_countOf_144792635947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2476 = new HashMap();
        HashMap term2490 = new HashMap();
        HashMap term2507 = new HashMap();
        Set<Object> term13900 =  ((Map) term2507).keySet();
        HashSet term2506 = new HashSet((Collection<? extends Object>) term13900);
        ArrayList term2522 = new ArrayList();
        HashMap term2527 = new HashMap();
        Set<Object> term13901 =  ((Map) term2527).keySet();
        HashSet term2526 = new HashSet((Collection<? extends Object>) term13901);
        ArrayList term2545 = new ArrayList();
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        ((ArrayList) term2545).add((Object)null);
        HashMap term2549 = new HashMap();
        term2475 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2521 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2475, term2475.getClass(), "compiler", null);
        setField(term2475, term2475.getClass(), "allNames", term2476);
        setField(term2475, term2475.getClass(), "referenceGraph", null);
        setField(term2475, term2475.getClass(), "scopes", term2490);
        setBooleanField(term2475, term2475.getClass(), "removeUnreferenced", true);
        setField(term2475, term2475.getClass(), "globalNames", term2506);
        setField(term2521, term2521.getClass(), "listeners", term2522);
        setField(term2475, term2475.getClass(), "changeProxy", term2521);
        setField(term2475, term2475.getClass(), "externalNames", term2526);
        setField(term2475, term2475.getClass(), "refNodes", term2545);
        setField(term2475, term2475.getClass(), "aliases", term2549);
        Class<? extends Object> term13903 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term13902 = ((Class) term13903).getDeclaredField((String) "FALSE");
        ((Field) term13902).setAccessible(true);
        enum4 = ((Field) term13902).get((Object) null);
        Class<? extends Object> term14175 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term14174 = ((Class) term14175).getDeclaredField((String) "BOTH");
        ((Field) term14174).setAccessible(true);
        enum5 = ((Field) term14174).get((Object) null);
        HashMap term13881 = new HashMap();
        HashMap term13883 = new HashMap();
        HashMap term13885 = new HashMap();
        Set<Object> term14443 =  ((Map) term13885).keySet();
        HashSet term13884 = new HashSet((Collection<? extends Object>) term14443);
        ArrayList term13887 = new ArrayList();
        HashMap term13890 = new HashMap();
        Set<Object> term14444 =  ((Map) term13890).keySet();
        HashSet term13889 = new HashSet((Collection<? extends Object>) term14444);
        ArrayList term13891 = new ArrayList();
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        ((ArrayList) term13891).add((Object)null);
        HashMap term13893 = new HashMap();
        term13880 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term13886 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term13880, term13880.getClass(), "compiler", null);
        setField(term13880, term13880.getClass(), "allNames", term13881);
        setField(term13880, term13880.getClass(), "referenceGraph", null);
        setField(term13880, term13880.getClass(), "scopes", term13883);
        setBooleanField(term13880, term13880.getClass(), "removeUnreferenced", true);
        setField(term13880, term13880.getClass(), "globalNames", term13884);
        setField(term13886, term13886.getClass(), "listeners", term13887);
        setField(term13880, term13880.getClass(), "changeProxy", term13886);
        setField(term13880, term13880.getClass(), "externalNames", term13889);
        setField(term13880, term13880.getClass(), "refNodes", term13891);
        setField(term13880, term13880.getClass(), "aliases", term13893);
        Class<? extends Object> term14446 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term14445 = ((Class) term14446).getDeclaredField((String) "FALSE");
        ((Field) term14445).setAccessible(true);
        enum6 = ((Field) term14445).get((Object) null);
        Class<? extends Object> term14718 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term14717 = ((Class) term14718).getDeclaredField((String) "BOTH");
        ((Field) term14717).setAccessible(true);
        enum7 = ((Field) term14717).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$TriState");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NameAnalyzer$TriState");
        Object[] args = new Object[2];
        args[0] = enum4;
        args[1] = enum5;
        Object retValue = callMethod(klass, "countOf", argTypes, term2475, args);
        assertTrue(recursiveEquals(term2475, term13880));
        assertTrue(recursiveEquals(enum4, enum6));
        assertTrue(recursiveEquals(enum5, enum7));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


