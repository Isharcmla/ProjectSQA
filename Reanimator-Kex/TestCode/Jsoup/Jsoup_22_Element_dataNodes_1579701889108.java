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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_dataNodes_1579701889108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319;
     Object term20526;
     Object term20470;

    public Element_dataNodes_1579701889108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1341 = new HashMap();
        Set<Object> term20548 =  ((Map) term1341).keySet();
        HashSet term1340 = new HashSet((Collection<? extends Object>) term20548);
        ArrayList term1359 = new ArrayList();
        ((ArrayList) term1359).add((Object)null);
        ((ArrayList) term1359).add((Object)null);
        LinkedHashMap term1364 = new LinkedHashMap();
        term1319 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1320 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1363 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1320, term1320.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term1320, term1320.getClass(), "isBlock", true);
        setBooleanField(term1320, term1320.getClass(), "formatAsBlock", false);
        setBooleanField(term1320, term1320.getClass(), "canContainBlock", false);
        setBooleanField(term1320, term1320.getClass(), "canContainInline", false);
        setBooleanField(term1320, term1320.getClass(), "empty", true);
        setBooleanField(term1320, term1320.getClass(), "selfClosing", true);
        setBooleanField(term1320, term1320.getClass(), "preserveWhitespace", false);
        setField(term1319, term1319.getClass(), "tag", term1320);
        setField(term1319, term1319.getClass(), "classNames", term1340);
        setField(term1319, term1319.getClass(), "parentNode", null);
        setField(term1319, term1319.getClass(), "childNodes", term1359);
        setField(term1363, term1363.getClass(), "attributes", term1364);
        setField(term1319, term1319.getClass(), "attributes", term1363);
        setField(term1319, term1319.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term1319, term1319.getClass(), "siblingIndex", 597278769);
        HashMap term20531 = new HashMap();
        Set<Object> term20569 =  ((Map) term20531).keySet();
        HashSet term20530 = new HashSet((Collection<? extends Object>) term20569);
        ArrayList term20532 = new ArrayList();
        ((ArrayList) term20532).add((Object)null);
        ((ArrayList) term20532).add((Object)null);
        LinkedHashMap term20535 = new LinkedHashMap();
        term20526 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20527 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20534 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20527, term20527.getClass(), "tagName", "yVMkkQhvmN");
        setBooleanField(term20527, term20527.getClass(), "isBlock", true);
        setBooleanField(term20527, term20527.getClass(), "formatAsBlock", false);
        setBooleanField(term20527, term20527.getClass(), "canContainBlock", false);
        setBooleanField(term20527, term20527.getClass(), "canContainInline", false);
        setBooleanField(term20527, term20527.getClass(), "empty", true);
        setBooleanField(term20527, term20527.getClass(), "selfClosing", true);
        setBooleanField(term20527, term20527.getClass(), "preserveWhitespace", false);
        setField(term20526, term20526.getClass(), "tag", term20527);
        setField(term20526, term20526.getClass(), "classNames", term20530);
        setField(term20526, term20526.getClass(), "parentNode", null);
        setField(term20526, term20526.getClass(), "childNodes", term20532);
        setField(term20534, term20534.getClass(), "attributes", term20535);
        setField(term20526, term20526.getClass(), "attributes", term20534);
        setField(term20526, term20526.getClass(), "baseUri", "MwwjNtdOFT");
        setIntField(term20526, term20526.getClass(), "siblingIndex", 597278769);
        ArrayList term20471 = new ArrayList();
        term20470 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term20470, term20470.getClass(), "list", term20471);
        setField(term20470, term20470.getClass(), "c", term20471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1319, args);
        assertTrue(recursiveEquals(term1319, term20526));
        assertTrue(recursiveEquals(retValue, term20470));
    }

};


