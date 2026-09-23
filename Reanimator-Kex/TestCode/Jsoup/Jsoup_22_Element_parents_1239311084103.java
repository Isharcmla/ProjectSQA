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

public class Element_parents_1239311084103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953;
     Object term19497;
     Object term19440;

    public Element_parents_1239311084103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term975 = new HashMap();
        Set<Object> term19519 =  ((Map) term975).keySet();
        HashSet term974 = new HashSet((Collection<? extends Object>) term19519);
        ArrayList term995 = new ArrayList();
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        ((ArrayList) term995).add((Object)null);
        LinkedHashMap term1000 = new LinkedHashMap();
        term953 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term954 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term999 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term954, term954.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term954, term954.getClass(), "isBlock", false);
        setBooleanField(term954, term954.getClass(), "formatAsBlock", false);
        setBooleanField(term954, term954.getClass(), "canContainBlock", true);
        setBooleanField(term954, term954.getClass(), "canContainInline", false);
        setBooleanField(term954, term954.getClass(), "empty", false);
        setBooleanField(term954, term954.getClass(), "selfClosing", true);
        setBooleanField(term954, term954.getClass(), "preserveWhitespace", false);
        setField(term953, term953.getClass(), "tag", term954);
        setField(term953, term953.getClass(), "classNames", term974);
        setField(term953, term953.getClass(), "parentNode", null);
        setField(term953, term953.getClass(), "childNodes", term995);
        setField(term999, term999.getClass(), "attributes", term1000);
        setField(term953, term953.getClass(), "attributes", term999);
        setField(term953, term953.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term953, term953.getClass(), "siblingIndex", -1339778481);
        HashMap term19502 = new HashMap();
        Set<Object> term19540 =  ((Map) term19502).keySet();
        HashSet term19501 = new HashSet((Collection<? extends Object>) term19540);
        ArrayList term19503 = new ArrayList();
        ((ArrayList) term19503).add((Object)null);
        ((ArrayList) term19503).add((Object)null);
        ((ArrayList) term19503).add((Object)null);
        ((ArrayList) term19503).add((Object)null);
        ((ArrayList) term19503).add((Object)null);
        ((ArrayList) term19503).add((Object)null);
        LinkedHashMap term19506 = new LinkedHashMap();
        term19497 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19498 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19505 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19498, term19498.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term19498, term19498.getClass(), "isBlock", false);
        setBooleanField(term19498, term19498.getClass(), "formatAsBlock", false);
        setBooleanField(term19498, term19498.getClass(), "canContainBlock", true);
        setBooleanField(term19498, term19498.getClass(), "canContainInline", false);
        setBooleanField(term19498, term19498.getClass(), "empty", false);
        setBooleanField(term19498, term19498.getClass(), "selfClosing", true);
        setBooleanField(term19498, term19498.getClass(), "preserveWhitespace", false);
        setField(term19497, term19497.getClass(), "tag", term19498);
        setField(term19497, term19497.getClass(), "classNames", term19501);
        setField(term19497, term19497.getClass(), "parentNode", null);
        setField(term19497, term19497.getClass(), "childNodes", term19503);
        setField(term19505, term19505.getClass(), "attributes", term19506);
        setField(term19497, term19497.getClass(), "attributes", term19505);
        setField(term19497, term19497.getClass(), "baseUri", "BKLfkLiZTH");
        setIntField(term19497, term19497.getClass(), "siblingIndex", -1339778481);
        ArrayList term19441 = new ArrayList();
        term19440 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term19440, term19440.getClass(), "contents", term19441);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "parents", argTypes, term953, args);
        assertTrue(recursiveEquals(term953, term19497));
        assertTrue(recursiveEquals(retValue, term19440));
    }

};


