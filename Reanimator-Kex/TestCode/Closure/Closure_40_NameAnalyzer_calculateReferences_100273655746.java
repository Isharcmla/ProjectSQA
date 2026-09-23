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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_calculateReferences_100273655746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2391;

    public NameAnalyzer_calculateReferences_100273655746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2392 = new HashMap();
        HashMap term2406 = new HashMap();
        HashMap term2423 = new HashMap();
        Set<Object> term13818 =  ((Map) term2423).keySet();
        HashSet term2422 = new HashSet((Collection<? extends Object>) term13818);
        ArrayList term2434 = new ArrayList();
        HashMap term2439 = new HashMap();
        Set<Object> term13819 =  ((Map) term2439).keySet();
        HashSet term2438 = new HashSet((Collection<? extends Object>) term13819);
        ArrayList term2459 = new ArrayList();
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        ((ArrayList) term2459).add((Object)null);
        HashMap term2463 = new HashMap();
        term2391 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2433 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2391, term2391.getClass(), "compiler", null);
        setField(term2391, term2391.getClass(), "allNames", term2392);
        setField(term2391, term2391.getClass(), "referenceGraph", null);
        setField(term2391, term2391.getClass(), "scopes", term2406);
        setBooleanField(term2391, term2391.getClass(), "removeUnreferenced", true);
        setField(term2391, term2391.getClass(), "globalNames", term2422);
        setField(term2433, term2433.getClass(), "listeners", term2434);
        setField(term2391, term2391.getClass(), "changeProxy", term2433);
        setField(term2391, term2391.getClass(), "externalNames", term2438);
        setField(term2391, term2391.getClass(), "refNodes", term2459);
        setField(term2391, term2391.getClass(), "aliases", term2463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "calculateReferences", argTypes, term2391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


