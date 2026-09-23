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
     Object term3587;

    public NameAnalyzer_init_187518305128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        HashMap term3590 = new HashMap();
        HashMap term3592 = new HashMap();
        ArrayList term3605 = new ArrayList();
        HashMap term3608 = new HashMap();
        Set<Object> term3646 =  ((Map) term3608).keySet();
        HashSet term3607 = new HashSet((Collection<? extends Object>) term3646);
        ArrayList term3609 = new ArrayList();
        HashMap term3611 = new HashMap();
        term3587 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term3588 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3589 = newInstance(Class.forName("com.google.javascript.jscomp.graph.LinkedDirectedGraph"));
        Object term3591 = newInstance(Class.forName("com.google.common.collect.LinkedListMultimap"));
        Object term3593 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term3594 = (Object[]) newArray("java.lang.Object", 2);
        Object[] term3599 = (Object[]) newArray("java.lang.Object", 4);
        Object term3604 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term3587, term3587.getClass(), "compiler", null);
        setField(term3588, term3588.getClass(), "comparator", null);
        setField(term3588, term3588.getClass(), "root", null);
        setIntField(term3588, term3588.getClass(), "size", 0);
        setIntField(term3588, term3588.getClass(), "modCount", 0);
        setField(term3588, term3588.getClass(), "entrySet", null);
        setField(term3588, term3588.getClass(), "navigableKeySet", null);
        setField(term3588, term3588.getClass(), "descendingMap", null);
        setField(term3588, term3588.getClass(), "keySet", null);
        setField(term3588, term3588.getClass(), "values", null);
        setField(term3587, term3587.getClass(), "allNames", term3588);
        setField(term3589, term3589.getClass(), "nodes", term3590);
        setBooleanField(term3589, term3589.getClass(), "useNodeAnnotations", false);
        setBooleanField(term3589, term3589.getClass(), "useEdgeAnnotations", false);
        setField(term3589, term3589.getClass(), "nodeAnnotationStack", null);
        setField(term3589, term3589.getClass(), "edgeAnnotationStack", null);
        setField(term3587, term3587.getClass(), "referenceGraph", term3589);
        setField(term3591, term3591.getClass(), "head", null);
        setField(term3591, term3591.getClass(), "tail", null);
        setField(term3591, term3591.getClass(), "keyToKeyList", term3592);
        setIntField(term3591, term3591.getClass(), "size", 0);
        setIntField(term3591, term3591.getClass(), "modCount", 0);
        setField(term3591, term3591.getClass(), "entries", null);
        setField(term3591, term3591.getClass(), "keySet", null);
        setField(term3591, term3591.getClass(), "keys", null);
        setField(term3591, term3591.getClass(), "values", null);
        setField(term3591, term3591.getClass(), "asMap", null);
        setField(term3587, term3587.getClass(), "scopes", term3591);
        setBooleanField(term3587, term3587.getClass(), "removeUnreferenced", false);
        setElement(term3594, 0, "window");
        setElement(term3594, 1, "goog.global");
        setField(term3593, term3593.getClass(), "elements", term3594);
        setElement(term3599, 0, "window");
        setElement(term3599, 1, "goog.global");
        setField(term3593, term3593.getClass(), "table", term3599);
        setIntField(term3593, term3593.getClass(), "mask", 3);
        setField(term3593, term3593.getClass(), "asList", null);
        setField(term3587, term3587.getClass(), "globalNames", term3593);
        setField(term3604, term3604.getClass(), "listeners", term3605);
        setField(term3587, term3587.getClass(), "changeProxy", term3604);
        setField(term3587, term3587.getClass(), "externalNames", term3607);
        setField(term3587, term3587.getClass(), "refNodes", term3609);
        setField(term3587, term3587.getClass(), "aliases", term3611);
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
        assertTrue(recursiveEquals(instance, term3587));
        assertTrue(recursiveEquals(term1, false));
    }

};


