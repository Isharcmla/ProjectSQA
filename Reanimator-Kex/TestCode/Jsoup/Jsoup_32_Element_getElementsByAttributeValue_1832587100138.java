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

public class Element_getElementsByAttributeValue_1832587100138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4033;
     Object term24196;
     Object term24191;

    public Element_getElementsByAttributeValue_1832587100138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4055 = new HashMap();
        Set<Object> term24222 =  ((Map) term4055).keySet();
        HashSet term4054 = new HashSet((Collection<? extends Object>) term24222);
        ArrayList term4077 = new ArrayList();
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        ((ArrayList) term4077).add((Object)null);
        LinkedHashMap term4082 = new LinkedHashMap();
        term4033 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4034 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4081 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4034, term4034.getClass(), "tagName", "tIpkeYIezR");
        setBooleanField(term4034, term4034.getClass(), "isBlock", false);
        setBooleanField(term4034, term4034.getClass(), "formatAsBlock", true);
        setBooleanField(term4034, term4034.getClass(), "canContainBlock", false);
        setBooleanField(term4034, term4034.getClass(), "canContainInline", false);
        setBooleanField(term4034, term4034.getClass(), "empty", true);
        setBooleanField(term4034, term4034.getClass(), "selfClosing", false);
        setBooleanField(term4034, term4034.getClass(), "preserveWhitespace", true);
        setField(term4033, term4033.getClass(), "tag", term4034);
        setField(term4033, term4033.getClass(), "classNames", term4054);
        setField(term4033, term4033.getClass(), "parentNode", null);
        setField(term4033, term4033.getClass(), "childNodes", term4077);
        setField(term4081, term4081.getClass(), "attributes", term4082);
        setField(term4033, term4033.getClass(), "attributes", term4081);
        setField(term4033, term4033.getClass(), "baseUri", "aSATgQUpoe");
        setIntField(term4033, term4033.getClass(), "siblingIndex", -817164822);
        HashMap term24201 = new HashMap();
        Set<Object> term24263 =  ((Map) term24201).keySet();
        HashSet term24200 = new HashSet((Collection<? extends Object>) term24263);
        ArrayList term24202 = new ArrayList();
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        ((ArrayList) term24202).add((Object)null);
        LinkedHashMap term24205 = new LinkedHashMap();
        term24196 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24197 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24204 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24197, term24197.getClass(), "tagName", "tIpkeYIezR");
        setBooleanField(term24197, term24197.getClass(), "isBlock", false);
        setBooleanField(term24197, term24197.getClass(), "formatAsBlock", true);
        setBooleanField(term24197, term24197.getClass(), "canContainBlock", false);
        setBooleanField(term24197, term24197.getClass(), "canContainInline", false);
        setBooleanField(term24197, term24197.getClass(), "empty", true);
        setBooleanField(term24197, term24197.getClass(), "selfClosing", false);
        setBooleanField(term24197, term24197.getClass(), "preserveWhitespace", true);
        setField(term24196, term24196.getClass(), "tag", term24197);
        setField(term24196, term24196.getClass(), "classNames", term24200);
        setField(term24196, term24196.getClass(), "parentNode", null);
        setField(term24196, term24196.getClass(), "childNodes", term24202);
        setField(term24204, term24204.getClass(), "attributes", term24205);
        setField(term24196, term24196.getClass(), "attributes", term24204);
        setField(term24196, term24196.getClass(), "baseUri", "aSATgQUpoe");
        setIntField(term24196, term24196.getClass(), "siblingIndex", -817164822);
        ArrayList term24192 = new ArrayList();
        term24191 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term24191, term24191.getClass(), "contents", term24192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "VkPSXewZfB";
        args[1] = "ubodzJoMGW";
        Object retValue = callMethod(klass, "getElementsByAttributeValue", argTypes, term4033, args);
        assertTrue(recursiveEquals(term4033, term24196));
        assertTrue(recursiveEquals(retValue, term24191));
    }

};


