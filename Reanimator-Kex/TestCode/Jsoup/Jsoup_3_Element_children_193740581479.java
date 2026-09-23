package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_children_193740581479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term10308;
     Object term10232;

    public Element_children_193740581479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1214 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1214, term1214.getClass(), "tagName", null);
        setBooleanField(term1214, term1214.getClass(), "isBlock", false);
        setBooleanField(term1214, term1214.getClass(), "canContainBlock", true);
        setBooleanField(term1214, term1214.getClass(), "canContainInline", false);
        setBooleanField(term1214, term1214.getClass(), "optionalClosing", false);
        setBooleanField(term1214, term1214.getClass(), "empty", false);
        setBooleanField(term1214, term1214.getClass(), "preserveWhitespace", true);
        setField(term1214, term1214.getClass(), "ancestors", null);
        Object term1221 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1221, term1221.getClass(), "tagName", null);
        setBooleanField(term1221, term1221.getClass(), "isBlock", false);
        setBooleanField(term1221, term1221.getClass(), "canContainBlock", true);
        setBooleanField(term1221, term1221.getClass(), "canContainInline", true);
        setBooleanField(term1221, term1221.getClass(), "optionalClosing", true);
        setBooleanField(term1221, term1221.getClass(), "empty", true);
        setBooleanField(term1221, term1221.getClass(), "preserveWhitespace", false);
        setField(term1221, term1221.getClass(), "ancestors", null);
        ArrayList term1212 = new ArrayList();
        ((ArrayList) term1212).add(term1214);
        ((ArrayList) term1212).add(term1221);
        ((ArrayList) term1212).add(term1214);
        HashMap term1231 = new HashMap();
        Set<Object> term10334 =  ((Map) term1231).keySet();
        HashSet term1230 = new HashSet((Collection<? extends Object>) term10334);
        ArrayList term1241 = new ArrayList();
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        ((ArrayList) term1241).add((Object)null);
        LinkedHashMap term1246 = new LinkedHashMap();
        term1192 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1245 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1193, term1193.getClass(), "tagName", "DSNsTGYXDF");
        setBooleanField(term1193, term1193.getClass(), "isBlock", false);
        setBooleanField(term1193, term1193.getClass(), "canContainBlock", true);
        setBooleanField(term1193, term1193.getClass(), "canContainInline", true);
        setBooleanField(term1193, term1193.getClass(), "optionalClosing", false);
        setBooleanField(term1193, term1193.getClass(), "empty", false);
        setBooleanField(term1193, term1193.getClass(), "preserveWhitespace", true);
        setField(term1193, term1193.getClass(), "ancestors", term1212);
        setField(term1192, term1192.getClass(), "tag", term1193);
        setField(term1192, term1192.getClass(), "classNames", term1230);
        setField(term1192, term1192.getClass(), "parentNode", null);
        setField(term1192, term1192.getClass(), "childNodes", term1241);
        setField(term1245, term1245.getClass(), "attributes", term1246);
        setField(term1192, term1192.getClass(), "attributes", term1245);
        setField(term1192, term1192.getClass(), "baseUri", "VGizxZnyHX");
        Object term10314 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10314, term10314.getClass(), "tagName", null);
        setBooleanField(term10314, term10314.getClass(), "isBlock", false);
        setBooleanField(term10314, term10314.getClass(), "canContainBlock", true);
        setBooleanField(term10314, term10314.getClass(), "canContainInline", false);
        setBooleanField(term10314, term10314.getClass(), "optionalClosing", false);
        setBooleanField(term10314, term10314.getClass(), "empty", false);
        setBooleanField(term10314, term10314.getClass(), "preserveWhitespace", true);
        setField(term10314, term10314.getClass(), "ancestors", null);
        Object term10315 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term10315, term10315.getClass(), "tagName", null);
        setBooleanField(term10315, term10315.getClass(), "isBlock", false);
        setBooleanField(term10315, term10315.getClass(), "canContainBlock", true);
        setBooleanField(term10315, term10315.getClass(), "canContainInline", true);
        setBooleanField(term10315, term10315.getClass(), "optionalClosing", true);
        setBooleanField(term10315, term10315.getClass(), "empty", true);
        setBooleanField(term10315, term10315.getClass(), "preserveWhitespace", false);
        setField(term10315, term10315.getClass(), "ancestors", null);
        ArrayList term10312 = new ArrayList();
        ((ArrayList) term10312).add(term10314);
        ((ArrayList) term10312).add(term10315);
        ((ArrayList) term10312).add(term10314);
        HashMap term10317 = new HashMap();
        Set<Object> term10355 =  ((Map) term10317).keySet();
        HashSet term10316 = new HashSet((Collection<? extends Object>) term10355);
        ArrayList term10318 = new ArrayList();
        ((ArrayList) term10318).add((Object)null);
        ((ArrayList) term10318).add((Object)null);
        ((ArrayList) term10318).add((Object)null);
        ((ArrayList) term10318).add((Object)null);
        ((ArrayList) term10318).add((Object)null);
        LinkedHashMap term10321 = new LinkedHashMap();
        term10308 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10309 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10309, term10309.getClass(), "tagName", "DSNsTGYXDF");
        setBooleanField(term10309, term10309.getClass(), "isBlock", false);
        setBooleanField(term10309, term10309.getClass(), "canContainBlock", true);
        setBooleanField(term10309, term10309.getClass(), "canContainInline", true);
        setBooleanField(term10309, term10309.getClass(), "optionalClosing", false);
        setBooleanField(term10309, term10309.getClass(), "empty", false);
        setBooleanField(term10309, term10309.getClass(), "preserveWhitespace", true);
        setField(term10309, term10309.getClass(), "ancestors", term10312);
        setField(term10308, term10308.getClass(), "tag", term10309);
        setField(term10308, term10308.getClass(), "classNames", term10316);
        setField(term10308, term10308.getClass(), "parentNode", null);
        setField(term10308, term10308.getClass(), "childNodes", term10318);
        setField(term10320, term10320.getClass(), "attributes", term10321);
        setField(term10308, term10308.getClass(), "attributes", term10320);
        setField(term10308, term10308.getClass(), "baseUri", "VGizxZnyHX");
        ArrayList term10233 = new ArrayList();
        term10232 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term10232, term10232.getClass(), "contents", term10233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1192, args);
        assertTrue(recursiveEquals(term1192, term10308));
        assertTrue(recursiveEquals(retValue, term10232));
    }

};


