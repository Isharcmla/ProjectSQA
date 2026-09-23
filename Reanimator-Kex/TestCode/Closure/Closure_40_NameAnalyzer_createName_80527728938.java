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
     Object term1288;
     Object term12047;

    public NameAnalyzer_createName_80527728938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1289 = new HashMap();
        HashMap term1303 = new HashMap();
        HashMap term1320 = new HashMap();
        Set<Object> term12066 =  ((Map) term1320).keySet();
        HashSet term1319 = new HashSet((Collection<? extends Object>) term12066);
        ArrayList term1333 = new ArrayList();
        HashMap term1338 = new HashMap();
        Set<Object> term12067 =  ((Map) term1338).keySet();
        HashSet term1337 = new HashSet((Collection<? extends Object>) term12067);
        ArrayList term1356 = new ArrayList();
        ((ArrayList) term1356).add((Object)null);
        ((ArrayList) term1356).add((Object)null);
        HashMap term1360 = new HashMap();
        term1288 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1288, term1288.getClass(), "compiler", null);
        setField(term1288, term1288.getClass(), "allNames", term1289);
        setField(term1288, term1288.getClass(), "referenceGraph", null);
        setField(term1288, term1288.getClass(), "scopes", term1303);
        setBooleanField(term1288, term1288.getClass(), "removeUnreferenced", false);
        setField(term1288, term1288.getClass(), "globalNames", term1319);
        setField(term1332, term1332.getClass(), "listeners", term1333);
        setField(term1288, term1288.getClass(), "changeProxy", term1332);
        setField(term1288, term1288.getClass(), "externalNames", term1337);
        setField(term1288, term1288.getClass(), "refNodes", term1356);
        setField(term1288, term1288.getClass(), "aliases", term1360);
        HashMap term12048 = new HashMap();
        HashMap term12053 = new HashMap();
        HashMap term12055 = new HashMap();
        Set<Object> term12078 =  ((Map) term12055).keySet();
        HashSet term12054 = new HashSet((Collection<? extends Object>) term12078);
        ArrayList term12057 = new ArrayList();
        HashMap term12060 = new HashMap();
        Set<Object> term12079 =  ((Map) term12060).keySet();
        HashSet term12059 = new HashSet((Collection<? extends Object>) term12079);
        ArrayList term12061 = new ArrayList();
        ((ArrayList) term12061).add((Object)null);
        ((ArrayList) term12061).add((Object)null);
        HashMap term12063 = new HashMap();
        term12047 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term12056 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term12047, term12047.getClass(), "compiler", null);
        setField(term12047, term12047.getClass(), "allNames", term12048);
        setField(term12047, term12047.getClass(), "referenceGraph", null);
        setField(term12047, term12047.getClass(), "scopes", term12053);
        setBooleanField(term12047, term12047.getClass(), "removeUnreferenced", false);
        setField(term12047, term12047.getClass(), "globalNames", term12054);
        setField(term12056, term12056.getClass(), "listeners", term12057);
        setField(term12047, term12047.getClass(), "changeProxy", term12056);
        setField(term12047, term12047.getClass(), "externalNames", term12059);
        setField(term12047, term12047.getClass(), "refNodes", term12061);
        setField(term12047, term12047.getClass(), "aliases", term12063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "createName", argTypes, term1288, args);
        assertTrue(recursiveEquals(term1288, term12047));
    }

};


