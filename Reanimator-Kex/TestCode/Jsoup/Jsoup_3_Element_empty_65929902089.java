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

public class Element_empty_65929902089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2344;
     Object term33321;
     Object term33254;

    public Element_empty_65929902089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2366 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2366, term2366.getClass(), "tagName", null);
        setBooleanField(term2366, term2366.getClass(), "isBlock", true);
        setBooleanField(term2366, term2366.getClass(), "canContainBlock", false);
        setBooleanField(term2366, term2366.getClass(), "canContainInline", true);
        setBooleanField(term2366, term2366.getClass(), "optionalClosing", false);
        setBooleanField(term2366, term2366.getClass(), "empty", false);
        setBooleanField(term2366, term2366.getClass(), "preserveWhitespace", false);
        setField(term2366, term2366.getClass(), "ancestors", null);
        Object term2373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2373, term2373.getClass(), "tagName", null);
        setBooleanField(term2373, term2373.getClass(), "isBlock", false);
        setBooleanField(term2373, term2373.getClass(), "canContainBlock", true);
        setBooleanField(term2373, term2373.getClass(), "canContainInline", false);
        setBooleanField(term2373, term2373.getClass(), "optionalClosing", true);
        setBooleanField(term2373, term2373.getClass(), "empty", true);
        setBooleanField(term2373, term2373.getClass(), "preserveWhitespace", true);
        setField(term2373, term2373.getClass(), "ancestors", null);
        ArrayList term2364 = new ArrayList();
        ((ArrayList) term2364).add(term2366);
        ((ArrayList) term2364).add(term2366);
        ((ArrayList) term2364).add(term2373);
        HashMap term2383 = new HashMap();
        Set<Object> term33347 =  ((Map) term2383).keySet();
        HashSet term2382 = new HashSet((Collection<? extends Object>) term33347);
        ArrayList term2397 = new ArrayList();
        ((ArrayList) term2397).add((Object)null);
        ((ArrayList) term2397).add((Object)null);
        ((ArrayList) term2397).add((Object)null);
        ((ArrayList) term2397).add((Object)null);
        ((ArrayList) term2397).add((Object)null);
        ((ArrayList) term2397).add((Object)null);
        LinkedHashMap term2402 = new LinkedHashMap();
        term2344 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2345 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2401 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2345, term2345.getClass(), "tagName", "aQFUvuaYxd");
        setBooleanField(term2345, term2345.getClass(), "isBlock", true);
        setBooleanField(term2345, term2345.getClass(), "canContainBlock", true);
        setBooleanField(term2345, term2345.getClass(), "canContainInline", false);
        setBooleanField(term2345, term2345.getClass(), "optionalClosing", true);
        setBooleanField(term2345, term2345.getClass(), "empty", true);
        setBooleanField(term2345, term2345.getClass(), "preserveWhitespace", true);
        setField(term2345, term2345.getClass(), "ancestors", term2364);
        setField(term2344, term2344.getClass(), "tag", term2345);
        setField(term2344, term2344.getClass(), "classNames", term2382);
        setField(term2344, term2344.getClass(), "parentNode", null);
        setField(term2344, term2344.getClass(), "childNodes", term2397);
        setField(term2401, term2401.getClass(), "attributes", term2402);
        setField(term2344, term2344.getClass(), "attributes", term2401);
        setField(term2344, term2344.getClass(), "baseUri", "VVNNlAePXF");
        Object term33327 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33327, term33327.getClass(), "tagName", null);
        setBooleanField(term33327, term33327.getClass(), "isBlock", true);
        setBooleanField(term33327, term33327.getClass(), "canContainBlock", false);
        setBooleanField(term33327, term33327.getClass(), "canContainInline", true);
        setBooleanField(term33327, term33327.getClass(), "optionalClosing", false);
        setBooleanField(term33327, term33327.getClass(), "empty", false);
        setBooleanField(term33327, term33327.getClass(), "preserveWhitespace", false);
        setField(term33327, term33327.getClass(), "ancestors", null);
        Object term33328 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33328, term33328.getClass(), "tagName", null);
        setBooleanField(term33328, term33328.getClass(), "isBlock", false);
        setBooleanField(term33328, term33328.getClass(), "canContainBlock", true);
        setBooleanField(term33328, term33328.getClass(), "canContainInline", false);
        setBooleanField(term33328, term33328.getClass(), "optionalClosing", true);
        setBooleanField(term33328, term33328.getClass(), "empty", true);
        setBooleanField(term33328, term33328.getClass(), "preserveWhitespace", true);
        setField(term33328, term33328.getClass(), "ancestors", null);
        ArrayList term33325 = new ArrayList();
        ((ArrayList) term33325).add(term33327);
        ((ArrayList) term33325).add(term33327);
        ((ArrayList) term33325).add(term33328);
        HashMap term33330 = new HashMap();
        Set<Object> term33368 =  ((Map) term33330).keySet();
        HashSet term33329 = new HashSet((Collection<? extends Object>) term33368);
        ArrayList term33331 = new ArrayList();
        LinkedHashMap term33334 = new LinkedHashMap();
        term33321 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term33322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term33333 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term33322, term33322.getClass(), "tagName", "aQFUvuaYxd");
        setBooleanField(term33322, term33322.getClass(), "isBlock", true);
        setBooleanField(term33322, term33322.getClass(), "canContainBlock", true);
        setBooleanField(term33322, term33322.getClass(), "canContainInline", false);
        setBooleanField(term33322, term33322.getClass(), "optionalClosing", true);
        setBooleanField(term33322, term33322.getClass(), "empty", true);
        setBooleanField(term33322, term33322.getClass(), "preserveWhitespace", true);
        setField(term33322, term33322.getClass(), "ancestors", term33325);
        setField(term33321, term33321.getClass(), "tag", term33322);
        setField(term33321, term33321.getClass(), "classNames", term33329);
        setField(term33321, term33321.getClass(), "parentNode", null);
        setField(term33321, term33321.getClass(), "childNodes", term33331);
        setField(term33333, term33333.getClass(), "attributes", term33334);
        setField(term33321, term33321.getClass(), "attributes", term33333);
        setField(term33321, term33321.getClass(), "baseUri", "VVNNlAePXF");
        Object term33276 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33276, term33276.getClass(), "tagName", null);
        setBooleanField(term33276, term33276.getClass(), "isBlock", true);
        setBooleanField(term33276, term33276.getClass(), "canContainBlock", false);
        setBooleanField(term33276, term33276.getClass(), "canContainInline", true);
        setBooleanField(term33276, term33276.getClass(), "optionalClosing", false);
        setBooleanField(term33276, term33276.getClass(), "empty", false);
        setBooleanField(term33276, term33276.getClass(), "preserveWhitespace", false);
        setField(term33276, term33276.getClass(), "ancestors", null);
        Object term33283 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33283, term33283.getClass(), "tagName", null);
        setBooleanField(term33283, term33283.getClass(), "isBlock", false);
        setBooleanField(term33283, term33283.getClass(), "canContainBlock", true);
        setBooleanField(term33283, term33283.getClass(), "canContainInline", false);
        setBooleanField(term33283, term33283.getClass(), "optionalClosing", true);
        setBooleanField(term33283, term33283.getClass(), "empty", true);
        setBooleanField(term33283, term33283.getClass(), "preserveWhitespace", true);
        setField(term33283, term33283.getClass(), "ancestors", null);
        ArrayList term33274 = new ArrayList();
        ((ArrayList) term33274).add(term33276);
        ((ArrayList) term33274).add(term33276);
        ((ArrayList) term33274).add(term33283);
        HashMap term33293 = new HashMap();
        Set<Object> term33389 =  ((Map) term33293).keySet();
        HashSet term33292 = new HashSet((Collection<? extends Object>) term33389);
        ArrayList term33298 = new ArrayList();
        LinkedHashMap term33303 = new LinkedHashMap();
        term33254 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term33255 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term33302 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term33255, term33255.getClass(), "tagName", "aQFUvuaYxd");
        setBooleanField(term33255, term33255.getClass(), "isBlock", true);
        setBooleanField(term33255, term33255.getClass(), "canContainBlock", true);
        setBooleanField(term33255, term33255.getClass(), "canContainInline", false);
        setBooleanField(term33255, term33255.getClass(), "optionalClosing", true);
        setBooleanField(term33255, term33255.getClass(), "empty", true);
        setBooleanField(term33255, term33255.getClass(), "preserveWhitespace", true);
        setField(term33255, term33255.getClass(), "ancestors", term33274);
        setField(term33254, term33254.getClass(), "tag", term33255);
        setField(term33254, term33254.getClass(), "classNames", term33292);
        setField(term33254, term33254.getClass(), "parentNode", null);
        setField(term33254, term33254.getClass(), "childNodes", term33298);
        setField(term33302, term33302.getClass(), "attributes", term33303);
        setField(term33254, term33254.getClass(), "attributes", term33302);
        setField(term33254, term33254.getClass(), "baseUri", "VVNNlAePXF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2344, args);
        assertTrue(recursiveEquals(term2344, term33321));
        assertTrue(recursiveEquals(retValue, term33254));
    }

};


