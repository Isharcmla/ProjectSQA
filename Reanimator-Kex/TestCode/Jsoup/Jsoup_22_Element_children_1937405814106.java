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

public class Element_children_1937405814106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1143;
     Object term20294;
     Object term20234;

    public Element_children_1937405814106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1165 = new HashMap();
        Set<Object> term20316 =  ((Map) term1165).keySet();
        HashSet term1164 = new HashSet((Collection<? extends Object>) term20316);
        ArrayList term1181 = new ArrayList();
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        ((ArrayList) term1181).add((Object)null);
        LinkedHashMap term1186 = new LinkedHashMap();
        term1143 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1144 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1185 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1144, term1144.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term1144, term1144.getClass(), "isBlock", true);
        setBooleanField(term1144, term1144.getClass(), "formatAsBlock", false);
        setBooleanField(term1144, term1144.getClass(), "canContainBlock", true);
        setBooleanField(term1144, term1144.getClass(), "canContainInline", true);
        setBooleanField(term1144, term1144.getClass(), "empty", false);
        setBooleanField(term1144, term1144.getClass(), "selfClosing", false);
        setBooleanField(term1144, term1144.getClass(), "preserveWhitespace", true);
        setField(term1143, term1143.getClass(), "tag", term1144);
        setField(term1143, term1143.getClass(), "classNames", term1164);
        setField(term1143, term1143.getClass(), "parentNode", null);
        setField(term1143, term1143.getClass(), "childNodes", term1181);
        setField(term1185, term1185.getClass(), "attributes", term1186);
        setField(term1143, term1143.getClass(), "attributes", term1185);
        setField(term1143, term1143.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term1143, term1143.getClass(), "siblingIndex", -883034806);
        HashMap term20299 = new HashMap();
        Set<Object> term20337 =  ((Map) term20299).keySet();
        HashSet term20298 = new HashSet((Collection<? extends Object>) term20337);
        ArrayList term20300 = new ArrayList();
        ((ArrayList) term20300).add((Object)null);
        ((ArrayList) term20300).add((Object)null);
        ((ArrayList) term20300).add((Object)null);
        ((ArrayList) term20300).add((Object)null);
        ((ArrayList) term20300).add((Object)null);
        ((ArrayList) term20300).add((Object)null);
        LinkedHashMap term20303 = new LinkedHashMap();
        term20294 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20295 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20302 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20295, term20295.getClass(), "tagName", "hCWPJQKpdc");
        setBooleanField(term20295, term20295.getClass(), "isBlock", true);
        setBooleanField(term20295, term20295.getClass(), "formatAsBlock", false);
        setBooleanField(term20295, term20295.getClass(), "canContainBlock", true);
        setBooleanField(term20295, term20295.getClass(), "canContainInline", true);
        setBooleanField(term20295, term20295.getClass(), "empty", false);
        setBooleanField(term20295, term20295.getClass(), "selfClosing", false);
        setBooleanField(term20295, term20295.getClass(), "preserveWhitespace", true);
        setField(term20294, term20294.getClass(), "tag", term20295);
        setField(term20294, term20294.getClass(), "classNames", term20298);
        setField(term20294, term20294.getClass(), "parentNode", null);
        setField(term20294, term20294.getClass(), "childNodes", term20300);
        setField(term20302, term20302.getClass(), "attributes", term20303);
        setField(term20294, term20294.getClass(), "attributes", term20302);
        setField(term20294, term20294.getClass(), "baseUri", "OJJtVNPyKZ");
        setIntField(term20294, term20294.getClass(), "siblingIndex", -883034806);
        ArrayList term20235 = new ArrayList();
        term20234 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term20234, term20234.getClass(), "contents", term20235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "children", argTypes, term1143, args);
        assertTrue(recursiveEquals(term1143, term20294));
        assertTrue(recursiveEquals(retValue, term20234));
    }

};


