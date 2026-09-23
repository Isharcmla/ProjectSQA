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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_quirksMode_145020804937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5308;
     Object enum48;
     Object term18593;
     Object enum50;
     Object term18095;

    public Document_quirksMode_145020804937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18613 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term18612 = ((Class) term18613).getDeclaredField((String) "quirks");
        ((Field) term18612).setAccessible(true);
        Object enum47 = ((Field) term18612).get((Object) null);
        HashMap term5343 = new HashMap();
        Set<Object> term18822 =  ((Map) term5343).keySet();
        HashSet term5342 = new HashSet((Collection<? extends Object>) term18822);
        ArrayList term5357 = new ArrayList();
        ((ArrayList) term5357).add((Object)null);
        LinkedHashMap term5362 = new LinkedHashMap();
        term5308 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term5309 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term5322 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5361 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5309, term5309.getClass(), "escapeMode", null);
        setField(term5309, term5309.getClass(), "charset", null);
        setField(term5309, term5309.getClass(), "charsetEncoder", null);
        setBooleanField(term5309, term5309.getClass(), "prettyPrint", false);
        setIntField(term5309, term5309.getClass(), "indentAmount", -1087774327);
        setField(term5308, term5308.getClass(), "outputSettings", term5309);
        setField(term5308, term5308.getClass(), "quirksMode", enum47);
        setField(term5322, term5322.getClass(), "tagName", "lihXWlGDxk");
        setBooleanField(term5322, term5322.getClass(), "isBlock", false);
        setBooleanField(term5322, term5322.getClass(), "formatAsBlock", true);
        setBooleanField(term5322, term5322.getClass(), "canContainBlock", false);
        setBooleanField(term5322, term5322.getClass(), "canContainInline", false);
        setBooleanField(term5322, term5322.getClass(), "empty", false);
        setBooleanField(term5322, term5322.getClass(), "selfClosing", true);
        setBooleanField(term5322, term5322.getClass(), "preserveWhitespace", true);
        setField(term5308, term5308.getClass(), "tag", term5322);
        setField(term5308, term5308.getClass(), "classNames", term5342);
        setField(term5308, term5308.getClass(), "parentNode", null);
        setField(term5308, term5308.getClass(), "childNodes", term5357);
        setField(term5361, term5361.getClass(), "attributes", term5362);
        setField(term5308, term5308.getClass(), "attributes", term5361);
        setField(term5308, term5308.getClass(), "baseUri", "YpJbIgJWWv");
        setIntField(term5308, term5308.getClass(), "siblingIndex", -1530420153);
        Class<? extends Object> term18834 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term18833 = ((Class) term18834).getDeclaredField((String) "noQuirks");
        ((Field) term18833).setAccessible(true);
        enum48 = ((Field) term18833).get((Object) null);
        Class<? extends Object> term19040 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term19039 = ((Class) term19040).getDeclaredField((String) "noQuirks");
        ((Field) term19039).setAccessible(true);
        Object enum49 = ((Field) term19039).get((Object) null);
        HashMap term18602 = new HashMap();
        Set<Object> term19255 =  ((Map) term18602).keySet();
        HashSet term18601 = new HashSet((Collection<? extends Object>) term19255);
        ArrayList term18603 = new ArrayList();
        ((ArrayList) term18603).add((Object)null);
        LinkedHashMap term18606 = new LinkedHashMap();
        term18593 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term18594 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term18598 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18605 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18594, term18594.getClass(), "escapeMode", null);
        setField(term18594, term18594.getClass(), "charset", null);
        setField(term18594, term18594.getClass(), "charsetEncoder", null);
        setBooleanField(term18594, term18594.getClass(), "prettyPrint", false);
        setIntField(term18594, term18594.getClass(), "indentAmount", -1087774327);
        setField(term18593, term18593.getClass(), "outputSettings", term18594);
        setField(term18593, term18593.getClass(), "quirksMode", enum49);
        setField(term18598, term18598.getClass(), "tagName", "lihXWlGDxk");
        setBooleanField(term18598, term18598.getClass(), "isBlock", false);
        setBooleanField(term18598, term18598.getClass(), "formatAsBlock", true);
        setBooleanField(term18598, term18598.getClass(), "canContainBlock", false);
        setBooleanField(term18598, term18598.getClass(), "canContainInline", false);
        setBooleanField(term18598, term18598.getClass(), "empty", false);
        setBooleanField(term18598, term18598.getClass(), "selfClosing", true);
        setBooleanField(term18598, term18598.getClass(), "preserveWhitespace", true);
        setField(term18593, term18593.getClass(), "tag", term18598);
        setField(term18593, term18593.getClass(), "classNames", term18601);
        setField(term18593, term18593.getClass(), "parentNode", null);
        setField(term18593, term18593.getClass(), "childNodes", term18603);
        setField(term18605, term18605.getClass(), "attributes", term18606);
        setField(term18593, term18593.getClass(), "attributes", term18605);
        setField(term18593, term18593.getClass(), "baseUri", "YpJbIgJWWv");
        setIntField(term18593, term18593.getClass(), "siblingIndex", -1530420153);
        Class<? extends Object> term19267 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term19266 = ((Class) term19267).getDeclaredField((String) "noQuirks");
        ((Field) term19266).setAccessible(true);
        enum50 = ((Field) term19266).get((Object) null);
        Class<? extends Object> term19473 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term19472 = ((Class) term19473).getDeclaredField((String) "noQuirks");
        ((Field) term19472).setAccessible(true);
        Object enum51 = ((Field) term19472).get((Object) null);
        HashMap term18133 = new HashMap();
        Set<Object> term19688 =  ((Map) term18133).keySet();
        HashSet term18132 = new HashSet((Collection<? extends Object>) term19688);
        ArrayList term18138 = new ArrayList();
        ((ArrayList) term18138).add((Object)null);
        LinkedHashMap term18143 = new LinkedHashMap();
        term18095 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term18096 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term18112 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term18142 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term18096, term18096.getClass(), "escapeMode", null);
        setField(term18096, term18096.getClass(), "charset", null);
        setField(term18096, term18096.getClass(), "charsetEncoder", null);
        setBooleanField(term18096, term18096.getClass(), "prettyPrint", false);
        setIntField(term18096, term18096.getClass(), "indentAmount", -1087774327);
        setField(term18095, term18095.getClass(), "outputSettings", term18096);
        setField(term18095, term18095.getClass(), "quirksMode", enum51);
        setField(term18112, term18112.getClass(), "tagName", "lihXWlGDxk");
        setBooleanField(term18112, term18112.getClass(), "isBlock", false);
        setBooleanField(term18112, term18112.getClass(), "formatAsBlock", true);
        setBooleanField(term18112, term18112.getClass(), "canContainBlock", false);
        setBooleanField(term18112, term18112.getClass(), "canContainInline", false);
        setBooleanField(term18112, term18112.getClass(), "empty", false);
        setBooleanField(term18112, term18112.getClass(), "selfClosing", true);
        setBooleanField(term18112, term18112.getClass(), "preserveWhitespace", true);
        setField(term18095, term18095.getClass(), "tag", term18112);
        setField(term18095, term18095.getClass(), "classNames", term18132);
        setField(term18095, term18095.getClass(), "parentNode", null);
        setField(term18095, term18095.getClass(), "childNodes", term18138);
        setField(term18142, term18142.getClass(), "attributes", term18143);
        setField(term18095, term18095.getClass(), "attributes", term18142);
        setField(term18095, term18095.getClass(), "baseUri", "YpJbIgJWWv");
        setIntField(term18095, term18095.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$QuirksMode");
        Object[] args = new Object[1];
        args[0] = enum48;
        Object retValue = callMethod(klass, "quirksMode", argTypes, term5308, args);
        assertTrue(recursiveEquals(term5308, term18593));
        assertTrue(recursiveEquals(enum48, enum50));
        assertTrue(recursiveEquals(retValue, term18095));
    }

};


