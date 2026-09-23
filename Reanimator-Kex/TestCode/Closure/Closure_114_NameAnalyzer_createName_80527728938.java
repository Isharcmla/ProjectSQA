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

public class NameAnalyzer_createName_80527728938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;
     Object term8356;

    public NameAnalyzer_createName_80527728938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1154 = new HashMap();
        HashMap term1170 = new HashMap();
        Set<Object> term8374 =  ((Map) term1170).keySet();
        HashSet term1169 = new HashSet((Collection<? extends Object>) term8374);
        ArrayList term1187 = new ArrayList();
        HashMap term1192 = new HashMap();
        Set<Object> term8375 =  ((Map) term1192).keySet();
        HashSet term1191 = new HashSet((Collection<? extends Object>) term8375);
        ArrayList term1200 = new ArrayList();
        HashMap term1204 = new HashMap();
        term1153 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1186 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1153, term1153.getClass(), "compiler", null);
        setField(term1153, term1153.getClass(), "allNames", term1154);
        setField(term1153, term1153.getClass(), "referenceGraph", null);
        setField(term1153, term1153.getClass(), "scopes", null);
        setBooleanField(term1153, term1153.getClass(), "removeUnreferenced", false);
        setField(term1153, term1153.getClass(), "globalNames", term1169);
        setField(term1186, term1186.getClass(), "listeners", term1187);
        setField(term1153, term1153.getClass(), "changeProxy", term1186);
        setField(term1153, term1153.getClass(), "externalNames", term1191);
        setField(term1153, term1153.getClass(), "refNodes", term1200);
        setField(term1153, term1153.getClass(), "aliases", term1204);
        HashMap term8357 = new HashMap();
        HashMap term8363 = new HashMap();
        Set<Object> term8386 =  ((Map) term8363).keySet();
        HashSet term8362 = new HashSet((Collection<? extends Object>) term8386);
        ArrayList term8365 = new ArrayList();
        HashMap term8368 = new HashMap();
        Set<Object> term8387 =  ((Map) term8368).keySet();
        HashSet term8367 = new HashSet((Collection<? extends Object>) term8387);
        ArrayList term8369 = new ArrayList();
        HashMap term8371 = new HashMap();
        term8356 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term8364 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term8356, term8356.getClass(), "compiler", null);
        setField(term8356, term8356.getClass(), "allNames", term8357);
        setField(term8356, term8356.getClass(), "referenceGraph", null);
        setField(term8356, term8356.getClass(), "scopes", null);
        setBooleanField(term8356, term8356.getClass(), "removeUnreferenced", false);
        setField(term8356, term8356.getClass(), "globalNames", term8362);
        setField(term8364, term8364.getClass(), "listeners", term8365);
        setField(term8356, term8356.getClass(), "changeProxy", term8364);
        setField(term8356, term8356.getClass(), "externalNames", term8367);
        setField(term8356, term8356.getClass(), "refNodes", term8369);
        setField(term8356, term8356.getClass(), "aliases", term8371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        callMethod(klass, "createName", argTypes, term1153, args);
        assertTrue(recursiveEquals(term1153, term8356));
    }

};


