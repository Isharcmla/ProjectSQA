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

public class NameAnalyzer_getHtmlReport_56999163733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term6932;

    public NameAnalyzer_getHtmlReport_56999163733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term716 = new HashMap();
        HashMap term732 = new HashMap();
        Set<Object> term6945 =  ((Map) term732).keySet();
        HashSet term731 = new HashSet((Collection<? extends Object>) term6945);
        ArrayList term738 = new ArrayList();
        HashMap term743 = new HashMap();
        Set<Object> term6946 =  ((Map) term743).keySet();
        HashSet term742 = new HashSet((Collection<? extends Object>) term6946);
        ArrayList term753 = new ArrayList();
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        HashMap term757 = new HashMap();
        term715 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term737 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term715, term715.getClass(), "compiler", null);
        setField(term715, term715.getClass(), "allNames", term716);
        setField(term715, term715.getClass(), "referenceGraph", null);
        setField(term715, term715.getClass(), "scopes", null);
        setBooleanField(term715, term715.getClass(), "removeUnreferenced", false);
        setField(term715, term715.getClass(), "globalNames", term731);
        setField(term737, term737.getClass(), "listeners", term738);
        setField(term715, term715.getClass(), "changeProxy", term737);
        setField(term715, term715.getClass(), "externalNames", term742);
        setField(term715, term715.getClass(), "refNodes", term753);
        setField(term715, term715.getClass(), "aliases", term757);
        HashMap term6933 = new HashMap();
        HashMap term6936 = new HashMap();
        Set<Object> term6947 =  ((Map) term6936).keySet();
        HashSet term6935 = new HashSet((Collection<? extends Object>) term6947);
        ArrayList term6938 = new ArrayList();
        HashMap term6941 = new HashMap();
        Set<Object> term6948 =  ((Map) term6941).keySet();
        HashSet term6940 = new HashSet((Collection<? extends Object>) term6948);
        ArrayList term6942 = new ArrayList();
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        ((ArrayList) term6942).add((Object)null);
        HashMap term6944 = new HashMap();
        term6932 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term6937 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term6932, term6932.getClass(), "compiler", null);
        setField(term6932, term6932.getClass(), "allNames", term6933);
        setField(term6932, term6932.getClass(), "referenceGraph", null);
        setField(term6932, term6932.getClass(), "scopes", null);
        setBooleanField(term6932, term6932.getClass(), "removeUnreferenced", false);
        setField(term6932, term6932.getClass(), "globalNames", term6935);
        setField(term6937, term6937.getClass(), "listeners", term6938);
        setField(term6932, term6932.getClass(), "changeProxy", term6937);
        setField(term6932, term6932.getClass(), "externalNames", term6940);
        setField(term6932, term6932.getClass(), "refNodes", term6942);
        setField(term6932, term6932.getClass(), "aliases", term6944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHtmlReport", argTypes, term715, args);
        assertTrue(recursiveEquals(term715, term6932));
        assertTrue(recursiveEquals(retValue, "<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"));
    }

};


