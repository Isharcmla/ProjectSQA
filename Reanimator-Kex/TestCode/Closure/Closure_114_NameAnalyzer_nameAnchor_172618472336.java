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

public class NameAnalyzer_nameAnchor_172618472336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;
     Object term8073;

    public NameAnalyzer_nameAnchor_172618472336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term978 = new HashMap();
        HashMap term994 = new HashMap();
        Set<Object> term8087 =  ((Map) term994).keySet();
        HashSet term993 = new HashSet((Collection<? extends Object>) term8087);
        ArrayList term1013 = new ArrayList();
        HashMap term1018 = new HashMap();
        Set<Object> term8088 =  ((Map) term1018).keySet();
        HashSet term1017 = new HashSet((Collection<? extends Object>) term8088);
        ArrayList term1028 = new ArrayList();
        ((ArrayList) term1028).add((Object)null);
        ((ArrayList) term1028).add((Object)null);
        ((ArrayList) term1028).add((Object)null);
        ((ArrayList) term1028).add((Object)null);
        ((ArrayList) term1028).add((Object)null);
        ((ArrayList) term1028).add((Object)null);
        HashMap term1032 = new HashMap();
        term977 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1012 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term977, term977.getClass(), "compiler", null);
        setField(term977, term977.getClass(), "allNames", term978);
        setField(term977, term977.getClass(), "referenceGraph", null);
        setField(term977, term977.getClass(), "scopes", null);
        setBooleanField(term977, term977.getClass(), "removeUnreferenced", false);
        setField(term977, term977.getClass(), "globalNames", term993);
        setField(term1012, term1012.getClass(), "listeners", term1013);
        setField(term977, term977.getClass(), "changeProxy", term1012);
        setField(term977, term977.getClass(), "externalNames", term1017);
        setField(term977, term977.getClass(), "refNodes", term1028);
        setField(term977, term977.getClass(), "aliases", term1032);
        HashMap term8074 = new HashMap();
        HashMap term8076 = new HashMap();
        Set<Object> term8099 =  ((Map) term8076).keySet();
        HashSet term8075 = new HashSet((Collection<? extends Object>) term8099);
        ArrayList term8078 = new ArrayList();
        HashMap term8081 = new HashMap();
        Set<Object> term8100 =  ((Map) term8081).keySet();
        HashSet term8080 = new HashSet((Collection<? extends Object>) term8100);
        ArrayList term8082 = new ArrayList();
        ((ArrayList) term8082).add((Object)null);
        ((ArrayList) term8082).add((Object)null);
        ((ArrayList) term8082).add((Object)null);
        ((ArrayList) term8082).add((Object)null);
        ((ArrayList) term8082).add((Object)null);
        ((ArrayList) term8082).add((Object)null);
        HashMap term8084 = new HashMap();
        term8073 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term8077 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term8073, term8073.getClass(), "compiler", null);
        setField(term8073, term8073.getClass(), "allNames", term8074);
        setField(term8073, term8073.getClass(), "referenceGraph", null);
        setField(term8073, term8073.getClass(), "scopes", null);
        setBooleanField(term8073, term8073.getClass(), "removeUnreferenced", false);
        setField(term8073, term8073.getClass(), "globalNames", term8075);
        setField(term8077, term8077.getClass(), "listeners", term8078);
        setField(term8073, term8073.getClass(), "changeProxy", term8077);
        setField(term8073, term8073.getClass(), "externalNames", term8080);
        setField(term8073, term8073.getClass(), "refNodes", term8082);
        setField(term8073, term8073.getClass(), "aliases", term8084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        Object retValue = callMethod(klass, "nameAnchor", argTypes, term977, args);
        assertTrue(recursiveEquals(term977, term8073));
        assertTrue(recursiveEquals(retValue, "<a name=\"dpNsDgfPso\">dpNsDgfPso</a>"));
    }

};


