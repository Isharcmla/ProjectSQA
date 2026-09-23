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
import java.util.LinkedList;

public class Element_indexInList_1961680608131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3495;
     Object term3562;
     Object term21066;
     Object term21078;

    public Element_indexInList_1961680608131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3519 = new HashMap();
        Set<Object> term21089 =  ((Map) term3519).keySet();
        HashSet term3518 = new HashSet((Collection<? extends Object>) term21089);
        ArrayList term3533 = new ArrayList();
        ((ArrayList) term3533).add((Object)null);
        LinkedHashMap term3538 = new LinkedHashMap();
        term3495 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3496 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3537 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3496, term3496.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term3496, term3496.getClass(), "isBlock", false);
        setBooleanField(term3496, term3496.getClass(), "formatAsBlock", true);
        setBooleanField(term3496, term3496.getClass(), "canContainBlock", true);
        setBooleanField(term3496, term3496.getClass(), "canContainInline", false);
        setBooleanField(term3496, term3496.getClass(), "empty", false);
        setBooleanField(term3496, term3496.getClass(), "selfClosing", false);
        setBooleanField(term3496, term3496.getClass(), "preserveWhitespace", false);
        setBooleanField(term3496, term3496.getClass(), "formList", true);
        setBooleanField(term3496, term3496.getClass(), "formSubmit", true);
        setField(term3495, term3495.getClass(), "tag", term3496);
        setField(term3495, term3495.getClass(), "classNames", term3518);
        setField(term3495, term3495.getClass(), "parentNode", null);
        setField(term3495, term3495.getClass(), "childNodes", term3533);
        setField(term3537, term3537.getClass(), "attributes", term3538);
        setField(term3495, term3495.getClass(), "attributes", term3537);
        setField(term3495, term3495.getClass(), "baseUri", "NFlvfJCVPO");
        setIntField(term3495, term3495.getClass(), "siblingIndex", 679763016);
        term3562 = new LinkedList();
        HashMap term21071 = new HashMap();
        Set<Object> term21110 =  ((Map) term21071).keySet();
        HashSet term21070 = new HashSet((Collection<? extends Object>) term21110);
        ArrayList term21072 = new ArrayList();
        ((ArrayList) term21072).add((Object)null);
        LinkedHashMap term21075 = new LinkedHashMap();
        term21066 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21067 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21074 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21067, term21067.getClass(), "tagName", "lBOokzEPfe");
        setBooleanField(term21067, term21067.getClass(), "isBlock", false);
        setBooleanField(term21067, term21067.getClass(), "formatAsBlock", true);
        setBooleanField(term21067, term21067.getClass(), "canContainBlock", true);
        setBooleanField(term21067, term21067.getClass(), "canContainInline", false);
        setBooleanField(term21067, term21067.getClass(), "empty", false);
        setBooleanField(term21067, term21067.getClass(), "selfClosing", false);
        setBooleanField(term21067, term21067.getClass(), "preserveWhitespace", false);
        setBooleanField(term21067, term21067.getClass(), "formList", true);
        setBooleanField(term21067, term21067.getClass(), "formSubmit", true);
        setField(term21066, term21066.getClass(), "tag", term21067);
        setField(term21066, term21066.getClass(), "classNames", term21070);
        setField(term21066, term21066.getClass(), "parentNode", null);
        setField(term21066, term21066.getClass(), "childNodes", term21072);
        setField(term21074, term21074.getClass(), "attributes", term21075);
        setField(term21066, term21066.getClass(), "attributes", term21074);
        setField(term21066, term21066.getClass(), "baseUri", "NFlvfJCVPO");
        setIntField(term21066, term21066.getClass(), "siblingIndex", 679763016);
        term21078 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3495;
        args[1] = term3562;
        Object retValue = callMethod(klass, "indexInList", argTypes, null, args);
        assertTrue(recursiveEquals(term3495, term21066));
        assertTrue(recursiveEquals(term3562, term21078));
        assertTrue(recursiveEquals(retValue, null));
    }

};


