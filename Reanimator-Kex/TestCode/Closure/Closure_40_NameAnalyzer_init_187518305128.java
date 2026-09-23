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
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class NameAnalyzer_init_187518305128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3952;

    public NameAnalyzer_init_187518305128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        HashMap term3955 = new HashMap();
        HashMap term3956 = new HashMap();
        ArrayList term3969 = new ArrayList();
        HashMap term3972 = new HashMap();
        Set<Object> term4010 =  ((Map) term3972).keySet();
        HashSet term3971 = new HashSet((Collection<? extends Object>) term4010);
        ArrayList term3973 = new ArrayList();
        HashMap term3975 = new HashMap();
        term3952 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3953 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3954 = newInstance(Class.forName("com.google.javascript.jscomp.graph.LinkedDirectedGraph"));
        Object term3957 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term3958 = (Object[]) newArray("java.lang.Object", 8);
        Object[] term3963 = (Object[]) newArray("java.lang.Object", 2);
        Object term3968 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3952, term3952.getClass(), "compiler", null);
        setField(term3953, term3953.getClass(), "comparator", null);
        setField(term3953, term3953.getClass(), "root", null);
        setIntField(term3953, term3953.getClass(), "size", 0);
        setIntField(term3953, term3953.getClass(), "modCount", 0);
        setField(term3953, term3953.getClass(), "entrySet", null);
        setField(term3953, term3953.getClass(), "navigableKeySet", null);
        setField(term3953, term3953.getClass(), "descendingMap", null);
        setField(term3953, term3953.getClass(), "keySet", null);
        setField(term3953, term3953.getClass(), "values", null);
        setField(term3952, term3952.getClass(), "allNames", term3953);
        setField(term3954, term3954.getClass(), "nodes", term3955);
        setBooleanField(term3954, term3954.getClass(), "useNodeAnnotations", false);
        setBooleanField(term3954, term3954.getClass(), "useEdgeAnnotations", false);
        setField(term3954, term3954.getClass(), "nodeAnnotationStack", null);
        setField(term3954, term3954.getClass(), "edgeAnnotationStack", null);
        setField(term3952, term3952.getClass(), "referenceGraph", term3954);
        setField(term3952, term3952.getClass(), "scopes", term3956);
        setBooleanField(term3952, term3952.getClass(), "removeUnreferenced", false);
        setElement(term3958, 3, "goog.global");
        setElement(term3958, 4, "window");
        setField(term3957, term3957.getClass(), "table", term3958);
        setIntField(term3957, term3957.getClass(), "mask", 7);
        setElement(term3963, 0, "window");
        setElement(term3963, 1, "goog.global");
        setField(term3957, term3957.getClass(), "elements", term3963);
        setField(term3957, term3957.getClass(), "asList", null);
        setField(term3952, term3952.getClass(), "globalNames", term3957);
        setField(term3968, term3968.getClass(), "listeners", term3969);
        setField(term3952, term3952.getClass(), "changeProxy", term3968);
        setField(term3952, term3952.getClass(), "externalNames", term3971);
        setField(term3952, term3952.getClass(), "refNodes", term3973);
        setField(term3952, term3952.getClass(), "aliases", term3975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3952));
        assertTrue(recursiveEquals(term1, false));
    }

};


