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

public class Element_isBlock_161055638198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496;
     Object term10066;

    public Element_isBlock_161055638198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term520 = new HashMap();
        Set<Object> term10088 =  ((Map) term520).keySet();
        HashSet term519 = new HashSet((Collection<? extends Object>) term10088);
        ArrayList term534 = new ArrayList();
        ((ArrayList) term534).add((Object)null);
        LinkedHashMap term539 = new LinkedHashMap();
        term496 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term497 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term538 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term497, term497.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term497, term497.getClass(), "isBlock", true);
        setBooleanField(term497, term497.getClass(), "formatAsBlock", false);
        setBooleanField(term497, term497.getClass(), "canContainBlock", false);
        setBooleanField(term497, term497.getClass(), "canContainInline", true);
        setBooleanField(term497, term497.getClass(), "empty", false);
        setBooleanField(term497, term497.getClass(), "selfClosing", false);
        setBooleanField(term497, term497.getClass(), "preserveWhitespace", false);
        setBooleanField(term497, term497.getClass(), "formList", false);
        setBooleanField(term497, term497.getClass(), "formSubmit", true);
        setField(term496, term496.getClass(), "tag", term497);
        setField(term496, term496.getClass(), "classNames", term519);
        setField(term496, term496.getClass(), "parentNode", null);
        setField(term496, term496.getClass(), "childNodes", term534);
        setField(term538, term538.getClass(), "attributes", term539);
        setField(term496, term496.getClass(), "attributes", term538);
        setField(term496, term496.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term496, term496.getClass(), "siblingIndex", -1922583790);
        HashMap term10071 = new HashMap();
        Set<Object> term10109 =  ((Map) term10071).keySet();
        HashSet term10070 = new HashSet((Collection<? extends Object>) term10109);
        ArrayList term10072 = new ArrayList();
        ((ArrayList) term10072).add((Object)null);
        LinkedHashMap term10075 = new LinkedHashMap();
        term10066 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10067 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10074 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10067, term10067.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term10067, term10067.getClass(), "isBlock", true);
        setBooleanField(term10067, term10067.getClass(), "formatAsBlock", false);
        setBooleanField(term10067, term10067.getClass(), "canContainBlock", false);
        setBooleanField(term10067, term10067.getClass(), "canContainInline", true);
        setBooleanField(term10067, term10067.getClass(), "empty", false);
        setBooleanField(term10067, term10067.getClass(), "selfClosing", false);
        setBooleanField(term10067, term10067.getClass(), "preserveWhitespace", false);
        setBooleanField(term10067, term10067.getClass(), "formList", false);
        setBooleanField(term10067, term10067.getClass(), "formSubmit", true);
        setField(term10066, term10066.getClass(), "tag", term10067);
        setField(term10066, term10066.getClass(), "classNames", term10070);
        setField(term10066, term10066.getClass(), "parentNode", null);
        setField(term10066, term10066.getClass(), "childNodes", term10072);
        setField(term10074, term10074.getClass(), "attributes", term10075);
        setField(term10066, term10066.getClass(), "attributes", term10074);
        setField(term10066, term10066.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term10066, term10066.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term496, args);
        assertTrue(recursiveEquals(term496, term10066));
    }

};


