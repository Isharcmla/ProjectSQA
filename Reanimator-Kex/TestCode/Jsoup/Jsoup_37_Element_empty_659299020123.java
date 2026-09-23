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

public class Element_empty_659299020123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2769;
     Object term19112;
     Object term19059;

    public Element_empty_659299020123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2793 = new HashMap();
        Set<Object> term19134 =  ((Map) term2793).keySet();
        HashSet term2792 = new HashSet((Collection<? extends Object>) term19134);
        ArrayList term2813 = new ArrayList();
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        ((ArrayList) term2813).add((Object)null);
        LinkedHashMap term2818 = new LinkedHashMap();
        term2769 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2770 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2817 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2770, term2770.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term2770, term2770.getClass(), "isBlock", false);
        setBooleanField(term2770, term2770.getClass(), "formatAsBlock", true);
        setBooleanField(term2770, term2770.getClass(), "canContainBlock", true);
        setBooleanField(term2770, term2770.getClass(), "canContainInline", false);
        setBooleanField(term2770, term2770.getClass(), "empty", true);
        setBooleanField(term2770, term2770.getClass(), "selfClosing", true);
        setBooleanField(term2770, term2770.getClass(), "preserveWhitespace", true);
        setBooleanField(term2770, term2770.getClass(), "formList", true);
        setBooleanField(term2770, term2770.getClass(), "formSubmit", true);
        setField(term2769, term2769.getClass(), "tag", term2770);
        setField(term2769, term2769.getClass(), "classNames", term2792);
        setField(term2769, term2769.getClass(), "parentNode", null);
        setField(term2769, term2769.getClass(), "childNodes", term2813);
        setField(term2817, term2817.getClass(), "attributes", term2818);
        setField(term2769, term2769.getClass(), "attributes", term2817);
        setField(term2769, term2769.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term2769, term2769.getClass(), "siblingIndex", -1179120542);
        HashMap term19117 = new HashMap();
        Set<Object> term19155 =  ((Map) term19117).keySet();
        HashSet term19116 = new HashSet((Collection<? extends Object>) term19155);
        ArrayList term19118 = new ArrayList();
        LinkedHashMap term19121 = new LinkedHashMap();
        term19112 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19113 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19120 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19113, term19113.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term19113, term19113.getClass(), "isBlock", false);
        setBooleanField(term19113, term19113.getClass(), "formatAsBlock", true);
        setBooleanField(term19113, term19113.getClass(), "canContainBlock", true);
        setBooleanField(term19113, term19113.getClass(), "canContainInline", false);
        setBooleanField(term19113, term19113.getClass(), "empty", true);
        setBooleanField(term19113, term19113.getClass(), "selfClosing", true);
        setBooleanField(term19113, term19113.getClass(), "preserveWhitespace", true);
        setBooleanField(term19113, term19113.getClass(), "formList", true);
        setBooleanField(term19113, term19113.getClass(), "formSubmit", true);
        setField(term19112, term19112.getClass(), "tag", term19113);
        setField(term19112, term19112.getClass(), "classNames", term19116);
        setField(term19112, term19112.getClass(), "parentNode", null);
        setField(term19112, term19112.getClass(), "childNodes", term19118);
        setField(term19120, term19120.getClass(), "attributes", term19121);
        setField(term19112, term19112.getClass(), "attributes", term19120);
        setField(term19112, term19112.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term19112, term19112.getClass(), "siblingIndex", -1179120542);
        HashMap term19083 = new HashMap();
        Set<Object> term19176 =  ((Map) term19083).keySet();
        HashSet term19082 = new HashSet((Collection<? extends Object>) term19176);
        ArrayList term19088 = new ArrayList();
        LinkedHashMap term19093 = new LinkedHashMap();
        term19059 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19060 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19092 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19060, term19060.getClass(), "tagName", "TXZAIPQJHt");
        setBooleanField(term19060, term19060.getClass(), "isBlock", false);
        setBooleanField(term19060, term19060.getClass(), "formatAsBlock", true);
        setBooleanField(term19060, term19060.getClass(), "canContainBlock", true);
        setBooleanField(term19060, term19060.getClass(), "canContainInline", false);
        setBooleanField(term19060, term19060.getClass(), "empty", true);
        setBooleanField(term19060, term19060.getClass(), "selfClosing", true);
        setBooleanField(term19060, term19060.getClass(), "preserveWhitespace", true);
        setBooleanField(term19060, term19060.getClass(), "formList", true);
        setBooleanField(term19060, term19060.getClass(), "formSubmit", true);
        setField(term19059, term19059.getClass(), "tag", term19060);
        setField(term19059, term19059.getClass(), "classNames", term19082);
        setField(term19059, term19059.getClass(), "parentNode", null);
        setField(term19059, term19059.getClass(), "childNodes", term19088);
        setField(term19092, term19092.getClass(), "attributes", term19093);
        setField(term19059, term19059.getClass(), "attributes", term19092);
        setField(term19059, term19059.getClass(), "baseUri", "QSrDQfEsTR");
        setIntField(term19059, term19059.getClass(), "siblingIndex", -1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term2769, args);
        assertTrue(recursiveEquals(term2769, term19112));
        assertTrue(recursiveEquals(retValue, term19059));
    }

};


