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
     Object term2140;

    public NameAnalyzer_calculateReferences_100273655746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2141 = new HashMap();
        HashMap term2157 = new HashMap();
        Set<Object> term10103 =  ((Map) term2157).keySet();
        HashSet term2156 = new HashSet((Collection<? extends Object>) term10103);
        ArrayList term2172 = new ArrayList();
        HashMap term2177 = new HashMap();
        Set<Object> term10104 =  ((Map) term2177).keySet();
        HashSet term2176 = new HashSet((Collection<? extends Object>) term10104);
        ArrayList term2185 = new ArrayList();
        ((ArrayList) term2185).add((Object)null);
        HashMap term2189 = new HashMap();
        term2140 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term2171 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term2140, term2140.getClass(), "compiler", null);
        setField(term2140, term2140.getClass(), "allNames", term2141);
        setField(term2140, term2140.getClass(), "referenceGraph", null);
        setField(term2140, term2140.getClass(), "scopes", null);
        setBooleanField(term2140, term2140.getClass(), "removeUnreferenced", true);
        setField(term2140, term2140.getClass(), "globalNames", term2156);
        setField(term2171, term2171.getClass(), "listeners", term2172);
        setField(term2140, term2140.getClass(), "changeProxy", term2171);
        setField(term2140, term2140.getClass(), "externalNames", term2176);
        setField(term2140, term2140.getClass(), "refNodes", term2185);
        setField(term2140, term2140.getClass(), "aliases", term2189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "calculateReferences", argTypes, term2140, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


