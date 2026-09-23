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

public class Element_previousElementSibling_1256357764128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3097;
     Object term20147;

    public Element_previousElementSibling_1256357764128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3119 = new HashMap();
        Set<Object> term20169 =  ((Map) term3119).keySet();
        HashSet term3118 = new HashSet((Collection<? extends Object>) term20169);
        ArrayList term3124 = new ArrayList();
        ((ArrayList) term3124).add((Object)null);
        ((ArrayList) term3124).add((Object)null);
        ((ArrayList) term3124).add((Object)null);
        ((ArrayList) term3124).add((Object)null);
        ((ArrayList) term3124).add((Object)null);
        ((ArrayList) term3124).add((Object)null);
        LinkedHashMap term3129 = new LinkedHashMap();
        term3097 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3098 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3128 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3098, term3098.getClass(), "tagName", "xClUIcPECX");
        setBooleanField(term3098, term3098.getClass(), "isBlock", false);
        setBooleanField(term3098, term3098.getClass(), "formatAsBlock", false);
        setBooleanField(term3098, term3098.getClass(), "canContainBlock", false);
        setBooleanField(term3098, term3098.getClass(), "canContainInline", false);
        setBooleanField(term3098, term3098.getClass(), "empty", false);
        setBooleanField(term3098, term3098.getClass(), "selfClosing", false);
        setBooleanField(term3098, term3098.getClass(), "preserveWhitespace", false);
        setField(term3097, term3097.getClass(), "tag", term3098);
        setField(term3097, term3097.getClass(), "classNames", term3118);
        setField(term3097, term3097.getClass(), "parentNode", null);
        setField(term3097, term3097.getClass(), "childNodes", term3124);
        setField(term3128, term3128.getClass(), "attributes", term3129);
        setField(term3097, term3097.getClass(), "attributes", term3128);
        setField(term3097, term3097.getClass(), "baseUri", "IHqvyhMtuM");
        setIntField(term3097, term3097.getClass(), "siblingIndex", -1087774327);
        HashMap term20152 = new HashMap();
        Set<Object> term20190 =  ((Map) term20152).keySet();
        HashSet term20151 = new HashSet((Collection<? extends Object>) term20190);
        ArrayList term20153 = new ArrayList();
        ((ArrayList) term20153).add((Object)null);
        ((ArrayList) term20153).add((Object)null);
        ((ArrayList) term20153).add((Object)null);
        ((ArrayList) term20153).add((Object)null);
        ((ArrayList) term20153).add((Object)null);
        ((ArrayList) term20153).add((Object)null);
        LinkedHashMap term20156 = new LinkedHashMap();
        term20147 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20148 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20155 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20148, term20148.getClass(), "tagName", "xClUIcPECX");
        setBooleanField(term20148, term20148.getClass(), "isBlock", false);
        setBooleanField(term20148, term20148.getClass(), "formatAsBlock", false);
        setBooleanField(term20148, term20148.getClass(), "canContainBlock", false);
        setBooleanField(term20148, term20148.getClass(), "canContainInline", false);
        setBooleanField(term20148, term20148.getClass(), "empty", false);
        setBooleanField(term20148, term20148.getClass(), "selfClosing", false);
        setBooleanField(term20148, term20148.getClass(), "preserveWhitespace", false);
        setField(term20147, term20147.getClass(), "tag", term20148);
        setField(term20147, term20147.getClass(), "classNames", term20151);
        setField(term20147, term20147.getClass(), "parentNode", null);
        setField(term20147, term20147.getClass(), "childNodes", term20153);
        setField(term20155, term20155.getClass(), "attributes", term20156);
        setField(term20147, term20147.getClass(), "attributes", term20155);
        setField(term20147, term20147.getClass(), "baseUri", "IHqvyhMtuM");
        setIntField(term20147, term20147.getClass(), "siblingIndex", -1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "previousElementSibling", argTypes, term3097, args);
        assertTrue(recursiveEquals(term3097, term20147));
        assertTrue(recursiveEquals(retValue, null));
    }

};


