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

public class Element_getElementsByAttributeValueEnding_604542315141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4439;
     Object term25971;
     Object term25966;

    public Element_getElementsByAttributeValueEnding_604542315141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4461 = new HashMap();
        Set<Object> term25997 =  ((Map) term4461).keySet();
        HashSet term4460 = new HashSet((Collection<? extends Object>) term25997);
        ArrayList term4473 = new ArrayList();
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        ((ArrayList) term4473).add((Object)null);
        LinkedHashMap term4478 = new LinkedHashMap();
        term4439 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4440 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4477 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4440, term4440.getClass(), "tagName", "fVdTcjgHdw");
        setBooleanField(term4440, term4440.getClass(), "isBlock", true);
        setBooleanField(term4440, term4440.getClass(), "formatAsBlock", true);
        setBooleanField(term4440, term4440.getClass(), "canContainBlock", false);
        setBooleanField(term4440, term4440.getClass(), "canContainInline", true);
        setBooleanField(term4440, term4440.getClass(), "empty", false);
        setBooleanField(term4440, term4440.getClass(), "selfClosing", false);
        setBooleanField(term4440, term4440.getClass(), "preserveWhitespace", false);
        setField(term4439, term4439.getClass(), "tag", term4440);
        setField(term4439, term4439.getClass(), "classNames", term4460);
        setField(term4439, term4439.getClass(), "parentNode", null);
        setField(term4439, term4439.getClass(), "childNodes", term4473);
        setField(term4477, term4477.getClass(), "attributes", term4478);
        setField(term4439, term4439.getClass(), "attributes", term4477);
        setField(term4439, term4439.getClass(), "baseUri", "bwlLFAfNWx");
        setIntField(term4439, term4439.getClass(), "siblingIndex", 579005622);
        HashMap term25976 = new HashMap();
        Set<Object> term26038 =  ((Map) term25976).keySet();
        HashSet term25975 = new HashSet((Collection<? extends Object>) term26038);
        ArrayList term25977 = new ArrayList();
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        ((ArrayList) term25977).add((Object)null);
        LinkedHashMap term25980 = new LinkedHashMap();
        term25971 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25972 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25979 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25972, term25972.getClass(), "tagName", "fVdTcjgHdw");
        setBooleanField(term25972, term25972.getClass(), "isBlock", true);
        setBooleanField(term25972, term25972.getClass(), "formatAsBlock", true);
        setBooleanField(term25972, term25972.getClass(), "canContainBlock", false);
        setBooleanField(term25972, term25972.getClass(), "canContainInline", true);
        setBooleanField(term25972, term25972.getClass(), "empty", false);
        setBooleanField(term25972, term25972.getClass(), "selfClosing", false);
        setBooleanField(term25972, term25972.getClass(), "preserveWhitespace", false);
        setField(term25971, term25971.getClass(), "tag", term25972);
        setField(term25971, term25971.getClass(), "classNames", term25975);
        setField(term25971, term25971.getClass(), "parentNode", null);
        setField(term25971, term25971.getClass(), "childNodes", term25977);
        setField(term25979, term25979.getClass(), "attributes", term25980);
        setField(term25971, term25971.getClass(), "attributes", term25979);
        setField(term25971, term25971.getClass(), "baseUri", "bwlLFAfNWx");
        setIntField(term25971, term25971.getClass(), "siblingIndex", 579005622);
        ArrayList term25967 = new ArrayList();
        term25966 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term25966, term25966.getClass(), "contents", term25967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "JWodNQzjjV";
        args[1] = "CAgxWjhxNf";
        Object retValue = callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term4439, args);
        assertTrue(recursiveEquals(term4439, term25971));
        assertTrue(recursiveEquals(retValue, term25966));
    }

};


