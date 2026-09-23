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
     Object term2201;
     Object enum4;
     Object enum5;
     Object term10160;
     Object enum6;
     Object enum7;

    public NameAnalyzer_countOf_144792635947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2202 = new HashMap();
        HashMap term2218 = new HashMap();
        Set<Object> term10179 =  ((Map) term2218).keySet();
        HashSet term2217 = new HashSet((Collection<? extends Object>) term10179);
        ArrayList term2237 = new ArrayList();
        HashMap term2242 = new HashMap();
        Set<Object> term10180 =  ((Map) term2242).keySet();
        HashSet term2241 = new HashSet((Collection<? extends Object>) term10180);
        ArrayList term2247 = new ArrayList();
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        HashMap term2251 = new HashMap();
        term2201 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2201, term2201.getClass(), "compiler", null);
        setField(term2201, term2201.getClass(), "allNames", term2202);
        setField(term2201, term2201.getClass(), "referenceGraph", null);
        setField(term2201, term2201.getClass(), "scopes", null);
        setBooleanField(term2201, term2201.getClass(), "removeUnreferenced", true);
        setField(term2201, term2201.getClass(), "globalNames", term2217);
        setField(term2236, term2236.getClass(), "listeners", term2237);
        setField(term2201, term2201.getClass(), "changeProxy", term2236);
        setField(term2201, term2201.getClass(), "externalNames", term2241);
        setField(term2201, term2201.getClass(), "refNodes", term2247);
        setField(term2201, term2201.getClass(), "aliases", term2251);
        Class<? extends Object> term10182 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term10181 = ((Class) term10182).getDeclaredField((String) "FALSE");
        ((Field) term10181).setAccessible(true);
        enum4 = ((Field) term10181).get((Object) null);
        Class<? extends Object> term10454 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term10453 = ((Class) term10454).getDeclaredField((String) "BOTH");
        ((Field) term10453).setAccessible(true);
        enum5 = ((Field) term10453).get((Object) null);
        HashMap term10161 = new HashMap();
        HashMap term10164 = new HashMap();
        Set<Object> term10722 =  ((Map) term10164).keySet();
        HashSet term10163 = new HashSet((Collection<? extends Object>) term10722);
        ArrayList term10166 = new ArrayList();
        HashMap term10169 = new HashMap();
        Set<Object> term10723 =  ((Map) term10169).keySet();
        HashSet term10168 = new HashSet((Collection<? extends Object>) term10723);
        ArrayList term10170 = new ArrayList();
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        ((ArrayList) term10170).add((Object)null);
        HashMap term10172 = new HashMap();
        term10160 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term10165 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term10160, term10160.getClass(), "compiler", null);
        setField(term10160, term10160.getClass(), "allNames", term10161);
        setField(term10160, term10160.getClass(), "referenceGraph", null);
        setField(term10160, term10160.getClass(), "scopes", null);
        setBooleanField(term10160, term10160.getClass(), "removeUnreferenced", true);
        setField(term10160, term10160.getClass(), "globalNames", term10163);
        setField(term10165, term10165.getClass(), "listeners", term10166);
        setField(term10160, term10160.getClass(), "changeProxy", term10165);
        setField(term10160, term10160.getClass(), "externalNames", term10168);
        setField(term10160, term10160.getClass(), "refNodes", term10170);
        setField(term10160, term10160.getClass(), "aliases", term10172);
        Class<? extends Object> term10725 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term10724 = ((Class) term10725).getDeclaredField((String) "FALSE");
        ((Field) term10724).setAccessible(true);
        enum6 = ((Field) term10724).get((Object) null);
        Class<? extends Object> term10997 = Class.forName((String) "com.google.javascript.jscomp.NameAnalyzer$TriState");
        Field term10996 = ((Class) term10997).getDeclaredField((String) "BOTH");
        ((Field) term10996).setAccessible(true);
        enum7 = ((Field) term10996).get((Object) null);
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
        Object retValue = callMethod(klass, "countOf", argTypes, term2201, args);
        assertTrue(recursiveEquals(term2201, term10160));
        assertTrue(recursiveEquals(enum4, enum6));
        assertTrue(recursiveEquals(enum5, enum7));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


