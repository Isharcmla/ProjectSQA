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
import java.lang.Boolean;

public class NameAnalyzer_getName_19843705537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;
     Object term1274;
     Object term11917;
     Object term11847;

    public NameAnalyzer_getName_19843705537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1181 = new HashMap();
        HashMap term1195 = new HashMap();
        HashMap term1212 = new HashMap();
        Set<Object> term11940 =  ((Map) term1212).keySet();
        HashSet term1211 = new HashSet((Collection<? extends Object>) term11940);
        ArrayList term1229 = new ArrayList();
        HashMap term1234 = new HashMap();
        Set<Object> term11941 =  ((Map) term1234).keySet();
        HashSet term1233 = new HashSet((Collection<? extends Object>) term11941);
        ArrayList term1248 = new ArrayList();
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        ((ArrayList) term1248).add((Object)null);
        HashMap term1252 = new HashMap();
        term1180 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1228 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1180, term1180.getClass(), "compiler", null);
        setField(term1180, term1180.getClass(), "allNames", term1181);
        setField(term1180, term1180.getClass(), "referenceGraph", null);
        setField(term1180, term1180.getClass(), "scopes", term1195);
        setBooleanField(term1180, term1180.getClass(), "removeUnreferenced", true);
        setField(term1180, term1180.getClass(), "globalNames", term1211);
        setField(term1228, term1228.getClass(), "listeners", term1229);
        setField(term1180, term1180.getClass(), "changeProxy", term1228);
        setField(term1180, term1180.getClass(), "externalNames", term1233);
        setField(term1180, term1180.getClass(), "refNodes", term1248);
        setField(term1180, term1180.getClass(), "aliases", term1252);
        term1274 = new Boolean(true);
        HashMap term11918 = new HashMap();
        HashMap term11927 = new HashMap();
        HashMap term11929 = new HashMap();
        Set<Object> term11952 =  ((Map) term11929).keySet();
        HashSet term11928 = new HashSet((Collection<? extends Object>) term11952);
        ArrayList term11931 = new ArrayList();
        HashMap term11934 = new HashMap();
        Set<Object> term11953 =  ((Map) term11934).keySet();
        HashSet term11933 = new HashSet((Collection<? extends Object>) term11953);
        ArrayList term11935 = new ArrayList();
        ((ArrayList) term11935).add((Object)null);
        ((ArrayList) term11935).add((Object)null);
        ((ArrayList) term11935).add((Object)null);
        ((ArrayList) term11935).add((Object)null);
        ((ArrayList) term11935).add((Object)null);
        HashMap term11937 = new HashMap();
        term11917 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term11930 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term11917, term11917.getClass(), "compiler", null);
        setField(term11917, term11917.getClass(), "allNames", term11918);
        setField(term11917, term11917.getClass(), "referenceGraph", null);
        setField(term11917, term11917.getClass(), "scopes", term11927);
        setBooleanField(term11917, term11917.getClass(), "removeUnreferenced", true);
        setField(term11917, term11917.getClass(), "globalNames", term11928);
        setField(term11930, term11930.getClass(), "listeners", term11931);
        setField(term11917, term11917.getClass(), "changeProxy", term11930);
        setField(term11917, term11917.getClass(), "externalNames", term11933);
        setField(term11917, term11917.getClass(), "refNodes", term11935);
        setField(term11917, term11917.getClass(), "aliases", term11937);
        ArrayList term11860 = new ArrayList();
        term11847 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer$JsName"));
        setField(term11847, term11847.getClass(), "name", "xBsXSDjXYK");
        setField(term11847, term11847.getClass(), "prototypeNames", term11860);
        setBooleanField(term11847, term11847.getClass(), "externallyDefined", false);
        setBooleanField(term11847, term11847.getClass(), "referenced", false);
        setBooleanField(term11847, term11847.getClass(), "hasWrittenDescendants", false);
        setBooleanField(term11847, term11847.getClass(), "hasInstanceOfReference", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "xBsXSDjXYK";
        args[1] = term1274;
        Object retValue = callMethod(klass, "getName", argTypes, term1180, args);
        assertTrue(recursiveEquals(term1180, term11917));
        assertTrue(recursiveEquals(term1274, true));
        assertTrue(recursiveEquals(retValue, term11847));
    }

};


