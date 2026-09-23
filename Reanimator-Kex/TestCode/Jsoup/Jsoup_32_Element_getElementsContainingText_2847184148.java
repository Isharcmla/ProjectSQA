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

public class Element_getElementsContainingText_2847184148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5320;
     Object term29908;
     Object term29903;

    public Element_getElementsContainingText_2847184148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5342 = new HashMap();
        Set<Object> term29932 =  ((Map) term5342).keySet();
        HashSet term5341 = new HashSet((Collection<? extends Object>) term29932);
        ArrayList term5354 = new ArrayList();
        ((ArrayList) term5354).add((Object)null);
        ((ArrayList) term5354).add((Object)null);
        ((ArrayList) term5354).add((Object)null);
        ((ArrayList) term5354).add((Object)null);
        LinkedHashMap term5359 = new LinkedHashMap();
        term5320 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5321 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5358 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5321, term5321.getClass(), "tagName", "lbmSGBwIiV");
        setBooleanField(term5321, term5321.getClass(), "isBlock", false);
        setBooleanField(term5321, term5321.getClass(), "formatAsBlock", false);
        setBooleanField(term5321, term5321.getClass(), "canContainBlock", true);
        setBooleanField(term5321, term5321.getClass(), "canContainInline", true);
        setBooleanField(term5321, term5321.getClass(), "empty", false);
        setBooleanField(term5321, term5321.getClass(), "selfClosing", false);
        setBooleanField(term5321, term5321.getClass(), "preserveWhitespace", false);
        setField(term5320, term5320.getClass(), "tag", term5321);
        setField(term5320, term5320.getClass(), "classNames", term5341);
        setField(term5320, term5320.getClass(), "parentNode", null);
        setField(term5320, term5320.getClass(), "childNodes", term5354);
        setField(term5358, term5358.getClass(), "attributes", term5359);
        setField(term5320, term5320.getClass(), "attributes", term5358);
        setField(term5320, term5320.getClass(), "baseUri", "ONcbPCQnHd");
        setIntField(term5320, term5320.getClass(), "siblingIndex", 972867650);
        HashMap term29913 = new HashMap();
        Set<Object> term29963 =  ((Map) term29913).keySet();
        HashSet term29912 = new HashSet((Collection<? extends Object>) term29963);
        ArrayList term29914 = new ArrayList();
        ((ArrayList) term29914).add((Object)null);
        ((ArrayList) term29914).add((Object)null);
        ((ArrayList) term29914).add((Object)null);
        ((ArrayList) term29914).add((Object)null);
        LinkedHashMap term29917 = new LinkedHashMap();
        term29908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term29909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term29916 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29909, term29909.getClass(), "tagName", "lbmSGBwIiV");
        setBooleanField(term29909, term29909.getClass(), "isBlock", false);
        setBooleanField(term29909, term29909.getClass(), "formatAsBlock", false);
        setBooleanField(term29909, term29909.getClass(), "canContainBlock", true);
        setBooleanField(term29909, term29909.getClass(), "canContainInline", true);
        setBooleanField(term29909, term29909.getClass(), "empty", false);
        setBooleanField(term29909, term29909.getClass(), "selfClosing", false);
        setBooleanField(term29909, term29909.getClass(), "preserveWhitespace", false);
        setField(term29908, term29908.getClass(), "tag", term29909);
        setField(term29908, term29908.getClass(), "classNames", term29912);
        setField(term29908, term29908.getClass(), "parentNode", null);
        setField(term29908, term29908.getClass(), "childNodes", term29914);
        setField(term29916, term29916.getClass(), "attributes", term29917);
        setField(term29908, term29908.getClass(), "attributes", term29916);
        setField(term29908, term29908.getClass(), "baseUri", "ONcbPCQnHd");
        setIntField(term29908, term29908.getClass(), "siblingIndex", 972867650);
        ArrayList term29904 = new ArrayList();
        term29903 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term29903, term29903.getClass(), "contents", term29904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AobDaplFLl";
        Object retValue = callMethod(klass, "getElementsContainingText", argTypes, term5320, args);
        assertTrue(recursiveEquals(term5320, term29908));
        assertTrue(recursiveEquals(retValue, term29903));
    }

};


