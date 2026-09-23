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

public class Element_wrap_135105120693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2441;
     Object term43728;

    public Element_wrap_135105120693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2463 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2463, term2463.getClass(), "tagName", null);
        setBooleanField(term2463, term2463.getClass(), "isBlock", true);
        setBooleanField(term2463, term2463.getClass(), "canContainBlock", true);
        setBooleanField(term2463, term2463.getClass(), "canContainInline", false);
        setBooleanField(term2463, term2463.getClass(), "optionalClosing", true);
        setBooleanField(term2463, term2463.getClass(), "empty", false);
        setBooleanField(term2463, term2463.getClass(), "preserveWhitespace", false);
        setField(term2463, term2463.getClass(), "ancestors", null);
        Object term2470 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2470, term2470.getClass(), "tagName", null);
        setBooleanField(term2470, term2470.getClass(), "isBlock", false);
        setBooleanField(term2470, term2470.getClass(), "canContainBlock", true);
        setBooleanField(term2470, term2470.getClass(), "canContainInline", true);
        setBooleanField(term2470, term2470.getClass(), "optionalClosing", false);
        setBooleanField(term2470, term2470.getClass(), "empty", true);
        setBooleanField(term2470, term2470.getClass(), "preserveWhitespace", false);
        setField(term2470, term2470.getClass(), "ancestors", null);
        Object term2477 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term2477, term2477.getClass(), "tagName", null);
        setBooleanField(term2477, term2477.getClass(), "isBlock", false);
        setBooleanField(term2477, term2477.getClass(), "canContainBlock", false);
        setBooleanField(term2477, term2477.getClass(), "canContainInline", false);
        setBooleanField(term2477, term2477.getClass(), "optionalClosing", true);
        setBooleanField(term2477, term2477.getClass(), "empty", false);
        setBooleanField(term2477, term2477.getClass(), "preserveWhitespace", false);
        setField(term2477, term2477.getClass(), "ancestors", null);
        ArrayList term2461 = new ArrayList();
        ((ArrayList) term2461).add(term2463);
        ((ArrayList) term2461).add(term2470);
        ((ArrayList) term2461).add(term2477);
        ((ArrayList) term2461).add(term2477);
        ((ArrayList) term2461).add(term2463);
        HashMap term2487 = new HashMap();
        Set<Object> term43749 =  ((Map) term2487).keySet();
        HashSet term2486 = new HashSet((Collection<? extends Object>) term43749);
        ArrayList term2501 = new ArrayList();
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        ((ArrayList) term2501).add((Object)null);
        LinkedHashMap term2506 = new LinkedHashMap();
        term2441 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2442 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2505 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2442, term2442.getClass(), "tagName", "jnwVnmKAFv");
        setBooleanField(term2442, term2442.getClass(), "isBlock", true);
        setBooleanField(term2442, term2442.getClass(), "canContainBlock", false);
        setBooleanField(term2442, term2442.getClass(), "canContainInline", true);
        setBooleanField(term2442, term2442.getClass(), "optionalClosing", false);
        setBooleanField(term2442, term2442.getClass(), "empty", false);
        setBooleanField(term2442, term2442.getClass(), "preserveWhitespace", false);
        setField(term2442, term2442.getClass(), "ancestors", term2461);
        setField(term2441, term2441.getClass(), "tag", term2442);
        setField(term2441, term2441.getClass(), "classNames", term2486);
        setField(term2441, term2441.getClass(), "parentNode", null);
        setField(term2441, term2441.getClass(), "childNodes", term2501);
        setField(term2505, term2505.getClass(), "attributes", term2506);
        setField(term2441, term2441.getClass(), "attributes", term2505);
        setField(term2441, term2441.getClass(), "baseUri", "avhRaGZaBF");
        ArrayList term43734 = new ArrayList();
        ((ArrayList) term43734).add((Object)null);
        ((ArrayList) term43734).add((Object)null);
        Object term43731 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term43732 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term43733 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term43735 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term43732, term43732.getClass(), "tagName", null);
        setBooleanField(term43732, term43732.getClass(), "isBlock", true);
        setBooleanField(term43732, term43732.getClass(), "canContainBlock", true);
        setBooleanField(term43732, term43732.getClass(), "canContainInline", true);
        setBooleanField(term43732, term43732.getClass(), "optionalClosing", false);
        setBooleanField(term43732, term43732.getClass(), "empty", false);
        setBooleanField(term43732, term43732.getClass(), "preserveWhitespace", false);
        setField(term43732, term43732.getClass(), "ancestors", null);
        setField(term43731, term43731.getClass(), "tag", term43732);
        setField(term43731, term43731.getClass(), "classNames", null);
        setField(term43733, term43733.getClass(), "tag", null);
        setField(term43733, term43733.getClass(), "classNames", null);
        setField(term43733, term43733.getClass(), "parentNode", null);
        setField(term43733, term43733.getClass(), "childNodes", null);
        setField(term43733, term43733.getClass(), "attributes", null);
        setField(term43733, term43733.getClass(), "baseUri", null);
        setField(term43731, term43731.getClass(), "parentNode", term43733);
        setField(term43731, term43731.getClass(), "childNodes", term43734);
        setField(term43735, term43735.getClass(), "attributes", null);
        setField(term43731, term43731.getClass(), "attributes", term43735);
        setField(term43731, term43731.getClass(), "baseUri", "");
        ArrayList term43729 = new ArrayList();
        ((ArrayList) term43729).add(term43731);
        term43728 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term43728, term43728.getClass(), "contents", term43729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JkgoRtImdE";
        Object retValue = callMethod(klass, "wrap", argTypes, term2441, args);
        assertTrue(recursiveEquals(term2441, term43728));
        assertTrue(recursiveEquals(retValue, null));
    }

};


