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
     Object term767;
     Object term10598;

    public NameAnalyzer_getHtmlReport_56999163733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term768 = new HashMap();
        HashMap term782 = new HashMap();
        HashMap term799 = new HashMap();
        Set<Object> term10612 =  ((Map) term799).keySet();
        HashSet term798 = new HashSet((Collection<? extends Object>) term10612);
        ArrayList term814 = new ArrayList();
        HashMap term819 = new HashMap();
        Set<Object> term10613 =  ((Map) term819).keySet();
        HashSet term818 = new HashSet((Collection<? extends Object>) term10613);
        ArrayList term829 = new ArrayList();
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        HashMap term833 = new HashMap();
        term767 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term813 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term767, term767.getClass(), "compiler", null);
        setField(term767, term767.getClass(), "allNames", term768);
        setField(term767, term767.getClass(), "referenceGraph", null);
        setField(term767, term767.getClass(), "scopes", term782);
        setBooleanField(term767, term767.getClass(), "removeUnreferenced", false);
        setField(term767, term767.getClass(), "globalNames", term798);
        setField(term813, term813.getClass(), "listeners", term814);
        setField(term767, term767.getClass(), "changeProxy", term813);
        setField(term767, term767.getClass(), "externalNames", term818);
        setField(term767, term767.getClass(), "refNodes", term829);
        setField(term767, term767.getClass(), "aliases", term833);
        HashMap term10599 = new HashMap();
        HashMap term10601 = new HashMap();
        HashMap term10603 = new HashMap();
        Set<Object> term10614 =  ((Map) term10603).keySet();
        HashSet term10602 = new HashSet((Collection<? extends Object>) term10614);
        ArrayList term10605 = new ArrayList();
        HashMap term10608 = new HashMap();
        Set<Object> term10615 =  ((Map) term10608).keySet();
        HashSet term10607 = new HashSet((Collection<? extends Object>) term10615);
        ArrayList term10609 = new ArrayList();
        ((ArrayList) term10609).add((Object)null);
        ((ArrayList) term10609).add((Object)null);
        ((ArrayList) term10609).add((Object)null);
        HashMap term10611 = new HashMap();
        term10598 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term10604 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term10598, term10598.getClass(), "compiler", null);
        setField(term10598, term10598.getClass(), "allNames", term10599);
        setField(term10598, term10598.getClass(), "referenceGraph", null);
        setField(term10598, term10598.getClass(), "scopes", term10601);
        setBooleanField(term10598, term10598.getClass(), "removeUnreferenced", false);
        setField(term10598, term10598.getClass(), "globalNames", term10602);
        setField(term10604, term10604.getClass(), "listeners", term10605);
        setField(term10598, term10598.getClass(), "changeProxy", term10604);
        setField(term10598, term10598.getClass(), "externalNames", term10607);
        setField(term10598, term10598.getClass(), "refNodes", term10609);
        setField(term10598, term10598.getClass(), "aliases", term10611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHtmlReport", argTypes, term767, args);
        assertTrue(recursiveEquals(term767, term10598));
        assertTrue(recursiveEquals(retValue, "<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>"));
    }

};


