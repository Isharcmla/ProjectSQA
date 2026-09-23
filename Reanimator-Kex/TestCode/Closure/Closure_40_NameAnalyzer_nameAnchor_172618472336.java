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
     Object term1076;
     Object term11752;

    public NameAnalyzer_nameAnchor_172618472336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1077 = new HashMap();
        HashMap term1091 = new HashMap();
        HashMap term1108 = new HashMap();
        Set<Object> term11767 =  ((Map) term1108).keySet();
        HashSet term1107 = new HashSet((Collection<? extends Object>) term11767);
        ArrayList term1117 = new ArrayList();
        HashMap term1122 = new HashMap();
        Set<Object> term11768 =  ((Map) term1122).keySet();
        HashSet term1121 = new HashSet((Collection<? extends Object>) term11768);
        ArrayList term1142 = new ArrayList();
        ((ArrayList) term1142).add((Object)null);
        ((ArrayList) term1142).add((Object)null);
        ((ArrayList) term1142).add((Object)null);
        HashMap term1146 = new HashMap();
        term1076 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1116 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1076, term1076.getClass(), "compiler", null);
        setField(term1076, term1076.getClass(), "allNames", term1077);
        setField(term1076, term1076.getClass(), "referenceGraph", null);
        setField(term1076, term1076.getClass(), "scopes", term1091);
        setBooleanField(term1076, term1076.getClass(), "removeUnreferenced", false);
        setField(term1076, term1076.getClass(), "globalNames", term1107);
        setField(term1116, term1116.getClass(), "listeners", term1117);
        setField(term1076, term1076.getClass(), "changeProxy", term1116);
        setField(term1076, term1076.getClass(), "externalNames", term1121);
        setField(term1076, term1076.getClass(), "refNodes", term1142);
        setField(term1076, term1076.getClass(), "aliases", term1146);
        HashMap term11753 = new HashMap();
        HashMap term11754 = new HashMap();
        HashMap term11756 = new HashMap();
        Set<Object> term11779 =  ((Map) term11756).keySet();
        HashSet term11755 = new HashSet((Collection<? extends Object>) term11779);
        ArrayList term11758 = new ArrayList();
        HashMap term11761 = new HashMap();
        Set<Object> term11780 =  ((Map) term11761).keySet();
        HashSet term11760 = new HashSet((Collection<? extends Object>) term11780);
        ArrayList term11762 = new ArrayList();
        ((ArrayList) term11762).add((Object)null);
        ((ArrayList) term11762).add((Object)null);
        ((ArrayList) term11762).add((Object)null);
        HashMap term11764 = new HashMap();
        term11752 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term11757 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term11752, term11752.getClass(), "compiler", null);
        setField(term11752, term11752.getClass(), "allNames", term11753);
        setField(term11752, term11752.getClass(), "referenceGraph", null);
        setField(term11752, term11752.getClass(), "scopes", term11754);
        setBooleanField(term11752, term11752.getClass(), "removeUnreferenced", false);
        setField(term11752, term11752.getClass(), "globalNames", term11755);
        setField(term11757, term11757.getClass(), "listeners", term11758);
        setField(term11752, term11752.getClass(), "changeProxy", term11757);
        setField(term11752, term11752.getClass(), "externalNames", term11760);
        setField(term11752, term11752.getClass(), "refNodes", term11762);
        setField(term11752, term11752.getClass(), "aliases", term11764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        Object retValue = callMethod(klass, "nameAnchor", argTypes, term1076, args);
        assertTrue(recursiveEquals(term1076, term11752));
        assertTrue(recursiveEquals(retValue, "<a name=\"xOcJIiQQDu\">xOcJIiQQDu</a>"));
    }

};


