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

public class NameAnalyzer_removeUnreferenced_149374253332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;

    public NameAnalyzer_removeUnreferenced_149374253332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term690 = new HashMap();
        HashMap term704 = new HashMap();
        HashMap term721 = new HashMap();
        Set<Object> term9420 =  ((Map) term721).keySet();
        HashSet term720 = new HashSet((Collection<? extends Object>) term9420);
        ArrayList term730 = new ArrayList();
        HashMap term735 = new HashMap();
        Set<Object> term9421 =  ((Map) term735).keySet();
        HashSet term734 = new HashSet((Collection<? extends Object>) term9421);
        ArrayList term751 = new ArrayList();
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        HashMap term755 = new HashMap();
        term689 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term729 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term689, term689.getClass(), "compiler", null);
        setField(term689, term689.getClass(), "allNames", term690);
        setField(term689, term689.getClass(), "referenceGraph", null);
        setField(term689, term689.getClass(), "scopes", term704);
        setBooleanField(term689, term689.getClass(), "removeUnreferenced", true);
        setField(term689, term689.getClass(), "globalNames", term720);
        setField(term729, term729.getClass(), "listeners", term730);
        setField(term689, term689.getClass(), "changeProxy", term729);
        setField(term689, term689.getClass(), "externalNames", term734);
        setField(term689, term689.getClass(), "refNodes", term751);
        setField(term689, term689.getClass(), "aliases", term755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "removeUnreferenced", argTypes, term689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


